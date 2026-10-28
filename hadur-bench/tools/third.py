#!/usr/bin/env python3
"""BENCH-111: steps of the pc-1v1-third card (docs: "Hadur 1v1: plan to 3rd place", lever L0).

  third.py experts RUN_DIR --pick PICK.tsv --arm sp --out FILE
      the shot-dodge planner's table lines for the robots the pick locked the sp arm for: per robot,
      the expert its sp battles' last DP records (DODGE-5) agree on while the planner acted, as
      "expert name"; "-1 name" (learn it in the battle) when none acted or they disagree. The
      expert is read from our own battles, never from a rival's data.
  third.py candidate LINES --base 3.17.1 --out ARMS
      builds t4 = base + those lines (build-ablation.sh sdplanlist) and writes the verify arms c, aa,
      t4; with no line, t4 is the base's A/A copy.
  third.py panel SET --plans LINES --out SET
      the verify panel: the rows of the screen set whose robot a plan line names. Robots without a
      line play bit for bit as the base, so they need no verify battles.

The pick is data/tools/mode_table.py over the dodge screen; the verify panel is modes_v2.py panel;
the gate is shield_s2.py gate --arm t4. Standard library plus tools/shield_s2.py and
tools/table_v1.py.
"""
import argparse
import os
import subprocess
import sys
from collections import Counter

HERE = os.path.dirname(os.path.abspath(__file__))
sys.path.insert(0, HERE)
import shield_s2  # noqa: E402
import table_v1  # noqa: E402


def last_dp(log):
    """(planBest, planActive) from the last DP record of a hadur.log; None without one."""
    last = None
    try:
        with open(log, encoding="utf-8", errors="replace") as f:
            for line in f:
                parts = line.rstrip("\n").split(",", 2)
                if len(parts) < 3 or not parts[2].startswith("DP,"):
                    continue
                p = parts[2].strip().split(",")
                if len(p) >= 9:
                    try:
                        last = (int(p[3]), p[8] == "1")
                    except ValueError:
                        continue
    except OSError:
        return None
    return last


def expert_for(logs):
    """The expert the acting battles agree on (a strict majority of them), else -1."""
    acting = [r[0] for r in (last_dp(l) for l in logs) if r and r[1] and r[0] >= 0]
    if not acting:
        return -1
    best, n = Counter(acting).most_common(1)[0]
    return best if 2 * n > len(acting) else -1


def battle_logs(run_dir, robot, arm):
    root = os.path.join(run_dir, "battles")
    prefix = "%s-" % shield_s2.slug(robot)
    if not os.path.isdir(root):
        return []
    return [os.path.join(root, d, "hadur.log") for d in sorted(os.listdir(root))
            if d.startswith(prefix) and d.endswith("-" + arm) and d[len(prefix):-len(arm) - 1].isdigit()]


def experts(run_dir, pick, arm):
    robots = sorted({o for o, a in table_v1.pick_rows(pick) if a == arm})
    return ["%d %s" % (expert_for(battle_logs(run_dir, r, arm)), r) for r in robots]


def plan_names(lines):
    """The robot names of "expert name" plan lines."""
    out = []
    for l in lines:
        p = l.split(" ", 1)
        if len(p) == 2 and p[0].lstrip("-").isdigit():
            out.append(p[1].strip())
    return out


def panel(set_path, names):
    want = set(names)
    return [line for name, line in table_v1.set_rows(set_path) if name in want]


def candidate_arms(base, suffix):
    return ["# 1v1 plan to 3rd, dodge verify (pc-1v1-third): c is %s, aa its A/A copy, t4 the candidate.\n" % base,
            "c | hadur117.Hadur %s | bisect/hadur117.Hadur_%s.jar\n" % (base, base),
            "aa | hadur117.Hadur %saa | bisect/hadur117.Hadur_%saa.jar\n" % (base, base),
            "t4 | hadur117.Hadur %s%s | bisect/hadur117.Hadur_%s%s.jar\n" % (base, suffix, base, suffix)]


def main(argv=None):
    ap = argparse.ArgumentParser()
    sub = ap.add_subparsers(dest="cmd", required=True)
    p = sub.add_parser("experts"); p.add_argument("run"); p.add_argument("--pick", required=True)
    p.add_argument("--arm", default="sp"); p.add_argument("--out", required=True)
    p = sub.add_parser("candidate"); p.add_argument("lines")
    p.add_argument("--base", required=True); p.add_argument("--out", required=True)
    p = sub.add_parser("panel"); p.add_argument("set"); p.add_argument("--plans", required=True)
    p.add_argument("--out", required=True)
    a = ap.parse_args(argv)
    if a.cmd == "experts":
        lines = experts(a.run, a.pick, a.arm)
        shield_s2.write(a.out, [l + "\n" for l in lines])
        shipped = sum(1 for l in lines if not l.startswith("-1 "))
        print("%d robots get the planner, %d with a shipped expert" % (len(lines), shipped))
    elif a.cmd == "candidate":
        lines = shield_s2.read_lines(a.lines) if os.path.exists(a.lines) else []
        if not lines:
            print("nothing to build: t4 is the base")
            shield_s2.write(a.out, candidate_arms(a.base, "aa")[:3]
                            + ["t4 | hadur117.Hadur %saa | bisect/hadur117.Hadur_%saa.jar\n" % (a.base, a.base)])
            return 0
        bench = os.path.dirname(HERE)
        rel = os.path.relpath(os.path.abspath(a.lines), bench).replace(os.sep, "/")
        code = subprocess.call(["bash", "./build-ablation.sh", "sdplanlist"], cwd=bench,
                               env=dict(os.environ, SHOT_DODGE_PLAN=rel))
        if code:
            return code
        shield_s2.write(a.out, candidate_arms(a.base, "dp"))
    elif a.cmd == "panel":
        names = plan_names(shield_s2.read_lines(a.plans)) if os.path.exists(a.plans) else []
        rows = panel(a.set, names)
        shield_s2.write(a.out, ["# 1v1 plan to 3rd verify panel: the robots the candidate t4 has a planner entry for.\n"] + rows)
        print(len(rows), "robots in the verify panel")
    return 0


if __name__ == "__main__":
    sys.exit(main())
