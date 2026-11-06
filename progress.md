# Queue pc-tailor-field: progress

Updated 2026-11-06 01:12:29 PC time (01:12 UTC), runner pid 60476.

- `prep` done, exit 0 in 8 min
- `pilot` done, exit 0 in 4 min
- `screen` running
- `pick` skipped
- `prep2` skipped
- `confirm` skipped
- `gate` skipped
- `pr` skipped

### screen

**2821 battles**, 0 failed, 491 read back from an earlier run. Running 3.0 h, 752 battles/h. Last battle 0 min ago.
Skipped turns a battle: 52.4 overall, first 100 58.8, last 100 43.3; engine disables 1094.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| sg | 258 | 0 | 75.81 | -15.38 (228 robots) | ±3.03 | -20.01 .. -10.74 | 42.8 |
| fp | 256 | 0 | 91.51 | +0.11 (227 robots) | ±0.56 | -0.74 .. +0.97 | 49.2 |
| hj | 258 | 0 | 91.62 | +0.20 (227 robots) | ±0.55 | -0.63 .. +1.04 | 49.6 |
| mm | 257 | 0 | 90.88 | -0.56 (227 robots) | ±0.55 | -1.41 .. +0.28 | 56.0 |
| dg | 254 | 0 | 91.30 | -0.09 (227 robots) | ±0.57 | -0.96 .. +0.78 | 49.6 |
| rd | 257 | 0 | 91.45 | +0.05 (227 robots) | ±0.55 | -0.79 .. +0.88 | 54.1 |
| sw | 256 | 0 | 76.73 | -14.49 (227 robots) | ±2.99 | -19.06 .. -9.92 | 43.7 |
| gs | 256 | 0 | 91.65 | -0.05 (226 robots) | ±0.56 | -0.91 .. +0.81 | 52.9 |
| fl | 257 | 0 | 91.25 | -0.16 (228 robots) | ±0.46 | -0.86 .. +0.54 | 53.2 |
| x5 | 257 | 0 | 91.26 | -0.15 (228 robots) | ±0.59 | -1.05 .. +0.75 | 52.7 |
| c | 255 | 0 | 91.36 | - | - | - | 50.1 |

APS = mean difference over the robots read x 1194 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 2821 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | ok | 50.0 a battle over the last 200 (first 200: 57.8) |
| `stall 30m` | halt | ok | last battle 0 min ago |

### Queue log (last lines)

```
21:40:35 watching screen: 4 stop rule(s)
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
```
