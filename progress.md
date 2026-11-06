# Queue pc-tailor-field: progress

Updated 2026-11-06 07:37:29 PC time (07:37 UTC), runner pid 10944.

- `prep` done, exit 0 in 8 min
- `pilot` done, exit 0 in 4 min
- `screen` interrupted, exit 130 in 1 min
- `pick` skipped
- `prep2` skipped
- `confirm` skipped
- `gate` skipped
- `pr` skipped

### screen

**3259 battles**, 0 failed, 3259 read back from an earlier run. Running 1 min. Last battle 1 min ago.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| sg | 295 | 0 | 76.89 | -14.55 (266 robots) | ±2.72 | -18.72 .. -10.38 | 44.3 |
| fp | 297 | 0 | 91.76 | +0.05 (265 robots) | ±0.50 | -0.72 .. +0.81 | 47.8 |
| hj | 296 | 0 | 91.80 | +0.11 (266 robots) | ±0.49 | -0.63 .. +0.86 | 50.5 |
| mm | 295 | 0 | 91.21 | -0.49 (265 robots) | ±0.49 | -1.24 .. +0.25 | 56.5 |
| dg | 298 | 0 | 91.55 | -0.13 (267 robots) | ±0.50 | -0.89 .. +0.62 | 50.5 |
| rd | 296 | 0 | 91.76 | +0.02 (267 robots) | ±0.49 | -0.74 .. +0.77 | 54.5 |
| sw | 297 | 0 | 77.42 | -14.05 (265 robots) | ±2.72 | -18.21 .. -9.90 | 44.3 |
| gs | 297 | 0 | 91.56 | -0.12 (267 robots) | ±0.51 | -0.89 .. +0.66 | 53.7 |
| fl | 297 | 0 | 91.55 | -0.09 (266 robots) | ±0.41 | -0.73 .. +0.54 | 53.2 |
| x5 | 295 | 0 | 91.45 | -0.25 (266 robots) | ±0.53 | -1.06 .. +0.55 | 52.9 |
| c | 296 | 0 | 91.69 | - | - | - | 52.0 |

APS = mean difference over the robots read x 1194 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 3259 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | waiting | 0 of 200 battles to read |
| `stall 30m` | halt | ok | last battle 1 min ago |

### Queue log (last lines)

```
00:43:12 progress screen: 2459 battles, 784/h, 0 failed, skips 47.3/battle (last 100), sg -14.27, fp +0.14, hj +0.17, mm -0.51, dg -0.05, rd +0.00, sw -13.92, gs -0.31, fl -0.07, x5 -0.06
01:13:34 progress screen: 2834 battles, 732/h, 0 failed, skips 41.9/battle (last 100), sg -15.38, fp +0.11, hj +0.20, mm -0.57, dg -0.09, rd +0.05, sw -14.49, gs -0.06, fl -0.16, x5 -0.15
01:43:52 progress screen: 3234 battles, 792/h, 0 failed, skips 65.3/battle (last 100), sg -14.52, fp +0.05, hj +0.12, mm -0.52, dg -0.12, rd +0.03, sw -14.17, gs -0.12, fl -0.09, x5 -0.25
01:45:53 STOP screen by rule skips 60 over 200: 60.0 a battle over the last 200 (first 200: 57.8); 3259 battles fought and kept, the rest of the step unrun
01:45:53 screen exit=75 in 12906 s (halted, skips 60 over 200)
01:45:55 alert issue: https://github.com/lgriffin/Hadur_Robot/issues/678
01:45:55 queue halted by a stop rule; fix the cause and rerun to resume (every fought battle is kept)
07:36:31 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant calibrated; work D:\code\Hadur_Robot\hadur-bench\work
07:36:31 skip prep (already exit=0)
07:36:31 skip pilot (already exit=0)
07:36:31 start screen
07:36:31 watching screen: 4 stop rule(s)
07:36:34 progress pushed to origin claude/pc-tailor-field-progress (every 15 min)
07:37:29 screen exit=130 in 57 s (stopped)
07:37:29 stopped; rerun to resume from the interrupted steps
```
