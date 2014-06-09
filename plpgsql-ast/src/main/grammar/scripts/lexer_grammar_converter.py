from __future__ import print_function
import re
import sys
import cStringIO


# def remove_rule_actions(input_file_content):
#  	buffer = cStringIO.StringIO(input_file_content)
#	while True:
#		c = buffer.read(1)
#		if not c:
#		  break
#
#	return output


def toRule(val):
    # ok for now but we could generate an alphabet later on.
    # see http://stackoverflow.com/questions/228730/how-do-i-iterate-through-the-alphabet-in-python
	v = ''
	for c in val:
	   v =  v + '[' + c.lower() + c.upper() + ']'
	return v


def convert_postgres_keywords(input_file_content):
	p = re.compile( '.*PG_KEYWORD.*\\"([a-zA-Z\\_]+)\\"\\s*,\\s*([a-zA-Z\\_]+).*')

	output = ''
	buffer = cStringIO.StringIO(input_file_content)
	for line in buffer:
		m = p.match(line)
		if(m):
			output = output + '//' + line
			output = output + m.group(2) + ' : ' + toRule(m.group(1)) + ';\n\n'
			
	return output


def main(input_file):
	f = open(input_file, 'r')
	input_file_content = f.read()
	converted_content  = convert_postgres_keywords(input_file_content)

	print(converted_content)

	return 0


if __name__ == '__main__':
    sys.exit(main(sys.argv[1]))






