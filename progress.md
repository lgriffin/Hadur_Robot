# Queue pc-sanaro-n04: progress

Updated 2026-10-30 02:07:47 PC time (02:07 UTC), runner pid 66564.

- `prep` done, exit 0 in 0 min
- `live-S0` done, exit 0 in 31 min
- `live-GG` running
- `live-CL` pending
- `live-CL12` pending
- `live-CL22` pending
- `live-A` pending
- `live-EN` pending
- `live-D2` pending
- `read-live` pending
- `pr` pending

### live-S0

**430 of 430 battles** (100%), 0 failed. Running 31 min, 823 battles/h, about 0 min left (ends ~01:54 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 430 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.0 a battle over the last 100 (first 100: 0.0) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### live-GG

**193 of 430 battles** (45%), 0 failed. Running 14 min, 854 battles/h, about 17 min left (ends ~02:24 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 193 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.0 a battle over the last 100 (first 100: 0.0) |

Stopping now would leave 237 battles unrun (about 17 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
01:22:24 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1488498; work D:\code\Hadur_Robot\hadur-bench\work
01:22:24 start prep
01:22:28 progress pushed to origin claude/pc-sanaro-n04-progress (every 15 min)
01:22:51 prep exit=0 in 27 s
01:22:51 start live-S0
01:22:51 watching live-S0: 3 stop rule(s)
01:23:31 progress live-S0: 0/430 (0%) battles, 0 failed
01:53:40 progress live-S0: 420/430 (98%) battles, 818/h, ETA 1 min, 0 failed, skips 0.0/battle (last 100)
01:54:13 live-S0 exit=0 in 1881 s
01:54:13 start live-GG
01:54:13 watching live-GG: 3 stop rule(s)
```
