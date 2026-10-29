# Queue pc-sanaro-n02: progress

Updated 2026-10-29 00:51:14 PC time (00:51 UTC), runner pid 55936.

- `prep` done, exit 0 in 0 min
- `live-S0` done, exit 0 in 28 min
- `live-S02` done, exit 0 in 29 min
- `live-Q7` running
- `live-D10` skipped
- `live-L20` skipped
- `live-T60` skipped
- `live-B800` skipped
- `read-live` skipped
- `pr` skipped

### live-S02

**430 of 430 battles** (100%), 0 failed. Running 29 min, 891 battles/h, about 0 min left (ends ~00:34 PC time). Last battle 0 min ago.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 430 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | waiting | 0 of 100 battles to read |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### live-Q7

**200 of 430 battles** (47%), 0 failed. Running 16 min, 731 battles/h, about 19 min left (ends ~01:10 PC time). Last battle 3 min ago.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 200 |
| `stall 30m` | halt | ok | last battle 3 min ago |
| `skips 40 over 100` | halt | waiting | 0 of 100 battles to read |

Stopping now would leave 230 battles unrun (about 19 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
22:14:39 watching live-S02: 3 stop rule(s)
22:17:26 progress live-S02: 50/430 (12%) battles, 1081/h, ETA 21 min, 0 failed
22:41:15 live-S02 exit=130 in 1595 s (stopped)
22:41:15 stopped; rerun to resume from the interrupted steps
00:05:52 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1488498; work D:\code\Hadur_Robot\hadur-bench\work
00:05:52 skip prep (already exit=0)
00:05:52 skip live-S0 (already exit=0)
00:05:52 start live-S02
00:05:52 watching live-S02: 3 stop rule(s)
00:05:54 progress pushed to origin claude/pc-sanaro-n02-progress (every 15 min)
00:06:52 progress live-S02: 10/430 (2%) battles, 594/h, ETA 42 min, 0 failed
00:34:50 live-S02 exit=0 in 1737 s
00:34:50 start live-Q7
00:34:50 watching live-Q7: 3 stop rule(s)
00:37:08 progress live-Q7: 40/430 (9%) battles, 1043/h, ETA 22 min, 0 failed
```
