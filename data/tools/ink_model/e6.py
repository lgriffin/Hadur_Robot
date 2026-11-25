"""Aimed guns against the gait. e5 spreads the enemy's bullets evenly over the hit set; here the enemy aims.

The guns are the census's offline guns (data/tools/census_classify.py): head-on, linear, a guess-factor
histogram ('gf') and a segmented one ('seg': lateral speed, acceleration, distance, time since reversal). They learn
from a virtual power-2 shot every 4 ticks once its bullet has arrived, and aim every real shot from what they have
learnt by then. For each real wave the model records whether each gun's bullet was on the body ('on') and whether
it got through our shadows ('net'). `census_rates` replays the census's own definition on the same path (a shot
every 4 ticks, a 36 px target, learning at once), so the result compares with the off_* columns of
docs/bench/local/2026-10-18_census-classes.tsv.

Gaits (the choice made once per enemy shot, for the stretch of path that shot's wave will find us on):
  run     carry on, or turn back with probability p_rev: the design's two-way lottery
  three   carry on, turn back or hold, by the probabilities given
  wide    carry on, turn back, hold, or either way at half speed, evenly
  belief  the least exposed of carry on / turn back / hold, by where the enemy's revealed bullets have gone
"""
import os, sys; HERE=os.path.dirname(os.path.abspath(__file__)); sys.path.insert(0,HERE)
import math, json, time
import numpy as np, shadowsim as ss
from e4 import hit_set
from e5 import death_turn
HALF=18.0; NB=47; VSPEED=14.0; VESC=math.asin(8.0/VSPEED)
MODES={'continue':(1,8.0),'reverse':(-1,8.0),'hold':(1,0.0),'half':(1,4.0),'halfrev':(-1,4.0)}
def norm(a): return (a+math.pi)%(2*math.pi)-math.pi
def outward(x,tv,track): return (x>track[1]-40 and tv>0) or (x<track[0]+40 and tv<0)
def advance(x,v,tv,track):
    if v*tv<0 or abs(tv)<abs(v):
        v=math.copysign(max(0.0,abs(v)-2.0),v) if (abs(v)-2.0>=abs(tv) or v*tv<0) else tv
    else:
        v=math.copysign(min(abs(tv),abs(v)+1.0),tv) if tv!=0 else 0.0
    return min(max(x+v,track[0]),track[1]), v
def lateral(S,x,y,v):
    rx,ry=x-S[0],y-S[1]; d=math.hypot(rx,ry)
    return d, math.atan2(ry,rx), (-ry*v/d if d>0 else 0.0)
