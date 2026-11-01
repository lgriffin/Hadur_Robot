# Queue pc-surf-key: progress

Updated 2026-11-01 12:44:12 PC time (12:44 UTC), runner pid 71784.

- `prep` done, exit 0 in 1 min
- `record` done, exit 0 in 19 min
- `fit` running
- `confirm` pending
- `gate` pending
- `pr` pending

### record

**792 of 792 battles** (100%), 0 failed. Running 19 min, 2512 battles/h, about 0 min left (ends ~12:34 PC time). Last battle 0 min ago.
Skipped turns a battle: 18.3 overall, first 100 18.6, last 100 17.6.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 792 |
| `skips 40 over 200` | halt | ok | 18.9 a battle over the last 200 (first 200: 18.7) |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
10:27:53 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1488498; work D:\code\Hadur_Robot\hadur-bench\work
10:27:53 start prep
10:28:02 progress pushed to origin claude/pc-surf-key-progress (every 15 min)
10:29:02 prep exit=130 in 68 s (stopped)
12:13:57 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1488498; work D:\code\Hadur_Robot\hadur-bench\work
12:13:57 start prep
12:13:59 progress pushed to origin claude/pc-surf-key-progress (every 15 min)
12:15:17 prep exit=0 in 79 s
12:15:17 start record
12:15:17 watching record: 3 stop rule(s)
12:15:58 progress record: 10/792 (1%) battles, 872/h, ETA 54 min, 0 failed, skips 16.4/battle (last 100)
12:34:12 record exit=0 in 1134 s
12:34:12 start fit
```
