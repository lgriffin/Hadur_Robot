# Queue pc-melee-scal: progress

Updated 2026-10-31 01:46:26 PC time (01:46 UTC), runner pid 64324.

- `scprep` done, exit 0 in 6 min
- `scaa` done, exit 0 in 25 min
- `scbb` done, exit 0 in 24 min
- `scwm` running
- `scxh` pending
- `scwq` pending
- `scbw` pending
- `scfv` pending
- `scec` pending
- `scbs` pending
- `scread` pending
- `scpr` pending

### scaa

**276 of 276 battles** (100%), 0 failed. Running 25 min, 665 battles/h, about 0 min left (ends ~01:02 PC time). Last battle 0 min ago.
Skipped turns a battle: 57.2 overall, first 100 47.1, last 100 63.1.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 276 |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### scbb

**276 of 276 battles** (100%), 0 failed. Running 24 min, 694 battles/h, about 0 min left (ends ~01:26 PC time). Last battle 0 min ago.
Skipped turns a battle: 62.0 overall, first 100 47.3, last 100 81.7.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 276 |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### scwm

**222 of 276 battles** (80%), 0 failed. Running 20 min, 655 battles/h, about 5 min left (ends ~01:51 PC time). Last battle 0 min ago.
Skipped turns a battle: 109.9 overall, first 100 100.9, last 100 115.4.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 222 |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 54 battles unrun (about 5 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
00:30:51 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1488498; work D:\code\Hadur_Robot\hadur-bench\work
00:30:51 start scprep
00:30:54 progress pushed to origin claude/pc-melee-scal-progress (every 15 min)
00:37:18 scprep exit=0 in 387 s
00:37:18 start scaa
00:37:18 watching scaa: 2 stop rule(s)
00:37:54 progress scaa: 0/276 (0%) battles, 0 failed
01:02:13 scaa exit=0 in 1494 s
01:02:13 start scbb
01:02:13 watching scbb: 2 stop rule(s)
01:08:09 progress scbb: 72/276 (26%) battles, 728/h, ETA 17 min, 0 failed, skips 53.4/battle (last 100)
01:26:05 scbb exit=0 in 1432 s
01:26:05 start scwm
01:26:05 watching scwm: 2 stop rule(s)
01:38:23 progress scwm: 131/276 (47%) battles, 640/h, ETA 14 min, 0 failed, skips 113.2/battle (last 100)
```
