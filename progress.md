# Queue pc-tailor-field: progress

Updated 2026-11-06 08:08:13 PC time (08:08 UTC), runner pid 52376.

- `prep` done, exit 0 in 8 min
- `pilot` done, exit 0 in 4 min
- `screen` running
- `pick` skipped
- `prep2` skipped
- `confirm` skipped
- `gate` skipped
- `pr` skipped

### screen

**3672 battles**, 0 failed, 3259 read back from an earlier run. Running 30 min, 826 battles/h. Last battle 0 min ago.
Skipped turns a battle: 59.6 overall, first 100 54.7, last 100 65.8; engine disables 222.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| sg | 331 | 0 | 76.75 | -14.74 (299 robots) | ±2.59 | -18.70 .. -10.78 | 44.1 |
| fp | 334 | 0 | 91.92 | +0.10 (299 robots) | ±0.46 | -0.61 .. +0.80 | 49.3 |
| hj | 335 | 0 | 91.99 | +0.12 (300 robots) | ±0.48 | -0.60 .. +0.85 | 51.5 |
| mm | 334 | 0 | 91.45 | -0.38 (300 robots) | ±0.46 | -1.09 .. +0.32 | 58.2 |
| dg | 333 | 0 | 91.72 | -0.10 (298 robots) | ±0.45 | -0.80 .. +0.59 | 51.6 |
| rd | 334 | 0 | 91.95 | +0.10 (299 robots) | ±0.46 | -0.61 .. +0.81 | 54.8 |
| sw | 335 | 0 | 77.71 | -13.97 (301 robots) | ±2.53 | -17.85 .. -10.09 | 44.4 |
| gs | 334 | 0 | 91.76 | -0.11 (300 robots) | ±0.47 | -0.83 .. +0.61 | 54.8 |
| fl | 334 | 0 | 91.76 | -0.08 (300 robots) | ±0.38 | -0.67 .. +0.50 | 53.8 |
| x5 | 336 | 0 | 91.63 | -0.24 (300 robots) | ±0.49 | -0.99 .. +0.52 | 54.4 |
| c | 332 | 0 | 91.81 | - | - | - | 54.1 |

APS = mean difference over the robots read x 1194 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 3672 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 90 over 200` | halt | ok | 64.0 a battle over the last 200 (first 200: 56.5) |
| `stall 30m` | halt | ok | last battle 0 min ago |

### Queue log (last lines)

```
07:36:31 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant calibrated; work D:\code\Hadur_Robot\hadur-bench\work
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
```
