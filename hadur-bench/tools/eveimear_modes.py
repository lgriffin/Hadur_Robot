#!/usr/bin/env python3
"""Eveimear mode picks, round 2 (pc-eveimear-st2, BENCH-180): fit a mode for the robots 0.2 left on the detection.

Eveimear 0.2 keeps one char a robot in MODES (cell = name.hashCode() & MASK) that scales the damage threshold at
which stop-and-go gives way to random orbit: 1 the detection (0.1), 9 stop-and-go for good, 0 random from the first
hit. pc-eveimear-st picked them from 2 seeds a mode, so only 100 of 515 robots cleared its 3-point margin; the other
415 kept 1. This tool writes the panel of those 415, the forced arms, and the build that applies new picks.

  panel SRC FIELD OUT --pilot PILOT --rest REST [--every 5] [--broken FILE]
        FIELD's robots whose 0.2 cell holds 1, less the robots that do not load on 1.11.2; PILOT takes every 5th,
        REST the others (pilot + rest = OUT, so the screen never refights a pilot battle).
  force SRC OUT --char {0,9}      every cell set to the char (an arm that plays that mode against every robot)
  apply SRC PICK.tsv OUT --field FIELD [--arm-char rn=0 --arm-char sg=9]
        0.2 with each picked robot's cell set to its arm's char. A cell another FIELD robot shares is left alone
        unless every robot on it picked the same char, so no robot outside the picks changes mode.
  pilot ARMS.tsv --margin 3 --out FILE
        the pilot's read: real picks (rn, sg against c and aa pooled) and null picks (aa against c alone, the same
        test on two copies of one jar). Exit 0 when the real picks are at least 2 x null + 3, else exit 3: no gain
        over noise, so the card skips the rest (Leigh's 20% pilot rule).
"""
import argparse
import os
import re
import sys

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
sys.path.insert(0, os.path.join(os.path.dirname(os.path.abspath(__file__)), "..", "..", "data", "tools"))
from kitlab_prior_arm import java, unjava  # noqa: E402
from distill import cell  # noqa: E402

MODES_RE = re.compile(r'\bMODES\s*=\s*"((?:[^"\\]|\\.)*)"')


def read_src(path):
    src = open(path).read()
    m = MODES_RE.search(src)
    if not m:
        sys.exit("%s: no MODES table" % path)
    mask = int(re.search(r"\bMASK\s*=\s*(\d+)", src).group(1))
    modes = unjava(m.group(1))
    if len(modes) != mask + 1:
        sys.exit("%s: MODES holds %d chars, MASK %d" % (path, len(modes), mask))
    return src, m, mask, modes


def write_src(src, m, modes, out):
    open(out, "w").write(src[:m.start(1)] + java(modes) + src[m.end(1):])


def field_lines(path):
    return [l for l in open(path, encoding="utf-8") if l.strip() and not l.startswith("#")]


def name_of(line):
    return line.split("|")[0].strip()


def broken(path):
    if not path or not os.path.exists(path):
        return set()
    return {name_of(l) for l in open(path, encoding="utf-8") if l.strip() and not l.startswith("#")}


def cmd_panel(a):
    _, _, mask, modes = read_src(a.src)
    skip = broken(a.broken)
    rows = [l for l in field_lines(a.field) if name_of(l) not in skip and not name_of(l).startswith("hadur117.")
            and modes[cell(name_of(l), mask)] == 1]
    head = "# eveimear_modes.py panel: the %d robots of %s whose Eveimear 0.2 MODES cell holds 1 (the detection)" % (
        len(rows), os.path.basename(a.field))
    with open(a.out, "w") as f:
        f.write(head + ", none in broken-1.11.2.txt.\n")
        f.writelines(rows)
    pilot = rows[::a.every]
    with open(a.pilot, "w") as f:
        f.write(head + "; pilot: every %dth, %d robots.\n" % (a.every, len(pilot)))
        f.writelines(pilot)
    rest = [l for i, l in enumerate(rows) if i % a.every]
    with open(a.rest, "w") as f:
        f.write(head + "; the robots not in the pilot, %d.\n" % len(rest))
        f.writelines(rest)
    print("panel %d robots -> %s; pilot %d -> %s; rest %d -> %s" % (len(rows), a.out, len(pilot), a.pilot,
                                                                    len(rest), a.rest))


