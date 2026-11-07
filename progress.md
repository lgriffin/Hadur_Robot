# Queue pc-race-power: progress

Updated 2026-11-07 17:43:11 PC time (17:43 UTC), runner pid 58972.

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

**215 of 7164 battles** (3%), 0 failed, 48 read back from an earlier run. Running 8 min, 1289 battles/h, about 5.4 h left (ends ~23:06 PC time). Last battle 0 min ago.
Skipped turns a battle: 53.5 overall, first 100 50.8, last 100 56.2; engine disables 68.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 73 | 0 | 91.86 | - | - | - | 51.1 |
| aa | 71 | 0 | 91.48 | -0.31 (58 robots) | ±0.73 | -1.42 .. +0.80 | 50.4 |
| rp | 71 | 0 | 91.52 | +0.13 (54 robots) | ±1.10 | -1.54 .. +1.81 | 51.2 |

APS = mean difference over the robots read x 1194 panel robots / 1217 pairings.
A/A: aa - c -0.32 pts over 58 robots; 1% band ±1.40 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 215 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 90 over 200` | halt | waiting | 167 of 200 battles to read |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 6949 battles unrun (about 5.4 h); every battle already fought is kept and a rerun resumes from it.

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
```
