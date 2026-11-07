# Queue pc-race-power: progress

Updated 2026-11-07 18:43:43 PC time (18:43 UTC), runner pid 58972.

- `prep` done, exit 0 in 2 min
- `pilot` done, exit 0 in 6 min
- `screen` running
- `pick` pending
- `prep2` pending
- `confirm` pending
- `gate` pending
- `pr` pending

### pilot

**48 of 48 battles** (100%), 0 failed. Running 6 min, 514 battles/h, about 0 min left (ends ~17:35 PC time). Last battle 0 min ago.
Skipped turns a battle: 42.1 overall, first 48 42.1, last 48 42.1; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 16 | 0 | 56.39 | - | - | - | 38.8 |
| aa | 16 | 0 | 56.99 | +0.00 (4 robots) | ±0.01 | -0.02 .. +0.02 | 42.8 |
| rp | 16 | 0 | 67.23 | +0.03 (4 robots) | ±0.02 | +0.01 .. +0.06 | 44.8 |

APS = mean difference over the robots read x 4 panel robots / 1217 pairings.
A/A: aa - c +0.60 pts over 4 robots; 1% band ±2.92 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 48 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 90 over 200` | halt | waiting | 48 of 200 battles to read |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### screen

**1338 of 7164 battles** (19%), 0 failed, 48 read back from an earlier run. Running 1.1 h, 1042 battles/h, about 5.6 h left (ends ~00:19 PC time). Last battle 0 min ago.
Skipped turns a battle: 59.2 overall, first 100 50.8, last 100 54.8; engine disables 664.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 445 | 0 | 92.76 | - | - | - | 59.9 |
| aa | 446 | 0 | 92.15 | -0.49 (399 robots) | ±0.35 | -1.02 .. +0.04 | 55.9 |
| rp | 447 | 0 | 92.81 | +0.37 (398 robots) | ±0.41 | -0.26 .. +1.00 | 59.9 |

APS = mean difference over the robots read x 1194 panel robots / 1217 pairings.
A/A: aa - c -0.50 pts over 399 robots; 1% band ±0.55 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 1338 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 90 over 200` | halt | ok | 59.9 a battle over the last 200 (first 200: 54.3) |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 5826 battles unrun (about 5.6 h); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
17:28:02 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant calibrated; work D:\code\Hadur_Robot\hadur-bench\work
17:28:02 start prep
17:28:04 progress pushed to origin claude/pc-race-power-progress (every 15 min)
17:29:48 prep exit=0 in 106 s
17:29:48 start pilot
17:29:48 watching pilot: 4 stop rule(s)
17:30:04 progress pilot: 0/48 (0%) battles, 0 failed
17:35:25 pilot exit=0 in 336 s
17:35:25 start screen
17:35:25 watching screen: 4 stop rule(s)
18:00:23 progress screen: 552/7164 (8%) battles, 1213/h, ETA 5.5 h, 0 failed, skips 71.2/battle (last 100), aa -0.19, rp +0.48
18:30:37 progress screen: 1107/7164 (15%) battles, 1102/h, ETA 5.5 h, 0 failed, skips 59.7/battle (last 100), aa -0.47, rp +0.33
```