def cmd_force(a):
    src, m, mask, modes = read_src(a.src)
    write_src(src, m, [a.char] * len(modes), a.out)
    print("%s: every cell %d" % (a.out, a.char))


def cmd_apply(a):
    src, m, mask, modes = read_src(a.src)
    chars = dict((k, int(v)) for k, v in (s.split("=") for s in a.arm_char))
    picks = {}
    for l in open(a.pick, encoding="utf-8"):
        if l.strip() and not l.startswith("#"):
            name, arm = l.split("\t")[:2]
            if arm not in chars:
                sys.exit("%s: arm %s has no char (--arm-char)" % (a.pick, arm))
            picks[name.strip()] = chars[arm]
    on_cell = {}
    for l in field_lines(a.field):
        on_cell.setdefault(cell(name_of(l), mask), []).append(name_of(l))
    done = skipped = 0
    for name, ch in sorted(picks.items()):
        c = cell(name, mask)
        if all(picks.get(o) == ch for o in on_cell.get(c, [name])):
            modes[c] = ch
            done += 1
        else:
            skipped += 1
            print("left alone (cell shared): %s" % name)
    write_src(src, m, modes, a.out)
    print("%s: %d picks written, %d left alone" % (a.out, done, skipped))


def cmd_pilot(a):
    from mode_table import load, pick
    share = load([a.arms])
    real, opps = pick(share, "c", "aa", a.margin)
    null_share = {"c": share.get("c", {}), "aa_null": share.get("aa", {})}
    null, _ = pick(null_share, "c", "none", a.margin)
    bar = 2 * len(null) + 3
    ok = len(real) >= bar
    gain = sum(e[1] for e in real.values())
    text = "\n".join([
        "# Eveimear mode picks: pilot read", "",
        "Robots read: %d. Margin %.1f points with the interval above 0." % (len(opps), a.margin), "",
        "- Real picks (rn, sg against c and aa pooled): %d, in-sample %+.2f points over the panel." % (
            len(real), gain / max(1, len(opps))),
        "- Null picks (aa against c, two copies of one jar): %d." % len(null),
        "- Bar: real picks at least 2 x null + 3 = %d. %s" % (
            bar, "PASS: the full screen runs." if ok else "STOP: no more picks than noise makes; the rest skips."),
        ""])
    open(a.out, "w").write(text)
    print(text)
    return 0 if ok else 3


def main():
    ap = argparse.ArgumentParser()
    sub = ap.add_subparsers(dest="cmd", required=True)
    p = sub.add_parser("panel"); p.add_argument("src"); p.add_argument("field"); p.add_argument("out")
    p.add_argument("--pilot", required=True); p.add_argument("--rest", required=True)
    p.add_argument("--every", type=int, default=5)
    p.add_argument("--broken", default=os.path.join(os.path.dirname(os.path.abspath(__file__)), "..",
                                                    "broken-1.11.2.txt"))
    p = sub.add_parser("force"); p.add_argument("src"); p.add_argument("out")
    p.add_argument("--char", type=int, choices=(0, 9), required=True)
    p = sub.add_parser("apply"); p.add_argument("src"); p.add_argument("pick"); p.add_argument("out")
    p.add_argument("--field", required=True)
    p.add_argument("--arm-char", action="append", default=None)
    p = sub.add_parser("pilot"); p.add_argument("arms"); p.add_argument("--margin", type=float, default=3.0)
    p.add_argument("--out", required=True)
    a = ap.parse_args()
    if a.cmd == "apply" and not a.arm_char:
        a.arm_char = ["rn=0", "sg=9"]
    return {"panel": cmd_panel, "force": cmd_force, "apply": cmd_apply, "pilot": cmd_pilot}[a.cmd](a) or 0


if __name__ == "__main__":
    sys.exit(main())
