#!/usr/bin/env python3
"""All the 1v1 censuses read together (docs/plan-top5.md).

  python3 data/tools/census_joint.py [--repo .] [--out FILE.json] [--perms 2000]

Reads, from the repository:
  - the four PC censuses of census-312 that carry Hadur 3.13 as one arm, from their per-opponent
    reports (docs/bench/local/<run>/<opponent>.md, the "Battles" table): the 3.13 gate run
    (3.13 against 3.12) and the three paired runs against the 3.13 release (pc-1018-stack,
    pc-midrange-census, pc-midrange-census-2). 3.13 therefore has 16 battles per opponent in
    four independent runs, which is an A/A test of the bench;
  - the reference censuses of Diamond 1.8.22, ScalarR 0.005h.053-noshield (plan90) and
    Nullstride 2.3.3 (census-311), and the 3.13 rows of pc-1018-stack, from data/bench rows
    files and their _rounds.tsv;
  - the live BotDetails pages of 3.13 and the robots above it (data/rumble/parsed);
  - census_classify's classes (docs/bench/local/2026-10-18_census-classes.tsv).

Writes one JSON with every number docs/plan-top5.md quotes, and prints a short summary:
  aa       APS of each 3.13 run, their pairwise differences, a permutation test of "the four
           runs differ by more than their seeds" (labels shuffled within each opponent),
           the seed and run variance components
  cands    each candidate against its own baseline and against the pooled 16 battles of 3.13,
           per band and per segment, and how well per-opponent effects repeat across them
  gap      the live gap of each robot above Hadur, per band and per segment (A rammers,
           B ranks 401+, C the large single-bot losses, D ranks 51-400, E ranks 1-50)
  curves   damage taken per round by round bucket, Hadur and the references, per band
  calib    the local bench against the live pages, per opponent

Opponents are matched by name without the version. Standard library only.
"""

import argparse
import csv
import json
import math
import os
import random
import re
import statistics as st
import subprocess
import sys
from collections import defaultdict

RUNS = (  # label, report directory, candidate, baseline
    ("gate", "2026-10-13_plan90-gate-census", "3.13", "3.12"),
    ("stack", "2026-10-18_pc-1018-stack-census", "3.13hjsw", "3.13"),
    ("mid1", "2026-10-20_pc-midrange-census", "3.14hjswhcpkw2", "3.13"),
    ("mid2", "2026-10-21_pc-midrange-census-2", "3.14hjswthfgnkxl", "3.13"),
)
BANDS = ((1, 10), (11, 50), (51, 200), (201, 400), (401, 700), (701, 10 ** 6))
SEGMENTS = {"A": "rammers", "B": "ranks 401+, the rest", "C": "large single-bot losses",
            "D": "ranks 51-400, the rest", "E": "ranks 1-50, the rest"}
PHASES = ((0, 0), (1, 2), (3, 5), (6, 9), (10, 14), (15, 24), (25, 34))
LIVE = "data/rumble/parsed/"
PEERS = (("DrussGT", "jk.mega.DrussGT_3.1.16"), ("Saguaro", "oog.mega.saguaro.Saguaro_1.0"),
         ("ScalarR", "aaa.r.ScalarR_0.005h.053-noshield"), ("Diamond", "voidious.Diamond_1.8.22"),
         ("Nullstride", "jd.Nullstride_2.3.3"), ("BeepBoop", "kc.mega.BeepBoop_2.0"))
REFS = (("Hadur 3.13", "data/bench/2026-10-18_hadur-pc-1018-stack-census-local_cold.tsv", "hadur2.Hadur 3.13"),
        ("Diamond", "data/bench/2026-10-12_hadur-plan90-census-diamond-local_cold.tsv", None),
        ("ScalarR", "data/bench/2026-10-12_hadur-plan90-census-scalarr-local_cold.tsv", None),
        ("Nullstride", "data/bench/2026-10-09_hadur-census-311-nullstride-local_cold.tsv", None))


def base(name):
    """An opponent's name without its version."""
    return name.rsplit(" ", 1)[0]


def band_of(rank):
    for i, (lo, hi) in enumerate(BANDS):
        if lo <= rank <= hi:
            return i + 1
    return None


def pct(cell):
    cell = cell.strip()
    return None if cell in ("", "-") else float(cell.rstrip("%"))


