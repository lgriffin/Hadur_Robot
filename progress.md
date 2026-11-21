# Queue pc-em: progress

Updated 2026-11-21 20:18:18 PC time (20:18 UTC), runner pid 49956.

- `prep` done, exit 0 in 2 min
- `livematch` done, exit 0 in 0 min
- `screen` done, exit 0 in 35 min
- `confirm` done, exit 0 in 28 min
- `gate` done, exit 0 in 0 min
- `pairs` done, exit 0 in 0 min
- `pr` done, exit 0 in 0 min

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

**2004 of 2004 battles** (100%), 0 failed. Running 35 min, 3292 battles/h, about 0 min left (ends ~19:50 PC time). Last battle 0 min ago.
Skipped turns a battle: 16.1 overall, first 100 16.5, last 100 14.3; engine disables 17.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 501 | 0 | 91.62 | - | - | - | 16.2 |
| aa | 501 | 0 | 91.63 | +0.00 (167 robots) | ±0.04 | -0.05 .. +0.06 | 16.2 |
| em | 501 | 0 | 91.40 | -0.03 (167 robots) | ±0.04 | -0.09 .. +0.02 | 16.1 |
| em2 | 501 | 0 | 91.72 | +0.01 (167 robots) | ±0.03 | -0.04 .. +0.07 | 16.0 |

APS = mean difference over the robots read x 167 panel robots / 1217 pairings.
A/A: aa - c +0.01 pts over 167 robots; 1% band ±0.52 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 2004 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | ok | 15.0 a battle over the last 200 (first 200: 16.9) |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `aa after 20%` | halt | ok | aa - c +0.01 pts over 167 robots, stop band ±0.61 |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### confirm

**496 of 496 battles** (100%), 0 failed. Running 28 min, 1063 battles/h, about 0 min left (ends ~20:18 PC time). Last battle 0 min ago.
Skipped turns a battle: 11.6 overall, first 100 11.2, last 100 11.4; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 124 | 0 | 75.69 | - | - | - | 11.5 |
| aa | 124 | 0 | 75.93 | +0.01 (31 robots) | ±0.02 | -0.03 .. +0.04 | 11.6 |
| em | 124 | 0 | 74.60 | -0.03 (31 robots) | ±0.03 | -0.07 .. +0.01 | 11.8 |
| em2 | 124 | 0 | 75.46 | -0.01 (31 robots) | ±0.04 | -0.07 .. +0.05 | 11.5 |

APS = mean difference over the robots read x 31 panel robots / 1217 pairings.
A/A: aa - c +0.24 pts over 31 robots; 1% band ±1.05 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 496 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | ok | 11.6 a battle over the last 200 (first 200: 11.3) |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
19:15:05 watching screen: 5 stop rule(s)
19:15:58 progress screen: 46/2004 (2%) battles, 3104/h, ETA 38 min, 0 failed, skips 16.7/battle (last 100), aa -0.11, em -0.19, em2 -0.18
19:46:18 progress screen: 2002/2004 (100%) battles, 3868/h, ETA 0 min, 0 failed, skips 14.4/battle (last 100), aa +0.00, em -0.03, em2 +0.01
19:50:08 screen exit=0 in 2103 s
19:50:08 start confirm
19:50:08 watching confirm: 4 stop rule(s)
20:16:34 progress confirm: 495/496 (100%) battles, 1124/h, ETA 0 min, 0 failed, skips 11.4/battle (last 100), aa +0.01, em -0.03, em2 -0.01
20:18:08 confirm exit=0 in 1679 s
20:18:08 start gate
20:18:09 gate exit=0 in 0 s
20:18:09 start pairs
20:18:10 pairs exit=0 in 1 s
20:18:10 start pr
20:18:18 pr exit=0 in 8 s
20:18:18 ALLDONE
```
