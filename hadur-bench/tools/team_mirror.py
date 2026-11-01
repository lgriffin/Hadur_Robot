"""Where OgiTeam's points come from, team by team, beside HadurTeam's (BENCH-166, pc-team-mirror).

Reads two team bench runs on the same teams and seeds: one with OgiTeam as the subject (--ours
cz.libors.Ogi) and one with HadurTeam master. Per opponent team it prints both score shares, the gap,
and splits the gap into the score parts each battle's team.csv carries (Robocode's own sums over
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

Battles pair by directory name (opponent and seed); a battle unfinished in either run drops from both.
Each part is swapped battle by battle and averaged over the same pairs as the shares.

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


def result(d, prefix):
    """The subject's and the opponent's score parts for one battle, from TeamRunner's team.csv (a row
    per team: rank,team,score,firsts,survival,bulletDamage, the team named by its leader), or None
    when the battle did not finish."""
    p = os.path.join(d, 'team.csv')
    if not os.path.exists(p):
        return None
    ours = theirs = None
    with open(p) as f:
        next(f, None)
        for line in f:
            c = line.rstrip('\n').split(',')
            if len(c) < 6:
                continue
            try:
                parts = (float(c[2]), float(c[4]), float(c[5]))
            except ValueError:
                return None
            if c[1].startswith(prefix):
                ours = parts
            else:
                theirs = parts
    if ours is None or theirs is None:
        return None
    return {'our_survival': ours[1], 'our_bullets': ours[2], 'our_other': ours[0] - ours[1] - ours[2],
            'their_survival': theirs[1], 'their_bullets': theirs[2], 'their_other': theirs[0] - theirs[1] - theirs[2]}


def run(path, prefixes):
    """Battle directory name (opponent and seed) -> (score parts, round rows), finished battles only."""
    out = {}
    team_losses.OURS = prefixes
    try:
        for d in sorted(glob.glob(os.path.join(path, 'battles', '*'))):
            if d.endswith('-baseline'):
                continue
            r = None
            for prefix in (prefixes if isinstance(prefixes, tuple) else (prefixes,)):
                r = r or result(d, prefix)
            if r is not None:
                out[os.path.basename(d)] = (r, team_losses.battle(d))
    finally:
        team_losses.OURS = team_losses.DEFAULT_OURS
    return out


def share(p):
    ours = p['our_survival'] + p['our_bullets'] + p['our_other']
    theirs = p['their_survival'] + p['their_bullets'] + p['their_other']
    return 100.0 * ours / (ours + theirs) if ours + theirs > 0 else 50.0


def split(ogi, hadur):
    """Each part's worth in one battle pair: the share change from swapping HadurTeam's part for Ogi's."""
    base = share(hadur)
    return {k: share(dict(hadur, **{k: ogi[k]})) - base for k, _ in PARTS}


def ci(xs):
    if len(xs) < 2:
        return float('nan')
    return 1.96 * statistics.stdev(xs) / len(xs) ** 0.5


def report(ogi_run, hadur_run, ogi_prefix='cz.libors.Ogi'):
    ogi = run(ogi_run, ogi_prefix)
    had = run(hadur_run, team_losses.DEFAULT_OURS)
    # Only battles finished on both sides at the same opponent and seed are compared.
    paired = collections.defaultdict(list)
    for name in sorted(set(ogi) & set(had)):
        paired[team_losses.opponent(name)].append((ogi[name], had[name]))
    teams = sorted(paired)
    if not teams:
        sys.exit('team_mirror.py: no battle finished in both runs at the same opponent and seed')
    rows, total = [], collections.Counter()
    for t in teams:
        pairs = paired[t]
        so_l = [share(o[0]) for o, _ in pairs]
        sh_l = [share(h[0]) for _, h in pairs]
        splits = [split(o[0], h[0]) for o, h in pairs]
        parts = {k: statistics.mean(x[k] for x in splits) for k, _ in PARTS}
        for k, v in parts.items():
            total[k] += v / 47.0
        lever = max(parts, key=parts.get)
        lo = team_losses.summary([r for o, _ in pairs for r in o[1]])
        lh = team_losses.summary([r for _, h in pairs for r in h[1]])
        so, sh = statistics.mean(so_l), statistics.mean(sh_l)
        rows.append((so - sh, t, so, sh, ci(so_l), ci(sh_l), parts, lever, lo, lh, len(pairs), len(pairs)))
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
           '| Opponent | Paired battles | Ogi share | Hadur share | Gap | ' + ' | '.join(names[k] for k, _ in PARTS)
           + ' | Lever | Won % O/H | Lost O/H | Taken O/H | Dealt O/H | Own O/H | Last shot O/H |',
           '|' + '---|' * (12 + len(PARTS))]
    for gap_t, t, so, sh, co, chh, parts, lever, lo, lh, no, nh in rows:
        out.append('| {} | {} | {:.1f} ± {:.1f} | {:.1f} ± {:.1f} | {:+.1f} | {} | {} | {:.0f}/{:.0f} | {:.2f}/{:.2f} | {:.0f}/{:.0f} '
                   '| {:.0f}/{:.0f} | {:.0f}/{:.0f} | {:.0f}/{:.0f} |'.format(
                       t, no, so, co, sh, chh, gap_t, ' | '.join('{:+.1f}'.format(parts[k]) for k, _ in PARTS),
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
