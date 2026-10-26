"""How HadurTeam loses rounds, per opponent team, from a team bench run's battle logs.

Reads every battle directory under RUN/battles (candidate and baseline battles alike, so give it
an A/A run such as work/team-lane-<V>-bb, where both sides are master): rounds.csv, bullets.log
(TeamHarvester) and each member's R records. Prints a markdown report: per opponent, then per
band (docs/plan-team-top5.md section 10: the 14 mid teams that cost us 2.1 APS against
Firestarter and Combat, the top 6, the rest):

- rounds, our round wins, members we lose per round (all rounds; in won rounds);
- tick of our first death (median) against the round's length (median);
- enemy bullet damage on us and our bullet damage on them, per round;
- the enemy's hit rate on us and ours on them (bullets that hit a robot / bullets fired);
- focus: the share of the enemy's bullet damage that landed on the member it hurt most;
- damage our bullets did to our own members, per round.

Another team can be the subject (a run with it as the bench's robot): --ours names its class
prefix, e.g. --ours cb.fire., and only the run's candidate battles are read. Its members print no R records, so its first death reads nan.

Usage: python3 tools/team_losses.py [--ours PREFIX] [--title TEXT] RUN [RUN...] > report.md
"""
import collections
import glob
import os
import statistics
import sys

OURS = 'hadur2.'
MID = {'rz.HOFSwarm', 'gh.nano.GrofGroup', 'davidalves.PhoenixTeam', 'myl.micro.TroodonPack',
       'cx.mini.DemoniacNimrods', 'apvteam.MambaTeam', 'bvh.team.Valkiries', 'kawigi.micro.ArmyOfShiz',
       'kawigi.sbf.TidalWave', 'kid.team.OmegaSquad', 'gh.mini.GrubbmGroup', 'rz.GlowingHawks',
       'tmnr.TMNR', 'Krabb.sliNk.SlartibartfassTeam'}
# The top 8 by live APS: the plan's top 6 and the two we chase (Firestarter, Combat).
TOP = {'cz.libors.OgiTeam', 'rz.AlephTeam', 'abc.ShadowTeam', 'ustimaw.NightmareTeam',
       'florent.XSeries.Xmen', 'ags.polylunar.Polylunar', 'cb.fire.FirestarterTeam', 'mn.CombatTeam'}


def damage(power):
    return 4 * power + (2 * (power - 1) if power > 1 else 0)


def opponent(dirname):
    """'cz.libors.OgiTeam_v1-3-baseline' -> 'cz.libors.OgiTeam'."""
    name = dirname[:-len('-baseline')] if dirname.endswith('-baseline') else dirname
    name = name.rsplit('-', 1)[0]
    return name.split('_', 1)[0]


def band(team):
    return 'mid 14' if team in MID else 'top 8' if team in TOP else 'rest'


def battle(d):
    """Per-round rows for one battle directory, or [] when it is incomplete."""
    rounds_csv = os.path.join(d, 'rounds.csv')
    bullets = os.path.join(d, 'bullets.log')
    if not (os.path.exists(rounds_csv) and os.path.exists(bullets)):
        return []
    rows = {}
    with open(rounds_csv) as f:
        next(f, None)
        for line in f:
            c = line.rstrip('\n').split(',')
            if len(c) < 4:
                continue
            rows[int(c[0])] = {'alive': int(c[1]), 'won': c[3] == '1', 'ends': [],
                               'shots_at_us': 0, 'shots_at_them': 0, 'hits_us': 0, 'hits_them': 0,
                               'dmg_us': 0.0, 'dmg_them': 0.0, 'dmg_mates': 0.0,
                               'on_member': collections.Counter()}
    with open(bullets) as f:
        for line in f:
            c = line.rstrip('\n').split(',')
            r = int(c[0])
            row = rows.get(r)
            if row is None:
                continue
            if c[2] == 'F':
                # Our bullet is a shot at them; an enemy's is a shot at us.
                row['shots_at_them' if c[4].startswith(OURS) else 'shots_at_us'] += 1
            elif c[2] == 'H':
                owner, victim, power = c[4], c[5], float(c[6])
                ours, hit_ours = owner.startswith(OURS), victim.startswith(OURS)
                if ours and hit_ours:
                    row['dmg_mates'] += damage(power)
                elif ours:
                    row['hits_them'] += 1
                    row['dmg_them'] += damage(power)
                elif hit_ours:
                    row['hits_us'] += 1
                    row['dmg_us'] += damage(power)
                    row['on_member'][victim] += damage(power)
    for p in glob.glob(os.path.join(d, 'member-*.log')):
        with open(p) as f:
            for line in f:
                c = line.split(',', 6)
                if len(c) > 5 and c[2] == 'R' and int(c[3]) in rows:
                    rows[int(c[3])]['ends'].append(int(c[4]))
    return list(rows.values())


