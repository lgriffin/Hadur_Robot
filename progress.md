# Queue pc-team-mirror: progress

Updated 2026-11-01 23:49:07 PC time (23:49 UTC), runner pid 5104.

- `mrprep` done, exit 0 in 1 min
- `mrogi` halted, exit 75 in 28 min, HALTED by fails 20: 24 failed of 267
- `mrhad` pending
- `mrread` pending
- `mrpr` pending

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
23:39:52 queue halted by a stop rule; fix the cause and rerun to resume (every fought battle is kept)
23:49:07 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1488498; work D:\code\Hadur_Robot\hadur-bench\work
23:49:07 skip mrprep (already exit=0)
```
