# Queue pc-sanaro-n02: progress

Updated 2026-10-28 22:01:18 PC time (22:01 UTC), runner pid 54164.

- `prep` done, exit 0 in 0 min
- `live-S0` running
- `live-S02` skipped
- `live-Q7` skipped
- `live-D10` skipped
- `live-L20` skipped
- `live-T60` skipped
- `live-B800` skipped
- `read-live` skipped
- `pr` skipped

### live-S0

**200 of 430 battles** (47%), 0 failed. Running 15 min, 793 battles/h, about 17 min left (ends ~22:18 PC time). Last battle 1 min ago.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 200 |
| `stall 30m` | halt | ok | last battle 1 min ago |
| `skips 40 over 100` | halt | waiting | 0 of 100 battles to read |

Stopping now would leave 230 battles unrun (about 17 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
21:41:01 skip live-S02 (after live-S0, which has not finished exit=0)
21:41:01 skip live-Q7 (after live-S02, which has not finished exit=0)
21:41:01 skip live-D10 (after live-Q7, which has not finished exit=0)
21:41:01 skip live-L20 (after live-D10, which has not finished exit=0)
21:41:01 skip live-T60 (after live-L20, which has not finished exit=0)
21:41:01 skip live-B800 (after live-T60, which has not finished exit=0)
21:41:01 skip read-live (after live-B800, which has not finished exit=0)
21:41:01 skip pr (after read-live, which has not finished exit=0)
21:41:01 ALLDONE
21:46:11 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1488498; work D:\code\Hadur_Robot\hadur-bench\work
21:46:11 skip prep (already exit=0)
21:46:11 start live-S0
21:46:11 watching live-S0: 3 stop rule(s)
21:46:13 progress pushed to origin claude/pc-sanaro-n02-progress (every 15 min)
21:47:11 progress live-S0: 10/430 (2%) battles, 594/h, ETA 42 min, 0 failed
```
