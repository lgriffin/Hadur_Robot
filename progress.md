# Queue pc-melee-floor: progress

Updated 2026-11-04 23:33:38 PC time (23:33 UTC), runner pid 37368.

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

**132 of 184 battles** (72%), 0 failed. Running 57 min, 139 battles/h, about 22 min left (ends ~23:56 PC time). Last battle 0 min ago.
Skipped turns a battle: 24.9 overall, first 100 23.8, last 100 25.6.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 132 |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 52 battles unrun (about 22 min); every battle already fought is kept and a rerun resumes from it.

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
