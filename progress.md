# Queue pc-tailor-field: progress

Updated 2026-11-06 19:16:00 PC time (19:16 UTC), runner pid 52376.

- `prep` done, exit 0 in 8 min
- `pilot` done, exit 0 in 4 min
- `screen` running
- `pick` skipped
- `prep2` skipped
- `confirm` skipped
- `gate` skipped
- `pr` skipped

### screen

**12057 battles**, 0 failed, 3259 read back from an earlier run. Running 11.6 h, 768 battles/h. Last battle 0 min ago.
Skipped turns a battle: 56.5 overall, first 100 54.7, last 100 69.6; engine disables 4371.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| sg | 1099 | 0 | 78.44 | -13.88 (833 robots) | ±1.51 | -16.19 .. -11.57 | 48.9 |
| fp | 1098 | 0 | 92.65 | +0.07 (834 robots) | ±0.24 | -0.31 .. +0.44 | 55.0 |
| hj | 1095 | 0 | 92.82 | +0.24 (834 robots) | ±0.24 | -0.13 .. +0.62 | 57.1 |
| mm | 1096 | 0 | 92.41 | -0.16 (833 robots) | ±0.25 | -0.55 .. +0.22 | 58.4 |
| dg | 1095 | 0 | 92.52 | -0.03 (833 robots) | ±0.25 | -0.41 .. +0.35 | 54.2 |
| rd | 1098 | 0 | 92.57 | +0.01 (834 robots) | ±0.24 | -0.35 .. +0.37 | 55.6 |
| sw | 1095 | 0 | 78.75 | -13.58 (833 robots) | ±1.50 | -15.87 .. -11.29 | 49.1 |
| gs | 1093 | 0 | 92.58 | +0.01 (832 robots) | ±0.26 | -0.39 .. +0.40 | 57.2 |
| fl | 1096 | 0 | 92.57 | -0.01 (833 robots) | ±0.23 | -0.36 .. +0.34 | 55.2 |
| x5 | 1095 | 0 | 92.52 | -0.05 (834 robots) | ±0.25 | -0.44 .. +0.33 | 57.1 |
| c | 1097 | 0 | 92.56 | - | - | - | 57.2 |

APS = mean difference over the robots read x 1194 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 12057 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 90 over 200` | halt | ok | 65.3 a battle over the last 200 (first 200: 56.5) |
| `stall 30m` | halt | ok | last battle 0 min ago |

### Queue log (last lines)

```
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
17:13:54 progress screen: 10518 battles, 724/h, 0 failed, skips 54.7/battle (last 100), sg -13.97, fp +0.13, hj +0.32, mm -0.14, dg -0.00, rd +0.08, sw -13.75, gs +0.06, fl +0.03, x5 -0.02
17:44:16 progress screen: 10881 battles, 724/h, 0 failed, skips 54.1/battle (last 100), sg -13.90, fp +0.10, hj +0.32, mm -0.17, dg -0.02, rd +0.07, sw -13.72, gs +0.03, fl +0.01, x5 -0.03
18:14:19 progress screen: 11267 battles, 770/h, 0 failed, skips 68.8/battle (last 100), sg -14.01, fp +0.08, hj +0.29, mm -0.20, dg -0.03, rd +0.03, sw -13.73, gs -0.01, fl -0.02, x5 -0.06
18:44:39 progress screen: 11659 battles, 768/h, 0 failed, skips 54.4/battle (last 100), sg -13.74, fp +0.09, hj +0.28, mm -0.17, dg -0.01, rd +0.02, sw -13.40, gs +0.02, fl +0.01, x5 -0.02
19:14:52 progress screen: 12043 battles, 764/h, 0 failed, skips 67.2/battle (last 100), sg -13.90, fp +0.06, hj +0.24, mm -0.17, dg -0.03, rd +0.01, sw -13.58, gs +0.01, fl -0.01, x5 -0.05
```
