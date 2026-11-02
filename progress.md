# Queue pc-team-mirror: progress

Updated 2026-11-02 08:46:48 PC time (08:46 UTC), runner pid 42096.

- `mrprep` done, exit 0 in 1 min
- `mrogi` done, exit 0 in 0 min
- `mrhad` running
- `mrread` skipped
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

**254 of 528 battles** (48%), 0 failed. Running 30 min, 506 battles/h, about 32 min left (ends ~09:19 PC time). Last battle 0 min ago.
Skipped turns a battle: 18.5 overall, first 100 19.1, last 100 19.4.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 254 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 60 over 200` | halt | ok | 18.5 a battle over the last 200 (first 200: 18.7) |

Stopping now would leave 274 battles unrun (about 32 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
00:20:20 progress mrogi: 532/540 (99%) battles, 1022/h, ETA 0 min, 24 failed, skips 1.5/battle (last 100)
00:21:43 mrogi exit=1 in 1955 s
00:21:43 skip mrhad (after mrogi, which has not finished exit=0)
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
```
