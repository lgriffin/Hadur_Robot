# Queue pc-team-farm: progress

Updated 2026-11-07 17:15:56 PC time (17:15 UTC), runner pid 57892.

- `tfprep` done, exit 0 in 7 min
- `tfbb` done, exit 0 in 39 min
- `tffo` done, exit 0 in 40 min
- `tfcl` done, exit 0 in 38 min
- `tfnl` running
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

**516 of 552 battles** (93%), 0 failed. Running 38 min, 811 battles/h, about 3 min left (ends ~16:51 PC time). Last battle 0 min ago.
Skipped turns a battle: 17.9 overall, first 100 20.1, last 100 16.5.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 60` | halt | ok | 0 failed of 516 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 60 over 200` | halt | ok | 17.1 a battle over the last 200 (first 200: 19.6) |

Stopping now would leave 36 battles unrun (about 3 min); every battle already fought is kept and a rerun resumes from it.

### tfnl

**336 of 552 battles** (61%), 0 failed. Running 28 min, 733 battles/h, about 18 min left (ends ~17:33 PC time). Last battle 1 min ago.
Skipped turns a battle: 19.3 overall, first 100 22.2, last 100 15.9.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 60` | halt | ok | 0 failed of 336 |
| `stall 30m` | halt | ok | last battle 1 min ago |
| `skips 60 over 200` | halt | ok | 18.3 a battle over the last 200 (first 200: 20.4) |

Stopping now would leave 216 battles unrun (about 18 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
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
16:48:26 tfcl exit=0 in 2290 s
16:48:26 start tfnl
16:48:26 watching tfnl: 3 stop rule(s)
16:52:44 progress tfnl: 18/552 (3%) battles, 251/h, ETA 2.1 h, 0 failed, skips 21.1/battle (last 100)
```
