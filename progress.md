# Queue pc-team-quarters: progress

Updated 2026-11-11 18:03:26 PC time (18:03 UTC), runner pid 39880.

- `qtprep` done, exit 0 in 2 min
- `qtbb` done, exit 0 in 10 min
- `qtqt` running
- `qtpick` pending
- `qtgprep` pending
- `qtgbb` pending
- `qtgqg` pending
- `qtsum` pending
- `qtpr` pending

### qtbb

**240 of 240 battles** (100%), 0 failed. Running 10 min, 1476 battles/h, about 0 min left (ends ~17:59 PC time). Last battle 0 min ago.
Skipped turns a battle: 18.1 overall, first 100 25.5, last 100 12.1.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 240 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 12.1 a battle over the last 100 (first 100: 25.5) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### qtqt

**67 of 240 battles** (28%), 0 failed. Running 4 min, 1093 battles/h, about 9 min left (ends ~18:12 PC time). Last battle 0 min ago.
Skipped turns a battle: 24.4 overall, first 67 24.4, last 67 24.4.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 67 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | waiting | 67 of 100 battles to read |

Stopping now would leave 173 battles unrun (about 9 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
17:48:19 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant calibrated; work D:\code\Hadur_Robot\hadur-bench\work
17:48:19 start qtprep
17:48:21 progress pushed to origin claude/pc-team-quarters-progress (every 15 min)
17:50:00 qtprep exit=0 in 101 s
17:50:00 start qtbb
17:50:00 watching qtbb: 3 stop rule(s)
17:50:20 progress qtbb: 0/240 (0%) battles, 0 failed
17:59:45 qtbb exit=0 in 585 s
17:59:45 start qtqt
17:59:45 watching qtqt: 3 stop rule(s)
```
