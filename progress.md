# Queue pc-melee-race: progress

Updated 2026-11-22 15:09:43 PC time (15:09 UTC), runner pid 88008.

- `mrprep` done, exit 0 in 3 min
- `mraa` running
- `mrbb` pending
- `mren` pending
- `mrez` pending
- `mrread` pending
- `mrpr` pending

### mraa

**410 of 460 battles** (89%), 0 failed. Running 43 min, 578 battles/h, about 5 min left (ends ~15:14 PC time). Last battle 0 min ago.
Skipped turns a battle: 35.9 overall, first 100 34.1, last 100 36.4.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 410 |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 50 battles unrun (about 5 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
14:24:24 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1544834; work D:\code\Hadur_Robot\hadur-bench\work
14:24:24 start mrprep
14:24:27 progress pushed to origin claude/pc-melee-race-progress (every 15 min)
14:27:11 mrprep exit=0 in 166 s
14:27:11 start mraa
14:27:11 watching mraa: 2 stop rule(s)
14:27:26 progress mraa: 0/460 (0%) battles, 0 failed
14:57:38 progress mraa: 260/460 (57%) battles, 512/h, ETA 23 min, 0 failed, skips 36.9/battle (last 100)
```
