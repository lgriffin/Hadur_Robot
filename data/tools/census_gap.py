#!/usr/bin/env python3
"""Gap analysis for the 3.11 census (M1 rows): Hadur 3.10 against Tomcat 3.68 and Nullstride.

Reads the three exported row files (tail and top steps carry Tomcat as candidate and Hadur 3.10 as
baseline on the same opponents and seeds; the ceiling step carries Nullstride alone), applies the
census row rules, and prints markdown tables: the gap by band, the live comparison (gate G1), the
seed-half A/A test (M2, gate G2), the score breakdown and a per-opponent ledger TSV (M3).

Gap is Hadur minus the subject, in score-share points (APS scale), so negative means Hadur is behind.
Score share is score / (score + theirScore), the same quantity the live rumble averages.
"""
import argparse
import csv
import math
import sys
from collections import defaultdict

HADUR = "hadur2.Hadur 3.10"
TOMCAT = "lxx.Tomcat 3.68"
NULLSTRIDE = "jd.Nullstride 2.3.3"
BANDS = [1, 2, 3, 4, 5, 6]
BAND_NAMES = {1: "1 (1-10)", 2: "2 (11-50)", 3: "3 (51-200)", 4: "4 (201-400)", 5: "5 (401-700)", 6: "6 (701+)"}
COMPONENTS = ["bulletDamage", "ramDamage", "survival", "lastSurvivorBonus", "bulletDamageBonus", "ramDamageBonus"]


def read_tsv(path):
    with open(path, encoding="utf8", newline="") as f:
        return list(csv.DictReader(f, delimiter="\t"))


def late_duress(rounds_path):
    """(build, opponent, seed) for Hadur battles with duress in a round after round 0."""
    bad = set()
    for r in read_tsv(rounds_path):
        if r["round"] != "0" and (r["duressTicks"] or "0") not in ("0", "-1"):
            bad.add((r["build"], r["opponent"], r["seed"]))
    return bad


def band_of(role):
    return int(role.rsplit("band", 1)[1])


def load_rows(row_files, rounds_files, keep_other_jvms=False):
    """Return (kept rows, drop counts, failing opponents)."""
    late = set()
    for p in rounds_files:
        late |= late_duress(p)
    kept, drops, seen_ok, seen_all = [], defaultdict(int), defaultdict(int), defaultdict(int)
    for p in row_files:
        for r in read_tsv(p):
            seen_all[(r["build"], r["opponent"])] += 1
            if r["ok"] != "true":
                drops["battle failed"] += 1
                continue
            if r["securityErrors"] not in ("0", ""):
                drops["security denial"] += 1
                continue
            if not keep_other_jvms and r["otherJvms"] not in ("0", ""):
                drops["another JVM"] += 1
                continue
            if (r["build"], r["opponent"], r["seed"]) in late:
                drops["duress after round 0"] += 1
                continue
            seen_ok[(r["build"], r["opponent"])] += 1
            tot = float(r["score"]) + float(r["theirScore"])
            r["share"] = 100.0 * float(r["score"]) / tot if tot else float("nan")
            r["band"] = band_of(r["role"])
            r["seed"] = int(r["seed"])
            kept.append(r)
    failing = sorted({o for (b, o), n in seen_all.items() if seen_ok.get((b, o), 0) == 0})
    return kept, dict(drops), failing


def mean(xs):
    xs = list(xs)
    return sum(xs) / len(xs) if xs else float("nan")


def sd(xs):
    xs = list(xs)
    if len(xs) < 2:
        return float("nan")
    m = mean(xs)
    return math.sqrt(sum((x - m) ** 2 for x in xs) / (len(xs) - 1))


def se(xs):
    xs = list(xs)
    return sd(xs) / math.sqrt(len(xs)) if len(xs) > 1 else float("nan")


def pearson(xs, ys):
    mx, my = mean(xs), mean(ys)
    sxy = sum((x - mx) * (y - my) for x, y in zip(xs, ys))
    sxx = sum((x - mx) ** 2 for x in xs)
    syy = sum((y - my) ** 2 for y in ys)
    return sxy / math.sqrt(sxx * syy) if sxx and syy else float("nan")


