# Queue pc-k0-oracle: progress

Updated 2026-10-29 04:45:00 PC time (04:45 UTC), runner pid 50308.

- `prep` done, exit 0 in 1 min
- `record` running
- `join` pending
- `score` pending
- `pr` pending

### record

**306 of 864 battles** (35%), 0 failed. Running 14 min, 1276 battles/h, about 26 min left (ends ~05:11 PC time). Last battle 0 min ago.
Skipped turns a battle: 24.0 overall, first 100 23.4, last 100 28.1.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 306 |
| `skips 40 over 200` | halt | ok | 24.6 a battle over the last 200 (first 200: 22.2) |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 558 battles unrun (about 26 min); every battle already fought is kept and a rerun resumes from it.

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
