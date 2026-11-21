# Queue pc-em: progress

Updated 2026-11-21 19:43:16 PC time (19:43 UTC), runner pid 49956.

- `prep` done, exit 0 in 2 min
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

> warning: arm c's jar bisect/live/hadur117.Hadur_3.22.jar was built 146 h before this step started: check it is not stale

> warning: arm bb's jar opponents/kc.mega.BeepBoop_2.0.jar was built 133 h before this step started: check it is not stale

### screen

**1945 of 2004 battles** (97%), 0 failed. Running 28 min, 4142 battles/h, about 1 min left (ends ~19:44 PC time). Last battle 0 min ago.
Skipped turns a battle: 16.2 overall, first 100 16.5, last 100 14.9; engine disables 16.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 482 | 0 | 91.63 | - | - | - | 16.3 |
| aa | 490 | 0 | 91.65 | +0.00 (167 robots) | ±0.04 | -0.05 .. +0.06 | 16.2 |
| em | 489 | 0 | 91.39 | -0.03 (167 robots) | ±0.04 | -0.09 .. +0.02 | 16.2 |
| em2 | 484 | 0 | 91.69 | +0.01 (167 robots) | ±0.03 | -0.05 .. +0.06 | 16.1 |

APS = mean difference over the robots read x 167 panel robots / 1217 pairings.
A/A: aa - c +0.02 pts over 167 robots; 1% band ±0.53 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 1945 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | ok | 15.4 a battle over the last 200 (first 200: 16.9) |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `aa after 20%` | halt | ok | aa - c +0.02 pts over 167 robots, stop band ±0.62 |

Stopping now would leave 59 battles unrun (about 1 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
19:12:57 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1544834; work D:\code\Hadur_Robot\hadur-bench\work
19:12:57 start prep
19:12:59 progress pushed to origin claude/pc-em-progress (every 15 min)
19:14:57 prep exit=0 in 120 s
19:14:57 start livematch
19:14:57 watching livematch: 3 stop rule(s)
19:15:05 livematch exit=0 in 7 s
19:15:05 start screen
19:15:05 watching screen: 5 stop rule(s)
19:15:58 progress screen: 46/2004 (2%) battles, 3104/h, ETA 38 min, 0 failed, skips 16.7/battle (last 100), aa -0.11, em -0.19, em2 -0.18
```
