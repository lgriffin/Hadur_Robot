#!/usr/bin/env python3
"""BENCH-99: steps of the pc-table-v1 queue: the shield entries of the 1v1 mode table (docs/plan-shield-quality.md).

  table_v1.py panel CENSUS LISTDATA EXCLUDE... --out FILE
      the census rows whose robot the shield list does not already name and no EXCLUDE set holds
  table_v1.py confirm-set CENSUS PICK... --arms sa,sasq --out FILE
      the census rows of every robot a pick TSV locked with one of the shield arms
  table_v1.py final CONFIRM FIRST... --arm sasq --out FILE
      the robots the confirm pick locked with ARM that a first pick also locked with a shield arm
  table_v1.py prior LISTED_ARMS [--min -0.3]
      prints whether SHIELD-16 (arm sq) costs the listed robots no more than MIN points against the
      pooled c and aa
  table_v1.py candidate LISTED_ARMS FINAL --out ARMS [--min -0.3]
      builds the census candidate t1 (build-ablation.sh: sprior, the aim every final robot was
      screened and confirmed with, then slistadd with FINAL when it names any) and writes the census
      arms file c, aa, t1; prior's read is printed, and the census measures SHIELD-16's cost on the
      listed robots inside t1's net
  table_v1.py gate ARMS CENSUS --arm t1 --out FILE [--bar 0.5] [--low 0.3] [--cover 0.95]
      the census gate: arm minus pooled c and aa, census-weighted; PASS needs the estimate at BAR
      or more, its lower 95% end above LOW (docs/plan-top5.md bar) and at least COVER of the census
      robots read in all three arms. Writes a short verdict.

A robot matches the shield list with or without its version, as ShieldList does. Standard library
plus data/tools/multiarm.py.
"""
import argparse
import os
import re
import subprocess
import sys

sys.path.insert(0, os.path.join(os.path.dirname(os.path.abspath(__file__)), "..", "..", "data", "tools"))
import multiarm  # noqa: E402

SHIELD_ARMS = ("sa", "sasq", "sy")
HERE = os.path.dirname(os.path.abspath(__file__))


def set_rows(path):
    """(name, line) for each robot row of a bench set file."""
    out = []
    with open(path, encoding="utf-8") as f:
        for line in f:
            s = line.strip().lstrip("﻿")
            if s and not s.startswith("#"):
                out.append((s.split("|")[0].strip(), line if line.endswith("\n") else line + "\n"))
    return out


def list_names(path):
    """The entries of ShieldListData.lines()."""
    with open(path, encoding="utf-8") as f:
        text = f.read()
    body = text[text.rindex("static String[] lines()"):]
    return {n for n in re.findall(r'^\s*"([^"]+)",?\s*$', body, re.M) if not n.startswith("#")}


def listed(name, names):
    return name in names or name.rsplit(" ", 1)[0] in names


def pick_rows(path):
    """(opponent, arm) of each line of a mode_table.py pick TSV."""
    out = []
    with open(path, encoding="utf-8") as f:
        for line in f:
            p = line.rstrip("\n").split("\t")
            if len(p) >= 2 and p[0] and not p[0].startswith("#"):
                out.append((p[0], p[1]))
    return out


def panel(census, listdata, exclude):
    names = list_names(listdata)
    skip = {n for e in exclude for n, _ in set_rows(e)}
    return [line for n, line in set_rows(census) if not listed(n, names) and n not in skip]


def confirm_set(census, picks, arms):
    want = {o for p in picks for o, a in pick_rows(p) if a in arms}
    return [line for n, line in set_rows(census) if n in want]


def final(confirm, firsts_paths, arm):
    firsts = {o for p in firsts_paths for o, a in pick_rows(p) if a in SHIELD_ARMS}
    return sorted(o for o, a in pick_rows(confirm) if a == arm and o in firsts)


def prior_ok(arms_tsv, minimum):
    run = multiarm.Run(multiarm.read_rows([arms_tsv]))
    d = run.diffs("sq", ["c", "aa"])
    m, ci, n = multiarm.mean_ci(list(d.values()))
    return m is not None and m >= minimum, m, ci, n


def candidate_spec(names):
    """The build-ablation.sh spec and the jar suffix of the census candidate: SHIELD-16 always, since
    every final robot won its screen and confirm with it, plus the final robots on the list."""
    return ("sprior,slistadd", "sqmt") if names else ("sprior", "sq")


def candidate_arms(suffix):
    return ["# Mode table v1 census (pc-table-v1): c is 3.15, aa its A/A copy, t1 the candidate table.\n",
            "c | hadur2.Hadur 3.15 | bisect/hadur2.Hadur_3.15.jar\n",
            "aa | hadur2.Hadur 3.15aa | bisect/hadur2.Hadur_3.15aa.jar\n",
            "t1 | hadur2.Hadur 3.15%s | bisect/hadur2.Hadur_3.15%s.jar\n" % (suffix, suffix)]


