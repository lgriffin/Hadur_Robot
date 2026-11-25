"""Stream duel, final form. Adds to e4: the enemy's path is fixed in advance and unknown to our planner; a wave is
known one tick after it is fired and can be aimed at two ticks after; our bullet dies on the turn it meets the
enemy's body or leaves the field, and casts nothing from then on; mixed guns (ink and attack shots)."""
import os, sys; HERE=os.path.dirname(os.path.abspath(__file__)); sys.path.insert(0,HERE)
import numpy as np, shadowsim as ss, json, time
from e4 import hit_set
HALF=18.0; W,H=800.0,600.0
def death_turn(O,ang,vb,tf,epos,kmax=90):
    """First turn on which our bullet meets the enemy's body (where it stood the turn before) or leaves the field."""
    ux,uy=np.cos(ang),np.sin(ang)
    for k in range(tf+1,tf+kmax):
        ax,ay=O[0]+ux*vb*(k-1-tf),O[1]+uy*vb*(k-1-tf); bx,by=O[0]+ux*vb*(k-tf),O[1]+uy*vb*(k-tf)
        ex,ey=epos(k-1)
        # segment-box (slab) test
        dx,dy=bx-ax,by-ay; t0,t1=0.0,1.0; ok=True
        for p,d,c in ((ax,dx,ex),(ay,dy,ey)):
            if abs(d)<1e-12:
                if p<c-HALF or p>c+HALF: ok=False;break
            else:
                ta,tb=(c-HALF-p)/d,(c+HALF-p)/d
                if ta>tb: ta,tb=tb,ta
                t0=max(t0,ta); t1=min(t1,tb)
                if t0>t1: ok=False;break
        if ok: return k,True
        if not(0<=bx<=W and 0<=by<=H): return k,False
    return tf+kmax,False
