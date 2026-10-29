# Queue pc-sanaro-n03: progress

Updated 2026-10-29 09:43:35 PC time (09:43 UTC), runner pid 44076.

- `prep` done, exit 0 in 0 min
- `live-S0` done, exit 0 in 29 min
- `live-T60` running
- `live-L10` pending
- `live-G18` pending
- `live-G36` pending
- `read-live` pending
- `pr` pending

### live-S0

**430 of 430 battles** (100%), 0 failed. Running 29 min, 900 battles/h, about 0 min left (ends ~09:42 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 430 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.0 a battle over the last 100 (first 100: 0.0) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### live-T60

**20 of 430 battles** (5%), 0 failed. Running 1 min, 882 battles/h, about 28 min left (ends ~10:11 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 20 0.0, last 20 0.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 20 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | waiting | 20 of 100 battles to read |

Stopping now would leave 410 battles unrun (about 28 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
09:13:20 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1488498; work D:\code\Hadur_Robot\hadur-bench\work
09:13:20 start prep
09:13:22 progress pushed to origin claude/pc-sanaro-n03-progress (every 15 min)
09:13:33 prep exit=0 in 12 s
09:13:33 start live-S0
09:13:33 watching live-S0: 3 stop rule(s)
09:14:20 progress live-S0: 7/430 (2%) battles, 531/h, ETA 48 min, 0 failed, skips 0.0/battle (last 100)
09:42:13 live-S0 exit=0 in 1720 s
09:42:13 start live-T60
09:42:13 watching live-T60: 3 stop rule(s)
```
