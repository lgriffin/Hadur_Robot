# Queue pc-jaylexi-pw: progress

Updated 2026-11-04 11:30:31 PC time (11:30 UTC), runner pid 38136.

- `prep` done, exit 0 in 0 min
- `pilot` running
- `pilotgate` pending
- `screen` pending
- `build` pending
- `confirm` pending
- `gate` pending
- `pr` pending

### pilot

**5359 of 5360 battles** (100%), 0 failed. Running 23 min, 13948 battles/h, about 0 min left (ends ~11:30 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0; engine disables 0.

| arm | battles | failed | share | vs control (pts) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 1340 | 0 | 87.26 | - | - | - | 0.0 |
| aa | 1339 | 0 | 87.23 | -0.02 (134 robots) | ±0.07 | -0.13 .. +0.08 | 0.0 |
| hi | 1340 | 0 | 86.18 | -1.06 (134 robots) | ±0.39 | -1.66 .. -0.47 | 0.0 |
| lo | 1340 | 0 | 84.38 | -2.87 (134 robots) | ±1.31 | -4.88 .. -0.86 | 0.0 |
A/A: aa - c -0.02 pts over 134 robots; 1% band ±0.32 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 5359 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | ok | 0.0 a battle over the last 200 (first 200: 0.0) |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `aa after 20%` | halt | ok | aa - c -0.02 pts over 134 robots, stop band ±0.37 |

Stopping now would leave 1 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
11:07:18 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant calibrated; work D:\code\Hadur_Robot\hadur-bench\work
11:07:18 start prep
11:07:27 prep exit=0 in 9 s
11:07:27 start pilot
11:07:27 watching pilot: 5 stop rule(s)
11:07:40 progress pushed to origin claude/pc-jaylexi-pw-progress (every 15 min)
11:08:19 progress pilot: 134/5360 (2%) battles, 9419/h, ETA 33 min, 0 failed, skips 0.0/battle (last 100), aa -0.39, hi -1.95, lo -1.53
```
