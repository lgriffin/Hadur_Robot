# Queue pc-melee-dodge: progress

Updated 2026-11-12 06:15:13 PC time (06:15 UTC), runner pid 52528.

- `dgprep` done, exit 0 in 2 min
- `dgpilot` running
- `dgcheck` pending
- `dgaa` pending
- `dgbb` pending
- `dgmd` pending
- `dgread` pending
- `dgpr` pending

### dgpilot

**82 of 184 battles** (45%), 0 failed. Running 28 min, 174 battles/h, about 35 min left (ends ~06:50 PC time). Last battle 1 min ago.
Skipped turns a battle: 36.7 overall, first 82 36.7, last 82 36.7.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 82 |
| `stall 30m` | halt | ok | last battle 1 min ago |

Stopping now would leave 102 battles unrun (about 35 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
05:45:01 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant calibrated; work D:\code\Hadur_Robot\hadur-bench\work
05:45:01 start dgprep
05:45:03 progress pushed to origin claude/pc-melee-dodge-progress (every 15 min)
05:46:54 dgprep exit=0 in 113 s
05:46:54 start dgpilot
05:46:54 watching dgpilot: 2 stop rule(s)
05:47:01 progress dgpilot: 0/184 (0%) battles, 0 failed
```
