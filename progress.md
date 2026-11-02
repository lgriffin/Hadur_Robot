# Queue pc-melee-end: progress

Updated 2026-11-02 20:04:55 PC time (20:04 UTC), runner pid 51784.

- `meprep` done, exit 0 in 2 min
- `meaa` running
- `mebb` pending
- `meeg` pending
- `meek` pending
- `meread` pending
- `mepr` pending

### meaa

**150 of 276 battles** (54%), 0 failed. Running 28 min, 323 battles/h, about 23 min left (ends ~20:28 PC time). Last battle 1 min ago.
Skipped turns a battle: 27.7 overall, first 100 27.9, last 100 27.9.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 150 |
| `stall 30m` | halt | ok | last battle 1 min ago |

Stopping now would leave 126 battles unrun (about 23 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
19:34:41 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant calibrated; work D:\code\Hadur_Robot\hadur-bench\work
19:34:41 start meprep
19:34:43 progress pushed to origin claude/pc-melee-end-progress (every 15 min)
19:37:03 meprep exit=0 in 142 s
19:37:03 start meaa
19:37:03 watching meaa: 2 stop rule(s)
19:37:43 progress meaa: 0/276 (0%) battles, 0 failed
```
