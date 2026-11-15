# Queue pc-shards: progress

Updated 2026-11-15 21:31:18 PC time (21:31 UTC), runner pid 20660.

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

**2903 of 25380 battles** (11%), 0 failed. Running 55 min, 3150 battles/h, about 7.1 h left (ends ~04:39 PC time). Last battle 0 min ago.
Skipped turns a battle: 23.2 overall, first 100 22.7, last 100 24.9; engine disables 229.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 323 | 0 | 91.53 | - | - | - | 23.9 |
| aa | 322 | 0 | 91.49 | -0.02 (244 robots) | ±0.14 | -0.23 .. +0.19 | 21.6 |
| fq | 320 | 0 | 91.27 | -0.09 (243 robots) | ±0.13 | -0.29 .. +0.12 | 21.8 |
| x5 | 326 | 0 | 91.47 | -0.03 (244 robots) | ±0.13 | -0.22 .. +0.17 | 23.9 |
| hl | 322 | 0 | 91.55 | +0.06 (243 robots) | ±0.14 | -0.15 .. +0.27 | 25.0 |
| dg | 321 | 0 | 91.03 | -0.19 (243 robots) | ±0.16 | -0.43 .. +0.05 | 23.0 |
| gl | 323 | 0 | 91.23 | -0.11 (244 robots) | ±0.14 | -0.33 .. +0.10 | 23.8 |
| mq | 323 | 0 | 91.10 | -0.12 (244 robots) | ±0.14 | -0.33 .. +0.09 | 24.1 |
| mtzl | 323 | 0 | 87.58 | -1.53 (243 robots) | ±0.29 | -1.97 .. -1.09 | 21.8 |

APS = mean difference over the robots read x 470 panel robots / 1217 pairings.
A/A: aa - c -0.05 pts over 244 robots; 1% band ±0.65 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 2903 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | ok | 24.1 a battle over the last 200 (first 200: 20.5) |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `aa after 20%` | halt | waiting | checks from 20% of the battles (now 11%) |

Stopping now would leave 22477 battles unrun (about 7.1 h); every battle already fought is kept and a rerun resumes from it.

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
```
