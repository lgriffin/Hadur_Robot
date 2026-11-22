# Queue pc-melee-race: progress

Updated 2026-11-22 21:52:16 PC time (21:52 UTC), runner pid 13504.

- `mrprep` done, exit 0 in 3 min
- `mraa` done, exit 0 in 48 min
- `mrbb` done, exit 0 in 47 min
- `mren` running
- `mrez` pending
- `mrread` pending
- `mrpr` pending

### mren

**405 of 460 battles** (88%), 0 failed. Running 45 min, 536 battles/h, about 6 min left (ends ~21:58 PC time). Last battle 0 min ago.
Skipped turns a battle: 37.9 overall, first 100 39.6, last 100 34.9.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 405 |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 55 battles unrun (about 6 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
16:01:47 watching mren: 2 stop rule(s)
16:28:16 progress mren: 220/460 (48%) battles, 498/h, ETA 29 min, 0 failed, skips 37.8/battle (last 100)
16:58:31 progress mren: 259/460 (56%) battles, 274/h, ETA 44 min, 0 failed, skips 36.8/battle (last 100)
17:04:34 STOP mren by rule stall 30m: last battle 31 min ago; 259 battles fought and kept, 201 battles left unrun (about 49 min)
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
```
