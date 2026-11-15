# Queue pc-shards: progress

Updated 2026-11-15 21:46:22 PC time (21:46 UTC), runner pid 20660.

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

**3687 of 25380 battles** (15%), 0 failed. Running 1.2 h, 3144 battles/h, about 6.9 h left (ends ~04:40 PC time). Last battle 0 min ago.
Skipped turns a battle: 23.1 overall, first 100 22.7, last 100 19.6; engine disables 289.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 407 | 0 | 91.73 | - | - | - | 23.4 |
| aa | 408 | 0 | 91.62 | -0.03 (285 robots) | ±0.12 | -0.21 .. +0.16 | 21.4 |
| fq | 410 | 0 | 91.50 | -0.06 (284 robots) | ±0.11 | -0.23 .. +0.11 | 21.6 |
| x5 | 410 | 0 | 91.63 | -0.01 (284 robots) | ±0.12 | -0.20 .. +0.18 | 24.0 |
| hl | 410 | 0 | 91.84 | +0.08 (284 robots) | ±0.12 | -0.11 .. +0.26 | 24.2 |
| dg | 412 | 0 | 91.50 | -0.10 (285 robots) | ±0.14 | -0.31 .. +0.11 | 22.4 |
| gl | 409 | 0 | 91.39 | -0.08 (285 robots) | ±0.13 | -0.27 .. +0.11 | 24.4 |
| mq | 410 | 0 | 91.30 | -0.14 (285 robots) | ±0.12 | -0.33 .. +0.05 | 24.5 |
| mtzl | 411 | 0 | 87.48 | -1.58 (285 robots) | ±0.26 | -1.98 .. -1.19 | 22.2 |

APS = mean difference over the robots read x 470 panel robots / 1217 pairings.
A/A: aa - c -0.07 pts over 285 robots; 1% band ±0.58 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 3687 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | ok | 21.7 a battle over the last 200 (first 200: 20.5) |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `aa after 20%` | halt | waiting | checks from 20% of the battles (now 15%) |

Stopping now would leave 21693 battles unrun (about 6.9 h); every battle already fought is kept and a rerun resumes from it.

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
```
