# Queue pc-melee-surf: progress

Updated 2026-10-30 15:53:30 PC time (15:53 UTC), runner pid 30060.

- `msprep` done, exit 0 in 5 min
- `msaa` running
- `msbb` pending
- `msms` pending
- `msread` pending
- `mspr` pending

### msaa

**72 of 276 battles** (26%), 0 failed. Running 10 min, 415 battles/h, about 29 min left (ends ~16:22 PC time). Last battle 1 min ago.
Skipped turns a battle: 117.4 overall, first 72 117.4, last 72 117.4.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 72 |
| `stall 30m` | halt | ok | last battle 1 min ago |

Stopping now would leave 204 battles unrun (about 29 min); every battle already fought is kept and a rerun resumes from it.

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
