# Shield leaks on the stop-and-start build: what "nowave" really is

2026-10-18. 3.13hj (the stop-and-start base) on the 200 robots of Hadur 3.13's shield list
(`hadur-bench/shield-313.txt`), 35 rounds, 2 seeds (970-971), cloud, 400 battles
(`work/nw-hj-*`, report `2026-10-18_nw-hj.md`). Each enemy bullet that hit us while the opponent is
listed carries an `SB` record of why it got through (ShieldMode, SHIELD-8..12 notes). Damage is the
engine's bullet damage for the hit's power.

| Class | Hits | Damage | Per battle |
|---|---|---|---|
| off (mode left: budget or 150-damage exit) | 3,010 | 23,213 | 58.0 |
| unshielded (wave known, no shield fired) | 1,567 | 9,610 | 24.0 |
| missed (shield fired, missed) | 1,003 | 9,614 | 24.0 |
| nowave (no wave of ours matched) | 6,151 | 6,932 | 17.3 |
| first (round's first bullet) | 136 | 1,792 | 4.5 |

**nowave is the largest class by count, not by damage.** 5,330 of its 6,151 hits are bullets under
0.1 power (a nearly dead enemy firing its last energy), worth 1,050 damage in all. Removing every
nowave hit would lift the listed robots' score share from 94.27% to 94.95%, about **+0.11 APS** over
the whole field (200 of 1,217 pairings). That is the ceiling for this leak.

## Why the real (power 1+) nowave shots had no wave

Each such hit was matched to the engine's own record of the bullet (`truth.log.gz`, `F` records) and
to the energy ledger's `EW` record of the shot (tool in the session scratchpad, `nw.py`):

| Cause | Hits | Damage |
|---|---|---|
| Ledger saw the shot at the right power, but a wall hit was inferred on the same scan (WAVE-3 "uncertain"), and SHIELD-5 builds no wave for those | 234 | 3,046 |
| Same wall-hit case, and the wall correction took the wrong impact speed, so the power was off (often by exactly 1.0) | 169 | 1,979 |
| Ledger saw the right power, no wall: other | 41 | 464 |
| Ledger never saw the shot | 16 | 196 |

A debug build that logged every dropped wave on the 12 worst robots confirmed it: no shot was lost
to a missing scan or to pruning; the waves were never built. Nano bots that bounce off walls while
firing (RandomPM, the Ocnirp family, Charp, WeekendObsession) hold most of it.

## Fix being built

SHIELD-14 (switch `wall`, off by default, ablation `swall`, suffix `sw`): build the shield wave for
uncertain shots too, at a best-guess power (the wall-impact speed whose remainder is nearest the
enemy's last sure shot), and match such a wave to a hit by distance and time at the hit's true power.
It targets about 5,000 of the 6,932 nowave damage, so at most about +0.08 APS; the shield blocks most
bullets it has a wave for. Screen: 3.13hjsw vs 3.13hj on the 200 listed robots.

The leak that matters more is `off` (58 damage a battle after the mode is left) and the re-sweep of
Nullstride's other 95 robots (plan Stage 2), which come next.
