# Queue pc-sanaro-n07: progress

Updated 2026-11-01 09:17:45 PC time (09:17 UTC), runner pid 46892.

- `prep` done, exit 0 in 0 min
- `teach` done, exit 0 in 12 min
- `distill-report` done, exit 0 in 0 min
- `arms` done, exit 0 in 0 min
- `live-S2` running
- `live-HS` pending
- `live-HL` pending
- `live-HC` pending
- `read-live` pending
- `pr` pending

### teach

**129 of 129 battles** (100%), 0 failed. Running 12 min, 670 battles/h, about 0 min left (ends ~09:14 PC time). Last battle 0 min ago.
Skipped turns a battle: 78.9 overall, first 100 76.4, last 100 82.8.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 129 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 120 over 100` | halt | ok | 82.8 a battle over the last 100 (first 100: 76.4) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### live-S2

**50 of 430 battles** (12%), 0 failed. Running 3 min, 897 battles/h, about 25 min left (ends ~09:43 PC time). Last battle 1 min ago.
Skipped turns a battle: 0.0 overall, first 50 0.0, last 50 0.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 50 |
| `stall 30m` | halt | ok | last battle 1 min ago |
| `skips 40 over 100` | halt | waiting | 50 of 100 battles to read |

Stopping now would leave 380 battles unrun (about 25 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
03:49:47 alert issue: https://github.com/lgriffin/Hadur_Robot/issues/531
03:49:47 queue halted by a stop rule; fix the cause and rerun to resume (every fought battle is kept)
09:02:39 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1488498; work D:\code\Hadur_Robot\hadur-bench\work
09:02:39 skip prep (already exit=0)
09:02:39 start teach
09:02:39 watching teach: 3 stop rule(s)
09:02:41 progress pushed to origin claude/pc-sanaro-n07-progress (every 15 min)
09:03:39 progress teach: 6/129 (5%) battles, 357/h, ETA 21 min, 0 failed, skips 23.2/battle (last 100)
09:14:11 teach exit=0 in 692 s
09:14:11 start distill-report
09:14:15 distill-report exit=0 in 3 s
09:14:15 start arms
09:14:24 arms exit=0 in 9 s
09:14:24 start live-S2
09:14:24 watching live-S2: 3 stop rule(s)
```
