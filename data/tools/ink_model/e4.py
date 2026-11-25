"""Stream duel with a moving body. We drive along a track; each enemy shot commits the next stretch of our path
(continue, reverse, brake-and-settle, half speed). Every wave's hit set is the bearings whose bullet would meet
our body as it then moves; cover is the share of that set our bullets stop first (certain 1, possible 1/2)."""
import os, sys; HERE=os.path.dirname(os.path.abspath(__file__)); sys.path.insert(0,HERE)
import numpy as np, shadowsim as ss, json, time
HALF=18.0
def hit_set(S,tw,ve,pos,n=121):
    """pos(k) -> our centre at tick k. Returns bearings th that hit, their hit turns, and the set's width in px
    at our distance."""
    # coarse arrival
    k=tw+1
    while True:
        p=pos(k); 
        if ve*(k-tw) >= np.hypot(p[0]-S[0],p[1]-S[1])-30: break
        k+=1
    k0=k-1; ks=list(range(k0,k0+8))
    cs=[pos(kk-1) for kk in ks]
    bear=[np.arctan2(c[1]-S[1],c[0]-S[0]) for c in cs]
    dist=np.mean([np.hypot(c[0]-S[0],c[1]-S[1]) for c in cs])
    c0=bear[0]; rel=[(b-c0+np.pi)%(2*np.pi)-np.pi for b in bear]
    lo=min(rel)-30.0/dist; hi=max(rel)+30.0/dist
    N=int(max(n,(hi-lo)*dist/0.4))
    th=c0+np.linspace(lo,hi,N); dx,dy=np.cos(th),np.sin(th)
    kh=np.full(N,-1)
    for kk,c in zip(ks,cs):
        cx,cy=c[0]-S[0],c[1]-S[1]
        with np.errstate(divide='ignore',invalid='ignore'):
            tx1=(cx-HALF)/dx; tx2=(cx+HALF)/dx; ty1=(cy-HALF)/dy; ty2=(cy+HALF)/dy
        tmin=np.maximum(np.minimum(tx1,tx2),np.minimum(ty1,ty2)); tmax=np.minimum(np.maximum(tx1,tx2),np.maximum(ty1,ty2))
        r0,r1=ve*(kk-1-tw),ve*(kk-tw)
        hit=(tmax>=tmin)&(tmax>=r0)&(tmin<=r1)&(kh<0)
        kh[hit]=kk
    m=kh>0
    width=m.sum()*(hi-lo)/N*dist
    return th[m],kh[m],width,dist
