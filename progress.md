# Queue pc-team-lead: progress

Updated 2026-10-30 20:52:18 PC time (20:52 UTC), runner pid 44904.

- `lgprep` done, exit 0 in 2 min
- `lgbb` done, exit 0 in 15 min
- `lgld` done, exit 0 in 15 min
- `lgpick` done, exit 0 in 0 min
- `lggate` done, exit 0 in 0 min
- `lggbb` done, exit 0 in 0 min
- `lgsum` done, exit 0 in 0 min
- `lgpr` done, exit 0 in 0 min

### lgbb

**288 of 288 battles** (100%), 0 failed. Running 15 min, 1135 battles/h, about 0 min left (ends ~20:37 PC time). Last battle 0 min ago.
Skipped turns a battle: 10.8 overall, first 100 11.2, last 100 12.3.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 288 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 12.3 a battle over the last 100 (first 100: 11.2) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### lgld

**288 of 288 battles** (100%), 0 failed. Running 15 min, 1141 battles/h, about 0 min left (ends ~20:52 PC time). Last battle 0 min ago.
Skipped turns a battle: 11.2 overall, first 100 12.1, last 100 12.6.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 288 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 12.6 a battle over the last 100 (first 100: 12.1) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### lggate

**0 battles**, 0 failed. Running 0 min. Last battle 0 min ago.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 0 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | waiting | 0 of 100 battles to read |

### lggbb

**0 battles**, 0 failed. Running 0 min. Last battle 0 min ago.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 0 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | waiting | 0 of 100 battles to read |

### Queue log (last lines)

```
20:37:02 watching lgld: 3 stop rule(s)
20:52:11 lgld exit=0 in 908 s
20:52:11 start lgpick
20:52:12 lgpick exit=0 in 0 s
20:52:12 start lggate
20:52:12 watching lggate: 3 stop rule(s)
20:52:12 lggate exit=0 in 0 s
20:52:12 start lggbb
20:52:12 watching lggbb: 3 stop rule(s)
20:52:12 lggbb exit=0 in 0 s
20:52:12 start lgsum
20:52:12 lgsum exit=0 in 0 s
20:52:12 start lgpr
20:52:18 lgpr exit=0 in 5 s
20:52:18 ALLDONE
```
