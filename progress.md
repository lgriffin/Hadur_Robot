# Queue pc-modes-check: progress

Updated 2026-11-14 13:19:42 PC time (13:19 UTC), runner pid 46572.

- `mcprep` done, exit 0 in 2 min
- `maa` done, exit 0 in 46 min
- `mbb` running
- `mso` pending
- `tbb` pending
- `tso` pending
- `mcread` pending
- `mcpr` pending

### maa

**184 battles**, 0 failed. Running 46 min, 241 battles/h. Last battle 0 min ago.
Skipped turns a battle: 29.0 overall, first 100 28.6, last 100 28.6.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 184 |
| `stall 30m` | halt | ok | last battle 0 min ago |

### mbb

**44 battles**, 0 failed. Running 12 min, 213 battles/h. Last battle 1 min ago.
Skipped turns a battle: 50.7 overall, first 44 50.7, last 44 50.7.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 44 |
| `stall 30m` | halt | ok | last battle 1 min ago |

### Queue log (last lines)

```
12:19:18 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant calibrated; work D:\code\Hadur_Robot\hadur-bench\work
12:19:18 start mcprep
12:19:20 progress pushed to origin claude/pc-modes-check-progress (every 15 min)
12:21:33 mcprep exit=0 in 135 s
12:21:33 start maa
12:21:33 watching maa: 2 stop rule(s)
12:22:19 progress maa: 0 battles, 0 failed
12:52:31 progress maa: 116 battles, 225/h, 0 failed, skips 29.1/battle (last 100)
13:07:17 maa exit=0 in 2744 s
13:07:17 start mbb
13:07:17 watching mbb: 2 stop rule(s)
```
