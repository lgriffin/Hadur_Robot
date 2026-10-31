# Queue pc-melee-dia: progress

Updated 2026-10-31 14:34:01 PC time (14:34 UTC), runner pid 63404.

- `diprep` done, exit 0 in 2 min
- `diaa` done, exit 0 in 25 min
- `dibb` running
- `didm` pending
- `dila` pending
- `diread` pending
- `dipr` pending

### diaa

**276 of 276 battles** (100%), 0 failed. Running 25 min, 668 battles/h, about 0 min left (ends ~14:30 PC time). Last battle 0 min ago.
Skipped turns a battle: 66.6 overall, first 100 58.8, last 100 74.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 276 |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### dibb

**30 of 276 battles** (11%), 0 failed. Running 3 min, 595 battles/h, about 25 min left (ends ~14:58 PC time). Last battle 0 min ago.
Skipped turns a battle: 85.9 overall, first 30 85.9, last 30 85.9.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 30 |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 246 battles unrun (about 25 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
14:03:45 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1488498; work D:\code\Hadur_Robot\hadur-bench\work
14:03:45 start diprep
14:03:49 progress pushed to origin claude/pc-melee-dia-progress (every 15 min)
14:06:11 diprep exit=0 in 146 s
14:06:11 start diaa
14:06:11 watching diaa: 2 stop rule(s)
14:06:47 progress diaa: 0/276 (0%) battles, 0 failed
14:30:59 diaa exit=0 in 1487 s
14:30:59 start dibb
14:30:59 watching dibb: 2 stop rule(s)
```
