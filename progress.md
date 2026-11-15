# Queue pc-field-screen: progress

Updated 2026-11-15 18:27:10 PC time (18:27 UTC), runner pid 32872.

- `prep` done, exit 0 in 5 min
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

> warning: arm bb's jar opponents/kc.mega.BeepBoop_2.0.jar was built 964 h before this step started: check it is not stale

### screen

**1807 of 4464 battles** (40%), 0 failed. Running 25 min, 4272 battles/h, about 37 min left (ends ~19:04 PC time). Last battle 0 min ago.
Skipped turns a battle: 14.0 overall, first 100 15.3, last 100 13.6; engine disables 3.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 225 | 0 | 82.58 | - | - | - | 13.9 |
| aa | 226 | 0 | 82.71 | +0.01 (88 robots) | ±0.05 | -0.07 .. +0.09 | 13.8 |
| fq | 225 | 0 | 82.87 | +0.02 (88 robots) | ±0.05 | -0.05 .. +0.09 | 14.1 |
| x5 | 225 | 0 | 81.72 | -0.07 (88 robots) | ±0.05 | -0.15 .. +0.00 | 14.0 |
| hl | 228 | 0 | 83.05 | +0.03 (88 robots) | ±0.05 | -0.05 .. +0.11 | 13.7 |
| dg | 226 | 0 | 82.72 | +0.01 (88 robots) | ±0.05 | -0.08 .. +0.09 | 13.9 |
| gl | 225 | 0 | 82.40 | -0.02 (88 robots) | ±0.05 | -0.10 .. +0.06 | 14.6 |
| mq | 227 | 0 | 82.25 | -0.03 (88 robots) | ±0.04 | -0.09 .. +0.03 | 14.0 |

APS = mean difference over the robots read x 93 panel robots / 1217 pairings.
A/A: aa - c +0.12 pts over 88 robots; 1% band ±0.78 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 1807 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | ok | 13.1 a battle over the last 200 (first 200: 15.5) |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `aa after 20%` | halt | ok | aa - c +0.12 pts over 88 robots, stop band ±1.02 (observed spread) |

Stopping now would leave 2657 battles unrun (about 37 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
17:56:48 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1544834; work D:\code\Hadur_Robot\hadur-bench\work
17:56:48 start prep
17:56:50 progress pushed to origin claude/pc-field-screen-progress (every 15 min)
18:01:40 prep exit=0 in 291 s
18:01:40 start livematch
18:01:40 watching livematch: 3 stop rule(s)
18:01:47 livematch exit=0 in 7 s
18:01:47 start screen
18:01:47 watching screen: 5 stop rule(s)
18:01:50 progress screen: 0/4464 (0%) battles, 0 failed
```
