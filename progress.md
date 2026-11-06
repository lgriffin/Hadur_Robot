# Queue pc-tailor-field: progress

Updated 2026-11-06 00:27:02 PC time (00:27 UTC), runner pid 60476.

- `prep` done, exit 0 in 8 min
- `pilot` done, exit 0 in 4 min
- `screen` running
- `pick` skipped
- `prep2` skipped
- `confirm` skipped
- `gate` skipped
- `pr` skipped

### screen

**2263 battles**, 0 failed, 491 read back from an earlier run. Running 2.3 h, 832 battles/h. Last battle 0 min ago.
Skipped turns a battle: 52.8 overall, first 100 58.8, last 100 60.5; engine disables 845.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| sg | 205 | 0 | 76.96 | -14.59 (184 robots) | ±3.29 | -19.63 .. -9.56 | 42.7 |
| fp | 206 | 0 | 91.87 | +0.45 (184 robots) | ±0.61 | -0.49 .. +1.39 | 49.9 |
| hj | 206 | 0 | 91.95 | +0.21 (184 robots) | ±0.61 | -0.73 .. +1.14 | 45.7 |
| mm | 208 | 0 | 91.09 | -0.41 (185 robots) | ±0.56 | -1.28 .. +0.45 | 59.2 |
| dg | 206 | 0 | 91.35 | -0.04 (184 robots) | ±0.64 | -1.02 .. +0.94 | 50.8 |
| rd | 205 | 0 | 91.49 | +0.10 (184 robots) | ±0.62 | -0.85 .. +1.04 | 52.2 |
| sw | 205 | 0 | 77.20 | -14.32 (183 robots) | ±3.39 | -19.52 .. -9.13 | 42.6 |
| gs | 204 | 0 | 91.35 | -0.03 (183 robots) | ±0.55 | -0.88 .. +0.82 | 51.3 |
| fl | 206 | 0 | 91.70 | +0.02 (184 robots) | ±0.50 | -0.75 .. +0.79 | 53.7 |
| x5 | 207 | 0 | 91.46 | +0.04 (185 robots) | ±0.68 | -1.00 .. +1.07 | 52.0 |
| c | 205 | 0 | 91.62 | - | - | - | 51.9 |

APS = mean difference over the robots read x 1194 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 2263 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | ok | 59.3 a battle over the last 200 (first 200: 57.8) |
| `stall 30m` | halt | ok | last battle 0 min ago |

### Queue log (last lines)

```
21:40:35 start screen
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
```
