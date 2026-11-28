"""Single ink shot: the best cover one shot can give a body standing still on its landing spot, as a function of
the sidestep angle psi between the firing spot and the landing spot (seen from the enemy)."""
import os, sys; HERE=os.path.dirname(os.path.abspath(__file__)); sys.path.insert(0,HERE)
import numpy as np, shadowsim as ss, json, time
S=np.array([0.0,0.0])
POW=(0.1,0.15,0.2,0.3,0.5)
def best_single(D,ve,psi_deg,delta,aspect_deg=0.0,powers=POW,already=None,n=181):
    """Best (score, aim offset deg, power, certain share) for one shot fired at tick delta from the spot psi before
    the still body's place. already = (cert, poss) arrays (n,) of cover from earlier shots, to maximise the union."""
    a0=np.radians(aspect_deg)
    R=D*np.array([np.cos(a0),np.sin(a0)])
    psi=np.radians(psi_deg)
    O=D*np.array([np.cos(a0-psi),np.sin(a0-psi)])
    th,w=ss.body_samples(S,R,n=n); kh=ss.hit_turn(S,R,th,ve,0)
    base=np.arctan2(S[1]-O[1],S[0]-O[0])
    c0=np.zeros(n,bool) if already is None else already[0]
    p0=np.zeros(n,bool) if already is None else already[1]
    best=(ss.score(c0[None,:],p0[None,:])[0],0.0,0.1,c0,p0)
    for p in powers:
        vb=ss.bullet_speed(p)
        ang=base+np.linspace(-1.3,1.3,1301)
        c,ps=ss.cover(S,0,ve,O,ang,vb,delta,th,kh)
        sc=ss.score(c|c0,ps|p0); i=int(sc.argmax())
        ang2=ang[i]+np.linspace(-0.004,0.004,161)
        c,ps=ss.cover(S,0,ve,O,ang2,vb,delta,th,kh)
        sc=ss.score(c|c0,ps|p0); j=int(sc.argmax())
        if sc[j]>best[0]+1e-9: best=(float(sc[j]),float(np.degrees(ang2[j]-base)),p,c[j]|c0,ps[j]|p0)
    return best, w*D
if __name__=='__main__':
    t0=time.time(); out={}
    f=open(HERE+'/e1.log','w')
    for aspect in (0.0,45.0):
        for D in (300,450,600):
            for ve in (11.0,14.0,17.0):
                for delta in (-4,2,13,24):
                    row=[]
                    for psi in (0,2.5,5,7.5,10,12.5,15,17.5,20,22.5,25,27.5,30):
                        b,wpx=best_single(D,ve,psi,delta,aspect)
                        row.append((psi,round(b[0],3),round(b[1],2),b[2],round(float(b[3].mean()),3)))
                    out[f'{aspect:g}_{D}_{ve:g}_{delta}']=row
                    print(aspect,D,ve,delta,' '.join(f'{r[0]:g}:{r[1]:.2f}' for r in row),f'[{time.time()-t0:.0f}s]',file=f,flush=True)
    json.dump(out,open(HERE+'/e1.json','w'))
    print('done',file=f,flush=True)
