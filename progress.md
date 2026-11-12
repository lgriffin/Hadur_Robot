# Queue pc-melee-dodge: progress

Updated 2026-11-12 06:45:25 PC time (06:45 UTC), runner pid 52528.

- `dgprep` done, exit 0 in 2 min
- `dgpilot` running
- `dgcheck` pending
- `dgaa` pending
- `dgbb` pending
- `dgmd` pending
- `dgread` pending
- `dgpr` pending

### dgpilot

**168 of 184 battles** (91%), 0 failed. Running 59 min, 172 battles/h, about 6 min left (ends ~06:51 PC time). Last battle 0 min ago.
Skipped turns a battle: 34.3 overall, first 100 36.3, last 100 34.6.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 168 |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 16 battles unrun (about 6 min); every battle already fought is kept and a rerun resumes from it.

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
```
