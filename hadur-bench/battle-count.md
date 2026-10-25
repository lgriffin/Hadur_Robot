# Battles simulated

A running tally of every bench battle the project has run, counted from the bench
reports on master. Last counted 2026-10-25 11:30 UTC, at master `aad907c9`.

**Total: about 333,000 battles** (PC about 309,000, cloud about 24,000).

| Period | PC | Cloud | Total |
|---|---:|---:|---:|
| Up to 2026-10-05 (S, M and R stages) | 0 | ~2,500 | ~2,500 |
| 2026-10-06 to 10-14 | 130,629 | 892 | 131,521 |
| 2026-10-15 to 10-20 | 73,420 | 20,093 | 93,513 |
| 2026-10-21 to 10-25 | 104,645 | 528 | 105,173 |
| **Total** | **308,694** | **~24,000** | **~332,700** |

## How it is counted

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

- pc-surf-b, which was still running when this was counted.
- Battles thrown away or replayed, for example the 1,819 census battles replayed after
  the 2026-10-22 restart.
- Runs that never got a report, and the battles in CI tests.
- Live RoboRumble battles, which are kept apart: the server shows about 23,000 1v1
  battles for Hadur 3.7 to 3.16 (the release pass reads in `docs/bench/live-3.*.md`).
  That figure covers every uploader, not only our clients, and has no melee, no team
  and no releases before 3.7.

## Updating

Add each new card's battles to its period row and move the "Last counted" line. When
the PC work folder is read, add the battles that never reached a report.
