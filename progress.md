# Queue pc-tailor-field: progress

Updated 2026-11-06 11:56:25 PC time (11:56 UTC), runner pid 52376.

- `prep` done, exit 0 in 8 min
- `pilot` done, exit 0 in 4 min
- `screen` running
- `pick` skipped
- `prep2` skipped
- `confirm` skipped
- `gate` skipped
- `pr` skipped

### screen

**6553 battles**, 0 failed, 3259 read back from an earlier run. Running 4.3 h, 768 battles/h. Last battle 0 min ago.
Skipped turns a battle: 55.0 overall, first 100 54.7, last 100 63.5; engine disables 1621.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| sg | 594 | 0 | 77.77 | -14.07 (511 robots) | ±1.96 | -17.07 .. -11.08 | 47.0 |
| fp | 596 | 0 | 92.24 | +0.11 (513 robots) | ±0.36 | -0.44 .. +0.66 | 52.5 |
| hj | 596 | 0 | 92.37 | +0.24 (511 robots) | ±0.35 | -0.30 .. +0.79 | 55.4 |
| mm | 598 | 0 | 91.95 | -0.20 (513 robots) | ±0.39 | -0.79 .. +0.39 | 56.0 |
| dg | 596 | 0 | 92.01 | -0.11 (512 robots) | ±0.34 | -0.64 .. +0.41 | 52.9 |
| rd | 594 | 0 | 92.32 | +0.20 (512 robots) | ±0.34 | -0.31 .. +0.71 | 54.7 |
| sw | 595 | 0 | 78.11 | -13.76 (511 robots) | ±1.95 | -16.74 .. -10.78 | 47.4 |
| gs | 597 | 0 | 92.23 | +0.11 (511 robots) | ±0.37 | -0.46 .. +0.67 | 54.9 |
| fl | 597 | 0 | 92.09 | -0.07 (512 robots) | ±0.32 | -0.56 .. +0.42 | 53.5 |
| x5 | 596 | 0 | 92.12 | +0.01 (512 robots) | ±0.35 | -0.54 .. +0.55 | 55.8 |
| c | 594 | 0 | 92.20 | - | - | - | 52.7 |

APS = mean difference over the robots read x 1194 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 6553 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 90 over 200` | halt | ok | 59.4 a battle over the last 200 (first 200: 56.5) |
| `stall 30m` | halt | ok | last battle 0 min ago |

### Queue log (last lines)

```
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
11:11:09 progress screen: 5977 battles, 714/h, 0 failed, skips 39.2/battle (last 100), sg -14.08, fp +0.10, hj +0.24, mm -0.26, dg -0.07, rd +0.14, sw -13.82, gs +0.11, fl -0.06, x5 -0.03
11:41:18 progress screen: 6346 battles, 736/h, 0 failed, skips 43.6/battle (last 100), sg -14.08, fp +0.15, hj +0.28, mm -0.21, dg -0.10, rd +0.21, sw -13.63, gs +0.13, fl -0.04, x5 +0.03
```
