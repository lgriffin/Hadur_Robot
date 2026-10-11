# 3.11 census, stage M1: findings

Date: 2026-10-09. Stage M1 of the 3.11 census plan (artifact "Hadur Gap to Top 10"). Bench tooling, data and documents only; no change to `hadur-core` or `hadur-robot`, nothing released. This write-up also carries the M2 (seed-half A/A) and M3 (deficit ledger) readings the plan asks for, because they come straight from the M1 rows.

## What was run

- Subjects: Hadur 3.10 (`bisect/hadur2.Hadur_3.10.jar`) and Tomcat 3.68 (`opponents/lxx.Tomcat_3.68.jar`) fought each census opponent on the same four seeds (paired mode: Tomcat is the "candidate", Hadur 3.10 the "baseline"), then Nullstride 2.3.3 alone against every opponent but itself, 4 seeds.
- Opponents: the 1,215 bots of the 2026-10-08 1v1 census (`hadur-bench/census-311.txt`), split by `census-311-tail.txt` (ranks 201 and below, 1,016 bots), `census-311-top.txt` (ranks 1 to 200 less Tomcat, 198 bots) and `census-311-ceiling.txt` (the census less Nullstride).
- Conditions: Robocode 1.11.1, 35 rounds, 4 seeds (base 200), parallel 12, child CPUs 2, child heap 2G, CPU constant 1488498, Threadripper PRO 9965WX, RoboRumble workers stopped.
- Battles: 4,064 pairs (tail), 792 pairs (top) and 4,856 Nullstride battles, 18,224 in all. Reports: `2026-10-08_census-311-tail.md`, `2026-10-09_census-311-top.md`, `2026-10-09_census-311-nullstride.md` and the per-opponent folders beside them. Rows: `data/bench/2026-10-08_hadur-census-311-tail-local_cold.tsv`, `2026-10-09_hadur-census-311-top-local_cold.tsv`, `2026-10-09_hadur-census-311-nullstride-local_cold.tsv`. The per-round files (42 MB) were exported but not committed.
- Analysis: `data/tools/census_gap.py`; its per-opponent output is `data/bench/2026-10-09_hadur-census-311-ledger.tsv` (the M3 ledger). The tables below are its output.
- How it ran: the queue plan `plans/census-311.queue` stopped after `tail` because that step exited 1 (see Failing opponents), and `after:` blocked `top` and `ceiling`. They were rerun with the same commands from `plans/census-311-rest.queue`, which has no `after:` chain.

## Headline

1. **The bench reads the same gap to Tomcat as the live rumble.** Hadur 3.10 minus Tomcat 3.68 is -0.48 APS on the bench (95% -0.76 to -0.20, 1,194 opponents) against -0.35 live on the same opponents. The bench-minus-live difference is -0.14 (-0.35 to +0.08), inside the plan's 0.3 tolerance.
2. **The gap is a tail gap.** Hadur is behind in bands 5 and 6 (ranks 401 and below: -1.56 and -1.44 a bot, 805 of the 1,194 bots) and ahead in band 3 (+3.96) and band 1 (+5.19, 9 bots). As APS contributions that is band 3 +0.49, band 6 -0.61, band 5 -0.39, band 4 -0.05, bands 1 and 2 +0.08.
3. **Against Nullstride the shortfall is 7.40 APS** (live 7.65) and it too sits low in the list: bands 4 to 6 carry 5.0 of it (1.91, 1.99 and 1.10), band 3 carries 1.56, bands 1 and 2 about 0.8.
4. **Two clusters meet the plan's G3 test as written** (at least 0.15 APS, same sign and size on both seed halves, mechanism visible in the score breakdown): band 6 bots that Tomcat beats 95 to 5 or better (388 bots, -0.47 APS) and band 5 bots where Tomcat scores 80 to 95 (187 bots, -0.23 APS). The mechanisms are in the last table. This document does not pick what to change; that is the owner's call.

## Failing opponents

Three bots failed all of their battles in every step that ran them: e32.Omni 0.06, zen.Mirage 0.9.5 and zen.Ronin 1.0.0. The engine reports "expected 2 robots; found 1", so they do not load under 1.11.1. They are left out of every figure below. Omni is in `tail`, Mirage and Ronin in `top`, and all three are in `ceiling`.

## Row rules

The plan's fixed rule: drop rows with security denials, another Robocode JVM or duress after round 0, and count them; keep round-0 start-up duress.

