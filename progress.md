# Queue pc-team-endpower: progress

Updated 2026-11-17 23:50:27 PC time (23:50 UTC), runner pid 48596.

- `teprep` done, exit 0 in 2 min
- `tepep` running
- `tepilot` pending
- `tebb` pending
- `teep` pending
- `tegate` pending
- `tepr` pending

### tepep

**178 of 276 battles** (64%), 0 failed. Running 28 min, 379 battles/h, about 16 min left (ends ~00:05 PC time). Last battle 0 min ago.
Skipped turns a battle: 9.1 overall, first 100 12.8, last 100 5.3.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 60` | halt | ok | 0 failed of 178 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 60 over 200` | halt | waiting | 178 of 200 battles to read |

Stopping now would leave 98 battles unrun (about 16 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
23:20:14 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1544834; work D:\code\Hadur_Robot\hadur-bench\work
23:20:14 start teprep
23:20:16 progress pushed to origin claude/pc-team-endpower-progress (every 15 min)
23:22:16 teprep exit=0 in 121 s
23:22:16 start tepep
23:22:16 watching tepep: 3 stop rule(s)
23:23:15 progress tepep: 0/276 (0%) battles, 0 failed
```
