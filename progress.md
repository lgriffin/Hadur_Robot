# Queue pc-jaylexi-pw: progress

Updated 2026-11-04 11:22:27 PC time (11:22 UTC), runner pid 38136.

- `prep` done, exit 0 in 0 min
- `pilot` running
- `pilotgate` pending
- `screen` pending
- `build` pending
- `confirm` pending
- `gate` pending
- `pr` pending

### pilot

**3499 of 5360 battles** (65%), 0 failed. Running 15 min, 14024 battles/h, about 8 min left (ends ~11:30 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0; engine disables 0.

| arm | battles | failed | share | vs control (pts) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 874 | 0 | 87.32 | - | - | - | 0.0 |
| aa | 875 | 0 | 87.24 | -0.07 (134 robots) | ±0.10 | -0.22 .. +0.07 | 0.0 |
| hi | 875 | 0 | 86.14 | -1.14 (134 robots) | ±0.42 | -1.79 .. -0.50 | 0.0 |
| lo | 875 | 0 | 84.37 | -2.91 (134 robots) | ±1.32 | -4.93 .. -0.90 | 0.0 |
A/A: aa - c -0.07 pts over 134 robots; 1% band ±0.39 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 3499 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | ok | 0.0 a battle over the last 200 (first 200: 0.0) |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `aa after 20%` | halt | ok | aa - c -0.07 pts over 134 robots, stop band ±0.46 |

Stopping now would leave 1861 battles unrun (about 8 min); every battle already fought is kept and a rerun resumes from it.

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
