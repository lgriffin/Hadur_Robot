# Queue pc-shield-power: progress

Updated 2026-11-01 16:49:29 PC time (16:49 UTC), runner pid 3144.

- `prep` done, exit 0 in 2 min
- `screen` halted, exit 75 in 25 min, HALTED by aa after 20%: aa - c +0.84 pts over 200 robots, stop band ±0.78
- `gate` pending
- `pr` pending

### Queue log (last lines)

```
15:54:14 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1488498; work D:\code\Hadur_Robot\hadur-bench\work
15:54:14 start prep
15:54:17 progress pushed to origin claude/pc-shield-power-progress (every 15 min)
15:56:03 prep exit=0 in 108 s
15:56:03 start screen
15:56:03 watching screen: 5 stop rule(s)
15:56:16 progress screen: 0/4496 (0%) battles, 0 failed
16:20:36 STOP screen by rule aa after 20%: aa - c +0.84 pts over 200 robots, stop band ±0.78; 1217 battles fought and kept, 3279 battles left unrun (about 1.1 h)
16:20:36 screen exit=75 in 1473 s (halted, aa after 20%)
16:20:39 alert issue: https://github.com/lgriffin/Hadur_Robot/issues/558
16:20:39 queue halted by a stop rule; fix the cause and rerun to resume (every fought battle is kept)
16:49:29 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1488498; work D:\code\Hadur_Robot\hadur-bench\work
16:49:29 skip prep (already exit=0)
```
