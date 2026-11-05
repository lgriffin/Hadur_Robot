# Queue pc-sanaro-q: progress

Updated 2026-11-05 19:53:52 PC time (19:53 UTC), runner pid 31620.

- `prep` done, exit 0 in 0 min
- `arms` done, exit 0 in 0 min
- `pilot-S4` done, exit 0 in 10 min
- `pilot-QT` running
- `pilot-QP` pending
- `pilot-QTP` pending
- `pilot-EW` pending
- `pilot-EB` pending
- `pilot` pending
- `live-S4` pending
- `live-QT` pending
- `live-QP` pending
- `live-QTP` pending
- `live-EW` pending
- `live-EB` pending
- `read-live` pending
- `pr` pending

### pilot-S4

**172 of 172 battles** (100%), 0 failed. Running 10 min, 1080 battles/h, about 0 min left (ends ~19:49 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 172 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.0 a battle over the last 100 (first 100: 0.0) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### pilot-QT

**85 of 172 battles** (49%), 0 failed. Running 5 min, 1047 battles/h, about 5 min left (ends ~19:58 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 85 0.0, last 85 0.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 85 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | waiting | 85 of 100 battles to read |

Stopping now would leave 87 battles unrun (about 5 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
19:38:44 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant calibrated; work D:\code\Hadur_Robot\hadur-bench\work
19:38:44 start prep
19:38:47 progress pushed to origin claude/pc-sanaro-q-progress (every 15 min)
19:39:14 prep exit=0 in 29 s
19:39:14 start arms
19:39:26 arms exit=0 in 11 s
19:39:26 start pilot-S4
19:39:26 watching pilot-S4: 3 stop rule(s)
19:39:45 progress pilot-S4: 4/172 (2%) battles, 752/h, ETA 13 min, 0 failed, skips 0.0/battle (last 100)
19:49:00 pilot-S4 exit=0 in 573 s
19:49:00 start pilot-QT
19:49:00 watching pilot-QT: 3 stop rule(s)
```
