# Queue pc-sanaro-n10: progress

Updated 2026-11-03 07:05:59 PC time (07:05 UTC), runner pid 48284.

- `prep` done, exit 0 in 0 min
- `arms` done, exit 0 in 0 min
- `live-S3` running
- `live-B480` pending
- `live-B400` pending
- `live-B320` pending
- `live-B4K8` pending
- `read-live` pending
- `pr` pending

### live-S3

**780 of 860 battles** (91%), 0 failed. Running 45 min, 1041 battles/h, about 5 min left (ends ~07:10 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 780 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.0 a battle over the last 100 (first 100: 0.0) |

Stopping now would leave 80 battles unrun (about 5 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
06:20:41 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant calibrated; work D:\code\Hadur_Robot\hadur-bench\work
06:20:41 start prep
06:20:44 progress pushed to origin claude/pc-sanaro-n10-progress (every 15 min)
06:20:53 prep exit=0 in 11 s
06:20:53 start arms
06:21:02 arms exit=0 in 8 s
06:21:02 start live-S3
06:21:02 watching live-S3: 3 stop rule(s)
06:21:42 progress live-S3: 0/860 (0%) battles, 0 failed
06:51:54 progress live-S3: 420/860 (49%) battles, 816/h, ETA 32 min, 0 failed, skips 0.0/battle (last 100)
```
