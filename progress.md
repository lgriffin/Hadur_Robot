# Queue pc-tailor-field: progress

Updated 2026-11-05 21:56:18 PC time (21:56 UTC), runner pid 61996.

- `prep` done, exit 0 in 8 min
- `pilot` done, exit 0 in 4 min
- `screen` interrupted, exit 130 in 16 min
- `pick` skipped
- `prep2` skipped
- `confirm` skipped
- `gate` skipped
- `pr` skipped

### pilot

**286 of 286 battles** (100%), 0 failed. Running 4 min, 4141 battles/h, about 0 min left (ends ~21:40 PC time). Last battle 0 min ago.
Skipped turns a battle: 33.1 overall, first 100 35.7, last 100 31.5; engine disables 29.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 26 | 0 | 83.17 | - | - | - | 36.8 |
| x5 | 26 | 0 | 83.36 | +0.00 (13 robots) | ±0.05 | -0.08 .. +0.08 | 33.2 |
| rd | 26 | 0 | 82.32 | -0.01 (13 robots) | ±0.01 | -0.02 .. +0.01 | 34.9 |
| gs | 26 | 0 | 81.28 | -0.02 (13 robots) | ±0.02 | -0.04 .. +0.00 | 33.6 |
| fp | 26 | 0 | 83.54 | +0.00 (13 robots) | ±0.02 | -0.03 .. +0.04 | 36.5 |
| sg | 26 | 0 | 66.13 | -0.18 (13 robots) | ±0.14 | -0.39 .. +0.03 | 26.2 |
| sw | 26 | 0 | 64.99 | -0.19 (13 robots) | ±0.14 | -0.40 .. +0.01 | 25.7 |
| hj | 26 | 0 | 81.12 | -0.02 (13 robots) | ±0.02 | -0.06 .. +0.02 | 29.0 |
| dg | 26 | 0 | 82.86 | -0.00 (13 robots) | ±0.01 | -0.02 .. +0.02 | 35.1 |
| fl | 26 | 0 | 81.77 | -0.02 (13 robots) | ±0.01 | -0.03 .. +0.00 | 33.5 |
| mm | 26 | 0 | 81.12 | -0.02 (13 robots) | ±0.02 | -0.06 .. +0.02 | 39.4 |

APS = mean difference over the robots read x 13 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 286 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | ok | 31.4 a battle over the last 200 (first 200: 33.6) |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### screen

**491 battles**, 0 failed, 286 read back from an earlier run. Running 16 min, 782 battles/h. Last battle 0 min ago.
Skipped turns a battle: 51.1 overall, first 100 42.0, last 100 60.6; engine disables 94.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| sg | 42 | 0 | 72.66 | -16.34 (27 robots) | ±8.36 | -29.13 .. -3.54 | 29.5 |
| fp | 44 | 0 | 88.28 | -0.47 (27 robots) | ±1.52 | -2.80 .. +1.85 | 44.6 |
| hj | 45 | 0 | 87.26 | -0.44 (29 robots) | ±1.49 | -2.72 .. +1.84 | 36.1 |
| mm | 44 | 0 | 87.39 | -0.98 (30 robots) | ±1.72 | -3.62 .. +1.65 | 44.7 |
| dg | 44 | 0 | 88.95 | +0.36 (29 robots) | ±1.50 | -1.93 .. +2.66 | 40.2 |
| rd | 48 | 0 | 87.52 | -0.68 (30 robots) | ±1.01 | -2.23 .. +0.86 | 46.7 |
| sw | 42 | 0 | 67.87 | -20.46 (28 robots) | ±9.61 | -35.17 .. -5.74 | 29.9 |
| gs | 44 | 0 | 87.88 | -0.00 (28 robots) | ±1.72 | -2.64 .. +2.63 | 43.4 |
| fl | 47 | 0 | 88.53 | -0.32 (28 robots) | ±1.15 | -2.07 .. +1.44 | 45.9 |
| x5 | 47 | 0 | 89.27 | +0.57 (30 robots) | ±2.45 | -3.19 .. +4.32 | 42.2 |
| c | 44 | 0 | 88.47 | - | - | - | 41.8 |

APS = mean difference over the robots read x 1194 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 491 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | ok | 51.4 a battle over the last 200 (first 200: 51.1) |
| `stall 30m` | halt | ok | last battle 0 min ago |

### Queue log (last lines)

```
20:34:42 skip gate (after confirm, which has not finished exit=0)
20:34:42 skip pr (after gate, which has not finished exit=0)
20:34:42 ALLDONE
21:28:46 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant calibrated; work D:\code\Hadur_Robot\hadur-bench\work
21:28:46 start prep
21:28:49 progress pushed to origin claude/pc-tailor-field-progress (every 15 min)
21:36:26 prep exit=0 in 460 s
21:36:26 start pilot
21:36:26 watching pilot: 4 stop rule(s)
21:36:50 progress pilot: 22/286 (8%) battles, 3274/h, ETA 5 min, 0 failed, skips 43.8/battle (last 100)
21:40:35 pilot exit=0 in 248 s
21:40:35 start screen
21:40:35 watching screen: 4 stop rule(s)
21:56:18 screen exit=130 in 943 s (stopped)
21:56:18 stopped; rerun to resume from the interrupted steps
```
