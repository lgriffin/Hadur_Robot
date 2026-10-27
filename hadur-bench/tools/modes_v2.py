#!/usr/bin/env python3
"""BENCH-101: steps of the pc-1v1-modes queue: 1v1 mode table v2, stop-and-go and the simple-aim dodge.

  modes_v2.py split PICK --stopgo FILE --stopgo2 FILE
      from a mode_table.py pick TSV of the poison screen: the robots locked with wp (WavePoison,
      ShieldTableData.stopGos()) and with ws (WavePoisonShift, stopGoShifts()), one name a line
  modes_v2.py dodge RUN_DIR --arm sg --out FILE [--min-active 0.5] [--margin 0]
      the robots the dodge is for, from the dodge screen: those whose last SD record was active in
      at least MIN_ACTIVE of their sg battles (the dodger read the gun) and whose sg mean score share
      is at least MARGIN points over the pooled c and aa
  modes_v2.py candidate STOPGO STOPGO2 DODGE --base 3.16 --out ARMS
      builds the candidate t3 (build-ablation.sh: sgolist, sgo2list, sdodgelist, each only when its
      file names anything) and writes the verify arms file c, aa, t3
  modes_v2.py panel SET [SET ...] --names FILE [FILE ...] --out SET
      the verify panel: the rows of the screen sets whose robot one of the name files names. Robots
      the table leaves out play bit for bit as the base, so they need no verify battles.

The gate is shield_s2.py gate with --arm t3 and this panel. Standard library plus
data/tools/multiarm.py and tools/shield_s2.py.
"""
import argparse
import os
import statistics as st
import subprocess
import sys

HERE = os.path.dirname(os.path.abspath(__file__))
sys.path.insert(0, HERE)
sys.path.insert(0, os.path.join(HERE, "..", "..", "data", "tools"))
import multiarm  # noqa: E402
import shield_s2  # noqa: E402
import table_v1  # noqa: E402


def split(pick):
    rows = table_v1.pick_rows(pick)
    return sorted({o for o, a in rows if a == "wp"}), sorted({o for o, a in rows if a == "ws"})


def last_sd(log):
    """Whether the last SD record of a hadur.log was active; None without one."""
    active = None
    try:
        with open(log, encoding="utf-8", errors="replace") as f:
            for line in f:
                parts = line.rstrip("\n").split(",", 2)
                if len(parts) < 3 or not parts[2].startswith("SD,"):
                    continue
                p = parts[2].strip().split(",")
                if len(p) >= 7:
                    active = p[6] == "1"
    except OSError:
        return None
    return active


def dodge(run_dir, arm, min_active, margin):
    share = {}
    for r in multiarm.read_rows([os.path.join(run_dir, "arms.tsv")]):
        if r.get("ok") == "true":
            share.setdefault(r["opponent"], {}).setdefault(r["arm"], []).append(
                (r["seed"], 100.0 * float(r["score_share"])))
    out = []
    for robot in sorted(share):
        runs = share[robot].get(arm, [])
        ref = [s for a in ("c", "aa") for _, s in share[robot].get(a, [])]
        if not runs or not ref:
            continue
        logs = [os.path.join(run_dir, "battles", "%s-%s-%s" % (shield_s2.slug(robot), seed, arm), "hadur.log")
                for seed, _ in runs]
        active = sum(1 for l in logs if last_sd(l))
        if active < min_active * len(runs):
            continue
        if st.mean(s for _, s in runs) - st.mean(ref) >= margin:
            out.append(robot)
    return out


def candidate_spec(stopgo, stopgo2, dodges):
    parts, suffix = [], ""
    if stopgo:
        parts.append("sgolist"); suffix += "wl"
    if stopgo2:
        parts.append("sgo2list"); suffix += "wm"
    if dodges:
        parts.append("sdodgelist"); suffix += "dg"
    return ",".join(parts), suffix


