# Hadur 3.8.5 in melee, team and 1v1 top 20 against 3.7 and 3.8, local bench

Run overnight on 2026-10-06 to 2026-10-07 on the owner's PC (Threadripper PRO 9965WX, 48 logical cores, 130 GB, Windows 11).
CPU constant pinned at 1488498, `-XX:ActiveProcessorCount=2` per battle JVM, every battle JVM capped at `-Xmx2G` after
uncapped heaps pushed the host to its memory limit. The RoboRumble workers were stopped, so no other Robocode JVMs ran
beyond the bench's own. Nothing in `hadur-core` or `hadur-robot` was changed. The candidate is the released 3.8.5 jar,
paired by seed against the released 3.8 and 3.7 jars (HadurTeam 3.8 and 3.7 for team). This document reports what was
measured. It makes no recommendation about what to change in Hadur.

Engines: melee and team ran on Robocode 1.9.5.6 (the bench default, as the earlier 3.8-against-3.7 run did). The 1v1 runs
ran on 1.11.1 (`--engine 1.11.1`), as the other 3.8.5 runs did. The tier2 run ran with the child heap **uncapped** (it
finished before the cap was added); everything else ran at 2G.

Raw rows, all in `data/bench/` and in `data/catalog.tsv`:
`2026-10-07_hadur-melee-top20-385-vs-{38,37}-local_cold.tsv`, `2026-10-07_hadur-team-top20-385-vs-{37,38}-local_cold.tsv`,
`2026-10-07_hadur-top20-385-vs-37-local_cold.tsv` (and `_rounds.tsv`), `2026-10-07_hadur-tier2-385-local_cold.tsv` (and `_rounds.tsv`).
Per-run reports sit beside this file: `2026-10-06_melee-top20-385-vs-38*`, `2026-10-07_melee-top20-385-vs-37*`,
`2026-10-06_team-top20-385-vs-37*`, `2026-10-07_team-top20-385-vs-38*`, `2026-10-07_top20-385-vs-37*`, `2026-10-06_tier2-385*`.
Earlier comparison: `2026-10-06_melee-team-findings.md` (3.8 against 3.7) and `2026-10-06_385-vs-38-findings.md` (1v1, 3.8.5 against 3.8).

## Headline

| Arena | 3.8.5 minus 3.8 | 3.8.5 minus 3.7 |
|---|---|---|
| Melee top 20, pooled APS | +0.5 ± 1.1, not resolved | +0.6 ± 0.8, not resolved |
| Team top 20, score share | -0.1 ± 0.7, not resolved (within about a point of 3.8) | +25.1 ± 2.1, resolved |
| 1v1 top 20, score share | -1.12 ± 1.56, not resolved (`2026-10-06_385-vs-38-findings.md`) | +2.3 ± 1.0 per battle, not resolved once opponents are clustered (± 3.3) |
| 1v1 tier2 (15 opponents), score share | -0.29 ± 0.80, within 1 point of 3.8 | not run |

In melee and team 3.8.5 is level with 3.8, which is what the earlier 1v1 runs showed. Against 3.7 the team gain is the
large one found for 3.8; melee shows no resolved difference either way.

## Melee top 20 (five fields of ten, 10 seeds a field, 35 rounds, 1000x1000, parallel 5)

Pooled paired APS over (field, seed) cells, from `data/tools/melee_pairwise.py --tsv`:

| Field | vs 3.8: 3.8.5 APS | 3.8 APS | Paired diff | vs 3.7: 3.8.5 APS | 3.7 APS | Paired diff |
|---|---|---|---|---|---|---|
| A | 50.8 | 50.9 | -0.1 ± 2.6 | 50.5 | 51.5 | -1.0 ± 2.4 |
| B | 49.9 | 49.8 | +0.1 ± 1.6 | 50.8 | 49.2 | +1.7 ± 1.5 |
| C | 51.2 | 50.1 | +1.1 ± 3.5 | 51.1 | 50.6 | +0.5 ± 2.1 |
| D | 51.9 | 52.7 | -0.8 ± 2.6 | 52.3 | 50.9 | +1.4 ± 1.3 |
| E | 49.9 | 47.6 | +2.3 ± 3.6 | 49.8 | 49.4 | +0.4 ± 2.6 |
| Pooled, 50 cells | 50.7 | 50.2 | **+0.5 ± 1.1** | 50.9 | 50.3 | **+0.6 ± 0.8** |

