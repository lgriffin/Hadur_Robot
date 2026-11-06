# Queue pc-tailor-field: progress

Updated 2026-11-06 09:08:52 PC time (09:08 UTC), runner pid 52376.

- `prep` done, exit 0 in 8 min
- `pilot` done, exit 0 in 4 min
- `screen` running
- `pick` skipped
- `prep2` skipped
- `confirm` skipped
- `gate` skipped
- `pr` skipped

### screen

**4436 battles**, 0 failed, 3259 read back from an earlier run. Running 1.5 h, 722 battles/h. Last battle 0 min ago.
Skipped turns a battle: 58.8 overall, first 100 54.7, last 100 62.1; engine disables 643.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| sg | 402 | 0 | 77.26 | -14.54 (361 robots) | ±2.38 | -18.18 .. -10.90 | 45.3 |
| fp | 401 | 0 | 92.02 | +0.00 (361 robots) | ±0.43 | -0.65 .. +0.66 | 50.8 |
| hj | 405 | 0 | 92.05 | +0.05 (362 robots) | ±0.44 | -0.62 .. +0.72 | 55.7 |
| mm | 403 | 0 | 91.61 | -0.42 (362 robots) | ±0.45 | -1.11 .. +0.27 | 59.3 |
| dg | 404 | 0 | 91.92 | -0.14 (362 robots) | ±0.42 | -0.78 .. +0.51 | 52.8 |
| rd | 403 | 0 | 92.13 | +0.11 (363 robots) | ±0.40 | -0.51 .. +0.73 | 55.5 |
| sw | 403 | 0 | 78.01 | -13.78 (363 robots) | ±2.32 | -17.33 .. -10.24 | 46.1 |
| gs | 404 | 0 | 91.95 | -0.05 (363 robots) | ±0.41 | -0.68 .. +0.58 | 55.1 |
| fl | 403 | 0 | 91.91 | -0.13 (362 robots) | ±0.36 | -0.68 .. +0.42 | 52.4 |
| x5 | 405 | 0 | 91.80 | -0.23 (363 robots) | ±0.42 | -0.87 .. +0.41 | 55.3 |
| c | 403 | 0 | 91.99 | - | - | - | 55.1 |

APS = mean difference over the robots read x 1194 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 4436 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 90 over 200` | halt | ok | 55.2 a battle over the last 200 (first 200: 56.5) |
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
