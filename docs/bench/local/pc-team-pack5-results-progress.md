# Queue pc-team-pack5: progress

Updated 2026-11-26 19:03:35 PC time (19:03 UTC), runner pid 91784.

- `tkprep` done, exit 0 in 2 min
- `tkpp5` done, exit 0 in 4 min
- `tkpilot` done, exit 0 in 0 min
- `tkbb` done, exit 0 in 13 min
- `tkp5` running
- `tkgate` pending
- `tkpr` pending

### tkpp5

**24 of 24 battles** (100%), 0 failed. Running 4 min, 401 battles/h, about 0 min left (ends ~18:37 PC time). Last battle 0 min ago.
Skipped turns a battle: 21.8 overall, first 24 21.8, last 24 21.8.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 10` | halt | ok | 0 failed of 24 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 60 over 200` | halt | waiting | 24 of 200 battles to read |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### tkbb

**96 of 96 battles** (100%), 0 failed. Running 13 min, 431 battles/h, about 0 min left (ends ~18:51 PC time). Last battle 0 min ago.
Skipped turns a battle: 27.4 overall, first 96 27.4, last 96 27.4.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 10` | halt | ok | 0 failed of 96 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 60 over 200` | halt | waiting | 96 of 200 battles to read |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### tkp5

**89 of 96 battles** (93%), 0 failed. Running 12 min, 437 battles/h, about 1 min left (ends ~19:04 PC time). Last battle 0 min ago.
Skipped turns a battle: 25.9 overall, first 89 25.9, last 89 25.9.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 10` | halt | ok | 0 failed of 89 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 60 over 200` | halt | waiting | 89 of 200 battles to read |

Stopping now would leave 7 battles unrun (about 1 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
18:32:21 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1544834; work D:\code\Hadur_Robot\hadur-bench\work
18:32:21 start tkprep
18:32:24 progress pushed to origin claude/pc-team-pack5-progress (every 15 min)
18:34:23 tkprep exit=0 in 122 s
18:34:23 start tkpp5
18:34:23 watching tkpp5: 3 stop rule(s)
18:35:23 progress tkpp5: 0/24 (0%) battles, 0 failed
18:37:59 tkpp5 exit=0 in 215 s
18:37:59 start tkpilot
18:38:00 tkpilot exit=0 in 0 s
18:38:00 start tkbb
18:38:00 watching tkbb: 3 stop rule(s)
18:51:22 tkbb exit=0 in 801 s
18:51:22 start tkp5
18:51:22 watching tkp5: 3 stop rule(s)
```