def per_opponent(rows, build, seeds=None):
    """opponent -> dict(share, n, band, rank, components...)"""
    acc = defaultdict(list)
    for r in rows:
        if r["build"] == build and (seeds is None or r["seed"] in seeds):
            acc[r["opponent"]].append(r)
    out = {}
    for o, rs in acc.items():
        d = {"share": mean(r["share"] for r in rs), "n": len(rs), "band": rs[0]["band"], "rank": rs[0]["rank"]}
        for c in COMPONENTS:
            d[c] = mean(float(r[c]) for r in rs)
            d["their_" + c] = mean(float(r["their" + c[0].upper() + c[1:]]) if "their" + c[0].upper() + c[1:] in r else float("nan") for r in rs)
        d["score"] = mean(float(r["score"]) for r in rs)
        d["theirScore"] = mean(float(r["theirScore"]) for r in rs)
        out[o] = d
    return out


def live_botdetails(path):
    out = {}
    with open(path, encoding="utf8", newline="") as f:
        for r in csv.DictReader(f):
            out[r["name"]] = float(r["aps"])
    return out


def live_botcompare(path):
    out = {}
    with open(path, encoding="utf8", newline="") as f:
        for r in csv.DictReader(f):
            out[r["name"]] = float(r["a_aps"])
    return out


def fmt(x, nd=2, sign=True):
    if x != x:
        return "n/a"
    return f"{x:+.{nd}f}" if sign else f"{x:.{nd}f}"


def ci(xs, nd=2):
    xs = list(xs)
    m, s = mean(xs), se(xs)
    return f"{fmt(m, nd)} ({fmt(m - 1.96 * s, nd)} to {fmt(m + 1.96 * s, nd)})"


def diffs(a, b, keys=None):
    keys = sorted((set(a) & set(b)) if keys is None else keys)
    return {k: a[k]["share"] - b[k]["share"] for k in keys}


def by_band(d, bandmap):
    out = defaultdict(list)
    for k, v in d.items():
        out[bandmap[k]].append(v)
    return out