def gate(arms_tsv, census, arm, bar, low, cover=0.95):
    run = multiarm.Run(multiarm.read_rows([arms_tsv]))
    d = run.diffs(arm, ["c", "aa"], run.opps(arm, "c", "aa"))
    bands = multiarm.by_group(d, lambda o: multiarm.band_of(run.role.get(o)))
    m, ci = multiarm.field_estimate(bands, multiarm.census_weights(census))
    aa = multiarm.aa_check(run, "c", "aa")
    total = len(set_rows(census))
    ok = (m is not None and m >= bar and m - ci > low and aa is not None and aa["ok"]
          and len(d) >= cover * total)
    return ok, m, ci, len(d), aa, total


def write(path, lines):
    with open(path, "w", encoding="utf-8") as f:
        f.writelines(lines)


def main(argv=None):
    ap = argparse.ArgumentParser()
    sub = ap.add_subparsers(dest="cmd", required=True)
    p = sub.add_parser("panel"); p.add_argument("census"); p.add_argument("listdata")
    p.add_argument("exclude", nargs="*"); p.add_argument("--out", required=True)
    p = sub.add_parser("confirm-set"); p.add_argument("census"); p.add_argument("picks", nargs="+")
    p.add_argument("--arms", default=",".join(SHIELD_ARMS)); p.add_argument("--out", required=True)
    p = sub.add_parser("final"); p.add_argument("confirm"); p.add_argument("firsts", nargs="+")
    p.add_argument("--arm", default="sasq"); p.add_argument("--out", required=True)
    p = sub.add_parser("prior"); p.add_argument("arms"); p.add_argument("--min", type=float, default=-0.3)
    p = sub.add_parser("candidate"); p.add_argument("arms"); p.add_argument("final")
    p.add_argument("--out", required=True); p.add_argument("--min", type=float, default=-0.3)
    p = sub.add_parser("gate"); p.add_argument("arms"); p.add_argument("census")
    p.add_argument("--arm", default="t1"); p.add_argument("--out", required=True)
    p.add_argument("--bar", type=float, default=0.5); p.add_argument("--low", type=float, default=0.3)
    p.add_argument("--cover", type=float, default=0.95)
    a = ap.parse_args(argv)

    if a.cmd == "panel":
        rows = panel(a.census, a.listdata, a.exclude)
        write(a.out, ["# table-v1 screen panel: census robots off the shield list and outside "
                      + ", ".join(os.path.basename(e) for e in a.exclude) + "\n"] + rows)
        print(len(rows), "robots")
    elif a.cmd == "confirm-set":
        rows = confirm_set(a.census, a.picks, set(a.arms.split(",")))
        write(a.out, ["# table-v1 confirm set: locked with a shield arm by " + ", ".join(a.picks) + "\n"] + rows)
        print(len(rows), "robots")
    elif a.cmd == "final":
        names = final(a.confirm, a.firsts, a.arm)
        write(a.out, [n + "\n" for n in names])
        print(len(names), "robots join the shield list")
    elif a.cmd == "prior":
        ok, m, ci, n = prior_ok(a.arms, a.min)
        sys.stderr.write("SHIELD-16 on listed robots: %+.2f +/- %.2f points over %d; %s\n"
                         % (m if m is not None else float("nan"), ci or float("nan"), n,
                            "ships" if ok else "stays off"))
        print("ships" if ok else "stays off")
    elif a.cmd == "candidate":
        ok, m, ci, n = prior_ok(a.arms, a.min)
        with open(a.final, encoding="utf-8") as f:
            names = [l.strip() for l in f if l.strip() and not l.startswith("#")]
        spec, suffix = candidate_spec(names)
        print("SHIELD-16 on the listed robots: %+.2f points over %d (%s); %d robots join the list; build: %s"
              % (m if m is not None else float("nan"), n, "level" if ok else "a cost the census will show",
                 len(names), spec))
        bench = os.path.dirname(HERE)
        env = dict(os.environ, SHIELD_ADD=os.path.relpath(os.path.abspath(a.final), bench).replace(os.sep, "/"))
        code = subprocess.call(["bash", "./build-ablation.sh", spec], cwd=bench, env=env)
        if code:
            return code
        write(a.out, candidate_arms(suffix))
    elif a.cmd == "gate":
        ok, m, ci, n, aa, total = gate(a.arms, a.census, a.arm, a.bar, a.low, a.cover)
        verdict = "PASS" if ok else "FAIL"
        est = "no battles" if m is None else "%+.2f +/- %.2f APS" % (m, ci)
        text = ["# Mode table v1: census gate\n\n",
                "%s: %s - pooled c and aa = %s (census-weighted, %d of %d census robots read in all three arms). "
                "Bar: %+.1f with the lower end above %+.1f, and %.0f%% of the census read.\n\n"
                % (verdict, a.arm, est, n, total, a.bar, a.low, 100 * a.cover),
                "A/A: aa - c = %+.2f +/- %.2f, band +/- %.2f: %s.\n"
                % (aa["diff"], aa["ci"], aa["band"], "inside" if aa["ok"] else "OUTSIDE, run not read")
                if aa else "A/A: no aa arm.\n"]
        write(a.out, text)
        print("".join(text))
    return 0


if __name__ == "__main__":
    sys.exit(main())
