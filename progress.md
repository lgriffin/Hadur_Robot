# Queue pc-team-icpt: progress

Updated 2026-11-19 12:20:03 PC time (12:20 UTC), runner pid 95276.

- `tcprep` done, exit 0 in 2 min
- `tcptic` running
- `tcpilot` pending
- `tcbb` pending
- `tctic` pending
- `tcgate` pending
- `tcpr` pending

### tcptic

**164 of 276 battles** (59%), 0 failed. Running 28 min, 349 battles/h, about 19 min left (ends ~12:39 PC time). Last battle 0 min ago.
Skipped turns a battle: 29.5 overall, first 100 35.6, last 100 22.6.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 60` | halt | ok | 0 failed of 164 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 60 over 200` | halt | waiting | 164 of 200 battles to read |

Stopping now would leave 112 battles unrun (about 19 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
11:49:46 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1544834; work D:\code\Hadur_Robot\hadur-bench\work
11:49:46 start tcprep
11:49:48 progress pushed to origin claude/pc-team-icpt-progress (every 15 min)
11:51:52 tcprep exit=0 in 126 s
11:51:52 start tcptic
11:51:52 watching tcptic: 3 stop rule(s)
11:52:47 progress tcptic: 0/276 (0%) battles, 0 failed
```
