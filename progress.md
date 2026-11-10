# Queue pc-learn-trace: progress

Updated 2026-11-10 20:14:31 PC time (20:14 UTC), runner pid 37852.

- `prep` done, exit 0 in 0 min
- `trace` interrupted, exit 130 in 36 min
- `read` pending
- `pr` pending

### Queue log (last lines)

```
19:03:23 STOP trace by rule stall 30m: last battle 30 min ago; 2387 battles fought and kept, 1 battles left unrun (about 0 min)
19:03:23 trace exit=75 in 12214 s (halted, stall 30m)
19:03:26 alert issue: https://github.com/lgriffin/Hadur_Robot/issues/738
19:03:26 queue halted by a stop rule; fix the cause and rerun to resume (every fought battle is kept)
19:37:48 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant calibrated; work D:\code\Hadur_Robot\hadur-bench\work
19:37:48 skip prep (already exit=0)
19:37:48 start trace
19:37:48 watching trace: 3 stop rule(s)
19:37:50 progress pushed to origin claude/pc-learn-trace-progress (every 15 min)
19:38:49 progress trace: 2387/2388 (100%) battles, 0 failed, bb +1.87
20:09:05 progress trace: 2387/2388 (100%) battles, 2/h, ETA 30 min, 1 failed, bb +1.87
20:14:18 trace exit=130 in 2190 s (stopped)
20:14:18 stopped; rerun to resume from the interrupted steps
20:14:31 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant calibrated; work D:\code\Hadur_Robot\hadur-bench\work
20:14:31 skip prep (already exit=0)
```
