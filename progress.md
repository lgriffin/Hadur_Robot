# Queue pc-tailor-field: progress

Updated 2026-11-06 10:55:01 PC time (10:55 UTC), runner pid 52376.

- `prep` done, exit 0 in 8 min
- `pilot` done, exit 0 in 4 min
- `screen` running
- `pick` skipped
- `prep2` skipped
- `confirm` skipped
- `gate` skipped
- `pr` skipped

### screen

**5788 battles**, 0 failed, 3259 read back from an earlier run. Running 3.3 h, 758 battles/h. Last battle 0 min ago.
Skipped turns a battle: 56.5 overall, first 100 54.7, last 100 60.2; engine disables 1301.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| sg | 526 | 0 | 77.84 | -14.02 (459 robots) | ±2.05 | -17.16 .. -10.88 | 46.8 |
| fp | 527 | 0 | 92.23 | +0.12 (460 robots) | ±0.39 | -0.47 .. +0.71 | 52.5 |
| hj | 524 | 0 | 92.34 | +0.27 (458 robots) | ±0.38 | -0.32 .. +0.85 | 55.6 |
| mm | 528 | 0 | 91.86 | -0.24 (460 robots) | ±0.41 | -0.87 .. +0.39 | 58.0 |
| dg | 525 | 0 | 91.99 | -0.10 (459 robots) | ±0.36 | -0.66 .. +0.46 | 52.2 |
| rd | 525 | 0 | 92.24 | +0.17 (459 robots) | ±0.36 | -0.38 .. +0.71 | 55.6 |
| sw | 528 | 0 | 78.12 | -13.78 (459 robots) | ±2.03 | -16.89 .. -10.67 | 47.4 |
| gs | 526 | 0 | 92.20 | +0.11 (459 robots) | ±0.39 | -0.49 .. +0.71 | 54.6 |
| fl | 525 | 0 | 92.04 | -0.03 (460 robots) | ±0.32 | -0.53 .. +0.46 | 53.5 |
| x5 | 527 | 0 | 92.10 | +0.00 (460 robots) | ±0.38 | -0.58 .. +0.58 | 57.0 |
| c | 527 | 0 | 92.10 | - | - | - | 54.1 |

APS = mean difference over the robots read x 1194 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 5788 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 90 over 200` | halt | ok | 58.0 a battle over the last 200 (first 200: 56.5) |
| `stall 30m` | halt | ok | last battle 0 min ago |

### Queue log (last lines)

```
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
10:10:35 progress screen: 5222 battles, 804/h, 0 failed, skips 49.9/battle (last 100), sg -14.32, fp -0.04, hj +0.11, mm -0.44, dg -0.07, rd +0.05, sw -13.79, gs -0.06, fl -0.11, x5 -0.16
10:40:56 progress screen: 5620 battles, 788/h, 0 failed, skips 55.4/battle (last 100), sg -14.36, fp -0.02, hj +0.14, mm -0.38, dg -0.12, rd +0.08, sw -13.91, gs -0.03, fl -0.07, x5 -0.11
```
