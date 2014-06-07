from __future__ import print_function
import re
import sys
import cStringIO


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
		   output += output # print(c, end='')

    return output


def convert_rule_names(input_file_content):
	p = re.compile('([A-Z][A-Za-z0-9_]*):.*')
	map = dict()

	f = cStringIO.StringIO(input_file_content)
	for line in f:
		m =  p.match(line)
		if(m):
		   s = m.group(1)
		   map[m.group(1)] = s[:1].lower() + s[1:]

	# replace the matches
	content = input_file_content

	for k in map:
	  content = content.replace(k, map[k])

	return content



def main(input_file):
	print 'input file: ' + input_file
	
	f = open(input_file, 'r')
	input_file_content = f.read
	converted_content  = remove_rule_actions(input_file_content)
	converted_content  = convert_rule_names(converted_content)

	print converted_content

    return 0




if __name__ == '__main__':
    sys.exit(main(sys.argv[1]))






