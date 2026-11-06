# Queue pc-tailor-field: progress

Updated 2026-11-06 07:53:03 PC time (07:53 UTC), runner pid 52376.

- `prep` done, exit 0 in 8 min
- `pilot` done, exit 0 in 4 min
- `screen` running
- `pick` skipped
- `prep2` skipped
- `confirm` skipped
- `gate` skipped
- `pr` skipped

### screen

**3455 battles**, 0 failed, 3259 read back from an earlier run. Running 15 min, 776 battles/h. Last battle -0 min ago.
Skipped turns a battle: 57.0 overall, first 100 54.7, last 100 59.3; engine disables 94.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| sg | 317 | 0 | 76.78 | -14.69 (285 robots) | ±2.66 | -18.75 .. -10.62 | 43.9 |
| fp | 312 | 0 | 91.91 | +0.03 (283 robots) | ±0.48 | -0.70 .. +0.76 | 48.8 |
| hj | 313 | 0 | 91.94 | +0.03 (284 robots) | ±0.48 | -0.70 .. +0.76 | 50.5 |
| mm | 314 | 0 | 91.37 | -0.46 (284 robots) | ±0.46 | -1.17 .. +0.24 | 57.1 |
| dg | 313 | 0 | 91.77 | -0.13 (284 robots) | ±0.47 | -0.85 .. +0.58 | 50.9 |
| rd | 315 | 0 | 91.84 | -0.04 (284 robots) | ±0.47 | -0.76 .. +0.67 | 54.9 |
| sw | 312 | 0 | 77.26 | -14.12 (282 robots) | ±2.65 | -18.17 .. -10.07 | 44.1 |
| gs | 314 | 0 | 91.72 | -0.09 (284 robots) | ±0.48 | -0.83 .. +0.64 | 53.6 |
| fl | 315 | 0 | 91.68 | -0.13 (284 robots) | ±0.39 | -0.73 .. +0.47 | 53.7 |
| x5 | 316 | 0 | 91.60 | -0.32 (284 robots) | ±0.51 | -1.09 .. +0.46 | 53.0 |
| c | 314 | 0 | 91.85 | - | - | - | 53.4 |

APS = mean difference over the robots read x 1194 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 3455 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 90 over 200` | halt | waiting | 196 of 200 battles to read |
| `stall 30m` | halt | ok | last battle -0 min ago |

### Queue log (last lines)

```
07:36:31 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant calibrated; work D:\code\Hadur_Robot\hadur-bench\work
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
```
