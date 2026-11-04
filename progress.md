# Queue pc-eveimear-pw: progress

Updated 2026-11-04 09:50:18 PC time (09:50 UTC), runner pid 22484.

- `prep` done, exit 0 in 0 min
- `pilot` running
- `pilotgate` pending
- `screen` pending
- `build` pending
- `confirm` pending
- `gate` pending
- `pr` pending

### pilot

**3612 of 4120 battles** (88%), 0 failed. Running 15 min, 14527 battles/h, about 2 min left (ends ~09:52 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0; engine disables 0.

| arm | battles | failed | share | vs control (pts) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 901 | 0 | 83.56 | - | - | - | 0.0 |
| aa | 904 | 0 | 83.54 | -0.03 (103 robots) | ±0.05 | -0.10 .. +0.05 | 0.0 |
| p3 | 904 | 0 | 82.39 | -1.16 (103 robots) | ±0.67 | -2.19 .. -0.14 | 0.0 |
| p1 | 903 | 0 | 78.74 | -4.80 (103 robots) | ±0.89 | -6.17 .. -3.44 | 0.0 |
A/A: aa - c -0.03 pts over 103 robots; 1% band ±0.39 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 3612 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | ok | 0.0 a battle over the last 200 (first 200: 0.0) |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `aa after 20%` | halt | ok | aa - c -0.03 pts over 103 robots, stop band ±0.45 |

Stopping now would leave 508 battles unrun (about 2 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
09:35:10 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant calibrated; work D:\code\Hadur_Robot\hadur-bench\work
09:35:10 start prep
09:35:12 progress pushed to origin claude/pc-eveimear-pw-progress (every 15 min)
09:35:21 prep exit=0 in 11 s
09:35:21 start pilot
09:35:21 watching pilot: 5 stop rule(s)
09:36:11 progress pilot: 148/4120 (4%) battles, 10844/h, ETA 22 min, 0 failed, skips 0.0/battle (last 100), aa -0.02, p3 -1.16, p1 -4.96
```
