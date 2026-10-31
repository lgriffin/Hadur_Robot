#!/usr/bin/env python3
"""Is this machine's bench valid? (BENCH-106) Skipped turns and level against the PC's.

    python3 tools/host_check.py --out REPORT.md RUN [RUN ...]

Each RUN is a bench run folder (conditions.json and battles/). Each is judged against the PC's
own run of the same battles, the 2026-10-23 worker ladder (docs/bench/local/2026-10-23_worker-ladder.md,
PR #232), picked by the run's set: top5-s0-panel.txt is the duel block d12 (3.15, seed 2501, 12
workers, truth log on), team-census46.txt the team block t12 (12 workers, seeds 2401-2402).
--reference-skips X and --reference-level Y judge any other run by hand; --reference-run LABEL=DIR judges
against another run of the same battles (BENCH-151: the same machine the same day, so drift since the PC's
reference cancels and only the difference between the two conditions is judged).

VALID when the run's skipped turns a round stay within 15% of the PC's (the ladder's own limit,
SKIP_LIMIT in tools/ladder.py) plus 0.02 a round of slack for a short run, and its engine disables
a 100 battles within 1 of the PC's plus 1. A duel run also shows its level (mean score share over
the panel) against the PC's c arm: both fight the same jar on the same seed, so a level more than
1.5 points off says the machine changes results even when the skips look fine. TOO LOADED says
run narrower: --workers one less (or WORKERS in host.local), then check again.

Standard library only.
"""
import argparse
import csv
import glob
import json
import os
import re
import statistics as st
import sys

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
from ladder import DISABLE_LIMIT, SKIP_LIMIT, read_run  # noqa: E402

SKIP_SLACK = 0.02
LEVEL_LIMIT = 1.5
# The PC's runs of the same battles (docs/bench/local/2026-10-23_worker-ladder.md and -arms.md).
REFERENCES = {
    "top5-s0-panel.txt": {"kind": "duel", "label": "PC d12 (12 workers, 2026-10-23)", "skips_round": 0.465,
                          "disables_100": 3.1, "level": 83.32},
    "team-census46.txt": {"kind": "team", "label": "PC t12 (12 workers, 2026-10-23)", "skips_round": 0.119,
                          "disables_100": 0.0, "level": None},
}


def duel_level(work):
    """Mean over opponents of each opponent's mean score share (points), from the battle folders."""
    by_opp = {}
    for res in glob.glob(os.path.join(work, "battles", "*", "result.csv")):
        with open(res, encoding="utf-8") as f:
            rows = list(csv.DictReader(f))
        if not rows or rows[0].get("ok") != "true":
            continue
        r = rows[0]
        ours, theirs = float(r.get("score") or 0), float(r.get("theirScore") or 0)
        if ours + theirs <= 0:
            continue
        # Battle folders are <opponent slug>-<seed>[-<arm>]; the opponent is what comes before the seed.
        opponent = re.sub(r"-\d+(-[\w.]+)?$", "", os.path.basename(os.path.dirname(res)))
        by_opp.setdefault(opponent, []).append(100.0 * ours / (ours + theirs))
    return st.mean(st.mean(v) for v in by_opp.values()) if by_opp else None


def judge(run, ref):
    skips_bar = ref["skips_round"] * SKIP_LIMIT + SKIP_SLACK
    dis_bar = ref["disables_100"] + DISABLE_LIMIT + 1.0
    reasons = []
    if run["skips_round"] > skips_bar:
        reasons.append(f"skips a round {run['skips_round']:.3f} over {skips_bar:.3f}")
    if run["disables_100"] > dis_bar:
        reasons.append(f"disables /100 {run['disables_100']:.1f} over {dis_bar:.1f}")
    if ref.get("level") is not None and run.get("level") is not None and abs(run["level"] - ref["level"]) > LEVEL_LIMIT:
        reasons.append(f"level {run['level']:.2f} is {run['level'] - ref['level']:+.2f} from the PC's {ref['level']:.2f}")
    return ("VALID" if not reasons else "TOO LOADED"), reasons


def check(label, work, ref_override=None):
    run = read_run(label, work)
    with open(os.path.join(work, "conditions.json"), encoding="utf-8") as f:
        cond = json.load(f)
    run["level"] = None if run["team"] else duel_level(work)
    ref = ref_override or REFERENCES.get(os.path.basename(str(cond.get("set", ""))))
    out = {"run": run, "conditions": cond, "ref": ref}
    if ref is None:
        out["verdict"], out["reasons"] = "NO REFERENCE", ["no PC run of this set is known; pass --reference-skips"]
    else:
        out["verdict"], out["reasons"] = judge(run, ref)
    return out


