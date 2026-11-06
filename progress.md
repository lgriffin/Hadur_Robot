# Queue pc-tailor-field: progress

Updated 2026-11-06 01:27:38 PC time (01:27 UTC), runner pid 60476.

- `prep` done, exit 0 in 8 min
- `pilot` done, exit 0 in 4 min
- `screen` running
- `pick` skipped
- `prep2` skipped
- `confirm` skipped
- `gate` skipped
- `pr` skipped

### screen

**3017 battles**, 0 failed, 491 read back from an earlier run. Running 3.3 h, 756 battles/h. Last battle 0 min ago.
Skipped turns a battle: 52.2 overall, first 100 58.8, last 100 47.9; engine disables 1188.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| sg | 272 | 0 | 76.43 | -14.99 (242 robots) | ±2.88 | -19.39 .. -10.59 | 43.2 |
| fp | 276 | 0 | 91.82 | +0.11 (245 robots) | ±0.52 | -0.69 .. +0.91 | 48.4 |
| hj | 274 | 0 | 91.81 | +0.13 (245 robots) | ±0.52 | -0.67 .. +0.93 | 49.3 |
| mm | 275 | 0 | 91.13 | -0.59 (246 robots) | ±0.51 | -1.37 .. +0.20 | 55.8 |
| dg | 273 | 0 | 91.65 | -0.03 (244 robots) | ±0.53 | -0.85 .. +0.79 | 49.1 |
| rd | 273 | 0 | 91.74 | +0.00 (244 robots) | ±0.53 | -0.80 .. +0.81 | 53.2 |
| sw | 274 | 0 | 77.48 | -14.00 (244 robots) | ±2.83 | -18.32 .. -9.67 | 43.9 |
| gs | 275 | 0 | 91.55 | -0.14 (245 robots) | ±0.54 | -0.97 .. +0.69 | 53.6 |
| fl | 275 | 0 | 91.55 | -0.14 (244 robots) | ±0.44 | -0.81 .. +0.54 | 53.4 |
| x5 | 275 | 0 | 91.51 | -0.19 (244 robots) | ±0.55 | -1.04 .. +0.65 | 53.2 |
| c | 275 | 0 | 91.72 | - | - | - | 50.2 |

APS = mean difference over the robots read x 1194 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 3017 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | ok | 49.0 a battle over the last 200 (first 200: 57.8) |
| `stall 30m` | halt | ok | last battle 0 min ago |

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