def run(seed=1,ticks=2400,pe=2.0,gun='ink',p_rev=0.3,D0=450.0,track=(120.0,680.0),ink_powers=(0.1,),aim_sd=0.045,policy='run'):
    rng=np.random.default_rng(seed); ve=ss.bullet_speed(pe); y_us=60.0
    # enemy path, fixed in advance
    E=np.zeros((ticks+200,2)); ex,ey=400.0,60.0+D0; evx=evy=0.0
    for t in range(ticks+200):
        evx=np.clip(evx+rng.normal(0,1.0),-8,8); evy=np.clip(evy+rng.normal(0,1.0),-8,8)
        ex=float(np.clip(ex+evx,330,470)); ey=float(np.clip(ey+evy,60.0+D0-60,min(564.0,60.0+D0+60))); E[t]=(ex,ey)
    epos=lambda k:(E[min(k,len(E)-1),0],E[min(k,len(E)-1),1])
    xs=[400.0]; v=0.0; direction=1.0; target=[]
    def extend(upto,mode):
        nonlocal direction
        if mode=='reverse': direction=-direction
        for k in range(len(target),upto+1):
            target.append(0.0 if mode=='stop' else 8.0*direction)
    def step_to(t):
        nonlocal v
        while len(xs)<=t:
            k=len(xs)-1; tv=target[k] if k<len(target) else 8.0*direction; x=xs[-1]
            if x>track[1]-40 and tv>0: tv=-abs(tv)
            if x<track[0]+40 and tv<0: tv=abs(tv)
            if v*tv<0 or abs(tv)<abs(v):
                v=np.sign(v)*max(0.0,abs(v)-2.0) if (abs(v)-2.0>=abs(tv) or v*tv<0) else tv
            else:
                v=np.sign(tv)*min(abs(tv),abs(v)+1.0) if tv!=0 else 0.0
            xs.append(float(np.clip(x+v,track[0],track[1])))
    pending=[]; waves=[]; done=[]; our_heat=0.0; e_heat=3.0-0.1*rng.integers(0,10)
    n_ink=n_att=att_hits=0; last_was_ink=False; ink_owed=0
    for t in range(ticks):
        step_to(t)
        if xs[t]>track[1]-45: direction=-1.0
        if xs[t]<track[0]+45: direction=1.0
        e_heat=max(0.0,e_heat-0.1)
        if e_heat<=1e-9:
            e_heat=1+pe/5; pending.append((t,np.array(epos(t))))
        # a shot fired at tw is seen at tw+1: commit the next stretch of path then
        for tw,S in list(pending):
            if t>=tw+1:
                pending.remove((tw,S))
                flight=int(np.hypot(xs[t]-S[0],y_us-S[1])/ve)+6
                mode='stop' if policy=='still' else ('reverse' if rng.random()<p_rev else 'continue')
                if policy=='settle':
                    arr=tw+flight-6-1                       # about the first turn the wave can meet us
                    extend(max(len(target)-1,arr-6),mode)    # run until six ticks before it
                    for k in range(len(target),arr+2): target.append(0.0)   # then brake and stand while it passes
                else:
                    extend(tw+flight,mode)
                step_to(tw+flight+2)
                pos=lambda k:(xs[min(k,len(xs)-1)],y_us)
                th,kh,width,dist=hit_set(S,tw,ve,pos)
                waves.append(dict(S=S,tw=tw,ve=ve,th=th,kh=kh,width=width,cert=np.zeros(th.size,bool),poss=np.zeros(th.size,bool),
                                  side=abs(xs[min(int(kh.min()),len(xs)-1)]-xs[tw]),inks=0))
                ink_owed+=1
        for wv in list(waves):
            if t>int(wv['kh'].max()):
                done.append((ss.score(wv['cert'][None,:],wv['poss'][None,:])[0],wv['width'],wv['side'],wv['inks'])); waves.remove(wv)
        our_heat=max(0.0,our_heat-0.1)
        if our_heat<=1e-9:
            O=np.array([xs[t],y_us]); ex,ey=epos(t); base=np.arctan2(ey-O[1],ex-O[0])
            live=[wv for wv in waves if wv['tw']<=t-2]
            def gains(ang,vb,kstop=None):
                tot=np.zeros(ang.size); keep=[]
                for wv in live:
                    c,ps=ss.cover(wv['S'],wv['tw'],wv['ve'],O,ang,vb,t,wv['th'],wv['kh'],kstop)
                    tot+=(ss.score(c|wv['cert'],ps|wv['poss'])-ss.score(wv['cert'][None,:],wv['poss'][None,:])[0])*wv['width']
                    keep.append((c,ps))
                return tot,keep
            want_ink = gun=='ink' or (gun=='alt' and not last_was_ink) or (gun=='ink1' and ink_owed>0)
            if want_ink and live:
                best=(0.0,None,0.1)
                for p in ink_powers:
                    vb=ss.bullet_speed(p); ang=base+np.linspace(-0.7,0.7,841)
                    tot,_=gains(ang,vb); i=int(tot.argmax())
                    ang2=ang[i]+np.linspace(-0.003,0.003,61); tot,keep=gains(ang2,vb); j=int(tot.argmax())
                    val=tot[j]-0.6*(p-0.1)/0.1
                    if val>best[0]: best=(val,ang2[j],p)
                if best[1] is not None:
                    vb=ss.bullet_speed(best[2]); kd,_=death_turn(O,best[1],vb,t,epos)
                    tot,keep=gains(np.array([best[1]]),vb,kd)
                    for wv,(c,ps) in zip(live,keep):
                        if (c[0]&~wv['cert']).any() or (ps[0]&~wv['poss']).any(): wv['inks']+=1
                        wv['cert']|=c[0]; wv['poss']|=ps[0]
                our_heat=1+best[2]/5; n_ink+=1; last_was_ink=True; ink_owed=0
            elif gun!='ink' or not live:
                if gun=='ink':   # nothing to cover yet: hold the gun cool
                    pass
                else:
                    p=1.95; vb=ss.bullet_speed(p); aim=base+rng.normal(0,aim_sd)
                    hw=HALF/np.hypot(ex-O[0],ey-O[1])
                    cand=aim+hw*np.array([0,-0.9,-0.45,0.45,0.9]) if gun=='gun7' else np.array([aim])
                    j=0
                    if live:
                        tot,_=gains(cand,vb); j=int(tot.argmax()) if tot.max()>1e-9 else 0
                    kd,hit=death_turn(O,cand[j],vb,t,epos)
                    if live:
                        tot,keep=gains(np.array([cand[j]]),vb,kd)
                        for wv,(c,ps) in zip(live,keep): wv['cert']|=c[0]; wv['poss']|=ps[0]
                    our_heat=1+p/5; n_att+=1; att_hits+=int(hit); last_was_ink=False
    d=np.array(done); bins=((0,40),(40,80),(80,120),(120,160),(160,400))
    return dict(waves=len(d),cover=float(d[:,0].mean()),width=float(d[:,1].mean()),uncovered=float((d[:,1]*(1-d[:,0])).mean()),
                full=float((d[:,0]>=0.95).mean()),half=float((d[:,0]>=0.5).mean()),ink=n_ink,att=n_att,att_hits=att_hits,ticks=ticks,
                by_side=[(float(d[(d[:,2]>=lo)&(d[:,2]<hi),0].mean()) if ((d[:,2]>=lo)&(d[:,2]<hi)).any() else None,int(((d[:,2]>=lo)&(d[:,2]<hi)).sum())) for lo,hi in bins],
                by_inks=[(k,float(d[d[:,3]==k,0].mean()) if (d[:,3]==k).any() else None,int((d[:,3]==k).sum())) for k in range(0,5)])
