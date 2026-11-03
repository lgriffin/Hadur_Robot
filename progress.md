# Queue pc-melee-near: progress

Updated 2026-11-03 12:45:40 PC time (12:45 UTC), runner pid 692.

- `mnprep` done, exit 0 in 2 min
- `mnaa` running
- `mnbb` pending
- `mnn3` pending
- `mnn4` pending
- `mnread` pending
- `mnpr` pending

### mnaa

**156 of 276 battles** (57%), 0 failed. Running 28 min, 334 battles/h, about 22 min left (ends ~13:07 PC time). Last battle 0 min ago.
Skipped turns a battle: 27.3 overall, first 100 27.6, last 100 27.7.

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
```
