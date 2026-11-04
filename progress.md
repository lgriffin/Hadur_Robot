# Queue pc-melee-floor: progress

Updated 2026-11-04 23:03:28 PC time (23:03 UTC), runner pid 37368.

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

**76 of 184 battles** (41%), 0 failed. Running 27 min, 170 battles/h, about 38 min left (ends ~23:41 PC time). Last battle 0 min ago.
Skipped turns a battle: 23.9 overall, first 76 23.9, last 76 23.9.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 76 |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 108 battles unrun (about 38 min); every battle already fought is kept and a rerun resumes from it.

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
