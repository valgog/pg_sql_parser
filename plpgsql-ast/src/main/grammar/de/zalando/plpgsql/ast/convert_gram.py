from __future__ import print_function

stack = 0

with open('Plpgsql.g4') as f:
  while True:
    c = f.read(1)
    if not c:
      break
      
    if (c == '{'):
       stack = stack + 1
    elif (c == '}'):
       stack = stack - 1
    elif (stack == 0):
       print(c, end='')

