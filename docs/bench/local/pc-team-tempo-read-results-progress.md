# Queue pc-team-tempo-read: progress

Updated 2026-11-18 22:57:51 PC time (22:57 UTC), runner pid 34348.

- `ttprep` done, exit 0 in 1 min
- `ttogi` done, exit 0 in 2 min
- `tthad` running
- `ttread` pending
- `ttpr` pending

### ttogi

**72 of 72 battles** (100%), 0 failed. Running 2 min, 1828 battles/h, about 0 min left (ends ~22:54 PC time). Last battle 0 min ago.
Skipped turns a battle: 1.2 overall, first 72 1.2, last 72 1.2.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 72 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 60 over 200` | halt | waiting | 72 of 200 battles to read |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### tthad

**60 of 72 battles** (83%), 0 failed. Running 3 min, 1231 battles/h, about 1 min left (ends ~22:58 PC time). Last battle 0 min ago.
Skipped turns a battle: 10.7 overall, first 60 10.7, last 60 10.7.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 60 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 60 over 200` | halt | waiting | 60 of 200 battles to read |

Stopping now would leave 12 battles unrun (about 1 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
22:51:49 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1544834; work D:\code\Hadur_Robot\hadur-bench\work
22:51:49 start ttprep
22:51:51 progress pushed to origin claude/pc-team-tempo-read-progress (every 15 min)
22:52:34 ttprep exit=0 in 44 s
22:52:34 start ttogi
22:52:34 watching ttogi: 3 stop rule(s)
22:52:49 progress ttogi: 0/72 (0%) battles, 0 failed
22:54:56 ttogi exit=0 in 141 s
22:54:56 start tthad
22:54:56 watching tthad: 3 stop rule(s)
```
