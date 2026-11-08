# Queue pc-team-close: progress

Updated 2026-11-08 01:40:49 PC time (01:40 UTC), runner pid 24944.

- `tcprep` done, exit 0 in 2 min
- `tcbb1` running
- `tctc1` pending
- `tcpilot` pending
- `tcbb2` pending
- `tctc2` pending
- `tcgate` pending
- `tcpr` pending

### tcbb1

**137 of 368 battles** (37%), 0 failed. Running 13 min, 619 battles/h, about 22 min left (ends ~02:03 PC time). Last battle 0 min ago.
Skipped turns a battle: 20.5 overall, first 100 20.4, last 100 20.8.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 60` | halt | ok | 0 failed of 137 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 60 over 200` | halt | waiting | 137 of 200 battles to read |

Stopping now would leave 231 battles unrun (about 22 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
01:25:41 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant calibrated; work D:\code\Hadur_Robot\hadur-bench\work
01:25:41 start tcprep
01:25:43 progress pushed to origin claude/pc-team-close-progress (every 15 min)
01:27:32 tcprep exit=0 in 110 s
01:27:32 start tcbb1
01:27:32 watching tcbb1: 3 stop rule(s)
01:27:42 progress tcbb1: 0/368 (0%) battles, 0 failed
```
