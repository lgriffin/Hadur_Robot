# Queue pc-melee-floor: progress

Updated 2026-11-05 00:18:56 PC time (00:18 UTC), runner pid 37368.

- `mlprep` done, exit 0 in 3 min
- `mlpilot` done, exit 0 in 1.3 h
- `mlcheck` done, exit 0 in 0 min
- `mlaa` running
- `mlbb` pending
- `mlz4` pending
- `mlz5` pending
- `mlread` pending
- `mlpr` pending

### mlpilot

**184 of 184 battles** (100%), 0 failed. Running 1.3 h, 140 battles/h, about 0 min left (ends ~23:55 PC time). Last battle 0 min ago.
Skipped turns a battle: 25.3 overall, first 100 23.8, last 100 26.9.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 184 |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### mlaa

**124 of 276 battles** (45%), 0 failed. Running 24 min, 314 battles/h, about 29 min left (ends ~00:47 PC time). Last battle 0 min ago.
Skipped turns a battle: 33.4 overall, first 100 32.8, last 100 33.8.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 124 |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 152 battles unrun (about 29 min); every battle already fought is kept and a rerun resumes from it.

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
23:55:14 mlpilot exit=0 in 4720 s
23:55:14 start mlcheck
23:55:15 mlcheck exit=0 in 1 s
23:55:15 start mlaa
23:55:15 watching mlaa: 2 stop rule(s)
00:07:50 progress mlaa: 66/276 (24%) battles, 315/h, ETA 40 min, 0 failed, skips 33.1/battle (last 100)
```