def run(seed=1,ticks=2400,pe=2.0,gun='ink',policy='run',D0=450.0,track=(120.0,680.0),ink_powers=(0.1,0.2,0.3),p_rev=0.3):
    rng=np.random.default_rng(seed)
    ve=ss.bullet_speed(pe); y_us=60.0
    ex,ey=400.0,60.0+D0; evx=evy=0.0
    xs=[400.0]; v=0.0; direction=1.0
    target=[]         # committed target velocity per future tick (index = tick)
    def extend(upto,mode):
        nonlocal direction
        if mode=='reverse': direction=-direction
        n0=len(target)
        for k in range(n0,upto+1):
            if mode in('continue','reverse'): target.append(8.0*direction)
            elif mode=='half': target.append(4.0*direction)
            elif mode=='settle':
                # run, then brake so the body is still for the last 7 ticks of the stretch
                target.append(8.0*direction if k<upto-10 else 0.0)
            elif mode=='stop': target.append(0.0)
    def step_to(t):
        nonlocal v,direction
        while len(xs)<=t:
            k=len(xs)-1
            tv=target[k] if k<len(target) else 8.0*direction
            x=xs[-1]
            # walls of the track: turn round
            if (x>track[1]-40 and tv>0) or (x<track[0]+40 and tv<0):
                tv=-abs(tv) if x>track[1]-40 else abs(tv)
                if tv==0: tv=0
            if v*tv<0 or abs(tv)<abs(v):       # braking
                v=np.sign(v)*max(0.0,abs(v)-2.0) if abs(v)-2.0>=abs(tv) or v*tv<0 else tv
            else:
                v=np.sign(tv)*min(abs(tv),abs(v)+1.0) if tv!=0 else 0.0
            xs.append(float(np.clip(x+v,track[0],track[1])))
    waves=[]; done=[]; our_heat=0.0; e_heat=3.0-0.1*rng.integers(0,10); shots=0
    ne=int(round((1+pe/5)/0.1))
    for t in range(ticks):
        evx=np.clip(evx+rng.normal(0,1.0),-8,8); evy=np.clip(evy+rng.normal(0,1.0),-8,8)
        ex=float(np.clip(ex+evx,330,470)); ey=float(np.clip(ey+evy,60.0+D0-60,min(564.0,60.0+D0+60)))
        step_to(t)
        if xs[t]>track[1]-45: direction=-1.0
        if xs[t]<track[0]+45: direction=1.0
        e_heat=max(0.0,e_heat-0.1)
        if e_heat<=1e-9:
            e_heat=1+pe/5; S=np.array([ex,ey]); tw=t
            flight=int(np.hypot(xs[t]-ex,y_us-ey)/ve)+6
            if policy=='run': mode='reverse' if rng.random()<p_rev else 'continue'
            elif policy=='mix': mode=rng.choice(['continue','continue','reverse','settle','half'])
            elif policy=='settle': 
                if rng.random()<p_rev: direction=-direction
                mode='settle'
            elif policy=='still': mode='stop'
            extend(t+flight,mode)
            step_to(t+flight+2)
            pos=lambda k: (xs[min(k,len(xs)-1)],y_us)
            th,kh,width,dist=hit_set(S,tw,ve,pos)
            waves.append(dict(S=S,tw=tw,ve=ve,th=th,kh=kh,width=width,cert=np.zeros(th.size,bool),poss=np.zeros(th.size,bool),
                              side=abs(xs[min(int(kh.min()),len(xs)-1)]-xs[t])))
        for wv in list(waves):
            if t>int(wv['kh'].max()):
                sc=ss.score(wv['cert'][None,:],wv['poss'][None,:])[0]
                done.append((sc,wv['width'],wv['side'])); waves.remove(wv)
        our_heat=max(0.0,our_heat-0.1)
        if our_heat<=1e-9 and waves:
            O=np.array([xs[t],y_us]); base=np.arctan2(ey-O[1],ex-O[0])
            def gains(ang,vb):
                tot=np.zeros(ang.size); keep=[]
                for wv in waves:
                    c,ps=ss.cover(wv['S'],wv['tw'],wv['ve'],O,ang,vb,t,wv['th'],wv['kh'])
                    tot+=(ss.score(c|wv['cert'],ps|wv['poss'])-ss.score(wv['cert'][None,:],wv['poss'][None,:])[0])*wv['width']
                    keep.append((c,ps))
                return tot,keep
            if gun=='ink':
                best=(0.0,None,0.1)
                for p in ink_powers:
                    vb=ss.bullet_speed(p); ang=base+np.linspace(-0.7,0.7,841)
                    tot,_=gains(ang,vb); i=int(tot.argmax())
                    ang2=ang[i]+np.linspace(-0.003,0.003,61); tot,keep=gains(ang2,vb); j=int(tot.argmax())
                    val=tot[j]-0.6*(p-0.1)/0.1          # 0.1 more power must buy 0.6 px of stopped width
                    if val>best[0]: best=(val,[(c[j],ps[j]) for c,ps in keep],p)
                if best[1] is not None:
                    for wv,(c,ps) in zip(waves,best[1]): wv['cert']|=c; wv['poss']|=ps
                our_heat=1+best[2]/5; shots+=1
            else:
                p=1.95; vb=ss.bullet_speed(p); aim=base+rng.normal(0,0.045)
                hw=HALF/np.hypot(ex-O[0],ey-O[1])
                cand=np.array([aim]) if gun=='attack' else aim+hw*np.array([0,-0.9,-0.45,0.45,0.9])
                tot,keep=gains(cand,vb); j=int(tot.argmax()) if tot.max()>1e-9 else 0
                for wv,(c,ps) in zip(waves,keep): wv['cert']|=c[j]; wv['poss']|=ps[j]
                our_heat=1+p/5; shots+=1
    d=np.array(done)
    unc=d[:,1]*(1-d[:,0])
    bins=((0,40),(40,80),(80,120),(120,160),(160,400))
    return dict(waves=len(d),cover=round(float(d[:,0].mean()),3),width=round(float(d[:,1].mean()),1),uncovered_px=round(float(unc.mean()),1),
                shots=shots,by_side=[(lo,hi,round(float(d[(d[:,2]>=lo)&(d[:,2]<hi),0].mean()),3) if ((d[:,2]>=lo)&(d[:,2]<hi)).any() else None,
                                      int(((d[:,2]>=lo)&(d[:,2]<hi)).sum())) for lo,hi in bins])
if __name__=='__main__':
    t0=time.time()
    for pol in ('run','settle','mix','still'):
        r=run(seed=1,ticks=900,gun='ink',policy=pol); print(pol,r,round(time.time()-t0,1),'s',flush=True)
