# Queue pc-tailor-field: progress

Updated 2026-11-06 01:43:01 PC time (01:43 UTC), runner pid 60476.

- `prep` done, exit 0 in 8 min
- `pilot` done, exit 0 in 4 min
- `screen` running
- `pick` skipped
- `prep2` skipped
- `confirm` skipped
- `gate` skipped
- `pr` skipped

### screen

**3223 battles**, 0 failed, 491 read back from an earlier run. Running 3.5 h, 794 battles/h. Last battle -0 min ago.
Skipped turns a battle: 52.6 overall, first 100 58.8, last 100 65.3; engine disables 1299.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| sg | 292 | 0 | 77.03 | -14.52 (262 robots) | ±2.74 | -18.70 .. -10.33 | 44.6 |
| fp | 291 | 0 | 91.75 | +0.05 (262 robots) | ±0.51 | -0.72 .. +0.83 | 47.8 |
| hj | 294 | 0 | 91.80 | +0.12 (264 robots) | ±0.49 | -0.63 .. +0.87 | 50.4 |
| mm | 292 | 0 | 91.22 | -0.52 (261 robots) | ±0.49 | -1.27 .. +0.23 | 56.5 |
| dg | 295 | 0 | 91.51 | -0.13 (263 robots) | ±0.50 | -0.89 .. +0.64 | 50.0 |
| rd | 292 | 0 | 91.83 | +0.03 (263 robots) | ±0.49 | -0.72 .. +0.79 | 53.9 |
| sw | 294 | 0 | 77.47 | -14.17 (263 robots) | ±2.73 | -18.35 .. -9.98 | 43.9 |
| gs | 292 | 0 | 91.51 | -0.11 (262 robots) | ±0.51 | -0.90 .. +0.67 | 53.9 |
| fl | 293 | 0 | 91.57 | -0.12 (261 robots) | ±0.42 | -0.76 .. +0.52 | 52.8 |
| x5 | 295 | 0 | 91.45 | -0.25 (263 robots) | ±0.53 | -1.06 .. +0.57 | 52.9 |
| c | 293 | 0 | 91.72 | - | - | - | 51.6 |

APS = mean difference over the robots read x 1194 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 3223 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | ok | 58.1 a battle over the last 200 (first 200: 57.8) |
| `stall 30m` | halt | ok | last battle -0 min ago |

### Queue log (last lines)

```
21:56:18 screen exit=130 in 943 s (stopped)
21:56:18 stopped; rerun to resume from the interrupted steps
22:10:47 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant calibrated; work D:\code\Hadur_Robot\hadur-bench\work
22:10:47 skip prep (already exit=0)
22:10:47 skip pilot (already exit=0)
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
```
