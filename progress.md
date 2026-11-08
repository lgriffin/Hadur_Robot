# Queue pc-team-close: progress

Updated 2026-11-08 01:55:57 PC time (01:55 UTC), runner pid 24944.

- `tcprep` done, exit 0 in 2 min
- `tcbb1` done, exit 0 in 27 min
- `tctc1` running
- `tcpilot` pending
- `tcbb2` pending
- `tctc2` pending
- `tcgate` pending
- `tcpr` pending

### tcbb1

**360 of 368 battles** (98%), 0 failed. Running 27 min, 793 battles/h, about 1 min left (ends ~01:55 PC time). Last battle 0 min ago.
Skipped turns a battle: 18.2 overall, first 100 20.4, last 100 15.9.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 60` | halt | ok | 0 failed of 360 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 60 over 200` | halt | ok | 16.4 a battle over the last 200 (first 200: 20.0) |

Stopping now would leave 8 battles unrun (about 1 min); every battle already fought is kept and a rerun resumes from it.

### tctc1

**0 of 368 battles** (0%), 0 failed. Running 1 min. Last battle 1 min ago.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 60` | halt | ok | 0 failed of 0 |
| `stall 30m` | halt | ok | last battle 1 min ago |
| `skips 60 over 200` | halt | waiting | 0 of 200 battles to read |

Stopping now would leave 368 battles unrun; every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
01:25:41 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant calibrated; work D:\code\Hadur_Robot\hadur-bench\work
01:25:41 start tcprep
01:25:43 progress pushed to origin claude/pc-team-close-progress (every 15 min)
01:27:32 tcprep exit=0 in 110 s
01:27:32 start tcbb1
01:27:32 watching tcbb1: 3 stop rule(s)
01:27:42 progress tcbb1: 0/368 (0%) battles, 0 failed
01:54:46 tcbb1 exit=0 in 1633 s
01:54:46 start tctc1
01:54:46 watching tctc1: 3 stop rule(s)
```
