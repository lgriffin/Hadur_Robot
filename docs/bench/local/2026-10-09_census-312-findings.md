# 3.11 M4 full census and M5: first results (slow client and G4)

Date: 2026-10-10. Interim: `slow` and `g4` of `hadur-bench/plans/census-312.queue` are done; `m5` (Tomcat 3.68 against nd) is still running and is not in this document. Bench tooling, data and documents only; no change to `hadur-core` or `hadur-robot`, nothing released. `nd` is Hadur 3.10 built from the v3.10 tag with RES-9 duress never switching on (`build-ablation.sh --ref v3.10 nodur`), so it is not in the repository's source.

## What was run

- `slow`: nd against Hadur 3.10 on the 400-bot screen set (`screen-311.txt`), seeds 400 and 401, CPU constant halved to 744249, 1,600 battles, 26 min.
- `g4`: nd against Hadur 3.10 on the whole field (`census-312.txt`, 1,212 bots), seeds 400 to 403 (fresh; the screen used 301 and 302), CPU constant 1488498, 9,696 battles, 12.6 h (13 battles a minute, not the 47 the screen reached).
- Both: 35 rounds, Robocode 1.11.1, parallel 12, child CPUs 2, heap 2G, RoboRumble workers stopped.
- Rows: `data/bench/2026-10-09_hadur-census-312-{slow,g4}-local_cold.tsv`. Reports: `2026-10-09_census-312-{slow,g4}.md`. Per-round files exported but not committed.
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

## Caveats

- Two seeds in `slow`, four in `g4`; band cells in bands 1 and 2 are wide.
- The bench's load inflates the start-up duress that nd removes, so the live gain is at most the bench figure; the G4 gain not tracking the duress rate (above) points the other way, and neither is settled.
- `m5` (bench gap to Tomcat, pass at +0.3 APS) is not read yet.
