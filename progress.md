# Queue pc-k0-oracle: progress

Updated 2026-10-29 05:00:09 PC time (05:00 UTC), runner pid 50308.

- `prep` done, exit 0 in 1 min
- `record` running
- `join` pending
- `score` pending
- `pr` pending

### record

**692 of 864 battles** (80%), 0 failed. Running 30 min, 1406 battles/h, about 7 min left (ends ~05:07 PC time). Last battle 0 min ago.
Skipped turns a battle: 26.9 overall, first 100 23.4, last 100 30.8.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 692 |
| `skips 40 over 200` | halt | ok | 29.1 a battle over the last 200 (first 200: 22.2) |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 172 battles unrun (about 7 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
04:29:53 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1488498; work D:\code\Hadur_Robot\hadur-bench\work
04:29:53 start prep
04:29:55 progress pushed to origin claude/pc-k0-oracle-progress (every 15 min)
04:30:37 prep exit=0 in 43 s
04:30:37 start record
04:30:37 watching record: 3 stop rule(s)
04:30:53 progress record: 0/864 (0%) battles, 0 failed
```
