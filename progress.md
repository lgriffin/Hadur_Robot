# Queue pc-team-mirror: progress

Updated 2026-11-01 23:39:52 PC time (23:39 UTC), runner pid 45676.

- `mrprep` done, exit 0 in 1 min
- `mrogi` halted, exit 75 in 28 min, HALTED by fails 20: 24 failed of 267
- `mrhad` pending
- `mrread` pending
- `mrpr` pending

### mrogi

**267 of 540 battles** (49%), 24 failed. Running 28 min, 563 battles/h, about 29 min left (ends ~00:08 PC time). Last battle 0 min ago.
Skipped turns a battle: 1.4 overall, first 100 1.3, last 100 1.4.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | TRIPPED | 24 failed of 267 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 60 over 200` | halt | ok | 1.4 a battle over the last 200 (first 200: 1.3) |

Stopping now would leave 273 battles unrun (about 29 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
23:10:40 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1488498; work D:\code\Hadur_Robot\hadur-bench\work
23:10:40 start mrprep
23:10:42 progress pushed to origin claude/pc-team-mirror-progress (every 15 min)
23:11:26 mrprep exit=0 in 45 s
23:11:26 start mrogi
23:11:26 watching mrogi: 3 stop rule(s)
23:11:40 progress mrogi: 0/540 (0%) battles, 0 failed
23:39:52 STOP mrogi by rule fails 20: 24 failed of 267; 267 battles fought and kept, 273 battles left unrun (about 29 min)
23:39:52 mrogi exit=75 in 1706 s (halted, fails 20)
```
