"""Where OgiTeam's points come from, team by team, beside HadurTeam's (BENCH-166, pc-team-mirror).

Reads two team bench runs on the same teams and seeds: one with OgiTeam as the subject (--ours
cz.libors.Ogi) and one with HadurTeam master. Per opponent team it prints both score shares, the gap,
and splits the gap into the score parts each battle's result.csv carries (Robocode's own sums over
the battle): the subject's survival points, its bullet damage, the rest of its score (bonuses, rams),
and the same three for the opponent. Each part's share is the share change when HadurTeam's part is
swapped for Ogi's alone, everything else HadurTeam's; the parts need not add up to the gap exactly.

Beside it, team_losses.py's round read for both: members lost per round, damage taken and dealt,
hit rates, own fire and the round's last shot. Its "lever" column names the part worth most:

- their survival   our members die: the enemy outlives them (keep members alive: GANG, FINISH, REAR)
- their bullets    we soak damage (dodge: DODGE, PATH, OWN/HEADON/LINEAR shot models)
- our bullets      we deal less (gun: power, aim, focus)
- our survival     we kill slower, or in a worse order (finish wounded, focus)
- bonuses          kill and last-survivor bonuses

Usage: python3 tools/team_mirror.py --ogi RUN --hadur RUN [--ogi-prefix P] > report.md
"""
import collections
import glob
import os
import statistics
import sys

import team_losses

PARTS = (('their_survival', 'their survival'), ('their_bullets', 'their bullets'),
         ('our_bullets', 'our bullets'), ('our_survival', 'our survival'),
         ('our_other', 'bonuses'), ('their_other', 'their bonuses'))


def result(d):
    """The subject's and the opponent's score parts for one battle, or None when it did not finish."""
    p = os.path.join(d, 'result.csv')
    if not os.path.exists(p):
        return None
    with open(p) as f:
        head = f.readline().rstrip('\n').split(',')
        row = f.readline().rstrip('\n').split(',')
    if len(row) < len(head) or row[0] != 'true':
        return None
    r = dict(zip(head, row))
    try:
        score, theirs = float(r['score']), float(r['theirScore'])
        surv, tsurv = float(r['survival']), float(r['theirSurvival'])
        bul, tbul = float(r['bulletDamage']), float(r['theirBulletDamage'])
        rounds = int(r['rounds'])
    except (KeyError, ValueError):
        return None
    return {'our_survival': surv, 'our_bullets': bul, 'our_other': score - surv - bul,
            'their_survival': tsurv, 'their_bullets': tbul, 'their_other': theirs - tsurv - tbul,
            'rounds': rounds}


def run(path, candidate_only):
    """Opponent -> {'parts': summed score parts per round, 'shares': per battle, 'rows': round rows}."""
    out = collections.defaultdict(lambda: {'parts': collections.Counter(), 'rounds': 0, 'shares': [], 'rows': []})
    for d in sorted(glob.glob(os.path.join(path, 'battles', '*'))):
        if candidate_only and d.endswith('-baseline'):
            continue
        r = result(d)
        if r is None:
            continue
        o = out[team_losses.opponent(os.path.basename(d))]
        for k, _ in PARTS:
            o['parts'][k] += r[k]
        o['rounds'] += r['rounds']
        ours = r['our_survival'] + r['our_bullets'] + r['our_other']
        theirs = r['their_survival'] + r['their_bullets'] + r['their_other']
        o['shares'].append(100.0 * ours / (ours + theirs) if ours + theirs > 0 else 50.0)
        o['rows'].extend(team_losses.battle(d))
    return out


def share(p):
    ours = p['our_survival'] + p['our_bullets'] + p['our_other']
    theirs = p['their_survival'] + p['their_bullets'] + p['their_other']
    return 100.0 * ours / (ours + theirs) if ours + theirs > 0 else 50.0


def per_round(o):
    return {k: o['parts'][k] / o['rounds'] for k, _ in PARTS} if o['rounds'] else None


def split(ogi, hadur):
    """Each part's worth: the share change from swapping HadurTeam's part for Ogi's."""
    base = share(hadur)
    return {k: share(dict(hadur, **{k: ogi[k]})) - base for k, _ in PARTS}


def ci(xs):
    if len(xs) < 2:
        return float('nan')
    return 1.96 * statistics.stdev(xs) / len(xs) ** 0.5


