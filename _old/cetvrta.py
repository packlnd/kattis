from collections import defaultdict as dd
from sys import stdin

ddx = dd(lambda: 0)
ddy = dd(lambda: 0)
for line in stdin:
    sp = line.strip().split()
    ddx[sp[0]] += 1
    ddy[sp[1]] += 1
xx,yy=0,0
for x,c in ddx.iteritems():
    if c == 1:
        xx = x
for y,c in ddy.iteritems():
    if c == 1:
        yy = y
print '%s %s' % (xx, yy)
