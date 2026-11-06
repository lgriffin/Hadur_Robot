# Queue pc-tailor-field: progress

Updated 2026-11-06 16:59:41 PC time (16:59 UTC), runner pid 52376.

- `prep` done, exit 0 in 8 min
- `pilot` done, exit 0 in 4 min
- `screen` running
- `pick` skipped
- `prep2` skipped
- `confirm` skipped
- `gate` skipped
- `pr` skipped

### screen

**10344 battles**, 0 failed, 3259 read back from an earlier run. Running 9.4 h, 740 battles/h. Last battle 0 min ago.
Skipped turns a battle: 56.2 overall, first 100 54.7, last 100 47.7; engine disables 3507.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| sg | 942 | 0 | 78.35 | -13.85 (745 robots) | ±1.60 | -16.30 .. -11.40 | 48.3 |
| fp | 938 | 0 | 92.51 | +0.12 (742 robots) | ±0.27 | -0.28 .. +0.53 | 54.2 |
| hj | 942 | 0 | 92.72 | +0.31 (744 robots) | ±0.26 | -0.08 .. +0.71 | 56.9 |
| mm | 939 | 0 | 92.28 | -0.13 (743 robots) | ±0.27 | -0.54 .. +0.29 | 58.1 |
| dg | 939 | 0 | 92.45 | +0.01 (743 robots) | ±0.26 | -0.39 .. +0.41 | 54.6 |
| rd | 938 | 0 | 92.59 | +0.10 (743 robots) | ±0.25 | -0.29 .. +0.48 | 55.4 |
| sw | 941 | 0 | 78.41 | -13.70 (744 robots) | ±1.59 | -16.13 .. -11.27 | 48.8 |
| gs | 941 | 0 | 92.43 | +0.06 (744 robots) | ±0.28 | -0.37 .. +0.49 | 55.6 |
| fl | 942 | 0 | 92.44 | +0.04 (745 robots) | ±0.25 | -0.35 .. +0.42 | 54.7 |
| x5 | 940 | 0 | 92.35 | -0.01 (743 robots) | ±0.27 | -0.43 .. +0.41 | 57.0 |
| c | 942 | 0 | 92.46 | - | - | - | 56.3 |

APS = mean difference over the robots read x 1194 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 10344 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 90 over 200` | halt | ok | 55.3 a battle over the last 200 (first 200: 56.5) |
| `stall 30m` | halt | ok | last battle 0 min ago |

### Queue log (last lines)

```
09:40:13 progress screen: 4814 battles, 722/h, 0 failed, skips 52.5/battle (last 100), sg -14.38, fp -0.06, hj +0.06, mm -0.42, dg -0.11, rd +0.06, sw -13.59, gs -0.02, fl -0.14, x5 -0.21
10:10:35 progress screen: 5222 battles, 804/h, 0 failed, skips 49.9/battle (last 100), sg -14.32, fp -0.04, hj +0.11, mm -0.44, dg -0.07, rd +0.05, sw -13.79, gs -0.06, fl -0.11, x5 -0.16
10:40:56 progress screen: 5620 battles, 788/h, 0 failed, skips 55.4/battle (last 100), sg -14.36, fp -0.02, hj +0.14, mm -0.38, dg -0.12, rd +0.08, sw -13.91, gs -0.03, fl -0.07, x5 -0.11
11:11:09 progress screen: 5977 battles, 714/h, 0 failed, skips 39.2/battle (last 100), sg -14.08, fp +0.10, hj +0.24, mm -0.26, dg -0.07, rd +0.14, sw -13.82, gs +0.11, fl -0.06, x5 -0.03
11:41:18 progress screen: 6346 battles, 736/h, 0 failed, skips 43.6/battle (last 100), sg -14.08, fp +0.15, hj +0.28, mm -0.21, dg -0.10, rd +0.21, sw -13.63, gs +0.13, fl -0.04, x5 +0.03
12:11:31 progress screen: 6745 battles, 796/h, 0 failed, skips 58.4/battle (last 100), sg -14.13, fp +0.09, hj +0.24, mm -0.19, dg -0.11, rd +0.17, sw -13.65, gs +0.10, fl -0.03, x5 -0.03
12:41:45 progress screen: 7125 battles, 756/h, 0 failed, skips 58.0/battle (last 100), sg -13.98, fp +0.06, hj +0.24, mm -0.17, dg -0.14, rd +0.16, sw -13.53, gs +0.10, fl -0.02, x5 -0.05
13:12:00 progress screen: 7494 battles, 736/h, 0 failed, skips 47.2/battle (last 100), sg -14.01, fp +0.08, hj +0.23, mm -0.18, dg -0.08, rd +0.16, sw -13.49, gs +0.10, fl +0.01, x5 -0.04
13:42:14 progress screen: 7896 battles, 804/h, 0 failed, skips 56.9/battle (last 100), sg -13.97, fp +0.08, hj +0.22, mm -0.17, dg -0.09, rd +0.16, sw -13.68, gs +0.06, fl +0.00, x5 -0.01
14:12:26 progress screen: 8289 battles, 784/h, 0 failed, skips 54.9/battle (last 100), sg -13.80, fp +0.08, hj +0.21, mm -0.20, dg -0.09, rd +0.13, sw -13.65, gs +0.03, fl +0.01, x5 -0.05
14:42:46 progress screen: 8667 battles, 752/h, 0 failed, skips 48.8/battle (last 100), sg -13.87, fp +0.06, hj +0.21, mm -0.21, dg -0.06, rd +0.13, sw -13.78, gs +0.05, fl +0.03, x5 -0.05
15:12:53 progress screen: 9023 battles, 710/h, 0 failed, skips 67.4/battle (last 100), sg -14.06, fp +0.05, hj +0.22, mm -0.23, dg -0.09, rd +0.09, sw -13.93, gs +0.03, fl +0.04, x5 -0.05
15:43:06 progress screen: 9375 battles, 700/h, 0 failed, skips 56.8/battle (last 100), sg -13.88, fp +0.07, hj +0.23, mm -0.21, dg -0.09, rd +0.08, sw -13.88, gs +0.01, fl +0.00, x5 -0.07
16:13:20 progress screen: 9771 battles, 778/h, 0 failed, skips 55.1/battle (last 100), sg -13.86, fp +0.09, hj +0.26, mm -0.16, dg -0.06, rd +0.06, sw -13.74, gs +0.02, fl +0.03, x5 -0.07
16:43:41 progress screen: 10156 battles, 770/h, 0 failed, skips 59.6/battle (last 100), sg -13.89, fp +0.11, hj +0.31, mm -0.15, dg -0.03, rd +0.08, sw -13.84, gs +0.06, fl +0.05, x5 -0.03
```
