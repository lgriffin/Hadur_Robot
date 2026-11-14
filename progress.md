# Queue pc-r31: progress

Updated 2026-11-14 10:17:30 PC time (10:17 UTC), runner pid 39620.

- `prep` done, exit 0 in 6 min
- `screen` done, exit 0 in 1.4 h
- `pick` done, exit 0 in 3 min
- `lock` halted, exit 75 in 25 min, HALTED by aa after 20%: aa - c -1.39 pts over 11 robots, stop band ±1.38 (observed spread)
- `gate` skipped
- `pr` skipped

### lock

**718 of 924 battles** (78%), 0 failed. Running 25 min, 1728 battles/h, about 7 min left (ends ~10:24 PC time). Last battle 0 min ago.
Skipped turns a battle: 10.4 overall, first 100 11.4, last 100 9.6; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 101 | 0 | 68.36 | - | - | - | 10.5 |
| aa | 103 | 0 | 66.83 | -0.01 (11 robots) | ±0.01 | -0.03 .. -0.00 | 9.9 |
| mtzl | 102 | 0 | 70.28 | +0.02 (11 robots) | ±0.03 | -0.03 .. +0.08 | 10.0 |
| fq | 102 | 0 | 68.42 | +0.01 (11 robots) | ±0.02 | -0.02 .. +0.03 | 10.4 |
| gl | 105 | 0 | 69.81 | +0.02 (11 robots) | ±0.02 | -0.00 .. +0.05 | 10.9 |
| x5 | 101 | 0 | 67.77 | +0.00 (11 robots) | ±0.01 | -0.02 .. +0.02 | 10.4 |
| rp | 104 | 0 | 68.87 | +0.01 (11 robots) | ±0.01 | -0.01 .. +0.03 | 10.7 |

APS = mean difference over the robots read x 11 panel robots / 1217 pairings.
A/A: aa - c -1.54 pts over 11 robots; 1% band ±1.16 (OUTSIDE: comparisons void).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 718 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | ok | 9.8 a battle over the last 200 (first 200: 10.7) |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `aa after 20%` | halt | TRIPPED | aa - c -1.54 pts over 11 robots, stop band ±1.36 (observed spread) |

Stopping now would leave 206 battles unrun (about 7 min); every battle already fought is kept and a rerun resumes from it.

> warning: jobs are in set order (no --shuffle-jobs): running means read the set's first robots

### Queue log (last lines)

```
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
10:17:28 STOP lock by rule aa after 20%: aa - c -1.39 pts over 11 robots, stop band ±1.38 (observed spread); 717 battles fought and kept, 207 battles left unrun (about 7 min)
10:17:28 lock exit=75 in 1496 s (halted, aa after 20%)
10:17:30 alert issue: https://github.com/lgriffin/Hadur_Robot/issues/816
10:17:30 queue halted by a stop rule; fix the cause and rerun to resume (every fought battle is kept)
```
