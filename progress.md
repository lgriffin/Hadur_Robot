# Queue pc-tailor-field: progress

Updated 2026-11-07 13:29:29 PC time (13:29 UTC), runner pid 52376.

- `prep` done, exit 0 in 8 min
- `pilot` done, exit 0 in 4 min
- `screen` running
- `pick` skipped
- `prep2` skipped
- `confirm` skipped
- `gate` skipped
- `pr` skipped

### screen

**25642 battles**, 0 failed, 3259 read back from an earlier run. Running 29.9 h, 790 battles/h. Last battle 0 min ago.
Skipped turns a battle: 56.4 overall, first 100 54.7, last 100 58.5; engine disables 11024.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| sg | 2332 | 0 | 78.67 | -13.70 (1193 robots) | ±1.23 | -15.58 .. -11.83 | 49.9 |
| fp | 2332 | 0 | 92.75 | +0.11 (1193 robots) | ±0.16 | -0.13 .. +0.35 | 57.3 |
| hj | 2333 | 0 | 92.86 | +0.22 (1193 robots) | ±0.17 | -0.03 .. +0.48 | 56.3 |
| mm | 2332 | 0 | 92.48 | -0.16 (1193 robots) | ±0.17 | -0.42 .. +0.10 | 58.5 |
| dg | 2331 | 0 | 92.59 | -0.05 (1193 robots) | ±0.16 | -0.29 .. +0.19 | 55.2 |
| rd | 2332 | 0 | 92.62 | -0.02 (1193 robots) | ±0.15 | -0.26 .. +0.22 | 56.9 |
| sw | 2327 | 0 | 78.97 | -13.41 (1193 robots) | ±1.23 | -15.29 .. -11.53 | 50.4 |
| gs | 2331 | 0 | 92.57 | -0.07 (1193 robots) | ±0.18 | -0.34 .. +0.20 | 57.5 |
| fl | 2331 | 0 | 92.54 | -0.10 (1193 robots) | ±0.15 | -0.33 .. +0.14 | 56.5 |
| x5 | 2330 | 0 | 92.44 | -0.19 (1193 robots) | ±0.17 | -0.45 .. +0.06 | 57.4 |
| c | 2331 | 0 | 92.64 | - | - | - | 57.3 |

APS = mean difference over the robots read x 1194 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 25642 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 90 over 200` | halt | ok | 59.5 a battle over the last 200 (first 200: 56.5) |
| `stall 30m` | halt | ok | last battle 0 min ago |

### Queue log (last lines)

```
06:20:38 progress screen: 20211 battles, 770/h, 0 failed, skips 50.8/battle (last 100), sg -13.57, fp +0.17, hj +0.22, mm -0.11, dg -0.06, rd +0.04, sw -13.32, gs -0.06, fl -0.05, x5 -0.17
06:50:55 progress screen: 20597 battles, 766/h, 0 failed, skips 55.4/battle (last 100), sg -13.61, fp +0.16, hj +0.24, mm -0.12, dg -0.07, rd +0.04, sw -13.34, gs -0.06, fl -0.07, x5 -0.17
07:21:09 progress screen: 20988 battles, 778/h, 0 failed, skips 57.3/battle (last 100), sg -13.60, fp +0.15, hj +0.25, mm -0.13, dg -0.05, rd +0.03, sw -13.34, gs -0.07, fl -0.07, x5 -0.15
07:51:21 progress screen: 21369 battles, 758/h, 0 failed, skips 53.3/battle (last 100), sg -13.65, fp +0.13, hj +0.22, mm -0.13, dg -0.08, rd +0.02, sw -13.36, gs -0.08, fl -0.08, x5 -0.18
08:21:37 progress screen: 21742 battles, 740/h, 0 failed, skips 53.9/battle (last 100), sg -13.63, fp +0.13, hj +0.22, mm -0.15, dg -0.05, rd +0.00, sw -13.34, gs -0.07, fl -0.07, x5 -0.18
08:51:53 progress screen: 22123 battles, 742/h, 0 failed, skips 45.4/battle (last 100), sg -13.62, fp +0.13, hj +0.21, mm -0.14, dg -0.07, rd +0.01, sw -13.31, gs -0.08, fl -0.06, x5 -0.15
09:22:12 progress screen: 22497 battles, 744/h, 0 failed, skips 59.5/battle (last 100), sg -13.57, fp +0.12, hj +0.20, mm -0.15, dg -0.07, rd +0.01, sw -13.22, gs -0.09, fl -0.06, x5 -0.17
09:52:27 progress screen: 22897 battles, 790/h, 0 failed, skips 69.1/battle (last 100), sg -13.54, fp +0.12, hj +0.20, mm -0.15, dg -0.05, rd +0.00, sw -13.18, gs -0.09, fl -0.06, x5 -0.17
10:22:44 progress screen: 23264 battles, 724/h, 0 failed, skips 61.8/battle (last 100), sg -13.58, fp +0.10, hj +0.19, mm -0.17, dg -0.06, rd -0.01, sw -13.22, gs -0.11, fl -0.10, x5 -0.20
10:53:00 progress screen: 23639 battles, 738/h, 0 failed, skips 74.4/battle (last 100), sg -13.61, fp +0.12, hj +0.20, mm -0.17, dg -0.03, rd +0.02, sw -13.26, gs -0.09, fl -0.09, x5 -0.19
11:23:22 progress screen: 24044 battles, 806/h, 0 failed, skips 57.6/battle (last 100), sg -13.59, fp +0.11, hj +0.19, mm -0.19, dg -0.05, rd -0.01, sw -13.28, gs -0.09, fl -0.10, x5 -0.20
11:53:35 progress screen: 24423 battles, 758/h, 0 failed, skips 54.5/battle (last 100), sg -13.60, fp +0.11, hj +0.21, mm -0.18, dg -0.07, rd -0.01, sw -13.28, gs -0.09, fl -0.10, x5 -0.20
12:23:52 progress screen: 24796 battles, 744/h, 0 failed, skips 57.2/battle (last 100), sg -13.69, fp +0.10, hj +0.20, mm -0.18, dg -0.07, rd -0.02, sw -13.42, gs -0.08, fl -0.10, x5 -0.21
12:54:09 progress screen: 25184 battles, 766/h, 0 failed, skips 49.1/battle (last 100), sg -13.66, fp +0.09, hj +0.21, mm -0.18, dg -0.06, rd -0.02, sw -13.41, gs -0.07, fl -0.10, x5 -0.20
13:24:36 progress screen: 25571 battles, 762/h, 0 failed, skips 59.9/battle (last 100), sg -13.69, fp +0.11, hj +0.22, mm -0.16, dg -0.05, rd -0.02, sw -13.41, gs -0.07, fl -0.10, x5 -0.19
```
