# Queue pc-melee-end: progress

Updated 2026-11-02 20:50:16 PC time (20:50 UTC), runner pid 51784.

- `meprep` done, exit 0 in 2 min
- `meaa` done, exit 0 in 45 min
- `mebb` running
- `meeg` pending
- `meek` pending
- `meread` pending
- `mepr` pending

### meaa

**276 of 276 battles** (100%), 0 failed. Running 45 min, 371 battles/h, about 0 min left (ends ~20:21 PC time). Last battle 0 min ago.
Skipped turns a battle: 27.7 overall, first 100 27.9, last 100 27.6.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 276 |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### mebb

**162 of 276 battles** (59%), 0 failed. Running 29 min, 340 battles/h, about 20 min left (ends ~21:10 PC time). Last battle 0 min ago.
Skipped turns a battle: 27.8 overall, first 100 27.3, last 100 28.4.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 162 |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 114 battles unrun (about 20 min); every battle already fought is kept and a rerun resumes from it.

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
20:21:40 meaa exit=0 in 2676 s
20:21:40 start mebb
20:21:40 watching mebb: 2 stop rule(s)
20:38:11 progress mebb: 108/276 (39%) battles, 392/h, ETA 26 min, 0 failed, skips 28.5/battle (last 100)
```
