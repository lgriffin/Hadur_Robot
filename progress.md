# Queue pc-team-farm: progress

Updated 2026-11-07 15:14:54 PC time (15:14 UTC), runner pid 57892.

- `tfprep` done, exit 0 in 7 min
- `tfbb` running
- `tffo` pending
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

**279 of 552 battles** (51%), 0 failed. Running 24 min, 708 battles/h, about 23 min left (ends ~15:38 PC time). Last battle 0 min ago.
Skipped turns a battle: 19.3 overall, first 100 20.6, last 100 18.5.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 60` | halt | ok | 0 failed of 279 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 60 over 200` | halt | ok | 18.9 a battle over the last 200 (first 200: 19.9) |

Stopping now would leave 273 battles unrun (about 23 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
14:44:38 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant calibrated; work D:\code\Hadur_Robot\hadur-bench\work
14:44:38 start tfprep
14:44:40 progress pushed to origin claude/pc-team-farm-progress (every 15 min)
14:51:16 tfprep exit=0 in 397 s
14:51:16 start tfbb
14:51:16 watching tfbb: 3 stop rule(s)
14:51:42 progress tfbb: 0/552 (0%) battles, 0 failed
```
