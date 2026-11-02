# Queue pc-sanaro-n09: progress

Updated 2026-11-02 16:59:12 PC time (16:59 UTC), runner pid 25896.

- `prep` done, exit 0 in 0 min
- `arms` done, exit 0 in 0 min
- `live-S3` running
- `live-B560` pending
- `live-B480` pending
- `live-K80` pending
- `live-K65` pending
- `read-live` pending
- `pr` pending

### live-S3

**200 of 430 battles** (47%), 0 failed. Running 15 min, 814 battles/h, about 17 min left (ends ~17:16 PC time). Last battle 1 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 200 |
| `stall 30m` | halt | ok | last battle 1 min ago |
| `skips 40 over 100` | halt | ok | 0.0 a battle over the last 100 (first 100: 0.0) |

Stopping now would leave 230 battles unrun (about 17 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
16:44:06 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant calibrated; work D:\code\Hadur_Robot\hadur-bench\work
16:44:06 start prep
16:44:08 progress pushed to origin claude/pc-sanaro-n09-progress (every 15 min)
16:44:18 prep exit=0 in 12 s
16:44:18 start arms
16:44:27 arms exit=0 in 8 s
16:44:27 start live-S3
16:44:27 watching live-S3: 3 stop rule(s)
16:45:06 progress live-S3: 3/430 (1%) battles, 275/h, ETA 1.6 h, 0 failed, skips 0.0/battle (last 100)
```
