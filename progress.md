# Queue pc-drussgt: progress

Updated 2026-11-21 16:42:19 PC time (16:42 UTC), runner pid 72968.

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

**648 of 930 battles** (70%), 0 failed. Running 27 min, 1421 battles/h, about 12 min left (ends ~16:54 PC time). Last battle 0 min ago.
Skipped turns a battle: 11.1 overall, first 100 11.6, last 100 10.8; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 130 | 0 | 76.72 | - | - | - | 11.2 |
| aa | 127 | 0 | 77.00 | +0.01 (30 robots) | ±0.02 | -0.02 .. +0.04 | 11.5 |
| ml16 | 132 | 0 | 76.69 | +0.00 (30 robots) | ±0.03 | -0.04 .. +0.04 | 11.1 |
| fb2 | 129 | 0 | 76.46 | -0.00 (30 robots) | ±0.02 | -0.04 .. +0.03 | 10.8 |
| df1 | 130 | 0 | 75.54 | -0.04 (30 robots) | ±0.03 | -0.08 .. +0.01 | 11.0 |

APS = mean difference over the robots read x 31 panel robots / 1217 pairings.
A/A: aa - c +0.53 pts over 30 robots; 1% band ±1.03 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 648 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | ok | 11.1 a battle over the last 200 (first 200: 11.4) |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `aa after 20%` | halt | ok | aa - c +0.53 pts over 30 robots, stop band ±1.20 |

Stopping now would leave 282 battles unrun (about 12 min); every battle already fought is kept and a rerun resumes from it.

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
