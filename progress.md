# Queue pc-team-farm: progress

Updated 2026-11-07 16:45:40 PC time (16:45 UTC), runner pid 57892.

- `tfprep` done, exit 0 in 7 min
- `tfbb` done, exit 0 in 39 min
- `tffo` done, exit 0 in 40 min
- `tfcl` running
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

**516 of 552 battles** (93%), 0 failed. Running 40 min, 778 battles/h, about 3 min left (ends ~16:13 PC time). Last battle 0 min ago.
Skipped turns a battle: 17.8 overall, first 100 20.4, last 100 16.6.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 60` | halt | ok | 0 failed of 516 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 60 over 200` | halt | ok | 16.9 a battle over the last 200 (first 200: 19.3) |

Stopping now would leave 36 battles unrun (about 3 min); every battle already fought is kept and a rerun resumes from it.

### tfcl

**462 of 552 battles** (84%), 0 failed. Running 35 min, 783 battles/h, about 7 min left (ends ~16:52 PC time). Last battle 0 min ago.
Skipped turns a battle: 18.6 overall, first 100 20.1, last 100 20.9.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 60` | halt | ok | 0 failed of 462 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 60 over 200` | halt | ok | 18.0 a battle over the last 200 (first 200: 19.6) |

Stopping now would leave 90 battles unrun (about 7 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
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
15:52:13 progress tffo: 244/552 (44%) battles, 672/h, ETA 27 min, 0 failed, skips 19.2/battle (last 100)
16:10:15 tffo exit=0 in 2388 s
16:10:15 start tfcl
16:10:15 watching tfcl: 3 stop rule(s)
16:22:29 progress tfcl: 117/552 (21%) battles, 574/h, ETA 45 min, 0 failed, skips 20.2/battle (last 100)
```
