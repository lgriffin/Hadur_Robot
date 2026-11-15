# Queue pc-shards: progress

Updated 2026-11-15 22:01:26 PC time (22:01 UTC), runner pid 20660.

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

**4463 of 25380 battles** (18%), 0 failed. Running 1.4 h, 3104 battles/h, about 6.7 h left (ends ~04:45 PC time). Last battle 0 min ago.
Skipped turns a battle: 22.9 overall, first 100 22.7, last 100 23.5; engine disables 339.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 496 | 0 | 91.46 | - | - | - | 22.9 |
| aa | 496 | 0 | 91.40 | -0.04 (316 robots) | ±0.12 | -0.22 .. +0.14 | 21.9 |
| fq | 498 | 0 | 91.38 | -0.05 (315 robots) | ±0.11 | -0.22 .. +0.11 | 21.7 |
| x5 | 493 | 0 | 91.35 | -0.04 (314 robots) | ±0.11 | -0.22 .. +0.13 | 23.6 |
| hl | 498 | 0 | 91.49 | +0.02 (316 robots) | ±0.12 | -0.15 .. +0.20 | 23.9 |
| dg | 496 | 0 | 91.15 | -0.14 (315 robots) | ±0.12 | -0.32 .. +0.05 | 22.6 |
| gl | 494 | 0 | 91.22 | -0.10 (314 robots) | ±0.12 | -0.29 .. +0.09 | 23.8 |
| mq | 496 | 0 | 91.11 | -0.14 (316 robots) | ±0.13 | -0.34 .. +0.06 | 24.1 |
| mtzl | 496 | 0 | 87.45 | -1.58 (315 robots) | ±0.24 | -1.95 .. -1.21 | 22.1 |

APS = mean difference over the robots read x 470 panel robots / 1217 pairings.
A/A: aa - c -0.11 pts over 316 robots; 1% band ±0.52 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 4463 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | ok | 24.6 a battle over the last 200 (first 200: 20.5) |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `aa after 20%` | halt | waiting | checks from 20% of the battles (now 18%) |

Stopping now would leave 20917 battles unrun (about 6.7 h); every battle already fought is kept and a rerun resumes from it.

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
