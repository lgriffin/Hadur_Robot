#!/usr/bin/env python3
"""Read the movement lab: damage Hadur takes from each reference shooter, per movement variant.

    python3 data/tools/move_lab.py base=hadur-bench/work/lab-silent heat=hadur-bench/work/lab-heat \\
        [--set hadur-bench/lab-panel.txt] [--build "hadur2.Hadur 3.13si"]

Each argument is LABEL=WORKDIR, a hadur-bench work directory (its rounds.tsv, and the result.csv of each
battle under battles/ for the shooter's hit rate). Hadur's gun is off in the lab, so the score is the
damage it takes (docs/bench/move-lab.md). Per opponent in the set file, per label: damage taken per
round, rounds survived, and the shooter's hit rate (result.csv theirHitRate, mean over battles).
With exactly two labels the second minus the first is added: per opponent, the mean over the seeds
both fought of the battles' damage per round (and survival), with a 95% interval from Student's t over
those seeds, plus an "All" row over the opponents' means. Negative damage means the second label is
the better mover. Standard library only; prints a markdown table.
"""
import argparse
import csv
import math
import os
import re
import statistics as st
import sys

# Student's t, two-sided 95%, by degrees of freedom (the lab fights a handful of seeds).
T95 = {1: 12.706, 2: 4.303, 3: 3.182, 4: 2.776, 5: 2.571, 6: 2.447, 7: 2.365, 8: 2.306, 9: 2.262,
       10: 2.228, 11: 2.201, 12: 2.179, 13: 2.160, 14: 2.145, 15: 2.131, 16: 2.120, 17: 2.110,
       18: 2.101, 19: 2.093, 20: 2.086, 25: 2.060, 30: 2.042, 40: 2.021, 60: 2.000, 120: 1.980}

_SLUG_RUN = re.compile(r"[^A-Za-z0-9.]+")


def slug(name):
    """hadur.bench.Opponent.slug(): runs of characters outside [A-Za-z0-9.] become one "_"."""
    return _SLUG_RUN.sub("_", name)


def t95(df):
    if df < 1:
        return float("nan")
    if df in T95:
        return T95[df]
    keys = [k for k in sorted(T95) if k <= df]
    return T95[keys[-1]] if df < 120 else 1.96


def load_set(path):
    """[(name, role)] in the order of a set file's opponent lines (`name version | role | jar`)."""
    out = []
    with open(path, encoding="utf-8") as f:
        for line in f:
            line = line.strip()
            if not line or line.startswith("#"):
                continue
            p = [c.strip() for c in line.split("|")]
            out.append((p[0], p[1] if len(p) > 1 else ""))
    return out


def read_tsv(path):
    with open(path, newline="", encoding="utf-8") as f:
        return list(csv.DictReader(f, delimiter="\t"))


def read_workdir(work, names, build=None):
    """{opponent: {seed: dict(damage=mean damageTaken per round, survived=mean survived, rounds=n,
    theirHit=shooter hit rate or None)}} for the opponents in `names` (the battles of one build)."""
    rows = []
    top = os.path.join(work, "rounds.tsv")
    if os.path.isfile(top):
        rows = read_tsv(top)
    else:
        bdir = os.path.join(work, "battles")
        for d in sorted(os.listdir(bdir)) if os.path.isdir(bdir) else []:
            p = os.path.join(bdir, d, "rounds.tsv")
            if os.path.isfile(p) and not d.endswith("-baseline"):
                rows += read_tsv(p)
    # Which battle directory holds each (opponent, seed): the bench names them 1, 2, ... per
    # opponent, while the rounds carry the seed itself (301, ...).
    dirs = {}
    bdir = os.path.join(work, "battles")
    for d in sorted(os.listdir(bdir)) if os.path.isdir(bdir) else []:
        p = os.path.join(bdir, d, "rounds.tsv")
        if os.path.isfile(p) and not d.endswith("-baseline"):
            first = read_tsv(p)[:1]
            if first:
                dirs[(first[0]["opponent"], first[0]["seed"])] = d
    builds = sorted({r["build"] for r in rows})
    if build is None and len(builds) > 1:
        raise SystemExit(f"{work}: rounds of several builds {builds}; pick one with --build")
    wanted = set(names)
    by = {}
    for r in rows:
        if (build and r["build"] != build) or r["opponent"] not in wanted:
            continue
        by.setdefault(r["opponent"], {}).setdefault(r["seed"], []).append(r)
    out = {}
    for opp, seeds in by.items():
        for seed, rs in seeds.items():
            out.setdefault(opp, {})[seed] = dict(
                damage=st.mean(float(r["damageTaken"]) for r in rs),
                survived=st.mean(float(r["survived"]) for r in rs),
                rounds=len(rs),
                theirHit=their_hit_rate(work, opp, seed, dirs.get((opp, seed))))
    return out


