# Queue pc-tailor-field: progress

Updated 2026-11-06 09:24:02 PC time (09:24 UTC), runner pid 52376.

- `prep` done, exit 0 in 8 min
- `pilot` done, exit 0 in 4 min
- `screen` running
- `pick` skipped
- `prep2` skipped
- `confirm` skipped
- `gate` skipped
- `pr` skipped

### screen

**4612 battles**, 0 failed, 3259 read back from an earlier run. Running 1.8 h, 724 battles/h. Last battle 0 min ago.
Skipped turns a battle: 57.8 overall, first 100 54.7, last 100 52.5; engine disables 724.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| sg | 419 | 0 | 77.48 | -14.36 (371 robots) | ±2.34 | -17.94 .. -10.78 | 44.7 |
| fp | 419 | 0 | 92.06 | +0.01 (371 robots) | ±0.42 | -0.64 .. +0.65 | 52.0 |
| hj | 418 | 0 | 92.15 | +0.05 (372 robots) | ±0.43 | -0.60 .. +0.71 | 55.5 |
| mm | 420 | 0 | 91.66 | -0.42 (371 robots) | ±0.44 | -1.09 .. +0.26 | 59.0 |
| dg | 418 | 0 | 91.94 | -0.11 (371 robots) | ±0.41 | -0.74 .. +0.52 | 52.3 |
| rd | 419 | 0 | 92.03 | +0.08 (372 robots) | ±0.40 | -0.53 .. +0.68 | 55.1 |
| sw | 420 | 0 | 78.22 | -13.65 (372 robots) | ±2.29 | -17.15 .. -10.15 | 45.9 |
| gs | 420 | 0 | 92.03 | -0.01 (372 robots) | ±0.40 | -0.62 .. +0.61 | 55.2 |
| fl | 421 | 0 | 91.97 | -0.11 (372 robots) | ±0.35 | -0.64 .. +0.43 | 52.4 |
| x5 | 422 | 0 | 91.90 | -0.22 (372 robots) | ±0.41 | -0.85 .. +0.42 | 55.6 |
| c | 416 | 0 | 91.99 | - | - | - | 54.7 |

APS = mean difference over the robots read x 1194 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 4612 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 90 over 200` | halt | ok | 51.6 a battle over the last 200 (first 200: 56.5) |
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
