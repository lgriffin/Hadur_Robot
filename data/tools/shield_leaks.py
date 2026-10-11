#!/usr/bin/env python3
"""Shield-mode reading of bench runs: what each build's shield lets through (plan-90 steps 1-2).

    python3 data/tools/shield_leaks.py --set hadur-bench/shield-listed.txt \\
        --baseline 3.12=hadur-bench/work/s1-3.12 \\
        3.12sh=hadur-bench/work/s1-3.12sh 3.12sn=hadur-bench/work/s1-3.12sn [--out FILE.md]

Each LABEL=WORKDIR is one bench run of a build (cold, one opponent a battle). For every battle
under WORKDIR/battles/<slug>-<seed> it reads result.csv (score share), rounds.tsv (damage
taken per round, rounds lost) and hadur.log: the shield records SH (on, exit, off), SR (round)
and SB (each bullet that hit us while the opponent is listed, with why it got through: off,
nowave, missed, first, unshielded; SHIELD-8 to SHIELD-12 notes in docs/requirements.md).

Per build: score share, zero-damage rounds, damage taken a round, rounds lost, the SB classes
per battle, round exits and battle exits. With --baseline, each other build's paired difference
in score share: per opponent the mean over seeds both ran, then the mean over opponents with a
95% normal interval, by band and in APS over the whole field (the set's robots are a share of
the 1,217 pairings: APS = sum of differences / 1,217).

Standard library only.
"""
import argparse, collections, csv, math, os, re, statistics as st

FIELD = 1217

ap = argparse.ArgumentParser(description=__doc__.splitlines()[0])
ap.add_argument("runs", nargs="+", help="LABEL=WORKDIR")
ap.add_argument("--baseline", help="LABEL=WORKDIR of the build the others are paired with")
ap.add_argument("--set", required=True)
ap.add_argument("--out")
a = ap.parse_args()


def slug(name):
    return re.sub(r"[^A-Za-z0-9.]+", "_", name)


roles = {}
for line in open(a.set, encoding="utf8"):
    p = [x.strip() for x in line.split("|")]
    if len(p) >= 2 and not line.startswith("#"):
        roles[slug(p[0])] = (p[0], p[1])


def read_run(work):
    """{(opponent, seed): battle dict} for one work directory."""
    out = {}
    bdir = os.path.join(work, "battles")
    if not os.path.isdir(bdir):
        return out
    for d in os.listdir(bdir):
        m = re.match(r"^(.*)-(\d+)$", d)
        if not m or m.group(1) not in roles:
            continue
        name = roles[m.group(1)][0]
        path = os.path.join(bdir, d)
        res = os.path.join(path, "result.csv")
        if not os.path.isfile(res):
            continue
        rows = list(csv.DictReader(open(res, encoding="utf8")))
        if not rows or rows[0].get("ok") != "true":
            continue
        r = rows[0]
        score, theirs = float(r["score"]), float(r["theirScore"])
        b = {"share": 100 * score / (score + theirs) if score + theirs > 0 else float("nan"),
             "rounds": 0, "zero": 0, "lost": 0, "taken": 0.0, "sb": collections.Counter(),
             "exits": collections.Counter(), "off": collections.Counter(), "on": 0,
             "skips": int(float(r.get("skippedTurns") or 0))}
        rt = os.path.join(path, "rounds.tsv")
        if os.path.isfile(rt):
            for rr in csv.DictReader(open(rt, encoding="utf8"), delimiter="\t"):
                b["rounds"] += 1
                t = float(rr["damageTaken"] or 0)
                b["taken"] += t
                b["zero"] += t == 0
                b["lost"] += rr["won"] != "1"
        log = os.path.join(path, "hadur.log")
        if os.path.isfile(log):
            for line in open(log, encoding="utf8", errors="replace"):
                f = line.rstrip("\n").split(",")
                if len(f) < 3:
                    continue
                f = f[2:]
                if f[0] == "SB" and len(f) >= 7:
                    b["sb"][f[3]] += 1
                elif f[0] == "SH" and len(f) >= 4:
                    if f[3] == "on":
                        b["on"] += 1
                    elif f[3] == "exit" and len(f) >= 5:
                        b["exits"][f[4]] += 1
                    elif f[3] == "off" and len(f) >= 5:
                        b["off"][f[4]] += 1
        out[(name, int(m.group(2)))] = b
    return out


