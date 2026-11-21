# Queue pc-drussgt: progress

Updated 2026-11-21 17:27:48 PC time (17:27 UTC), runner pid 72968.

- `prep` done, exit 0 in 3 min
- `livematch` done, exit 0 in 0 min
- `screen` done, exit 0 in 48 min
- `confirm` running
- `gate` pending
- `pairs` pending
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

> warning: arm c's jar bisect/live/hadur117.Hadur_3.22.jar was built 143 h before this step started: check it is not stale

> warning: arm bb's jar opponents/kc.mega.BeepBoop_2.0.jar was built 130 h before this step started: check it is not stale

### screen

**930 of 930 battles** (100%), 0 failed. Running 48 min, 936 battles/h, about 0 min left (ends ~17:03 PC time). Last battle 0 min ago.
Skipped turns a battle: 11.1 overall, first 100 11.6, last 100 11.6; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 186 | 0 | 76.15 | - | - | - | 11.2 |
| aa | 186 | 0 | 76.28 | +0.00 (31 robots) | ±0.02 | -0.03 .. +0.04 | 11.4 |
| ml16 | 186 | 0 | 76.09 | -0.00 (31 robots) | ±0.02 | -0.03 .. +0.03 | 11.0 |
| fb2 | 186 | 0 | 76.13 | -0.00 (31 robots) | ±0.02 | -0.03 .. +0.02 | 10.9 |
| df1 | 186 | 0 | 74.96 | -0.03 (31 robots) | ±0.02 | -0.06 .. +0.00 | 11.0 |

APS = mean difference over the robots read x 31 panel robots / 1217 pairings.
A/A: aa - c +0.13 pts over 31 robots; 1% band ±0.86 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 930 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | ok | 11.6 a battle over the last 200 (first 200: 11.4) |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `aa after 20%` | halt | ok | aa - c +0.13 pts over 31 robots, stop band ±1.25 (observed spread) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### confirm

**1666 of 1670 battles** (100%), 0 failed. Running 25 min, 4035 battles/h, about 0 min left (ends ~17:27 PC time). Last battle 0 min ago.
Skipped turns a battle: 15.7 overall, first 100 17.1, last 100 14.0; engine disables 18.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 332 | 0 | 91.70 | - | - | - | 15.4 |
| aa | 333 | 0 | 91.65 | -0.01 (166 robots) | ±0.04 | -0.07 .. +0.06 | 15.7 |
| ml16 | 334 | 0 | 91.86 | +0.02 (166 robots) | ±0.04 | -0.03 .. +0.08 | 15.6 |
| fb2 | 334 | 0 | 91.57 | -0.01 (166 robots) | ±0.04 | -0.07 .. +0.05 | 15.6 |
| df1 | 333 | 0 | 91.67 | -0.00 (166 robots) | ±0.04 | -0.05 .. +0.05 | 16.4 |

APS = mean difference over the robots read x 167 panel robots / 1217 pairings.
A/A: aa - c -0.04 pts over 166 robots; 1% band ±0.64 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 1666 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | ok | 14.2 a battle over the last 200 (first 200: 16.5) |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 4 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
16:12:02 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1544834; work D:\code\Hadur_Robot\hadur-bench\work
16:12:02 start prep
16:12:04 progress pushed to origin claude/pc-drussgt-progress (every 15 min)
16:14:50 prep exit=0 in 168 s
16:14:50 start livematch
16:14:50 watching livematch: 3 stop rule(s)
16:14:57 livematch exit=0 in 7 s
16:14:57 start screen
16:14:57 watching screen: 5 stop rule(s)
16:15:03 progress screen: 0/930 (0%) battles, 0 failed
16:45:20 progress screen: 705/930 (76%) battles, 1404/h, ETA 10 min, 0 failed, skips 10.7/battle (last 100), aa +0.01, ml16 -0.00, fb2 -0.01, df1 -0.04
17:03:01 screen exit=0 in 2883 s
17:03:01 start confirm
17:03:01 watching confirm: 4 stop rule(s)
17:15:39 progress confirm: 908/1670 (54%) battles, 4313/h, ETA 11 min, 0 failed, skips 17.8/battle (last 100), aa -0.03, ml16 +0.00, fb2 -0.02, df1 +0.01
```
