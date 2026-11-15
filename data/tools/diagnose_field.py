"""Why each robot beats us more than it beats BeepBoop: a per-robot diagnosis from a multi-arm run's truth logs.

For every battle directory (``<opponent>-<seed>-<arm>``) of the base arm (Hadur) and the other arm (BeepBoop), the
truth log gives each turn both robots' place, velocity and energy and every bullet on the field. Per robot and arm:

  power      mean power of the arm's own new bullets          fires     the arm's bullets a round
  still      share of turns the arm stands (|v| < 0.5)          dist      mean distance between the robots
  wall       share of turns the arm is within 60 px of a wall  ticks     turns a round
  aimed      the opponent's bullets a round                     hit       their hit rate on the arm
  taken      their bullet damage a round on the arm            dealt     the arm's bullet damage a round (arm row)
  surv       the arm's survival share (arm row)               share     the arm's score share (arm row)

Each robot then gets one or more diagnoses, BeepBoop's play read against ours, each with the line type that fits:

  SHIELD  BeepBoop stands still (still >= 0.5) and we move (still < 0.3): shield list + stand still (mtzl)
  SHQ     both stand still, yet they hit us 2x as often: shield quality (exit / leak), no line yet
  CAP     BeepBoop fires <= 0.6x our power in a long round: power cap (pk 0.2 under 0.35, else p5 0.5)
  HARD    BeepBoop fires >= 1.4x our power: harder power floor, no line yet
  MOVE    BeepBoop moves (still < 0.3) and their hit rate on it is <= 0.7x ours: movement (flat / surf keys)
  DIST    BeepBoop fights 80+ px from our distance: distance line, none yet
  WALL    BeepBoop spends 15+ points more of its turns near a wall: wall line, none yet
  GUN     BeepBoop deals >= 1.25x our damage a round: gun (gun stack / x5)

Robots are sorted by the ledger's live gap to BeepBoop (``--ledger``), so the classes read as points to win.

Usage: python3 -I data/tools/diagnose_field.py WORKDIR --base c --other bb [--ledger hadur-bench/field-ledger.tsv]
           --out REPORT.md --out-tsv TABLE.tsv
"""

import argparse
import gzip
import math
import os
import re
import sys
from collections import defaultdict

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
import learn_trace as L  # noqa: E402

DIR_RE = L.DIR_RE
W, H, WALL = 800.0, 600.0, 60.0
LEVEL = 2.0  # bench points BeepBoop must lead by for a robot to enter the classes
METRICS = ["power", "fires", "still", "dist", "wall", "ticks", "aimed", "hit", "taken", "dealt", "surv", "share"]
FIX = {"SHIELD": "mtzl: shield list + stand still", "SHQ": "shield quality (no line yet)",
       "CAP": "pk / p5: power cap", "HARD": "power floor (no line yet)", "MOVE": "fq flat / surf keys",
       "DIST": "distance (no line yet)", "WALL": "wall (no line yet)", "GUN": "gl gun stack / x5"}


def read_motion(path):
    """Per battle sums from a truth log: turns, still turns, wall turns, distance sum, own new bullets and their
    power sum, rounds; None when the log is missing or does not parse to its end."""
    s = {"turns": 0, "still": 0, "wall": 0, "dist": 0.0, "fires": 0, "power": 0.0, "rounds": set()}
    try:
        f = gzip.open(path, "rt", encoding="utf-8")
    except OSError:
        return None
    live, last_round = set(), None
    with f:
        try:
            for line in f:
                if not line.startswith("T,"):
                    continue
                p = line.rstrip("\n").split(",")
                if len(p) < 13:
                    continue
                r = int(p[1])
                hx, hy, hv, ex, ey = float(p[3]), float(p[4]), float(p[6]), float(p[8]), float(p[9])
                if r != last_round:
                    live, last_round = set(), r
                s["rounds"].add(r)
                s["turns"] += 1
                if abs(hv) < 0.5:
                    s["still"] += 1
                if min(hx, hy, W - hx, H - hy) < WALL:
                    s["wall"] += 1
                s["dist"] += math.hypot(hx - ex, hy - ey)
                now = set()
                if len(p) > 13 and p[13]:
                    for b in p[13].split(" "):
                        q = b.split(":")
                        if q[0] == "H" and len(q) >= 5:
                            now.add((round(float(q[3]), 3), round(float(q[4]), 2)))
                for key in now - live:
                    s["fires"] += 1
                    s["power"] += key[1]
                live = now
        except (EOFError, OSError, ValueError):
            return None
    return s


