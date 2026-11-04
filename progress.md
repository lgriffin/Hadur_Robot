# Queue pc-melee-floor: progress

Updated 2026-11-04 23:18:34 PC time (23:18 UTC), runner pid 37368.

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

**92 of 184 battles** (50%), 0 failed. Running 42 min, 131 battles/h, about 42 min left (ends ~00:00 PC time). Last battle 1 min ago.
Skipped turns a battle: 23.3 overall, first 92 23.3, last 92 23.3.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 92 |
| `stall 30m` | halt | ok | last battle 1 min ago |

Stopping now would leave 92 battles unrun (about 42 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
22:33:18 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant calibrated; work D:\code\Hadur_Robot\hadur-bench\work
22:33:18 start mlprep
22:33:21 progress pushed to origin claude/pc-melee-floor-progress (every 15 min)
22:36:34 mlprep exit=0 in 195 s
22:36:34 start mlpilot
22:36:34 watching mlpilot: 2 stop rule(s)
22:37:20 progress mlpilot: 0/184 (0%) battles, 0 failed
23:07:29 progress mlpilot: 82/184 (45%) battles, 159/h, ETA 38 min, 0 failed, skips 23.6/battle (last 100)
```
