# Queue pc-race-power: progress

Updated 2026-11-07 18:28:34 PC time (18:28 UTC), runner pid 58972.

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

**1073 of 7164 battles** (15%), 0 failed, 48 read back from an earlier run. Running 53 min, 1110 battles/h, about 5.5 h left (ends ~23:57 PC time). Last battle 0 min ago.
Skipped turns a battle: 59.2 overall, first 100 50.8, last 100 57.2; engine disables 513.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 358 | 0 | 92.48 | - | - | - | 60.4 |
| aa | 358 | 0 | 92.06 | -0.44 (322 robots) | ±0.38 | -1.03 .. +0.14 | 55.2 |
| rp | 357 | 0 | 92.72 | +0.33 (321 robots) | ±0.47 | -0.39 .. +1.05 | 59.7 |

APS = mean difference over the robots read x 1194 panel robots / 1217 pairings.
A/A: aa - c -0.45 pts over 322 robots; 1% band ±0.62 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 1073 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 90 over 200` | halt | ok | 63.9 a battle over the last 200 (first 200: 54.3) |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 6091 battles unrun (about 5.5 h); every battle already fought is kept and a rerun resumes from it.

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
```
