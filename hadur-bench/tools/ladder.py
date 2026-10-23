#!/usr/bin/env python3
"""Worker ladder read (BENCH-98): battles an hour against load, per bench run folder.

    python3 tools/ladder.py --out REPORT.md --base d12 --base t8 LABEL=WORKDIR ...

Each LABEL=WORKDIR is one bench run (duel, multi-arm or team). For each it reads the run's
conditions.json (start, finish, workers, child flags) and every battle folder under
WORKDIR/battles, and reports battles, wall hours, battles an hour, skipped turns a round,
engine disables, truth-log disk a battle and the battles-an-hour and skips ratios against its
base run (--base: the first label of its kind, duel or team, unless named). A run that did not
finish (no finish time in conditions.json) is refused with a message. Battles a stopped run
read back (resumed) are counted only if they were fought after the run's start.

Pick rule (docs/bench/throughput.md): the widest run whose skipped turns a round stay within 15%
of its base, whose engine disables a 100 battles stay within 1 of the base's and whose battles an
hour are at least the base's. Runs with the truth log off are judged apart, against the truth-on
run of the same width.
"""
import argparse
import csv
import datetime
import glob
import json
import os
import sys

SKIP_LIMIT = 1.15
DISABLE_LIMIT = 1.0


def when(s):
    return datetime.datetime.fromisoformat(s.replace("Z", "+00:00")).timestamp()


def read_run(label, work):
    with open(os.path.join(work, "conditions.json"), encoding="utf-8") as f:
        c = json.load(f)
    if not c.get("started") or not c.get("finished"):
        raise ValueError("the run did not finish (conditions.json has no finish time)")
    t0, t1 = when(c["started"]), when(c["finished"])
    team = c.get("mode") == "team"
    flags = c.get("childFlags") or ""
    truth_off = "-Dhadur.bench.truth=false" in (" ".join(flags) if isinstance(flags, list) else str(flags))
    battles = skips = rounds = disables = 0
    truth_bytes = 0
    for d in sorted(glob.glob(os.path.join(work, "battles", "*"))):
        if not os.path.isdir(d):
            continue
        if team:
            done = os.path.join(d, "team-done.txt")
            if not os.path.exists(done) or os.path.getmtime(done) < t0:
                continue
            battles += 1
            members = glob.glob(os.path.join(d, "member-*.log"))
            # Skips are counted over every member, so the rounds are member-rounds too.
            rounds += int(c.get("rounds") or 10) * max(1, len(members))
            for m in members:
                with open(m, encoding="utf-8", errors="replace") as f:
                    for line in f:
                        if "SYSTEM:" in line and "skipped turn" in line:
                            skips += 1
                        elif "SYSTEM:" in line and ("Robot disabled" in line or "not performed any actions" in line):
                            disables += 1
        else:
            res = os.path.join(d, "result.csv")
            if not os.path.exists(res) or os.path.getmtime(res) < t0:
                continue
            with open(res, encoding="utf-8") as f:
                rows = list(csv.DictReader(f))
            if not rows or rows[0].get("ok") != "true":
                continue
            r = rows[0]
            battles += 1
            rounds += int(float(r.get("rounds") or 0))
            skips += int(float(r.get("skippedTurns") or 0))
            disables += int(float(r.get("engineDisables") or 0))
            t = os.path.join(d, "truth.log.gz")
            if os.path.exists(t):
                truth_bytes += os.path.getsize(t)
    hours = (t1 - t0) / 3600.0
    return {
        "label": label, "team": team, "truth_off": truth_off, "workers": c.get("workers"), "flags": c.get("childFlags", ""),
        "battles": battles, "hours": hours, "per_hour": battles / hours if hours > 0 else 0.0,
        "skips_round": skips / rounds if rounds else 0.0,
        "disables_100": 100.0 * disables / battles if battles else 0.0,
        "truth_mb": truth_bytes / 1e6 / battles if battles else 0.0,
    }