def candidate_arms(base, suffix):
    return ["# 1v1 mode table v2 verify (pc-1v1-modes): c is %s, aa its A/A copy, t3 the candidate.\n" % base,
            "c | hadur117.Hadur %s | bisect/hadur117.Hadur_%s.jar\n" % (base, base),
            "aa | hadur117.Hadur %saa | bisect/hadur117.Hadur_%saa.jar\n" % (base, base),
            "t3 | hadur117.Hadur %s%s | bisect/hadur117.Hadur_%s%s.jar\n" % (base, suffix, base, suffix)]


def panel(sets, names):
    want = set(names)
    rows, seen = [], set()
    for path in sets:
        for name, line in table_v1.set_rows(path):
            if name in want and name not in seen:
                seen.add(name)
                rows.append(line)
    return rows


def main(argv=None):
    ap = argparse.ArgumentParser()
    sub = ap.add_subparsers(dest="cmd", required=True)
    p = sub.add_parser("split"); p.add_argument("pick")
    p.add_argument("--stopgo", required=True); p.add_argument("--stopgo2", required=True)
    p = sub.add_parser("dodge"); p.add_argument("run"); p.add_argument("--arm", default="sg")
    p.add_argument("--out", required=True); p.add_argument("--min-active", type=float, default=0.5)
    p.add_argument("--margin", type=float, default=0.0)
    p = sub.add_parser("candidate"); p.add_argument("stopgo"); p.add_argument("stopgo2"); p.add_argument("dodge")
    p.add_argument("--base", required=True); p.add_argument("--out", required=True)
    p = sub.add_parser("panel"); p.add_argument("sets", nargs="+"); p.add_argument("--names", nargs="+", required=True)
    p.add_argument("--out", required=True)
    a = ap.parse_args(argv)

    if a.cmd == "split":
        wp, ws = split(a.pick)
        shield_s2.write(a.stopgo, [n + "\n" for n in wp])
        shield_s2.write(a.stopgo2, [n + "\n" for n in ws])
        print("%d robots get WavePoison, %d WavePoisonShift" % (len(wp), len(ws)))
    elif a.cmd == "dodge":
        names = dodge(a.run, a.arm, a.min_active, a.margin)
        shield_s2.write(a.out, [n + "\n" for n in names])
        print(len(names), "robots get the simple-aim dodge")
    elif a.cmd == "candidate":
        wp, ws, dg = (shield_s2.read_lines(f) for f in (a.stopgo, a.stopgo2, a.dodge))
        spec, suffix = candidate_spec(wp, ws, dg)
        print("%d WavePoison, %d WavePoisonShift, %d dodge; build: %s" % (len(wp), len(ws), len(dg), spec or "(none)"))
        if not spec:
            print("nothing to build: t3 is the base")
            shield_s2.write(a.out, candidate_arms(a.base, "aa")[:3]
                            + ["t3 | hadur117.Hadur %saa | bisect/hadur117.Hadur_%saa.jar\n" % (a.base, a.base)])
            return 0
        bench = os.path.dirname(HERE)
        rel = lambda f: os.path.relpath(os.path.abspath(f), bench).replace(os.sep, "/")
        env = dict(os.environ, STOP_GO=rel(a.stopgo), STOP_GO2=rel(a.stopgo2), SHOT_DODGE=rel(a.dodge))
        code = subprocess.call(["bash", "./build-ablation.sh", spec], cwd=bench, env=env)
        if code:
            return code
        shield_s2.write(a.out, candidate_arms(a.base, suffix))
    elif a.cmd == "panel":
        names = [n for f in a.names if os.path.exists(f) for n in shield_s2.read_lines(f)]
        rows = panel(a.sets, names)
        shield_s2.write(a.out, ["# 1v1 mode table v2 verify panel: the robots the candidate t3 has an entry for.\n"] + rows)
        print(len(rows), "robots in the verify panel")
    return 0


if __name__ == "__main__":
    sys.exit(main())
