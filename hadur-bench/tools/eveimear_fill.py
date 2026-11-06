#!/usr/bin/env python3
"""Write a copy of Eveimear's source with every MODES cell set to one value (cloud-eveimear-st5).

    python3 tools/eveimear_fill.py SRC VALUE OUT

VALUE is the threshold multiplier the robot reads with MODES.charAt(name.hashCode() >>> 18): 1 is
Cotillion's own switch, 9 holds stop-and-go, 0 goes random from the first hit. The table keeps its
16,384 cells, so the build is the same size as the shipped one.
"""
import re
import sys


def fill(src, value):
    m = re.search(r'static final String MODES = "((?:[^"\\]|\\.)*)";', src)
    if not m:
        raise SystemExit("eveimear_fill: no MODES constant")
    return src[:m.start(1)] + ("\\%o" % value) * 16384 + src[m.end(1):]


if __name__ == "__main__":
    s, v, out = sys.argv[1], int(sys.argv[2]), sys.argv[3]
    open(out, "w", encoding="utf-8", newline="\n").write(fill(open(s, encoding="utf-8").read(), v))
