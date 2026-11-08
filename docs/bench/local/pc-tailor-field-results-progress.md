# Queue pc-tailor-field: progress

Updated 2026-11-07 14:43:14 PC time (14:43 UTC), runner pid 52376.

- `prep` done, exit 0 in 8 min
- `pilot` done, exit 0 in 4 min
- `screen` done, exit 0 in 30.7 h
- `pick` done, exit 0 in 0 min
- `prep2` done, exit 0 in 1 min
- `confirm` running
- `gate` skipped
- `pr` skipped

### screen

**26268 battles**, 0 failed, 3259 read back from an earlier run. Running 30.7 h, 744 battles/h. Last battle 1 min ago.
Skipped turns a battle: 56.5 overall, first 100 54.7, last 100 46.3; engine disables 11342.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| sg | 2388 | 0 | 78.72 | -13.64 (1194 robots) | ±1.22 | -15.51 .. -11.77 | 50.1 |
| fp | 2388 | 0 | 92.76 | +0.13 (1194 robots) | ±0.16 | -0.10 .. +0.37 | 57.5 |
| hj | 2388 | 0 | 92.88 | +0.26 (1194 robots) | ±0.16 | +0.01 .. +0.50 | 56.4 |
| mm | 2388 | 0 | 92.49 | -0.13 (1194 robots) | ±0.17 | -0.39 .. +0.13 | 58.7 |
| dg | 2388 | 0 | 92.58 | -0.04 (1194 robots) | ±0.16 | -0.28 .. +0.20 | 55.4 |
| rd | 2388 | 0 | 92.62 | -0.00 (1194 robots) | ±0.15 | -0.24 .. +0.23 | 56.7 |
| sw | 2388 | 0 | 79.00 | -13.36 (1194 robots) | ±1.23 | -15.24 .. -11.48 | 50.3 |
| gs | 2388 | 0 | 92.58 | -0.04 (1194 robots) | ±0.17 | -0.30 .. +0.22 | 57.5 |
| fl | 2388 | 0 | 92.53 | -0.09 (1194 robots) | ±0.15 | -0.32 .. +0.15 | 56.4 |
| x5 | 2388 | 0 | 92.45 | -0.16 (1194 robots) | ±0.16 | -0.41 .. +0.09 | 57.3 |
| c | 2388 | 0 | 92.62 | - | - | - | 57.3 |

APS = mean difference over the robots read x 1194 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 26268 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 90 over 200` | halt | ok | 53.1 a battle over the last 200 (first 200: 56.5) |
| `stall 30m` | halt | ok | last battle 1 min ago |

### confirm

**910 of 912 battles** (100%), 0 failed. Running 24 min, 2318 battles/h, about 0 min left (ends ~14:43 PC time). Last battle 0 min ago.
Skipped turns a battle: 30.7 overall, first 100 41.1, last 100 30.4; engine disables 69.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 302 | 0 | 78.42 | - | - | - | 30.7 |
| aa | 304 | 0 | 78.66 | +0.02 (76 robots) | ±0.05 | -0.06 .. +0.09 | 30.5 |
| xr | 304 | 0 | 80.34 | +0.11 (76 robots) | ±0.08 | -0.00 .. +0.23 | 31.0 |

APS = mean difference over the robots read x 76 panel robots / 1217 pairings.
A/A: aa - c +0.24 pts over 76 robots; 1% band ±0.67 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 910 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 90 over 200` | halt | ok | 28.9 a battle over the last 200 (first 200: 35.2) |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 2 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

> warning: arm c's jar bisect/hadur117.Hadur_3.21.jar was built 41 h before this step started: check it is not stale

> warning: arm aa's jar bisect/hadur117.Hadur_3.21aa.jar was built 41 h before this step started: check it is not stale

### Queue log (last lines)

```
10:53:00 progress screen: 23639 battles, 738/h, 0 failed, skips 74.4/battle (last 100), sg -13.61, fp +0.12, hj +0.20, mm -0.17, dg -0.03, rd +0.02, sw -13.26, gs -0.09, fl -0.09, x5 -0.19
11:23:22 progress screen: 24044 battles, 806/h, 0 failed, skips 57.6/battle (last 100), sg -13.59, fp +0.11, hj +0.19, mm -0.19, dg -0.05, rd -0.01, sw -13.28, gs -0.09, fl -0.10, x5 -0.20
11:53:35 progress screen: 24423 battles, 758/h, 0 failed, skips 54.5/battle (last 100), sg -13.60, fp +0.11, hj +0.21, mm -0.18, dg -0.07, rd -0.01, sw -13.28, gs -0.09, fl -0.10, x5 -0.20
12:23:52 progress screen: 24796 battles, 744/h, 0 failed, skips 57.2/battle (last 100), sg -13.69, fp +0.10, hj +0.20, mm -0.18, dg -0.07, rd -0.02, sw -13.42, gs -0.08, fl -0.10, x5 -0.21
12:54:09 progress screen: 25184 battles, 766/h, 0 failed, skips 49.1/battle (last 100), sg -13.66, fp +0.09, hj +0.21, mm -0.18, dg -0.06, rd -0.02, sw -13.41, gs -0.07, fl -0.10, x5 -0.20
13:24:36 progress screen: 25571 battles, 762/h, 0 failed, skips 59.9/battle (last 100), sg -13.69, fp +0.11, hj +0.22, mm -0.16, dg -0.05, rd -0.02, sw -13.41, gs -0.07, fl -0.10, x5 -0.19
13:54:43 progress screen: 25980 battles, 818/h, 0 failed, skips 63.3/battle (last 100), sg -13.66, fp +0.13, hj +0.25, mm -0.14, dg -0.03, rd -0.00, sw -13.40, gs -0.05, fl -0.08, x5 -0.17
14:18:59 screen exit=0 in 110466 s
14:18:59 start pick
14:19:01 pick exit=0 in 1 s
14:19:01 start prep2
14:19:40 prep2 exit=0 in 39 s
14:19:40 start confirm
14:19:40 watching confirm: 4 stop rule(s)
14:24:58 progress confirm: 218/912 (24%) battles, 2471/h, ETA 17 min, 0 failed, skips 31.2/battle (last 100), aa -0.05, xr +0.04
```
