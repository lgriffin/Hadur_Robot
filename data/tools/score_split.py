#!/usr/bin/env python3
"""Where Hadur's score share goes, per segment, against ScalarR and Diamond (docs/plan-top5.md).

  python3 data/tools/score_split.py [--repo .] [--out FILE.md]

Reads the same census rows as census_joint.py (3.13 from pc-1018-stack, ScalarR and Diamond from
plan90, all cold, 35 rounds x 4 seeds) and splits each segment's score-share gap two ways:

  sides     how much of the gap is our own score and how much is the opponent's: the share
            s / (s + t) with Hadur's s swapped for ScalarR's, then t. The two parts sum to the gap.
  exposure  the damage taken per round, as damage per tick times ticks per round: how much of the
            excess is taken per tick (dodging) and how much is rounds lasting longer (kill speed).
  Round-0 engine disables are not counted here: the per-round rows record a round won and then
  disabled in the post-round wait as lost (docs/bench/local/2026-10-21_round0-skips.md), so
  hadur-bench/tools/round0_skips.py reads them from the logs instead.

Segments are census_joint's: A rammers, C the 88 large losses (hadur-bench/panel-large-losses.txt),
B ranks 401+ split at 800, D ranks 51-400, E the top 50. Standard library only.
"""

import argparse
import csv
import os
import statistics as st
import sys
from collections import defaultdict

import census_joint as cj

HADUR = ("data/bench/2026-10-18_hadur-pc-1018-stack-census-local_cold.tsv", "hadur2.Hadur 3.13")
REFS = (("ScalarR", "data/bench/2026-10-12_hadur-plan90-census-scalarr-local_cold.tsv"),
        ("Diamond", "data/bench/2026-10-12_hadur-plan90-census-diamond-local_cold.tsv"))
GROUPS = (("A", "rammers"), ("B401", "ranks 401-800, the rest"), ("B801", "ranks 801+, the rest"),
          ("C", "large losses"), ("D", "ranks 51-400, the rest"), ("E", "ranks 1-50, the rest"))
OURS = ("survival", "bulletDamage", "bulletDamageBonus", "lastSurvivorBonus", "ramDamage", "ramDamageBonus")
THEIRS = tuple("their" + f[0].upper() + f[1:] for f in OURS)
FIELDS = ("score", "theirScore", "firsts") + OURS + THEIRS


def share(s, t):
    return 100 * s / (s + t)


def sides(s_h, t_h, s_r, t_r):
    """(our side, their side) of share(s_r, t_r) - share(s_h, t_h); they sum to the gap."""
    mid = share(s_r, t_h)
    return mid - share(s_h, t_h), share(s_r, t_r) - mid


def exposure(ticks_h, rate_h, ticks_r, rate_r):
    """(per tick, round length) parts of ticks_h * rate_h - ticks_r * rate_r."""
    return ticks_r * (rate_h - rate_r), (ticks_h - ticks_r) * rate_h


def group(opp, classes, large):
    seg = cj.segment(opp, classes, large)
    if seg == "B":
        return "B401" if int(classes[opp]["rank"]) <= 800 else "B801"
    return seg


def battles(repo, path, build):
    d = defaultdict(lambda: defaultdict(list))
    for r in cj.git_rows(repo, path):
        if (build and r["build"] != build) or r["ok"] != "true":
            continue
        for f in FIELDS:
            d[cj.base(r["opponent"])][f].append(float(r[f]))
    return {o: {f: st.mean(v) for f, v in fs.items()} for o, fs in d.items()}


def rounds(repo, path, build):
    d = defaultdict(lambda: defaultdict(list))
    for r in cj.git_rows(repo, path.replace("_cold.tsv", "_cold_rounds.tsv")):
        if build and r["build"] != build:
            continue
        for f in ("ticks", "damageDealt", "damageTaken"):
            try:
                d[cj.base(r["opponent"])][f].append(float(r[f]))
            except ValueError:
                pass
    return {o: {f: st.mean(v) for f, v in fs.items()} for o, fs in d.items()}


