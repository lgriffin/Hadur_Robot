# Queue pc-melee-scal: progress

Updated 2026-10-31 01:01:06 PC time (01:01 UTC), runner pid 64324.

- `scprep` done, exit 0 in 6 min
- `scaa` running
- `scbb` pending
- `scwm` pending
- `scxh` pending
- `scwq` pending
- `scbw` pending
- `scfv` pending
- `scec` pending
- `scbs` pending
- `scread` pending
- `scpr` pending

### scaa

**264 of 276 battles** (96%), 0 failed. Running 24 min, 666 battles/h, about 1 min left (ends ~01:02 PC time). Last battle 0 min ago.
Skipped turns a battle: 55.7 overall, first 100 47.1, last 100 63.3.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 264 |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 12 battles unrun (about 1 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
00:30:51 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1488498; work D:\code\Hadur_Robot\hadur-bench\work
00:30:51 start scprep
00:30:54 progress pushed to origin claude/pc-melee-scal-progress (every 15 min)
00:37:18 scprep exit=0 in 387 s
00:37:18 start scaa
00:37:18 watching scaa: 2 stop rule(s)
00:37:54 progress scaa: 0/276 (0%) battles, 0 failed
```
