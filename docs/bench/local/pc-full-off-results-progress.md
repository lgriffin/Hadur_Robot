# Queue pc-full-off: progress

Updated 2026-11-03 00:04:12 PC time (00:04 UTC), runner pid 41640.

- `prep` done, exit 0 in 1 min
- `screen` done, exit 0 in 24 min
- `pick` done, exit 0 in 0 min
- `prep2` done, exit 0 in 1 min
- `confirm` running
- `gate` pending
- `pr` pending

### screen

**1503 of 1503 battles** (100%), 0 failed. Running 24 min, 3785 battles/h, about 0 min left (ends ~00:02 PC time). Last battle 0 min ago.
Skipped turns a battle: 31.6 overall, first 100 31.9, last 100 28.4; engine disables 8.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 501 | 0 | 90.39 | - | - | - | 31.4 |
| aa | 501 | 0 | 90.10 | -0.04 (167 robots) | ±0.04 | -0.10 .. +0.02 | 31.7 |
| fp | 501 | 0 | 90.09 | -0.02 (167 robots) | ±0.04 | -0.08 .. +0.04 | 31.6 |

APS = mean difference over the robots read x 167 panel robots / 1217 pairings.
A/A: aa - c -0.29 pts over 167 robots; 1% band ±0.52 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 1503 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | ok | 29.7 a battle over the last 200 (first 200: 32.1) |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### confirm

**8 of 12 battles** (67%), 0 failed. Running 1 min, 623 battles/h, about 0 min left (ends ~00:04 PC time). Last battle 0 min ago.
Skipped turns a battle: 22.0 overall, first 8 22.0, last 8 22.0; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 1 | 0 | 85.96 | - | - | - | 24.0 |
| aa | 4 | 0 | 83.39 | -0.00 (1 robots) | - | - | 20.2 |
| fp | 3 | 0 | 85.13 | +0.00 (1 robots) | - | - | 23.7 |

APS = mean difference over the robots read x 1 panel robots / 1217 pairings.
A/A: aa - c -2.57 pts over 1 robots; 1% band ±9.23 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 8 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | waiting | 8 of 200 battles to read |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 4 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
23:37:51 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant calibrated; work D:\code\Hadur_Robot\hadur-bench\work
23:37:51 start prep
23:37:53 progress pushed to origin claude/pc-full-off-progress (every 15 min)
23:39:02 prep exit=0 in 71 s
23:39:02 start screen
23:39:02 watching screen: 4 stop rule(s)
23:39:52 progress screen: 39/1503 (3%) battles, 2846/h, ETA 31 min, 0 failed, skips 32.8/battle (last 100), aa -0.21, fp -0.11
00:02:52 screen exit=0 in 1429 s
00:02:52 start pick
00:02:53 pick exit=0 in 0 s
00:02:53 start prep2
00:03:25 prep2 exit=0 in 32 s
00:03:25 start confirm
00:03:25 watching confirm: 4 stop rule(s)
```
