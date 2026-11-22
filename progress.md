# Queue pc-melee-race: progress

Updated 2026-11-22 22:37:36 PC time (22:37 UTC), runner pid 13504.

- `mrprep` done, exit 0 in 3 min
- `mraa` done, exit 0 in 48 min
- `mrbb` done, exit 0 in 47 min
- `mren` done, exit 0 in 51 min
- `mrez` running
- `mrread` pending
- `mrpr` pending

### mren

**460 of 460 battles** (100%), 0 failed. Running 51 min, 543 battles/h, about 0 min left (ends ~21:57 PC time). Last battle 0 min ago.
Skipped turns a battle: 37.2 overall, first 100 39.6, last 100 33.2.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 460 |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### mrez

**350 of 460 battles** (76%), 0 failed. Running 40 min, 527 battles/h, about 13 min left (ends ~22:50 PC time). Last battle 0 min ago.
Skipped turns a battle: 35.7 overall, first 100 36.2, last 100 34.1.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 350 |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 110 battles unrun (about 13 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
17:04:35 mren exit=75 in 3767 s (halted, stall 30m)
17:04:35 queue halted by a stop rule; fix the cause and rerun to resume (every fought battle is kept)
21:06:57 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1544834; work D:\code\Hadur_Robot\hadur-bench\work
21:06:57 skip mrprep (already exit=0)
21:06:57 skip mraa (already exit=0)
21:06:57 skip mrbb (already exit=0)
21:06:57 start mren
21:06:57 watching mren: 2 stop rule(s)
21:07:01 progress pushed to origin claude/pc-melee-race-progress (every 15 min)
21:07:57 progress mren: 0/460 (0%) battles, 0 failed
21:38:10 progress mren: 240/460 (52%) battles, 461/h, ETA 29 min, 0 failed, skips 39.1/battle (last 100)
21:57:46 mren exit=0 in 3049 s
21:57:46 start mrez
21:57:46 watching mrez: 2 stop rule(s)
22:08:23 progress mrez: 80/460 (17%) battles, 452/h, ETA 50 min, 0 failed, skips 35.6/battle (last 100)
```
