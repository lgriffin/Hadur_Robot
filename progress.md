# Queue pc-r31: progress

Updated 2026-11-14 11:02:54 PC time (11:02 UTC), runner pid 38732.

- `prep` done, exit 0 in 6 min
- `screen` done, exit 0 in 1.4 h
- `pick` done, exit 0 in 3 min
- `lock` done, exit 0 in 24 min
- `gate` done, exit 0 in 0 min
- `pr` done, exit 0 in 0 min

### lock

**924 of 924 battles** (100%), 0 failed, 718 read back from an earlier run. Running 24 min, 525 battles/h, about 0 min left (ends ~11:02 PC time). Last battle 0 min ago.
Skipped turns a battle: 12.7 overall, first 100 12.3, last 100 13.2; engine disables 6.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 132 | 0 | 68.17 | - | - | - | 11.1 |
| aa | 132 | 0 | 66.66 | -0.01 (11 robots) | ±0.01 | -0.03 .. -0.00 | 10.9 |
| mtzl | 132 | 0 | 70.16 | +0.02 (11 robots) | ±0.03 | -0.03 .. +0.08 | 11.1 |
| fq | 132 | 0 | 68.47 | +0.01 (11 robots) | ±0.02 | -0.01 .. +0.03 | 10.5 |
| gl | 132 | 0 | 69.97 | +0.02 (11 robots) | ±0.02 | -0.00 .. +0.05 | 11.2 |
| x5 | 132 | 0 | 68.50 | +0.01 (11 robots) | ±0.01 | -0.01 .. +0.03 | 10.4 |
| rp | 132 | 0 | 68.76 | +0.01 (11 robots) | ±0.01 | -0.01 .. +0.03 | 11.1 |

APS = mean difference over the robots read x 11 panel robots / 1217 pairings.
A/A: aa - c -1.51 pts over 11 robots; 1% band ±1.02 (OUTSIDE: comparisons void).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 924 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | ok | 12.8 a battle over the last 200 (first 200: 12.8) |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `aa after 20%` | halt | TRIPPED | aa - c -1.51 pts over 11 robots, stop band ±1.33 (observed spread) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

> warning: jobs are in set order (no --shuffle-jobs): running means read the set's first robots

### Queue log (last lines)

```
10:39:12 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant calibrated; work D:\code\Hadur_Robot\hadur-bench\work
10:39:12 skip prep (already exit=0)
10:39:12 skip screen (already exit=0)
10:39:12 skip pick (already exit=0)
10:39:12 start lock
10:39:12 watching lock: 5 stop rule(s), shown only
10:39:14 progress pushed to origin claude/pc-r31-progress (every 15 min)
10:40:12 progress lock: 730/924 (79%) battles, 714/h, ETA 16 min, 0 failed, skips 11.2/battle (last 100), aa -0.01, mtzl +0.02, fq +0.01, gl +0.02, x5 +0.00, rp +0.01
10:41:13 stop rule aa after 20% would trip on lock (aa - c -1.42 pts over 11 robots, stop band ±1.36 (observed spread)); not acted on
11:02:46 lock exit=0 in 1413 s
11:02:46 start gate
11:02:47 gate exit=0 in 0 s
11:02:47 start pr
11:02:54 pr exit=0 in 7 s
11:02:54 ALLDONE
```
