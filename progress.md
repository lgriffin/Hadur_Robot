# Queue pc-r31: progress

Updated 2026-11-14 10:54:19 PC time (10:54 UTC), runner pid 38732.

- `prep` done, exit 0 in 6 min
- `screen` done, exit 0 in 1.4 h
- `pick` done, exit 0 in 3 min
- `lock` running
- `gate` skipped
- `pr` skipped

### lock

**903 of 924 battles** (98%), 0 failed, 718 read back from an earlier run. Running 15 min, 734 battles/h, about 2 min left (ends ~10:56 PC time). Last battle 2 min ago.
Skipped turns a battle: 12.9 overall, first 100 12.3, last 100 13.6; engine disables 6.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 128 | 0 | 68.02 | - | - | - | 11.1 |
| aa | 128 | 0 | 66.74 | -0.01 (11 robots) | ±0.01 | -0.02 .. +0.00 | 10.9 |
| mtzl | 131 | 0 | 70.20 | +0.03 (11 robots) | ±0.03 | -0.03 .. +0.08 | 11.1 |
| fq | 128 | 0 | 68.37 | +0.01 (11 robots) | ±0.02 | -0.02 .. +0.03 | 10.5 |
| gl | 130 | 0 | 70.01 | +0.02 (11 robots) | ±0.02 | -0.00 .. +0.05 | 11.1 |
| x5 | 126 | 0 | 68.63 | +0.01 (11 robots) | ±0.01 | -0.01 .. +0.03 | 10.5 |
| rp | 132 | 0 | 68.76 | +0.01 (11 robots) | ±0.01 | -0.01 .. +0.03 | 11.1 |

APS = mean difference over the robots read x 11 panel robots / 1217 pairings.
A/A: aa - c -1.28 pts over 11 robots; 1% band ±1.03 (OUTSIDE: comparisons void).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 903 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | waiting | 185 of 200 battles to read |
| `stall 30m` | halt | ok | last battle 2 min ago |
| `aa after 20%` | halt | ok | aa - c -1.28 pts over 11 robots, stop band ±1.33 (observed spread) |

Stopping now would leave 21 battles unrun (about 2 min); every battle already fought is kept and a rerun resumes from it.

> warning: jobs are in set order (no --shuffle-jobs): running means read the set's first robots

### Queue log (last lines)

```
09:52:32 watching lock: 5 stop rule(s)
09:53:14 progress lock: 14/924 (2%) battles, 1221/h, ETA 45 min, 0 failed, skips 13.1/battle (last 100)
10:17:28 STOP lock by rule aa after 20%: aa - c -1.39 pts over 11 robots, stop band ±1.38 (observed spread); 717 battles fought and kept, 207 battles left unrun (about 7 min)
10:17:28 lock exit=75 in 1496 s (halted, aa after 20%)
10:17:30 alert issue: https://github.com/lgriffin/Hadur_Robot/issues/816
10:17:30 queue halted by a stop rule; fix the cause and rerun to resume (every fought battle is kept)
10:39:12 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant calibrated; work D:\code\Hadur_Robot\hadur-bench\work
10:39:12 skip prep (already exit=0)
10:39:12 skip screen (already exit=0)
10:39:12 skip pick (already exit=0)
10:39:12 start lock
10:39:12 watching lock: 5 stop rule(s), shown only
10:39:14 progress pushed to origin claude/pc-r31-progress (every 15 min)
10:40:12 progress lock: 730/924 (79%) battles, 714/h, ETA 16 min, 0 failed, skips 11.2/battle (last 100), aa -0.01, mtzl +0.02, fq +0.01, gl +0.02, x5 +0.00, rp +0.01
10:41:13 stop rule aa after 20% would trip on lock (aa - c -1.42 pts over 11 robots, stop band ±1.36 (observed spread)); not acted on
```
