# Queue pc-sanaro-n12: progress

Updated 2026-11-05 16:39:57 PC time (16:39 UTC), runner pid 55620.

- `prep` done, exit 0 in 0 min
- `arms` done, exit 0 in 0 min
- `pilot-S4` done, exit 0 in 10 min
- `pilot-K7` running
- `pilot-K5` pending
- `pilot-K3` pending
- `pilot` pending
- `live-S4` pending
- `live-K7` pending
- `live-K5` pending
- `live-K3` pending
- `read-live` pending
- `pr` pending

### pilot-S4

**172 of 172 battles** (100%), 0 failed. Running 10 min, 1075 battles/h, about 0 min left (ends ~16:34 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 172 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.0 a battle over the last 100 (first 100: 0.0) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### pilot-K7

**80 of 172 battles** (47%), 0 failed. Running 5 min, 931 battles/h, about 6 min left (ends ~16:45 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 80 0.0, last 80 0.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 80 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | waiting | 80 of 100 battles to read |

Stopping now would leave 92 battles unrun (about 6 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
16:24:49 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant calibrated; work D:\code\Hadur_Robot\hadur-bench\work
16:24:49 start prep
16:24:52 progress pushed to origin claude/pc-sanaro-n12-progress (every 15 min)
16:25:01 prep exit=0 in 11 s
16:25:01 start arms
16:25:11 arms exit=0 in 9 s
16:25:11 start pilot-S4
16:25:11 watching pilot-S4: 3 stop rule(s)
16:25:50 progress pilot-S4: 8/172 (5%) battles, 734/h, ETA 13 min, 0 failed, skips 0.0/battle (last 100)
16:34:47 pilot-S4 exit=0 in 576 s
16:34:47 start pilot-K7
16:34:47 watching pilot-K7: 3 stop rule(s)
```
