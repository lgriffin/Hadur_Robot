# Queue pc-rc-confirm: progress

Updated 2026-11-20 12:35:39 PC time (12:35 UTC), runner pid 48084.

- `prep` done, exit 0 in 2 min
- `livematch` done, exit 0 in 0 min
- `field` halted, exit 75 in 20 min, HALTED by skips 60 over 200: 61.4 a battle over the last 200 (first 200: 59.2)
- `ret` pending
- `gate112` pending
- `gate` pending
- `pr` pending

### Queue log (last lines)

```
00:27:43 queue halted by a stop rule; fix the cause and rerun to resume (every fought battle is kept)
08:41:41 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1544834; work D:\code\Hadur_Robot\hadur-bench\work
08:41:41 skip prep (already exit=0)
08:41:41 skip livematch (already exit=0)
08:41:41 start field
08:41:41 watching field: 5 stop rule(s)
08:41:43 progress pushed to origin claude/pc-rc-confirm-progress (every 15 min)
08:42:41 progress field: 308/7158 (4%) battles, 0 failed, rel +0.09, aa +0.05
09:01:54 STOP field by rule skips 60 over 200: 61.4 a battle over the last 200 (first 200: 59.2); 521 battles fought and kept, 6637 battles left unrun (about 10.5 h)
09:01:55 field exit=75 in 1213 s (halted, skips 60 over 200)
09:01:57 alert issue: https://github.com/lgriffin/Hadur_Robot/issues/953
09:01:57 queue halted by a stop rule; fix the cause and rerun to resume (every fought battle is kept)
12:35:39 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1544834; work D:\code\Hadur_Robot\hadur-bench\work
12:35:39 skip prep (already exit=0)
12:35:39 skip livematch (already exit=0)
```
