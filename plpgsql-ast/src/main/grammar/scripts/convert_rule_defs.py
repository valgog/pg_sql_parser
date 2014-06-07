import re

p = re.compile('([A-Z][A-Za-z0-9_]*):.*')


map = dict()

f = open('Sql.g4', 'r')
for line in f:
    m =  p.match(line)
    if(m):
       s = m.group(1)
    #   print  m.group(1) + ' -> ' + (s[:1].lower() + s[1:])
       map[m.group(1)] = s[:1].lower() + s[1:]

# replace the matches

f = open('Sql.g4', 'r')
content = f.read()

for k in map:
  content = content.replace(k, map[k])

print content