def arm_row(dirpath):
    """(rounds, bulletDamage, survival_share, score_share) from the battle's arm-row.tsv."""
    with open(os.path.join(dirpath, "arm-row.tsv"), encoding="utf-8") as f:
        row = f.readline().rstrip("\n").split("\t")
    return int(row[8]), float(row[17]), float(row[12]), float(row[11])


def battle(dirpath):
    m = read_motion(os.path.join(dirpath, "truth.log.gz"))
    rs = L.read_rounds(os.path.join(dirpath, "truth.log.gz"))
    if not m or not rs or not m["turns"]:
        return None
    rounds, dealt, surv, share = arm_row(dirpath)
    n = max(1, len(m["rounds"]))
    aimed = sum(v["aimed"] for v in rs.values())
    return {"power": m["power"] / m["fires"] if m["fires"] else 0.0, "fires": m["fires"] / n,
            "still": m["still"] / m["turns"], "dist": m["dist"] / m["turns"], "wall": m["wall"] / m["turns"],
            "ticks": m["turns"] / n, "aimed": aimed / n,
            "hit": sum(v["hit"] for v in rs.values()) / aimed if aimed else 0.0,
            "taken": sum(v["dmg"] for v in rs.values()) / n, "dealt": dealt / max(1, rounds),
            "surv": surv, "share": share}


def mean(xs):
    return sum(xs) / len(xs) if xs else 0.0


def diagnose(c, b):
    """The diagnosis codes for one robot, our means c against BeepBoop's b."""
    out = []
    if b["still"] >= 0.5 and c["still"] < 0.3:
        out.append("SHIELD")
    if b["still"] >= 0.5 and c["still"] >= 0.5 and c["hit"] >= 2 * b["hit"] and c["hit"] > 0.01:
        out.append("SHQ")
    if c["power"] > 0 and b["power"] <= 0.6 * c["power"] and b["ticks"] >= 800:
        out.append("CAP")
    if c["power"] > 0 and b["power"] >= 1.4 * c["power"]:
        out.append("HARD")
    if b["still"] < 0.3 and c["hit"] > 0.01 and b["hit"] <= 0.7 * c["hit"]:
        out.append("MOVE")
    if abs(b["dist"] - c["dist"]) >= 80:
        out.append("DIST")
    if b["wall"] - c["wall"] >= 0.15:
        out.append("WALL")
    if c["dealt"] > 0 and b["dealt"] >= 1.25 * c["dealt"]:
        out.append("GUN")
    return out


def read_ledger(path):
    gaps, lined = {}, {}
    if not path:
        return gaps, lined
    with open(path, encoding="utf-8") as f:
        head = f.readline().rstrip("\n").split("\t")
        gi, li = head.index("gap_bb"), head.index("levers")
        for line in f:
            p = line.rstrip("\n").split("\t")
            try:
                gaps[L.battle_slug(p[0])] = float(p[gi])
            except (ValueError, IndexError):
                continue
            lined[L.battle_slug(p[0])] = p[li] if li < len(p) else ""
    return gaps, lined


