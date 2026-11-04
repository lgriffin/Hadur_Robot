# Queue pc-melee-strong: progress

Updated 2026-11-04 00:24:47 PC time (00:24 UTC), runner pid 51528.

- `msprep` done, exit 0 in 3 min
- `mspilot` running
- `mscheck` pending
- `msaa` pending
- `msbb` pending
- `msk1` pending
- `msk2` pending
- `msread` pending
- `mspr` pending

### mspilot

**142 of 184 battles** (77%), 0 failed. Running 58 min, 148 battles/h, about 17 min left (ends ~00:41 PC time). Last battle 0 min ago.
Skipped turns a battle: 24.6 overall, first 100 24.9, last 100 24.5.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 142 |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 42 battles unrun (about 17 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
23:24:30 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant calibrated; work D:\code\Hadur_Robot\hadur-bench\work
23:24:30 start msprep
23:24:33 progress pushed to origin claude/pc-melee-strong-progress (every 15 min)
23:27:02 msprep exit=0 in 152 s
23:27:02 start mspilot
23:27:02 watching mspilot: 2 stop rule(s)
23:27:32 progress mspilot: 0/184 (0%) battles, 0 failed
23:57:39 progress mspilot: 80/184 (43%) battles, 157/h, ETA 40 min, 0 failed, skips 25.7/battle (last 100)
```
