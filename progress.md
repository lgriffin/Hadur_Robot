# Queue pc-team-closerr: progress

Updated 2026-11-18 15:49:07 PC time (15:49 UTC), runner pid 85476.

- `tcprep` done, exit 0 in 2 min
- `tcpcr` running
- `tcpilot` pending
- `tcbb` pending
- `tccr` pending
- `tcgate` pending
- `tcpr` pending

### tcpcr

**66 of 276 battles** (24%), 0 failed. Running 13 min, 306 battles/h, about 41 min left (ends ~16:30 PC time). Last battle 0 min ago.
Skipped turns a battle: 6.6 overall, first 66 6.6, last 66 6.6.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 60` | halt | ok | 0 failed of 66 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 60 over 200` | halt | waiting | 66 of 200 battles to read |

Stopping now would leave 210 battles unrun (about 41 min); every battle already fought is kept and a rerun resumes from it.

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