def summary(rows):
    n = len(rows)
    if n == 0:
        return None
    won = [r for r in rows if r['won']]
    firsts, lengths = [], []
    for r in rows:
        if not r['ends']:
            continue
        end = max(r['ends'])
        lengths.append(end)
        dead = [t for t in r['ends'] if t < end] if r['won'] else r['ends']
        if dead:
            firsts.append(min(dead))
    shots_at_us = sum(r['shots_at_us'] for r in rows)
    shots_at_them = sum(r['shots_at_them'] for r in rows)
    dmg_us = sum(r['dmg_us'] for r in rows)
    focus = [max(r['on_member'].values()) / r['dmg_us'] for r in rows if r['dmg_us'] > 0]
    return {
        'rounds': n,
        'won': 100.0 * len(won) / n,
        'lost': sum(5 - r['alive'] for r in rows) / n,
        'lost_won': sum(5 - r['alive'] for r in won) / len(won) if won else float('nan'),
        'first': statistics.median(firsts) if firsts else float('nan'),
        'length': statistics.median(lengths) if lengths else float('nan'),
        'dmg_us': dmg_us / n,
        'dmg_them': sum(r['dmg_them'] for r in rows) / n,
        'hit_us': 100.0 * sum(r['hits_us'] for r in rows) / shots_at_us if shots_at_us else float('nan'),
        'hit_them': 100.0 * sum(r['hits_them'] for r in rows) / shots_at_them if shots_at_them else float('nan'),
        'focus': 100.0 * statistics.mean(focus) if focus else float('nan'),
        'mates': sum(r['dmg_mates'] for r in rows) / n,
    }


HEAD = ('| {} | Rounds | Won % | Lost/round | Lost/won round | First death | Round length | Dmg taken/round '
        '| Dmg dealt/round | Their hit % | Our hit % | Their focus % | Own-fire dmg/round |')


def line(name, s):
    return ('| {} | {rounds} | {won:.1f} | {lost:.2f} | {lost_won:.2f} | {first:.0f} | {length:.0f} | {dmg_us:.0f} '
            '| {dmg_them:.0f} | {hit_us:.1f} | {hit_them:.1f} | {focus:.0f} | {mates:.0f} |').format(name, **s)


def report(runs, title='How HadurTeam loses rounds'):
    per = collections.defaultdict(list)
    battles = collections.Counter()
    skipped = []
    for run in runs:
        for d in sorted(glob.glob(os.path.join(run, 'battles', '*'))):
            # Another subject is only the candidate: a run's baseline battles are HadurTeam's.
            if OURS != 'hadur2.' and d.endswith('-baseline'):
                continue
            rows = battle(d)
            if rows:
                per[opponent(os.path.basename(d))].extend(rows)
                battles[opponent(os.path.basename(d))] += 1
            else:
                skipped.append(os.path.basename(d))
    if not any(per.values()):
        sys.exit('team_losses.py: no team battles under ' + ', '.join(runs))
    counts = sorted(set(battles.values()))
    out = ['# ' + title, '', 'Subject: ' + OURS + '*', '', 'Runs: ' + ', '.join(runs), '',
           'Battles read: {} over {} opponents ({} per opponent); incomplete directories left out: {}.'.format(
               sum(battles.values()), len(battles), ' or '.join(map(str, counts)),
               ', '.join(skipped) if skipped else 'none'), '',
           '## By band', '', HEAD.format('Band'), '|' + '---|' * 13]
    bands = collections.defaultdict(list)
    for team, rows in per.items():
        bands[band(team)].extend(rows)
    for b in ('top 8', 'mid 14', 'rest'):
        s = summary(bands[b])
        if s:
            out.append(line(b, s))
    out += ['', '## By opponent (fewest round wins first)', '', HEAD.format('Opponent'), '|' + '---|' * 13]
    ranked = sorted(((summary(rows), team) for team, rows in per.items() if rows), key=lambda x: x[0]['won'])
    for s, team in ranked:
        out.append(line(team + (' (mid)' if team in MID else ''), s))
    return '\n'.join(out) + '\n'


if __name__ == '__main__':
    args = sys.argv[1:]
    title = 'How HadurTeam loses rounds'
    while args and args[0].startswith('--'):
        if args[0] == '--ours' and len(args) > 1:
            OURS = args[1]
        elif args[0] == '--title' and len(args) > 1:
            title = args[1]
        else:
            sys.exit(__doc__)
        args = args[2:]
    if not args:
        sys.exit(__doc__)
    sys.stdout.write(report(args, title))
