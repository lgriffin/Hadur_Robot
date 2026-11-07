# Queue pc-team-farm: progress

Updated 2026-11-07 15:45:10 PC time (15:45 UTC), runner pid 57892.

- `tfprep` done, exit 0 in 7 min
- `tfbb` done, exit 0 in 39 min
- `tffo` running
- `tfcl` pending
- `tfnl` pending
- `tfpilot` pending
- `tfpo` pending
- `tfga` pending
- `tfho` pending
- `tfli` pending
- `tfnh` pending
- `tfnp` pending
- `tfpick` pending
- `tfcprep` pending
- `tfcbb` pending
- `tfcfx` pending
- `tflock` pending
- `tfgate` pending
- `tfpr` pending

### tfbb

**540 of 552 battles** (98%), 0 failed. Running 39 min, 827 battles/h, about 1 min left (ends ~15:31 PC time). Last battle 0 min ago.
Skipped turns a battle: 17.5 overall, first 100 20.6, last 100 15.5.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 60` | halt | ok | 0 failed of 540 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 60 over 200` | halt | ok | 15.8 a battle over the last 200 (first 200: 19.9) |

Stopping now would leave 12 battles unrun (about 1 min); every battle already fought is kept and a rerun resumes from it.

### tffo

**143 of 552 battles** (26%), 0 failed. Running 15 min, 583 battles/h, about 42 min left (ends ~16:27 PC time). Last battle 0 min ago.
Skipped turns a battle: 19.3 overall, first 100 20.4, last 100 19.4.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 60` | halt | ok | 0 failed of 143 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 60 over 200` | halt | waiting | 143 of 200 battles to read |

Stopping now would leave 409 battles unrun (about 42 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
14:44:38 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant calibrated; work D:\code\Hadur_Robot\hadur-bench\work
14:44:38 start tfprep
14:44:40 progress pushed to origin claude/pc-team-farm-progress (every 15 min)
14:51:16 tfprep exit=0 in 397 s
14:51:16 start tfbb
14:51:16 watching tfbb: 3 stop rule(s)
14:51:42 progress tfbb: 0/552 (0%) battles, 0 failed
15:21:58 progress tfbb: 358/552 (65%) battles, 700/h, ETA 17 min, 0 failed, skips 15.9/battle (last 100)
15:30:27 tfbb exit=0 in 2351 s
15:30:27 start tffo
15:30:27 watching tffo: 3 stop rule(s)
```
