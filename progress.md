# Queue pc-team-fitted: progress

Updated 2026-11-16 19:03:04 PC time (19:03 UTC), runner pid 71280.

- `tfprep` done, exit 0 in 3 min
- `tfpfit` done, exit 0 in 4 min
- `tfpilot` done, exit 0 in 0 min
- `tfbb` running
- `tffit` pending
- `tfgate` pending
- `tfpr` pending

### tfpfit

**64 of 64 battles** (100%), 0 failed. Running 4 min, 960 battles/h, about 0 min left (ends ~18:54 PC time). Last battle 0 min ago.
Skipped turns a battle: 15.0 overall, first 64 15.0, last 64 15.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 60` | halt | ok | 0 failed of 64 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 60 over 200` | halt | waiting | 64 of 200 battles to read |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### tfbb

**132 of 384 battles** (34%), 0 failed. Running 8 min, 933 battles/h, about 16 min left (ends ~19:19 PC time). Last battle 0 min ago.
Skipped turns a battle: 6.3 overall, first 100 5.1, last 100 6.4.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 60` | halt | ok | 0 failed of 132 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 60 over 200` | halt | waiting | 132 of 200 battles to read |

Stopping now would leave 252 battles unrun (about 16 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
18:47:55 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1544834; work D:\code\Hadur_Robot\hadur-bench\work
18:47:55 start tfprep
18:47:58 progress pushed to origin claude/pc-team-fitted-progress (every 15 min)
18:50:34 tfprep exit=0 in 158 s
18:50:34 start tfpfit
18:50:34 watching tfpfit: 3 stop rule(s)
18:50:57 progress tfpfit: 0/64 (0%) battles, 0 failed
18:54:34 tfpfit exit=0 in 239 s
18:54:34 start tfpilot
18:54:34 tfpilot exit=0 in 0 s
18:54:34 start tfbb
18:54:34 watching tfbb: 3 stop rule(s)
```