- Security denials: 0 rows.
- Duress after round 0: 39 Hadur 3.10 battles, listed in `data/bench/2026-10-09_hadur-census-311-late-duress.tsv` (35 of them are dropped on their own; 4 were already out for another JVM). Round-0 start-up duress was kept: 2,578 of 4,060 tail Hadur battles (63%) show 298 or 596 ticks, all in round 0, against 21% in the 48-battle M0 sample. Tomcat and Nullstride report no duress, so there is no matching figure for them.
- Another JVM (`otherJvms` above 0): 612 of the 9,712 Tomcat and Hadur rows (6.3%) and 217 of the 4,856 Nullstride rows (4.5%). I cannot find an intruder. The flags fall on alternating seeds and builds in a repeating pattern (for example Tomcat seeds 1 and 3 with Hadur seeds 2 and 4), the same bots are flagged again and again, and host CPU shows no outside load (hostCpuMax 0.53 to 0.56 throughout). `Host.countOtherJvms` subtracts the bench's own descendants from a `jps` listing taken every ten seconds, so a sibling battle JVM that starts between the two snapshots would be counted as foreign. That is my reading of the code and the pattern; it is untested. The plan says to drop these rows, so I did, and for 17 opponents that removed every row. The sensitivity run below keeps them.
- Failed battles: 24 pair rows (12 per build) and 12 Nullstride rows, the unloadable bots.

Sensitivity, same script with `--keep-other-jvms`: bench gap -0.52 (-0.79 to -0.25) over 1,211 opponents, bench minus live -0.14 (-0.35 to +0.06), every band within 0.35 of the table below, correlations 0.955, 0.991 and 0.930. Nothing in this document depends on the rule.


## Results

```
Rows dropped (Tomcat and Hadur 3.10 steps): {'another JVM': 612, 'battle failed': 24, 'duress after round 0': 35}
Rows dropped (Nullstride step): {'another JVM': 217, 'battle failed': 12}
Opponents with no usable row: ['Gecko.ultimateGeckoBot 1.0', 'Grystrion.RandomTrackerNOREV 1.0', 'Grystrion.TrackerWO 1.0', 'areb.Union 1.06', 'arthord.micro.Muffin 0.6.1', 'cw.megas.Gridd 0.4', 'e32.Omni 0.06', 'el33t.EL33tGangstarr2 2.0', 'goblin.Bender 2.4', 'jaara.LambdaBot 1.1', 'lrem.Spectre 0.4.4', 'nz.jdc.nano.NeophytePattern 1.1', 'rampancy.Durandal 2.2d', 'robar.micro.Kirbyi 1.0', 'sheldor.micro.PointInLineRRAL 1.0', 'sos.SOS 1.0', 'sul.NanoR2 1.32', 'velas.Alpha 1.0', 'zen.Mirage 0.9.5', 'zen.Ronin 1.0.0'], Nullstride step: ['McS.Spanky_test 0.1a', 'SFS.SamsSecondRobot 1.0', 'TCMI.Enyo 0.4', 'ary.nano.AceSurf 1.2', 'bndl.LostLion 1.2', 'bvh.fry.Freya 0.82', 'conscience.Bulldozer 1.0a', 'cs.PumpkinPie 1.0', 'cx.BlestPain 1.41', 'divineomega.DivineBot 1.9.5', 'e32.Omni 0.06', 'florent.small.LittleAngel 1.8', 'grybgoofy.GoofyBot 0.10', 'jgap.JGAP130166 1.0', 'kjc.etc.Dharok 1.0', 'krillr.mega.Psyche 0.0.3', 'mbh.Mbh 0.1', 'nexus.One 1.0', 'nosteel.Welby 0.0.3', 'oog.melee.Capulet 1.2', 'panzer.Panzer 0.2', 'rampancy.Durandal 2.2d', 'romz.robot.circular.WildRabbit 0.9.6', 'sample.TrackFire 1.0', 'sheldor.melee.nano.TestMelee 0.1', 'snowman.Snowman 1.0', 'spartancompany.Spartan2 1.0', 'squidM.SquidmanNano 1.0', 'strider.Festis 1.2.1', 'suh.mega.WaveSurferGF 1.04', 'suh.nano.StopAndGoL 1.01', 'tobe.Relativity 3.9', 'tobe.mini.Charon 0.9', 'yk.JahMicro 1.0', 'zen.Mirage 0.9.5', 'zen.Ronin 1.0.0', 'zeze2.OperatorZeze 1.05']
```

Opponents with Hadur and Tomcat rows: 1194

## Gap to Tomcat 3.68 by band (Hadur 3.10 minus Tomcat, score-share points)

