# Queue pc-shelf: progress

Updated 2026-11-04 09:04:47 PC time (09:04 UTC), runner pid 41756.

- `prep` done, exit 0 in 6 min
- `pilot-s` done, exit 0 in 5 min
- `screen-s` done, exit 0 in 19 min
- `pilot-u` running
- `screen-u` pending
- `pick` pending
- `build` pending
- `confirm` pending
- `gate` pending
- `pr` pending

### screen-s

**1155 of 1155 battles** (100%), 0 failed, 231 read back from an earlier run. Running 19 min, 2939 battles/h, about 0 min left (ends ~08:53 PC time). Last battle 0 min ago.
Skipped turns a battle: 29.0 overall, first 100 31.0, last 100 26.7; engine disables 1.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 165 | 0 | 88.40 | - | - | - | 29.4 |
| aa | 165 | 0 | 87.44 | -0.03 (33 robots) | ±0.04 | -0.09 .. +0.04 | 29.3 |
| md | 165 | 0 | 79.51 | -0.23 (33 robots) | ±0.07 | -0.33 .. -0.13 | 29.3 |
| zl | 165 | 0 | 89.04 | +0.03 (33 robots) | ±0.04 | -0.03 .. +0.09 | 28.5 |
| x0 | 165 | 0 | 88.38 | +0.01 (33 robots) | ±0.04 | -0.06 .. +0.08 | 28.8 |
| x4 | 165 | 0 | 87.78 | -0.00 (33 robots) | ±0.04 | -0.07 .. +0.06 | 28.0 |
| mv | 165 | 0 | 87.55 | -0.01 (33 robots) | ±0.08 | -0.13 .. +0.11 | 30.0 |

APS = mean difference over the robots read x 33 panel robots / 1217 pairings.
A/A: aa - c -0.96 pts over 33 robots; 1% band ±0.91 (OUTSIDE: comparisons void).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 1155 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | ok | 27.4 a battle over the last 200 (first 200: 30.3) |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `aa after 20%` | halt | ok | aa - c -0.96 pts over 33 robots, stop band ±2.49 (observed spread) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### pilot-u

**443 of 1062 battles** (42%), 0 failed. Running 11 min, 2312 battles/h, about 16 min left (ends ~09:20 PC time). Last battle 0 min ago.
Skipped turns a battle: 39.2 overall, first 100 42.9, last 100 32.4; engine disables 7.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 72 | 0 | 79.90 | - | - | - | 41.4 |
| aa | 77 | 0 | 78.98 | -0.01 (71 robots) | ±0.19 | -0.29 .. +0.28 | 41.4 |
| mt | 73 | 0 | 75.17 | -0.67 (70 robots) | ±0.19 | -0.97 .. -0.38 | 44.4 |
| wl | 74 | 0 | 39.48 | -5.75 (70 robots) | ±0.93 | -7.17 .. -4.33 | 25.7 |
| hl | 74 | 0 | 79.95 | -0.01 (70 robots) | ±0.14 | -0.22 .. +0.21 | 40.2 |
| gl | 73 | 0 | 78.64 | -0.07 (69 robots) | ±0.17 | -0.32 .. +0.18 | 42.0 |

APS = mean difference over the robots read x 177 panel robots / 1217 pairings.
A/A: aa - c -0.05 pts over 71 robots; 1% band ±1.39 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 443 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | ok | 35.3 a battle over the last 200 (first 200: 42.3) |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 619 battles unrun (about 16 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
23:24:17 watching screen-s: 5 stop rule(s)
23:24:22 STOP screen-s by rule aa after 20%: aa - c +3.02 pts over 33 robots, stop band ±2.36; 231 battles fought and kept, 924 battles left unrun
23:24:22 screen-s exit=75 in 5 s (halted, aa after 20%)
23:24:24 alert issue: https://github.com/lgriffin/Hadur_Robot/issues/623
23:24:24 queue halted by a stop rule; fix the cause and rerun to resume (every fought battle is kept)
08:34:25 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant calibrated; work D:\code\Hadur_Robot\hadur-bench\work
08:34:25 skip prep (already exit=0)
08:34:25 skip pilot-s (already exit=0)
08:34:25 start screen-s
08:34:25 watching screen-s: 5 stop rule(s)
08:34:27 progress pushed to origin claude/pc-shelf-progress (every 15 min)
08:35:27 progress screen-s: 275/1155 (24%) battles, 2618/h, ETA 20 min, 0 failed, skips 33.3/battle (last 100), aa +0.08, md -0.25, zl +0.06, x0 +0.03, x4 -0.01, mv +0.01
08:53:17 screen-s exit=0 in 1131 s
08:53:17 start pilot-u
08:53:17 watching pilot-u: 4 stop rule(s)
```
