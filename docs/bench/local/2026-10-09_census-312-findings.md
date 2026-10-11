# 3.11 M4 full census and M5: results (slow client, G4 and M5)

Date: 2026-10-10. All three steps of `hadur-bench/plans/census-312.queue` are done (the queue ran 13:27 on 2026-10-09 to 15:04 on 2026-10-10, 25.6 h). Bench tooling, data and documents only; no change to `hadur-core` or `hadur-robot`, nothing released. `nd` is Hadur 3.10 built from the v3.10 tag with RES-9 duress never switching on (`build-ablation.sh --ref v3.10 nodur`), so it is not in the repository's source.

## What was run

- `slow`: nd against Hadur 3.10 on the 400-bot screen set (`screen-311.txt`), seeds 400 and 401, CPU constant halved to 744249, 1,600 battles, 26 min.
- `g4`: nd against Hadur 3.10 on the whole field (`census-312.txt`, 1,212 bots), seeds 400 to 403 (fresh; the screen used 301 and 302), CPU constant 1488498, 9,696 battles, 12.6 h (13 battles a minute, not the 47 the screen reached).
- `m5`: Tomcat 3.68 (candidate) against nd (baseline) on the census less Tomcat (`census-312-tomcat.txt`, 1,211 bots), seeds 400 to 403, CPU constant 1488498, 9,688 battles, 12.6 h.
- All: 35 rounds, Robocode 1.11.1, parallel 12, child CPUs 2, heap 2G, RoboRumble workers stopped.
- Rows: `data/bench/2026-10-09_hadur-census-312-{slow,g4}-local_cold.tsv` and `2026-10-10_hadur-census-312-m5-local_cold.tsv`. Reports: `2026-10-09_census-312-{slow,g4}.md`, `2026-10-10_census-312-m5.md`. Per-round files exported but not committed.
- Reading: `data/tools/screen_paired.py` with the matching `--set`; census row rules (a battle with a security denial, another Robocode JVM or duress after round 0 is dropped with its partner), and a nothing-dropped reading.

## G4: nd against 3.10 on the whole field

| Reading | Opponents kept | APS gain (95%) |
|---|---|---|
| Census row rules | 1,121 of 1,212 | +0.72 (+0.56 to +0.87) |
| Nothing dropped | 1,212 | +0.73 (+0.59 to +0.87) |

By band (census row rules, APS contribution, 95%):

| Band (ranks) | Kept / in set | Mean share difference | APS it adds |
|---|---|---|---|
| 1 (1-10) | 7 / 10 | +2.19 (-1.21 to +5.59) | +0.018 (-0.010 to +0.046) |
| 2 (11-50) | 32 / 38 | -0.04 (-1.06 to +0.98) | -0.001 (-0.033 to +0.031) |
| 3 (51-200) | 133 / 149 | +0.95 (+0.27 to +1.63) | +0.117 (+0.033 to +0.201) |
| 4 (201-400) | 194 / 200 | +0.65 (+0.27 to +1.03) | +0.108 (+0.045 to +0.170) |
| 5 (401-700) | 267 / 300 | +1.06 (+0.71 to +1.42) | +0.264 (+0.175 to +0.352) |
| 6 (701+) | 488 / 515 | +0.50 (+0.36 to +0.63) | +0.211 (+0.153 to +0.269) |

G4 reading: the gain is 0.72, above the 0.25 threshold, with the lower bound 0.56 above 0; no band is below -0.05 APS (the lowest is band 2 at -0.001); and it keeps all of the screen's gain (+0.72 on the screen), more than the half asked for. Bands 3 to 6 each have an interval above zero; bands 1 and 2 hold 48 bots and cannot be told from zero. On the bench, G4 passes.

The `otherJvms` rule dropped 573 of 4,848 pairs here (12%); both readings agree to 0.01 APS.