| Band | Opponents | Hadur bench | Tomcat bench | Bench gap (95%) | Live gap | Bench minus live (95%) |
|---|---|---|---|---|---|---|
| 1 (1-10) | 9 | 44.28 | 39.09 | +5.19 (+0.73 to +9.65) | +8.41 | -3.22 (-8.64 to +2.20) |
| 2 (11-50) | 38 | 61.62 | 60.26 | +1.36 (-0.56 to +3.28) | +0.33 | +0.92 (-1.21 to +3.04) |
| 3 (51-200) | 149 | 77.30 | 73.34 | +3.96 (+2.54 to +5.37) | +4.09 | -0.14 (-1.13 to +0.85) |
| 4 (201-400) | 193 | 81.38 | 81.71 | -0.33 (-1.08 to +0.42) | -0.06 | -0.27 (-0.88 to +0.34) |
| 5 (401-700) | 297 | 87.48 | 89.05 | -1.56 (-1.92 to -1.21) | -1.34 | -0.22 (-0.62 to +0.18) |
| 6 (701+) | 508 | 95.61 | 97.05 | -1.44 (-1.63 to -1.25) | -1.38 | -0.06 (-0.23 to +0.11) |
| All | 1194 | 87.53 | 88.01 | -0.48 (-0.76 to -0.20) | -0.35 | -0.14 (-0.35 to +0.08) |

## G1: bench against live, per opponent

| Subject | Opponents | r bench vs live | Mean bench | Mean live |
|---|---|---|---|---|
| Hadur 3.10 | 1192 | 0.954 | 87.57 | 87.46 |
| Tomcat 3.68 | 1206 | 0.990 | 88.01 | 87.77 |
| Nullstride 2.3.3 | 1177 | 0.930 | 94.85 | 95.04 |

r of the per-opponent gap, bench against live: 0.729 over 1192 opponents

## M2: A/A test, seeds 1-2 against seeds 3-4 (Hadur minus Tomcat gap, half A minus half B)

| Band | Opponents | Half A gap | Half B gap | A minus B (95%) | 2 x SE |
|---|---|---|---|---|---|
| 1 (1-10) | 8 | +5.89 | +7.75 | -1.86 (-6.35 to +2.64) | 4.59 |
| 2 (11-50) | 37 | +1.64 | +0.97 | +0.67 (-1.79 to +3.14) | 2.52 |
| 3 (51-200) | 145 | +3.81 | +3.96 | -0.15 (-1.23 to +0.94) | 1.11 |
| 4 (201-400) | 186 | -0.51 | +0.07 | -0.58 (-1.38 to +0.22) | 0.81 |
| 5 (401-700) | 291 | -1.29 | -1.87 | +0.58 (+0.12 to +1.04) | 0.47 |
| 6 (701+) | 490 | -1.45 | -1.46 | +0.02 (-0.18 to +0.21) | 0.20 |
| All | 1157 | -0.45 | -0.50 | +0.05 (-0.20 to +0.30) | 0.25 |

## Score breakdown by band, per battle (mean over opponents)

| Band | Subject | Score | Their score | Bullet dmg | Their bullet dmg | Ram | Their ram | Survival | Their survival | Last-survivor bonus |
|---|---|---|---|---|---|---|---|---|---|---|
| 1 (1-10) | Hadur 3.10 | 1957 | 2380 | 930 | 1083 | 0 | 0 | 772 | 972 | 154 |
| 1 (1-10) | Tomcat 3.68 | 1835 | 2812 | 1097 | 1174 | 1 | 0 | 535 | 1212 | 107 |
| 2 (11-50) | Hadur 3.10 | 2781 | 1728 | 1063 | 1095 | 0 | 0 | 1290 | 458 | 258 |
| 2 (11-50) | Tomcat 3.68 | 2940 | 1947 | 1303 | 1165 | 1 | 0 | 1189 | 559 | 238 |
| 3 (51-200) | Hadur 3.10 | 3267 | 1031 | 1173 | 764 | 1 | 1 | 1562 | 188 | 312 |
| 3 (51-200) | Tomcat 3.68 | 3564 | 1301 | 1483 | 952 | 1 | 0 | 1503 | 246 | 301 |
| 4 (201-400) | Hadur 3.10 | 3792 | 929 | 1540 | 732 | 9 | 17 | 1623 | 126 | 325 |
| 4 (201-400) | Tomcat 3.68 | 4159 | 948 | 1817 | 802 | 2 | 10 | 1654 | 95 | 331 |
| 5 (401-700) | Hadur 3.10 | 4423 | 682 | 1987 | 577 | 12 | 21 | 1692 | 58 | 338 |
| 5 (401-700) | Tomcat 3.68 | 4539 | 608 | 2060 | 548 | 2 | 19 | 1721 | 29 | 344 |
| 6 (701+) | Hadur 3.10 | 5117 | 233 | 2523 | 207 | 7 | 6 | 1736 | 14 | 347 |
| 6 (701+) | Tomcat 3.68 | 5104 | 157 | 2504 | 150 | 1 | 3 | 1747 | 3 | 349 |
| All | Hadur 3.10 | 4401 | 621 | 2004 | 488 | 8 | 11 | 1664 | 86 | 333 |
| All | Tomcat 3.68 | 4525 | 617 | 2106 | 494 | 1 | 8 | 1668 | 81 | 334 |

