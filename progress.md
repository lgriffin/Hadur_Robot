# Queue pc-tailor-field: progress

Updated 2026-11-05 21:43:54 PC time (21:43 UTC), runner pid 61996.

- `prep` done, exit 0 in 8 min
- `pilot` done, exit 0 in 4 min
- `screen` running
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

**304 battles**, 0 failed, 286 read back from an earlier run. Running 3 min, 325 battles/h. Last battle 0 min ago.
Skipped turns a battle: 27.2 overall, first 18 27.2, last 18 27.2; engine disables 2.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| sg | 26 | 0 | 66.13 | -16.71 (13 robots) | ±12.56 | -35.94 .. +2.51 | 26.2 |
| fp | 27 | 0 | 84.69 | +0.36 (13 robots) | ±2.04 | -2.76 .. +3.48 | 35.7 |
| hj | 29 | 0 | 82.60 | -2.02 (13 robots) | ±2.24 | -5.44 .. +1.41 | 28.2 |
| mm | 28 | 0 | 81.89 | -2.01 (13 robots) | ±2.29 | -5.51 .. +1.49 | 40.3 |
| dg | 28 | 0 | 85.00 | -0.31 (13 robots) | ±1.14 | -2.05 .. +1.43 | 36.2 |
| rd | 26 | 0 | 82.32 | -0.84 (13 robots) | ±0.88 | -2.18 .. +0.51 | 34.9 |
| sw | 29 | 0 | 65.52 | -17.83 (13 robots) | ±12.43 | -36.86 .. +1.19 | 24.9 |
| gs | 28 | 0 | 83.10 | -1.85 (13 robots) | ±1.38 | -3.97 .. +0.27 | 32.9 |
| fl | 28 | 0 | 80.71 | -1.38 (13 robots) | ±1.00 | -2.90 .. +0.15 | 32.6 |
| x5 | 29 | 0 | 83.04 | +0.18 (13 robots) | ±4.75 | -7.08 .. +7.45 | 31.8 |
| c | 26 | 0 | 83.17 | - | - | - | 36.8 |

APS = mean difference over the robots read x 1194 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 304 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | waiting | 18 of 200 battles to read |
| `stall 30m` | halt | ok | last battle 0 min ago |

### Queue log (last lines)

```
20:34:42 skip prep2 (after pick, which has not finished exit=0)
20:34:42 skip confirm (after prep2, which has not finished exit=0)
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
```
