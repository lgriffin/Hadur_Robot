# Queue pc-tailor-field: progress

Updated 2026-11-07 12:13:49 PC time (12:13 UTC), runner pid 52376.

- `prep` done, exit 0 in 8 min
- `pilot` done, exit 0 in 4 min
- `screen` running
- `pick` skipped
- `prep2` skipped
- `confirm` skipped
- `gate` skipped
- `pr` skipped

### screen

**24675 battles**, 0 failed, 3259 read back from an earlier run. Running 28.6 h, 756 battles/h. Last battle -0 min ago.
Skipped turns a battle: 56.4 overall, first 100 54.7, last 100 45.5; engine disables 10537.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| sg | 2245 | 0 | 78.73 | -13.66 (1191 robots) | ±1.23 | -15.54 .. -11.78 | 49.6 |
| fp | 2243 | 0 | 92.74 | +0.11 (1192 robots) | ±0.16 | -0.14 .. +0.36 | 57.2 |
| hj | 2243 | 0 | 92.86 | +0.20 (1191 robots) | ±0.17 | -0.06 .. +0.46 | 56.5 |
| mm | 2242 | 0 | 92.47 | -0.18 (1191 robots) | ±0.18 | -0.45 .. +0.10 | 58.6 |
| dg | 2247 | 0 | 92.57 | -0.06 (1192 robots) | ±0.16 | -0.31 .. +0.18 | 55.0 |
| rd | 2243 | 0 | 92.62 | -0.01 (1192 robots) | ±0.16 | -0.25 .. +0.23 | 57.1 |
| sw | 2241 | 0 | 78.97 | -13.41 (1192 robots) | ±1.23 | -15.29 .. -11.52 | 50.4 |
| gs | 2241 | 0 | 92.56 | -0.09 (1191 robots) | ±0.18 | -0.36 .. +0.19 | 57.4 |
| fl | 2245 | 0 | 92.53 | -0.10 (1192 robots) | ±0.16 | -0.34 .. +0.14 | 56.4 |
| x5 | 2241 | 0 | 92.43 | -0.21 (1191 robots) | ±0.17 | -0.47 .. +0.05 | 57.3 |
| c | 2244 | 0 | 92.64 | - | - | - | 57.3 |

APS = mean difference over the robots read x 1194 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 24675 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 90 over 200` | halt | ok | 49.3 a battle over the last 200 (first 200: 56.5) |
| `stall 30m` | halt | ok | last battle -0 min ago |

### Queue log (last lines)

```
04:49:58 progress screen: 19092 battles, 742/h, 0 failed, skips 62.7/battle (last 100), sg -13.75, fp +0.13, hj +0.20, mm -0.12, dg -0.06, rd -0.02, sw -13.47, gs -0.10, fl -0.06, x5 -0.16
05:20:11 progress screen: 19459 battles, 730/h, 0 failed, skips 53.7/battle (last 100), sg -13.76, fp +0.13, hj +0.21, mm -0.15, dg -0.06, rd -0.02, sw -13.48, gs -0.09, fl -0.05, x5 -0.18
05:50:24 progress screen: 19824 battles, 722/h, 0 failed, skips 56.3/battle (last 100), sg -13.68, fp +0.16, hj +0.21, mm -0.12, dg -0.05, rd +0.01, sw -13.44, gs -0.07, fl -0.04, x5 -0.16
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
```
