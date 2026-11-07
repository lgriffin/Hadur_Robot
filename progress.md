# Queue pc-team-farm: progress

Updated 2026-11-07 17:27:42 PC time (17:27 UTC), runner pid 57892.

- `tfprep` done, exit 0 in 7 min
- `tfbb` done, exit 0 in 39 min
- `tffo` done, exit 0 in 40 min
- `tfcl` done, exit 0 in 38 min
- `tfnl` done, exit 0 in 39 min
- `tfpilot` failed, exit 1 in 0 min
- `tfpo` skipped
- `tfga` skipped
- `tfho` skipped
- `tfli` skipped
- `tfnh` skipped
- `tfnp` skipped
- `tfpick` skipped
- `tfcprep` skipped
- `tfcbb` skipped
- `tfcfx` skipped
- `tflock` skipped
- `tfgate` skipped
- `tfpr` skipped

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

**516 of 552 battles** (93%), 0 failed. Running 39 min, 791 battles/h, about 3 min left (ends ~17:30 PC time). Last battle 0 min ago.
Skipped turns a battle: 18.3 overall, first 100 22.2, last 100 16.4.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 60` | halt | ok | 0 failed of 516 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 60 over 200` | halt | ok | 16.6 a battle over the last 200 (first 200: 20.4) |

Stopping now would leave 36 battles unrun (about 3 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
17:27:42 tfpilot exit=1 in 6 s
17:27:42 skip tfpo (after tfpilot, which has not finished exit=0)
17:27:42 skip tfga (after tfpo, which has not finished exit=0)
17:27:42 skip tfho (after tfga, which has not finished exit=0)
17:27:42 skip tfli (after tfho, which has not finished exit=0)
17:27:42 skip tfnh (after tfli, which has not finished exit=0)
17:27:42 skip tfnp (after tfnh, which has not finished exit=0)
17:27:42 skip tfpick (after tfnp, which has not finished exit=0)
17:27:42 skip tfcprep (after tfpick, which has not finished exit=0)
17:27:42 skip tfcbb (after tfcprep, which has not finished exit=0)
17:27:42 skip tfcfx (after tfcbb, which has not finished exit=0)
17:27:42 skip tflock (after tfcfx, which has not finished exit=0)
17:27:42 skip tfgate (after tflock, which has not finished exit=0)
17:27:42 skip tfpr (after tfgate, which has not finished exit=0)
17:27:42 ALLDONE
```
