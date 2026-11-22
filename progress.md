# Queue pc-melee-race: progress

Updated 2026-11-22 14:54:37 PC time (14:54 UTC), runner pid 88008.

- `mrprep` done, exit 0 in 3 min
- `mraa` running
- `mrbb` pending
- `mren` pending
- `mrez` pending
- `mrread` pending
- `mrpr` pending

### mraa

**228 of 460 battles** (50%), 0 failed. Running 27 min, 499 battles/h, about 28 min left (ends ~15:22 PC time). Last battle 0 min ago.
Skipped turns a battle: 35.7 overall, first 100 34.1, last 100 36.7.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 228 |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 232 battles unrun (about 28 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
14:24:24 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1544834; work D:\code\Hadur_Robot\hadur-bench\work
14:24:24 start mrprep
14:24:27 progress pushed to origin claude/pc-melee-race-progress (every 15 min)
14:27:11 mrprep exit=0 in 166 s
14:27:11 start mraa
14:27:11 watching mraa: 2 stop rule(s)
14:27:26 progress mraa: 0/460 (0%) battles, 0 failed
```
