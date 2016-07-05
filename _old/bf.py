import sys
from collections import defaultdict
d = defaultdict(lambda: 'eh')
for line in sys.stdin:
    line = line.strip()
    if line == "": break
    sp = line.split()
    d[sp[1]] = sp[0]
for line in sys.stdin:
    print d[line.strip()]
