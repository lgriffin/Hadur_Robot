# Queue pc-shards: progress

Updated 2026-11-15 21:01:10 PC time (21:01 UTC), runner pid 20660.

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

**1321 of 25380 battles** (5%), 0 failed. Running 25 min, 3212 battles/h, about 7.5 h left (ends ~04:30 PC time). Last battle 0 min ago.
Skipped turns a battle: 22.5 overall, first 100 22.7, last 100 22.7; engine disables 82.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 146 | 0 | 91.86 | - | - | - | 24.1 |
| aa | 148 | 0 | 91.74 | -0.02 (127 robots) | ±0.16 | -0.27 .. +0.23 | 21.1 |
| fq | 144 | 0 | 91.27 | -0.19 (127 robots) | ±0.18 | -0.47 .. +0.09 | 20.3 |
| x5 | 147 | 0 | 91.84 | -0.00 (127 robots) | ±0.18 | -0.27 .. +0.27 | 21.1 |
| hl | 146 | 0 | 91.54 | +0.02 (127 robots) | ±0.18 | -0.25 .. +0.29 | 23.3 |
| dg | 148 | 0 | 91.45 | -0.16 (127 robots) | ±0.21 | -0.48 .. +0.16 | 23.7 |
| gl | 146 | 0 | 91.50 | -0.18 (127 robots) | ±0.18 | -0.46 .. +0.10 | 23.9 |
| mq | 147 | 0 | 91.40 | -0.17 (127 robots) | ±0.17 | -0.43 .. +0.10 | 23.7 |
| mtzl | 149 | 0 | 88.09 | -1.30 (127 robots) | ±0.31 | -1.77 .. -0.83 | 21.7 |

APS = mean difference over the robots read x 470 panel robots / 1217 pairings.
A/A: aa - c -0.06 pts over 127 robots; 1% band ±0.97 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 1321 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | ok | 22.7 a battle over the last 200 (first 200: 20.5) |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `aa after 20%` | halt | waiting | checks from 20% of the battles (now 5%) |

Stopping now would leave 24059 battles unrun (about 7.5 h); every battle already fought is kept and a rerun resumes from it.

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
