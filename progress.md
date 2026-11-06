# Queue pc-tailor-field: progress

Updated 2026-11-06 19:47:18 PC time (19:47 UTC), runner pid 52376.

- `prep` done, exit 0 in 8 min
- `pilot` done, exit 0 in 4 min
- `screen` running
- `pick` skipped
- `prep2` skipped
- `confirm` skipped
- `gate` skipped
- `pr` skipped

### screen

**12420 battles**, 0 failed, 3259 read back from an earlier run. Running 12.2 h, 702 battles/h. Last battle -0 min ago.
Skipped turns a battle: 56.5 overall, first 100 54.7, last 100 52.1; engine disables 4553.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| sg | 1128 | 0 | 78.51 | -13.79 (848 robots) | ±1.49 | -16.07 .. -11.51 | 48.8 |
| fp | 1129 | 0 | 92.64 | +0.08 (849 robots) | ±0.24 | -0.29 .. +0.45 | 55.4 |
| hj | 1130 | 0 | 92.82 | +0.25 (850 robots) | ±0.24 | -0.12 .. +0.62 | 57.0 |
| mm | 1130 | 0 | 92.41 | -0.16 (850 robots) | ±0.25 | -0.55 .. +0.22 | 58.5 |
| dg | 1129 | 0 | 92.60 | +0.01 (850 robots) | ±0.25 | -0.37 .. +0.39 | 54.0 |
| rd | 1130 | 0 | 92.60 | +0.02 (849 robots) | ±0.23 | -0.34 .. +0.37 | 55.7 |
| sw | 1130 | 0 | 78.76 | -13.52 (850 robots) | ±1.48 | -15.78 .. -11.26 | 49.3 |
| gs | 1127 | 0 | 92.58 | +0.00 (849 robots) | ±0.26 | -0.39 .. +0.39 | 57.3 |
| fl | 1128 | 0 | 92.57 | +0.01 (849 robots) | ±0.23 | -0.34 .. +0.36 | 55.3 |
| x5 | 1129 | 0 | 92.52 | -0.06 (849 robots) | ±0.25 | -0.44 .. +0.33 | 57.2 |
| c | 1130 | 0 | 92.59 | - | - | - | 57.0 |

APS = mean difference over the robots read x 1194 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 12420 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 90 over 200` | halt | ok | 54.5 a battle over the last 200 (first 200: 56.5) |
| `stall 30m` | halt | ok | last battle -0 min ago |

### Queue log (last lines)

```
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
19:45:06 progress screen: 12394 battles, 698/h, 0 failed, skips 54.0/battle (last 100), sg -13.79, fp +0.08, hj +0.25, mm -0.16, dg +0.01, rd +0.02, sw -13.52, gs -0.00, fl +0.01, x5 -0.06
```
