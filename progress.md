# Queue pc-team-mirror: progress

Updated 2026-11-02 08:16:34 PC time (08:16 UTC), runner pid 42096.

- `mrprep` done, exit 0 in 1 min
- `mrogi` failed, exit 1 in 33 min
- `mrhad` skipped
- `mrread` skipped
- `mrpr` skipped

### Queue log (last lines)

```
23:49:07 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1488498; work D:\code\Hadur_Robot\hadur-bench\work
23:49:07 skip mrprep (already exit=0)
23:49:07 start mrogi
23:49:07 watching mrogi: 3 stop rule(s), shown only
23:49:09 progress pushed to origin claude/pc-team-mirror-progress (every 15 min)
23:50:08 progress mrogi: 243/540 (45%) battles, 14456/h, ETA 1 min, 3 failed, skips 1.4/battle (last 100)
23:51:08 stop rule fails 20 would trip on mrogi (24 failed of 267); not acted on
00:20:20 progress mrogi: 532/540 (99%) battles, 1022/h, ETA 0 min, 24 failed, skips 1.5/battle (last 100)
00:21:43 mrogi exit=1 in 1955 s
00:21:43 skip mrhad (after mrogi, which has not finished exit=0)
00:21:43 skip mrread (after mrhad, which has not finished exit=0)
00:21:43 skip mrpr (after mrread, which has not finished exit=0)
00:21:43 ALLDONE
08:16:34 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1488498; work D:\code\Hadur_Robot\hadur-bench\work
08:16:34 skip mrprep (already exit=0)
```
