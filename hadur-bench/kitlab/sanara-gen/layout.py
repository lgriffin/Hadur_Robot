# layout.py PICKS SCALE OUT [FIELD]: the chance string for Gen.java SCALE mode. Each bot sits where 1 - indexOf / SCALE is its chance;
# chance 1 is left out (not found: always reverse), chance 0 from SCALE on. Checks every field bot gets its chance.
import sys,collections
picks=[l.rstrip('\n').split('\t') for l in open(sys.argv[1]) if l.strip()]
S=float(sys.argv[2]); out=sys.argv[3]
field=[l.split(' | ')[0] for l in open(sys.argv[4] if len(sys.argv)>4 else 'kitlab/nano-all-field.txt') if ' | ' in l]
g=collections.defaultdict(list)
for c,n in picks: g[float(c)].append(n)
s=''
for c in sorted((c for c in g if c<1), reverse=True):
    seg='|'.join(g[c])+'|'
    start=int(S) if c==0 else max(len(s), int((1-c)*S - len(seg)/2))
    assert start>=len(s), (c,start,len(s))
    s+='|'*(start-len(s))+seg
open(out,'w',encoding='utf-8').write(s)
want={n:float(c) for c,n in picks}
bad=0;err=[]
for n in field:
    i=s.find(n); got=1.0 if i<0 else max(0,1-i/S)
    w=want.get(n,1.0)
    err.append(abs(got-w))
    if abs(got-w)>0.05: bad+=1; print('BAD',n,w,got)
print('len',len(s),'utf8',len(s.encode()),'max err %.3f'%max(err),'bad',bad)
