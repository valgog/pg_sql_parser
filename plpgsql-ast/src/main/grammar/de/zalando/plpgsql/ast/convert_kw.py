import re

def toRule(val):
	v = ''
	for c in val:
	   v =  v + '[' + c.lower() + c.upper() + ']'
	return v

p = re.compile( '.*PG_KEYWORD.*\\"([a-zA-Z\\_]+)\\"\\s*,\\s*([a-zA-Z\\_]+).*')

f = open('PlPgSqlLexer.g4', 'r')
for line in f:
    m =  p.match(line)
    if(m):
       print line.replace('\n','')
       print  m.group(2) + ' : ' + toRule(m.group(1)) + ';\n'

