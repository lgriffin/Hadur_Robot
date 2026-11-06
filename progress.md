# Queue pc-tailor-field: progress

Updated 2026-11-06 20:48:45 PC time (20:48 UTC), runner pid 52376.

- `prep` done, exit 0 in 8 min
- `pilot` done, exit 0 in 4 min
- `screen` running
- `pick` skipped
- `prep2` skipped
- `confirm` skipped
- `gate` skipped
- `pr` skipped

### screen

**13138 battles**, 0 failed, 3259 read back from an earlier run. Running 13.2 h, 688 battles/h. Last battle 0 min ago.
Skipped turns a battle: 56.5 overall, first 100 54.7, last 100 64.0; engine disables 4894.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| sg | 1193 | 0 | 78.43 | -13.79 (878 robots) | ±1.47 | -16.04 .. -11.54 | 48.7 |
| fp | 1195 | 0 | 92.66 | +0.13 (879 robots) | ±0.23 | -0.23 .. +0.48 | 55.5 |
| hj | 1191 | 0 | 92.76 | +0.25 (879 robots) | ±0.23 | -0.11 .. +0.60 | 57.2 |
| mm | 1194 | 0 | 92.40 | -0.12 (879 robots) | ±0.24 | -0.49 .. +0.25 | 58.1 |
| dg | 1196 | 0 | 92.56 | +0.03 (879 robots) | ±0.24 | -0.33 .. +0.40 | 54.5 |
| rd | 1197 | 0 | 92.59 | +0.05 (879 robots) | ±0.23 | -0.30 .. +0.40 | 55.9 |
| sw | 1196 | 0 | 78.64 | -13.55 (879 robots) | ±1.46 | -15.78 .. -11.32 | 49.6 |
| gs | 1194 | 0 | 92.52 | -0.00 (879 robots) | ±0.25 | -0.39 .. +0.38 | 57.3 |
| fl | 1194 | 0 | 92.59 | +0.05 (879 robots) | ±0.22 | -0.29 .. +0.38 | 55.4 |
| x5 | 1195 | 0 | 92.53 | -0.03 (879 robots) | ±0.25 | -0.41 .. +0.35 | 57.1 |
| c | 1193 | 0 | 92.55 | - | - | - | 56.9 |

APS = mean difference over the robots read x 1194 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 13138 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 90 over 200` | halt | ok | 59.3 a battle over the last 200 (first 200: 56.5) |
| `stall 30m` | halt | ok | last battle 0 min ago |

### Queue log (last lines)

```
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
20:15:23 progress screen: 12756 battles, 714/h, 0 failed, skips 53.0/battle (last 100), sg -13.83, fp +0.09, hj +0.22, mm -0.17, dg +0.03, rd +0.04, sw -13.53, gs +0.00, fl +0.02, x5 -0.05
20:45:41 progress screen: 13103 battles, 686/h, 0 failed, skips 58.1/battle (last 100), sg -13.80, fp +0.12, hj +0.24, mm -0.12, dg +0.03, rd +0.05, sw -13.55, gs -0.01, fl +0.04, x5 -0.03
```
