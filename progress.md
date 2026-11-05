# Queue pc-tailor-field: progress

Updated 2026-11-05 22:25:54 PC time (22:25 UTC), runner pid 60476.

- `prep` done, exit 0 in 8 min
- `pilot` done, exit 0 in 4 min
- `screen` running
- `pick` skipped
- `prep2` skipped
- `confirm` skipped
- `gate` skipped
- `pr` skipped

### screen

**699 battles**, 0 failed, 491 read back from an earlier run. Running 15 min, 825 battles/h. Last battle 0 min ago.
Skipped turns a battle: 58.3 overall, first 100 58.8, last 100 56.8; engine disables 108.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| sg | 62 | 0 | 73.31 | -15.56 (47 robots) | ±6.24 | -25.12 .. -6.01 | 37.7 |
| fp | 63 | 0 | 90.66 | +0.07 (48 robots) | ±1.10 | -1.61 .. +1.76 | 46.7 |
| hj | 65 | 0 | 89.69 | -0.74 (47 robots) | ±1.24 | -2.65 .. +1.16 | 43.4 |
| mm | 63 | 0 | 89.53 | -0.91 (47 robots) | ±1.27 | -2.86 .. +1.04 | 48.3 |
| dg | 67 | 0 | 90.44 | -0.60 (49 robots) | ±1.70 | -3.20 .. +2.00 | 44.3 |
| rd | 62 | 0 | 89.26 | -1.37 (48 robots) | ±1.32 | -3.39 .. +0.64 | 46.8 |
| sw | 62 | 0 | 73.47 | -17.17 (47 robots) | ±6.65 | -27.34 .. -7.00 | 35.3 |
| gs | 62 | 0 | 90.12 | -0.26 (47 robots) | ±1.18 | -2.06 .. +1.55 | 50.4 |
| fl | 64 | 0 | 90.11 | -0.19 (48 robots) | ±0.83 | -1.46 .. +1.07 | 52.9 |
| x5 | 65 | 0 | 90.91 | +0.13 (47 robots) | ±1.72 | -2.51 .. +2.76 | 47.6 |
| c | 64 | 0 | 90.77 | - | - | - | 51.0 |

APS = mean difference over the robots read x 1194 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 699 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | ok | 58.7 a battle over the last 200 (first 200: 57.8) |
| `stall 30m` | halt | ok | last battle 0 min ago |

### Queue log (last lines)

```
21:36:26 start pilot
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
```
