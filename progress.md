# Queue pc-team-dgun: progress

Updated 2026-11-04 20:12:20 PC time (20:12 UTC), runner pid 49532.

- `dgprep` done, exit 0 in 2 min
- `dgbb1` running
- `dgdg1` pending
- `dgpilot` pending
- `dgbb` pending
- `dgdg` pending
- `dgscr` pending
- `dgpr` pending

### dgbb1

**190 of 276 battles** (69%), 12 failed. Running 13 min, 880 battles/h, about 6 min left (ends ~20:18 PC time). Last battle 0 min ago.
Skipped turns a battle: 17.7 overall, first 100 19.1, last 100 17.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 60` | halt | ok | 12 failed of 190 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 17.0 a battle over the last 100 (first 100: 19.1) |

Stopping now would leave 86 battles unrun (about 6 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
19:57:13 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant calibrated; work D:\code\Hadur_Robot\hadur-bench\work
19:57:13 start dgprep
19:57:16 progress pushed to origin claude/pc-team-dgun-progress (every 15 min)
19:59:23 dgprep exit=0 in 129 s
19:59:23 start dgbb1
19:59:23 watching dgbb1: 3 stop rule(s)
20:00:14 progress dgbb1: 0/276 (0%) battles, 0 failed
```