def their_hit_rate(work, opp, seed, battle_dir=None):
    """theirHitRate of the battle's result.csv (the shooter's hits over its shots), or None."""
    p = os.path.join(work, "battles", battle_dir or f"{slug(opp)}-{seed}", "result.csv")
    try:
        with open(p, newline="", encoding="utf-8") as f:
            rows = list(csv.DictReader(f))
        if rows and rows[0].get("ok") == "true" and rows[0].get("theirHitRate") not in (None, ""):
            return float(rows[0]["theirHitRate"])
    except (OSError, ValueError):
        pass
    return None


def mean_ci(xs):
    """(mean, half-width of the 95% interval, n); half-width NaN below two values."""
    n = len(xs)
    if n == 0:
        return float("nan"), float("nan"), 0
    m = st.mean(xs)
    if n < 2:
        return m, float("nan"), n
    return m, t95(n - 1) * st.stdev(xs) / math.sqrt(n), n


def summary(seeds):
    """One label's opponent: damage per round, survival %, shooter hit rate %, battles."""
    if not seeds:
        return None
    hits = [v["theirHit"] for v in seeds.values() if v["theirHit"] is not None]
    return dict(damage=st.mean(v["damage"] for v in seeds.values()),
                survived=100 * st.mean(v["survived"] for v in seeds.values()),
                hit=100 * st.mean(hits) if hits else None, n=len(seeds))


def paired(a, b):
    """Per common seed, b minus a: ([damage differences], [survival differences in points],
    [shooter hit-rate differences in points, where both battles report one])."""
    common = sorted(set(a) & set(b))
    return ([b[s]["damage"] - a[s]["damage"] for s in common],
            [100 * (b[s]["survived"] - a[s]["survived"]) for s in common],
            [100 * (b[s]["theirHit"] - a[s]["theirHit"]) for s in common
             if a[s]["theirHit"] is not None and b[s]["theirHit"] is not None])


def pm(m, h, digits=1):
    if m != m:
        return "-"
    return f"{m:+.{digits}f}" + (f" ± {h:.{digits}f}" if h == h else " (n=1)")


def table(labels, data, panel):
    """Markdown lines for the labels' {opponent: {seed: ...}} dicts over the panel [(name, role)]."""
    two = len(labels) == 2
    head = ["Opponent"]
    for lab in labels:
        head += [f"{lab} dmg/round", f"{lab} survived %", f"{lab} their hit %"]
    if two:
        head += ["Seeds", f"{labels[1]} − {labels[0]} their hit % (95% CI)",
                 "dmg/round", "Survived (pp)"]
    lines = ["| " + " | ".join(head) + " |", "|" + "---|" * len(head)]
    dmg_means, surv_means, hit_means = [], [], []
    for name, _role in panel:
        cells = [name]
        for lab in labels:
            s = summary(data[lab].get(name))
            if s is None:
                cells += ["-", "-", "-"]
            else:
                cells += [f"{s['damage']:.1f}", f"{s['survived']:.0f}",
                          "-" if s["hit"] is None else f"{s['hit']:.1f}"]
        if two:
            dd, sd, hd = paired(data[labels[0]].get(name, {}), data[labels[1]].get(name, {}))
            m, h, n = mean_ci(dd)
            ms, hs, _ = mean_ci(sd)
            mh, hh, nh = mean_ci(hd)
            if n:
                dmg_means.append(m)
                surv_means.append(ms)
            if nh:
                hit_means.append(mh)
            cells += [str(n), pm(mh, hh, 2) if nh else "-", pm(m, h), pm(ms, hs, 0)]
        lines.append("| " + " | ".join(cells) + " |")
    if two and dmg_means:
        m, h, n = mean_ci(dmg_means)
        ms, hs, _ = mean_ci(surv_means)
        mh, hh, nh = mean_ci(hit_means)
        lines.append("| **All, over the opponents' means** |" + " |" * (3 * len(labels))
                     + f" {n} opponents | {pm(mh, hh, 2) if nh else '-'} | {pm(m, h)} | {pm(ms, hs, 0)} |")
    return lines


def main(argv=None):
    ap = argparse.ArgumentParser(description=__doc__.splitlines()[0])
    ap.add_argument("runs", nargs="+", metavar="LABEL=WORKDIR")
    ap.add_argument("--set", default="hadur-bench/lab-panel.txt", help="the set file naming the opponents")
    ap.add_argument("--build", default=None, help="the robot name to read when a rounds.tsv holds several")
    a = ap.parse_args(argv)
    labels, dirs = [], []
    for r in a.runs:
        if "=" not in r:
            ap.error(f"{r}: expected LABEL=WORKDIR")
        lab, d = r.split("=", 1)
        if lab in labels:
            ap.error(f"label {lab} given twice")
        if not os.path.isdir(d):
            ap.error(f"{d}: not a directory")
        labels.append(lab)
        dirs.append(d)
    panel = load_set(a.set)
    names = [n for n, _ in panel]
    data = {lab: read_workdir(d, names, a.build) for lab, d in zip(labels, dirs)}
    print("\n".join(table(labels, data, panel)))
    if len(labels) == 2:
        print("\nDifferences are second minus first, paired on the seeds both fought; damage is Hadur's "
              "damageTaken per round, so negative means the second moves better. Intervals use Student's t.")
    return 0


if __name__ == "__main__":
    sys.exit(main())
