# Queue pc-melee-hand: progress

Updated 2026-10-31 22:48:35 PC time (22:48 UTC), runner pid 39612.

- `haprep` done, exit 0 in 3 min
- `haaa` done, exit 0 in 24 min
- `habb` running
- `haet` pending
- `haed` pending
- `haes` pending
- `haread` pending
- `hapr` pending

### habb

**151 of 276 battles** (55%), 0 failed. Running 15 min, 599 battles/h, about 13 min left (ends ~23:01 PC time). Last battle 1 min ago.
Skipped turns a battle: 56.8 overall, first 100 55.8, last 100 50.2.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 151 |
| `stall 30m` | halt | ok | last battle 1 min ago |

Stopping now would leave 125 battles unrun (about 13 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
21:42:45 haprep exit=0 in 200 s
21:42:45 start haaa
21:42:45 watching haaa: 2 stop rule(s)
21:43:26 progress haaa: 0/276 (0%) battles, 0 failed
22:07:05 haaa exit=0 in 1460 s
22:07:05 start habb
22:07:05 watching habb: 2 stop rule(s)
22:12:58 habb exit=130 in 353 s (stopped)
22:33:27 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1488498; work D:\code\Hadur_Robot\hadur-bench\work
22:33:27 skip haprep (already exit=0)
22:33:27 skip haaa (already exit=0)
22:33:27 start habb
22:33:27 watching habb: 2 stop rule(s)
22:33:29 progress pushed to origin claude/pc-melee-hand-progress (every 15 min)
22:34:28 progress habb: 6/276 (2%) battles, 357/h, ETA 45 min, 0 failed, skips 23.0/battle (last 100)
```