Duress in the 3.10 rows: 60% of battles at parallel 12 on the whole field (the screen's 32 to 36%, the M1 census 63%). nd shows 0%. The gain did not grow with the duress rate (+0.72 at 32 to 36%, +0.72 at 60%), so the bench load does not explain it on this evidence; the screen's p4 run (11% duress) was not repeated on the whole field.

## Slow client: nd against 3.10 with the CPU constant halved

| Build | Battles | Mean score share | Skipped turns a battle | Battles with duress |
|---|---|---|---|---|
| Hadur 3.10nd | 800 | 85.1% | 563 | 0% |
| Hadur 3.10 | 800 | 48.4% | 167 | 100%, all after round 0 |

Every 3.10 battle is in duress after round 0, so the census row rules drop all 800 pairs and only the nothing-dropped reading exists. nd gains **+36.8 APS (+35.2 to +38.4)** over 3.10 on the screen set, by band +42 (band 1), +47, +48, +45, +40 and +28 (band 6) points a bot. The plan's pass criterion (nd no worse than -0.10 APS, and 3.10 duress well above 32 to 36%) is met, with 100% duress.

On the bench, then, a slow client does not make duress protect the score: 3.10 skips a third as many turns as nd (167 against 563 a battle) and loses 37 points of share for it. What RES-9 may protect on the live rumble beyond score (if anything) cannot be seen on this bench, and this run does not say whether halving the CPU constant resembles any live host.

## M5: nd against Tomcat 3.68 on the bench

`screen_paired.py` gives Tomcat minus nd; the table is signed the other way, nd minus Tomcat, in APS (95%).

| Reading | Opponents kept | nd ahead of Tomcat by |
|---|---|---|
| Census row rules | 1,105 of 1,211 | +0.08 (-0.20 to +0.36) |
| Nothing dropped | 1,211 | +0.09 (-0.17 to +0.36) |

By band (census row rules; nd minus Tomcat, APS contribution, 95%):

| Band (ranks) | Kept / in set | Mean share difference | APS it adds |
|---|---|---|---|
| 1 (1-10) | 9 / 9 | +5.89 (+1.12 to +10.67) | +0.044 (+0.008 to +0.079) |
| 2 (11-50) | 38 / 38 | +1.06 (-0.45 to +2.57) | +0.033 (-0.014 to +0.081) |
| 3 (51-200) | 135 / 149 | +4.23 (+2.62 to +5.84) | +0.521 (+0.322 to +0.719) |
| 4 (201-400) | 181 / 200 | +0.80 (-0.01 to +1.62) | +0.132 (-0.002 to +0.267) |
| 5 (401-700) | 276 / 300 | -0.93 (-1.32 to -0.54) | -0.230 (-0.327 to -0.134) |
| 6 (701+) | 466 / 515 | -0.98 (-1.17 to -0.80) | -0.418 (-0.497 to -0.338) |

M5 asks for nd ahead of Tomcat by +0.3 APS or more. **M5 is not met on the bench**: +0.08 (+0.09 with nothing dropped), with an interval that reaches +0.36 but whose centre is a quarter of the line.

The reading fits the earlier numbers. M1 put 3.10 behind Tomcat by 0.48 APS on 1,194 bots; adding nd's +0.72 predicts about +0.24 for nd, and +0.08 to +0.09 sits inside this interval. The shape is M1's: nd is ahead of Tomcat in ranks 1 to 400 (+0.73 APS, 0.52 of it in ranks 51 to 200) and behind it from rank 401 down (-0.65 APS, 815 bots). Removing duress did not touch the tail gap, which is where the remaining 0.2 to 0.4 APS to the line sits.

Tomcat shows no duress (as in M1, it does not report it); `otherJvms` dropped 675 of 4,844 pairs (14%), and both readings agree to 0.01 APS.

## Reading against the plan

- G4 (nd against 3.10, whole field): met on the bench, +0.72 APS.
- Slow client: met; duress costs score there, nd gains +36.8 APS.
- M5 (nd ahead of Tomcat by +0.3 APS): not met, +0.08 to +0.09 (-0.20 to +0.36).
- So nd is a safe bench gain of about 0.7 APS that, by itself, does not close the gap to Tomcat. The rest is in ranks 401 and below (bullets taken, M1's G3 clusters), which duress does not touch. Whether to release nd, and what to try for the tail, is the owner's call; nothing is released.

## Caveats

- Two seeds in `slow`, four in `g4`; band cells in bands 1 and 2 are wide.
- The bench's load inflates the start-up duress that nd removes, so the live gain is at most the bench figure; the G4 gain not tracking the duress rate (above) points the other way, and neither is settled.
- No seed-half check of `m5` was run; the M1 census's seed halves agreed to 0.05 APS (G2).
- Both `g4` and `m5` ran at 13 battles a minute, about half the M1 census's 24 and a quarter of the screen's 47; the cause of the M0 sizing misses is still not found.
