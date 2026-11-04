# Queue pc-jaylexi-orb: progress

Updated 2026-11-04 13:55:53 PC time (13:55 UTC), runner pid 35932.

- `prep` done, exit 0 in 0 min
- `pilot` running
- `pilotgate` pending
- `screen` pending
- `build` pending
- `confirm` pending
- `gate` pending
- `pr` pending

### pilot

**3570 of 5360 battles** (67%), 0 failed. Running 15 min, 14266 battles/h, about 8 min left (ends ~14:03 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0; engine disables 0.

| arm | battles | failed | share | vs control (pts) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 893 | 0 | 87.44 | - | - | - | 0.0 |
| aa | 893 | 0 | 87.47 | +0.03 (134 robots) | ±0.05 | -0.04 .. +0.10 | 0.0 |
| near | 892 | 0 | 87.15 | -0.30 (134 robots) | ±0.33 | -0.80 .. +0.20 | 0.0 |
| far | 892 | 0 | 86.88 | -0.57 (134 robots) | ±0.28 | -1.01 .. -0.14 | 0.0 |
A/A: aa - c +0.03 pts over 134 robots; 1% band ±0.39 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 3570 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | ok | 0.0 a battle over the last 200 (first 200: 0.0) |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `aa after 20%` | halt | ok | aa - c +0.03 pts over 134 robots, stop band ±0.45 |

Stopping now would leave 1790 battles unrun (about 8 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
13:40:44 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant calibrated; work D:\code\Hadur_Robot\hadur-bench\work
13:40:44 start prep
13:40:47 progress pushed to origin claude/pc-jaylexi-orb-progress (every 15 min)
13:40:51 prep exit=0 in 6 s
13:40:51 start pilot
13:40:51 watching pilot: 5 stop rule(s)
13:41:46 progress pilot: 174/5360 (3%) battles, 11559/h, ETA 27 min, 0 failed, skips 0.0/battle (last 100), aa +0.14, near -0.57, far -0.30
```
