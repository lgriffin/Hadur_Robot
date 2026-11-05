# Queue pc-tailor-field: progress

Updated 2026-11-05 22:41:04 PC time (22:41 UTC), runner pid 60476.

- `prep` done, exit 0 in 8 min
- `pilot` done, exit 0 in 4 min
- `screen` running
- `pick` skipped
- `prep2` skipped
- `confirm` skipped
- `gate` skipped
- `pr` skipped

### screen

**923 battles**, 0 failed, 491 read back from an earlier run. Running 30 min, 864 battles/h. Last battle 0 min ago.
Skipped turns a battle: 56.2 overall, first 100 58.8, last 100 50.7; engine disables 214.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| sg | 84 | 0 | 75.28 | -15.14 (68 robots) | ±5.14 | -23.00 .. -7.27 | 42.4 |
| fp | 83 | 0 | 91.36 | +0.13 (67 robots) | ±0.85 | -1.18 .. +1.43 | 48.9 |
| hj | 84 | 0 | 91.02 | -0.40 (68 robots) | ±0.92 | -1.80 .. +1.00 | 44.2 |
| mm | 83 | 0 | 90.42 | -0.68 (68 robots) | ±0.96 | -2.15 .. +0.80 | 53.7 |
| dg | 84 | 0 | 91.02 | -0.14 (68 robots) | ±1.30 | -2.12 .. +1.85 | 45.9 |
| rd | 85 | 0 | 90.71 | -0.62 (69 robots) | ±0.99 | -2.13 .. +0.89 | 48.2 |
| sw | 83 | 0 | 75.51 | -14.71 (68 robots) | ±5.43 | -23.02 .. -6.41 | 40.6 |
| gs | 84 | 0 | 91.03 | -0.12 (69 robots) | ±0.88 | -1.47 .. +1.22 | 52.5 |
| fl | 85 | 0 | 91.09 | -0.09 (69 robots) | ±0.63 | -1.05 .. +0.88 | 52.3 |
| x5 | 85 | 0 | 91.26 | +0.14 (69 robots) | ±1.27 | -1.80 .. +2.08 | 49.6 |
| c | 83 | 0 | 91.42 | - | - | - | 48.8 |

APS = mean difference over the robots read x 1194 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 923 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | ok | 53.3 a battle over the last 200 (first 200: 57.8) |
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
