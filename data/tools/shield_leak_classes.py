#!/usr/bin/env python3
"""BENCH-292: shield leak classes over hadur.log files (SB and SH telemetry).

  python3 shield_leak_classes.py 'WORK/battles/*-c/hadur.log' [...]  (TOP=40 rows in the per-robot table)

Each hit taken in a shield round (an SB record) is put in one class: no-intercept:first / no-intercept:unshielded,
missed-angle (no predictor was exact), missed-exact (a predictor was exact: timing or execution), nowave (no wave
matched the shot), pre-engage (the shield was not yet on this round), stood-down:<reason> (after an SH off or exit),
battle-off:<reason> (after the shield turned off for the battle), off-other. Damage is the bullet's damage. Reads the
c and aa arms' logs.
"""
import sys,glob,os,re,collections
args=[a for a in sys.argv[1:] if not a.startswith('--')]
arms=('c','aa')
files=[]
for a in args: files+=glob.glob(a)
cls=collections.defaultdict(collections.Counter); dm=collections.defaultdict(collections.Counter); nb=collections.Counter()
since=collections.defaultdict(list)
def bd(p): return 4*p+max(0,2*(p-1))
for f in files:
    b=os.path.basename(f).replace('.hadur.log','')
    if b=='hadur.log': b=os.path.basename(os.path.dirname(f))
    m=re.match(r'(.+)-(\d+)-(\w+)$',b)
    if not m or m.group(3) not in arms: continue
    rob=m.group(1); on={}; down={}; sb=False; boff=None
    for line in open(f,errors='replace'):
        p=line.rstrip().split(',')
        if len(p)<4: continue
        if p[2]=='SH':
            r,t=int(p[3]),int(p[4]); ev=p[5]
            if ev=='on': on.setdefault(r,t); down.pop(r,None)
            else:
                down[r]=(t,ev+':'+(p[6] if len(p)>6 else ''))
                if ev=='off' and boff is None: boff=(r,t,p[6] if len(p)>6 else '')
        elif p[2]=='SB' and len(p)>=9:
            sb=True; r,t=int(p[3]),int(p[4]); k=p[5]; pw=float(p[8])
            if k=='off':
                if boff and (r>boff[0] or (r==boff[0] and t>=boff[1])) and r not in on: k='battle-off:'+boff[2]
                elif r not in on or t<on[r]: k='pre-engage'
                elif r in down and t>=down[r][0]: k='stood-down:'+down[r][1]; since[rob].append(t-down[r][0])
                else: k='off-other'
            elif k=='missed': k='missed-exact' if p[7]=='1' else 'missed-angle'
            elif k in ('first','unshielded'): k='no-intercept:'+k
            cls[rob][k]+=1; dm[rob][k]+=bd(pw)
    if sb: nb[rob]+=1
tot=collections.Counter(); tdm=collections.Counter()
for r in cls: tot.update(cls[r]); tdm.update(dm[r])
T=sum(tot.values()); D=sum(tdm.values())
print('ALL listed-robot hits',T,'damage %.0f'%D,'in',sum(nb.values()),'battles,',len(nb),'robots')
for k,v in tot.most_common(): print('  %-34s hits %5d %5.1f%%  damage %6.0f %5.1f%%'%(k,v,100*v/T,tdm[k],100*tdm[k]/D))
allsince=[x for r in since for x in since[r]]
if allsince:
    allsince.sort(); print('  ticks since stand-down at hit: median %d, p25 %d, p75 %d'%(allsince[len(allsince)//2],allsince[len(allsince)//4],allsince[3*len(allsince)//4]))
print()
rows=sorted(((sum(dm[r].values())/nb[r],r) for r in nb),reverse=True)
for d,r in rows[:int(os.environ.get('TOP','40'))]:
    c=cls[r]; print('%-36s n%d dmg/battle %6.1f hits/battle %5.1f | '%(r,nb[r],d,sum(c.values())/nb[r])+' '.join('%s %d'%(k,v) for k,v in sorted(c.items())))
