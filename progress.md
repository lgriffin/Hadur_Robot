# Queue pc-em: progress

Updated 2026-11-21 19:28:07 PC time (19:28 UTC), runner pid 49956.

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

**941 of 2004 battles** (47%), 0 failed. Running 13 min, 4334 battles/h, about 15 min left (ends ~19:42 PC time). Last battle 0 min ago.
Skipped turns a battle: 16.4 overall, first 100 16.5, last 100 16.4; engine disables 6.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 235 | 0 | 91.15 | - | - | - | 16.3 |
| aa | 235 | 0 | 91.31 | +0.01 (139 robots) | ±0.07 | -0.10 .. +0.12 | 16.7 |
| em | 235 | 0 | 91.13 | -0.01 (137 robots) | ±0.05 | -0.10 .. +0.07 | 16.6 |
| em2 | 236 | 0 | 91.38 | +0.03 (138 robots) | ±0.06 | -0.06 .. +0.13 | 16.1 |

APS = mean difference over the robots read x 167 panel robots / 1217 pairings.
A/A: aa - c +0.08 pts over 139 robots; 1% band ±0.76 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 941 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | ok | 16.5 a battle over the last 200 (first 200: 16.9) |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `aa after 20%` | halt | ok | aa - c +0.08 pts over 139 robots, stop band ±0.89 |

Stopping now would leave 1063 battles unrun (about 15 min); every battle already fought is kept and a rerun resumes from it.

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
