# Queue pc-shards: progress

Updated 2026-11-15 22:46:42 PC time (22:46 UTC), runner pid 20660.

- `prep` done, exit 0 in 6 min
- `livematch` done, exit 0 in 0 min
- `screen` running
- `pick` pending
- `lock` pending
- `gate` pending
- `pr` pending

### livematch

**124 of 124 battles** (100%), 0 failed, 124 read back from an earlier run. Running 0 min. Last battle 0 min ago.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 62 | 0 | 69.94 | - | - | - | 9.8 |
| bb | 62 | 0 | 84.62 | +0.37 (31 robots) | ±0.07 | +0.27 .. +0.48 | 0.3 |

APS = mean difference over the robots read x 31 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 124 |
| `dead 8` | halt | ok | every arm scoring |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun; every battle already fought is kept and a rerun resumes from it.

> warning: arm bb's jar opponents/kc.mega.BeepBoop_2.0.jar was built 967 h before this step started: check it is not stale

### screen

**6524 of 25380 battles** (26%), 0 failed. Running 2.2 h, 2560 battles/h, about 7.4 h left (ends ~06:08 PC time). Last battle 0 min ago.
Skipped turns a battle: 22.0 overall, first 100 22.7, last 100 21.2; engine disables 446.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 727 | 0 | 91.64 | - | - | - | 22.7 |
| aa | 725 | 0 | 91.53 | -0.04 (385 robots) | ±0.11 | -0.21 .. +0.12 | 21.2 |
| fq | 724 | 0 | 91.51 | -0.03 (385 robots) | ±0.10 | -0.19 .. +0.13 | 20.9 |
| x5 | 723 | 0 | 91.48 | -0.04 (385 robots) | ±0.10 | -0.19 .. +0.11 | 22.2 |
| hl | 727 | 0 | 91.58 | +0.02 (385 robots) | ±0.10 | -0.13 .. +0.17 | 22.6 |
| dg | 726 | 0 | 91.31 | -0.08 (385 robots) | ±0.10 | -0.24 .. +0.07 | 22.3 |
| gl | 724 | 0 | 91.33 | -0.10 (384 robots) | ±0.10 | -0.26 .. +0.06 | 22.3 |
| mq | 725 | 0 | 91.13 | -0.18 (385 robots) | ±0.10 | -0.33 .. -0.02 | 22.4 |
| mtzl | 723 | 0 | 87.60 | -1.54 (385 robots) | ±0.20 | -1.84 .. -1.23 | 22.0 |

APS = mean difference over the robots read x 470 panel robots / 1217 pairings.
A/A: aa - c -0.11 pts over 385 robots; 1% band ±0.43 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 6524 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | ok | 20.4 a battle over the last 200 (first 200: 20.5) |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `aa after 20%` | halt | ok | aa - c -0.11 pts over 385 robots, stop band ±0.50 |

Stopping now would leave 18856 battles unrun (about 7.4 h); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
20:30:47 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1544834; work D:\code\Hadur_Robot\hadur-bench\work
20:30:47 start prep
20:30:49 progress pushed to origin claude/pc-shards-progress (every 15 min)
20:36:21 prep exit=0 in 333 s
20:36:21 start livematch
20:36:21 watching livematch: 3 stop rule(s)
20:36:29 livematch exit=0 in 7 s
20:36:29 start screen
20:36:29 watching screen: 5 stop rule(s)
20:36:50 progress screen: 0/25380 (0%) battles, 0 failed
21:07:13 progress screen: 1613/25380 (6%) battles, 3180/h, ETA 7.5 h, 0 failed, skips 22.1/battle (last 100), aa -0.11, fq -0.14, x5 -0.00, hl +0.03, dg -0.15, gl -0.12, mq -0.15, mtzl -1.35
21:37:19 progress screen: 3222/25380 (13%) battles, 3210/h, ETA 6.9 h, 0 failed, skips 24.1/battle (last 100), aa -0.01, fq -0.08, x5 -0.00, hl +0.07, dg -0.16, gl -0.12, mq -0.14, mtzl -1.56
22:07:28 progress screen: 4775/25380 (19%) battles, 3090/h, ETA 6.7 h, 0 failed, skips 19.9/battle (last 100), aa -0.06, fq -0.02, x5 -0.03, hl +0.03, dg -0.12, gl -0.07, mq -0.13, mtzl -1.57
22:37:38 progress screen: 6167/25380 (24%) battles, 2762/h, ETA 7.0 h, 0 failed, skips 19.3/battle (last 100), aa -0.05, fq -0.02, x5 -0.03, hl +0.04, dg -0.08, gl -0.07, mq -0.18, mtzl -1.54
```
