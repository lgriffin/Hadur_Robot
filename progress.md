# Queue pc-sanaro-n08: progress

Updated 2026-11-02 10:40:25 PC time (10:40 UTC), runner pid 6164.

- `prep` done, exit 0 in 1 min
- `teach` done, exit 0 in 24 min
- `distill-report` done, exit 0 in 0 min
- `arms` done, exit 0 in 0 min
- `live-S3` running
- `live-HL2` pending
- `live-DE` pending
- `live-DAE` pending
- `live-DAO` pending
- `read-live` pending
- `pr` pending

### teach

**258 of 258 battles** (100%), 0 failed. Running 24 min, 632 battles/h, about 0 min left (ends ~10:35 PC time). Last battle 0 min ago.
Skipped turns a battle: 28.9 overall, first 100 38.6, last 100 20.9.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 258 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 120 over 100` | halt | ok | 20.9 a battle over the last 100 (first 100: 38.6) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### live-S3

**60 of 430 battles** (14%), 0 failed. Running 4 min, 801 battles/h, about 28 min left (ends ~11:08 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 60 0.0, last 60 0.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 60 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | waiting | 60 of 100 battles to read |

Stopping now would leave 370 battles unrun (about 28 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
10:10:10 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1488498; work D:\code\Hadur_Robot\hadur-bench\work
10:10:10 start prep
10:10:12 progress pushed to origin claude/pc-sanaro-n08-progress (every 15 min)
10:10:49 prep exit=0 in 39 s
10:10:49 start teach
10:10:49 watching teach: 3 stop rule(s)
10:11:10 progress teach: 0/258 (0%) battles, 0 failed
10:35:19 teach exit=0 in 1469 s
10:35:19 start distill-report
10:35:38 distill-report exit=0 in 19 s
10:35:38 start arms
10:35:56 arms exit=0 in 17 s
10:35:56 start live-S3
10:35:56 watching live-S3: 3 stop rule(s)
```
