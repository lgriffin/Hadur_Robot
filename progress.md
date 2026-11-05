# Queue pc-tailor-field: progress

Updated 2026-11-05 22:56:12 PC time (22:56 UTC), runner pid 60476.

- `prep` done, exit 0 in 8 min
- `pilot` done, exit 0 in 4 min
- `screen` running
- `pick` skipped
- `prep2` skipped
- `confirm` skipped
- `gate` skipped
- `pr` skipped

### screen

**1119 battles**, 0 failed, 491 read back from an earlier run. Running 45 min, 828 battles/h. Last battle 0 min ago.
Skipped turns a battle: 56.0 overall, first 100 58.8, last 100 51.7; engine disables 311.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| sg | 102 | 0 | 74.43 | -16.77 (85 robots) | ±4.89 | -24.25 .. -9.29 | 42.0 |
| fp | 102 | 0 | 91.59 | +0.06 (84 robots) | ±0.86 | -1.25 .. +1.37 | 52.1 |
| hj | 99 | 0 | 90.93 | -0.62 (85 robots) | ±0.83 | -1.90 .. +0.65 | 44.1 |
| mm | 104 | 0 | 90.60 | -0.75 (84 robots) | ±0.82 | -2.00 .. +0.50 | 58.2 |
| dg | 99 | 0 | 90.79 | -0.07 (83 robots) | ±1.09 | -1.74 .. +1.60 | 49.9 |
| rd | 101 | 0 | 91.12 | -0.34 (85 robots) | ±0.83 | -1.61 .. +0.92 | 47.7 |
| sw | 101 | 0 | 75.91 | -15.94 (85 robots) | ±5.10 | -23.75 .. -8.13 | 39.6 |
| gs | 104 | 0 | 91.34 | -0.20 (85 robots) | ±0.78 | -1.39 .. +0.99 | 51.7 |
| fl | 102 | 0 | 91.70 | -0.14 (86 robots) | ±0.60 | -1.07 .. +0.78 | 53.5 |
| x5 | 104 | 0 | 91.31 | -0.28 (86 robots) | ±1.10 | -1.96 .. +1.41 | 53.0 |
| c | 101 | 0 | 91.76 | - | - | - | 49.4 |

APS = mean difference over the robots read x 1194 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 1119 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | ok | 54.8 a battle over the last 200 (first 200: 57.8) |
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
