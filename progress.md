# Queue pc-jaylexi-orb: progress

Updated 2026-11-04 14:26:08 PC time (14:26 UTC), runner pid 35932.

- `prep` done, exit 0 in 0 min
- `pilot` done, exit 0 in 23 min
- `pilotgate` done, exit 0 in 0 min
- `screen` running
- `build` pending
- `confirm` pending
- `gate` pending
- `pr` pending

### pilot

**5360 of 5360 battles** (100%), 0 failed. Running 23 min, 14129 battles/h, about 0 min left (ends ~14:03 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0; engine disables 0.

| arm | battles | failed | share | vs control (pts) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 1340 | 0 | 87.39 | - | - | - | 0.0 |
| aa | 1340 | 0 | 87.39 | -0.00 (134 robots) | ±0.06 | -0.10 .. +0.10 | 0.0 |
| near | 1340 | 0 | 87.16 | -0.23 (134 robots) | ±0.27 | -0.65 .. +0.18 | 0.0 |
| far | 1340 | 0 | 87.01 | -0.39 (134 robots) | ±0.24 | -0.76 .. -0.02 | 0.0 |
A/A: aa - c -0.00 pts over 134 robots; 1% band ±0.32 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 5360 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | ok | 0.0 a battle over the last 200 (first 200: 0.0) |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `aa after 20%` | halt | ok | aa - c -0.00 pts over 134 robots, stop band ±0.37 |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### screen

**4902 of 21360 battles** (23%), 0 failed. Running 22 min, 13079 battles/h, about 1.3 h left (ends ~15:41 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0; engine disables 0.

| arm | battles | failed | share | vs control (pts) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 1228 | 0 | 88.77 | - | - | - | 0.0 |
| aa | 1225 | 0 | 88.74 | -0.03 (497 robots) | ±0.06 | -0.12 .. +0.06 | 0.0 |
| near | 1226 | 0 | 88.57 | -0.19 (497 robots) | ±0.24 | -0.56 .. +0.18 | 0.0 |
| far | 1223 | 0 | 88.56 | -0.20 (497 robots) | ±0.20 | -0.51 .. +0.12 | 0.0 |
A/A: aa - c -0.03 pts over 497 robots; 1% band ±0.33 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 4902 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | ok | 0.0 a battle over the last 200 (first 200: 0.0) |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `aa after 20%` | halt | ok | aa - c -0.03 pts over 497 robots, stop band ±0.39 |

Stopping now would leave 16458 battles unrun (about 1.3 h); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
13:40:44 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant calibrated; work D:\code\Hadur_Robot\hadur-bench\work
13:40:44 start prep
13:40:47 progress pushed to origin claude/pc-jaylexi-orb-progress (every 15 min)
13:40:51 prep exit=0 in 6 s
13:40:51 start pilot
13:40:51 watching pilot: 5 stop rule(s)
13:41:46 progress pilot: 174/5360 (3%) battles, 11559/h, ETA 27 min, 0 failed, skips 0.0/battle (last 100), aa +0.14, near -0.57, far -0.30
14:03:37 pilot exit=0 in 1366 s
14:03:37 start pilotgate
14:03:37 pilotgate exit=0 in 0 s
14:03:37 start screen
14:03:37 watching screen: 5 stop rule(s)
14:12:00 progress screen: 1781/21360 (8%) battles, 12789/h, ETA 1.5 h, 0 failed, skips 0.0/battle (last 100), aa -0.03, near -0.17, far -0.16
```