def agg(rs):
    n=sum(r['waves'] for r in rs); w=lambda key: sum(r[key]*r['waves'] for r in rs)/n
    out=dict(waves=n,cover=round(w('cover'),3),width=round(w('width'),1),uncovered=round(w('uncovered'),1),full=round(w('full'),3),half=round(w('half'),3),
             ink_per_wave=round(sum(r['ink'] for r in rs)/n,2),att_per_100=round(100*sum(r['att'] for r in rs)/sum(r['ticks'] for r in rs),2),
             att_hit=round(sum(r['att_hits'] for r in rs)/max(1,sum(r['att'] for r in rs)),3))
    bs=[]
    for i in range(5):
        vals=[r['by_side'][i] for r in rs if r['by_side'][i][0] is not None]; tot=sum(c for _,c in vals)
        bs.append((round(sum(v*c for v,c in vals)/tot,3) if tot else None,tot))
    out['by_side']=bs
    bi=[]
    for i in range(5):
        vals=[(r['by_inks'][i][1],r['by_inks'][i][2]) for r in rs if r['by_inks'][i][1] is not None]; tot=sum(c for _,c in vals)
        bi.append((i,round(sum(v*c for v,c in vals)/tot,3) if tot else None,tot))
    out['by_inks']=bi
    return out
if __name__=='__main__':
    f=open(HERE+'/e5.log','w'); res={}; t0=time.time()
    def go(tag,seeds=(21,22,23),**kw):
        a=agg([run(seed=s,**kw) for s in seeds]); a.update({k:(list(v) if isinstance(v,tuple) else v) for k,v in kw.items()}); res[tag]=a
        print(tag,json.dumps(a),f'[{time.time()-t0:.0f}s]',file=f,flush=True)
    for gun in ('ink','alt','ink1','gun7','attack'):
        go(f'main_{gun}',gun=gun,pe=2.0)
    for prev in (0.1,0.2,0.5):
        go(f'rev{prev}_ink',gun='ink',p_rev=prev)
    for pe in (1.0,3.0):
        for gun in ('ink','attack'):
            go(f'pe{pe:g}_{gun}',gun=gun,pe=pe)
    for D0 in (350.0,):
        for gun in ('ink','attack'):
            go(f'D{D0:g}_{gun}',gun=gun,D0=D0)
    go('still_ink',gun='ink',policy='still'); go('still_attack',gun='attack',policy='still')
    go('tuned_ink',gun='ink',ink_powers=(0.1,0.2,0.3))
    go('settle_ink',gun='ink',policy='settle'); go('settle_attack',gun='attack',policy='settle')
    json.dump(res,open(HERE+'/e5.json','w')); print('done',file=f,flush=True)
