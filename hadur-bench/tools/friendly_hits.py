"""Where our bullets that hit our own members came from, read from BENCH-114's friendly.log lines.

For every friendly hit under RUN/battles/*/friendly.log (candidate and baseline battles alike, so
give it an A/A run such as work/team-lines-<V>-bb): its kind (lane, walkin, beyond, noline, unseen),
how far the bullet flew, and where the victim stood when it was fired, along the bullet's line and
across it. Prints a markdown report: per kind the hits, median flight and median offsets; then, for
the hits with no enemy near the line (noline), how far off the line the victim stood at the shot
and whether it was ahead of the shooter or behind it, so a fix can be aimed at the right case.

--candidate-only reads only the run's candidate battles (an arm against aa), not the aa battles beside them.

Usage: python3 tools/friendly_hits.py [--candidate-only] RUN [RUN...] > report.md
"""
import collections
import glob
import os
import statistics
import sys

KINDS = ('lane', 'walkin', 'beyond', 'noline', 'unseen')
# Upper bounds inclusive, as BENCH-114's lane (across <= 36).
ACROSS = ((-1, 36, 'within 36 px (in the lane)'), (36, 100, '36-100 px'), (100, 250, '100-250 px'),
          (250, float('inf'), 'over 250 px'))


def fields(line):
    """'0,131,owner=3,...,kind=beyond' -> {'owner': '3', ..., 'kind': 'beyond'}."""
    return dict(x.split('=', 1) for x in line.rstrip('\n').split(',') if '=' in x)


def number(s):
    try:
        return float(s)
    except (TypeError, ValueError):
        return float('nan')


def hits(runs, candidate_only=False):
    out = []
    for run in runs:
        for p in sorted(glob.glob(os.path.join(run, 'battles', '*', 'friendly.log'))):
            if candidate_only and os.path.basename(os.path.dirname(p)).endswith('-baseline'):
                continue
            with open(p) as f:
                for line in f:
                    h = fields(line)
                    if h.get('kind') in KINDS:
                        out.append(h)
    return out


def median(xs):
    xs = [x for x in xs if x == x]
    return statistics.median(xs) if xs else float('nan')


def report(runs, candidate_only=False):
    hs = hits(runs, candidate_only)
    if not hs:
        sys.exit('friendly_hits.py: no BENCH-114 friendly.log lines under ' + ', '.join(runs))
    out = ['# Where our own hits came from', '', 'Runs: ' + ', '.join(runs), '',
           'Friendly hits read: {}.'.format(len(hs)), '',
           '| Kind | Hits | Share | Median flight (px) | Median along at the shot | Median across at the shot | Median power |',
           '|---|---|---|---|---|---|---|']
    by = collections.defaultdict(list)
    for h in hs:
        by[h['kind']].append(h)
    for k in KINDS:
        rows = by.get(k, [])
        if not rows:
            continue
        out.append('| {} | {} | {:.0f}% | {:.0f} | {:.0f} | {:.0f} | {:.2f} |'.format(
            k, len(rows), 100.0 * len(rows) / len(hs), median(number(r.get('travelled')) for r in rows),
            median(number(r.get('victimAlong')) for r in rows), median(number(r.get('victimAcross')) for r in rows),
            median(number(r.get('power')) for r in rows)))
    nl = by.get('noline', [])
    if nl:
        out += ['', '## No enemy near the line (noline)', '',
                'Where the victim stood when the shot was fired. Ahead: in front of the shooter along the '
                "bullet's heading; behind: at its back (it can only be hit after walking round).", '',
                '| Off the line at the shot | Hits | Share | Ahead | Median flight (px) |', '|---|---|---|---|---|']
        for lo, hi, name in ACROSS:
            rows = [r for r in nl if lo < number(r.get('victimAcross')) <= hi]
            if not rows:
                continue
            ahead = sum(1 for r in rows if number(r.get('victimAlong')) > 0)
            out.append('| {} | {} | {:.0f}% | {:.0f}% | {:.0f} |'.format(
                name, len(rows), 100.0 * len(rows) / len(nl), 100.0 * ahead / len(rows),
                median(number(r.get('travelled')) for r in rows)))
    return '\n'.join(out) + '\n'


if __name__ == '__main__':
    args = sys.argv[1:]
    only = bool(args) and args[0] == '--candidate-only'
    if only:
        args = args[1:]
    if not args:
        sys.exit(__doc__)
    sys.stdout.write(report(args, only))
