# Queue pc-tailor-field: progress

Updated 2026-11-05 23:56:46 PC time (23:56 UTC), runner pid 60476.

- `prep` done, exit 0 in 8 min
- `pilot` done, exit 0 in 4 min
- `screen` running
- `pick` skipped
- `prep2` skipped
- `confirm` skipped
- `gate` skipped
- `pr` skipped

### screen

**1844 battles**, 0 failed, 491 read back from an earlier run. Running 1.8 h, 760 battles/h. Last battle 0 min ago.
Skipped turns a battle: 51.5 overall, first 100 58.8, last 100 51.9; engine disables 616.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| sg | 170 | 0 | 76.62 | -14.37 (149 robots) | ±3.67 | -19.99 .. -8.75 | 41.0 |
| fp | 167 | 0 | 92.15 | +0.50 (149 robots) | ±0.73 | -0.61 .. +1.61 | 47.2 |
| hj | 168 | 0 | 91.52 | +0.19 (148 robots) | ±0.70 | -0.87 .. +1.26 | 44.9 |
| mm | 167 | 0 | 91.37 | -0.43 (149 robots) | ±0.63 | -1.40 .. +0.54 | 56.3 |
| dg | 169 | 0 | 91.44 | +0.03 (150 robots) | ±0.75 | -1.12 .. +1.17 | 47.3 |
| rd | 168 | 0 | 91.59 | +0.00 (149 robots) | ±0.70 | -1.08 .. +1.08 | 51.9 |
| sw | 167 | 0 | 77.02 | -14.15 (148 robots) | ±3.80 | -19.97 .. -8.34 | 41.3 |
| gs | 166 | 0 | 91.58 | +0.04 (148 robots) | ±0.64 | -0.94 .. +1.03 | 49.5 |
| fl | 166 | 0 | 91.65 | -0.05 (147 robots) | ±0.52 | -0.85 .. +0.75 | 54.9 |
| x5 | 169 | 0 | 91.27 | -0.04 (150 robots) | ±0.78 | -1.23 .. +1.16 | 52.0 |
| c | 167 | 0 | 91.60 | - | - | - | 48.4 |

APS = mean difference over the robots read x 1194 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 1844 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | ok | 46.8 a battle over the last 200 (first 200: 57.8) |
| `stall 30m` | halt | ok | last battle 0 min ago |

### Queue log (last lines)

```
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
23:42:37 progress screen: 1650 battles, 684/h, 0 failed, skips 46.5/battle (last 100), sg -14.38, fp +0.45, hj +0.19, mm -0.40, dg -0.02, rd +0.14, sw -14.26, gs +0.14, fl -0.08, x5 -0.04
```
