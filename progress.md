# Queue pc-tailor-field: progress

Updated 2026-11-07 02:21:56 PC time (02:21 UTC), runner pid 52376.

- `prep` done, exit 0 in 8 min
- `pilot` done, exit 0 in 4 min
- `screen` running
- `pick` skipped
- `prep2` skipped
- `confirm` skipped
- `gate` skipped
- `pr` skipped

### screen

**17223 battles**, 0 failed, 3259 read back from an earlier run. Running 18.7 h, 758 battles/h. Last battle 0 min ago.
Skipped turns a battle: 56.1 overall, first 100 54.7, last 100 46.9; engine disables 6850.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| sg | 1566 | 0 | 78.48 | -13.87 (1037 robots) | ±1.34 | -15.92 .. -11.83 | 48.4 |
| fp | 1567 | 0 | 92.75 | +0.14 (1037 robots) | ±0.18 | -0.14 .. +0.42 | 56.4 |
| hj | 1564 | 0 | 92.84 | +0.22 (1036 robots) | ±0.20 | -0.09 .. +0.53 | 56.9 |
| mm | 1563 | 0 | 92.46 | -0.15 (1036 robots) | ±0.21 | -0.47 .. +0.17 | 57.9 |
| dg | 1565 | 0 | 92.59 | -0.02 (1036 robots) | ±0.20 | -0.32 .. +0.28 | 53.9 |
| rd | 1565 | 0 | 92.59 | -0.03 (1036 robots) | ±0.19 | -0.32 .. +0.27 | 56.1 |
| sw | 1567 | 0 | 78.79 | -13.57 (1036 robots) | ±1.34 | -15.61 .. -11.52 | 50.4 |
| gs | 1566 | 0 | 92.55 | -0.07 (1036 robots) | ±0.21 | -0.39 .. +0.26 | 57.0 |
| fl | 1566 | 0 | 92.61 | -0.01 (1036 robots) | ±0.19 | -0.29 .. +0.28 | 56.0 |
| x5 | 1568 | 0 | 92.48 | -0.12 (1036 robots) | ±0.21 | -0.43 .. +0.20 | 56.9 |
| c | 1566 | 0 | 92.62 | - | - | - | 56.7 |

APS = mean difference over the robots read x 1194 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 17223 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 90 over 200` | halt | ok | 48.9 a battle over the last 200 (first 200: 56.5) |
| `stall 30m` | halt | ok | last battle 0 min ago |

### Queue log (last lines)

```
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
00:17:49 progress screen: 15702 battles, 750/h, 0 failed, skips 63.0/battle (last 100), sg -13.96, fp +0.16, hj +0.22, mm -0.11, dg -0.02, rd -0.01, sw -13.66, gs -0.07, fl +0.02, x5 -0.11
00:48:06 progress screen: 16074 battles, 730/h, 0 failed, skips 54.1/battle (last 100), sg -14.00, fp +0.17, hj +0.22, mm -0.12, dg -0.02, rd +0.01, sw -13.66, gs -0.12, fl +0.01, x5 -0.11
01:18:23 progress screen: 16446 battles, 734/h, 0 failed, skips 51.2/battle (last 100), sg -14.01, fp +0.14, hj +0.21, mm -0.15, dg -0.03, rd -0.04, sw -13.60, gs -0.10, fl -0.01, x5 -0.12
01:48:36 progress screen: 16800 battles, 706/h, 0 failed, skips 54.2/battle (last 100), sg -14.03, fp +0.16, hj +0.21, mm -0.16, dg -0.02, rd -0.02, sw -13.66, gs -0.09, fl +0.00, x5 -0.11
02:18:52 progress screen: 17186 battles, 766/h, 0 failed, skips 52.2/battle (last 100), sg -13.88, fp +0.14, hj +0.22, mm -0.14, dg -0.03, rd -0.03, sw -13.54, gs -0.06, fl -0.01, x5 -0.12
```
