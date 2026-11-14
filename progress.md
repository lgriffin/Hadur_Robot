# Queue pc-r31: progress

Updated 2026-11-14 10:04:21 PC time (10:04 UTC), runner pid 39620.

- `prep` done, exit 0 in 6 min
- `screen` done, exit 0 in 1.4 h
- `pick` done, exit 0 in 3 min
- `lock` running
- `gate` skipped
- `pr` skipped

### lock

**430 of 924 battles** (47%), 0 failed. Running 12 min, 2186 battles/h, about 14 min left (ends ~10:17 PC time). Last battle 0 min ago.
Skipped turns a battle: 10.7 overall, first 100 11.4, last 100 10.6; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 62 | 0 | 68.82 | - | - | - | 11.0 |
| aa | 62 | 0 | 67.49 | -0.01 (10 robots) | ±0.02 | -0.04 .. +0.01 | 10.0 |
| mtzl | 63 | 0 | 70.77 | +0.03 (10 robots) | ±0.04 | -0.03 .. +0.08 | 10.2 |
| fq | 61 | 0 | 68.83 | +0.01 (10 robots) | ±0.02 | -0.03 .. +0.04 | 10.5 |
| gl | 61 | 0 | 70.16 | +0.02 (10 robots) | ±0.02 | -0.01 .. +0.05 | 11.4 |
| x5 | 60 | 0 | 68.38 | +0.00 (10 robots) | ±0.02 | -0.02 .. +0.03 | 10.6 |
| rp | 61 | 0 | 68.76 | +0.01 (10 robots) | ±0.01 | -0.01 .. +0.02 | 11.0 |

APS = mean difference over the robots read x 11 panel robots / 1217 pairings.
A/A: aa - c -1.33 pts over 10 robots; 1% band ±1.48 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 430 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | ok | 10.6 a battle over the last 200 (first 200: 10.7) |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `aa after 20%` | halt | ok | aa - c -1.33 pts over 10 robots, stop band ±2.63 (observed spread) |

Stopping now would leave 494 battles unrun (about 14 min); every battle already fought is kept and a rerun resumes from it.

> warning: jobs are in set order (no --shuffle-jobs): running means read the set's first robots

### Queue log (last lines)

```
09:47:58 start pick
09:48:16 pick exit=2 in 18 s
09:48:16 skip lock (after pick, which has not finished exit=0)
09:48:16 skip gate (after lock, which has not finished exit=0)
09:48:16 skip pr (after gate, which has not finished exit=0)
09:48:16 ALLDONE
09:49:12 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant calibrated; work D:\code\Hadur_Robot\hadur-bench\work
09:49:12 skip prep (already exit=0)
09:49:12 skip screen (already exit=0)
09:49:12 start pick
09:49:14 progress pushed to origin claude/pc-r31-progress (every 15 min)
09:52:32 pick exit=0 in 200 s
09:52:32 start lock
09:52:32 watching lock: 5 stop rule(s)
09:53:14 progress lock: 14/924 (2%) battles, 1221/h, ETA 45 min, 0 failed, skips 13.1/battle (last 100)
```
