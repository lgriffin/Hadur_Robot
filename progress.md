# Queue pc-melee-floor: progress

Updated 2026-11-04 22:48:24 PC time (22:48 UTC), runner pid 37368.

- `mlprep` done, exit 0 in 3 min
- `mlpilot` running
- `mlcheck` pending
- `mlaa` pending
- `mlbb` pending
- `mlz4` pending
- `mlz5` pending
- `mlread` pending
- `mlpr` pending

### mlpilot

**31 of 184 battles** (17%), 0 failed. Running 12 min, 157 battles/h, about 58 min left (ends ~23:46 PC time). Last battle 0 min ago.
Skipped turns a battle: 22.1 overall, first 31 22.1, last 31 22.1.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 31 |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 153 battles unrun (about 58 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
22:33:18 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant calibrated; work D:\code\Hadur_Robot\hadur-bench\work
22:33:18 start mlprep
22:33:21 progress pushed to origin claude/pc-melee-floor-progress (every 15 min)
22:36:34 mlprep exit=0 in 195 s
22:36:34 start mlpilot
22:36:34 watching mlpilot: 2 stop rule(s)
22:37:20 progress mlpilot: 0/184 (0%) battles, 0 failed
```
