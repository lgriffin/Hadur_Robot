# Queue pc-tailor-field: progress

Updated 2026-11-06 10:39:55 PC time (10:39 UTC), runner pid 52376.

- `prep` done, exit 0 in 8 min
- `pilot` done, exit 0 in 4 min
- `screen` running
- `pick` skipped
- `prep2` skipped
- `confirm` skipped
- `gate` skipped
- `pr` skipped

### screen

**5607 battles**, 0 failed, 3259 read back from an earlier run. Running 3.0 h, 792 battles/h. Last battle 0 min ago.
Skipped turns a battle: 56.5 overall, first 100 54.7, last 100 52.5; engine disables 1204.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| sg | 507 | 0 | 77.51 | -14.35 (445 robots) | ±2.09 | -17.55 .. -11.15 | 46.3 |
| fp | 510 | 0 | 92.15 | -0.01 (446 robots) | ±0.37 | -0.57 .. +0.56 | 52.5 |
| hj | 511 | 0 | 92.21 | +0.14 (447 robots) | ±0.36 | -0.41 .. +0.70 | 55.0 |
| mm | 510 | 0 | 91.73 | -0.37 (446 robots) | ±0.39 | -0.97 .. +0.23 | 58.0 |
| dg | 509 | 0 | 92.01 | -0.11 (446 robots) | ±0.36 | -0.67 .. +0.45 | 52.7 |
| rd | 511 | 0 | 92.22 | +0.09 (446 robots) | ±0.33 | -0.42 .. +0.60 | 55.3 |
| sw | 511 | 0 | 77.91 | -13.91 (448 robots) | ±2.07 | -17.07 .. -10.74 | 47.3 |
| gs | 509 | 0 | 92.07 | -0.03 (446 robots) | ±0.36 | -0.59 .. +0.52 | 54.1 |
| fl | 510 | 0 | 92.01 | -0.06 (447 robots) | ±0.31 | -0.54 .. +0.42 | 53.3 |
| x5 | 509 | 0 | 92.04 | -0.10 (446 robots) | ±0.36 | -0.64 .. +0.45 | 56.8 |
| c | 510 | 0 | 92.12 | - | - | - | 54.4 |

APS = mean difference over the robots read x 1194 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 5607 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 90 over 200` | halt | ok | 53.7 a battle over the last 200 (first 200: 56.5) |
| `stall 30m` | halt | ok | last battle 0 min ago |

### Queue log (last lines)

```
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
10:10:35 progress screen: 5222 battles, 804/h, 0 failed, skips 49.9/battle (last 100), sg -14.32, fp -0.04, hj +0.11, mm -0.44, dg -0.07, rd +0.05, sw -13.79, gs -0.06, fl -0.11, x5 -0.16
```
