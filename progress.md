# Queue pc-melee-dodge: progress

Updated 2026-11-12 07:00:32 PC time (07:00 UTC), runner pid 52528.

- `dgprep` done, exit 0 in 2 min
- `dgpilot` done, exit 0 in 1.1 h
- `dgcheck` done, exit 0 in 0 min
- `dgaa` running
- `dgbb` pending
- `dgmd` pending
- `dgread` pending
- `dgpr` pending

### dgpilot

**184 of 184 battles** (100%), 0 failed. Running 1.1 h, 174 battles/h, about 0 min left (ends ~06:50 PC time). Last battle 0 min ago.
Skipped turns a battle: 35.4 overall, first 100 36.3, last 100 34.8.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 184 |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### dgaa

**60 of 276 battles** (22%), 0 failed. Running 10 min, 357 battles/h, about 36 min left (ends ~07:36 PC time). Last battle 0 min ago.
Skipped turns a battle: 28.1 overall, first 60 28.1, last 60 28.1.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 60 |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 216 battles unrun (about 36 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
05:45:01 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant calibrated; work D:\code\Hadur_Robot\hadur-bench\work
05:45:01 start dgprep
05:45:03 progress pushed to origin claude/pc-melee-dodge-progress (every 15 min)
05:46:54 dgprep exit=0 in 113 s
05:46:54 start dgpilot
05:46:54 watching dgpilot: 2 stop rule(s)
05:47:01 progress dgpilot: 0/184 (0%) battles, 0 failed
06:17:14 progress dgpilot: 84/184 (46%) battles, 166/h, ETA 36 min, 0 failed, skips 36.2/battle (last 100)
06:47:26 progress dgpilot: 174/184 (95%) battles, 172/h, ETA 3 min, 0 failed, skips 30.4/battle (last 100)
06:50:26 dgpilot exit=0 in 3812 s
06:50:26 start dgcheck
06:50:27 dgcheck exit=0 in 0 s
06:50:27 start dgaa
06:50:27 watching dgaa: 2 stop rule(s)
```
