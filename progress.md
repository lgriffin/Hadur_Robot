# Queue pc-tailor-field: progress

Updated 2026-11-05 23:11:22 PC time (23:11 UTC), runner pid 60476.

- `prep` done, exit 0 in 8 min
- `pilot` done, exit 0 in 4 min
- `screen` running
- `pick` skipped
- `prep2` skipped
- `confirm` skipped
- `gate` skipped
- `pr` skipped

### screen

**1295 battles**, 0 failed, 491 read back from an earlier run. Running 1.0 h, 742 battles/h. Last battle 0 min ago.
Skipped turns a battle: 53.4 overall, first 100 58.8, last 100 42.8; engine disables 373.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| sg | 118 | 0 | 76.89 | -14.82 (102 robots) | ±4.35 | -21.48 .. -8.17 | 41.9 |
| fp | 118 | 0 | 92.05 | +0.09 (102 robots) | ±0.72 | -1.02 .. +1.20 | 50.6 |
| hj | 118 | 0 | 91.74 | -0.22 (102 robots) | ±0.81 | -1.47 .. +1.02 | 42.1 |
| mm | 118 | 0 | 91.01 | -0.68 (102 robots) | ±0.70 | -1.75 .. +0.39 | 60.3 |
| dg | 118 | 0 | 91.60 | -0.25 (103 robots) | ±0.93 | -1.68 .. +1.17 | 49.3 |
| rd | 117 | 0 | 91.76 | -0.23 (101 robots) | ±0.74 | -1.36 .. +0.90 | 47.2 |
| sw | 119 | 0 | 77.91 | -14.01 (103 robots) | ±4.42 | -20.77 .. -7.24 | 40.1 |
| gs | 117 | 0 | 91.81 | -0.11 (101 robots) | ±0.70 | -1.17 .. +0.96 | 51.5 |
| fl | 116 | 0 | 91.67 | -0.07 (100 robots) | ±0.61 | -1.01 .. +0.86 | 50.5 |
| x5 | 117 | 0 | 91.57 | -0.17 (101 robots) | ±0.96 | -1.64 .. +1.30 | 51.5 |
| c | 119 | 0 | 91.83 | - | - | - | 48.9 |

APS = mean difference over the robots read x 1194 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 1295 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | ok | 44.8 a battle over the last 200 (first 200: 57.8) |
| `stall 30m` | halt | ok | last battle 0 min ago |

### Queue log (last lines)

```
21:36:26 watching pilot: 4 stop rule(s)
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
```
