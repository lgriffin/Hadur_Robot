# Queue pc-tailor-field: progress

Updated 2026-11-06 09:54:23 PC time (09:54 UTC), runner pid 52376.

- `prep` done, exit 0 in 8 min
- `pilot` done, exit 0 in 4 min
- `screen` running
- `pick` skipped
- `prep2` skipped
- `confirm` skipped
- `gate` skipped
- `pr` skipped

### screen

**5012 battles**, 0 failed, 3259 read back from an earlier run. Running 2.3 h, 784 battles/h. Last battle 0 min ago.
Skipped turns a battle: 57.0 overall, first 100 54.7, last 100 60.1; engine disables 918.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| sg | 459 | 0 | 77.68 | -14.18 (404 robots) | ±2.20 | -17.55 .. -10.81 | 45.9 |
| fp | 455 | 0 | 92.04 | -0.09 (402 robots) | ±0.39 | -0.69 .. +0.52 | 52.4 |
| hj | 455 | 0 | 92.16 | +0.04 (403 robots) | ±0.40 | -0.56 .. +0.65 | 55.7 |
| mm | 453 | 0 | 91.68 | -0.41 (402 robots) | ±0.43 | -1.07 .. +0.24 | 58.5 |
| dg | 454 | 0 | 91.96 | -0.09 (400 robots) | ±0.39 | -0.68 .. +0.51 | 52.1 |
| rd | 455 | 0 | 92.16 | +0.04 (402 robots) | ±0.37 | -0.52 .. +0.61 | 54.9 |
| sw | 458 | 0 | 78.31 | -13.52 (404 robots) | ±2.16 | -16.83 .. -10.21 | 46.8 |
| gs | 458 | 0 | 92.01 | -0.05 (403 robots) | ±0.39 | -0.66 .. +0.55 | 54.9 |
| fl | 454 | 0 | 92.00 | -0.10 (401 robots) | ±0.34 | -0.61 .. +0.41 | 52.3 |
| x5 | 455 | 0 | 91.89 | -0.20 (403 robots) | ±0.38 | -0.79 .. +0.39 | 55.6 |
| c | 456 | 0 | 92.13 | - | - | - | 54.8 |

APS = mean difference over the robots read x 1194 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 5012 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 90 over 200` | halt | ok | 55.5 a battle over the last 200 (first 200: 56.5) |
| `stall 30m` | halt | ok | last battle 0 min ago |

### Queue log (last lines)

```
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
09:09:52 progress screen: 4448 battles, 718/h, 0 failed, skips 59.0/battle (last 100), sg -14.47, fp +0.00, hj +0.05, mm -0.43, dg -0.14, rd +0.11, sw -13.79, gs -0.04, fl -0.13, x5 -0.23
09:40:13 progress screen: 4814 battles, 722/h, 0 failed, skips 52.5/battle (last 100), sg -14.38, fp -0.06, hj +0.06, mm -0.42, dg -0.11, rd +0.06, sw -13.59, gs -0.02, fl -0.14, x5 -0.21
```
