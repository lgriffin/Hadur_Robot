# Queue pc-melee-hand: progress

Updated 2026-10-31 21:54:31 PC time (21:54 UTC), runner pid 14072.

- `haprep` done, exit 0 in 3 min
- `haaa` running
- `habb` pending
- `haet` pending
- `haed` pending
- `haes` pending
- `haread` pending
- `hapr` pending

### haaa

**130 of 276 battles** (47%), 0 failed. Running 12 min, 663 battles/h, about 13 min left (ends ~22:07 PC time). Last battle 0 min ago.
Skipped turns a battle: 57.5 overall, first 100 63.8, last 100 56.4.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 130 |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 146 battles unrun (about 13 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
21:39:24 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1488498; work D:\code\Hadur_Robot\hadur-bench\work
21:39:24 start haprep
21:39:26 progress pushed to origin claude/pc-melee-hand-progress (every 15 min)
21:42:45 haprep exit=0 in 200 s
21:42:45 start haaa
21:42:45 watching haaa: 2 stop rule(s)
21:43:26 progress haaa: 0/276 (0%) battles, 0 failed
```
