# Queue pc-shelf: progress

Updated 2026-11-04 08:34:25 PC time (08:34 UTC), runner pid 41756.

- `prep` done, exit 0 in 6 min
- `pilot-s` done, exit 0 in 5 min
- `screen-s` halted, exit 75 in 0 min, HALTED by aa after 20%: aa - c +3.02 pts over 33 robots, stop band ±2.36
- `pilot-u` pending
- `screen-u` pending
- `pick` pending
- `build` pending
- `confirm` pending
- `gate` pending
- `pr` pending

### Queue log (last lines)

```
23:13:17 progress pushed to origin claude/pc-shelf-progress (every 15 min)
23:19:07 prep exit=0 in 352 s
23:19:07 start pilot-s
23:19:07 watching pilot-s: 4 stop rule(s)
23:19:18 progress pilot-s: 0/231 (0%) battles, 0 failed
23:24:17 pilot-s exit=0 in 309 s
23:24:17 start screen-s
23:24:17 watching screen-s: 5 stop rule(s)
23:24:22 STOP screen-s by rule aa after 20%: aa - c +3.02 pts over 33 robots, stop band ±2.36; 231 battles fought and kept, 924 battles left unrun
23:24:22 screen-s exit=75 in 5 s (halted, aa after 20%)
23:24:24 alert issue: https://github.com/lgriffin/Hadur_Robot/issues/623
23:24:24 queue halted by a stop rule; fix the cause and rerun to resume (every fought battle is kept)
08:34:25 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant calibrated; work D:\code\Hadur_Robot\hadur-bench\work
08:34:25 skip prep (already exit=0)
08:34:25 skip pilot-s (already exit=0)
```
