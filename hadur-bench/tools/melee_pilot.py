#!/usr/bin/env python3
"""BENCH-178: the melee pilot read. Pairs each arm battle with its --baseline battle (same field,
same seed) and passes only when the pilot is complete (at least 95% of the expected pairs, each with
the run's rounds) and the arm shows a gain: Hadur's mean score share up and its crowd deaths (rounds
it finished third or worse, so it died with two or more opponents left) down, both as point estimates (with --share-only, the share alone: BENCH-186). A pilot is a cheap early look, not a gate: it stops a card that shows nothing in its first
~20%, and the full card still has to pass the melee gate.

    python3 tools/melee_pilot.py <run dir> --out pilot.md   (exit 0 pass, 1 no gain, 2 no data)
"""
import argparse
import csv
import glob
import os
import statistics
import sys


def battle(d):
    """Hadur's score share (percent), crowd deaths (percent of rounds) and rounds in one battle dir."""
    with open(os.path.join(d, 'melee.csv')) as f:
        rows = list(csv.DictReader(f))
    total = sum(float(r['score']) for r in rows)
    mine = [r for r in rows if r['robot'].startswith('hadur117.')]
    if not mine or total <= 0:
        return None
    with open(os.path.join(d, 'rounds.csv')) as f:
        rounds = list(csv.DictReader(f))
    if not rounds:
        return None
    crowd = sum(1 for r in rounds if int(r['place']) >= 3)
    return 100.0 * float(mine[0]['score']) / total, 100.0 * crowd / len(rounds), len(rounds)


def pairs(root, rounds=None):
    out = []
    for base in sorted(glob.glob(os.path.join(root, '**', 'battles', 'melee-*-baseline'), recursive=True)):
        arm = base[:-len('-baseline')]
        try:
            a, b = battle(arm), battle(base)
        except (OSError, KeyError, ValueError):
            continue
        if a and b and (rounds is None or (a[2] == rounds and b[2] == rounds)):
            out.append((a, b))
    return out


def ci(xs):
    return 1.96 * statistics.stdev(xs) / len(xs) ** 0.5 if len(xs) > 1 else float('inf')


def read(root, expect=None, rounds=None, share_only=False):
    p = pairs(root, rounds)
    if not p or (expect and len(p) < 0.95 * expect):
        return dict(battles=len(p), incomplete=True)
    share = [a[0] - b[0] for a, b in p]
    crowd = [a[1] - b[1] for a, b in p]
    return dict(battles=len(p), share=statistics.mean(share), share_ci=ci(share),
                crowd=statistics.mean(crowd), crowd_ci=ci(crowd),
                passed=statistics.mean(share) > 0 and (share_only or statistics.mean(crowd) < 0), incomplete=False)


def main(argv=None):
    ap = argparse.ArgumentParser()
    ap.add_argument('root')
    ap.add_argument('--out', required=True)
    ap.add_argument('--title', default='Melee pilot')
    ap.add_argument('--expect', type=int, help='the pairs the pilot schedules; under 95% of them is no data')
    ap.add_argument('--rounds', type=int, help='the rounds a battle fights; a shorter one is left out')
    ap.add_argument('--share-only', action='store_true',
                    help='BENCH-186: pass on the score share alone, for a lever not aimed at crowd deaths')
    a = ap.parse_args(argv)
    r = read(a.root, a.expect, a.rounds, a.share_only)
    with open(a.out, 'w') as f:
        f.write(f'# {a.title}\n\n')
        if r['incomplete']:
            f.write(f"Only {r['battles']} complete paired battles of {a.expect or 'the expected'} were found, "
                    'so the card stops here (no data, BENCH-178).\n')
            return 2
        verdict = 'PASS: the full card runs' if r['passed'] else 'NO GAIN: the card stops here'
        f.write(f"{r['battles']} paired battles (arm against its baseline, same field and seed).\n\n"
                '| Measure | Arm minus baseline |\n|---|---|\n'
                f"| Hadur's score share | {r['share']:+.2f} ± {r['share_ci']:.2f} points |\n"
                f"| Crowd deaths | {r['crowd']:+.2f} ± {r['crowd_ci']:.2f} points of rounds |\n\n"
                f'**{verdict}.** The pilot passes when the score share is up and crowd deaths are down '
                '(point estimates, BENCH-178).\n')
    return 0 if r['passed'] else 1


if __name__ == '__main__':
    sys.exit(main())
