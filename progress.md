# Queue pc-r31: progress

Updated 2026-11-14 10:39:12 PC time (10:39 UTC), runner pid 38732.

- `prep` done, exit 0 in 6 min
- `screen` done, exit 0 in 1.4 h
- `pick` done, exit 0 in 3 min
- `lock` halted, exit 75 in 25 min, HALTED by aa after 20%: aa - c -1.39 pts over 11 robots, stop band ±1.38 (observed spread)
- `gate` skipped
- `pr` skipped

### Queue log (last lines)

```
09:49:12 skip screen (already exit=0)
09:49:12 start pick
09:49:14 progress pushed to origin claude/pc-r31-progress (every 15 min)
09:52:32 pick exit=0 in 200 s
09:52:32 start lock
09:52:32 watching lock: 5 stop rule(s)
09:53:14 progress lock: 14/924 (2%) battles, 1221/h, ETA 45 min, 0 failed, skips 13.1/battle (last 100)
10:17:28 STOP lock by rule aa after 20%: aa - c -1.39 pts over 11 robots, stop band ±1.38 (observed spread); 717 battles fought and kept, 207 battles left unrun (about 7 min)
10:17:28 lock exit=75 in 1496 s (halted, aa after 20%)
10:17:30 alert issue: https://github.com/lgriffin/Hadur_Robot/issues/816
10:17:30 queue halted by a stop rule; fix the cause and rerun to resume (every fought battle is kept)
10:39:12 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant calibrated; work D:\code\Hadur_Robot\hadur-bench\work
10:39:12 skip prep (already exit=0)
10:39:12 skip screen (already exit=0)
10:39:12 skip pick (already exit=0)
```
