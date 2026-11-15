# Queue pc-team-momentum: progress

Updated 2026-11-15 09:30:13 PC time (09:30 UTC), runner pid 55920.

- `tmprep` done, exit 0 in 3 min
- `tmpmo` done, exit 0 in 37 min
- `tmpmod` running
- `tmpilot` pending
- `tmbb` pending
- `tmmo` pending
- `tmmod` pending
- `tmgate` pending
- `tmpr` pending

### tmpmo

**270 of 276 battles** (98%), 0 failed. Running 37 min, 436 battles/h, about 1 min left (ends ~08:55 PC time). Last battle 0 min ago.
Skipped turns a battle: 7.1 overall, first 100 11.9, last 100 4.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 60` | halt | ok | 0 failed of 270 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 60 over 200` | halt | ok | 4.9 a battle over the last 200 (first 200: 8.2) |

Stopping now would leave 6 battles unrun (about 1 min); every battle already fought is kept and a rerun resumes from it.

### tmpmod

**243 of 276 battles** (88%), 0 failed. Running 36 min, 410 battles/h, about 5 min left (ends ~09:35 PC time). Last battle 0 min ago.
Skipped turns a battle: 8.0 overall, first 100 12.7, last 100 4.2.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 60` | halt | ok | 0 failed of 243 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 60 over 200` | halt | ok | 6.0 a battle over the last 200 (first 200: 8.7) |

Stopping now would leave 33 battles unrun (about 5 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
04:37:42 start mtpr
04:37:48 mtpr exit=0 in 5 s
04:37:48 ALLDONE
08:14:43 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1544834; work D:\code\Hadur_Robot\hadur-bench\work
08:14:43 start tmprep
08:14:46 progress pushed to origin claude/pc-team-momentum-progress (every 15 min)
08:17:26 tmprep exit=0 in 162 s
08:17:26 start tmpmo
08:17:26 watching tmpmo: 3 stop rule(s)
08:17:44 progress tmpmo: 0/276 (0%) battles, 0 failed
08:47:56 progress tmpmo: 215/276 (78%) battles, 423/h, ETA 9 min, 0 failed, skips 3.8/battle (last 100)
08:54:38 tmpmo exit=0 in 2231 s
08:54:38 start tmpmod
08:54:38 watching tmpmod: 3 stop rule(s)
09:18:08 progress tmpmod: 162/276 (59%) battles, 414/h, ETA 17 min, 0 failed, skips 6.1/battle (last 100)
```