def main(argv=None):
    ap = argparse.ArgumentParser(description=__doc__.split("\n\n")[0])
    ap.add_argument("work")
    ap.add_argument("--base", default="c")
    ap.add_argument("--other", default="bb")
    ap.add_argument("--ledger")
    ap.add_argument("--out", required=True)
    ap.add_argument("--out-tsv", required=True)
    args = ap.parse_args(argv)
    per = defaultdict(lambda: defaultdict(dict))  # slug -> arm -> seed -> battle stats
    base = os.path.join(args.work, "battles")
    for name in sorted(os.listdir(base)):
        m = DIR_RE.match(name)
        if m is None or m.group("arm") not in (args.base, args.other) or not L.battle_ok(os.path.join(base, name)):
            continue
        st = battle(os.path.join(base, name))
        if st:
            per[m.group("slug")][m.group("arm")][int(m.group("seed"))] = st
    gaps, lined = read_ledger(args.ledger)
    rows = []
    for slug, arms in per.items():
        if args.base not in arms or args.other not in arms:
            continue
        seeds = sorted(set(arms[args.base]) & set(arms[args.other]))  # only seeds both arms fought
        if not seeds:
            continue
        c = {k: mean([arms[args.base][sd][k] for sd in seeds]) for k in METRICS}
        b = {k: mean([arms[args.other][sd][k] for sd in seeds]) for k in METRICS}
        rows.append((gaps.get(slug, float("nan")), slug, c, b, diagnose(c, b), lined.get(slug, "")))
    rows.sort(key=lambda r: -(r[0] if r[0] == r[0] else -1e9))
    with open(args.out_tsv, "w", encoding="utf-8") as f:
        f.write("\t".join(["robot", "gap_bb", "diagnosis", "levers"]
                          + ["c_" + k for k in METRICS] + ["bb_" + k for k in METRICS]) + "\n")
        for gap, slug, c, b, d, lv in rows:
            f.write("\t".join([slug, "%.2f" % gap, ",".join(d) or "-", lv]
                              + ["%.4f" % c[k] for k in METRICS] + ["%.4f" % b[k] for k in METRICS]) + "\n")
    classes = defaultdict(list)
    level = 0
    for r in rows:
        if 100 * (r[3]["share"] - r[2]["share"]) < LEVEL:
            level += 1
            continue
        for d in (r[4] or ["NONE"]):
            classes[d].append(r)
    lines = ["# Field diagnosis: %s against %s" % (args.base, args.other), "",
             "Robots read: %d (both arms with a truth log). Gap = live gap to BeepBoop from the ledger; bench = BeepBoop's"
             " score share minus ours in this run. %d robots where BeepBoop is not %.0f+ points ahead in this run are"
             " left out of the classes." % (len(rows), level, LEVEL),
             "", "## Classes", "", "| Diagnosis | Line type that fits | Robots | Gap 5+ | Gap sum (pts) | Bench gap sum (pts) |",
             "|---|---|---:|---:|---:|---:|"]
    for d in sorted(classes, key=lambda k: -sum(r[0] for r in classes[k] if r[0] == r[0] and r[0] > 0)):
        rs = classes[d]
        lines.append("| %s | %s | %d | %d | %.1f | %.1f |" % (
            d, FIX.get(d, "-"), len(rs), sum(1 for r in rs if r[0] >= 5),
            sum(r[0] for r in rs if r[0] == r[0] and r[0] > 0), sum(100 * (r[3]["share"] - r[2]["share"]) for r in rs)))
    lines += ["", "## Robots, biggest gap first (c / bb)", "",
              "| Robot | Gap | Bench | Diagnosis | Lines now | Power | Still | Dist | Wall | Ticks | Their hit | Taken/rd | Dealt/rd | Share |",
              "|---|---:|---:|---|---|---|---|---|---|---|---|---|---|---|"]
    for gap, slug, c, b, d, lv in rows:
        lines.append("| %s | %.1f | %.1f | %s | %s | %.2f / %.2f | %.2f / %.2f | %.0f / %.0f | %.2f / %.2f | %.0f / %.0f | %.3f / %.3f | %.1f / %.1f | %.1f / %.1f | %.1f / %.1f |" % (
            slug, gap, 100 * (b["share"] - c["share"]), " ".join(d) or "-", lv or "-", c["power"], b["power"], c["still"], b["still"], c["dist"], b["dist"],
            c["wall"], b["wall"], c["ticks"], b["ticks"], c["hit"], b["hit"], c["taken"], b["taken"], c["dealt"],
            b["dealt"], 100 * c["share"], 100 * b["share"]))
    with open(args.out, "w", encoding="utf-8") as f:
        f.write("\n".join(lines) + "\n")


if __name__ == "__main__":
    main()
