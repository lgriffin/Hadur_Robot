"""Hadur against another robot under the same guns: what each gun does to each of us, from the truth logs.

For every battle directory of a multi-arm run (``<opponent>-<seed>-<arm>``) the truth log gives, per round, the
bullets the opponent fired at the arm's robot, which of them really hit (``aes_round.read_outcomes``), the
distance at which each was fired, the bullets the arm's robot fired and the energy both ended the round with.
Per arm and round bucket: bullets aimed a round, their hit rate, damage a round, fire distance, our bullets a
round and the energy trade. Per opponent (and per rank band from the set file): the hit rate paired arm against
arm over the seeds both fought.

Usage: python3 -I data/tools/learn_trace.py WORKDIR --base c --other bb --set SETFILE --out REPORT.md
"""

import argparse
import gzip
import math
import os
import re
import sys
from collections import defaultdict

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
import aes_rank as A  # noqa: E402
import aes_round as R  # noqa: E402

DIR_RE = re.compile(r"^(?P<slug>.+)-(?P<seed>\d+)-(?P<arm>[A-Za-z0-9]+)$")


def read_rounds(path):
    """{round: stats} from a truth log: aimed, hit, dmg, dist (sum at fire), ours, ticks, h_end, e_end."""
    hits = R.read_outcomes(path)
    rounds = defaultdict(lambda: {"aimed": 0, "hit": 0, "dmg": 0.0, "dist": 0.0, "ours": 0, "ticks": 0,
                                  "h_end": 0.0, "e_end": 0.0})
    for (r, first, heading), hit in hits.items():
        pass  # counted below by bullet, where the power is known
    ours = {}
    powers = {}
    try:
        f = gzip.open(path, "rt", encoding="utf-8")
    except OSError:
        return {}
    with f:
        try:
            for line in f:
                p = line.rstrip("\n").split(",")
                if p[0] == "F" and len(p) >= 5 and p[3] == "E":
                    r = int(p[1])
                    rounds[r]["aimed"] += 1
                    powers[(r, int(p[2]) + 1)] = float(p[4])
                elif p[0] == "T" and len(p) >= 13:
                    r, t = int(p[1]), int(p[2])
                    hx, hy, he, ex, ey, ee = (float(p[3]), float(p[4]), float(p[7]), float(p[8]), float(p[9]),
                                              float(p[12]))
                    st = rounds[r]
                    st["ticks"] = t
                    st["h_end"], st["e_end"] = he, ee
                    if (r, t) in powers:
                        st["dist"] += math.hypot(hx - ex, hy - ey)
                    if len(p) > 13 and p[13]:
                        for b in p[13].split(" "):
                            q = b.split(":")
                            if q[0] == "H" and len(q) >= 5:
                                k = (r, round(float(q[3]), 3), round(float(q[4]), 2))
                                if k not in ours:
                                    ours[k] = t
                                    st["ours"] += 1
        except (EOFError, OSError, ValueError):
            pass
    # Hits and their damage: read_outcomes keys hold the heading; the power comes from the F line at first - 1.
    for (r, first, heading), hit in hits.items():
        if not hit:
            continue
        rounds[r]["hit"] += 1
        rounds[r]["dmg"] += A.bullet_damage(powers.get((r, first), 1.0))
    return dict(rounds)


def read_bands(path):
    bands = {}
    if not path:
        return bands
    with open(path, encoding="utf-8") as f:
        for line in f:
            if line.startswith("#") or "|" not in line:
                continue
            name, tag = [x.strip() for x in line.split("|")[:2]]
            m = re.search(r"band(\d+)", tag)
            bands[A.SLUG_RUN.sub("_", name)] = int(m.group(1)) if m else 0
    return bands


