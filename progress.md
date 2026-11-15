# Queue pc-shards: progress

Updated 2026-11-15 20:45:58 PC time (20:45 UTC), runner pid 20660.

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

**514 of 25380 battles** (2%), 0 failed. Running 9 min, 3255 battles/h, about 7.6 h left (ends ~04:24 PC time). Last battle 0 min ago.
Skipped turns a battle: 22.6 overall, first 100 22.7, last 100 28.1; engine disables 33.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 57 | 0 | 92.07 | - | - | - | 24.0 |
| aa | 59 | 0 | 91.97 | -0.21 (53 robots) | ±0.26 | -0.62 .. +0.20 | 19.0 |
| fq | 55 | 0 | 90.99 | -0.25 (51 robots) | ±0.38 | -0.83 .. +0.33 | 20.7 |
| x5 | 55 | 0 | 91.92 | +0.01 (51 robots) | ±0.31 | -0.47 .. +0.48 | 22.1 |
| hl | 56 | 0 | 92.20 | +0.23 (52 robots) | ±0.28 | -0.19 .. +0.65 | 24.8 |
| dg | 57 | 0 | 91.31 | -0.21 (51 robots) | ±0.42 | -0.85 .. +0.43 | 24.6 |
| gl | 58 | 0 | 91.72 | -0.11 (53 robots) | ±0.33 | -0.61 .. +0.40 | 21.5 |
| mq | 59 | 0 | 91.57 | -0.23 (51 robots) | ±0.25 | -0.62 .. +0.15 | 25.7 |
| mtzl | 58 | 0 | 89.45 | -1.08 (52 robots) | ±0.47 | -1.80 .. -0.36 | 21.2 |

APS = mean difference over the robots read x 470 panel robots / 1217 pairings.
A/A: aa - c -0.54 pts over 53 robots; 1% band ±1.58 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 514 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | ok | 24.7 a battle over the last 200 (first 200: 20.5) |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `aa after 20%` | halt | waiting | checks from 20% of the battles (now 2%) |

Stopping now would leave 24866 battles unrun (about 7.6 h); every battle already fought is kept and a rerun resumes from it.

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
```
