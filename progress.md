# Queue pc-melee-surf: progress

Updated 2026-10-30 16:08:37 PC time (16:08 UTC), runner pid 30060.

- `msprep` done, exit 0 in 5 min
- `msaa` running
- `msbb` pending
- `msms` pending
- `msread` pending
- `mspr` pending

### msaa

**252 of 276 battles** (91%), 0 failed. Running 26 min, 592 battles/h, about 2 min left (ends ~16:11 PC time). Last battle 0 min ago.
Skipped turns a battle: 88.4 overall, first 100 98.4, last 100 80.8.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 252 |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 24 battles unrun (about 2 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
15:38:23 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1488498; work D:\code\Hadur_Robot\hadur-bench\work
15:38:24 start msprep
15:38:28 progress pushed to origin claude/pc-melee-surf-progress (every 15 min)
15:43:04 msprep exit=0 in 280 s
15:43:05 start msaa
15:43:05 watching msaa: 2 stop rule(s)
15:43:25 progress msaa: 0/276 (0%) battles, 0 failed
```
