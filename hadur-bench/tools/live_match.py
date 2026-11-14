#!/usr/bin/env python3
"""BENCH-245 live-match check: does this bench, at this turn time, score us AND BeepBoop as live does?

Reads a multi-arm arms.tsv holding our arm (default c) and BeepBoop's arm (default bb) on the same opponents
and seeds, and the live LiteRumble scores per opponent (plans/live-1v1-*.tsv: robot, hadur, beepboop). On the
opponents both cover it compares, paired by robot:
  - our bench level with our live level, BeepBoop's bench level with its live level;
  - the bench gap (BeepBoop minus us) with the live gap;
  - BeepBoop's and our skipped turns a battle.
A bench that is harsher than live costs BeepBoop more than us (it is the heavier robot), so the gap shrinks
and every Hadur-only A/B on that bench under-reads CPU-heavy play. That is what 1488498 ns with 16 workers did
(docs/bench/local/2026-11-14_night.md, section 5): BeepBoop skipped ~500 turns a battle and the gap read 9.7
against 17.4 live.

The check PASSES when the gap is within --gap-tol points of live, BeepBoop's level within --level-tol points
of its live level, and BeepBoop skips at most --bb-skips turns a battle. It exits 1 on FAIL, so a queue step
that runs it halts every step after it.

Usage: live_match.py ARMS.tsv [--live plans/live-1v1-2026-11-13.tsv] [--us c] [--bb bb] [--out REPORT.md]
"""
import argparse
import csv
import math
import sys
from collections import defaultdict
from pathlib import Path

HERE = Path(__file__).resolve().parent.parent
DEFAULT_LIVE = HERE / "plans" / "live-1v1-2026-11-13.tsv"


def base_name(robot):
    """'abc.Shadow 3.83c' -> 'abc.Shadow' (live rows carry no version)."""
    return robot.strip().split(" ")[0]


def read_live(path):
    live = {}
    with open(path, newline="") as f:
        rows = (line for line in f if not line.startswith("#"))
        for r in csv.DictReader(rows, delimiter="\t"):
            try:
                live[r["robot"].strip()] = (float(r["hadur"]), float(r["beepboop"]))
            except (KeyError, ValueError, TypeError):
                continue
    return live


def read_arms(path, us, bb):
    """Per arm, per opponent base name: list of (score share in points, skipped turns)."""
    out = {us: defaultdict(list), bb: defaultdict(list)}
    with open(path, newline="") as f:
        for r in csv.DictReader(f, delimiter="\t"):
            if r.get("arm") not in out or r.get("ok", "true").lower() != "true":
                continue
            try:
                share = float(r["score_share"]) * 100.0
            except (KeyError, ValueError):
                continue
            try:
                skips = float(r.get("skippedTurns") or 0)
            except ValueError:
                skips = 0.0
            out[r["arm"]][base_name(r["opponent"])].append((share, skips))
    return out


def mean_ci(xs):
    n = len(xs)
    if n == 0:
        return float("nan"), float("nan")
    m = sum(xs) / n
    if n < 2:
        return m, float("nan")
    sd = math.sqrt(sum((x - m) ** 2 for x in xs) / (n - 1))
    return m, 1.96 * sd / math.sqrt(n)


