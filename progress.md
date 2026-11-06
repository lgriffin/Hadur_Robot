# Queue pc-tailor-field: progress

Updated 2026-11-06 01:45:55 PC time (01:45 UTC), runner pid 60476.

- `prep` done, exit 0 in 8 min
- `pilot` done, exit 0 in 4 min
- `screen` halted, exit 75 in 3.6 h, HALTED by skips 60 over 200: 60.0 a battle over the last 200 (first 200: 57.8)
- `pick` skipped
- `prep2` skipped
- `confirm` skipped
- `gate` skipped
- `pr` skipped

### screen

**3259 battles**, 0 failed, 491 read back from an earlier run. Running 3.6 h, 794 battles/h. Last battle 0 min ago.
Skipped turns a battle: 52.8 overall, first 100 58.8, last 100 65.2; engine disables 1322.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| sg | 295 | 0 | 76.89 | -14.55 (266 robots) | ±2.72 | -18.72 .. -10.38 | 44.3 |
| fp | 297 | 0 | 91.76 | +0.05 (265 robots) | ±0.50 | -0.72 .. +0.81 | 47.8 |
| hj | 296 | 0 | 91.80 | +0.11 (266 robots) | ±0.49 | -0.63 .. +0.86 | 50.5 |
| mm | 295 | 0 | 91.21 | -0.49 (265 robots) | ±0.49 | -1.24 .. +0.25 | 56.5 |
| dg | 298 | 0 | 91.55 | -0.13 (267 robots) | ±0.50 | -0.89 .. +0.62 | 50.5 |
| rd | 296 | 0 | 91.76 | +0.02 (267 robots) | ±0.49 | -0.74 .. +0.77 | 54.5 |
| sw | 297 | 0 | 77.42 | -14.05 (265 robots) | ±2.72 | -18.21 .. -9.90 | 44.3 |
| gs | 297 | 0 | 91.56 | -0.12 (267 robots) | ±0.51 | -0.89 .. +0.66 | 53.7 |
| fl | 297 | 0 | 91.55 | -0.09 (266 robots) | ±0.41 | -0.73 .. +0.54 | 53.2 |
| x5 | 295 | 0 | 91.45 | -0.25 (266 robots) | ±0.53 | -1.06 .. +0.55 | 52.9 |
| c | 296 | 0 | 91.69 | - | - | - | 52.0 |

APS = mean difference over the robots read x 1194 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 3259 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | TRIPPED | 60.0 a battle over the last 200 (first 200: 57.8) |
| `stall 30m` | halt | ok | last battle 0 min ago |

### Queue log (last lines)

```
22:10:47 start screen
22:10:47 watching screen: 4 stop rule(s)
22:10:49 progress pushed to origin claude/pc-tailor-field-progress (every 15 min)
22:11:47 progress screen: 491 battles, 0 failed, sg -16.34, fp -0.47, hj -0.44, mm -0.98, dg +0.36, rd -0.68, sw -20.46, gs -0.00, fl -0.32, x5 +0.57
22:42:03 progress screen: 936 battles, 868/h, 0 failed, skips 54.6/battle (last 100), sg -15.62, fp -0.04, hj -0.55, mm -0.80, dg -0.24, rd -0.63, sw -15.48, gs -0.19, fl -0.25, x5 -0.09
23:12:20 progress screen: 1304 battles, 736/h, 0 failed, skips 45.8/battle (last 100), sg -14.72, fp +0.26, hj -0.22, mm -0.67, dg -0.15, rd -0.23, sw -14.01, gs -0.11, fl -0.14, x5 -0.23
23:42:37 progress screen: 1650 battles, 684/h, 0 failed, skips 46.5/battle (last 100), sg -14.38, fp +0.45, hj +0.19, mm -0.40, dg -0.02, rd +0.14, sw -14.26, gs +0.14, fl -0.08, x5 -0.04
00:13:04 progress screen: 2067 battles, 826/h, 0 failed, skips 56.7/battle (last 100), sg -14.66, fp +0.46, hj +0.28, mm -0.42, dg -0.05, rd +0.06, sw -13.98, gs -0.08, fl +0.01, x5 +0.04
00:43:12 progress screen: 2459 battles, 784/h, 0 failed, skips 47.3/battle (last 100), sg -14.27, fp +0.14, hj +0.17, mm -0.51, dg -0.05, rd +0.00, sw -13.92, gs -0.31, fl -0.07, x5 -0.06
01:13:34 progress screen: 2834 battles, 732/h, 0 failed, skips 41.9/battle (last 100), sg -15.38, fp +0.11, hj +0.20, mm -0.57, dg -0.09, rd +0.05, sw -14.49, gs -0.06, fl -0.16, x5 -0.15
01:43:52 progress screen: 3234 battles, 792/h, 0 failed, skips 65.3/battle (last 100), sg -14.52, fp +0.05, hj +0.12, mm -0.52, dg -0.12, rd +0.03, sw -14.17, gs -0.12, fl -0.09, x5 -0.25
01:45:53 STOP screen by rule skips 60 over 200: 60.0 a battle over the last 200 (first 200: 57.8); 3259 battles fought and kept, the rest of the step unrun
01:45:53 screen exit=75 in 12906 s (halted, skips 60 over 200)
01:45:55 alert issue: https://github.com/lgriffin/Hadur_Robot/issues/678
01:45:55 queue halted by a stop rule; fix the cause and rerun to resume (every fought battle is kept)
```
