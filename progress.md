# Queue pc-team-tight: progress

Updated 2026-11-22 23:04:01 PC time (23:04 UTC), runner pid 37800.

- `ttprep` done, exit 0 in 2 min
- `ttptp` done, exit 0 in 6 min
- `ttpilot` done, exit 0 in 0 min
- `ttbb` running
- `tttp` pending
- `ttgate` pending
- `ttpr` pending

### ttptp

**40 of 40 battles** (100%), 0 failed. Running 6 min, 386 battles/h, about 0 min left (ends ~22:57 PC time). Last battle 0 min ago.
Skipped turns a battle: 44.9 overall, first 40 44.9, last 40 44.9.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 10` | halt | ok | 0 failed of 40 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 60 over 200` | halt | waiting | 40 of 200 battles to read |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### ttbb

**39 of 240 battles** (16%), 0 failed. Running 7 min, 342 battles/h, about 35 min left (ends ~23:39 PC time). Last battle 0 min ago.
Skipped turns a battle: 39.4 overall, first 39 39.4, last 39 39.4.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 10` | halt | ok | 0 failed of 39 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 60 over 200` | halt | waiting | 39 of 200 battles to read |

Stopping now would leave 201 battles unrun (about 35 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
22:48:54 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1544834; work D:\code\Hadur_Robot\hadur-bench\work
22:48:54 start ttprep
22:48:56 progress pushed to origin claude/pc-team-tight-progress (every 15 min)
22:50:57 ttprep exit=0 in 123 s
22:50:57 start ttptp
22:50:57 watching ttptp: 3 stop rule(s)
22:51:55 progress ttptp: 0/40 (0%) battles, 0 failed
22:57:10 ttptp exit=0 in 372 s
22:57:10 start ttpilot
22:57:11 ttpilot exit=0 in 0 s
22:57:11 start ttbb
22:57:11 watching ttbb: 3 stop rule(s)
```
