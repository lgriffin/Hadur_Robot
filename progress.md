# Queue pc-shards: progress

Updated 2026-11-16 05:35:33 PC time (05:35 UTC), runner pid 20660.

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

**25302 of 25380 battles** (100%), 0 failed. Running 9.0 h, 1992 battles/h, about 2 min left (ends ~05:37 PC time). Last battle -0 min ago.
Skipped turns a battle: 23.6 overall, first 100 22.7, last 100 31.5; engine disables 2497.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 2811 | 0 | 91.31 | - | - | - | 24.1 |
| aa | 2810 | 0 | 91.27 | -0.01 (470 robots) | ±0.05 | -0.09 .. +0.06 | 22.8 |
| fq | 2810 | 0 | 91.24 | -0.02 (470 robots) | ±0.05 | -0.10 .. +0.05 | 23.1 |
| x5 | 2810 | 0 | 91.23 | -0.02 (470 robots) | ±0.05 | -0.10 .. +0.05 | 24.1 |
| hl | 2813 | 0 | 91.45 | +0.06 (470 robots) | ±0.05 | -0.02 .. +0.14 | 23.7 |
| dg | 2812 | 0 | 91.19 | -0.04 (470 robots) | ±0.06 | -0.13 .. +0.05 | 23.3 |
| gl | 2812 | 0 | 91.17 | -0.05 (470 robots) | ±0.05 | -0.12 .. +0.03 | 23.4 |
| mq | 2813 | 0 | 90.89 | -0.16 (470 robots) | ±0.06 | -0.24 .. -0.07 | 24.0 |
| mtzl | 2811 | 0 | 87.58 | -1.43 (470 robots) | ±0.16 | -1.68 .. -1.19 | 23.8 |

APS = mean difference over the robots read x 470 panel robots / 1217 pairings.
A/A: aa - c -0.04 pts over 470 robots; 1% band ±0.22 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 25302 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | ok | 29.6 a battle over the last 200 (first 200: 20.5) |
| `stall 30m` | halt | ok | last battle -0 min ago |
| `aa after 20%` | halt | ok | aa - c -0.04 pts over 470 robots, stop band ±0.26 |

Stopping now would leave 78 battles unrun (about 2 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
22:07:28 progress screen: 4775/25380 (19%) battles, 3090/h, ETA 6.7 h, 0 failed, skips 19.9/battle (last 100), aa -0.06, fq -0.02, x5 -0.03, hl +0.03, dg -0.12, gl -0.07, mq -0.13, mtzl -1.57
22:37:38 progress screen: 6167/25380 (24%) battles, 2762/h, ETA 7.0 h, 0 failed, skips 19.3/battle (last 100), aa -0.05, fq -0.02, x5 -0.03, hl +0.04, dg -0.08, gl -0.07, mq -0.18, mtzl -1.54
23:07:56 progress screen: 7302/25380 (29%) battles, 2252/h, ETA 8.0 h, 0 failed, skips 24.9/battle (last 100), aa -0.02, fq -0.05, x5 -0.04, hl +0.06, dg -0.08, gl -0.11, mq -0.16, mtzl -1.58
23:38:12 progress screen: 8669/25380 (34%) battles, 2706/h, ETA 6.2 h, 0 failed, skips 23.1/battle (last 100), aa -0.00, fq -0.04, x5 -0.03, hl +0.09, dg -0.04, gl -0.09, mq -0.15, mtzl -1.50
00:08:35 progress screen: 10158/25380 (40%) battles, 2940/h, ETA 5.2 h, 0 failed, skips 19.4/battle (last 100), aa -0.00, fq -0.06, x5 -0.05, hl +0.07, dg -0.04, gl -0.08, mq -0.16, mtzl -1.48
00:38:57 progress screen: 11506/25380 (45%) battles, 2664/h, ETA 5.2 h, 0 failed, skips 20.9/battle (last 100), aa -0.03, fq -0.04, x5 -0.04, hl +0.09, dg -0.06, gl -0.07, mq -0.20, mtzl -1.49
01:09:05 progress screen: 12884/25380 (51%) battles, 2750/h, ETA 4.5 h, 0 failed, skips 21.0/battle (last 100), aa -0.03, fq -0.04, x5 -0.04, hl +0.06, dg -0.07, gl -0.09, mq -0.20, mtzl -1.49
01:39:16 progress screen: 14341/25380 (57%) battles, 2902/h, ETA 3.8 h, 0 failed, skips 20.7/battle (last 100), aa -0.04, fq -0.04, x5 -0.05, hl +0.05, dg -0.06, gl -0.08, mq -0.19, mtzl -1.48
02:09:29 progress screen: 15729/25380 (62%) battles, 2756/h, ETA 3.5 h, 0 failed, skips 18.5/battle (last 100), aa -0.04, fq -0.04, x5 -0.03, hl +0.06, dg -0.05, gl -0.07, mq -0.19, mtzl -1.47
02:39:45 progress screen: 17185/25380 (68%) battles, 2888/h, ETA 2.8 h, 0 failed, skips 22.9/battle (last 100), aa -0.02, fq -0.04, x5 -0.03, hl +0.05, dg -0.03, gl -0.08, mq -0.19, mtzl -1.46
03:10:07 progress screen: 18695/25380 (74%) battles, 2990/h, ETA 2.2 h, 0 failed, skips 21.2/battle (last 100), aa -0.02, fq -0.03, x5 -0.02, hl +0.07, dg -0.03, gl -0.08, mq -0.18, mtzl -1.45
03:40:20 progress screen: 20276/25380 (80%) battles, 3140/h, ETA 1.6 h, 0 failed, skips 22.4/battle (last 100), aa -0.03, fq -0.04, x5 -0.03, hl +0.07, dg -0.02, gl -0.06, mq -0.17, mtzl -1.43
04:10:32 progress screen: 21860/25380 (86%) battles, 3146/h, ETA 1.1 h, 0 failed, skips 23.4/battle (last 100), aa -0.02, fq -0.04, x5 -0.03, hl +0.07, dg -0.04, gl -0.05, mq -0.16, mtzl -1.42
04:40:41 progress screen: 23316/25380 (92%) battles, 2894/h, ETA 43 min, 0 failed, skips 18.9/battle (last 100), aa -0.01, fq -0.04, x5 -0.03, hl +0.07, dg -0.04, gl -0.05, mq -0.17, mtzl -1.43
05:11:15 progress screen: 24529/25380 (97%) battles, 2364/h, ETA 22 min, 0 failed, skips 32.1/battle (last 100), aa -0.01, fq -0.03, x5 -0.03, hl +0.07, dg -0.04, gl -0.05, mq -0.16, mtzl -1.43
```
