from collections import defaultdict

line = input()
tot = float(len(line))
cw, cl, cu, cs = 0, 0, 0, 0
for c in line:
    if c == '_':
        cw += 1
    elif c.isupper():
        cu += 1
    elif c.islower():
        cl += 1
    else:
        cs += 1
print cw/tot
print cl/tot
print cu/tot
print cs/tot