## Ceiling: Nullstride 2.3.3 minus Hadur 3.10 and minus Tomcat, by band

| Band | Opponents | Nullstride bench | Nullstride minus Hadur (95%) | Nullstride minus Tomcat (95%) | Nullstride live minus Hadur live |
|---|---|---|---|---|---|
| 1 (1-10) | 8 | 66.86 | +20.53 (+12.93 to +28.13) | +25.17 (+14.97 to +35.36) | +21.45 |
| 2 (11-50) | 38 | 82.70 | +21.08 (+17.93 to +24.24) | +22.44 (+19.32 to +25.56) | +23.15 |
| 3 (51-200) | 147 | 89.60 | +12.34 (+11.18 to +13.51) | +16.29 (+14.81 to +17.77) | +12.88 |
| 4 (201-400) | 188 | 93.12 | +11.81 (+10.84 to +12.77) | +11.56 (+10.67 to +12.44) | +12.21 |
| 5 (401-700) | 294 | 95.31 | +7.84 (+7.18 to +8.50) | +6.29 (+5.64 to +6.93) | +8.04 |
| 6 (701+) | 485 | 98.29 | +2.64 (+2.39 to +2.90) | +1.19 (+0.99 to +1.38) | +2.68 |
| All | 1160 | 94.87 | +7.40 (+6.98 to +7.82) | +6.93 (+6.45 to +7.42) | +7.65 |

## Where the gap sits: band by Tomcat score bucket (contribution to the overall gap)

A cluster's contribution is its opponents' share of the census times its mean gap, in APS points; half A and half B use seeds 1-2 and 3-4.

| Band | Tomcat score bucket | Opponents | Mean gap | Contribution | Half A | Half B |
|---|---|---|---|---|---|---|
| 1 (1-10) | under 50 | 5 | +8.14 | +0.034 | +0.027 | +0.041 |
| 1 (1-10) | 50 to 80 | 3 | +4.62 | +0.012 | +0.013 | +0.011 |
| 2 (11-50) | under 50 | 5 | +6.90 | +0.029 | +0.028 | +0.030 |
| 2 (11-50) | 50 to 80 | 32 | +0.43 | +0.012 | +0.023 | -0.000 |
| 3 (51-200) | 50 to 80 | 113 | +5.38 | +0.509 | +0.492 | +0.527 |
| 3 (51-200) | 80 to 95 | 32 | -1.41 | -0.038 | -0.029 | -0.047 |
| 4 (201-400) | 50 to 80 | 72 | +1.47 | +0.088 | +0.084 | +0.093 |
| 4 (201-400) | 80 to 95 | 110 | -1.27 | -0.117 | -0.156 | -0.076 |
| 4 (201-400) | 95 and over | 4 | -2.17 | -0.007 | -0.008 | -0.006 |
| 5 (401-700) | 50 to 80 | 36 | -0.62 | -0.019 | -0.001 | -0.036 |
| 5 (401-700) | 80 to 95 | 187 | -1.46 | -0.229 | -0.181 | -0.282 |
| 5 (401-700) | 95 and over | 68 | -2.37 | -0.135 | -0.133 | -0.137 |
| 6 (701+) | 50 to 80 | 3 | +7.31 | +0.018 | +0.013 | +0.023 |
| 6 (701+) | 80 to 95 | 99 | -1.72 | -0.143 | -0.135 | -0.148 |
| 6 (701+) | 95 and over | 388 | -1.46 | -0.474 | -0.472 | -0.476 |

## Score breakdown inside the largest negative clusters (Hadur 3.10 minus Tomcat, per battle)

| Band | Tomcat score bucket | Opponents | Score share | Bullet dmg dealt | Bullet dmg taken | Ram dealt | Ram taken | Survival | Their survival | Last-survivor bonus |
|---|---|---|---|---|---|---|---|---|---|---|
| 5 (401-700) | 80 to 95 | 187 | -1.46 | -106 | +15 | +2 | +1 | -33 | +33 | -7 |
| 5 (401-700) | 95 and over | 68 | -2.37 | +32 | +91 | +2 | +1 | -17 | +17 | -3 |
| 6 (701+) | 80 to 95 | 99 | -1.72 | +10 | +60 | +11 | +5 | -21 | +21 | -4 |
| 6 (701+) | 95 and over | 388 | -1.46 | +16 | +61 | +5 | +3 | -9 | +9 | -2 |