def main(argv=None):
    ap = argparse.ArgumentParser()
    ap.add_argument("--repo", default=os.path.join(os.path.dirname(os.path.abspath(__file__)), "..", ".."))
    ap.add_argument("--out")
    a = ap.parse_args(argv)
    repo = os.path.abspath(a.repo)
    classes = {cj.base(r["opponent"]): r for r in csv.DictReader(
        open(os.path.join(repo, "docs/bench/local/2026-10-18_census-classes.tsv"), encoding="utf-8"), delimiter="\t")}
    large = {cj.base(l.split(" | ")[0]) for l in open(os.path.join(repo, "hadur-bench/panel-large-losses.txt"), encoding="utf-8")
             if l.strip() and not l.startswith("#")}
    bat = {"Hadur": battles(repo, *HADUR)}
    rnd = {"Hadur": rounds(repo, *HADUR)}
    for name, path in REFS:
        bat[name], rnd[name] = battles(repo, path, None), rounds(repo, path, None)
    n_all = len(bat["Hadur"])
    members = defaultdict(list)
    for o in classes:
        if all(o in b for b in bat.values()) and all(o in r for r in rnd.values()):
            members[group(o, classes, large)].append(o)

    def mean(src, who, opps, f):
        return st.mean(src[who][o][f] for o in opps)

    out = ["# Score split: Hadur 3.13 against ScalarR and Diamond, per segment", "",
           "Cold censuses, 35 rounds x 4 seeds: 3.13 from pc-1018-stack, ScalarR 0.005h.053-noshield and",
           "Diamond 1.8.22 from plan90. Written by `data/tools/score_split.py`. APS = pp x bots / " + str(n_all) + ".", "",
           "| Segment | Bots | Share Hadur | ScalarR | Diamond | Gap to ScalarR (APS) | Our score side | Their score side "
           "| Their score, Hadur / ScalarR | Their bullet dmg | Their survival | Hadur deaths a battle (ScalarR) "
           "| Ticks a round | Taken a round | Excess from per tick | Excess from round length |",
           "|---|---|---|---|---|---|---|---|---|---|---|---|---|---|---|---|"]
    for g, label in GROUPS:
        opps = members[g]
        if not opps:
            continue
        sh = {w: st.mean(share(bat[w][o]["score"], bat[w][o]["theirScore"]) for o in opps) for w in bat}
        parts = [sides(bat["Hadur"][o]["score"], bat["Hadur"][o]["theirScore"],
                       bat["ScalarR"][o]["score"], bat["ScalarR"][o]["theirScore"]) for o in opps]
        ours, theirs = (sum(p[i] for p in parts) / n_all for i in (0, 1))
        tk = {w: mean(rnd, w, opps, "ticks") for w in rnd}
        taken = {w: mean(rnd, w, opps, "damageTaken") for w in rnd}
        per_tick, length = exposure(tk["Hadur"], taken["Hadur"] / tk["Hadur"], tk["ScalarR"], taken["ScalarR"] / tk["ScalarR"])
        out.append(f"| {g} {label} | {len(opps)} | {sh['Hadur']:.2f} | {sh['ScalarR']:.2f} | {sh['Diamond']:.2f} "
                   f"| {ours + theirs:+.3f} | {ours:+.3f} | {theirs:+.3f} "
                   f"| {mean(bat, 'Hadur', opps, 'theirScore'):.0f} / {mean(bat, 'ScalarR', opps, 'theirScore'):.0f} "
                   f"| {mean(bat, 'Hadur', opps, 'theirBulletDamage'):.0f} / {mean(bat, 'ScalarR', opps, 'theirBulletDamage'):.0f} "
                   f"| {mean(bat, 'Hadur', opps, 'theirSurvival'):.0f} / {mean(bat, 'ScalarR', opps, 'theirSurvival'):.0f} "
                   f"| {35 - mean(bat, 'Hadur', opps, 'firsts'):.2f} ({35 - mean(bat, 'ScalarR', opps, 'firsts'):.2f}) "
                   f"| {tk['Hadur']:.0f} / {tk['ScalarR']:.0f} | {taken['Hadur']:.1f} / {taken['ScalarR']:.1f} "
                   f"| {per_tick:+.1f} | {length:+.1f} |")
    text = "\n".join(out) + "\n"
    print(text)
    if a.out:
        with open(a.out, "w", encoding="utf-8") as f:
            f.write(text)
    return 0


if __name__ == "__main__":
    sys.exit(main())