def parse_report(text):
    """One per-opponent report: (opponent, rank, battle rows). Each row is a dict with the
    seed, the candidate's score/survival/bullet-damage shares, rounds won, both hit rates,
    skipped turns and the baseline's score share (None when the run was not paired)."""
    m = re.match(r"# (.+?) \(rank(\d+)-band\d\) vs", text)
    if not m or "## Battles" not in text:
        return None
    rows = []
    for line in text.split("## Battles", 1)[1].split("\n## ", 1)[0].splitlines():
        c = [x.strip() for x in line.strip().strip("|").split("|")]
        if len(c) < 10 or not c[0].isdigit():
            continue
        rows.append({"seed": int(c[0]), "share": pct(c[1]), "survival": pct(c[2]), "bullet": pct(c[3]),
                     "won": int(c[4].split("/")[0]), "hit": pct(c[5]), "their_hit": pct(c[6]),
                     "skips": int(c[7]), "baseline": pct(c[10]) if len(c) > 11 else None})
    return m.group(1), int(m.group(2)), rows


def load_runs(repo):
    """{arm label: {opponent: [score shares]}} and {opponent: rank}. 3.13's arms are g313 (the
    gate run's candidate) and b313_<run> (each paired run's baseline)."""
    arms, ranks = defaultdict(lambda: defaultdict(list)), {}
    for label, d, cand, baseline in RUNS:
        path = os.path.join(repo, "docs/bench/local", d)
        for fn in sorted(os.listdir(path)):
            got = parse_report(open(os.path.join(path, fn), encoding="utf-8").read())
            if not got:
                continue
            opp, rank, rows = got
            ranks[opp] = rank
            c = "g313" if cand == "3.13" else cand
            b = "b312" if baseline == "3.12" else "b313_" + label
            for r in rows:
                arms[c][opp].append(r["share"])
                arms[b][opp].append(r["baseline"])
    return arms, ranks


def aps(arm, opps):
    return st.mean(st.mean(arm[o]) for o in opps)


def mean_ci(xs):
    return st.mean(xs), 1.96 * st.stdev(xs) / math.sqrt(len(xs))


def spread(matrix, k):
    """Sum of squared deviations of the k run means (each run = consecutive blocks of len/k)."""
    n = len(matrix[0]) // k
    means = [st.mean(st.mean(row[i * n:(i + 1) * n]) for row in matrix) for i in range(k)]
    mu = st.mean(means)
    return sum((m - mu) ** 2 for m in means), max(means) - min(means)


def permutation_test(matrix, k, perms, seed=1):
    """matrix: one row per opponent, k runs of equal length laid end to end. Shuffles the
    battles within each opponent; returns (observed spread, observed range, p, null 95th pct
    range)."""
    obs, rng_obs = spread(matrix, k)
    rnd = random.Random(seed)
    hits, ranges = 0, []
    for _ in range(perms):
        shuffled = [rnd.sample(row, len(row)) for row in matrix]
        s, r = spread(shuffled, k)
        hits += s >= obs
        ranges.append(r)
    ranges.sort()
    return obs, rng_obs, (hits + 1) / (perms + 1), ranges[int(0.95 * len(ranges))]


def aa(arms, opps, perms):
    names = ["g313", "b313_stack", "b313_mid1", "b313_mid2"]
    out = {"aps": {a: aps(arms[a], opps) for a in names}, "pairs": {}}
    for i, a in enumerate(names):
        for b in names[i + 1:]:
            out["pairs"][a + " - " + b] = mean_ci([st.mean(arms[a][o]) - st.mean(arms[b][o]) for o in opps])
    matrix = [[s for a in names for s in arms[a][o]] for o in opps]
    obs, rng, p, null95 = permutation_test(matrix, len(names), perms)
    seed_var = st.mean(st.mean(st.variance(arms[a][o]) for a in names) for o in opps)
    run_means = list(out["aps"].values())
    expected = seed_var / 4 / len(opps)
    out.update({"perm_p": p, "range": rng, "null_range_95": null95, "seed_sd_pp": math.sqrt(seed_var),
                "run_sd_aps": st.stdev(run_means), "run_sd_expected_aps": math.sqrt(expected),
                "run_extra_sd_aps": math.sqrt(max(0.0, st.variance(run_means) - expected))})
    return out


