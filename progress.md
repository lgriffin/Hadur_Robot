# Queue pc-sanaro-n11: progress

Updated 2026-11-05 14:43:42 PC time (14:43 UTC), runner pid 62452.

- `prep` done, exit 0 in 0 min
- `arms` done, exit 0 in 0 min
- `pilot-S4` done, exit 0 in 9 min
- `pilot-H512` running
- `pilot-H480` pending
- `pilot-H400` pending
- `pilot` pending
- `live-S4` pending
- `live-H512` pending
- `live-H480` pending
- `live-H400` pending
- `read-live` pending
- `pr` pending

### pilot-S4

**172 of 172 battles** (100%), 0 failed. Running 9 min, 1125 battles/h, about 0 min left (ends ~14:38 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 172 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.0 a battle over the last 100 (first 100: 0.0) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### pilot-H512

**90 of 172 battles** (52%), 0 failed. Running 5 min, 983 battles/h, about 5 min left (ends ~14:48 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 90 0.0, last 90 0.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 90 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | waiting | 90 of 100 battles to read |

Stopping now would leave 82 battles unrun (about 5 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
14:28:35 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant calibrated; work D:\code\Hadur_Robot\hadur-bench\work
14:28:35 start prep
14:28:38 progress pushed to origin claude/pc-sanaro-n11-progress (every 15 min)
14:28:53 prep exit=0 in 17 s
14:28:53 start arms
14:29:02 arms exit=0 in 9 s
14:29:02 start pilot-S4
14:29:02 watching pilot-S4: 3 stop rule(s)
14:29:36 progress pilot-S4: 8/172 (5%) battles, 866/h, ETA 11 min, 0 failed, skips 0.0/battle (last 100)
14:38:13 pilot-S4 exit=0 in 550 s
14:38:13 start pilot-H512
14:38:13 watching pilot-H512: 3 stop rule(s)
```
