# Queue pc-field-screen: progress

Updated 2026-11-15 19:17:20 PC time (19:17 UTC), runner pid 32872.

- `prep` done, exit 0 in 5 min
- `livematch` done, exit 0 in 0 min
- `screen` done, exit 0 in 1.0 h
- `pick` done, exit 0 in 3 min
- `lock` done, exit 0 in 10 min
- `gate` done, exit 0 in 0 min
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

> warning: arm bb's jar opponents/kc.mega.BeepBoop_2.0.jar was built 964 h before this step started: check it is not stale

### screen

**4464 of 4464 battles** (100%), 0 failed. Running 1.0 h, 4308 battles/h, about 0 min left (ends ~19:03 PC time). Last battle 0 min ago.
Skipped turns a battle: 14.1 overall, first 100 15.3, last 100 11.9; engine disables 5.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 558 | 0 | 82.96 | - | - | - | 14.2 |
| aa | 558 | 0 | 83.04 | +0.01 (93 robots) | ±0.03 | -0.03 .. +0.05 | 14.1 |
| fq | 558 | 0 | 82.97 | -0.00 (93 robots) | ±0.03 | -0.04 .. +0.04 | 14.2 |
| x5 | 558 | 0 | 81.90 | -0.08 (93 robots) | ±0.04 | -0.14 .. -0.03 | 14.1 |
| hl | 558 | 0 | 83.16 | +0.01 (93 robots) | ±0.03 | -0.03 .. +0.05 | 14.0 |
| dg | 558 | 0 | 82.92 | -0.01 (93 robots) | ±0.02 | -0.04 .. +0.03 | 14.0 |
| gl | 558 | 0 | 82.43 | -0.04 (93 robots) | ±0.03 | -0.09 .. +0.00 | 14.3 |
| mq | 558 | 0 | 82.53 | -0.04 (93 robots) | ±0.03 | -0.08 .. +0.01 | 14.3 |

APS = mean difference over the robots read x 93 panel robots / 1217 pairings.
A/A: aa - c +0.08 pts over 93 robots; 1% band ±0.49 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 4464 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | ok | 12.8 a battle over the last 200 (first 200: 15.5) |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `aa after 20%` | halt | ok | aa - c +0.08 pts over 93 robots, stop band ±0.57 |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### lock

**672 of 672 battles** (100%), 0 failed. Running 10 min, 4032 battles/h, about 0 min left (ends ~19:17 PC time). Last battle 0 min ago.
Skipped turns a battle: 12.4 overall, first 100 13.2, last 100 11.4; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 96 | 0 | 78.54 | - | - | - | 12.5 |
| aa | 96 | 0 | 78.61 | +0.00 (8 robots) | ±0.00 | -0.00 .. +0.01 | 12.6 |
| fq | 96 | 0 | 79.50 | +0.01 (8 robots) | ±0.00 | +0.00 .. +0.01 | 12.6 |
| x5 | 96 | 0 | 79.42 | +0.01 (8 robots) | ±0.01 | -0.01 .. +0.02 | 12.1 |
| hl | 96 | 0 | 79.82 | +0.01 (8 robots) | ±0.00 | +0.00 .. +0.01 | 12.5 |
| dg | 96 | 0 | 79.25 | +0.00 (8 robots) | ±0.00 | -0.00 .. +0.01 | 12.2 |
| gl | 96 | 0 | 79.38 | +0.01 (8 robots) | ±0.01 | -0.01 .. +0.02 | 11.9 |

APS = mean difference over the robots read x 8 panel robots / 1217 pairings.
A/A: aa - c +0.07 pts over 8 robots; 1% band ±1.19 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 672 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 24` | halt | ok | 9.0 a battle over the last 24 (first 24: 16.4) |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

> warning: jobs are in set order (no --shuffle-jobs): running means read the set's first robots

### Queue log (last lines)

```
18:01:47 watching screen: 5 stop rule(s)
18:01:50 progress screen: 0/4464 (0%) battles, 0 failed
18:32:12 progress screen: 2173/4464 (49%) battles, 4302/h, ETA 32 min, 0 failed, skips 14.7/battle (last 100), aa +0.01, fq +0.01, x5 -0.08, hl +0.03, dg +0.01, gl -0.01, mq -0.03
19:02:18 progress screen: 4458/4464 (100%) battles, 4554/h, ETA 0 min, 0 failed, skips 12.3/battle (last 100), aa +0.01, fq -0.00, x5 -0.08, hl +0.01, dg -0.01, gl -0.04, mq -0.04
19:03:57 screen exit=0 in 3730 s
19:03:57 start pick
19:07:13 pick exit=0 in 195 s
19:07:13 start lock
19:07:13 watching lock: 4 stop rule(s)
19:17:13 lock exit=0 in 600 s
19:17:13 start gate
19:17:14 gate exit=0 in 0 s
19:17:14 start pr
19:17:20 pr exit=0 in 6 s
19:17:20 ALLDONE
```
