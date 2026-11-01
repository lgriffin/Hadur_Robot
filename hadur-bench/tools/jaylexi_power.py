#!/usr/bin/env python3
"""A Hadur-taught bullet-power table for JayLexi 0.3 (pc-jaylexi-pt).

JayLexi 0.3 fires min(POWER.charAt((int) (distance / 50)), energy / 15, enemyEnergy / 4 + 0.1),
with POWER = 3 under 150 px and 2 beyond: 24 whole-power chars, 0.2's rule. Sanaro's Hadur-taught
power table passed twice (n06 HS +0.55, n07 HL +0.67, taught in the fields it is scored in). This
reads Hadur 3.20's own shots from truth logs of Hadur on the MiniRumble field (LogHarvester BENCH-97:
each T line holds both robots and every bullet; an own bullet `H` is new when it sits within one
step of Hadur and is not last tick's bullet moved one step on) and writes Hadur's typical power per 50 px band into POWER, in one of two forms:

  whole   whole powers 1..3 (the median rounded), the string only: 0 B, JayLexi's line unchanged
  tenths  tenths 1..30, read as POWER.charAt(...) / 10.0: about 4 B more

A band with fewer than --min shots keeps 0.3's own value. Only shots fired while both robots had
more than --energy energy count, so JayLexi's own energy clamps (which stay) are not taught twice.

  python3 tools/jaylexi_power.py 'work/kitlab-pt-teach/battles/*/truth.log.gz' \
      --src ../jaylexi/src/main/java/hadur117/mini/JayLexi.java --mode tenths --out work/JayLexi-PT.java
"""
import argparse
import glob
import gzip
import math
import os
import re
import statistics
import sys

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
from kitlab_prior_arm import java, unjava  # noqa: E402

BANDS = 24          # (int) (distance / 50): 0..23 covers 1,200 px, past the 800 x 600 diagonal
BAND = 50.0
OLD_RULE = [3 if b * BAND < 150 else 2 for b in range(BANDS)]
DECL = re.compile(r'POWER = "((?:[^"\\]|\\.)*)"')
USE = "POWER.charAt((int) (distance / 50))"


def lines(f):
    try:
        yield from f
    except EOFError:
        return


def shots(paths, energy_floor):
    """Yields (distance, power) for each of Hadur's own shots, from the tick before it appeared."""
    files = []
    for p in paths:
        files += sorted(glob.glob(p)) or ([p] if os.path.exists(p) else [])
    if not files:
        raise SystemExit("jaylexi_power: no truth log matches %s" % " ".join(paths))
    for path in files:
        prev = None
        with gzip.open(path, 'rt') as f:
            for line in lines(f):
                if line[0] != 'T':
                    continue
                p = line.rstrip('\n').split(',')
                r = int(p[1])
                me = [float(v) for v in p[3:8]]
                en = [float(v) for v in p[8:13]]
                own = []
                for tok in (p[13].split() if len(p) > 13 else []):
                    o, bx, by, bh, bp = tok.split(':')
                    if o == 'H':
                        own.append((float(bx), float(by), float(bh), float(bp)))
                if prev is not None and prev[0] == r:
                    pme, pen, pown = prev[1], prev[2], prev[3]
                    for bx, by, bh, power in own:
                        step = 20 - 3 * power
                        # The log carries no bullet id, so a bullet already seen is the one a
                        # bullet of last tick reaches in one step along its heading.
                        if any(pp == power and math.hypot(px + step * math.sin(ph) - bx,
                                                          py + step * math.cos(ph) - by) < 1.5
                               for px, py, ph, pp in pown):
                            continue
                        # A bullet fired this tick sits within one step of the gun (Hadur's centre).
                        if math.hypot(bx - pme[0], by - pme[1]) > step + 2:
                            continue
                        if pme[4] <= energy_floor or pen[4] <= energy_floor:
                            continue
                        yield math.hypot(pen[0] - pme[0], pen[1] - pme[1]), power
                prev = (r, me, en, own)


def table(rows, mode, minimum):
    by_band = [[] for _ in range(BANDS)]
    for d, power in rows:
        b = int(d / BAND)
        if b < BANDS:
            by_band[b].append(power)
    out, taught, report = [], 0, []
    for b, ps in enumerate(by_band):
        rule = OLD_RULE[b] * (10 if mode == 'tenths' else 1)
        if len(ps) >= minimum:
            m = statistics.median(ps)
            v = max(1, min(30, int(round(m * 10)))) if mode == 'tenths' else max(1, min(3, int(round(m))))
            taught += 1
        else:
            m, v = None, rule
        out.append(v)
        report.append((b, len(ps), m, rule, v))
    return out, taught, report


def main():
    ap = argparse.ArgumentParser()
    ap.add_argument("logs", nargs="+")
    ap.add_argument("--src", required=True, help="JayLexi 0.3's JayLexi.java (the POWER string form)")
    ap.add_argument("--mode", choices=("whole", "tenths"), required=True)
    ap.add_argument("--min", type=int, default=200, help="shots a band needs before Hadur's power replaces 0.3's")
    ap.add_argument("--energy", type=float, default=16, help="only shots with both robots above this energy")
    ap.add_argument("--out", required=True)
    a = ap.parse_args()
    rows = list(shots(a.logs, a.energy))
    if not rows:
        raise SystemExit("jaylexi_power: no Hadur shots read")
    values, taught, report = table(rows, a.mode, a.min)
    src = open(a.src).read()
    m = DECL.search(src)
    if not m or src.count(USE) != 1:
        raise SystemExit("jaylexi_power: %s has no POWER string or not one '%s' (is it 0.3?)" % (a.src, USE))
    if unjava(m.group(1)) != OLD_RULE:
        raise SystemExit("jaylexi_power: %s's POWER is not 0.3's 3/2 rule" % a.src)
    src = src[:m.start(1)] + java(values) + src[m.end(1):]
    if a.mode == 'tenths':
        src = src.replace(USE, USE + " / 10.0")
    os.makedirs(os.path.dirname(a.out) or ".", exist_ok=True)
    open(a.out, "w").write(src)
    print("%s: %d Hadur shots, %d of %d bands from Hadur (min %d, mode %s)" % (a.out, len(rows), taught, BANDS, a.min, a.mode))
    for b, n, med, rule, v in report:
        print("  %4d-%4d px  shots %6d  Hadur median %s  0.3 %s  table %s"
              % (b * BAND, (b + 1) * BAND, n, "%.2f" % med if med is not None else "  -  ",
                 rule / (10.0 if a.mode == 'tenths' else 1), v / (10.0 if a.mode == 'tenths' else 1)))


if __name__ == "__main__":
    try:
        main()
    except BrokenPipeError:
        pass
