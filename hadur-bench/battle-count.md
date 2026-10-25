# Battles simulated

A running tally of every bench battle the project has run. Last counted 2026-10-25
11:40 UTC: the PC from its work folders, the cloud from the bench reports on master
(`aad907c9`).

**Total: about 334,000 battles** (PC 310,180, cloud about 24,000).

## PC: 310,180 (counted from the work folders)

Every battle folder with a finished result file (`result.csv` duel, `team.csv` team,
`melee.csv` melee) under `hadur-bench\work` on the PC, 195 runs. The E:\hadur-bench-work
NVMe runs are junctions into that folder and are counted once. Duel 291,996, team
17,662, melee 522.

| Day | Runs | Battles |
|---|---:|---:|
| 10-06 | 35 | 7,207 |
| 10-07 | 19 | 11,824 |
| 10-08 | 14 | 18,492 |
| 10-09 | 7 | 21,352 |
| 10-10 | 1 | 9,688 |
| 10-11 | 15 | 23,658 |
| 10-12 | 9 | 19,656 |
| 10-13 | 2 | 12,896 |
| 10-14 | 1 | 129 |
| 10-17 | 5 | 14,248 |
| 10-18 | 2 | 16,096 |
| 10-19 | 16 | 25,472 |
| 10-20 | 8 | 17,616 |
| 10-21 | 7 | 14,732 |
| 10-22 | 6 | 34,549 |
| 10-23 | 22 | 26,872 |
| 10-24 | 19 | 26,472 |
| 10-25 | 7 | 9,221 |

Included, but with no report on master (9,755 in all):

| Run | Battles | Why |
|---|---:|---|
| surf-b-census (pc-surf-b) | 5,352 of 7,272 | Still running at the count |
| team-s2-bb, -dn, -dl, -dndl | 2,208 | Finished 10-23, never reported |
| top5-s4-rc-hdd-partial | 2,025 | Discarded HDD run; restarted on NVMe as top5-s4-rc |
| plan90-trim (PC) | 129 | Aborted 10-14 |
| smoke-* | 41 | 10-06 harness smokes |

## Cloud: about 24,000 (counted from the reports)

| Period | Battles |
|---|---:|
| Up to 2026-10-05 (S, M and R stages) | ~2,500 (estimate) |
| 2026-10-06 to 10-14 | 892 |
| 2026-10-15 to 10-20 | 20,093 |
| 2026-10-21 to 10-25 | 528 |

## How the reports are counted

The cloud figure, and a cross-check on the PC figure (the reports give about 308,700
on PC hosts, against 310,180 in the folders):

- Single-run reports (`docs/bench/local/*.md`, about 640 runs): the battle count in each
  run's `Skipped turns: S over N battles` line. A candidate run and its paired baseline
  count as two runs, because both were played. A line repeated inside one file (the
  full-report copy) counts once.
- Multi-arm reports (2026-10-21 on): the `Battles` column of the first arm table, one
  row per arm. Re-renders of the same run count once: `top5-s2-pooled` (= half1 + half2),
  the second `top5-s4-rc` and `table-v1-screen`, the `modes-*-screen` copies and the
  combined `top5-s0`. Gate and pick reports read battles that are already counted.
- Worker ladder (pc-ladder): 6 duel blocks x 416 + 3 team blocks x 184 = 3,048.
- Host comes from the report's conditions: Threadripper / 48 cores = PC; 4 cores
  (Xeon) = cloud.
- Up to 2026-10-05 is an estimate. Those reports (`docs/bench/*.md`) give opponents x
  seeds, not a total, and some give neither.

## Not counted

- The rest of pc-surf-b after 11:40 UTC on 2026-10-25.
- PC battles that died before writing a result file, and the battles in CI tests.
- Cloud runs that never got a report.
- Live RoboRumble battles, which are kept apart: the server shows about 23,000 1v1
  battles for Hadur 3.7 to 3.16 (the release pass reads in `docs/bench/live-3.*.md`).
  That figure covers every uploader, not only our clients, and has no melee, no team
  and no releases before 3.7.

## Updating

Add each new card's battles to its day row and move the "Last counted" line. For the
PC, recount the finished result files under `hadur-bench\work` (read only).
