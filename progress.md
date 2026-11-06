# Queue pc-tailor-field: progress

Updated 2026-11-06 23:50:33 PC time (23:50 UTC), runner pid 52376.

- `prep` done, exit 0 in 8 min
- `pilot` done, exit 0 in 4 min
- `screen` running
- `pick` skipped
- `prep2` skipped
- `confirm` skipped
- `gate` skipped
- `pr` skipped

### screen

**15362 battles**, 0 failed, 3259 read back from an earlier run. Running 16.2 h, 748 battles/h. Last battle 0 min ago.
Skipped turns a battle: 56.3 overall, first 100 54.7, last 100 58.8; engine disables 5968.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| sg | 1393 | 0 | 78.37 | -13.95 (974 robots) | ±1.40 | -16.09 .. -11.81 | 48.6 |
| fp | 1399 | 0 | 92.75 | +0.19 (976 robots) | ±0.21 | -0.12 .. +0.50 | 56.1 |
| hj | 1396 | 0 | 92.79 | +0.24 (975 robots) | ±0.22 | -0.09 .. +0.57 | 56.7 |
| mm | 1399 | 0 | 92.46 | -0.09 (975 robots) | ±0.22 | -0.43 .. +0.25 | 57.8 |
| dg | 1397 | 0 | 92.55 | -0.04 (975 robots) | ±0.21 | -0.37 .. +0.28 | 54.6 |
| rd | 1396 | 0 | 92.57 | -0.01 (974 robots) | ±0.21 | -0.33 .. +0.31 | 55.7 |
| sw | 1396 | 0 | 78.71 | -13.63 (974 robots) | ±1.38 | -15.75 .. -11.51 | 50.1 |
| gs | 1396 | 0 | 92.50 | -0.04 (974 robots) | ±0.23 | -0.40 .. +0.32 | 56.7 |
| fl | 1395 | 0 | 92.63 | +0.04 (975 robots) | ±0.20 | -0.26 .. +0.34 | 56.3 |
| x5 | 1399 | 0 | 92.48 | -0.08 (976 robots) | ±0.22 | -0.42 .. +0.26 | 57.5 |
| c | 1396 | 0 | 92.55 | - | - | - | 56.8 |

APS = mean difference over the robots read x 1194 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 15362 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 90 over 200` | halt | ok | 57.7 a battle over the last 200 (first 200: 56.5) |
| `stall 30m` | halt | ok | last battle 0 min ago |

### Queue log (last lines)

```
16:43:41 progress screen: 10156 battles, 770/h, 0 failed, skips 59.6/battle (last 100), sg -13.89, fp +0.11, hj +0.31, mm -0.15, dg -0.03, rd +0.08, sw -13.84, gs +0.06, fl +0.05, x5 -0.03
17:13:54 progress screen: 10518 battles, 724/h, 0 failed, skips 54.7/battle (last 100), sg -13.97, fp +0.13, hj +0.32, mm -0.14, dg -0.00, rd +0.08, sw -13.75, gs +0.06, fl +0.03, x5 -0.02
17:44:16 progress screen: 10881 battles, 724/h, 0 failed, skips 54.1/battle (last 100), sg -13.90, fp +0.10, hj +0.32, mm -0.17, dg -0.02, rd +0.07, sw -13.72, gs +0.03, fl +0.01, x5 -0.03
18:14:19 progress screen: 11267 battles, 770/h, 0 failed, skips 68.8/battle (last 100), sg -14.01, fp +0.08, hj +0.29, mm -0.20, dg -0.03, rd +0.03, sw -13.73, gs -0.01, fl -0.02, x5 -0.06
18:44:39 progress screen: 11659 battles, 768/h, 0 failed, skips 54.4/battle (last 100), sg -13.74, fp +0.09, hj +0.28, mm -0.17, dg -0.01, rd +0.02, sw -13.40, gs +0.02, fl +0.01, x5 -0.02
19:14:52 progress screen: 12043 battles, 764/h, 0 failed, skips 67.2/battle (last 100), sg -13.90, fp +0.06, hj +0.24, mm -0.17, dg -0.03, rd +0.01, sw -13.58, gs +0.01, fl -0.01, x5 -0.05
19:45:06 progress screen: 12394 battles, 698/h, 0 failed, skips 54.0/battle (last 100), sg -13.79, fp +0.08, hj +0.25, mm -0.16, dg +0.01, rd +0.02, sw -13.52, gs -0.00, fl +0.01, x5 -0.06
20:15:23 progress screen: 12756 battles, 714/h, 0 failed, skips 53.0/battle (last 100), sg -13.83, fp +0.09, hj +0.22, mm -0.17, dg +0.03, rd +0.04, sw -13.53, gs +0.00, fl +0.02, x5 -0.05
20:45:41 progress screen: 13103 battles, 686/h, 0 failed, skips 58.1/battle (last 100), sg -13.80, fp +0.12, hj +0.24, mm -0.12, dg +0.03, rd +0.05, sw -13.55, gs -0.01, fl +0.04, x5 -0.03
21:15:58 progress screen: 13463 battles, 718/h, 0 failed, skips 57.6/battle (last 100), sg -13.84, fp +0.12, hj +0.23, mm -0.13, dg +0.01, rd +0.03, sw -13.55, gs -0.01, fl +0.04, x5 -0.06
21:46:17 progress screen: 13846 battles, 754/h, 0 failed, skips 54.8/battle (last 100), sg -13.85, fp +0.17, hj +0.24, mm -0.09, dg +0.04, rd +0.03, sw -13.53, gs -0.02, fl +0.05, x5 -0.02
22:16:34 progress screen: 14202 battles, 708/h, 0 failed, skips 57.7/battle (last 100), sg -13.87, fp +0.15, hj +0.23, mm -0.10, dg +0.00, rd +0.01, sw -13.58, gs -0.06, fl +0.04, x5 -0.07
22:46:57 progress screen: 14562 battles, 714/h, 0 failed, skips 60.1/battle (last 100), sg -14.02, fp +0.16, hj +0.23, mm -0.12, dg -0.03, rd -0.01, sw -13.69, gs -0.05, fl +0.05, x5 -0.08
23:17:10 progress screen: 14949 battles, 760/h, 0 failed, skips 51.0/battle (last 100), sg -14.06, fp +0.15, hj +0.23, mm -0.11, dg -0.05, rd -0.03, sw -13.76, gs -0.04, fl +0.03, x5 -0.09
23:47:30 progress screen: 15320 battles, 732/h, 0 failed, skips 53.8/battle (last 100), sg -13.98, fp +0.19, hj +0.25, mm -0.10, dg -0.04, rd -0.01, sw -13.64, gs -0.04, fl +0.05, x5 -0.08
```