Both pooled intervals include zero, so neither difference is resolved. Fields B and D against 3.7 resolve on their own
(+1.7 ± 1.5, +1.4 ± 1.3); with five fields and no correction that is not a result. Mean finishing place in a ten-robot field:
3.8.5 5.22 against 3.8 5.66, and 3.8.5 5.20 against 3.7 5.50.

Opponent level (Hadur's pairwise share, 100 H / (H + X), 3.8.5 minus the baseline, pooled over each robot's 20 to 30 battles):
the spread is small. Against 3.8 the lowest are PastFuture -1.9 ± 2.6 and Portia -1.2 ± 2.3 and the highest Aleph +2.0 ± 2.1,
Combat +1.8 ± 2.3, Neuromancer +1.7 ± 2.1. Against 3.7 the lowest are Matcha -1.1 ± 2.7 and Mallais -1.1 ± 2.7, the highest
Portia +1.8 ± 2.2, Combat +1.7 ± 2.2, Mirage +1.7 ± 2.2. No robot resolves against 3.8; against 3.7 only Figment
(+1.5 ± 1.5, 30 battles) has an interval clear of zero, uncorrected across 20 robots. Differences under about 3 points per
robot cannot be resolved with this many battles. The earlier 3.8-against-3.7 run's clearest losses (Shadow, Mallais, Lambda,
Numbat, Wallaby in field C) do not repeat for 3.8.5 against 3.7: Mallais is -1.1 ± 2.7 and the rest are not among the lowest.

### Trust: duress

| Per battle | 3.8.5, 3.8 run | 3.8 | 3.8.5, 3.7 run | 3.7 |
|---|---|---|---|---|
| Skipped turns | 69.8 | 67.5 | 83.6 | 67.2 |
| Duress ticks | 99.3 | 81.8 | 99.2 | 28.8 |

Skipped turns are close for 3.8.5 and 3.8 and about 25% higher for 3.8.5 than 3.7. Duress ticks are 1.2 times 3.8's and 3.4
times 3.7's. The earlier run saw 126.6 (3.8) and 70.5 (3.7) with the rumble clients on and a different parallel width and
heap setting, so the absolute values are not comparable, but the direction repeats: later releases spend more ticks in
duress than 3.7 in melee. The harness cannot tell whether that is the robot tripping its own turn timer or host heat, and
the APS result does not show the extra duress costing points. Recorded, not tested.

## Team top 20 (20 opponents, 10 seeds, 35 rounds, 1200x1200, parallel 4)

Note the round count: this run fought 35 rounds a battle, the earlier 3.8-against-3.7 team run fought 10. Shares are
comparable, round totals are not.

| Measure | 3.8.5 | 3.7 | Paired diff (pp) | 3.8.5 | 3.8 | Paired diff (pp) |
|---|---|---|---|---|---|---|
| Score share, all teams | 43.5% | 18.3% | **+25.1 ± 2.1** per battle, ± 7.0 clustered by opponent | 43.3% | 43.4% | **-0.1 ± 0.7**, ± 0.4 clustered |
| Rounds won | 3201 of 6941 | 799 of 6968 | | 3176 of 6932 | 3206 of 6934 | |
| Skipped turns per battle | 7.5 | 3.8 | | 7.8 | 7.7 | |
| Duress ticks per battle | 36.1 | 31.8 | | 32.4 | 30.3 | |

400 of 400 battles in each file completed. Against 3.7, 3.8.5 is ahead of 18 of 20 teams, each with an interval clear of
zero. The two it is behind on are Polylunar (-12.1 ± 1.9) and Nightmare (-3.1 ± 1.1), the same two as 3.8's run
(-8.9 and -3.9). Largest gains: Omega Squad +46.2, Valkiries +39.6, GrubbmGroup +38.8, GlowingHawks +37.9, HOFSwarm +37.2.
Smallest gains among the ahead: Combat +10.3 ± 1.9, Firestarter +12.5 ± 1.4, Shadow +14.9 ± 2.6, Aleph +16.6 ± 2.0.
Against 3.8, no team's interval excludes zero; the extremes are Aleph -1.8 ± 2.9 and Omega Squad +1.9 ± 4.2. Skipped turns
and duress are level for 3.8.5 and 3.8, and low for all three builds, so load does not explain the 3.7 gap.