def verdict(runs, bases):
    """Per kind, the widest run inside the skip and disable limits of its base and at least as fast.

    Truth-log-off runs (BENCH-97) do less work a tick, so they are left out of the width pick and
    judged on their own against the truth-on run of the same width (truth_lines)."""
    picks = {}
    for kind in ("duel", "team"):
        rs = [r for r in runs if ("team" if r["team"] else "duel") == kind and not r["truth_off"]]
        if not rs:
            continue
        base = next((r for r in rs if r["label"] in bases), rs[0])
        ok = [r for r in rs if r["skips_round"] <= base["skips_round"] * SKIP_LIMIT + 1e-9
              and r["disables_100"] <= base["disables_100"] + DISABLE_LIMIT and r["per_hour"] >= base["per_hour"]]
        best = max(ok, key=lambda r: (r["workers"] or 0, r["per_hour"])) if ok else base
        picks[kind] = (base, best)
    return picks


def truth_lines(runs):
    """Each truth-off run against the truth-on run of the same kind and width."""
    out = []
    for r in runs:
        if not r["truth_off"]:
            continue
        on = next((o for o in runs if not o["truth_off"] and o["team"] == r["team"] and o["workers"] == r["workers"]), None)
        if on is None or not on["per_hour"]:
            out.append(f"- truth log off, {r['label']}: no truth-on run at {r['workers']} workers to compare.")
            continue
        out.append(f"- truth log off, {r['label']} against {on['label']} at {r['workers']} workers: "
                   f"{r['per_hour'] / on['per_hour'] - 1:+.0%} battles an hour, skips a round "
                   f"{r['skips_round']:.3f} against {on['skips_round']:.3f}.")
    return out


def render(runs, bases):
    picks = verdict(runs, bases)
    out = ["# Worker ladder", "",
           "Battles an hour against the number of battles run at once (BENCH-98). Skips a round are the",
           "engine's skipped-turn lines per robot-round of Hadur (duel) or of each team member (team);",
           "ratios are against the base run of the same kind. Pick rule: the widest run whose skips a",
           f"round stay within {int(round((SKIP_LIMIT - 1) * 100))}% of the base, whose engine disables a 100 battles stay within",
           f"{DISABLE_LIMIT:g} of the base's and whose battles an hour are at least the base's. Truth-log-off runs",
           "are left out of the pick and compared with the truth-on run of their width.", "",
           "| Run | Kind | Workers | Battles | Minutes | Battles an hour | vs base | Skips a round | vs base | Disables /100 | Truth log MB a battle |",
           "|---|---|---|---|---|---|---|---|---|---|---|"]
    for r in runs:
        kind = "team" if r["team"] else "duel"
        base = picks[kind][0]
        rate = r["per_hour"] / base["per_hour"] if base["per_hour"] else 0
        sk = r["skips_round"] / base["skips_round"] if base["skips_round"] else float("nan")
        out.append(f"| {r['label']} | {kind} | {r['workers']} | {r['battles']} | {r['hours'] * 60:.1f} | "
                   f"{r['per_hour']:.0f} | {rate:.2f}x | {r['skips_round']:.3f} | {sk:.2f}x | "
                   f"{r['disables_100']:.1f} | {r['truth_mb']:.1f} |")
    out += ["", "## Verdict", ""]
    for kind, (base, best) in picks.items():
        gain = best["per_hour"] / base["per_hour"] - 1 if base["per_hour"] else 0
        out.append(f"- {kind}: run at **{best['workers']} workers** ({best['label']}): "
                   f"{best['per_hour']:.0f} battles an hour, {gain:+.0%} on {base['label']} at {base['workers']}.")
    out += truth_lines(runs)
    return "\n".join(out) + "\n"


def main(argv=None):
    ap = argparse.ArgumentParser(description=__doc__.split("\n")[0])
    ap.add_argument("runs", nargs="+", help="LABEL=WORKDIR")
    ap.add_argument("--base", action="append", default=[], help="label of a base run (one per kind)")
    ap.add_argument("--out", help="write the report here as well")
    a = ap.parse_args(argv)
    runs = []
    for spec in a.runs:
        label, _, work = spec.partition("=")
        if not work:
            ap.error(f"expected LABEL=WORKDIR, not {spec}")
        try:
            runs.append(read_run(label, work))
        except (OSError, KeyError, ValueError, AttributeError) as e:
            print(f"ladder: {label}: cannot read {work}: {e}", file=sys.stderr)
            return 2
    text = render(runs, set(a.base))
    print(text)
    if a.out:
        os.makedirs(os.path.dirname(os.path.abspath(a.out)), exist_ok=True)
        with open(a.out, "w", encoding="utf-8") as f:
            f.write(text)
    return 0


if __name__ == "__main__":
    sys.exit(main())
