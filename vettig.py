from collections import defaultdict

n = 2
dd = defaultdict(lambda: 0)
tot=10000
for _ in xrange(tot):
    dd[str(n)[0]] += 1
    n <<= 1
print '\n'.join(['%s: %s%%' % (k, str(100.0*v/tot)) for k,v in sorted(dd.iteritems())])
