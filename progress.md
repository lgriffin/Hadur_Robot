# Queue pc-tailor-field: progress

Updated 2026-11-07 04:53:07 PC time (04:53 UTC), runner pid 52376.

- `prep` done, exit 0 in 8 min
- `pilot` done, exit 0 in 4 min
- `screen` running
- `pick` skipped
- `prep2` skipped
- `confirm` skipped
- `gate` skipped
- `pr` skipped

### screen

**19129 battles**, 0 failed, 3259 read back from an earlier run. Running 21.3 h, 744 battles/h. Last battle 0 min ago.
Skipped turns a battle: 56.2 overall, first 100 54.7, last 100 58.7; engine disables 7765.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| sg | 1736 | 0 | 78.55 | -13.79 (1098 robots) | ±1.29 | -15.77 .. -11.81 | 49.2 |
| fp | 1740 | 0 | 92.74 | +0.12 (1098 robots) | ±0.17 | -0.14 .. +0.39 | 56.7 |
| hj | 1737 | 0 | 92.83 | +0.21 (1097 robots) | ±0.19 | -0.08 .. +0.50 | 57.2 |
| mm | 1738 | 0 | 92.50 | -0.11 (1097 robots) | ±0.21 | -0.43 .. +0.20 | 58.1 |
| dg | 1742 | 0 | 92.56 | -0.05 (1098 robots) | ±0.18 | -0.33 .. +0.22 | 54.1 |
| rd | 1741 | 0 | 92.60 | -0.02 (1097 robots) | ±0.18 | -0.29 .. +0.26 | 56.4 |
| sw | 1740 | 0 | 78.90 | -13.46 (1097 robots) | ±1.30 | -15.45 .. -11.48 | 50.1 |
| gs | 1741 | 0 | 92.52 | -0.09 (1097 robots) | ±0.20 | -0.41 .. +0.22 | 56.8 |
| fl | 1738 | 0 | 92.56 | -0.06 (1097 robots) | ±0.18 | -0.33 .. +0.22 | 56.0 |
| x5 | 1737 | 0 | 92.46 | -0.16 (1097 robots) | ±0.19 | -0.46 .. +0.14 | 57.1 |
| c | 1739 | 0 | 92.61 | - | - | - | 56.9 |

APS = mean difference over the robots read x 1194 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 19129 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 90 over 200` | halt | ok | 56.7 a battle over the last 200 (first 200: 56.5) |
| `stall 30m` | halt | ok | last battle 0 min ago |

### Queue log (last lines)

```
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
02:49:08 progress screen: 17549 battles, 712/h, 0 failed, skips 58.0/battle (last 100), sg -13.93, fp +0.12, hj +0.21, mm -0.13, dg -0.03, rd -0.04, sw -13.63, gs -0.08, fl -0.03, x5 -0.12
03:19:20 progress screen: 17930 battles, 748/h, 0 failed, skips 60.1/battle (last 100), sg -13.82, fp +0.13, hj +0.23, mm -0.12, dg -0.04, rd -0.02, sw -13.64, gs -0.10, fl -0.04, x5 -0.14
03:49:32 progress screen: 18307 battles, 748/h, 0 failed, skips 63.6/battle (last 100), sg -13.78, fp +0.13, hj +0.24, mm -0.12, dg -0.04, rd -0.01, sw -13.58, gs -0.08, fl -0.04, x5 -0.13
04:19:47 progress screen: 18721 battles, 808/h, 0 failed, skips 57.8/battle (last 100), sg -13.69, fp +0.12, hj +0.21, mm -0.13, dg -0.05, rd -0.02, sw -13.46, gs -0.10, fl -0.07, x5 -0.15
04:49:58 progress screen: 19092 battles, 742/h, 0 failed, skips 62.7/battle (last 100), sg -13.75, fp +0.13, hj +0.20, mm -0.12, dg -0.06, rd -0.02, sw -13.47, gs -0.10, fl -0.06, x5 -0.16
```
