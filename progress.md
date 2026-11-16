# Queue pc-team-fitted: progress

Updated 2026-11-16 19:33:22 PC time (19:33 UTC), runner pid 71280.

- `tfprep` done, exit 0 in 3 min
- `tfpfit` done, exit 0 in 4 min
- `tfpilot` done, exit 0 in 0 min
- `tfbb` done, exit 0 in 22 min
- `tffit` running
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

**384 of 384 battles** (100%), 0 failed. Running 22 min, 1043 battles/h, about 0 min left (ends ~19:16 PC time). Last battle 0 min ago.
Skipped turns a battle: 6.1 overall, first 100 5.1, last 100 3.1.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 60` | halt | ok | 0 failed of 384 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 60 over 200` | halt | ok | 5.3 a battle over the last 200 (first 200: 6.8) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### tffit

**283 of 384 battles** (74%), 0 failed. Running 17 min, 1017 battles/h, about 6 min left (ends ~19:39 PC time). Last battle 0 min ago.
Skipped turns a battle: 6.6 overall, first 100 5.6, last 100 6.5.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 60` | halt | ok | 0 failed of 283 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 60 over 200` | halt | ok | 7.1 a battle over the last 200 (first 200: 6.7) |

Stopping now would leave 101 battles unrun (about 6 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
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
19:16:40 tfbb exit=0 in 1325 s
19:16:40 start tffit
19:16:40 watching tffit: 3 stop rule(s)
19:21:15 progress tffit: 69/384 (18%) battles, 904/h, ETA 21 min, 0 failed, skips 5.9/battle (last 100)
```
