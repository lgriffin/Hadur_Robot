# Queue pc-tailor-field: progress

Updated 2026-11-06 12:56:52 PC time (12:56 UTC), runner pid 52376.

- `prep` done, exit 0 in 8 min
- `pilot` done, exit 0 in 4 min
- `screen` running
- `pick` skipped
- `prep2` skipped
- `confirm` skipped
- `gate` skipped
- `pr` skipped

### screen

**7311 battles**, 0 failed, 3259 read back from an earlier run. Running 5.3 h, 756 battles/h. Last battle 0 min ago.
Skipped turns a battle: 55.1 overall, first 100 54.7, last 100 50.7; engine disables 1979.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| sg | 666 | 0 | 78.03 | -13.94 (571 robots) | ±1.84 | -16.76 .. -11.13 | 46.8 |
| fp | 663 | 0 | 92.32 | +0.06 (569 robots) | ±0.34 | -0.46 .. +0.58 | 53.1 |
| hj | 664 | 0 | 92.49 | +0.23 (567 robots) | ±0.33 | -0.27 .. +0.73 | 55.1 |
| mm | 664 | 0 | 92.06 | -0.19 (568 robots) | ±0.36 | -0.74 .. +0.36 | 56.1 |
| dg | 666 | 0 | 92.12 | -0.11 (570 robots) | ±0.32 | -0.61 .. +0.39 | 53.9 |
| rd | 666 | 0 | 92.38 | +0.13 (570 robots) | ±0.31 | -0.34 .. +0.61 | 54.7 |
| sw | 662 | 0 | 78.53 | -13.45 (569 robots) | ±1.82 | -16.24 .. -10.66 | 48.1 |
| gs | 665 | 0 | 92.35 | +0.08 (568 robots) | ±0.34 | -0.43 .. +0.60 | 54.8 |
| fl | 663 | 0 | 92.20 | -0.01 (569 robots) | ±0.31 | -0.48 .. +0.46 | 53.5 |
| x5 | 667 | 0 | 92.18 | -0.03 (571 robots) | ±0.33 | -0.54 .. +0.47 | 56.5 |
| c | 665 | 0 | 92.21 | - | - | - | 53.1 |

APS = mean difference over the robots read x 1194 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 7311 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 90 over 200` | halt | ok | 56.1 a battle over the last 200 (first 200: 56.5) |
| `stall 30m` | halt | ok | last battle 0 min ago |

### Queue log (last lines)

```
07:37:53 skip pilot (already exit=0)
07:37:53 start screen
07:37:53 watching screen: 4 stop rule(s)
07:37:56 progress pushed to origin claude/pc-tailor-field-progress (every 15 min)
07:39:04 progress screen: 3259 battles, 0 failed, sg -14.55, fp +0.05, hj +0.11, mm -0.49, dg -0.13, rd +0.02, sw -14.05, gs -0.12, fl -0.09, x5 -0.25
08:09:14 progress screen: 3684 battles, 850/h, 0 failed, skips 62.5/battle (last 100), sg -14.74, fp +0.06, hj +0.12, mm -0.38, dg -0.10, rd +0.10, sw -13.92, gs -0.12, fl -0.08, x5 -0.23
08:39:33 progress screen: 4086 battles, 802/h, 0 failed, skips 61.4/battle (last 100), sg -14.71, fp +0.00, hj +0.10, mm -0.40, dg -0.21, rd +0.10, sw -13.48, gs -0.08, fl -0.11, x5 -0.20
09:09:52 progress screen: 4448 battles, 718/h, 0 failed, skips 59.0/battle (last 100), sg -14.47, fp +0.00, hj +0.05, mm -0.43, dg -0.14, rd +0.11, sw -13.79, gs -0.04, fl -0.13, x5 -0.23
09:40:13 progress screen: 4814 battles, 722/h, 0 failed, skips 52.5/battle (last 100), sg -14.38, fp -0.06, hj +0.06, mm -0.42, dg -0.11, rd +0.06, sw -13.59, gs -0.02, fl -0.14, x5 -0.21
10:10:35 progress screen: 5222 battles, 804/h, 0 failed, skips 49.9/battle (last 100), sg -14.32, fp -0.04, hj +0.11, mm -0.44, dg -0.07, rd +0.05, sw -13.79, gs -0.06, fl -0.11, x5 -0.16
10:40:56 progress screen: 5620 battles, 788/h, 0 failed, skips 55.4/battle (last 100), sg -14.36, fp -0.02, hj +0.14, mm -0.38, dg -0.12, rd +0.08, sw -13.91, gs -0.03, fl -0.07, x5 -0.11
11:11:09 progress screen: 5977 battles, 714/h, 0 failed, skips 39.2/battle (last 100), sg -14.08, fp +0.10, hj +0.24, mm -0.26, dg -0.07, rd +0.14, sw -13.82, gs +0.11, fl -0.06, x5 -0.03
11:41:18 progress screen: 6346 battles, 736/h, 0 failed, skips 43.6/battle (last 100), sg -14.08, fp +0.15, hj +0.28, mm -0.21, dg -0.10, rd +0.21, sw -13.63, gs +0.13, fl -0.04, x5 +0.03
12:11:31 progress screen: 6745 battles, 796/h, 0 failed, skips 58.4/battle (last 100), sg -14.13, fp +0.09, hj +0.24, mm -0.19, dg -0.11, rd +0.17, sw -13.65, gs +0.10, fl -0.03, x5 -0.03
12:41:45 progress screen: 7125 battles, 756/h, 0 failed, skips 58.0/battle (last 100), sg -13.98, fp +0.06, hj +0.24, mm -0.17, dg -0.14, rd +0.16, sw -13.53, gs +0.10, fl -0.02, x5 -0.05
```
