#!/usr/bin/env python3
"""Split the damage Hadur takes in melee by what its surfer saw of each shot (MMOVE-26).

    python3 tools/melee_hits.py DIR [DIR...] [--floor 0.1] [--top 12]

Reads every battles/*/hadur.log under the directories given and aggregates the MH records
(MH,round,tick,shooter,damage,distance,seen,nearer,weight,alive): the damage from shots the
World inferred and the surfer weighed (weight at or above the floor), from inferred shots the
surfer dropped as aimed at someone nearer the shooter (weight under the floor), and from hits
no inferred shot explains (unseen). Then the same split by how many opponents were alive, by
the number of robots nearer the shooter than Hadur, and the shooters that hurt most.
"""
import argparse, glob, os, sys
from collections import defaultdict


def records(dirs):
    for d in dirs:
        for log in glob.glob(os.path.join(d, '**', 'hadur.log'), recursive=True):
            with open(log, errors='replace') as f:
                for line in f:
                    parts = line.rstrip('\n').split(',')
                    # The adapter prefixes each record with round,tick.
                    for i, p in enumerate(parts[:4]):
                        if p == 'MH':
                            parts = parts[i:]
                            break
                    else:
                        continue
                    if len(parts) < 10:
                        continue
                    try:
                        yield dict(log=log, round=int(parts[1]), tick=int(parts[2]), shooter=parts[3],
                                   damage=float(parts[4]), distance=parts[5], seen=parts[6] == '1',
                                   nearer=int(parts[7]), weight=float(parts[8]), alive=int(parts[9]))
                    except ValueError:
                        continue


def bucket(r, floor):
    if not r['seen']:
        return 'unseen'
    return 'weighed' if r['weight'] >= floor else 'dropped'


def pct(a, b):
    return 0 if b == 0 else 100.0 * a / b


def main():
    ap = argparse.ArgumentParser()
    ap.add_argument('dirs', nargs='+')
    ap.add_argument('--floor', type=float, default=0.1, help="the surfer's SOFT_FLOOR")
    ap.add_argument('--top', type=int, default=12)
    a = ap.parse_args()
    rows = list(records(a.dirs))
    if not rows:
        sys.exit('no MH records under ' + ', '.join(a.dirs))
    total = sum(r['damage'] for r in rows)
    logs = len({r['log'] for r in rows})
    rounds = len({(r['log'], r['round']) for r in rows})
    print(f"{len(rows)} hits, {total:.0f} damage, over {rounds} rounds of {logs} battles\n")

    by = defaultdict(lambda: [0, 0.0])
    for r in rows:
        b = by[bucket(r, a.floor)]
        b[0] += 1
        b[1] += r['damage']
    print("| what the surfer saw of the shot | hits | damage | share |")
    print("|---|---:|---:|---:|")
    for k, label in (('weighed', f'inferred shot, weight >= {a.floor:g} (surfed)'),
                     ('dropped', f'inferred shot, weight < {a.floor:g} (dropped as aimed elsewhere)'),
                     ('unseen', 'no inferred shot matches the hit (never surfed)')):
        n, d = by[k]
        print(f"| {label} | {n} | {d:.0f} | {pct(d, total):.0f}% |")

    print("\n| alive | hits | damage | surfed | dropped | unseen |")
    print("|---:|---:|---:|---:|---:|---:|")
    alive = defaultdict(lambda: defaultdict(float))
    for r in rows:
        alive[r['alive']][bucket(r, a.floor)] += r['damage']
        alive[r['alive']]['n'] += 1
    for k in sorted(alive, reverse=True):
        v = alive[k]
        d = v['weighed'] + v['dropped'] + v['unseen']
        print(f"| {k} | {int(v['n'])} | {d:.0f} | {pct(v['weighed'], d):.0f}% | {pct(v['dropped'], d):.0f}% | {pct(v['unseen'], d):.0f}% |")

    print("\n| robots nearer the shooter than Hadur | hits | damage | weight |")
    print("|---:|---:|---:|---:|")
    near = defaultdict(lambda: [0, 0.0])
    for r in rows:
        if r['seen']:
            near[r['nearer']][0] += 1
            near[r['nearer']][1] += r['damage']
    for k in sorted(near):
        n, d = near[k]
        print(f"| {k} | {n} | {d:.0f} | {1.0 / (1 + k) ** 2:.2f} |")

    print(f"\n| shooter | hits | damage | surfed | unseen | hit us with someone nearer it |")
    print("|---|---:|---:|---:|---:|---:|")
    who = defaultdict(lambda: defaultdict(float))
    for r in rows:
        who[r['shooter']][bucket(r, a.floor)] += r['damage']
        who[r['shooter']]['n'] += 1
        if r['seen'] and r['nearer'] > 0:
            who[r['shooter']]['notNearest'] += r['damage']
    for k in sorted(who, key=lambda s: -(who[s]['weighed'] + who[s]['dropped'] + who[s]['unseen']))[:a.top]:
        v = who[k]
        d = v['weighed'] + v['dropped'] + v['unseen']
        print(f"| {k} | {int(v['n'])} | {d:.0f} | {pct(v['weighed'], d):.0f}% | {pct(v['unseen'], d):.0f}% | {pct(v['notNearest'], d):.0f}% |")


if __name__ == '__main__':
    main()
