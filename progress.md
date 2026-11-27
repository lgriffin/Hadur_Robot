# Queue pc-team-pack6: progress

Updated 2026-11-27 23:08:35 PC time (23:08 UTC), runner pid 39744.

- `tkprep` done, exit 0 in 2 min
- `tkpp6` done, exit 0 in 3 min
- `tkpilot` done, exit 0 in 0 min
- `tkbb` running
- `tkp6` pending
- `tkgate` pending
- `tkpr` pending

### tkpp6

**24 of 24 battles** (100%), 0 failed. Running 3 min, 444 battles/h, about 0 min left (ends ~22:58 PC time). Last battle 0 min ago.
Skipped turns a battle: 30.1 overall, first 24 30.1, last 24 30.1.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 10` | halt | ok | 0 failed of 24 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 60 over 200` | halt | waiting | 24 of 200 battles to read |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### tkbb

**72 of 96 battles** (75%), 0 failed. Running 10 min, 439 battles/h, about 3 min left (ends ~23:11 PC time). Last battle 0 min ago.
Skipped turns a battle: 32.4 overall, first 72 32.4, last 72 32.4.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 10` | halt | ok | 0 failed of 72 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 60 over 200` | halt | waiting | 72 of 200 battles to read |

Stopping now would leave 24 battles unrun (about 3 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
22:53:29 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1544834; work D:\code\Hadur_Robot\hadur-bench\work
22:53:29 start tkprep
22:53:32 progress pushed to origin claude/pc-team-pack6-progress (every 15 min)
22:55:29 tkprep exit=0 in 120 s
22:55:29 start tkpp6
22:55:29 watching tkpp6: 3 stop rule(s)
22:55:30 progress tkpp6: 0/24 (0%) battles, 0 failed
22:58:43 tkpp6 exit=0 in 194 s
22:58:43 start tkpilot
22:58:44 tkpilot exit=0 in 0 s
22:58:44 start tkbb
22:58:44 watching tkbb: 3 stop rule(s)
```