## 1v1 top 20, 3.8.5 against 3.7 (20 seeds, 35 rounds, Robocode 1.11.1, 400 pairs)

`data/tools/analyse.py` on `2026-10-07_hadur-top20-385-vs-37-local_cold.tsv`, score share in points:

- Pooled per battle: **+2.32 ± 0.98** [+1.34, +3.29]. Pooled opponent-clustered: +2.32 ± 3.27 [-0.96, +5.59], n=20.
  The per-battle interval excludes zero, the clustered one does not, so the pooled difference is **not resolved** once the
  opponents' own spread is allowed for.
- TOST margin 1.0: non-inferior in both views (per battle p<0.0001, clustered p=0.0237); equivalence rejected in both
  (3.8.5 is not shown to be within a point of 3.7 either way, only to be no worse).
- Holm survivors (9 of 20): Diamond +17.2 ± 3.9, DrussGT +14.2 ± 3.5, Firestarter +12.3 ± 3.5, BeepBoop +7.6 ± 2.3,
  ScalarR +6.7 ± 2.3, Knight +6.3 ± 3.5, Neuromancer +6.3 ± 3.9 for 3.8.5, and Wavelet -8.9 ± 3.5, Raven -6.4 ± 4.1 against it.
  Benjamini-Hochberg adds WhiteFang -4.2, WaveSerpent -3.8, Gilgalad +4.5 and Roborio +3.3 (not Holm-significant).
- Skipped turns per battle 22.3 (3.8.5) and 20.5 (3.7); duress ticks 21.6 and 25.1.

The 3.8.5-against-3.7 gaps against Diamond, DrussGT and Firestarter are the gaps 3.8 showed in the earlier run. Wavelet and
Raven are the robots 3.8.5 is behind 3.7 on. All 800 battles completed.

## 1v1 tier2, 3.8.5 against 3.8 (20 seeds, 15 opponents, uncapped child heap)

- Pooled per battle -0.29 ± 0.80 [-1.10, +0.51]; opponent-clustered -0.29 ± 0.49 [-0.78, +0.20].
- TOST margin 1.0: equivalent in both views (per battle p=0.042, clustered p=0.004), so 3.8.5 is within a point of 3.8 on this
  set.
- No opponent is significant after Holm or BH; the per-opponent differences run from -1.5 ± 5.0 (Foilist) to +1.5 ± 3.5
  (CassiusClay).
- zen.Ronin 1.0.0 failed all 20 battles in both builds (40 of 640 rows not ok). It is excluded from every figure here, and
  the failure hits both builds alike. The tier2 set therefore has 15 opponents with results, not 16.
- Skipped turns per battle 16.1 (3.8.5) and 16.7 (3.8); duress ticks 16.6 and 6.0.

## What the data says and does not say

- 3.8.5 is level with 3.8 in melee, team and tier2 1v1, as it was on the leak set, top 20 and DrussGT. No arena shows a
  resolved gain or loss between the two releases.
- Against 3.7, 3.8.5 keeps the team gain (+25 points) and shows no resolved melee difference. The 1v1 top 20 gain over 3.7
  (+2.3) resolves per battle but not across opponents; nine opponents resolve one by one, seven for 3.8.5 and two against.
- Duress in melee is higher for 3.8.5 than for 3.7 (3.4 times) and than for 3.8 (1.2 times). Cause not established.
- The engines differ between arenas (1.11.1 for 1v1, 1.9.5.6 for melee and team) and the host differs from the live
  rumble, so none of this is a claim about live ranking.
- Seed pairing removes about no variance (the charter's principle 1), so the intervals here are valid but wide. The melee
  per-robot figures use 20 to 30 battles a robot and are not resolvable below about 3 points.