def cell_of(lat,prev_lat,d,since):
    accel=abs(lat)-abs(prev_lat)
    return (min(4,int(abs(lat)/2)), 0 if accel<-0.5 else 2 if accel>0.5 else 1, min(4,int(d/200)), min(3,since//15))
def peak(h): return max(range(NB), key=lambda q:h[q])
def speak(h): return max(range(NB), key=lambda q:h[max(0,q-1)]+2*h[q]+h[min(NB-1,q+1)])
def gun_aims(gf,seg,S,x,y,v,speed,d,b,lat,cell,track):
    esc=math.asin(min(1.0,8.0/speed)); ft=int(round(d/speed)); dirn=1 if lat>=0 else -1
    px=min(max(x+v*ft,track[0]),track[1])
    out={'headon':b,'linear':math.atan2(y-S[1],px-S[0])}
    if sum(gf): out['gf']=b+dirn*esc*(peak(gf)/23.0-1)
    h=seg.get(cell)
    if h is not None and sum(h)>=3: out['seg']=b+dirn*esc*(speak(h)/23.0-1)
    return out, dirn, esc
def census_rates(xs,vel,E,y,track,every=4):
    """The census's offline guns on this path, by the census's own rules: off_headon, off_linear, off_gf, off_seg."""
    n=len(xs); gf=[0]*NB; seg={}; tr={}; hi={}; last=0; since=0; prev_lat=0.0; rev=0; runs=[]; run=0
    for i in range(n):
        S=E[i]; d,b,lat=lateral(S,xs[i],y,vel[i])
        sign=1 if lat>0.5 else -1 if lat<-0.5 else 0; since+=1
        if sign and last and sign!=last: rev+=1; runs.append(run); run=0; since=0
        if sign: last=sign
        run+=1
        if i%every or d<40: continue
        j=None
        for k in range(i+1,n):
            if math.hypot(xs[k]-S[0],y-S[1])<=(k-i)*VSPEED: j=k; break
        if j is None: continue
        actual=math.atan2(y-S[1],xs[j]-S[0]); tol=math.atan2(HALF,max(d,1.0))
        c=cell_of(lat,prev_lat,d,since)
        aims,dirn,esc=gun_aims(gf,seg,S,xs[i],y,vel[i],VSPEED,d,b,lat,c,track)
        g=max(-1.0,min(1.0,norm(actual-b)/esc*dirn))
        for name,a in aims.items():
            tr[name]=tr.get(name,0)+1; hi[name]=hi.get(name,0)+(abs(norm(a-actual))<=tol)
        k=int(round((g+1)*23)); gf[k]+=1; seg.setdefault(c,[0]*NB)[k]+=1; prev_lat=lat
    out={'off_'+k:hi[k]/tr[k] for k in tr}
    out.update(speed=float(np.mean(np.abs(vel))),stopped=float(np.mean(np.abs(np.array(vel))<0.5)),rev_100=100.0*rev/n,
               dwell=float(np.mean(runs)) if runs else float('nan'))
    return out
def run(seed=1,ticks=2400,pe=2.0,fire='ink',policy='run',p_rev=0.3,probs=(0.5,0.25,0.25),enemy='seg',D0=450.0,
        track=(120.0,680.0),aim_sd=0.045):
    rng=np.random.default_rng(seed); ve=ss.bullet_speed(pe); y=60.0
    E=np.zeros((ticks+200,2)); ex,ey=400.0,60.0+D0; evx=evy=0.0
    for t in range(ticks+200):
        evx=np.clip(evx+rng.normal(0,1.0),-8,8); evy=np.clip(evy+rng.normal(0,1.0),-8,8)
        ex=float(np.clip(ex+evx,330,470)); ey=float(np.clip(ey+evy,60.0+D0-60,min(564.0,60.0+D0+60))); E[t]=(ex,ey)
    epos=lambda k:(E[min(k,len(E)-1),0],E[min(k,len(E)-1),1])
    xs=[400.0]; vel=[0.0]; v=0.0; direction=1.0; target=[]
    lats=[0.0]; sinces=[0]; lat4=[0.0]; last_sign=0; since=0; prev_lat=0.0
    gf=[0]*NB; seg={}; pend=[]; vt={}; vh={}
    belief=np.full(NB,0.05); cov={'continue':[0.5,1.0],'reverse':[0.3,1.0],'hold':[0.2,1.0]}
    def step_to(tt):
        nonlocal v,last_sign,since,direction
        while len(xs)<=tt:
            k=len(xs)-1; tv=target[k] if k<len(target) else 8.0*direction
            if outward(xs[-1],tv,track):       # the end of the track: the rest of the committed path is mirrored
                for q in range(k,len(target)): target[q]=-target[q]
                direction=-direction; tv=-tv
            x,v2=advance(xs[-1],v,tv,track); v=v2; xs.append(x); vel.append(v)
            S=epos(len(xs)-1); d,b,lat=lateral(S,x,y,v)
            sign=1 if lat>0.5 else -1 if lat<-0.5 else 0; since+=1
            if sign and last_sign and sign!=last_sign: since=0
            if sign: last_sign=sign
            lats.append(lat); sinces.append(since)
    def whatif(mode,upto,S,tw):
        """Where the wave fired at tw from S would find us if this option were taken: the bearing from S."""
        d0=direction*MODES[mode][0]; tg=list(target)+[MODES[mode][1]*d0]*max(0,upto+1-len(target))
        x,vv=xs[-1],v; k=len(xs)-1
        while True:
            tv=tg[k] if k<len(tg) else 8.0*d0
            if outward(x,tv,track):
                for q in range(k,len(tg)): tg[q]=-tg[q]
                d0=-d0; tv=-tv
            x,vv=advance(x,vv,tv,track); k+=1
            if ve*(k-tw)>=math.hypot(x-S[0],y-S[1]) or k>tw+200: return math.atan2(y-S[1],x-S[0])
    pending=[]; waves=[]; done=[]; our_heat=0.0; e_heat=3.0-0.1*rng.integers(0,10)
    tally={g:[0,0.0,0.0] for g in ('headon','linear','gf','seg')}; n_ink=n_att=0; ink_owed=0; picks={}
    for t in range(ticks):
        step_to(t)
        # the guns' virtual shots: resolve those whose bullet has arrived, then fire a new one every 4 ticks
        for p in list(pend):
            if math.hypot(xs[t]-p['S'][0],y-p['S'][1])<=(t-p['t'])*VSPEED:
                pend.remove(p); actual=math.atan2(y-p['S'][1],xs[t]-p['S'][0])
                g=max(-1.0,min(1.0,norm(actual-p['b'])/VESC*p['dirn'])); k=int(round((g+1)*23))
                gf[k]+=1; seg.setdefault(p['cell'],[0]*NB)[k]+=1
                for name,a in p['aims'].items():
                    vt[name]=vt.get(name,0)+1; vh[name]=vh.get(name,0)+(abs(norm(a-actual))<=p['tol'])
        S=epos(t); d,b,lat=lateral(S,xs[t],y,vel[t])
        if t%4==0 and d>=40:
            c=cell_of(lat,prev_lat,d,sinces[t]); aims,dirn,_=gun_aims(gf,seg,S,xs[t],y,vel[t],VSPEED,d,b,lat,c,track)
            pend.append(dict(t=t,S=S,b=b,dirn=dirn,cell=c,aims=aims,tol=math.atan2(HALF,max(d,1.0)))); prev_lat=lat
        lat4.append(prev_lat)
        e_heat=max(0.0,e_heat-0.1)
        if e_heat<=1e-9:
            e_heat=1+pe/5; c=cell_of(lat,prev_lat,d,sinces[t])
            aims,dirn,esc=gun_aims(gf,seg,S,xs[t],y,vel[t],ve,d,b,lat,c,track)
            pending.append((t,np.array(S),aims,b,dirn,esc))
        for item in list(pending):
            tw,Sw,aims,bw,dirn,esc=item
            if t>=tw+1:
                pending.remove(item)
                flight=int(math.hypot(xs[t]-Sw[0],y-Sw[1])/ve)+6
                if policy=='still': mode='hold'
                elif policy=='run': mode='reverse' if rng.random()<p_rev else 'continue'
                elif policy=='three': mode=str(rng.choice(['continue','reverse','hold'],p=probs))
                elif policy=='wide': mode=str(rng.choice(['continue','reverse','hold','half','halfrev']))
                elif policy=='belief':
                    ex_={}
                    for m in ('continue','reverse','hold'):
                        a=whatif(m,tw+flight,Sw,tw); g=max(-1.0,min(1.0,norm(a-bw)/esc*dirn)); k=int(round((g+1)*23))
                        lo,hi=max(0,k-2),min(NB,k+3)
                        ex_[m]=float(belief[lo:hi].sum())*(1.0-(cov[m][0]/cov[m][1] if fire=='ink' else 0.0))
                    best=min(ex_.values()); mode=str(rng.choice([m for m in ex_ if ex_[m]<=best*1.02+1e-12]))
                picks[mode]=picks.get(mode,0)+1
                d0=direction*MODES[mode][0]
                if MODES[mode][0]<0: direction=-direction
                for k in range(len(target),tw+flight+1): target.append(MODES[mode][1]*d0)
                step_to(tw+flight+2)
                pos=lambda k:(xs[min(k,len(xs)-1)],y)
                th,kh,width,dist=hit_set(Sw,tw,ve,pos)
                waves.append(dict(S=Sw,tw=tw,ve=ve,th=th,kh=kh,width=width,cert=np.zeros(th.size,bool),poss=np.zeros(th.size,bool),
                                  aims=aims,b=bw,dirn=dirn,esc=esc,mode=mode)); ink_owed+=1
        for wv in list(waves):
            if t>int(wv['kh'].max()):
                waves.remove(wv); th=wv['th']; sp=(th[-1]-th[0])/max(1,th.size-1)
                sc=ss.score(wv['cert'][None,:],wv['poss'][None,:])[0]; done.append((sc,wv['width']))
                if wv['mode'] in cov: cov[wv['mode']][0]+=sc; cov[wv['mode']][1]+=1.0
                for name,a in wv['aims'].items():
                    dd=np.abs((th-a+np.pi)%(2*np.pi)-np.pi); i=int(dd.argmin()); on=dd[i]<=abs(sp)
                    stop=1.0 if wv['cert'][i] else 0.5 if wv['poss'][i] else 0.0
                    tally[name][0]+=1; tally[name][1]+=float(on); tally[name][2]+=float(on)*(1.0-stop)
                    if name==enemy and on:      # a bullet that hit us or met our ink shows where it was aimed
                        g=max(-1.0,min(1.0,norm(a-wv['b'])/wv['esc']*wv['dirn'])); belief[int(round((g+1)*23))]+=1.0
        our_heat=max(0.0,our_heat-0.1)
        if our_heat<=1e-9:
            O=np.array([xs[t],y]); ex,ey=epos(t); base=math.atan2(ey-O[1],ex-O[0])
            live=[wv for wv in waves if wv['tw']<=t-2]
            def gains(ang,vb,kstop=None):
                tot=np.zeros(ang.size); keep=[]
                for wv in live:
                    c,ps=ss.cover(wv['S'],wv['tw'],wv['ve'],O,ang,vb,t,wv['th'],wv['kh'],kstop)
                    tot+=(ss.score(c|wv['cert'],ps|wv['poss'])-ss.score(wv['cert'][None,:],wv['poss'][None,:])[0])*wv['width']
                    keep.append((c,ps))
                return tot,keep
            if fire=='ink' and live:
                vb=ss.bullet_speed(0.1); ang=base+np.linspace(-0.7,0.7,841); tot,_=gains(ang,vb); i=int(tot.argmax())
                ang2=ang[i]+np.linspace(-0.003,0.003,61); tot,_=gains(ang2,vb); j=int(tot.argmax())
                if tot[j]>0:
                    kd,_=death_turn(O,ang2[j],vb,t,epos); tot,keep=gains(np.array([ang2[j]]),vb,kd)
                    for wv,(c,ps) in zip(live,keep): wv['cert']|=c[0]; wv['poss']|=ps[0]
                our_heat=1+0.1/5; n_ink+=1
            elif fire=='attack':
                p=1.95; vb=ss.bullet_speed(p); aim=base+rng.normal(0,aim_sd); kd,_=death_turn(O,aim,vb,t,epos)
                if live:
                    tot,keep=gains(np.array([aim]),vb,kd)
                    for wv,(c,ps) in zip(live,keep): wv['cert']|=c[0]; wv['poss']|=ps[0]
                our_heat=1+p/5; n_att+=1
    dn=np.array(done); out=dict(waves=len(dn),cover=float(dn[:,0].mean()),width=float(dn[:,1].mean()),picks=picks)
    for g,(n,on,net) in tally.items(): out[g]=dict(n=n,on=on/max(1,n),net=net/max(1,n))
    out['virtual']={g:vh[g]/vt[g] for g in vt}
    out['census']=census_rates(xs[:ticks],vel[:ticks],E,y,track)
    return out
def agg(rs):
    n=sum(r['waves'] for r in rs); out=dict(waves=n,cover=round(sum(r['cover']*r['waves'] for r in rs)/n,3),
                                           width=round(sum(r['width']*r['waves'] for r in rs)/n,1))
    for g in ('headon','linear','gf','seg'):
        m=sum(r[g]['n'] for r in rs)
        out[g]=dict(on=round(sum(r[g]['on']*r[g]['n'] for r in rs)/max(1,m),3),net=round(sum(r[g]['net']*r[g]['n'] for r in rs)/max(1,m),3))
    for key in ('virtual','census'):
        ks=sorted(set().union(*[r[key].keys() for r in rs])); out[key]={k:round(float(np.nanmean([r[key].get(k,float('nan')) for r in rs])),3) for k in ks}
    pk={}
    for r in rs:
        for k,c in r['picks'].items(): pk[k]=pk.get(k,0)+c
    tot=sum(pk.values()); out['picks']={k:round(c/tot,3) for k,c in sorted(pk.items())}
    return out
SEEDS=(31,32,33)
def job(item):
    tag,kw=item; t0=time.time(); a=agg([run(seed=s,**kw) for s in SEEDS])
    a.update({k:(list(v) if isinstance(v,tuple) else v) for k,v in kw.items()})
    with open(HERE+'/e6.log','a') as f: print(tag,json.dumps(a),f'[{time.time()-t0:.0f}s]',file=f,flush=True)
    return tag,a
if __name__=='__main__':
    from multiprocessing import Pool
    T=int(sys.argv[1]) if len(sys.argv)>1 else 6000
    jobs=[]
    for name,policy,kw in (('run','run',dict(p_rev=0.3)),('run_rev0.5','run',dict(p_rev=0.5)),
                           ('three','three',dict(probs=(0.5,0.25,0.25))),('three_even','three',dict(probs=(0.34,0.33,0.33))),
                           ('wide','wide',{}),('belief_seg','belief',dict(enemy='seg')),('belief_gf','belief',dict(enemy='gf')),
                           ('belief_linear','belief',dict(enemy='linear')),('belief_headon','belief',dict(enemy='headon')),
                           ('still','still',{})):
        for fire in ('ink','attack'):
            jobs.append((name+'_'+fire,dict(policy=policy,fire=fire,ticks=T,**kw)))
    open(HERE+'/e6.log','w').close()
    with Pool(int(sys.argv[2]) if len(sys.argv)>2 else 2) as pool: res=dict(pool.map(job,jobs,chunksize=1))
    json.dump(res,open(HERE+'/e6.json','w'),indent=1)
