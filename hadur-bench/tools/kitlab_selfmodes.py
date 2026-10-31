#!/usr/bin/env python3
"""Per-opponent movement modes for Eveimear, learned from its own battles (pc-eveimear-st).

Eveimear 0.1 is run three times on the whole MicroRumble field, once in each mode: as released (the
detection: stop-and-go until the enemy's hits have won back 40 + 23 a round, then random), with
stop-and-go held for good, and moving at random from the first hit. For each opponent this keeps
the mode with the best mean score share, but leaves the detection unless another mode beats it by
more than --margin points (one battle a seed is noisy; a pick that only just wins is as likely
noise as a gain). It writes the name<TAB>char TSV that `tools/distill.py hash --raw` packs into
kitlab/arms/Eveimear-st.java, where the char scales the detection's threshold:

  1  the detection (0.1), and the default for a robot with no data
  9  stop-and-go for good (the threshold is nine times 0.1's: never reached in practice)
  0  random from the first hit

  python3 tools/kitlab_selfmodes.py kitlab/micro-all-field.txt work/kitlab-st-E01 work/kitlab-st-SG \
      work/kitlab-st-RN --out work/eveimear-st/modes.tsv [--margin 3]
"""
import argparse
import os
import sys

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
from kitlab_read import load_set, shares  # noqa: E402

CHARS = (("1", "detection"), ("9", "stop-and-go"), ("0", "random"))


def mean(xs):
    return sum(xs) / len(xs) if xs else None


def pick(means, margin):
    """The char for one opponent from its {char: mean share}: the detection unless another mode
    beats it by more than margin."""
    base = means.get("1")
    if base is None:
        return "1"
    best, best_v = "1", base
    for c, _ in CHARS[1:]:
        v = means.get(c)
        if v is not None and v > best_v and v - base > margin:
            best, best_v = c, v
    return best


def main():
    ap = argparse.ArgumentParser()
    ap.add_argument("set")
    ap.add_argument("detection")
    ap.add_argument("stopgo")
    ap.add_argument("random")
    ap.add_argument("--margin", type=float, default=3.0, help="score-share points another mode must win by")
    ap.add_argument("--out", required=True)
    a = ap.parse_args()
    rows = load_set(a.set)
    runs = dict(zip("190", (shares(a.detection), shares(a.stopgo), shares(a.random))))
    picks, gain = {}, {}
    for name, w, stem in rows:
        means = {c: mean(runs[c].get(stem, [])) for c in runs}
        means = {c: v for c, v in means.items() if v is not None}
        c = pick(means, a.margin)
        picks[name] = c
        if c != "1":
            gain[name] = means[c] - means["1"]
    os.makedirs(os.path.dirname(a.out) or ".", exist_ok=True)
    with open(a.out, "w") as f:
        f.write("# tools/kitlab_selfmodes.py: Eveimear 0.1's own best mode per robot, margin %g; "
                "1 detection, 9 stop-and-go for good, 0 random from the first hit\n" % a.margin)
        for name, _, _ in rows:
            f.write("%s\t%s\n" % (name, picks[name]))
    counts = {c: sum(1 for v in picks.values() if v == c) for c, _ in CHARS}
    print("%s: %d robots: %s; in-sample gain of the picks %.2f a robot over the field (an upper bound)"
          % (a.out, len(picks), ", ".join("%s %d" % (label, counts[c]) for c, label in CHARS),
             sum(gain.values()) / max(1, len(picks))))


if __name__ == "__main__":
    main()