def main():
    ap = argparse.ArgumentParser()
    ap.add_argument("--tail-rows", required=True)
    ap.add_argument("--top-rows", required=True)
    ap.add_argument("--null-rows", required=True)
    ap.add_argument("--tail-rounds", required=True)
    ap.add_argument("--top-rounds", required=True)
    ap.add_argument("--live-hadur", required=True, help="botdetails csv for Hadur 3.10")
    ap.add_argument("--live-tomcat", required=True, help="botcompare csv with Tomcat as a")
    ap.add_argument("--live-null", required=True, help="botcompare csv with Nullstride as a")
    ap.add_argument("--ledger-out", required=True)
    ap.add_argument("--keep-other-jvms", action="store_true", help="sensitivity run: keep rows whose otherJvms is above 0")
    args = ap.parse_args()

    rows, drops, failing = load_rows([args.tail_rows, args.top_rows], [args.tail_rounds, args.top_rounds], args.keep_other_jvms)
    nrows, ndrops, nfail = load_rows([args.null_rows], [], args.keep_other_jvms)
    print(f"Rows dropped (Tomcat and Hadur 3.10 steps): {drops}")
    print(f"Rows dropped (Nullstride step): {ndrops}")
    print(f"Opponents with no usable row: {failing}, Nullstride step: {nfail}\n")

    H = per_opponent(rows, HADUR)
    T = per_opponent(rows, TOMCAT)
    N = per_opponent(nrows, NULLSTRIDE)
    both = sorted(set(H) & set(T))
    bandmap = {o: H[o]["band"] for o in both}
    live_h, live_t, live_n = live_botdetails(args.live_hadur), live_botcompare(args.live_tomcat), live_botcompare(args.live_null)

    gap = {o: H[o]["share"] - T[o]["share"] for o in both}
    print(f"Opponents with Hadur and Tomcat rows: {len(both)}\n")
    live_keys = [o for o in both if o in live_h and o in live_t]
    live_gap = {o: live_h[o] - live_t[o] for o in live_keys}

    print("## Gap to Tomcat 3.68 by band (Hadur 3.10 minus Tomcat, score-share points)\n")
    print("| Band | Opponents | Hadur bench | Tomcat bench | Bench gap (95%) | Live gap | Bench minus live (95%) |")
    print("|---|---|---|---|---|---|---|")
    bg, lg = by_band(gap, bandmap), by_band(live_gap, bandmap)
    for b in BANDS + [0]:
        ks = [o for o in both if b == 0 or bandmap[o] == b]
        lk = [o for o in live_keys if b == 0 or bandmap[o] == b]
        name = "All" if b == 0 else BAND_NAMES[b]
        g = [gap[o] for o in ks]
        l = [live_gap[o] for o in lk]
        dl = [gap[o] - live_gap[o] for o in lk]
        print(f"| {name} | {len(ks)} | {mean(H[o]['share'] for o in ks):.2f} | {mean(T[o]['share'] for o in ks):.2f} | {ci(g)} | {fmt(mean(l))} | {ci(dl)} |")

    print("\n## G1: bench against live, per opponent\n")
    print("| Subject | Opponents | r bench vs live | Mean bench | Mean live |")
    print("|---|---|---|---|---|")
    for name, bench, live in [("Hadur 3.10", H, live_h), ("Tomcat 3.68", T, live_t), ("Nullstride 2.3.3", N, live_n)]:
        ks = [o for o in bench if o in live]
        print(f"| {name} | {len(ks)} | {pearson([bench[o]['share'] for o in ks], [live[o] for o in ks]):.3f} | {mean(bench[o]['share'] for o in ks):.2f} | {mean(live[o] for o in ks):.2f} |")
    print(f"\nr of the per-opponent gap, bench against live: {pearson([gap[o] for o in live_keys], [live_gap[o] for o in live_keys]):.3f} over {len(live_keys)} opponents")

    print("\n## M2: A/A test, seeds 1-2 against seeds 3-4 (Hadur minus Tomcat gap, half A minus half B)\n")
    HA, HB = per_opponent(rows, HADUR, {1, 2}), per_opponent(rows, HADUR, {3, 4})
    TA, TB = per_opponent(rows, TOMCAT, {1, 2}), per_opponent(rows, TOMCAT, {3, 4})
    ks = sorted(set(HA) & set(HB) & set(TA) & set(TB))
    ga = {o: HA[o]["share"] - TA[o]["share"] for o in ks}
    gb = {o: HB[o]["share"] - TB[o]["share"] for o in ks}
    aa = {o: ga[o] - gb[o] for o in ks}
    print("| Band | Opponents | Half A gap | Half B gap | A minus B (95%) | 2 x SE |")
    print("|---|---|---|---|---|---|")
    for b in BANDS + [0]:
        kk = [o for o in ks if b == 0 or bandmap[o] == b]
        name = "All" if b == 0 else BAND_NAMES[b]
        d = [aa[o] for o in kk]
        print(f"| {name} | {len(kk)} | {fmt(mean(ga[o] for o in kk))} | {fmt(mean(gb[o] for o in kk))} | {ci(d)} | {2 * se(d):.2f} |")

    print("\n## Score breakdown by band, per battle (mean over opponents)\n")
    print("| Band | Subject | Score | Their score | Bullet dmg | Their bullet dmg | Ram | Their ram | Survival | Their survival | Last-survivor bonus |")
    print("|---|---|---|---|---|---|---|---|---|---|---|")
    for b in BANDS + [0]:
        kk = [o for o in both if b == 0 or bandmap[o] == b]
        name = "All" if b == 0 else BAND_NAMES[b]
        for sname, D in [("Hadur 3.10", H), ("Tomcat 3.68", T)]:
            def m(key):
                return mean(D[o][key] for o in kk)
            print(f"| {name} | {sname} | {m('score'):.0f} | {m('theirScore'):.0f} | {m('bulletDamage'):.0f} | {m('their_bulletDamage'):.0f} | {m('ramDamage'):.0f} | {m('their_ramDamage'):.0f} | {m('survival'):.0f} | {m('their_survival'):.0f} | {m('lastSurvivorBonus'):.0f} |")

    print("\n## Ceiling: Nullstride 2.3.3 minus Hadur 3.10 and minus Tomcat, by band\n")
    print("| Band | Opponents | Nullstride bench | Nullstride minus Hadur (95%) | Nullstride minus Tomcat (95%) | Nullstride live minus Hadur live |")
    print("|---|---|---|---|---|---|")
    nh = {o: N[o]["share"] - H[o]["share"] for o in N if o in H}
    nt = {o: N[o]["share"] - T[o]["share"] for o in N if o in T}
    nl = {o: live_n[o] - live_h[o] for o in nh if o in live_n and o in live_h}
    for b in BANDS + [0]:
        kk = [o for o in nh if b == 0 or H[o]["band"] == b]
        name = "All" if b == 0 else BAND_NAMES[b]
        tt = [nt[o] for o in kk if o in nt]
        ll = [nl[o] for o in kk if o in nl]
        print(f"| {name} | {len(kk)} | {mean(N[o]['share'] for o in kk):.2f} | {ci([nh[o] for o in kk])} | {ci(tt)} | {fmt(mean(ll))} |")

    print("\n## Where the gap sits: band by Tomcat score bucket (contribution to the overall gap)\n")
    print("A cluster's contribution is its opponents' share of the census times its mean gap, in APS points; half A and half B use seeds 1-2 and 3-4.\n")
    print("| Band | Tomcat score bucket | Opponents | Mean gap | Contribution | Half A | Half B |")
    print("|---|---|---|---|---|---|---|")
    n_all = len(both)
    buckets = [("under 50", 0, 50), ("50 to 80", 50, 80), ("80 to 95", 80, 95), ("95 and over", 95, 101)]
    clusters = []
    for b in BANDS:
        for bn, lo, hi in buckets:
            kk = [o for o in ks if bandmap[o] == b and lo <= T[o]["share"] < hi]
            if not kk:
                continue
            c = len(kk) / n_all * mean(gap[o] for o in kk)
            ca = len(kk) / n_all * mean(ga[o] for o in kk)
            cb = len(kk) / n_all * mean(gb[o] for o in kk)
            clusters.append((b, bn, len(kk), mean(gap[o] for o in kk), c, ca, cb))
            print(f"| {BAND_NAMES[b]} | {bn} | {len(kk)} | {fmt(mean(gap[o] for o in kk))} | {fmt(c, 3)} | {fmt(ca, 3)} | {fmt(cb, 3)} |")

    print()
    print("## Score breakdown inside the largest negative clusters (Hadur 3.10 minus Tomcat, per battle)")
    print()
    print("| Band | Tomcat score bucket | Opponents | Score share | Bullet dmg dealt | Bullet dmg taken | Ram dealt | Ram taken | Survival | Their survival | Last-survivor bonus |")
    print("|---|---|---|---|---|---|---|---|---|---|---|")
    for b, bn, n, g, c, ca, cb in clusters:
        if ca <= -0.10 and cb <= -0.10:
            lo, hi = [(l, h) for name, l, h in buckets if name == bn][0]
            kk = [o for o in ks if bandmap[o] == b and lo <= T[o]["share"] < hi]
            def dm(key):
                return mean(H[o][key] - T[o][key] for o in kk)
            print(f"| {BAND_NAMES[b]} | {bn} | {n} | {fmt(g)} | {dm('bulletDamage'):+.0f} | {dm('their_bulletDamage'):+.0f} | {dm('ramDamage'):+.0f} | {dm('their_ramDamage'):+.0f} | {dm('survival'):+.0f} | {dm('their_survival'):+.0f} | {dm('lastSurvivorBonus'):+.0f} |")

    cols = ["opponent", "rank", "band", "n_hadur", "n_tomcat", "hadur_share", "tomcat_share", "gap", "gap_half_a", "gap_half_b",
            "live_gap", "nullstride_share", "d_bulletDamage", "d_their_bulletDamage", "d_ramDamage", "d_their_ramDamage", "d_survival", "d_lastSurvivorBonus"]
    with open(args.ledger_out, "w", encoding="utf8", newline="") as f:
        w = csv.writer(f, delimiter="\t", lineterminator="\n")
        w.writerow(cols)
        for o in sorted(both, key=lambda k: (H[k]["band"], int(H[k]["rank"] or 0))):
            w.writerow([o, H[o]["rank"], H[o]["band"], H[o]["n"], T[o]["n"], f"{H[o]['share']:.2f}", f"{T[o]['share']:.2f}", f"{gap[o]:.2f}",
                        f"{ga[o]:.2f}" if o in ga else "", f"{gb[o]:.2f}" if o in gb else "",
                        f"{live_gap[o]:.2f}" if o in live_gap else "", f"{N[o]['share']:.2f}" if o in N else "",
                        f"{H[o]['bulletDamage'] - T[o]['bulletDamage']:.0f}", f"{H[o]['their_bulletDamage'] - T[o]['their_bulletDamage']:.0f}",
                        f"{H[o]['ramDamage'] - T[o]['ramDamage']:.0f}", f"{H[o]['their_ramDamage'] - T[o]['their_ramDamage']:.0f}",
                        f"{H[o]['survival'] - T[o]['survival']:.0f}", f"{H[o]['lastSurvivorBonus'] - T[o]['lastSurvivorBonus']:.0f}"])
    print(f"\nLedger: {args.ledger_out} ({len(both)} opponents)", file=sys.stderr)


if __name__ == "__main__":
    main()
