# Queue pc-eveimear-st2: progress

Updated 2026-11-03 22:32:30 PC time (22:32 UTC), runner pid 6348.

- `prep` done, exit 0 in 0 min
- `pilot` done, exit 0 in 12 min
- `pilotgate` done, exit 0 in 0 min
- `screen` running
- `build` pending
- `confirm` pending
- `gate` pending
- `pr` pending

### pilot

**3360 of 3360 battles** (100%), 0 failed. Running 13 min, 16123 battles/h, about 0 min left (ends ~22:14 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0; engine disables 0.

| arm | battles | failed | share | vs control (pts) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 840 | 0 | 86.86 | - | - | - | 0.0 |
| aa | 840 | 0 | 86.84 | -0.02 (84 robots) | ±0.06 | -0.12 .. +0.07 | 0.0 |
| rn | 840 | 0 | 79.61 | -7.24 (84 robots) | ±2.23 | -10.66 .. -3.83 | 0.0 |
| sg | 840 | 0 | 79.63 | -7.22 (84 robots) | ±3.31 | -12.30 .. -2.15 | 0.0 |
A/A: aa - c -0.02 pts over 84 robots; 1% band ±0.40 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 3360 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | ok | 0.0 a battle over the last 200 (first 200: 0.0) |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `aa after 20%` | halt | ok | aa - c -0.02 pts over 84 robots, stop band ±0.47 |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### screen

**4199 of 13280 battles** (32%), 0 failed. Running 18 min, 14378 battles/h, about 38 min left (ends ~23:10 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0; engine disables 0.

| arm | battles | failed | share | vs control (pts) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 1051 | 0 | 86.36 | - | - | - | 0.0 |
| aa | 1049 | 0 | 86.34 | -0.02 (326 robots) | ±0.04 | -0.08 .. +0.04 | 0.0 |
| rn | 1049 | 0 | 80.08 | -6.27 (326 robots) | ±0.96 | -7.74 .. -4.81 | 0.0 |
| sg | 1050 | 0 | 79.15 | -7.21 (326 robots) | ±1.63 | -9.70 .. -4.71 | 0.0 |
A/A: aa - c -0.02 pts over 326 robots; 1% band ±0.36 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 4199 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | ok | 0.0 a battle over the last 200 (first 200: 0.0) |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `aa after 20%` | halt | ok | aa - c -0.02 pts over 326 robots, stop band ±0.42 |

Stopping now would leave 9081 battles unrun (about 38 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
22:02:15 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant calibrated; work D:\code\Hadur_Robot\hadur-bench\work
22:02:15 start prep
22:02:18 progress pushed to origin claude/pc-eveimear-st2-progress (every 15 min)
22:02:26 prep exit=0 in 11 s
22:02:26 start pilot
22:02:26 watching pilot: 5 stop rule(s)
22:03:16 progress pilot: 194/3360 (6%) battles, 14161/h, ETA 13 min, 0 failed, skips 0.0/battle (last 100), aa +0.11, rn -7.04, sg -4.50
22:14:56 pilot exit=0 in 750 s
22:14:56 start pilotgate
22:14:57 pilotgate exit=0 in 0 s
22:14:57 start screen
22:14:57 watching screen: 5 stop rule(s)
```
