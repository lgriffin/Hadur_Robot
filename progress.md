# Queue pc-melee-dia: progress

Updated 2026-10-31 15:04:16 PC time (15:04 UTC), runner pid 63404.

- `diprep` done, exit 0 in 2 min
- `diaa` done, exit 0 in 25 min
- `dibb` done, exit 0 in 25 min
- `didm` running
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

**276 of 276 battles** (100%), 0 failed. Running 25 min, 666 battles/h, about 0 min left (ends ~14:55 PC time). Last battle 0 min ago.
Skipped turns a battle: 77.6 overall, first 100 85.2, last 100 67.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 276 |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### didm

**91 of 276 battles** (33%), 0 failed. Running 8 min, 648 battles/h, about 17 min left (ends ~15:21 PC time). Last battle 0 min ago.
Skipped turns a battle: 59.8 overall, first 91 59.8, last 91 59.8.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 91 |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 185 battles unrun (about 17 min); every battle already fought is kept and a rerun resumes from it.

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
14:37:03 progress dibb: 60/276 (22%) battles, 595/h, ETA 22 min, 0 failed, skips 94.4/battle (last 100)
14:55:51 dibb exit=0 in 1491 s
14:55:51 start didm
14:55:51 watching didm: 2 stop rule(s)
```
