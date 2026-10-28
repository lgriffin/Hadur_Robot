# Queue pc-sanaro-n02: progress

Updated 2026-10-28 22:41:15 PC time (22:41 UTC), runner pid 54164.

- `prep` done, exit 0 in 0 min
- `live-S0` done, exit 0 in 28 min
- `live-S02` interrupted, exit 130 in 27 min
- `live-Q7` skipped
- `live-D10` skipped
- `live-L20` skipped
- `live-T60` skipped
- `live-B800` skipped
- `read-live` skipped
- `pr` skipped

### live-S0

**430 of 430 battles** (100%), 0 failed. Running 28 min, 906 battles/h, about 0 min left (ends ~22:14 PC time). Last battle 0 min ago.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 430 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | waiting | 0 of 100 battles to read |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### live-S02

**400 of 430 battles** (93%), 0 failed. Running 27 min, 903 battles/h, about 2 min left (ends ~22:43 PC time). Last battle 0 min ago.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 400 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | waiting | 0 of 100 battles to read |

Stopping now would leave 30 battles unrun (about 2 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
21:41:01 skip read-live (after live-B800, which has not finished exit=0)
21:41:01 skip pr (after read-live, which has not finished exit=0)
21:41:01 ALLDONE
21:46:11 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1488498; work D:\code\Hadur_Robot\hadur-bench\work
21:46:11 skip prep (already exit=0)
21:46:11 start live-S0
21:46:11 watching live-S0: 3 stop rule(s)
21:46:13 progress pushed to origin claude/pc-sanaro-n02-progress (every 15 min)
21:47:11 progress live-S0: 10/430 (2%) battles, 594/h, ETA 42 min, 0 failed
22:14:39 live-S0 exit=0 in 1708 s
22:14:39 start live-S02
22:14:39 watching live-S02: 3 stop rule(s)
22:17:26 progress live-S02: 50/430 (12%) battles, 1081/h, ETA 21 min, 0 failed
22:41:15 live-S02 exit=130 in 1595 s (stopped)
22:41:15 stopped; rerun to resume from the interrupted steps
```
