# Queue pc-melee-hand: progress

Updated 2026-10-31 23:18:51 PC time (23:18 UTC), runner pid 39612.

- `haprep` done, exit 0 in 3 min
- `haaa` done, exit 0 in 24 min
- `habb` done, exit 0 in 24 min
- `haet` running
- `haed` pending
- `haes` pending
- `haread` pending
- `hapr` pending

### habb

**276 of 276 battles** (100%), 0 failed. Running 24 min, 683 battles/h, about 0 min left (ends ~22:57 PC time). Last battle 0 min ago.
Skipped turns a battle: 66.6 overall, first 100 55.8, last 100 82.1.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 276 |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### haet

**234 of 276 battles** (85%), 0 failed. Running 21 min, 663 battles/h, about 4 min left (ends ~23:22 PC time). Last battle 0 min ago.
Skipped turns a battle: 66.9 overall, first 100 60.0, last 100 68.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 234 |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 42 battles unrun (about 4 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
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
22:57:42 habb exit=0 in 1454 s
22:57:42 start haet
22:57:42 watching haet: 2 stop rule(s)
23:04:43 progress haet: 73/276 (26%) battles, 623/h, ETA 20 min, 0 failed, skips 60.5/battle (last 100)
```
