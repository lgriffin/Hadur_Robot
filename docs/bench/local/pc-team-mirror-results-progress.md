# Queue pc-team-mirror: progress

Updated 2026-11-02 09:15:00 PC time (09:15 UTC), runner pid 42096.

- `mrprep` done, exit 0 in 1 min
- `mrogi` done, exit 0 in 0 min
- `mrhad` done, exit 0 in 58 min
- `mrread` running
- `mrpr` skipped

### mrogi

**528 of 528 battles** (100%), 0 failed. Running 0 min, 262990 battles/h, about 0 min left (ends ~08:16 PC time). Last battle 0 min ago.
Skipped turns a battle: 1.5 overall, first 100 1.3, last 100 1.4.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 528 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 60 over 200` | halt | ok | 1.4 a battle over the last 200 (first 200: 1.3) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### mrhad

**528 of 528 battles** (100%), 0 failed. Running 58 min, 545 battles/h, about 0 min left (ends ~09:14 PC time). Last battle 0 min ago.
Skipped turns a battle: 16.9 overall, first 100 19.1, last 100 15.3.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 528 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 60 over 200` | halt | ok | 15.4 a battle over the last 200 (first 200: 18.7) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
00:21:43 skip mrread (after mrhad, which has not finished exit=0)
00:21:43 skip mrpr (after mrread, which has not finished exit=0)
00:21:43 ALLDONE
08:16:34 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1488498; work D:\code\Hadur_Robot\hadur-bench\work
08:16:34 skip mrprep (already exit=0)
08:16:34 start mrogi
08:16:34 watching mrogi: 3 stop rule(s)
08:16:36 progress pushed to origin claude/pc-team-mirror-progress (every 15 min)
08:16:41 mrogi exit=0 in 7 s
08:16:41 start mrhad
08:16:41 watching mrhad: 3 stop rule(s)
08:17:35 progress mrhad: 0/528 (0%) battles, 0 failed
08:47:48 progress mrhad: 264/528 (50%) battles, 509/h, ETA 31 min, 0 failed, skips 19.3/battle (last 100)
09:14:46 mrhad exit=0 in 3484 s
09:14:46 start mrread
```
