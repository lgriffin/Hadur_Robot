# Queue pc-shards: progress

Updated 2026-11-16 01:48:19 PC time (01:48 UTC), runner pid 20660.

- `prep` done, exit 0 in 6 min
- `livematch` done, exit 0 in 0 min
- `screen` running
- `pick` pending
- `lock` pending
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

**14779 of 25380 battles** (58%), 0 failed. Running 5.2 h, 2920 battles/h, about 3.6 h left (ends ~05:26 PC time). Last battle 0 min ago.
Skipped turns a battle: 22.8 overall, first 100 22.7, last 100 22.7; engine disables 1236.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 1643 | 0 | 91.37 | - | - | - | 22.6 |
| aa | 1642 | 0 | 91.28 | -0.04 (468 robots) | ±0.07 | -0.14 .. +0.06 | 21.9 |
| fq | 1642 | 0 | 91.22 | -0.04 (468 robots) | ±0.06 | -0.14 .. +0.06 | 22.4 |
| x5 | 1646 | 0 | 91.18 | -0.06 (468 robots) | ±0.07 | -0.16 .. +0.05 | 23.5 |
| hl | 1640 | 0 | 91.45 | +0.05 (468 robots) | ±0.07 | -0.05 .. +0.15 | 22.9 |
| dg | 1642 | 0 | 91.18 | -0.06 (468 robots) | ±0.08 | -0.17 .. +0.06 | 22.8 |
| gl | 1641 | 0 | 91.09 | -0.09 (468 robots) | ±0.07 | -0.19 .. +0.01 | 22.8 |
| mq | 1643 | 0 | 90.80 | -0.20 (468 robots) | ±0.08 | -0.32 .. -0.08 | 23.7 |
| mtzl | 1640 | 0 | 87.46 | -1.49 (468 robots) | ±0.17 | -1.75 .. -1.23 | 22.6 |

APS = mean difference over the robots read x 470 panel robots / 1217 pairings.
A/A: aa - c -0.10 pts over 468 robots; 1% band ±0.29 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 14779 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | ok | 21.5 a battle over the last 200 (first 200: 20.5) |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `aa after 20%` | halt | ok | aa - c -0.10 pts over 468 robots, stop band ±0.33 |

Stopping now would leave 10601 battles unrun (about 3.6 h); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
20:36:21 watching livematch: 3 stop rule(s)
20:36:29 livematch exit=0 in 7 s
20:36:29 start screen
20:36:29 watching screen: 5 stop rule(s)
20:36:50 progress screen: 0/25380 (0%) battles, 0 failed
21:07:13 progress screen: 1613/25380 (6%) battles, 3180/h, ETA 7.5 h, 0 failed, skips 22.1/battle (last 100), aa -0.11, fq -0.14, x5 -0.00, hl +0.03, dg -0.15, gl -0.12, mq -0.15, mtzl -1.35
21:37:19 progress screen: 3222/25380 (13%) battles, 3210/h, ETA 6.9 h, 0 failed, skips 24.1/battle (last 100), aa -0.01, fq -0.08, x5 -0.00, hl +0.07, dg -0.16, gl -0.12, mq -0.14, mtzl -1.56
22:07:28 progress screen: 4775/25380 (19%) battles, 3090/h, ETA 6.7 h, 0 failed, skips 19.9/battle (last 100), aa -0.06, fq -0.02, x5 -0.03, hl +0.03, dg -0.12, gl -0.07, mq -0.13, mtzl -1.57
22:37:38 progress screen: 6167/25380 (24%) battles, 2762/h, ETA 7.0 h, 0 failed, skips 19.3/battle (last 100), aa -0.05, fq -0.02, x5 -0.03, hl +0.04, dg -0.08, gl -0.07, mq -0.18, mtzl -1.54
23:07:56 progress screen: 7302/25380 (29%) battles, 2252/h, ETA 8.0 h, 0 failed, skips 24.9/battle (last 100), aa -0.02, fq -0.05, x5 -0.04, hl +0.06, dg -0.08, gl -0.11, mq -0.16, mtzl -1.58
23:38:12 progress screen: 8669/25380 (34%) battles, 2706/h, ETA 6.2 h, 0 failed, skips 23.1/battle (last 100), aa -0.00, fq -0.04, x5 -0.03, hl +0.09, dg -0.04, gl -0.09, mq -0.15, mtzl -1.50
00:08:35 progress screen: 10158/25380 (40%) battles, 2940/h, ETA 5.2 h, 0 failed, skips 19.4/battle (last 100), aa -0.00, fq -0.06, x5 -0.05, hl +0.07, dg -0.04, gl -0.08, mq -0.16, mtzl -1.48
00:38:57 progress screen: 11506/25380 (45%) battles, 2664/h, ETA 5.2 h, 0 failed, skips 20.9/battle (last 100), aa -0.03, fq -0.04, x5 -0.04, hl +0.09, dg -0.06, gl -0.07, mq -0.20, mtzl -1.49
01:09:05 progress screen: 12884/25380 (51%) battles, 2750/h, ETA 4.5 h, 0 failed, skips 21.0/battle (last 100), aa -0.03, fq -0.04, x5 -0.04, hl +0.06, dg -0.07, gl -0.09, mq -0.20, mtzl -1.49
01:39:16 progress screen: 14341/25380 (57%) battles, 2902/h, ETA 3.8 h, 0 failed, skips 20.7/battle (last 100), aa -0.04, fq -0.04, x5 -0.05, hl +0.05, dg -0.06, gl -0.08, mq -0.19, mtzl -1.48
```
