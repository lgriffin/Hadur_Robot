# Queue pc-tailor-field: progress

Updated 2026-11-06 09:39:13 PC time (09:39 UTC), runner pid 52376.

- `prep` done, exit 0 in 8 min
- `pilot` done, exit 0 in 4 min
- `screen` running
- `pick` skipped
- `prep2` skipped
- `confirm` skipped
- `gate` skipped
- `pr` skipped

### screen

**4801 battles**, 0 failed, 3259 read back from an earlier run. Running 2.0 h, 722 battles/h. Last battle 0 min ago.
Skipped turns a battle: 57.3 overall, first 100 54.7, last 100 52.7; engine disables 809.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| sg | 437 | 0 | 77.40 | -14.36 (389 robots) | ±2.27 | -17.83 .. -10.88 | 45.5 |
| fp | 435 | 0 | 92.01 | -0.04 (389 robots) | ±0.41 | -0.66 .. +0.59 | 51.5 |
| hj | 437 | 0 | 92.12 | +0.08 (390 robots) | ±0.42 | -0.56 .. +0.72 | 56.0 |
| mm | 435 | 0 | 91.60 | -0.43 (388 robots) | ±0.43 | -1.10 .. +0.23 | 58.5 |
| dg | 437 | 0 | 91.93 | -0.09 (389 robots) | ±0.40 | -0.70 .. +0.51 | 52.0 |
| rd | 437 | 0 | 92.11 | +0.08 (389 robots) | ±0.39 | -0.51 .. +0.68 | 54.9 |
| sw | 436 | 0 | 78.13 | -13.57 (388 robots) | ±2.22 | -16.96 .. -10.18 | 46.6 |
| gs | 435 | 0 | 92.14 | -0.00 (388 robots) | ±0.40 | -0.62 .. +0.62 | 54.7 |
| fl | 437 | 0 | 91.90 | -0.12 (389 robots) | ±0.35 | -0.65 .. +0.42 | 52.6 |
| x5 | 436 | 0 | 91.84 | -0.19 (388 robots) | ±0.40 | -0.80 .. +0.42 | 55.8 |
| c | 439 | 0 | 91.99 | - | - | - | 55.0 |

APS = mean difference over the robots read x 1194 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 4801 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 90 over 200` | halt | ok | 52.6 a battle over the last 200 (first 200: 56.5) |
| `stall 30m` | halt | ok | last battle 0 min ago |

### Queue log (last lines)

```
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
09:09:52 progress screen: 4448 battles, 718/h, 0 failed, skips 59.0/battle (last 100), sg -14.47, fp +0.00, hj +0.05, mm -0.43, dg -0.14, rd +0.11, sw -13.79, gs -0.04, fl -0.13, x5 -0.23
```
