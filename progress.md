# Queue pc-locks: progress

Updated 2026-11-22 09:05:46 PC time (09:05 UTC), runner pid 86484.

- `prep` pending
- `livematch` pending
- `lock` pending
- `gate` pending
- `pr` pending

### Queue log (last lines)

```
16:11:43 ALLDONE
07:49:39 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1544834; work D:\code\Hadur_Robot\hadur-bench\work
07:49:39 start prep
07:49:42 progress pushed to origin claude/pc-locks-progress (every 15 min)
07:51:48 prep exit=0 in 129 s
07:51:48 start livematch
07:51:48 watching livematch: 3 stop rule(s)
07:52:41 progress livematch: 26/124 (21%) battles, 1788/h, ETA 3 min, 0 failed, skips 5.5/battle (last 100), bb +0.27
07:59:42 livematch exit=3 in 473 s
07:59:44 alert issue: https://github.com/lgriffin/Hadur_Robot/issues/989
07:59:44 skip lock (after livematch, which has not finished exit=0)
07:59:44 skip gate (after lock, which has not finished exit=0)
07:59:44 skip pr (after gate, which has not finished exit=0)
07:59:44 ALLDONE
09:05:46 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1544834; work D:\code\Hadur_Robot\hadur-bench\work
```
