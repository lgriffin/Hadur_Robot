# Queue pc-tailor-field: progress

Updated 2026-11-06 14:27:34 PC time (14:27 UTC), runner pid 52376.

- `prep` done, exit 0 in 8 min
- `pilot` done, exit 0 in 4 min
- `screen` running
- `pick` skipped
- `prep2` skipped
- `confirm` skipped
- `gate` skipped
- `pr` skipped

### screen

**8487 battles**, 0 failed, 3259 read back from an earlier run. Running 6.8 h, 782 battles/h. Last battle 0 min ago.
Skipped turns a battle: 55.5 overall, first 100 54.7, last 100 59.6; engine disables 2579.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| sg | 774 | 0 | 78.29 | -13.81 (642 robots) | ±1.73 | -16.45 .. -11.17 | 47.5 |
| fp | 772 | 0 | 92.50 | +0.08 (642 robots) | ±0.31 | -0.39 .. +0.55 | 53.9 |
| hj | 771 | 0 | 92.64 | +0.20 (641 robots) | ±0.30 | -0.26 .. +0.65 | 54.0 |
| mm | 771 | 0 | 92.17 | -0.23 (642 robots) | ±0.32 | -0.73 .. +0.26 | 57.4 |
| dg | 770 | 0 | 92.33 | -0.08 (641 robots) | ±0.29 | -0.52 .. +0.36 | 54.6 |
| rd | 773 | 0 | 92.54 | +0.12 (642 robots) | ±0.28 | -0.31 .. +0.56 | 54.8 |
| sw | 771 | 0 | 78.36 | -13.79 (642 robots) | ±1.73 | -16.43 .. -11.14 | 47.8 |
| gs | 769 | 0 | 92.44 | +0.03 (641 robots) | ±0.31 | -0.44 .. +0.50 | 55.4 |
| fl | 773 | 0 | 92.43 | +0.02 (642 robots) | ±0.28 | -0.41 .. +0.45 | 54.0 |
| x5 | 772 | 0 | 92.34 | -0.06 (642 robots) | ±0.30 | -0.52 .. +0.40 | 57.0 |
| c | 771 | 0 | 92.42 | - | - | - | 54.8 |

APS = mean difference over the robots read x 1194 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 8487 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 90 over 200` | halt | ok | 59.8 a battle over the last 200 (first 200: 56.5) |
| `stall 30m` | halt | ok | last battle 0 min ago |

### Queue log (last lines)

```
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
13:12:00 progress screen: 7494 battles, 736/h, 0 failed, skips 47.2/battle (last 100), sg -14.01, fp +0.08, hj +0.23, mm -0.18, dg -0.08, rd +0.16, sw -13.49, gs +0.10, fl +0.01, x5 -0.04
13:42:14 progress screen: 7896 battles, 804/h, 0 failed, skips 56.9/battle (last 100), sg -13.97, fp +0.08, hj +0.22, mm -0.17, dg -0.09, rd +0.16, sw -13.68, gs +0.06, fl +0.00, x5 -0.01
14:12:26 progress screen: 8289 battles, 784/h, 0 failed, skips 54.9/battle (last 100), sg -13.80, fp +0.08, hj +0.21, mm -0.20, dg -0.09, rd +0.13, sw -13.65, gs +0.03, fl +0.01, x5 -0.05
```
