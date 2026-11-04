# Queue pc-team-dgun: progress

Updated 2026-11-04 20:27:26 PC time (20:27 UTC), runner pid 49532.

- `dgprep` done, exit 0 in 2 min
- `dgbb1` done, exit 0 in 17 min
- `dgdg1` running
- `dgpilot` pending
- `dgbb` pending
- `dgdg` pending
- `dgscr` pending
- `dgpr` pending

### dgbb1

**282 of 276 battles** (102%), 12 failed. Running 17 min, 974 battles/h, about -0 min left (ends ~20:16 PC time). Last battle 0 min ago.
Skipped turns a battle: 17.3 overall, first 100 19.1, last 100 16.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 60` | halt | ok | 12 failed of 282 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 16.0 a battle over the last 100 (first 100: 19.1) |

Stopping now would leave -6 battles unrun (about -0 min); every battle already fought is kept and a rerun resumes from it.

### dgdg1

**131 of 276 battles** (47%), 12 failed. Running 11 min, 735 battles/h, about 12 min left (ends ~20:39 PC time). Last battle 0 min ago.
Skipped turns a battle: 32.0 overall, first 100 32.1, last 100 32.1.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 60` | halt | ok | 12 failed of 131 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 32.1 a battle over the last 100 (first 100: 32.1) |

Stopping now would leave 145 battles unrun (about 12 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
19:57:13 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant calibrated; work D:\code\Hadur_Robot\hadur-bench\work
19:57:13 start dgprep
19:57:16 progress pushed to origin claude/pc-team-dgun-progress (every 15 min)
19:59:23 dgprep exit=0 in 129 s
19:59:23 start dgbb1
19:59:23 watching dgbb1: 3 stop rule(s)
20:00:14 progress dgbb1: 0/276 (0%) battles, 0 failed
20:16:45 dgbb1 exit=0 in 1041 s
20:16:45 start dgdg1
20:16:45 watching dgdg1: 3 stop rule(s)
```
