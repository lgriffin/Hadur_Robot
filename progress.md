# Queue pc-tailor-field: progress

Updated 2026-11-06 08:38:32 PC time (08:38 UTC), runner pid 52376.

- `prep` done, exit 0 in 8 min
- `pilot` done, exit 0 in 4 min
- `screen` running
- `pick` skipped
- `prep2` skipped
- `confirm` skipped
- `gate` skipped
- `pr` skipped

### screen

**4075 battles**, 0 failed, 3259 read back from an earlier run. Running 1.0 h, 804 battles/h. Last battle 0 min ago.
Skipped turns a battle: 61.0 overall, first 100 54.7, last 100 61.6; engine disables 470.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| sg | 369 | 0 | 76.97 | -14.60 (332 robots) | ±2.49 | -18.41 .. -10.80 | 44.5 |
| fp | 372 | 0 | 91.96 | +0.00 (335 robots) | ±0.44 | -0.67 .. +0.67 | 50.6 |
| hj | 372 | 0 | 92.08 | +0.10 (334 robots) | ±0.45 | -0.58 .. +0.78 | 54.0 |
| mm | 371 | 0 | 91.59 | -0.40 (333 robots) | ±0.43 | -1.06 .. +0.26 | 58.8 |
| dg | 373 | 0 | 91.67 | -0.21 (334 robots) | ±0.44 | -0.89 .. +0.47 | 52.7 |
| rd | 370 | 0 | 92.02 | +0.10 (333 robots) | ±0.42 | -0.54 .. +0.74 | 55.4 |
| sw | 368 | 0 | 78.10 | -13.51 (331 robots) | ±2.41 | -17.20 .. -9.82 | 45.8 |
| gs | 368 | 0 | 91.88 | -0.08 (330 robots) | ±0.44 | -0.75 .. +0.59 | 55.8 |
| fl | 371 | 0 | 91.86 | -0.11 (333 robots) | ±0.36 | -0.66 .. +0.44 | 53.3 |
| x5 | 370 | 0 | 91.76 | -0.20 (333 robots) | ±0.45 | -0.88 .. +0.49 | 55.7 |
| c | 371 | 0 | 92.06 | - | - | - | 55.8 |

APS = mean difference over the robots read x 1194 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 4075 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 90 over 200` | halt | ok | 61.3 a battle over the last 200 (first 200: 56.5) |
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
