# Queue pc-melee-near: progress

Updated 2026-11-03 13:31:01 PC time (13:31 UTC), runner pid 692.

- `mnprep` done, exit 0 in 2 min
- `mnaa` done, exit 0 in 44 min
- `mnbb` running
- `mnn3` pending
- `mnn4` pending
- `mnread` pending
- `mnpr` pending

### mnaa

**276 of 276 battles** (100%), 0 failed. Running 44 min, 375 battles/h, about 0 min left (ends ~13:01 PC time). Last battle 0 min ago.
Skipped turns a battle: 27.0 overall, first 100 27.6, last 100 26.8.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 276 |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### mnbb

**156 of 276 battles** (57%), 0 failed. Running 29 min, 321 battles/h, about 22 min left (ends ~13:53 PC time). Last battle 0 min ago.
Skipped turns a battle: 28.0 overall, first 100 27.8, last 100 28.5.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 156 |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 120 battles unrun (about 22 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
12:15:26 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant calibrated; work D:\code\Hadur_Robot\hadur-bench\work
12:15:26 start mnprep
12:15:29 progress pushed to origin claude/pc-melee-near-progress (every 15 min)
12:17:40 mnprep exit=0 in 133 s
12:17:40 start mnaa
12:17:40 watching mnaa: 2 stop rule(s)
12:18:28 progress mnaa: 0/276 (0%) battles, 0 failed
12:48:42 progress mnaa: 180/276 (65%) battles, 348/h, ETA 17 min, 0 failed, skips 27.1/battle (last 100)
13:01:53 mnaa exit=0 in 2653 s
13:01:53 start mnbb
13:01:53 watching mnbb: 2 stop rule(s)
13:18:57 progress mnbb: 114/276 (41%) battles, 401/h, ETA 24 min, 0 failed, skips 28.6/battle (last 100)
```
