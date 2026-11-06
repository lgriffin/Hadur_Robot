# Queue pc-tailor-field: progress

Updated 2026-11-06 00:11:54 PC time (00:11 UTC), runner pid 60476.

- `prep` done, exit 0 in 8 min
- `pilot` done, exit 0 in 4 min
- `screen` running
- `pick` skipped
- `prep2` skipped
- `confirm` skipped
- `gate` skipped
- `pr` skipped

### screen

**2049 battles**, 0 failed, 491 read back from an earlier run. Running 2.0 h, 808 battles/h. Last battle 0 min ago.
Skipped turns a battle: 52.0 overall, first 100 58.8, last 100 58.2; engine disables 724.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| sg | 188 | 0 | 76.58 | -14.47 (168 robots) | ±3.44 | -19.74 .. -9.20 | 41.3 |
| fp | 188 | 0 | 92.11 | +0.45 (168 robots) | ±0.66 | -0.56 .. +1.46 | 49.0 |
| hj | 187 | 0 | 91.80 | +0.30 (168 robots) | ±0.66 | -0.70 .. +1.30 | 45.5 |
| mm | 188 | 0 | 91.14 | -0.39 (167 robots) | ±0.59 | -1.30 .. +0.51 | 57.5 |
| dg | 185 | 0 | 91.43 | -0.04 (165 robots) | ±0.69 | -1.09 .. +1.02 | 48.2 |
| rd | 184 | 0 | 91.58 | +0.10 (166 robots) | ±0.67 | -0.93 .. +1.13 | 52.0 |
| sw | 187 | 0 | 77.68 | -13.84 (167 robots) | ±3.53 | -19.23 .. -8.44 | 41.7 |
| gs | 185 | 0 | 91.41 | -0.07 (166 robots) | ±0.60 | -0.98 .. +0.85 | 50.7 |
| fl | 184 | 0 | 91.50 | +0.02 (165 robots) | ±0.53 | -0.79 .. +0.83 | 55.0 |
| x5 | 186 | 0 | 91.53 | +0.06 (166 robots) | ±0.74 | -1.08 .. +1.19 | 51.7 |
| c | 187 | 0 | 91.58 | - | - | - | 49.4 |

APS = mean difference over the robots read x 1194 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 2049 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | ok | 55.3 a battle over the last 200 (first 200: 57.8) |
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
