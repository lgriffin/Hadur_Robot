# Queue pc-tailor-field: progress

Updated 2026-11-06 08:23:24 PC time (08:23 UTC), runner pid 52376.

- `prep` done, exit 0 in 8 min
- `pilot` done, exit 0 in 4 min
- `screen` running
- `pick` skipped
- `prep2` skipped
- `confirm` skipped
- `gate` skipped
- `pr` skipped

### screen

**3882 battles**, 0 failed, 3259 read back from an earlier run. Running 46 min, 848 battles/h. Last battle 0 min ago.
Skipped turns a battle: 60.7 overall, first 100 54.7, last 100 65.8; engine disables 351.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| sg | 356 | 0 | 76.93 | -14.63 (317 robots) | ±2.53 | -18.50 .. -10.76 | 44.4 |
| fp | 354 | 0 | 92.05 | +0.07 (318 robots) | ±0.44 | -0.60 .. +0.74 | 50.1 |
| hj | 355 | 0 | 92.09 | +0.14 (318 robots) | ±0.46 | -0.56 .. +0.84 | 52.7 |
| mm | 352 | 0 | 91.60 | -0.33 (318 robots) | ±0.44 | -1.01 .. +0.34 | 58.6 |
| dg | 353 | 0 | 91.76 | -0.20 (317 robots) | ±0.45 | -0.89 .. +0.49 | 52.6 |
| rd | 350 | 0 | 92.04 | +0.12 (316 robots) | ±0.44 | -0.55 .. +0.80 | 55.6 |
| sw | 353 | 0 | 77.89 | -13.88 (316 robots) | ±2.49 | -17.70 .. -10.07 | 45.3 |
| gs | 351 | 0 | 91.88 | -0.06 (317 robots) | ±0.46 | -0.76 .. +0.64 | 55.2 |
| fl | 351 | 0 | 91.84 | -0.09 (316 robots) | ±0.37 | -0.66 .. +0.48 | 53.4 |
| x5 | 356 | 0 | 91.74 | -0.22 (318 robots) | ±0.47 | -0.93 .. +0.50 | 55.2 |
| c | 351 | 0 | 91.94 | - | - | - | 54.7 |

APS = mean difference over the robots read x 1194 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 3882 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 90 over 200` | halt | ok | 63.9 a battle over the last 200 (first 200: 56.5) |
| `stall 30m` | halt | ok | last battle 0 min ago |

### Queue log (last lines)

```
07:36:31 skip prep (already exit=0)
07:36:31 skip pilot (already exit=0)
07:36:31 start screen
07:36:31 watching screen: 4 stop rule(s)
07:36:34 progress pushed to origin claude/pc-tailor-field-progress (every 15 min)
07:37:29 screen exit=130 in 57 s (stopped)
07:37:29 stopped; rerun to resume from the interrupted steps
07:37:53 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant calibrated; work D:\code\Hadur_Robot\hadur-bench\work
07:37:53 skip prep (already exit=0)
07:37:53 skip pilot (already exit=0)
07:37:53 start screen
07:37:53 watching screen: 4 stop rule(s)
07:37:56 progress pushed to origin claude/pc-tailor-field-progress (every 15 min)
07:39:04 progress screen: 3259 battles, 0 failed, sg -14.55, fp +0.05, hj +0.11, mm -0.49, dg -0.13, rd +0.02, sw -14.05, gs -0.12, fl -0.09, x5 -0.25
08:09:14 progress screen: 3684 battles, 850/h, 0 failed, skips 62.5/battle (last 100), sg -14.74, fp +0.06, hj +0.12, mm -0.38, dg -0.10, rd +0.10, sw -13.92, gs -0.12, fl -0.08, x5 -0.23
```
