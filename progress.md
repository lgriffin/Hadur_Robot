# Queue pc-melee-end: progress

Updated 2026-11-02 20:20:03 PC time (20:20 UTC), runner pid 51784.

- `meprep` done, exit 0 in 2 min
- `meaa` running
- `mebb` pending
- `meeg` pending
- `meek` pending
- `meread` pending
- `mepr` pending

### meaa

**264 of 276 battles** (96%), 0 failed. Running 43 min, 368 battles/h, about 2 min left (ends ~20:22 PC time). Last battle 0 min ago.
Skipped turns a battle: 27.9 overall, first 100 27.9, last 100 27.9.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 264 |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 12 battles unrun (about 2 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
19:34:41 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant calibrated; work D:\code\Hadur_Robot\hadur-bench\work
19:34:41 start meprep
19:34:43 progress pushed to origin claude/pc-melee-end-progress (every 15 min)
19:37:03 meprep exit=0 in 142 s
19:37:03 start meaa
19:37:03 watching meaa: 2 stop rule(s)
19:37:43 progress meaa: 0/276 (0%) battles, 0 failed
20:07:57 progress meaa: 174/276 (63%) battles, 338/h, ETA 18 min, 0 failed, skips 28.0/battle (last 100)
```
