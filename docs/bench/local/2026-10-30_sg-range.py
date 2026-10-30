"""Per run: ticks and damage taken by distance band, per opponent. Subject = first robot of T."""
import gzip,os,sys,math,collections,json
BANDS=[0,100,150,200,300,450,9999]
def band(d):
    for i in range(len(BANDS)-1):
        if d<BANDS[i+1]: return i
def run(work):
    out=collections.defaultdict(lambda: {'ticks':[0]*6,'dmg':[0.0]*6,'rounds':0})
    for d in sorted(os.listdir(work+'/battles')):
        opp=d.rsplit('-',1)[0]; o=out[opp]
        fires=collections.defaultdict(float); prev={}
        lines=gzip.open(f'{work}/battles/{d}/truth.log.gz','rt').read().split('\n')
        for l in lines:
            if l.startswith('F,'):
                p=l.split(','); 
                if p[3]=='S': fires[(p[1],int(p[2]))]+=float(p[4])
        rounds=set()
        for l in lines:
            if not l.startswith('T,'): continue
            p=l.split(','); r=p[1]; t=int(p[2]); rounds.add(r)
            x1,y1=float(p[3]),float(p[4]); x2,y2,e2=float(p[8]),float(p[9]),float(p[12])
            dist=math.hypot(x1-x2,y1-y2); b=band(dist)
            o['ticks'][b]+=1
            if r in prev:
                pe=prev[r]; rise=e2-pe
                if rise>0.2:
                    pw=min(3.0,rise/3); o['dmg'][b]+=4*pw+max(0,2*(pw-1))
            prev={r:e2}
        o['rounds']+=len(rounds)
    return out
if __name__=='__main__':
    json.dump(run(sys.argv[1]),open(sys.argv[2],'w'))
