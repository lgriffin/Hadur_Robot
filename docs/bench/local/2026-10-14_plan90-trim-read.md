# Plan-90 trim: 3.13's shield on against off for the 22 robots it lost to against 3.12

**Result: the list stays as it is.** Against 20 of the 22 robots, 3.13 does better with the
shield on than with it off. Crusader is the clearest case: 98.4% on, 66.2% off. Exterminator
(+8.3 ± 6.0 points off) and MirrorPM (+5.7 ± 5.4) pass D5's rule for coming off. Together they
are worth +0.012 APS, within the noise of a cloud run, so 3.13 ships with all 200 robots.

The gate losses against 3.12 on these robots are therefore not the shield costing points. 3.12's
shield, with its in-round exits, did better on them than 3.13's does.

Run: cloud container, 2026-10-14 (4 cores, `--parallel 3`, CPU constant 4138771, engine
1.11.1, 35 rounds, cold, seeds 941-948). Set `hadur-bench/shield-313-losers.txt`. 3.13tr
(`build-ablation.sh strim`, the 22 robots off the list) was run against 3.13. The report is
`2026-10-14_plan90-trim-cloud.md`. A positive difference means off is better.

| Robot | Off minus on (pp) |
|---|---|
| tw.Exterminator 1.0 | +8.3 ± 6.0 |
| suh.micro.MirrorPM 1.00 | +5.7 ± 5.4 |
| cx.micro.Smoke 0.96, kid.Toa .0.5, mladjo.Grrrrr 0.9 | +2.5, +2.4, +0.4 (open) |
| 8 robots | -0.6 to -6.3 |
| ary.SMG, DM.mega.Bezier, mnt.AHEB, brainfade.Fallen, cf.proto.Shiva, ary.mini.Nimi | -11 to -19 |
| trab.Crusader 0.1.7 | -32.2 ± 4.9 |

Over all 22, removing them would cost 0.115 APS.
