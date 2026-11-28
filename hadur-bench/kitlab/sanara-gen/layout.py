# layout.py PICKS SCALE OUT [FIELD]: the chance string for Gen.java SCALE mode, laid out as SanaraGen does it.
# PICKS is "chance TAB name version" lines (sanara/src/main/gen/sanara-chance.txt). Each bot sits where 1 - indexOf / SCALE
# is its chance; chance 1 is left out (not found: always reverse), chance 0 from SCALE on. Every bot in FIELD
# (default kitlab/nano-all-field.txt), listed or not, must get its chance within 0.03, or nothing is written.
import sys,collections
picks=[l.rstrip('\n').split('\t') for l in open(sys.argv[1],encoding='utf-8') if l.strip() and not l.startswith('#')]
S=float(sys.argv[2]); out=sys.argv[3]
field=[l.split(' | ')[0] for l in open(sys.argv[4] if len(sys.argv)>4 else 'kitlab/nano-all-field.txt') if ' | ' in l]
g=collections.defaultdict(list)
for c,n in picks: g[float(c)].append(n.strip())
s=''
for c in sorted((c for c in g if c<1), reverse=True):
    seg='|'.join(g[c])+'|'
    start=int(S) if c==0 else int((1-c)*S - len(seg)/2)
    if start<len(s): sys.exit(f'chance groups overlap at {c}')
    s+='|'*(start-len(s))+seg
want={n.strip():float(c) for c,n in picks}
bad=[]
for n in list(want)+[n for n in field if n not in want]:
    i=s.find(n); got=1.0 if i<0 else max(0,1-i/S)
    if abs(got-want.get(n,1.0))>0.03: bad.append((n,want.get(n,1.0),round(got,3)))
if bad or len(s.encode())>65535:
    sys.exit(f'not written: {len(bad)} bots off their chance {bad[:5]}, {len(s.encode())} bytes')
open(out,'w',encoding='utf-8').write(s)
print('len',len(s),'bots checked',len(set(want)|set(field)))
