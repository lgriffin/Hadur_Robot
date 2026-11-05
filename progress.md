# Queue pc-tailor-field: progress

Updated 2026-11-05 23:41:37 PC time (23:41 UTC), runner pid 60476.

- `prep` done, exit 0 in 8 min
- `pilot` done, exit 0 in 4 min
- `screen` running
- `pick` skipped
- `prep2` skipped
- `confirm` skipped
- `gate` skipped
- `pr` skipped

### screen

**1639 battles**, 0 failed, 491 read back from an earlier run. Running 1.5 h, 686 battles/h. Last battle 0 min ago.
Skipped turns a battle: 52.3 overall, first 100 58.8, last 100 48.3; engine disables 530.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| sg | 149 | 0 | 77.25 | -14.38 (130 robots) | ±3.96 | -20.44 .. -8.32 | 41.7 |
| fp | 150 | 0 | 92.36 | +0.44 (131 robots) | ±0.72 | -0.66 .. +1.55 | 47.7 |
| hj | 150 | 0 | 92.16 | +0.19 (131 robots) | ±0.76 | -0.98 .. +1.35 | 44.3 |
| mm | 150 | 0 | 91.54 | -0.40 (131 robots) | ±0.70 | -1.47 .. +0.67 | 57.7 |
| dg | 150 | 0 | 92.01 | -0.03 (129 robots) | ±0.84 | -1.33 .. +1.26 | 46.8 |
| rd | 150 | 0 | 92.06 | +0.13 (132 robots) | ±0.75 | -1.02 .. +1.29 | 51.1 |
| sw | 149 | 0 | 77.76 | -14.27 (130 robots) | ±4.06 | -20.48 .. -8.06 | 42.5 |
| gs | 147 | 0 | 92.07 | +0.14 (129 robots) | ±0.69 | -0.92 .. +1.20 | 50.3 |
| fl | 148 | 0 | 91.77 | -0.08 (131 robots) | ±0.55 | -0.92 .. +0.77 | 52.2 |
| x5 | 148 | 0 | 91.82 | -0.05 (131 robots) | ±0.84 | -1.34 .. +1.24 | 53.8 |
| c | 148 | 0 | 91.77 | - | - | - | 48.8 |

APS = mean difference over the robots read x 1194 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 1639 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | ok | 51.6 a battle over the last 200 (first 200: 57.8) |
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