def main(argv=None):
    ap = argparse.ArgumentParser(description=__doc__.split("\n\n")[0])
    ap.add_argument("work")
    ap.add_argument("--base", default="c")
    ap.add_argument("--other", required=True)
    ap.add_argument("--set")
    ap.add_argument("--out", required=True)
    args = ap.parse_args(argv)
    bands = read_bands(args.set)
    per = {}  # (arm, slug, seed) -> {round: stats}
    base = os.path.join(args.work, "battles")
    for name in sorted(os.listdir(base)):
        m = DIR_RE.match(name)
        if m is None or m.group("arm") not in (args.base, args.other):
            continue
        rs = read_rounds(os.path.join(base, name, "truth.log.gz"))
        if rs:
            per[(m.group("arm"), m.group("slug"), int(m.group("seed")))] = rs
    arms = [args.base, args.other]
    lines = ["# What the same guns do to %s and to %s" % (args.base, args.other), "",
             "Battles: " + ", ".join("%s %d" % (a, sum(1 for k in per if k[0] == a)) for a in arms), ""]
    # By round bucket.
    lines += ["| arm | rounds | rounds played | aimed/round | hit rate | dmg/round | fire dist | our bullets/round | our energy left/round | their energy left/round |",
              "|---|---|---|---|---|---|---|---|---|---|"]
    for lo, hi in R.BUCKETS:
        for a in arms:
            n = aimed = hit = dmg = dist = ours = hend = eend = 0
            for (arm, slug, seed), rs in per.items():
                if arm != a:
                    continue
                for r, st in rs.items():
                    if lo <= r <= hi:
                        n += 1
                        aimed += st["aimed"]; hit += st["hit"]; dmg += st["dmg"]; dist += st["dist"]
                        ours += st["ours"]; hend += st["h_end"]; eend += st["e_end"]
            if n == 0:
                continue
            lines.append("| %s | %2d-%2d | %d | %.1f | %.3f | %.1f | %.0f | %.1f | %.1f | %.1f |" % (
                a, lo, hi, n, aimed / n, hit / max(1, aimed), dmg / n, dist / max(1, aimed), ours / n,
                hend / n, eend / n))
    # Per opponent, paired over seeds both fought: hit rate, aimed a round, damage a round.
    lines += ["", "## Per opponent, %s minus %s (seeds both fought)" % (args.other, args.base), "",
              "| opponent | band | seeds | hit rate %s | hit rate %s | diff | aimed/round %s | %s | dmg/round %s | %s |"
              % (args.base, args.other, args.base, args.other, args.base, args.other),
              "|---|---|---|---|---|---|---|---|---|---|"]
    slugs = sorted(set(k[1] for k in per))
    diffs, by_band = [], defaultdict(list)
    for slug in slugs:
        seeds = sorted(set(k[2] for k in per if k[1] == slug and (args.base, slug, k[2]) in per
                           and (args.other, slug, k[2]) in per))
        if not seeds:
            continue
        tot = {}
        for a in arms:
            aimed = hit = dmg = n = 0
            for s in seeds:
                for r, st in per[(a, slug, s)].items():
                    n += 1; aimed += st["aimed"]; hit += st["hit"]; dmg += st["dmg"]
            tot[a] = (hit / max(1, aimed), aimed / max(1, n), dmg / max(1, n))
        d = tot[args.other][0] - tot[args.base][0]
        diffs.append(d)
        band = bands.get(slug, 0)
        by_band[band].append((tot[args.base], tot[args.other]))
        lines.append("| %s | %d | %d | %.3f | %.3f | %+.3f | %.1f | %.1f | %.1f | %.1f |" % (
            slug, band, len(seeds), tot[args.base][0], tot[args.other][0], d, tot[args.base][1],
            tot[args.other][1], tot[args.base][2], tot[args.other][2]))
    if diffs:
        m = sum(diffs) / len(diffs)
        sd = (sum((x - m) ** 2 for x in diffs) / max(1, len(diffs) - 1)) ** 0.5
        lines += ["", "mean hit-rate diff %+.4f +- %.4f (95%%), %s lower on %d of %d opponents" % (
            m, 1.96 * sd / len(diffs) ** 0.5, args.other, sum(1 for x in diffs if x < 0), len(diffs))]
    lines += ["", "## By rank band (mean over the band's opponents)", "",
              "| band | opponents | hit rate %s | hit rate %s | aimed/round %s | %s | dmg/round %s | %s |"
              % (args.base, args.other, args.base, args.other, args.base, args.other), "|---|---|---|---|---|---|---|---|"]
    for band in sorted(by_band):
        rows = by_band[band]
        n = len(rows)
        mean = lambda i, j: sum(r[i][j] for r in rows) / n
        lines.append("| %d | %d | %.3f | %.3f | %.1f | %.1f | %.1f | %.1f |" % (
            band, n, mean(0, 0), mean(1, 0), mean(0, 1), mean(1, 1), mean(0, 2), mean(1, 2)))
    os.makedirs(os.path.dirname(os.path.abspath(args.out)), exist_ok=True)
    with open(args.out, "w", encoding="utf-8") as f:
        f.write("\n".join(lines) + "\n")
    print("\n".join(lines))


if __name__ == "__main__":
    main()
