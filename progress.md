# Queue pc-shelf: progress

Updated 2026-11-03 23:24:24 PC time (23:24 UTC), runner pid 19168.

- `prep` done, exit 0 in 6 min
- `pilot-s` done, exit 0 in 5 min
- `screen-s` halted, exit 75 in 0 min, HALTED by aa after 20%: aa - c +3.02 pts over 33 robots, stop band ±2.36
- `pilot-u` pending
- `screen-u` pending
- `pick` pending
- `build` pending
- `confirm` pending
- `gate` pending
- `pr` pending

### pilot-s

**231 of 231 battles** (100%), 0 failed. Running 5 min, 2686 battles/h, about 0 min left (ends ~23:24 PC time). Last battle 0 min ago.
Skipped turns a battle: 29.0 overall, first 100 29.8, last 100 27.8; engine disables 1.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 33 | 0 | 88.04 | - | - | - | 29.0 |
| aa | 33 | 0 | 91.06 | +0.08 (33 robots) | ±0.09 | -0.06 .. +0.22 | 29.8 |
| md | 33 | 0 | 80.13 | -0.26 (33 robots) | ±0.10 | -0.40 .. -0.11 | 28.0 |
| zl | 33 | 0 | 91.37 | +0.05 (33 robots) | ±0.07 | -0.05 .. +0.15 | 28.9 |
| x0 | 33 | 0 | 89.99 | +0.01 (33 robots) | ±0.06 | -0.08 .. +0.11 | 28.8 |
| x4 | 33 | 0 | 89.10 | -0.01 (33 robots) | ±0.07 | -0.12 .. +0.10 | 27.5 |
| mv | 33 | 0 | 89.81 | +0.01 (33 robots) | ±0.10 | -0.15 .. +0.16 | 30.9 |

APS = mean difference over the robots read x 33 panel robots / 1217 pairings.
A/A: aa - c +3.02 pts over 33 robots; 1% band ±2.03 (OUTSIDE: comparisons void).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 231 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | ok | 28.3 a battle over the last 200 (first 200: 29.4) |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### screen-s

**231 of 1155 battles** (20%), 0 failed, 231 read back from an earlier run. Running 0 min. Last battle 0 min ago.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 33 | 0 | 88.04 | - | - | - | 29.0 |
| aa | 33 | 0 | 91.06 | +0.08 (33 robots) | ±0.09 | -0.06 .. +0.22 | 29.8 |
| md | 33 | 0 | 80.13 | -0.26 (33 robots) | ±0.10 | -0.40 .. -0.11 | 28.0 |
| zl | 33 | 0 | 91.37 | +0.05 (33 robots) | ±0.07 | -0.05 .. +0.15 | 28.9 |
| x0 | 33 | 0 | 89.99 | +0.01 (33 robots) | ±0.06 | -0.08 .. +0.11 | 28.8 |
| x4 | 33 | 0 | 89.10 | -0.01 (33 robots) | ±0.07 | -0.12 .. +0.10 | 27.5 |
| mv | 33 | 0 | 89.81 | +0.01 (33 robots) | ±0.10 | -0.15 .. +0.16 | 30.9 |

APS = mean difference over the robots read x 33 panel robots / 1217 pairings.
A/A: aa - c +3.02 pts over 33 robots; 1% band ±2.03 (OUTSIDE: comparisons void).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 231 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | waiting | 0 of 200 battles to read |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `aa after 20%` | halt | TRIPPED | aa - c +3.02 pts over 33 robots, stop band ±2.36 |

Stopping now would leave 924 battles unrun; every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
23:13:14 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant calibrated; work D:\code\Hadur_Robot\hadur-bench\work
23:13:14 start prep
23:13:17 progress pushed to origin claude/pc-shelf-progress (every 15 min)
23:19:07 prep exit=0 in 352 s
23:19:07 start pilot-s
23:19:07 watching pilot-s: 4 stop rule(s)
23:19:18 progress pilot-s: 0/231 (0%) battles, 0 failed
23:24:17 pilot-s exit=0 in 309 s
23:24:17 start screen-s
23:24:17 watching screen-s: 5 stop rule(s)
23:24:22 STOP screen-s by rule aa after 20%: aa - c +3.02 pts over 33 robots, stop band ±2.36; 231 battles fought and kept, 924 battles left unrun
23:24:22 screen-s exit=75 in 5 s (halted, aa after 20%)
23:24:24 alert issue: https://github.com/lgriffin/Hadur_Robot/issues/623
23:24:24 queue halted by a stop rule; fix the cause and rerun to resume (every fought battle is kept)
```