def parse(spec):
    label, _, work = spec.partition("=")
    return label, work


runs = [parse(s) for s in a.runs]
base = parse(a.baseline) if a.baseline else None
allruns = ([base] if base else []) + runs
data = {label: read_run(work) for label, work in allruns}

lines = []
w = lines.append
w("| Build | Battles | Score share | Zero-damage rounds | Damage taken a round | Rounds lost of 35 "
  "| Skipped turns a battle |")
w("|---|---|---|---|---|---|---|")
for label, _ in allruns:
    bs = list(data[label].values())
    if not bs:
        w(f"| {label} | 0 | | | | | |")
        continue
    rounds = sum(b["rounds"] for b in bs)
    w(f"| {label} | {len(bs)} | {st.mean(b['share'] for b in bs):.1f}% "
      f"| {100 * sum(b['zero'] for b in bs) / max(1, rounds):.0f}% "
      f"| {sum(b['taken'] for b in bs) / max(1, rounds):.1f} "
      f"| {35 * sum(b['lost'] for b in bs) / max(1, rounds):.2f} "
      f"| {st.mean(b['skips'] for b in bs):.1f} |")

w("")
w("Bullets that hit us while the opponent is listed, per battle, by why they got through (SB):")
w("")
classes = ["first", "unshielded", "missed", "nowave", "off"]
w("| Build | " + " | ".join(classes) + " | Round exits a battle | Battle exits |")
w("|---|" + "---|" * len(classes) + "---|---|")
for label, _ in allruns:
    bs = list(data[label].values())
    if not bs:
        continue
    n = len(bs)
    sb = collections.Counter()
    ex = collections.Counter()
    off = collections.Counter()
    for b in bs:
        sb.update(b["sb"])
        ex.update(b["exits"])
        off.update(b["off"])
    exits = ", ".join(f"{k} {v / n:.1f}" for k, v in ex.most_common()) or "none"
    offs = ", ".join(f"{k} {v}" for k, v in off.most_common()) or "none"
    w(f"| {label} | " + " | ".join(f"{sb[c] / n:.1f}" for c in classes) + f" | {exits} | {offs} |")

if base:
    blabel = base[0]
    w("")
    w(f"Paired against {blabel}: per opponent the mean over the seeds both ran, then over opponents "
      f"(95% normal interval). APS is the sum of the differences over the field's {FIELD} pairings.")
    w("")
    w("| Build | Opponents | Mean diff (pp) | 95% interval | APS | Opponents up / down | By band (pp) |")
    w("|---|---|---|---|---|---|---|")
    band_of = {v[0]: (v[1].split("-")[1] if "-" in v[1] else v[1]) for v in roles.values()}
    for label, _ in runs:
        diffs = {}
        for (opp, seed), b in data[label].items():
            o = data[blabel].get((opp, seed))
            if o is None or math.isnan(b["share"]) or math.isnan(o["share"]):
                continue
            diffs.setdefault(opp, []).append(b["share"] - o["share"])
        per = {k: st.mean(v) for k, v in diffs.items()}
        if len(per) < 2:
            w(f"| {label} | {len(per)} | | | | | |")
            continue
        vals = list(per.values())
        m = st.mean(vals)
        ci = 1.96 * st.stdev(vals) / math.sqrt(len(vals))
        aps = sum(vals) / FIELD
        aps_ci = ci * len(vals) / FIELD
        bands = collections.defaultdict(list)
        for k, v in per.items():
            bands[band_of.get(k, "?")].append(v)
        bandtxt = ", ".join(f"{k} {st.mean(v):+.1f} ({len(v)})" for k, v in sorted(bands.items()))
        up = sum(v > 0 for v in vals)
        w(f"| {label} | {len(vals)} | {m:+.2f} | {m - ci:+.2f} to {m + ci:+.2f} | {aps:+.3f} ± {aps_ci:.3f} "
          f"| {up} / {len(vals) - up} | {bandtxt} |")

text = "\n".join(lines) + "\n"
print(text)
if a.out:
    open(a.out, "w", encoding="utf8").write(text)
