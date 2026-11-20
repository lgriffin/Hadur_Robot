# Queue pc-rc-confirm: progress

Updated 2026-11-20 08:41:41 PC time (08:41 UTC), runner pid 81432.

- `prep` done, exit 0 in 2 min
- `livematch` done, exit 0 in 0 min
- `field` halted, exit 75 in 25 min, HALTED by skips 60 over 200: 60.6 a battle over the last 200 (first 200: 46.1)
- `ret` pending
- `gate112` pending
- `gate` pending
- `pr` pending

### Queue log (last lines)

```
00:00:24 progress pushed to origin claude/pc-rc-confirm-progress (every 15 min)
00:02:02 prep exit=0 in 100 s
00:02:02 start livematch
00:02:02 watching livematch: 3 stop rule(s)
00:02:11 livematch exit=0 in 8 s
00:02:11 start field
00:02:11 watching field: 5 stop rule(s)
00:02:23 progress field: 0/7158 (0%) battles, 0 failed
00:27:39 STOP field by rule skips 60 over 200: 60.6 a battle over the last 200 (first 200: 46.1); 308 battles fought and kept, 6850 battles left unrun (about 9.4 h)
00:27:40 field exit=75 in 1529 s (halted, skips 60 over 200)
00:27:43 alert issue: https://github.com/lgriffin/Hadur_Robot/issues/947
00:27:43 queue halted by a stop rule; fix the cause and rerun to resume (every fought battle is kept)
08:41:41 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1544834; work D:\code\Hadur_Robot\hadur-bench\work
08:41:41 skip prep (already exit=0)
08:41:41 skip livematch (already exit=0)
```
