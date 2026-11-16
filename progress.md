# Queue pc-shards: progress

Updated 2026-11-16 05:51:34 PC time (05:51 UTC), runner pid 20660.

- `prep` done, exit 0 in 6 min
- `livematch` done, exit 0 in 0 min
- `screen` done, exit 0 in 9.1 h
- `pick` done, exit 0 in 4 min
- `lock` running
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

**168 of 1824 battles** (9%), 0 failed. Running 3 min, 3885 battles/h, about 26 min left (ends ~06:17 PC time). Last battle 0 min ago.
Skipped turns a battle: 13.4 overall, first 100 13.8, last 100 13.0; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 19 | 0 | 83.14 | - | - | - | 12.1 |
| aa | 21 | 0 | 85.23 | +0.04 (9 robots) | ±0.04 | -0.02 .. +0.10 | 13.7 |
| x5 | 22 | 0 | 83.74 | -0.00 (9 robots) | ±0.03 | -0.06 .. +0.05 | 13.3 |
| hl | 21 | 0 | 86.98 | +0.01 (9 robots) | ±0.03 | -0.03 .. +0.06 | 13.7 |
| dg | 23 | 0 | 84.32 | -0.02 (9 robots) | ±0.05 | -0.10 .. +0.06 | 13.5 |
| gl | 19 | 0 | 86.92 | +0.02 (9 robots) | ±0.03 | -0.02 .. +0.07 | 13.9 |
| mq | 22 | 0 | 86.20 | +0.03 (9 robots) | ±0.03 | -0.01 .. +0.08 | 13.4 |
| mtzl | 21 | 0 | 91.81 | +0.14 (9 robots) | ±0.12 | -0.05 .. +0.32 | 13.8 |

APS = mean difference over the robots read x 19 panel robots / 1217 pairings.
A/A: aa - c +2.60 pts over 9 robots; 1% band ±2.88 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 168 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 24` | halt | ok | 12.6 a battle over the last 24 (first 24: 15.6) |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 1656 battles unrun (about 26 min); every battle already fought is kept and a rerun resumes from it.

> warning: jobs are in set order (no --shuffle-jobs): running means read the set's first robots

### Queue log (last lines)

```
01:09:05 progress screen: 12884/25380 (51%) battles, 2750/h, ETA 4.5 h, 0 failed, skips 21.0/battle (last 100), aa -0.03, fq -0.04, x5 -0.04, hl +0.06, dg -0.07, gl -0.09, mq -0.20, mtzl -1.49
01:39:16 progress screen: 14341/25380 (57%) battles, 2902/h, ETA 3.8 h, 0 failed, skips 20.7/battle (last 100), aa -0.04, fq -0.04, x5 -0.05, hl +0.05, dg -0.06, gl -0.08, mq -0.19, mtzl -1.48
02:09:29 progress screen: 15729/25380 (62%) battles, 2756/h, ETA 3.5 h, 0 failed, skips 18.5/battle (last 100), aa -0.04, fq -0.04, x5 -0.03, hl +0.06, dg -0.05, gl -0.07, mq -0.19, mtzl -1.47
02:39:45 progress screen: 17185/25380 (68%) battles, 2888/h, ETA 2.8 h, 0 failed, skips 22.9/battle (last 100), aa -0.02, fq -0.04, x5 -0.03, hl +0.05, dg -0.03, gl -0.08, mq -0.19, mtzl -1.46
03:10:07 progress screen: 18695/25380 (74%) battles, 2990/h, ETA 2.2 h, 0 failed, skips 21.2/battle (last 100), aa -0.02, fq -0.03, x5 -0.02, hl +0.07, dg -0.03, gl -0.08, mq -0.18, mtzl -1.45
03:40:20 progress screen: 20276/25380 (80%) battles, 3140/h, ETA 1.6 h, 0 failed, skips 22.4/battle (last 100), aa -0.03, fq -0.04, x5 -0.03, hl +0.07, dg -0.02, gl -0.06, mq -0.17, mtzl -1.43
04:10:32 progress screen: 21860/25380 (86%) battles, 3146/h, ETA 1.1 h, 0 failed, skips 23.4/battle (last 100), aa -0.02, fq -0.04, x5 -0.03, hl +0.07, dg -0.04, gl -0.05, mq -0.16, mtzl -1.42
04:40:41 progress screen: 23316/25380 (92%) battles, 2894/h, ETA 43 min, 0 failed, skips 18.9/battle (last 100), aa -0.01, fq -0.04, x5 -0.03, hl +0.07, dg -0.04, gl -0.05, mq -0.17, mtzl -1.43
05:11:15 progress screen: 24529/25380 (97%) battles, 2364/h, ETA 22 min, 0 failed, skips 32.1/battle (last 100), aa -0.01, fq -0.03, x5 -0.03, hl +0.07, dg -0.04, gl -0.05, mq -0.16, mtzl -1.43
05:41:30 progress screen: 25380/25380 (100%) battles, 1682/h, ETA 0 min, 0 failed, skips 30.0/battle (last 100), aa -0.01, fq -0.03, x5 -0.03, hl +0.06, dg -0.04, gl -0.05, mq -0.16, mtzl -1.43
05:44:29 screen exit=0 in 32880 s
05:44:29 start pick
05:48:58 pick exit=0 in 268 s
05:48:58 start lock
05:48:58 watching lock: 4 stop rule(s)
```
