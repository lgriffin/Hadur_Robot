# Queue pc-mimic-wide: progress

Updated 2026-11-03 18:38:09 PC time (18:38 UTC), runner pid 17340.

- `prep` done, exit 0 in 1 min
- `screen` done, exit 0 in 17 min
- `pick` done, exit 0 in 0 min
- `prep2` done, exit 0 in 0 min
- `confirm` running
- `gate` pending
- `pr` pending

### screen

**864 of 864 battles** (100%), 0 failed. Running 17 min, 3033 battles/h, about 0 min left (ends ~18:36 PC time). Last battle 0 min ago.
Skipped turns a battle: 26.6 overall, first 100 28.6, last 100 27.0; engine disables 2.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 288 | 0 | 85.35 | - | - | - | 26.2 |
| aa | 288 | 0 | 85.19 | -0.00 (36 robots) | ±0.02 | -0.03 .. +0.02 | 26.4 |
| mq | 288 | 0 | 85.56 | +0.01 (36 robots) | ±0.02 | -0.02 .. +0.04 | 27.1 |

APS = mean difference over the robots read x 36 panel robots / 1217 pairings.
A/A: aa - c -0.16 pts over 36 robots; 1% band ±0.69 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 864 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | ok | 26.4 a battle over the last 200 (first 200: 27.5) |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `aa after 20%` | halt | ok | aa - c -0.16 pts over 36 robots, stop band ±0.80 |
| `futility mq below 0.01 after 20%` | finish | ok | mq +0.01, best case +0.04 APS vs bar +0.01 |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### confirm

**60 of 72 battles** (83%), 0 failed. Running 2 min, 2097 battles/h, about 0 min left (ends ~18:38 PC time). Last battle 0 min ago.
Skipped turns a battle: 26.4 overall, first 60 26.4, last 60 26.4; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 17 | 0 | 70.05 | - | - | - | 27.2 |
| aa | 23 | 0 | 71.29 | +0.00 (2 robots) | ±0.01 | -0.01 .. +0.01 | 23.7 |
| mq | 20 | 0 | 76.33 | +0.01 (2 robots) | ±0.00 | +0.01 .. +0.01 | 28.9 |

APS = mean difference over the robots read x 2 panel robots / 1217 pairings.
A/A: aa - c +1.24 pts over 2 robots; 1% band ±2.64 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 60 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | waiting | 60 of 200 battles to read |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 12 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
18:17:54 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant calibrated; work D:\code\Hadur_Robot\hadur-bench\work
18:17:54 start prep
18:17:57 progress pushed to origin claude/pc-mimic-wide-progress (every 15 min)
18:19:19 prep exit=0 in 84 s
18:19:19 start screen
18:19:19 watching screen: 6 stop rule(s)
18:19:55 progress screen: 24/864 (3%) battles, 2384/h, ETA 21 min, 0 failed, skips 32.0/battle (last 100), aa -0.01, mq +0.02
18:36:25 screen exit=0 in 1025 s
18:36:25 start pick
18:36:25 pick exit=0 in 0 s
18:36:25 start prep2
18:36:25 prep2 exit=0 in 0 s
18:36:25 start confirm
18:36:25 watching confirm: 4 stop rule(s)
```
