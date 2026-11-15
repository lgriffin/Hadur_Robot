# Queue pc-shards: progress

Updated 2026-11-15 21:16:16 PC time (21:16 UTC), runner pid 20660.

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

**2110 of 25380 battles** (8%), 0 failed. Running 40 min, 3154 battles/h, about 7.4 h left (ends ~04:38 PC time). Last battle 0 min ago.
Skipped turns a battle: 22.7 overall, first 100 22.7, last 100 23.8; engine disables 141.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 234 | 0 | 91.74 | - | - | - | 23.4 |
| aa | 236 | 0 | 91.44 | -0.04 (191 robots) | ±0.16 | -0.28 .. +0.20 | 21.7 |
| fq | 235 | 0 | 91.13 | -0.14 (189 robots) | ±0.15 | -0.36 .. +0.09 | 21.1 |
| x5 | 236 | 0 | 91.45 | -0.02 (188 robots) | ±0.14 | -0.23 .. +0.19 | 23.0 |
| hl | 234 | 0 | 91.41 | -0.04 (190 robots) | ±0.16 | -0.29 .. +0.21 | 23.3 |
| dg | 236 | 0 | 90.81 | -0.27 (190 robots) | ±0.19 | -0.56 .. +0.02 | 22.9 |
| gl | 235 | 0 | 91.01 | -0.19 (190 robots) | ±0.16 | -0.44 .. +0.06 | 23.5 |
| mq | 232 | 0 | 91.14 | -0.16 (188 robots) | ±0.15 | -0.39 .. +0.08 | 23.6 |
| mtzl | 232 | 0 | 87.83 | -1.52 (188 robots) | ±0.33 | -2.03 .. -1.02 | 22.0 |

APS = mean difference over the robots read x 470 panel robots / 1217 pairings.
A/A: aa - c -0.10 pts over 191 robots; 1% band ±0.76 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 2110 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | ok | 23.7 a battle over the last 200 (first 200: 20.5) |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `aa after 20%` | halt | waiting | checks from 20% of the battles (now 8%) |

Stopping now would leave 23270 battles unrun (about 7.4 h); every battle already fought is kept and a rerun resumes from it.

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
