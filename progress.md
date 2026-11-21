# Queue pc-drussgt: progress

Updated 2026-11-21 16:27:10 PC time (16:27 UTC), runner pid 72968.

- `prep` done, exit 0 in 3 min
- `livematch` done, exit 0 in 0 min
- `screen` running
- `confirm` pending
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

**323 of 930 battles** (35%), 0 failed. Running 12 min, 1587 battles/h, about 23 min left (ends ~16:50 PC time). Last battle 0 min ago.
Skipped turns a battle: 11.2 overall, first 100 11.6, last 100 10.7; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 62 | 0 | 77.19 | - | - | - | 11.4 |
| aa | 63 | 0 | 77.50 | +0.01 (29 robots) | ±0.03 | -0.03 .. +0.05 | 11.8 |
| ml16 | 65 | 0 | 77.82 | +0.01 (29 robots) | ±0.04 | -0.04 .. +0.07 | 11.0 |
| fb2 | 66 | 0 | 77.10 | -0.00 (29 robots) | ±0.03 | -0.06 .. +0.05 | 10.5 |
| df1 | 67 | 0 | 75.35 | -0.05 (29 robots) | ±0.03 | -0.10 .. +0.00 | 11.2 |

APS = mean difference over the robots read x 31 panel robots / 1217 pairings.
A/A: aa - c +0.39 pts over 29 robots; 1% band ±1.48 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 323 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | ok | 10.9 a battle over the last 200 (first 200: 11.4) |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `aa after 20%` | halt | ok | aa - c +0.39 pts over 29 robots, stop band ±1.74 (observed spread) |

Stopping now would leave 607 battles unrun (about 23 min); every battle already fought is kept and a rerun resumes from it.

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
```
