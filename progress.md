# Queue pc-tailor-field: progress

Updated 2026-11-06 08:53:43 PC time (08:53 UTC), runner pid 52376.

- `prep` done, exit 0 in 8 min
- `pilot` done, exit 0 in 4 min
- `screen` running
- `pick` skipped
- `prep2` skipped
- `confirm` skipped
- `gate` skipped
- `pr` skipped

### screen

**4248 battles**, 0 failed, 3259 read back from an earlier run. Running 1.3 h, 718 battles/h. Last battle 0 min ago.
Skipped turns a battle: 59.3 overall, first 100 54.7, last 100 41.9; engine disables 549.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| sg | 386 | 0 | 76.90 | -14.84 (349 robots) | ±2.44 | -18.57 .. -11.11 | 45.3 |
| fp | 387 | 0 | 91.98 | +0.01 (349 robots) | ±0.44 | -0.66 .. +0.68 | 50.5 |
| hj | 387 | 0 | 92.01 | +0.09 (349 robots) | ±0.45 | -0.60 .. +0.77 | 54.1 |
| mm | 387 | 0 | 91.46 | -0.51 (348 robots) | ±0.47 | -1.22 .. +0.21 | 58.8 |
| dg | 385 | 0 | 91.77 | -0.19 (348 robots) | ±0.43 | -0.85 .. +0.48 | 53.0 |
| rd | 387 | 0 | 92.07 | +0.08 (350 robots) | ±0.41 | -0.55 .. +0.71 | 55.1 |
| sw | 383 | 0 | 77.43 | -14.23 (346 robots) | ±2.40 | -17.91 .. -10.56 | 45.0 |
| gs | 388 | 0 | 91.92 | -0.05 (349 robots) | ±0.42 | -0.69 .. +0.60 | 55.5 |
| fl | 387 | 0 | 91.84 | -0.10 (348 robots) | ±0.37 | -0.66 .. +0.46 | 52.9 |
| x5 | 384 | 0 | 91.68 | -0.24 (347 robots) | ±0.43 | -0.90 .. +0.42 | 55.6 |
| c | 387 | 0 | 91.99 | - | - | - | 55.9 |

APS = mean difference over the robots read x 1194 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 4248 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 90 over 200` | halt | ok | 54.2 a battle over the last 200 (first 200: 56.5) |
| `stall 30m` | halt | ok | last battle 0 min ago |

### Queue log (last lines)

```
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
08:39:33 progress screen: 4086 battles, 802/h, 0 failed, skips 61.4/battle (last 100), sg -14.71, fp +0.00, hj +0.10, mm -0.40, dg -0.21, rd +0.10, sw -13.48, gs -0.08, fl -0.11, x5 -0.20
```
