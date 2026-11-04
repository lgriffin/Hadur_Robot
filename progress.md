# Queue pc-melee-floor: progress

Updated 2026-11-04 23:48:42 PC time (23:48 UTC), runner pid 37368.

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

**168 of 184 battles** (91%), 0 failed. Running 1.2 h, 140 battles/h, about 7 min left (ends ~23:55 PC time). Last battle 1 min ago.
Skipped turns a battle: 25.4 overall, first 100 23.8, last 100 27.1.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 168 |
| `stall 30m` | halt | ok | last battle 1 min ago |

Stopping now would leave 16 battles unrun (about 7 min); every battle already fought is kept and a rerun resumes from it.

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
23:37:39 progress mlpilot: 142/184 (77%) battles, 139/h, ETA 18 min, 0 failed, skips 25.9/battle (last 100)
```