def live_page(repo, path):
    with open(os.path.join(repo, path), encoding="utf-8") as f:
        return {base(r["name"]): float(r["aps"]) for r in csv.DictReader(f)}


def git_rows(repo, path):
    """A rows file from the working tree, or from origin/master when the branch lacks it."""
    full = os.path.join(repo, path)
    if os.path.exists(full):
        return list(csv.DictReader(open(full, encoding="utf-8"), delimiter="\t"))
    txt = subprocess.run(["git", "-C", repo, "show", "origin/master:" + path],
                         capture_output=True, text=True, check=True).stdout
    return list(csv.DictReader(txt.splitlines(), delimiter="\t"))


def segment(opp, classes, large):
    c = classes[opp]
    if c["move_class"] == "rammer":
        return "A"
    if opp in large:
        return "C"
    rank = int(c["rank"])
    return "B" if rank > 400 else "D" if rank > 50 else "E"


def main(argv=None):
    ap = argparse.ArgumentParser(description=__doc__.split("\n")[0])
    ap.add_argument("--repo", default=os.path.join(os.path.dirname(os.path.abspath(__file__)), "..", ".."))
    ap.add_argument("--out", default=None)
    ap.add_argument("--perms", type=int, default=2000)
    a = ap.parse_args(argv)
    repo = os.path.abspath(a.repo)
    arms, ranks = load_runs(repo)
    opps = sorted(ranks)
    n = len(opps)
    out = {"n": n, "aa": aa(arms, opps, a.perms)}

    pool = {o: st.mean(s for k in ("g313", "b313_stack", "b313_mid1", "b313_mid2") for s in arms[k][o]) for o in opps}
    classes = {base(r["opponent"]): r for r in csv.DictReader(
        open(os.path.join(repo, "docs/bench/local/2026-10-18_census-classes.tsv"), encoding="utf-8"), delimiter="\t")}
    hadur = live_page(repo, LIVE + "2026-10-15T0556Z_roborumble_botdetails_hadur2.Hadur_3.13.csv")
    peers = {k: live_page(repo, LIVE + "2026-10-15T1100Z_roborumble_botdetails_" + f + ".csv") for k, f in PEERS}

    # Local reference levels, per opponent.
    local = {}
    for name, path, build in REFS:
        d = defaultdict(list)
        for r in git_rows(repo, path):
            if (build is None or r["build"] == build) and r["ok"] == "true":
                d[base(r["opponent"])].append(100 * float(r["score_share"]))
        local[name] = {k: st.mean(v) for k, v in d.items()}

    # C: opponents at least 10 points behind ScalarR live and 5 behind it on the bench, not rammers.
    pb = {base(o): v for o, v in pool.items()}
    large = {o for o in classes if o in hadur and o in peers["ScalarR"] and o in local["ScalarR"] and o in pb
             and classes[o]["move_class"] != "rammer"
             and peers["ScalarR"][o] - hadur[o] >= 10 and local["ScalarR"][o] - pb[o] >= 5}
    seg = {o: segment(base(o), classes, large) for o in opps}

    # Candidates.
    cands = {}
    for c, b in (("3.13hjsw", "b313_stack"), ("3.14hjswhcpkw2", "b313_mid1"), ("3.14hjswthfgnkxl", "b313_mid2")):
        own = [st.mean(arms[c][o]) - st.mean(arms[b][o]) for o in opps]
        pooled = [st.mean(arms[c][o]) - pool[o] for o in opps]
        row = {"own": mean_ci(own), "pooled": mean_ci(pooled), "segments": {}, "bands": {}}
        for s in SEGMENTS:
            d = [st.mean(arms[c][o]) - pool[o] for o in opps if seg[o] == s]
            m, ci = mean_ci(d)
            row["segments"][s] = {"n": len(d), "pp": m, "pp_ci": ci, "aps": m * len(d) / n, "aps_ci": ci * len(d) / n}
        for bi in range(1, 7):
            d = [st.mean(arms[c][o]) - pool[o] for o in opps if band_of(ranks[o]) == bi]
            row["bands"][bi] = mean_ci(d)
        cands[c] = row
    effects = {c: [st.mean(arms[c][o]) - st.mean(arms[b][o]) for o in opps]
               for c, b in (("3.13hjsw", "b313_stack"), ("3.14hjswhcpkw2", "b313_mid1"), ("3.14hjswthfgnkxl", "b313_mid2"))}
    names = list(effects)
    out["cands"] = cands
    out["effect_repeat_r"] = {names[i] + " ~ " + names[j]: st.correlation(effects[names[i]], effects[names[j]])
                              for i in range(3) for j in range(i + 1, 3)}
    half_a = [st.mean(arms["g313"][o] + arms["b313_stack"][o]) for o in opps]
    half_b = [st.mean(arms["b313_mid1"][o] + arms["b313_mid2"][o]) for o in opps]
    out["level_split_half_r"] = st.correlation(half_a, half_b)

    # Calibration: the bench's 16 battles of 3.13 against the live page; references local against live.
    com = [o for o in hadur if o in pb]
    out["calib"] = {"n": len(com), "r": st.correlation([pb[o] for o in com], [hadur[o] for o in com]),
                    "live_minus_local": st.mean(hadur[o] - pb[o] for o in com),
                    "local_aps": {k: st.mean(v[o] for o in v if o in pb) for k, v in local.items()}}

    # The live gap per band and per segment.
    gap = {}
    for k, page in peers.items():
        g = {o: page.get(o, hadur[o]) - hadur[o] for o in hadur if o in classes}
        bands = defaultdict(float)
        segs = defaultdict(float)
        for o, v in g.items():
            bands[band_of(int(classes[o]["rank"]))] += v / len(hadur)
            segs[segment(o, classes, large)] += v / len(hadur)
        gap[k] = {"total": sum(g.values()) / len(hadur), "bands": dict(bands), "segments": dict(segs),
                  "behind": sum(1 for v in g.values() if v > 0),
                  "weight_ge10": sum(v for v in g.values() if v >= 10) / len(hadur),
                  "n_ge10": sum(1 for v in g.values() if v >= 10)}
    out["gap"] = gap
    out["segments"] = {s: {"name": SEGMENTS[s], "n": sum(1 for o in classes if o in hadur and segment(o, classes, large) == s),
                           "hadur_live": st.mean(hadur[o] for o in classes if o in hadur and segment(o, classes, large) == s)}
                       for s in SEGMENTS}
    out["large"] = sorted(large)

    # Damage taken per round, by round bucket, per band (rammers apart).
    curves = {}
    for name, path, build in REFS:
        rpath = path.replace("_cold.tsv", "_cold_rounds.tsv")
        agg = defaultdict(list)
        for r in git_rows(repo, rpath):
            if build is not None and r["build"] != build:
                continue
            o = base(r["opponent"])
            if o not in classes:
                continue
            group = "rammer" if classes[o]["move_class"] == "rammer" else str(band_of(int(classes[o]["rank"])))
            rd = int(r["round"])
            ph = next(i for i, (lo, hi) in enumerate(PHASES) if lo <= rd <= hi)
            try:
                t = float(r["damageTaken"])
            except ValueError:
                continue
            agg[(group, ph)].append(t)
            agg[("all", ph)].append(t)
            if o in large:
                agg[("C", ph)].append(t)
        curves[name] = {g: [st.mean(agg[(g, ph)]) for ph in range(len(PHASES))]
                        for g in sorted({g for g, _ in agg})}
    out["curves"] = curves

    a_ = out["aa"]
    print(f"3.13 A/A: runs {', '.join(f'{k} {v:.2f}' for k, v in a_['aps'].items())}; "
          f"permutation p {a_['perm_p']:.3f}, run sd {a_['run_sd_aps']:.3f} vs {a_['run_sd_expected_aps']:.3f} from seeds")
    for c, row in cands.items():
        print(f"{c}: own {row['own'][0]:+.2f} ± {row['own'][1]:.2f}, pooled {row['pooled'][0]:+.2f} ± {row['pooled'][1]:.2f}")
    for k, g in gap.items():
        print(f"gap {k}: {g['total']:+.2f}  " + " ".join(f"{s}:{g['segments'].get(s, 0):+.2f}" for s in SEGMENTS))
    if a.out:
        with open(a.out, "w", encoding="utf-8") as f:
            json.dump(out, f, indent=1, sort_keys=True)
    return 0


if __name__ == "__main__":
    sys.exit(main())
