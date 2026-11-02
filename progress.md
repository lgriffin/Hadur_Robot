# Queue pc-sanaro-n09: progress

Updated 2026-11-02 17:14:17 PC time (17:14 UTC), runner pid 25896.

- `prep` done, exit 0 in 0 min
- `arms` done, exit 0 in 0 min
- `live-S3` done, exit 0 in 27 min
- `live-B560` running
- `live-B480` pending
- `live-K80` pending
- `live-K65` pending
- `read-live` pending
- `pr` pending

### live-S3

**430 of 430 battles** (100%), 0 failed. Running 27 min, 948 battles/h, about 0 min left (ends ~17:11 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 430 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.0 a battle over the last 100 (first 100: 0.0) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### live-B560

**40 of 430 battles** (9%), 0 failed. Running 3 min, 917 battles/h, about 26 min left (ends ~17:39 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 40 0.0, last 40 0.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 40 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | waiting | 40 of 100 battles to read |

Stopping now would leave 390 battles unrun (about 26 min); every battle already fought is kept and a rerun resumes from it.

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
17:11:40 live-S3 exit=0 in 1633 s
17:11:40 start live-B560
17:11:40 watching live-B560: 3 stop rule(s)
```