## Gate readings

**G1 (bench against live).** Correlation of per-opponent score, bench against live: Hadur 3.10 0.954, Tomcat 0.990, Nullstride 0.930, all at or above 0.9. Overall gap within 0.3 of live: met (-0.14). Each band within 0.15: met in bands 3 (-0.14) and 6 (-0.06) only; band 4 is -0.27, band 5 -0.22, band 2 +0.92 and band 1 -3.22. No band's difference excludes zero (bands 1 and 2 have intervals several points wide, on 9 and 38 opponents), so the band test is neither passed nor failed on this sample: its tolerance is tighter than the data in bands 1 to 4 can resolve. The live figure for Hadur 3.10 comes from 2 to 4 rated battles an opponent, which also limits how closely any bench can agree; the per-opponent gap correlates 0.73 bench to live. The live side is Tomcat from the 2026-10-07 compare page and Hadur 3.10 from the 2026-10-08T1733Z details page.

**G2 (A/A).** Seeds 1 and 2 against seeds 3 and 4: the overall difference is +0.05 (-0.20 to +0.30), inside its interval, and so are five of six bands. Band 5 shows +0.58 (+0.12 to +1.04), one interval of seven. The M4 threshold the plan sets at twice the standard error is 0.25 APS overall (the plan estimated about 0.2).

**G3 (deficit ledger).** The two clusters named in the headline are the only ones with a contribution of at least 0.15 APS and the same sign on both halves. Band 6 with Tomcat at 80 to 95 (-0.143) and band 5 with Tomcat at 95 and over (-0.135) fall just short. Enemy gun type and movement kind are not in the rows, so the ledger is by band and score bucket, not by opponent type; adding them needs a classification of the 1,215 bots that does not exist yet.

## Reading the breakdown

In band 6, Hadur and Tomcat score about the same (5,117 against 5,104 per battle); the share gap comes from the opponent's side. Against the 388 bots Tomcat beats 95 to 5 or better, Hadur takes about 61 more bullet damage a battle and gives away about 9 more survival points (roughly one extra lost round in five battles), while dealing the same damage (+16). In band 5, against bots Tomcat holds to 5 to 20 points, Hadur deals about 106 less bullet damage and gives away 33 more survival points. In band 3 the picture reverses: Tomcat deals about 310 more bullet damage, but Hadur takes about 190 less, and wins on share. These are per-battle means over opponents, not per-battle tests.

## Timing against the M0 sizing

M0 sized M1 at 2.5 hours for Hadur 3.10 and Tomcat (9,720 battles) and 3.7 hours with Nullstride. The run took 6.9 hours for the 9,728 paired battles (`tail` 20,400 s at 24 a minute, `top` 4,345 s at 22 a minute) and a further 6.7 hours for Nullstride (23,962 s, 12 a minute): 13.5 hours with the queue restart. That is 2.8 times the paired estimate and 3.6 times the Nullstride total. The M0 sample was top-heavy and ran a single subject; I have not found why the full run is slower per battle than it predicted. Disk queue 2 to 7 and CPU 6 to 13% during the run say the host was not saturated.

## Caveats

- Four seeds a pair; per-opponent figures are noisy, band and cluster means are the reliable reading.
- All rows come from one night on one host. Hadur reads its turn times and sheds work under load, and shows round-0 duress in a majority of battles at this width; the reference builds do not report it. A bench that disadvantages Hadur slightly would read a more negative gap than live, and this one is 0.14 more negative, inside its interval.
- Tomcat's live figures are from 2026-10-07, Hadur's from 2026-10-08.

## Files

- `data/bench/2026-10-08_hadur-census-311-tail-local_cold.tsv`, `2026-10-09_hadur-census-311-top-local_cold.tsv`, `2026-10-09_hadur-census-311-nullstride-local_cold.tsv`: raw rows, one per battle.
- `data/bench/2026-10-09_hadur-census-311-ledger.tsv`: per-opponent ledger (Hadur and Tomcat share, gap, each seed half, live gap, Nullstride share, component differences).
- `data/bench/2026-10-09_hadur-census-311-late-duress.tsv`: the battles with duress after round 0.
- `data/tools/census_gap.py`: the analysis. `hadur-bench/plans/census-311-rest.queue`: the rerun plan.
