import csv, collections, statistics as st, math
O=r"E:\hadur-live-316"
def base(n): return n.rsplit(" ",1)[0]
B=collections.defaultdict(lambda: collections.defaultdict(list))
for r in csv.DictReader(open(O+r"\bench\census-arms.tsv"),delimiter="\t"):
    if r["ok"]!="true": continue
    k=base(r["opponent"]); B[r["arm"]][k].append(r)
for r in csv.DictReader(open(O+r"\bench\shield-s2-partial-c-aa.tsv"),delimiter="\t"):
    if r["ok"]=="true": B["s2"+r["arm"]][base(r["opponent"])].append(r)
L=collections.defaultdict(list)
for n in ["rr01","rr02","rr03","rr04"]:
    for r in csv.DictReader(open(O+rf"\profiles-since-316-{n}.tsv"),delimiter="\t"):
        L[r["key"]].append((int(r["last_wins"])/int(r["last_rounds"]), float(r["last_damage_share"] or 0), n))
P=collections.defaultdict(list)
for n in ["rr01","rr02","rr03","rr04"]:
    for r in csv.DictReader(open(O+rf"\results-pending\hadur316-{n}.tsv"),delimiter="\t"):
        P[base(r["opponent"])].append(float(r["score_share"]))
def m(x): return sum(x)/len(x)
def ci(d): 
    s=st.stdev(d)/math.sqrt(len(d)) if len(d)>1 else 0; return f"{m(d)*100:+.2f} pp (±{1.96*s*100:.2f}, n={len(d)})"
for arm in ["t1","c","aa","s2c","s2aa"]:
    keys=[k for k in L if k in B[arm]]
    dw=[m([w for w,_,_ in L[k]])-m([int(r["firsts"])/int(r["rounds"]) for r in B[arm][k]]) for k in keys]
    dd=[m([d for _,d,_ in L[k]])-m([float(r["bullet_share"]) for r in B[arm][k]]) for k in keys]
    print(f"live - bench[{arm}]: rounds won {ci(dw)}; damage share {ci(dd)}")
    if arm in("t1","s2c"):
        ks=[k for k in P if k in B[arm]]
        if ks:
            ds=[m(P[k])-m([float(r["score_share"]) for r in B[arm][k]]) for k in ks]
            print(f"   pending score share - bench[{arm}] score share: {ci(ds)}; live {m([m(P[k]) for k in ks]):.4f} bench {m([m([float(r['score_share']) for r in B[arm][k]]) for k in ks]):.4f}")
keys=[k for k in L if k in B["t1"]]
rows=[]
for k in keys:
    lw=m([w for w,_,_ in L[k]]); bw=m([int(r["firsts"])/int(r["rounds"]) for r in B["t1"][k]])
    ld=m([d for _,d,_ in L[k]]); bd=m([float(r["bullet_share"]) for r in B["t1"][k]])
    rows.append((lw-bw,k,lw,bw,ld,bd,len(L[k]),B["t1"][k][0]["role"]))
rows.sort()
with open(O+r"\compare-live-vs-t1.tsv","w") as f:
    f.write("opponent\trole\tlive_clients\tlive_round_win\tbench_t1_round_win\tdiff\tlive_dmg_share\tbench_t1_bullet_share\n")
    for d,k,lw,bw,ld,bd,n,role in rows: f.write(f"{k}\t{role}\t{n}\t{lw:.4f}\t{bw:.4f}\t{d:+.4f}\t{ld:.4f}\t{bd:.4f}\n")
print("\nworst 12 (live - t1 rounds won):")
for d,k,lw,bw,ld,bd,n,role in rows[:12]: print(f"  {k:35s} {role:16s} live {lw:.3f} bench {bw:.3f} {d:+.3f}  dmg {ld:.3f}/{bd:.3f}")
print("best 5:"); 
for d,k,lw,bw,ld,bd,n,role in rows[-5:]: print(f"  {k:35s} live {lw:.3f} bench {bw:.3f} {d:+.3f}")
# by band
band=collections.defaultdict(list)
for d,k,lw,bw,ld,bd,n,role in rows: band[role.split("-")[-1]].append(d)
print("\nby band:", {b:f"{m(v)*100:+.2f}pp n={len(v)}" for b,v in sorted(band.items())})
print("live opponents not on census panel:", [k for k in L if k not in B["t1"]])
