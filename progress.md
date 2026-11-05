# Queue pc-tailor-field: progress

Updated 2026-11-05 23:26:28 PC time (23:26 UTC), runner pid 60476.

- `prep` done, exit 0 in 8 min
- `pilot` done, exit 0 in 4 min
- `screen` running
- `pick` skipped
- `prep2` skipped
- `confirm` skipped
- `gate` skipped
- `pr` skipped

### screen

**1461 battles**, 0 failed, 491 read back from an earlier run. Running 1.3 h, 682 battles/h. Last battle 0 min ago.
Skipped turns a battle: 52.4 overall, first 100 58.8, last 100 50.1; engine disables 451.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| sg | 133 | 0 | 76.28 | -14.23 (115 robots) | ±4.09 | -20.49 .. -7.97 | 40.9 |
| fp | 133 | 0 | 92.03 | +0.43 (116 robots) | ±0.77 | -0.75 .. +1.61 | 50.1 |
| hj | 135 | 0 | 91.71 | -0.01 (116 robots) | ±0.80 | -1.24 .. +1.22 | 43.4 |
| mm | 134 | 0 | 91.25 | -0.48 (116 robots) | ±0.71 | -1.57 .. +0.61 | 58.5 |
| dg | 133 | 0 | 91.69 | +0.04 (116 robots) | ±0.91 | -1.36 .. +1.44 | 47.8 |
| rd | 132 | 0 | 91.72 | +0.12 (116 robots) | ±0.78 | -1.08 .. +1.31 | 48.4 |
| sw | 132 | 0 | 78.19 | -13.26 (116 robots) | ±4.16 | -19.63 .. -6.90 | 39.9 |
| gs | 131 | 0 | 91.69 | +0.07 (116 robots) | ±0.69 | -0.98 .. +1.12 | 51.6 |
| fl | 133 | 0 | 91.54 | -0.12 (116 robots) | ±0.58 | -1.00 .. +0.76 | 51.6 |
| x5 | 134 | 0 | 91.65 | -0.09 (116 robots) | ±0.89 | -1.45 .. +1.28 | 51.7 |
| c | 131 | 0 | 91.62 | - | - | - | 48.7 |

APS = mean difference over the robots read x 1194 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 1461 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | ok | 47.5 a battle over the last 200 (first 200: 57.8) |
| `stall 30m` | halt | ok | last battle 0 min ago |

### Queue log (last lines)

```
21:36:50 progress pilot: 22/286 (8%) battles, 3274/h, ETA 5 min, 0 failed, skips 43.8/battle (last 100)
21:40:35 pilot exit=0 in 248 s
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
```
