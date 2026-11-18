# Queue pc-team-closerr: progress

Updated 2026-11-18 16:19:22 PC time (16:19 UTC), runner pid 85476.

- `tcprep` done, exit 0 in 2 min
- `tcpcr` done, exit 0 in 41 min
- `tcpilot` done, exit 0 in 0 min
- `tcbb` running
- `tccr` pending
- `tcgate` pending
- `tcpr` pending

### tcpcr

**270 of 276 battles** (98%), 0 failed. Running 41 min, 392 battles/h, about 1 min left (ends ~16:18 PC time). Last battle 0 min ago.
Skipped turns a battle: 5.9 overall, first 100 4.4, last 100 8.3.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 60` | halt | ok | 0 failed of 270 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 60 over 200` | halt | ok | 5.8 a battle over the last 200 (first 200: 5.2) |

Stopping now would leave 6 battles unrun (about 1 min); every battle already fought is kept and a rerun resumes from it.

### tcbb

**0 of 1104 battles** (0%), 0 failed. Running 2 min. Last battle 2 min ago.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 60` | halt | ok | 0 failed of 0 |
| `stall 30m` | halt | ok | last battle 2 min ago |
| `skips 60 over 200` | halt | waiting | 0 of 200 battles to read |

Stopping now would leave 1104 battles unrun; every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
15:34:00 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1544834; work D:\code\Hadur_Robot\hadur-bench\work
15:34:00 start tcprep
15:34:02 progress pushed to origin claude/pc-team-closerr-progress (every 15 min)
15:36:10 tcprep exit=0 in 130 s
15:36:10 start tcpcr
15:36:10 watching tcpcr: 3 stop rule(s)
15:37:02 progress tcpcr: 0/276 (0%) battles, 0 failed
16:07:16 progress tcpcr: 189/276 (68%) battles, 365/h, ETA 14 min, 0 failed, skips 5.5/battle (last 100)
16:17:33 tcpcr exit=0 in 2482 s
16:17:33 start tcpilot
16:17:34 tcpilot exit=0 in 0 s
16:17:34 start tcbb
16:17:34 watching tcbb: 3 stop rule(s)
```
