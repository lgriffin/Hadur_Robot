#!/usr/bin/env python3
"""Break a kitlab bot's score-share gap to a reference into its parts (docs/bench/live-kitlab-0.2.md).

  python3 tools/kitlab_gap.py SET RUN_DIR REF_DIR [OTHER_DIR ...]

For each opponent group (the set file's role, e.g. `weak-nano:1`) and each run it prints, per
35-round battle averaged over seeds: score share, rounds won, damage taken per round (their bullet
plus ram damage), damage dealt per round, ticks per round, and the opponent's score per round
split into survival+bonus and damage. The share gap to REF is then split into what the opponent
scores (their side) and what we score (our side).
"""
import csv
import glob
import os
import statistics as st
import sys


def load_set(path):
    rows = []
    for line in open(path):
        if not line.strip() or line.lstrip().startswith("#"):
            continue
        name, role, jar = [c.strip() for c in line.split("|")][:3]
        rows.append((name, role.split(":")[0], jar[:-4]))
    return rows


def battles(run):
    out = {}
    for f in glob.glob(os.path.join(run, "battles", "*", "result.csv")):
        stem = os.path.basename(os.path.dirname(f)).rsplit("-", 1)[0]
        for r in csv.DictReader(open(f)):
            if r["ok"] == "true":
                out.setdefault(stem, []).append(r)
    return out


def metrics(rs):
    def per(k):
        return st.mean(float(r[k]) / float(r["rounds"]) for r in rs)
    s = st.mean(100 * float(r["score"]) / (float(r["score"]) + float(r["theirScore"])) for r in rs)
    return {
        "share": s,
        "won": st.mean(100 * float(r["firsts"]) / float(r["rounds"]) for r in rs),
        "taken": per("theirBulletDamage") + per("theirRamDamage"),
        "rammed": per("theirRamDamage"),
        "dealt": per("bulletDamage") + per("ramDamage"),
        "ticks": st.mean(float(r["engineRoundTicks"]) for r in rs),
        "ours": per("score"),
        "theirs": per("theirScore"),
        "theirDmg": per("theirBulletDamage") + per("theirRamDamage") + per("theirBulletDamageBonus") + per("theirRamDamageBonus"),
    }


def main(setp, *runs):
    rows = load_set(setp)
    data = [battles(r) for r in runs]
    groups = sorted({g for _, g, _ in rows}) + ["all"]
    keys = ["share", "won", "taken", "rammed", "dealt", "ticks", "ours", "theirs", "theirDmg"]
    for g in groups:
        stems = [j for _, gg, j in rows if g in ("all", gg) and all(j in d for d in data)]
        print(f"\n== {g} ({len(stems)} bots)")
        print("%-28s" % "run" + "".join("%9s" % k for k in keys))
        means = []
        for run, d in zip(runs, data):
            m = {k: st.mean(metrics(d[s])[k] for s in stems) for k in keys}
            means.append(m)
            print("%-28s" % os.path.basename(run) + "".join("%9.2f" % m[k] for k in keys))
        ref = means[1]
        m0 = means[0]
        print("%-28s" % "first - ref" + "".join("%9.2f" % (m0[k] - ref[k]) for k in keys))
    print("\nper opponent (share first, ref, others; won; taken)")
    for name, g, j in rows:
        if all(j in d for d in data):
            ms = [metrics(d[j]) for d in data]
            print("%-36s %-9s %s | won %s | taken %s" % (name, g, " ".join("%5.1f" % m["share"] for m in ms),
                  " ".join("%5.1f" % m["won"] for m in ms), " ".join("%5.1f" % m["taken"] for m in ms)))


if __name__ == "__main__":
    main(*sys.argv[1:])