def check(arms, live, us, bb, gap_tol, level_tol, bb_skip_max):
    robots = sorted(r for r in live if arms[us].get(r) and arms[bb].get(r))
    rows = []
    for r in robots:
        u = [s for s, _ in arms[us][r]]
        b = [s for s, _ in arms[bb][r]]
        lu, lb = live[r]
        rows.append({"robot": r, "us": sum(u) / len(u), "bb": sum(b) / len(b), "live_us": lu, "live_bb": lb})
    skips = {a: [k for v in arms[a].values() for _, k in v] for a in (us, bb)}
    res = {"robots": rows, "n": len(rows)}
    if not rows:
        res.update(verdict="FAIL", reasons=["no opponent is in both the bench and the live file"])
        return res
    res["us"], _ = mean_ci([x["us"] for x in rows])
    res["bb"], _ = mean_ci([x["bb"] for x in rows])
    res["live_us"], _ = mean_ci([x["live_us"] for x in rows])
    res["live_bb"], _ = mean_ci([x["live_bb"] for x in rows])
    res["d_us"] = mean_ci([x["us"] - x["live_us"] for x in rows])
    res["d_bb"] = mean_ci([x["bb"] - x["live_bb"] for x in rows])
    res["d_gap"] = mean_ci([(x["bb"] - x["us"]) - (x["live_bb"] - x["live_us"]) for x in rows])
    res["skips_us"] = sum(skips[us]) / max(1, len(skips[us]))
    res["skips_bb"] = sum(skips[bb]) / max(1, len(skips[bb]))
    reasons = []
    if abs(res["d_gap"][0]) > gap_tol:
        reasons.append(f"gap off live by {res['d_gap'][0]:+.2f} points (tolerance {gap_tol})")
    if abs(res["d_bb"][0]) > level_tol:
        reasons.append(f"BeepBoop off its live level by {res['d_bb'][0]:+.2f} points (tolerance {level_tol})")
    if res["skips_bb"] > bb_skip_max:
        reasons.append(f"BeepBoop skips {res['skips_bb']:.0f} turns a battle (at most {bb_skip_max})")
    res["verdict"] = "FAIL" if reasons else "PASS"
    res["reasons"] = reasons
    return res


def report(res, arms_path, us, bb):
    def pm(t):
        return f"{t[0]:+.2f} +- {t[1]:.2f}" if not math.isnan(t[1]) else f"{t[0]:+.2f}"
    lines = [f"# Live-match check (BENCH-245): {res['verdict']}", "",
             f"Bench `{arms_path}`, our arm `{us}`, BeepBoop's arm `{bb}`, {res['n']} opponents paired with live.", ""]
    if res["n"]:
        lines += ["| | Us | BeepBoop | Gap |", "|---|---:|---:|---:|",
                  f"| Bench | {res['us']:.1f} | {res['bb']:.1f} | {res['bb'] - res['us']:+.2f} |",
                  f"| Live | {res['live_us']:.1f} | {res['live_bb']:.1f} | {res['live_bb'] - res['live_us']:+.2f} |",
                  f"| Bench minus live, paired | {pm(res['d_us'])} | {pm(res['d_bb'])} | {pm(res['d_gap'])} |",
                  f"| Skipped turns a battle | {res['skips_us']:.1f} | {res['skips_bb']:.1f} | |", ""]
    if res["reasons"]:
        lines += ["Why it fails:", ""] + [f"- {r}" for r in res["reasons"]] + [""]
    else:
        lines += ["The bench scores both robots as live does, so A/B results on it carry to live.", ""]
    return "\n".join(lines)


def main(argv=None):
    ap = argparse.ArgumentParser(description=__doc__.split("\n")[0])
    ap.add_argument("arms")
    ap.add_argument("--live", default=str(DEFAULT_LIVE))
    ap.add_argument("--us", default="c")
    ap.add_argument("--bb", default="bb")
    ap.add_argument("--gap-tol", type=float, default=4.0)
    ap.add_argument("--level-tol", type=float, default=3.0)
    ap.add_argument("--bb-skips", type=float, default=100.0)
    ap.add_argument("--out")
    a = ap.parse_args(argv)
    res = check(read_arms(a.arms, a.us, a.bb), read_live(a.live), a.us, a.bb, a.gap_tol, a.level_tol, a.bb_skips)
    text = report(res, a.arms, a.us, a.bb)
    if a.out:
        Path(a.out).parent.mkdir(parents=True, exist_ok=True)
        Path(a.out).write_text(text + "\n")
    print(text)
    return 0 if res["verdict"] == "PASS" else 1


if __name__ == "__main__":
    sys.exit(main())
