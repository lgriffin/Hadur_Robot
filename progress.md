# Queue pc-tailor-field: progress

Updated 2026-11-06 13:12:00 PC time (13:12 UTC), runner pid 52376.

- `prep` done, exit 0 in 8 min
- `pilot` done, exit 0 in 4 min
- `screen` running
- `pick` skipped
- `prep2` skipped
- `confirm` skipped
- `gate` skipped
- `pr` skipped

### screen

**7494 battles**, 0 failed, 3259 read back from an earlier run. Running 5.6 h, 736 battles/h. Last battle 0 min ago.
Skipped turns a battle: 54.9 overall, first 100 54.7, last 100 47.2; engine disables 2061.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| sg | 683 | 0 | 78.02 | -14.01 (582 robots) | ±1.82 | -16.79 .. -11.22 | 47.0 |
| fp | 680 | 0 | 92.34 | +0.08 (581 robots) | ±0.33 | -0.43 .. +0.59 | 53.1 |
| hj | 682 | 0 | 92.46 | +0.23 (581 robots) | ±0.32 | -0.26 .. +0.72 | 54.8 |
| mm | 679 | 0 | 92.03 | -0.18 (581 robots) | ±0.35 | -0.72 .. +0.36 | 56.0 |
| dg | 682 | 0 | 92.19 | -0.08 (581 robots) | ±0.32 | -0.57 .. +0.40 | 54.3 |
| rd | 679 | 0 | 92.43 | +0.16 (581 robots) | ±0.30 | -0.31 .. +0.62 | 54.6 |
| sw | 681 | 0 | 78.53 | -13.49 (582 robots) | ±1.80 | -16.25 .. -10.74 | 48.3 |
| gs | 684 | 0 | 92.32 | +0.10 (581 robots) | ±0.33 | -0.41 .. +0.61 | 54.7 |
| fl | 682 | 0 | 92.23 | +0.01 (581 robots) | ±0.30 | -0.46 .. +0.47 | 53.1 |
| x5 | 681 | 0 | 92.24 | -0.04 (580 robots) | ±0.32 | -0.53 .. +0.46 | 56.6 |
| c | 681 | 0 | 92.21 | - | - | - | 52.7 |

APS = mean difference over the robots read x 1194 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 7494 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 90 over 200` | halt | ok | 51.0 a battle over the last 200 (first 200: 56.5) |
| `stall 30m` | halt | ok | last battle 0 min ago |

### Queue log (last lines)

```
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
13:12:00 progress screen: 7494 battles, 736/h, 0 failed, skips 47.2/battle (last 100), sg -14.01, fp +0.08, hj +0.23, mm -0.18, dg -0.08, rd +0.16, sw -13.49, gs +0.10, fl +0.01, x5 -0.04
```
