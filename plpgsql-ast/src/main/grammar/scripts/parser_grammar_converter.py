from __future__ import print_function
import re
import sys
import cStringIO
from rule_rewrite_config import rule_replacement_map

def rewrite_rule_definitions_if_necessary(input_file_content):
	p       = re.compile('([A-Za-z0-9_]*):.*')
	map     = dict()
	output  = ''
	
	f = cStringIO.StringIO(input_file_content)
	for line in f:
		m =  p.match(line)
		if(m):
			rule_name = m.group(1)
			if rule_name in rule_replacement_map:
				# we found a rule which has to be rewritten
				# move to end of rule
				for skipped in f:
					if skipped.strip().endswith(';'):
						break;
				
				# put (configured) rewritten rule to output instead of original rule
				output = output + rule_replacement_map[rule_name]
			else:
				output = output + line
		else:
			output = output + line
	return output


def comment_remaining_bison_instructions(input_file_content):
	return input_file_content.replace('%prec', '// %prec')


def extract_raw_rule_data(input_file_content):
	p = re.compile('.*%%(.*)%%.*',re.MULTILINE | re.DOTALL)
	return p.match(input_file_content).group(1).strip()


def remove_rule_actions(input_file_content):
	buffer = cStringIO.StringIO(input_file_content)
	
	stack = 0
	output = ''
	while True:
		c = buffer.read(1)
		if not c:
		  break

		if (c == '{'):
		   stack = stack + 1
		elif (c == '}'):
		   stack = stack - 1
		elif (stack == 0):
		   output += c # TODO more efficient string concatenation

	return output


def resolve_replacement_collision_if_necessary(collisioned, replacements):
   if collisioned in replacements:
      # TODO find something smarter
     return resolve_replacement_collision_if_necessary(collisioned + '_', 
                                                        replacements)
   else:
     return collisioned


def convert_rule_names(input_file_content):
	p            = re.compile('([A-Za-z0-9_]*):.*')
	map          = dict()
	replacements = set() # needed to detect collisions
	
	f = cStringIO.StringIO(input_file_content)
	for line in f:
		m =  p.match(line)
		if(m):
		   ruleName = m.group(1)
		   
		   # ANTLR parser rules don't work if they don't with a lower letter
		   replacement = ruleName[:1].lower() + ruleName[1:]
		   replacement = resolve_replacement_collision_if_necessary(replacement, 
                                                                    replacements)
		   map[ruleName] = replacement
		   replacements.add(replacement)

	# sort keys by length in descending order to avoid problems with string replacement
	# see for example the rules Character and ConstCharacter
	# if Character is replaced first the content by character, ConstCharacter can not be
	# found anymore
	keys = map.keys()
	keys.sort(key=lambda item: (-len(map[item]), item))
	
	# replace the matches
	content = input_file_content
	for k in keys:
		# TODO there is a little bug which does not affect the correctness of the rule: 
		#      replacement does not consider entire words. could not find a working solution yet...
		# content = content.replace(k,  map[k])	  
		content  = re.sub(r'\b' + k + r'\b', map[k], content)

	return content



def main(input_file):
	f = open(input_file, 'r')
	input_file_content = f.read()
	converted_content  = extract_raw_rule_data(input_file_content)
	converted_content  = remove_rule_actions(converted_content)
	converted_content  = convert_rule_names(converted_content)
	converted_content  = rewrite_rule_definitions_if_necessary(converted_content)
	converted_content  = comment_remaining_bison_instructions(converted_content) 

	print("grammar Sql;")
	print("import SqlKeyWords;")
	print(converted_content)

	return 0


if __name__ == '__main__':
    sys.exit(main(sys.argv[1]))