def report(ogi_run, hadur_run, ogi_prefix='cz.libors.Ogi'):
    team_losses.OURS = ogi_prefix
    ogi = run(ogi_run, True)
    team_losses.OURS = team_losses.DEFAULT_OURS
    had = run(hadur_run, False)
    teams = sorted(set(ogi) & set(had))
    if not teams:
        sys.exit('team_mirror.py: no opponent team in both runs')
    rows, total = [], collections.Counter()
    for t in teams:
        po, ph = per_round(ogi[t]), per_round(had[t])
        so, sh = statistics.mean(ogi[t]['shares']), statistics.mean(had[t]['shares'])
        parts = split(po, ph)
        for k, v in parts.items():
            total[k] += v / 47.0
        lever = max(parts, key=parts.get)
        lo, lh = team_losses.summary(ogi[t]['rows']), team_losses.summary(had[t]['rows'])
        rows.append((so - sh, t, so, sh, ci(ogi[t]['shares']), ci(had[t]['shares']), parts, lever, lo, lh,
                     len(ogi[t]['shares']), len(had[t]['shares'])))
    rows.sort(key=lambda r: -r[0])
    gap = sum(r[0] for r in rows) / 47.0
    names = dict(PARTS)
    out = ['# Mirror: OgiTeam and HadurTeam on the same teams and seeds', '',
           'Ogi run: {} (subject {}*). HadurTeam run: {}. {} opponent teams in both.'.format(
               ogi_run, ogi_prefix, hadur_run, len(teams)), '',
           'Gap summed over these teams / 47 pairings: **{:+.2f} APS** (the live gap is about 5.9 with the head-to-head pairing, which this leaves out).'.format(gap), '',
           '## Where the gap comes from, whole field (APS, part swapped alone)', '',
           '| ' + ' | '.join(names[k] for k, _ in PARTS) + ' |', '|' + '---|' * len(PARTS),
           '| ' + ' | '.join('{:+.2f}'.format(total[k]) for k, _ in PARTS) + ' |', '',
           '## Per team (largest gap first)', '',
           'Shares are mean ± 95% interval over battles. Part columns are share points. Lost = members lost per round; '
           'taken/dealt = bullet damage per round; own = damage from own bullets per round.', '',
           '| Opponent | Battles O/H | Ogi share | Hadur share | Gap | ' + ' | '.join(names[k] for k, _ in PARTS)
           + ' | Lever | Won % O/H | Lost O/H | Taken O/H | Dealt O/H | Own O/H | Last shot O/H |',
           '|' + '---|' * (12 + len(PARTS))]
    for gap_t, t, so, sh, co, chh, parts, lever, lo, lh, no, nh in rows:
        out.append('| {} | {}/{} | {:.1f} ± {:.1f} | {:.1f} ± {:.1f} | {:+.1f} | {} | {} | {:.0f}/{:.0f} | {:.2f}/{:.2f} | {:.0f}/{:.0f} '
                   '| {:.0f}/{:.0f} | {:.0f}/{:.0f} | {:.0f}/{:.0f} |'.format(
                       t, no, nh, so, co, sh, chh, gap_t, ' | '.join('{:+.1f}'.format(parts[k]) for k, _ in PARTS),
                       names[lever], lo['won'], lh['won'], lo['lost'], lh['lost'], lo['dmg_us'], lh['dmg_us'],
                       lo['dmg_them'], lh['dmg_them'], lo['mates'], lh['mates'], lo['last_shot'], lh['last_shot']))
    counts = collections.Counter(r[7] for r in rows if r[0] > 1.0)
    out += ['', '## Teams by lever (gap above 1 point)', '']
    for k, _ in PARTS:
        ts = [r[1] for r in rows if r[0] > 1.0 and r[7] == k]
        if ts:
            out.append('- **{}** ({}): {}'.format(names[k], counts[k], ', '.join(ts)))
    return '\n'.join(out) + '\n'


if __name__ == '__main__':
    args, opts = sys.argv[1:], {'--ogi-prefix': 'cz.libors.Ogi'}
    while args:
        if args[0] in ('--ogi', '--hadur', '--ogi-prefix') and len(args) > 1:
            opts[args[0]] = args[1]
            args = args[2:]
        else:
            sys.exit(__doc__)
    if '--ogi' not in opts or '--hadur' not in opts:
        sys.exit(__doc__)
    sys.stdout.write(report(opts['--ogi'], opts['--hadur'], opts['--ogi-prefix']))
