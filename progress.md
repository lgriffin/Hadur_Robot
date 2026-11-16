# Queue pc-shards: progress

Updated 2026-11-16 06:28:02 PC time (06:28 UTC), runner pid 20660.

- `prep` done, exit 0 in 6 min
- `livematch` done, exit 0 in 0 min
- `screen` done, exit 0 in 9.1 h
- `pick` done, exit 0 in 4 min
- `lock` done, exit 0 in 39 min
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

> warning: arm bb's jar opponents/kc.mega.BeepBoop_2.0.jar was built 967 h before this step started: check it is not stale

### screen

**25380 of 25380 battles** (100%), 0 failed. Running 9.1 h, 1476 battles/h, about 0 min left (ends ~05:44 PC time). Last battle 6 min ago.
Skipped turns a battle: 23.6 overall, first 100 22.7, last 100 30.0; engine disables 2517.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 2820 | 0 | 91.31 | - | - | - | 24.1 |
| aa | 2820 | 0 | 91.28 | -0.01 (470 robots) | ±0.05 | -0.09 .. +0.06 | 22.8 |
| fq | 2820 | 0 | 91.23 | -0.03 (470 robots) | ±0.05 | -0.10 .. +0.05 | 23.2 |
| x5 | 2820 | 0 | 91.23 | -0.03 (470 robots) | ±0.05 | -0.10 .. +0.05 | 24.1 |
| hl | 2820 | 0 | 91.44 | +0.06 (470 robots) | ±0.05 | -0.02 .. +0.14 | 23.6 |
| dg | 2820 | 0 | 91.19 | -0.04 (470 robots) | ±0.06 | -0.13 .. +0.05 | 23.3 |
| gl | 2820 | 0 | 91.17 | -0.05 (470 robots) | ±0.05 | -0.12 .. +0.03 | 23.5 |
| mq | 2820 | 0 | 90.89 | -0.16 (470 robots) | ±0.06 | -0.24 .. -0.07 | 24.0 |
| mtzl | 2820 | 0 | 87.59 | -1.43 (470 robots) | ±0.16 | -1.68 .. -1.18 | 23.8 |

APS = mean difference over the robots read x 470 panel robots / 1217 pairings.
A/A: aa - c -0.03 pts over 470 robots; 1% band ±0.22 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 25380 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | ok | 29.7 a battle over the last 200 (first 200: 20.5) |
| `stall 30m` | halt | ok | last battle 6 min ago |
| `aa after 20%` | halt | ok | aa - c -0.03 pts over 470 robots, stop band ±0.26 |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### lock

**1824 of 1824 battles** (100%), 0 failed. Running 39 min, 2598 battles/h, about 0 min left (ends ~06:27 PC time). Last battle 0 min ago.
Skipped turns a battle: 12.0 overall, first 100 13.8, last 100 10.9; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 228 | 0 | 83.86 | - | - | - | 12.1 |
| aa | 228 | 0 | 83.52 | -0.01 (19 robots) | ±0.01 | -0.02 .. +0.01 | 12.0 |
| x5 | 228 | 0 | 83.61 | -0.00 (19 robots) | ±0.01 | -0.01 .. +0.01 | 11.8 |
| hl | 228 | 0 | 83.87 | +0.00 (19 robots) | ±0.01 | -0.01 .. +0.01 | 11.9 |
| dg | 228 | 0 | 83.75 | +0.00 (19 robots) | ±0.01 | -0.01 .. +0.02 | 12.1 |
| gl | 228 | 0 | 84.14 | +0.01 (19 robots) | ±0.01 | -0.00 .. +0.02 | 12.1 |
| mq | 228 | 0 | 83.54 | -0.00 (19 robots) | ±0.01 | -0.02 .. +0.01 | 12.0 |
| mtzl | 228 | 0 | 88.90 | +0.08 (19 robots) | ±0.07 | -0.02 .. +0.18 | 12.0 |

APS = mean difference over the robots read x 19 panel robots / 1217 pairings.
A/A: aa - c -0.34 pts over 19 robots; 1% band ±0.77 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 1824 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 24` | halt | ok | 10.0 a battle over the last 24 (first 24: 15.6) |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

> warning: jobs are in set order (no --shuffle-jobs): running means read the set's first robots

### Queue log (last lines)

```
04:40:41 progress screen: 23316/25380 (92%) battles, 2894/h, ETA 43 min, 0 failed, skips 18.9/battle (last 100), aa -0.01, fq -0.04, x5 -0.03, hl +0.07, dg -0.04, gl -0.05, mq -0.17, mtzl -1.43
05:11:15 progress screen: 24529/25380 (97%) battles, 2364/h, ETA 22 min, 0 failed, skips 32.1/battle (last 100), aa -0.01, fq -0.03, x5 -0.03, hl +0.07, dg -0.04, gl -0.05, mq -0.16, mtzl -1.43
05:41:30 progress screen: 25380/25380 (100%) battles, 1682/h, ETA 0 min, 0 failed, skips 30.0/battle (last 100), aa -0.01, fq -0.03, x5 -0.03, hl +0.06, dg -0.04, gl -0.05, mq -0.16, mtzl -1.43
05:44:29 screen exit=0 in 32880 s
05:44:29 start pick
05:48:58 pick exit=0 in 268 s
05:48:58 start lock
05:48:58 watching lock: 4 stop rule(s)
06:11:50 progress lock: 1253/1824 (69%) battles, 3288/h, ETA 10 min, 0 failed, skips 12.2/battle (last 100), aa -0.01, x5 -0.00, hl +0.00, dg +0.00, gl +0.01, mq -0.00, mtzl +0.08
06:27:53 lock exit=0 in 2335 s
06:27:53 start gate
06:27:54 gate exit=0 in 1 s
06:27:54 start pr
06:28:02 pr exit=0 in 8 s
06:28:02 ALLDONE
```
