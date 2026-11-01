# Queue pc-team-mirror: progress

Updated 2026-11-01 23:25:46 PC time (23:25 UTC), runner pid 45676.

- `mrprep` done, exit 0 in 1 min
- `mrogi` running
- `mrhad` pending
- `mrread` pending
- `mrpr` pending

### mrogi

**108 of 540 battles** (20%), 0 failed. Running 14 min, 452 battles/h, about 57 min left (ends ~00:23 PC time). Last battle 0 min ago.
Skipped turns a battle: 1.4 overall, first 100 1.3, last 100 1.4.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 108 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 60 over 200` | halt | waiting | 108 of 200 battles to read |

Stopping now would leave 432 battles unrun (about 57 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
23:10:40 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1488498; work D:\code\Hadur_Robot\hadur-bench\work
23:10:40 start mrprep
23:10:42 progress pushed to origin claude/pc-team-mirror-progress (every 15 min)
23:11:26 mrprep exit=0 in 45 s
23:11:26 start mrogi
23:11:26 watching mrogi: 3 stop rule(s)
23:11:40 progress mrogi: 0/540 (0%) battles, 0 failed
```
