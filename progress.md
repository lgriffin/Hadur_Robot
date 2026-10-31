# Queue pc-sanaro-n06: progress

Updated 2026-10-31 19:46:10 PC time (19:46 UTC), runner pid 58568.

- `prep` done, exit 0 in 0 min
- `teach` done, exit 0 in 15 min
- `distill-report` done, exit 0 in 0 min
- `arms` done, exit 0 in 0 min
- `live-S2` running
- `live-HT` pending
- `live-HD` pending
- `live-HS` pending
- `read-live` pending
- `pr` pending

### teach

**130 of 130 battles** (100%), 0 failed. Running 15 min, 521 battles/h, about 0 min left (ends ~19:15 PC time). Last battle 0 min ago.
Skipped turns a battle: 34.7 overall, first 100 33.9, last 100 32.4.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 130 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 32.4 a battle over the last 100 (first 100: 33.9) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### live-S2

**427 of 430 battles** (99%), 0 failed. Running 30 min, 853 battles/h, about 0 min left (ends ~19:46 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 427 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.0 a battle over the last 100 (first 100: 0.0) |

Stopping now would leave 3 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
19:00:48 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1488498; work D:\code\Hadur_Robot\hadur-bench\work
19:00:48 start prep
19:00:50 progress pushed to origin claude/pc-sanaro-n06-progress (every 15 min)
19:00:56 prep exit=0 in 8 s
19:00:56 start teach
19:00:56 watching teach: 3 stop rule(s)
19:01:48 progress teach: 0/130 (0%) battles, 0 failed
19:15:55 teach exit=0 in 898 s
19:15:55 start distill-report
19:15:58 distill-report exit=0 in 2 s
19:15:58 start arms
19:16:07 arms exit=0 in 9 s
19:16:07 start live-S2
19:16:07 watching live-S2: 3 stop rule(s)
19:32:03 progress live-S2: 200/430 (47%) battles, 754/h, ETA 18 min, 0 failed, skips 0.0/battle (last 100)
```
