# Queue pc-flat-on: progress

Updated 2026-11-01 15:33:01 PC time (15:33 UTC), runner pid 20688.

- `prep` done, exit 0 in 1 min
- `screen` done, exit 0 in 34 min
- `pick` done, exit 0 in 0 min
- `prep2` done, exit 0 in 1 min
- `confirm` running
- `gate` pending
- `pr` pending

### screen

**1392 of 1392 battles** (100%), 0 failed. Running 35 min, 2348 battles/h, about 0 min left (ends ~15:29 PC time). Last battle 0 min ago.
Skipped turns a battle: 17.6 overall, first 100 17.1, last 100 18.2; engine disables 18.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 464 | 0 | 83.36 | - | - | - | 16.5 |
| aa | 464 | 0 | 83.46 | +0.02 (232 robots) | ±0.08 | -0.11 .. +0.14 | 15.8 |
| fo | 464 | 0 | 83.68 | +0.05 (232 robots) | ±0.07 | -0.06 .. +0.17 | 20.5 |

APS = mean difference over the robots read x 232 panel robots / 1217 pairings.
A/A: aa - c +0.09 pts over 232 robots; 1% band ±0.54 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 1392 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 40 over 200` | halt | ok | 17.3 a battle over the last 200 (first 200: 17.0) |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `aa after 20%` | halt | ok | aa - c +0.09 pts over 232 robots, stop band ±0.63 |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### confirm

**76 of 84 battles** (90%), 0 failed. Running 3 min, 1465 battles/h, about 0 min left (ends ~15:33 PC time). Last battle 0 min ago.
Skipped turns a battle: 19.5 overall, first 76 19.5, last 76 19.5; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 24 | 0 | 64.29 | - | - | - | 15.0 |
| aa | 27 | 0 | 63.61 | -0.00 (7 robots) | ±0.01 | -0.03 .. +0.02 | 17.6 |
| fq | 25 | 0 | 65.64 | +0.01 (7 robots) | ±0.03 | -0.03 .. +0.05 | 25.9 |

APS = mean difference over the robots read x 7 panel robots / 1217 pairings.
A/A: aa - c -0.68 pts over 7 robots; 1% band ±2.32 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 76 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 40 over 200` | halt | waiting | 76 of 200 battles to read |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 8 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
14:53:34 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1488498; work D:\code\Hadur_Robot\hadur-bench\work
14:53:34 start prep
14:53:36 progress pushed to origin claude/pc-flat-on-progress (every 15 min)
14:54:51 prep exit=0 in 77 s
14:54:51 start screen
14:54:51 watching screen: 5 stop rule(s)
14:55:34 progress screen: 30/1392 (2%) battles, 2492/h, ETA 33 min, 0 failed, skips 18.9/battle (last 100), aa -0.05, fo +0.01
15:25:57 progress screen: 1322/1392 (95%) battles, 2554/h, ETA 2 min, 0 failed, skips 16.7/battle (last 100), aa +0.00, fo +0.06
15:29:21 screen exit=0 in 2070 s
15:29:21 start pick
15:29:21 pick exit=0 in 0 s
15:29:21 start prep2
15:29:54 prep2 exit=0 in 32 s
15:29:54 start confirm
15:29:54 watching confirm: 4 stop rule(s)
```
