# Queue pc-tailor-field: progress

Updated 2026-11-07 07:56:24 PC time (07:56 UTC), runner pid 52376.

- `prep` done, exit 0 in 8 min
- `pilot` done, exit 0 in 4 min
- `screen` running
- `pick` skipped
- `prep2` skipped
- `confirm` skipped
- `gate` skipped
- `pr` skipped

### screen

**21430 battles**, 0 failed, 3259 read back from an earlier run. Running 24.3 h, 762 battles/h. Last battle 0 min ago.
Skipped turns a battle: 56.1 overall, first 100 54.7, last 100 50.0; engine disables 8878.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| sg | 1950 | 0 | 78.72 | -13.65 (1158 robots) | ±1.25 | -15.57 .. -11.73 | 49.5 |
| fp | 1949 | 0 | 92.77 | +0.13 (1158 robots) | ±0.17 | -0.13 .. +0.40 | 56.6 |
| hj | 1947 | 0 | 92.86 | +0.22 (1158 robots) | ±0.18 | -0.05 .. +0.49 | 56.7 |
| mm | 1948 | 0 | 92.49 | -0.14 (1158 robots) | ±0.20 | -0.45 .. +0.17 | 58.4 |
| dg | 1947 | 0 | 92.56 | -0.07 (1158 robots) | ±0.18 | -0.34 .. +0.20 | 54.1 |
| rd | 1947 | 0 | 92.65 | +0.01 (1158 robots) | ±0.17 | -0.26 .. +0.28 | 56.9 |
| sw | 1949 | 0 | 79.02 | -13.36 (1158 robots) | ±1.26 | -15.28 .. -11.44 | 50.1 |
| gs | 1947 | 0 | 92.55 | -0.08 (1158 robots) | ±0.19 | -0.38 .. +0.21 | 56.9 |
| fl | 1947 | 0 | 92.55 | -0.08 (1158 robots) | ±0.17 | -0.35 .. +0.18 | 55.8 |
| x5 | 1951 | 0 | 92.46 | -0.18 (1159 robots) | ±0.18 | -0.46 .. +0.10 | 56.9 |
| c | 1948 | 0 | 92.64 | - | - | - | 56.8 |

APS = mean difference over the robots read x 1194 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 21430 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 90 over 200` | halt | ok | 53.1 a battle over the last 200 (first 200: 56.5) |
| `stall 30m` | halt | ok | last battle 0 min ago |

### Queue log (last lines)

```
00:48:06 progress screen: 16074 battles, 730/h, 0 failed, skips 54.1/battle (last 100), sg -14.00, fp +0.17, hj +0.22, mm -0.12, dg -0.02, rd +0.01, sw -13.66, gs -0.12, fl +0.01, x5 -0.11
01:18:23 progress screen: 16446 battles, 734/h, 0 failed, skips 51.2/battle (last 100), sg -14.01, fp +0.14, hj +0.21, mm -0.15, dg -0.03, rd -0.04, sw -13.60, gs -0.10, fl -0.01, x5 -0.12
01:48:36 progress screen: 16800 battles, 706/h, 0 failed, skips 54.2/battle (last 100), sg -14.03, fp +0.16, hj +0.21, mm -0.16, dg -0.02, rd -0.02, sw -13.66, gs -0.09, fl +0.00, x5 -0.11
02:18:52 progress screen: 17186 battles, 766/h, 0 failed, skips 52.2/battle (last 100), sg -13.88, fp +0.14, hj +0.22, mm -0.14, dg -0.03, rd -0.03, sw -13.54, gs -0.06, fl -0.01, x5 -0.12
02:49:08 progress screen: 17549 battles, 712/h, 0 failed, skips 58.0/battle (last 100), sg -13.93, fp +0.12, hj +0.21, mm -0.13, dg -0.03, rd -0.04, sw -13.63, gs -0.08, fl -0.03, x5 -0.12
03:19:20 progress screen: 17930 battles, 748/h, 0 failed, skips 60.1/battle (last 100), sg -13.82, fp +0.13, hj +0.23, mm -0.12, dg -0.04, rd -0.02, sw -13.64, gs -0.10, fl -0.04, x5 -0.14
03:49:32 progress screen: 18307 battles, 748/h, 0 failed, skips 63.6/battle (last 100), sg -13.78, fp +0.13, hj +0.24, mm -0.12, dg -0.04, rd -0.01, sw -13.58, gs -0.08, fl -0.04, x5 -0.13
04:19:47 progress screen: 18721 battles, 808/h, 0 failed, skips 57.8/battle (last 100), sg -13.69, fp +0.12, hj +0.21, mm -0.13, dg -0.05, rd -0.02, sw -13.46, gs -0.10, fl -0.07, x5 -0.15
04:49:58 progress screen: 19092 battles, 742/h, 0 failed, skips 62.7/battle (last 100), sg -13.75, fp +0.13, hj +0.20, mm -0.12, dg -0.06, rd -0.02, sw -13.47, gs -0.10, fl -0.06, x5 -0.16
05:20:11 progress screen: 19459 battles, 730/h, 0 failed, skips 53.7/battle (last 100), sg -13.76, fp +0.13, hj +0.21, mm -0.15, dg -0.06, rd -0.02, sw -13.48, gs -0.09, fl -0.05, x5 -0.18
05:50:24 progress screen: 19824 battles, 722/h, 0 failed, skips 56.3/battle (last 100), sg -13.68, fp +0.16, hj +0.21, mm -0.12, dg -0.05, rd +0.01, sw -13.44, gs -0.07, fl -0.04, x5 -0.16
06:20:38 progress screen: 20211 battles, 770/h, 0 failed, skips 50.8/battle (last 100), sg -13.57, fp +0.17, hj +0.22, mm -0.11, dg -0.06, rd +0.04, sw -13.32, gs -0.06, fl -0.05, x5 -0.17
06:50:55 progress screen: 20597 battles, 766/h, 0 failed, skips 55.4/battle (last 100), sg -13.61, fp +0.16, hj +0.24, mm -0.12, dg -0.07, rd +0.04, sw -13.34, gs -0.06, fl -0.07, x5 -0.17
07:21:09 progress screen: 20988 battles, 778/h, 0 failed, skips 57.3/battle (last 100), sg -13.60, fp +0.15, hj +0.25, mm -0.13, dg -0.05, rd +0.03, sw -13.34, gs -0.07, fl -0.07, x5 -0.15
07:51:21 progress screen: 21369 battles, 758/h, 0 failed, skips 53.3/battle (last 100), sg -13.65, fp +0.13, hj +0.22, mm -0.13, dg -0.08, rd +0.02, sw -13.36, gs -0.08, fl -0.08, x5 -0.18
```
