# Queue pc-team-closerr: progress

Updated 2026-11-18 16:04:15 PC time (16:04 UTC), runner pid 85476.

- `tcprep` done, exit 0 in 2 min
- `tcpcr` running
- `tcpilot` pending
- `tcbb` pending
- `tccr` pending
- `tcgate` pending
- `tcpr` pending

### tcpcr

**170 of 276 battles** (62%), 0 failed. Running 28 min, 363 battles/h, about 18 min left (ends ~16:21 PC time). Last battle 0 min ago.
Skipped turns a battle: 4.6 overall, first 100 4.4, last 100 3.4.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 60` | halt | ok | 0 failed of 170 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 60 over 200` | halt | waiting | 170 of 200 battles to read |

Stopping now would leave 106 battles unrun (about 18 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
15:34:00 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1544834; work D:\code\Hadur_Robot\hadur-bench\work
15:34:00 start tcprep
15:34:02 progress pushed to origin claude/pc-team-closerr-progress (every 15 min)
15:36:10 tcprep exit=0 in 130 s
15:36:10 start tcpcr
15:36:10 watching tcpcr: 3 stop rule(s)
15:37:02 progress tcpcr: 0/276 (0%) battles, 0 failed
```
