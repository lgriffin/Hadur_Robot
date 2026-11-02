# Queue pc-sanaro-n08: progress

Updated 2026-11-02 10:25:17 PC time (10:25 UTC), runner pid 6164.

- `prep` done, exit 0 in 1 min
- `teach` running
- `distill-report` pending
- `arms` pending
- `live-S3` pending
- `live-HL2` pending
- `live-DE` pending
- `live-DAE` pending
- `live-DAO` pending
- `read-live` pending
- `pr` pending

### teach

**131 of 258 battles** (51%), 0 failed. Running 14 min, 543 battles/h, about 14 min left (ends ~10:39 PC time). Last battle 0 min ago.
Skipped turns a battle: 36.6 overall, first 100 38.6, last 100 40.4.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 131 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 120 over 100` | halt | ok | 40.4 a battle over the last 100 (first 100: 38.6) |

Stopping now would leave 127 battles unrun (about 14 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
10:10:10 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1488498; work D:\code\Hadur_Robot\hadur-bench\work
10:10:10 start prep
10:10:12 progress pushed to origin claude/pc-sanaro-n08-progress (every 15 min)
10:10:49 prep exit=0 in 39 s
10:10:49 start teach
10:10:49 watching teach: 3 stop rule(s)
10:11:10 progress teach: 0/258 (0%) battles, 0 failed
```
