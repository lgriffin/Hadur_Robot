# BENCH-83 confirmed: the 11 crippled opponents now fight normally (`confirm-fix-310`)

2026-10-08. Plan `hadur-bench/plans/confirm-fix-310.queue`, run with `.\queue.ps1 run confirm-fix-310` from master at 52842754 (PR #156), after PR #155. Local bench host (Threadripper PRO 9965WX, 48 logical cores), Hadur 3.10 only (no baseline build), the 11 opponents of `hadur-bench/crippled-310.txt`, 4 seeds each, 35 rounds, Robocode 1.11.1, CPU constant 1488498, parallel 12, child CPUs 2, child heap 2G. No RoboRumble clients and no other Robocode JVMs were running. The run took 58 s.

Raw rows: `data/bench/2026-10-08_hadur-confirm-fix-310-local_cold.tsv` (and `_rounds`). Generated report: [confirm-fix-310](2026-10-08_confirm-fix-310.md).

## Verdict

The defect is fixed. No battle log shows "Preventing ... META-INF", no row is marked "JDK resource denied", and the security-errors column is 0 for all 11 opponents. Every robot's score moved from the crippled bench mean to the neighbourhood of its live score. The mean absolute gap to live fell from **16.5 points to 5.9**, and the mean signed gap from +12.7 to +0.5, so the bench no longer reads systematically easy.

## Score share against the crippled mean and the live score

Live is Hadur 3.10's APS on the 2026-10-08 12:38 UTC page. Old is the bench mean from the crippled runs (BENCH-83, [live-3.10](../live-3.10.md)). New is this run (4 battles each, so each new figure carries a wide interval, up to ±17).

| Opponent | Old bench | New bench | Live | Old minus live | New minus live |
|---|---:|---:|---:|---:|---:|
| xander.cat.XanderCat 12.9 | 56.7 | 58.8 | 66.1 | -9.4 | -7.3 |
| ne.Chimera 1.2 | 97.9 | 89.0 | 81.0 | +16.9 | +8.0 |
| Krabb.krabby.Krabby 1.18b | 88.8 | 92.0 | 80.8 | +8.0 | +11.2 |
| pez.mini.VertiLeach 0.4.0 | 98.7 | 81.0 | 75.2 | +23.5 | +5.8 |
| apv.TheBrainPi 0.5fix | 75.7 | 75.7 | 80.9 | -5.2 | -5.2 |
| bayen.nut.Squirrel 1.621 | 89.0 | 84.5 | 95.9 | -6.9 | -11.4 |
| cx.Princess 1.0 | 95.3 | 68.5 | 66.9 | +28.4 | +1.6 |
| apv.LauLectrik 1.2 | 99.3 | 78.4 | 78.3 | +21.0 | +0.1 |
| pez.frankie.Frankie 0.9.6.1 | 98.9 | 76.2 | 70.7 | +28.2 | +5.5 |
| cbot.agile.Nibbler 0.2 | 98.5 | 77.2 | 83.1 | +15.4 | -5.9 |
| wiki.mini.Griffon 0.1 | 99.2 | 83.6 | 80.5 | +18.7 | +3.1 |

- The six the live thread called 15 to 28 points too easy (Frankie, VertiLeach, Princess, LauLectrik, Nibbler, Griffon) now sit within 6 points of live, and Princess, LauLectrik and Griffon within 3.
- The four that were not crippled in effect (XanderCat, TheBrainPi, Squirrel, Krabby) did not move beyond noise, as expected: the fix changes nothing for them.
- What is left over (Krabby +11, Squirrel -11, Chimera +8, XanderCat -7) is inside the 4-seed interval and the usual bench-versus-live gap (different opponent versions, fields and roster). It is not evidence of a remaining bench defect.

## Trust

34 of 44 battles trusted. The 10 that were not: 9 had duress ticks (XanderCat 3 battles, Chimera 2, Frankie 2, VertiLeach 1, LauLectrik 1) and 1 (Princess) lost its final R record. Skipped turns averaged 13.8 a battle with a worst battle of 33, 0.28 to 0.74 a round, under the 2.0 limit. None changes a conclusion, because the claim is about movement of 15 to 28 points. A 4-seed run cannot rank these opponents against each other.

## Also seen

- The bullet-shielding table reads 497.9% shot down for Krabby (5118 against our 1028 shots). That figure is not a share of our shots: Krabby's intercepts count both sides' bullets. It is a reporting quirk of `analyse.py`, not a robot behaviour, and is not changed here.
- Nothing in `hadur-core` or `hadur-robot` was touched, and no release was cut.