def render(results):
    lines = ["# Host check", "",
             "Each run against the PC's run of the same battles (BENCH-106). VALID: skipped turns a round within "
             f"{SKIP_LIMIT:.2f}x the PC's + {SKIP_SLACK}, engine disables a 100 within the PC's + {DISABLE_LIMIT + 1:g}, "
             f"and for a duel the level within {LEVEL_LIMIT} points of the PC's.", "",
             "| Run | Kind | Workers | Battles | Battles an hour | Skips a round (PC) | Disables /100 (PC) | Level (PC) | Verdict |",
             "|---|---|---:|---:|---:|---:|---:|---:|---|"]
    for r in results:
        run, ref = r["run"], r["ref"] or {}
        pc = lambda k, f: (f"{ref[k]:{f}}" if ref.get(k) is not None else "-")  # noqa: E731
        level = f"{run['level']:.2f} ({pc('level', '.2f')})" if run.get("level") is not None else "-"
        lines.append(f"| {run['label']} | {'team' if run['team'] else 'duel'} | {run['workers']} | {run['battles']} | "
                     f"{run['per_hour']:.0f} | {run['skips_round']:.3f} ({pc('skips_round', '.3f')}) | "
                     f"{run['disables_100']:.1f} ({pc('disables_100', '.1f')}) | {level} | **{r['verdict']}** |")
    lines += ["", "## Hosts", ""]
    for r in results:
        c = r["conditions"]
        lines.append(f"- {r['run']['label']}: {c.get('hostProfile') or c.get('host')}; {c.get('cpuConstant')}; "
                     f"parallel {c.get('parallel')} ({c.get('parallelSource', 'set')})")
    lines += ["", "## Verdict", ""]
    for r in results:
        why = "; ".join(r["reasons"])
        tail = ""
        if r["verdict"] == "TOO LOADED":
            w = r["run"]["workers"] or 1
            tail = (f" Run narrower: --workers {w - 1} (or WORKERS = {w - 1} in hadur-bench/host.local) and check again."
                    if w > 1 else " Already at 1 worker: this machine cannot host this kind of battle as the PC does.")
        lines.append(f"- {r['run']['label']}: **{r['verdict']}**" + (f" ({why})." if why else ".") + tail)
    return "\n".join(lines) + "\n"


def main(argv=None):
    p = argparse.ArgumentParser(prog="host_check.py", description=__doc__.split("\n\n")[0])
    p.add_argument("runs", nargs="+", help="LABEL=WORKDIR or WORKDIR")
    p.add_argument("--out")
    p.add_argument("--reference-skips", type=float)
    p.add_argument("--reference-disables", type=float, default=0.0)
    p.add_argument("--reference-level", type=float)
    p.add_argument("--reference-run", help="LABEL=WORKDIR: judge against this run of the same battles on this "
                                           "machine today, not the PC's 2026-10-23 run (BENCH-151)")
    args = p.parse_args(argv)
    override = None
    if args.reference_skips is not None:
        override = {"label": "given", "skips_round": args.reference_skips, "disables_100": args.reference_disables,
                    "level": args.reference_level}
    if args.reference_run:
        label, _, work = args.reference_run.partition("=")
        try:
            base = check(label, work)["run"]
        except (OSError, ValueError) as e:
            print(f"host_check.py: reference {label}: {e}", file=sys.stderr)
            return 2
        override = {"label": label, "skips_round": base["skips_round"], "disables_100": base["disables_100"],
                    "level": base["level"]}
    results = []
    for spec in args.runs:
        label, _, work = spec.partition("=") if "=" in spec else (os.path.basename(spec.rstrip("/\\")), "", spec)
        try:
            results.append(check(label, work, override))
        except (OSError, ValueError) as e:
            print(f"host_check.py: {label}: {e}", file=sys.stderr)
            return 2
    text = render(results)
    if args.out:
        os.makedirs(os.path.dirname(os.path.abspath(args.out)), exist_ok=True)
        with open(args.out, "w", encoding="utf-8") as f:
            f.write(text)
    print(text)
    return 0 if all(r["verdict"] == "VALID" for r in results) else 1


if __name__ == "__main__":
    sys.exit(main())
