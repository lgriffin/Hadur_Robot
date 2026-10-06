# 3.8 live: up against the top, down against everyone else

Leigh saved Hadur's RoboRumble BotDetails page and the RoboRumble rankings at 15:05 UTC on
6 October 2026. Both are archived under [data/rumble/pages/](../../data/rumble/pages/) and parsed
into [data/rumble/parsed/](../../data/rumble/parsed/). Leigh read the melee and team ranks from
the live ladders at the same time. No melee or team page was saved.

| Ladder | 3.7 live | 3.8 live | Read |
|---|---|---|---|
| RoboRumble 1v1 | 85.67, 21st | **84.58 ± 0.20, 29th of 1,216** (1,205 of 1,215 pairings, 1,745 battles, survival 91.84) | 1.09 below 3.7 and 1.32 below 3.4's full pass |
| MeleeRumble | 18th | **16th** | up two places |
| TeamRumble | 32nd of 46 | **12th** | T1 shows live |

The top of the 1v1 ladder also changed. jd.Nullstride 2.3.3 (95.05) is now 1st, and
kc.mega.BeepBoop 2.0 (95.02) is 2nd. On 5 October, BeepBoop led Nullstride 2.3.1 (95.03
against 94.85).

## Where the 1v1 lost its points

3.4's full pass (1,215 pairings, 85.90, [live-details-3.4.md](live-details-3.4.md)) is the last
per-opponent page. 3.5.1's page was partial, and 3.7's per-opponent page was not saved. Each of
3.8's 1,205 pairings is matched by opponent name and compared with 3.4's score against that
opponent. The bands use today's ranks.

| Opponents by rank | Pairings | 3.4 | 3.8 | Change per pairing | Survival change | APS contribution |
|---|---|---|---|---|---|---|
| 1 to 10 | 10 | 41.95 | 47.14 | **+5.19** | +10.48 | +0.04 |
| 11 to 20 | 10 | 54.10 | 54.62 | +0.52 | +2.64 | +0.00 |
| 21 to 50 | 28 | 64.33 | 60.79 | -3.54 | -4.31 | -0.08 |
| 51 to 100 | 50 | 69.56 | 67.56 | -2.00 | -3.32 | -0.08 |
| 101 to 200 | 100 | 75.20 | 74.11 | -1.09 | -1.74 | -0.09 |
| 201 to 400 | 197 | 78.80 | 78.18 | -0.62 | -1.54 | -0.10 |
| 401 to 800 | 396 | 87.51 | 86.13 | -1.38 | -2.38 | -0.45 |
| 801 and below | 414 | 95.57 | 93.96 | -1.61 | -2.22 | -0.55 |

- **The drop is real.** The pass is 99% complete. Outside the top 20, leaving out the
  D5 shield list, the mean pairing is down **1.55 ± 0.15** points. 794 pairings fell and 370
  rose, which costs 1.50 APS overall.
- **It is lost rounds.** Survival is down 2.33 points in those pairings: 762 lost survival
  and 198 gained it.
- **Unlike 3.0, there is no collapse at one time or on one client.** Pairings last fought
  in each quarter hour from 13:30 to 14:58 UTC all read 0.6 to 2.2 points down.
- **D5 works live.** The 14 shield-list opponents add +0.14 APS. Examples are
  suh.micro.MirrorPM (+29.0), vic.Locke (+21.3), simonton.mega.SniperFrog (+20.0) and
  ej.ChocolateBar (+17.9).
- **The DrussGT route pays where it was aimed.** The top 10 rose +5.2 per pairing, in line
  with the release check's +7.2 ± 6.3. Firestarter (+20.6) gained most. Tomcat (-13.7) lost
  most, as it did in the release check.

Had 3.8 held 3.4's level outside the top 20, it would read about 86.0, which is 20th on
today's ladder.

## Suspects (not yet measured)

- **D1's light power.** When neither gun hits above break-even, D1 fires the lightest bullet
  while level or ahead. Against a weak bot this would make rounds longer and leave Hadur
  exposed for longer.
- **D4's CPU.** Slow ticks rose ten-fold in the D4 gate (2,822 to 27,900) and skipped turns
  rose in the release check (314 to 447 against DrussGT). Rumble clients are slower than the
  bench.

The stack gate measured the weak set as level. That set is 12 bots, so a 1.5-point leak
spread
over 1,100 opponents is below what it can resolve.

## Direction

Fix the leak and keep the strategy. The next measure is a paired bench of 3.7 against the
kept D1 to D4 stage jars (`ladder-work/`, 3.8.1 to 3.8.4) on a weak and mid-table set large
enough to resolve about one point. Its result names the stage to gate by opponent strength.
The top-20 harness cannot show this leak, because the top 20 is where 3.8 rose.
