#!/usr/bin/env python3
"""Start-up duress in the 3.11 census (M3 follow-up): what the battles where Hadur 3.10 hit RES-9
duress cost, with Tomcat 3.68 on the same opponent and seed as the control.

    python3 data/tools/census_duress.py

Reads the census rows (tail and top steps) from data/bench/. Every comparison is within one
opponent: its duress battles against its battles without, so opponent difficulty cancels.
Prints, per band, the battle conditions, the within-opponent difference in Hadur's score share
and in the damage Hadur took, Tomcat's difference on the same seeds (the control), and the APS
that the duress battles cost (difference times the share of battles with duress, summed over
opponents, over 1,215). Standard library only.
"""
import csv,statistics as st,math,collections as C
R=[]
for f in ['data/bench/2026-10-08_hadur-census-311-tail-local_cold.tsv','data/bench/2026-10-09_hadur-census-311-top-local_cold.tsv']:
    R+=list(csv.DictReader(open(f),delimiter='\t'))
R=[r for r in R if r['ok']=='true' and r['rounds']=='35']
def fl(x):
    try: v=float(x); return None if math.isnan(v) else v
    except: return None
band=lambda r:int(r['role'].split('band')[1])
H='hadur2.Hadur 3.10'; T='lxx.Tomcat 3.68'
by=C.defaultdict(dict)
for r in R: by[(r['opponent'],r['seed'])][r['build']]=r
pairs=[(v[H],v[T]) for v in by.values() if H in v and T in v]
print('pairs',len(pairs))
def m(xs): xs=[x for x in xs if x is not None]; return (round(st.mean(xs),1),len(xs)) if xs else None
print('band | ticks H T | skipped H T | dur>0 frac H | theirHit H | dist H | fullpow frac')
for b in range(1,7):
    P=[p for p in pairs if band(p[0])==b]
    print(b, m([fl(h['engineRoundTicks']) for h,t in P]), m([fl(t['engineRoundTicks']) for h,t in P]),
      m([fl(h['skippedTurns']) for h,t in P]), m([fl(t['skippedTurns']) for h,t in P]),
      round(sum(1 for h,t in P if (fl(h['duressTicks']) or 0)>0)/len(P),2),
      m([fl(h['theirHitRate']) for h,t in P]), m([fl(h['meanDistance']) for h,t in P]),
      m([ (fl(h['fullPowerShots']) or 0)/max(1,fl(h['shotsFired']) or 1) for h,t in P]))
# within-opponent: duress vs no duress, Hadur only
for b in [4,5,6]:
    d=[];sk=[]
    g=C.defaultdict(list)
    for h,t in pairs:
        if band(h)==b: g[h['opponent']].append(h)
    for o,hs in g.items():
        a=[x for x in hs if (fl(x['duressTicks']) or 0)>0]; n=[x for x in hs if (fl(x['duressTicks']) or 0)<=0]
        if a and n:
            d.append((st.mean(float(x['score_share']) for x in a)-st.mean(float(x['score_share']) for x in n))*100)
            sk.append(st.mean(fl(x['theirBulletDamage']) for x in a)-st.mean(fl(x['theirBulletDamage']) for x in n))
    if d: print('band',b,'duress minus none: share',round(st.mean(d),2),'+-',round(1.96*st.stdev(d)/math.sqrt(len(d)),2),'their dmg',round(st.mean(sk),1),'n',len(d))
# within-opponent correlation skipped turns vs share residual
for b in [5,6]:
    xs=[];ys=[]
    g=C.defaultdict(list)
    for h,t in pairs:
        if band(h)==b: g[h['opponent']].append(h)
    for o,hs in g.items():
        if len(hs)<2: continue
        ms=st.mean(fl(x['skippedTurns']) for x in hs); mv=st.mean(float(x['score_share']) for x in hs)
        for x in hs: xs.append(fl(x['skippedTurns'])-ms); ys.append((float(x['score_share'])-mv)*100)
    mx,my=st.mean(xs),st.mean(ys)
    cov=sum((a-mx)*(b_-my) for a,b_ in zip(xs,ys))/len(xs); 
    print('band',b,'within-opp slope share per skipped turn',round(cov/st.pvariance(xs),3),'r',round(cov/math.sqrt(st.pvariance(xs)*st.pvariance(ys)),3))
print('--- gap to Tomcat on pairs split by Hadur duress, and APS worth of removing duress')
tot=0
for b in range(1,7):
    P=[p for p in pairs if band(p[0])==b]
    g=C.defaultdict(lambda:{'d':[],'n':[]})
    for h,t in P:
        k='d' if (fl(h['duressTicks']) or 0)>0 else 'n'
        g[h['opponent']][k].append((float(h['score_share'])-float(t['score_share']))*100)
    dd=[st.mean(v['d']) for v in g.values() if v['d']]; nn=[st.mean(v['n']) for v in g.values() if v['n']]
    both=[(st.mean(v['d'])-st.mean(v['n']), len(v['d'])/(len(v['d'])+len(v['n']))) for v in g.values() if v['d'] and v['n']]
    worth=sum(-x*f for x,f in both)/len(both)*len(g)/1215 if both else 0
    tot+=worth
    se=1.96*st.stdev([x for x,_ in both])/math.sqrt(len(both)) if len(both)>2 else float('nan')
    print(b,'opps',len(g),'gap dur',round(st.mean(dd),2) if dd else None,'gap none',round(st.mean(nn),2) if nn else None,'within',round(st.mean([x for x,_ in both]),2) if both else None,'+-',round(se,2),'worth APS',round(worth,3))
print('total worth',round(tot,3))
# duress ticks distribution
dt=C.Counter(int(fl(h['duressTicks']) or 0) for h,t in pairs)
print(dt.most_common(8))
print('--- control: Tomcat on the same opponent+seed, split by whether Hadur had duress')
for b in [3,4,5,6]:
    g=C.defaultdict(lambda:{'d':[],'n':[]})
    for h,t in pairs:
        if band(h)!=b: continue
        k='d' if (fl(h['duressTicks']) or 0)>0 else 'n'
        g[h['opponent']][k].append((float(h['score_share'])*100,float(t['score_share'])*100,fl(h['theirBulletDamage']),fl(h['engineRoundTicks'])))
    hb=[];tb=[];dm=[];rt=[]
    for v in g.values():
        if v['d'] and v['n']:
            hb.append(st.mean(x[0] for x in v['d'])-st.mean(x[0] for x in v['n']))
            tb.append(st.mean(x[1] for x in v['d'])-st.mean(x[1] for x in v['n']))
    print(b,'Hadur',round(st.mean(hb),2),'Tomcat same seeds',round(st.mean(tb),2),'+-',round(1.96*st.stdev(tb)/math.sqrt(len(tb)),2),'n',len(hb))
# duress rate by seed and by otherJvms, hostCpu
print('duress rate by seed', {s:round(st.mean(1 if (fl(h['duressTicks']) or 0)>0 else 0 for h,t in pairs if h['seed']==s),2) for s in '1234'})
