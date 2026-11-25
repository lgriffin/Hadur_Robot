"""Dash to a landing spot: union cover from up to three ink shots (ticks 2, 13, 24 after the enemy's shot) fired
along a rest-to-rest dash of length d, leaving late, leaving early, or arriving at a run."""
import os, sys; HERE=os.path.dirname(os.path.abspath(__file__)); sys.path.insert(0,HERE)
import numpy as np, shadowsim as ss, json, time
S=np.array([0.0,0.0])
POW=(0.1,0.15,0.2,0.3,0.5)
def dash_profile(d, T, mode):
    """Arc distance still to go at each tick 0..T for a body that ends at rest on its spot by tick T-1.
    mode 'late': waits, then dashes from rest so it stops just in time; 'early': dashes at once, then waits;
    'run': already at speed 8 at tick 0 and brakes at the end (starts d away)."""
    # build a rest-to-rest move of length d with accel 1, decel 2, vmax 8 (engine order: speed changes, then moves)
    def rest_to_rest(d):
        best=None
        for vmax in (1,2,3,4,5,6,7,8):
            acc=[v for v in range(1,vmax+1)]
            dec=[]; v=vmax
            while v>0:
                v=max(0,v-2); dec.append(v)
            base=sum(acc)+sum(dec)
            if base>d+1e-9: break
            cruise=(d-base)/vmax
            n=int(np.floor(cruise+1e-9)); rem=d-base-n*vmax
            steps=acc+[vmax]*n+([rem] if rem>1e-9 else [])+dec
            if best is None or len(steps)<len(best): best=steps
        if best is None: best=[d] if d>0 else []
        return best
    if mode=='run':
        dec=[6,4,2,0]; cruise=max(0.0,d-12)
        n=int(np.floor(cruise/8+1e-9)); rem=cruise-8*n
        steps=[8]*n+([rem] if rem>1e-9 else [])+dec
        if d<12: steps=rest_to_rest(d)
    else:
        steps=rest_to_rest(d)
    steps=[s for s in steps]
    if len(steps)>T-1: return None
    pad=[0.0]*(T-1-len(steps))
    seq=(pad+steps) if mode=='late' else (steps+pad)
    if mode=='run': seq=steps+pad
    togo=[d]
    for s in seq: togo.append(togo[-1]-s)
    return np.array(togo)   # togo[t] = distance still to go at tick t
def union_cover(D,ve,d,mode,slots=(2,13,24),aspect_deg=0.0,n=181):
    a0=np.radians(aspect_deg); R=D*np.array([np.cos(a0),np.sin(a0)])
    th,w=ss.body_samples(S,R,n=n); kh=ss.hit_turn(S,R,th,ve,0); T=int(kh.min())
    togo=dash_profile(d,T,mode)
    if togo is None: return None
    c0=np.zeros(n,bool); p0=np.zeros(n,bool); res=[]; picks=[]
    for tf in slots:
        if tf>=T-1: res.append(res[-1] if res else 0.0); continue
        psi=togo[tf]/D
        O=D*np.array([np.cos(a0-psi),np.sin(a0-psi)])
        base=np.arctan2(-O[1],-O[0]); best=(ss.score(c0[None,:],p0[None,:])[0],None,None,c0,p0)
        for p in POW:
            vb=ss.bullet_speed(p)
            ang=base+np.linspace(-1.3,1.3,1301)
            c,ps=ss.cover(S,0,ve,O,ang,vb,tf,th,kh); sc=ss.score(c|c0,ps|p0); i=int(sc.argmax())
            ang2=ang[i]+np.linspace(-0.004,0.004,161)
            c,ps=ss.cover(S,0,ve,O,ang2,vb,tf,th,kh); sc=ss.score(c|c0,ps|p0); j=int(sc.argmax())
            if sc[j]>best[0]+1e-9: best=(float(sc[j]),float(np.degrees(ang2[j]-base)),p,c[j]|c0,ps[j]|p0)
        c0,p0=best[3],best[4]; res.append(round(best[0],3)); picks.append((tf,round(float(np.degrees(psi)),1),best[1],best[2]))
    return res,picks,T
if __name__=='__main__':
    f=open(HERE+'/e2.log','w'); out={}
    for aspect in (0.0,45.0):
        for D,ve in ((450,14.0),(450,11.0),(450,17.0),(300,14.0),(600,14.0)):
            for mode in ('late','run','early'):
                for d in (0,20,40,60,80,100,120,160,200,240):
                    r=union_cover(D,ve,d,mode,aspect_deg=aspect)
                    if r is None: continue
                    out[f'{aspect:g}_{D}_{ve:g}_{mode}_{d}']=r[0]
                    print(aspect,D,ve,mode,d,'cover after 1,2,3 shots',r[0],'T',r[2],r[1],file=f,flush=True)
    json.dump(out,open(HERE+'/e2.json','w')); print('done',file=f,flush=True)
