# Queue pc-team-pack5: progress

Updated 2026-11-26 19:04:10 PC time (19:04 UTC), runner pid 91784.

- `tkprep` done, exit 0 in 2 min
- `tkpp5` done, exit 0 in 4 min
- `tkpilot` done, exit 0 in 0 min
- `tkbb` done, exit 0 in 13 min
- `tkp5` done, exit 0 in 13 min
- `tkgate` done, exit 0 in 0 min
- `tkpr` done, exit 0 in 0 min

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

**96 of 96 battles** (100%), 0 failed. Running 13 min, 455 battles/h, about 0 min left (ends ~19:04 PC time). Last battle 0 min ago.
Skipped turns a battle: 25.8 overall, first 96 25.8, last 96 25.8.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 10` | halt | ok | 0 failed of 96 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 60 over 200` | halt | waiting | 96 of 200 battles to read |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
18:35:23 progress tkpp5: 0/24 (0%) battles, 0 failed
18:37:59 tkpp5 exit=0 in 215 s
18:37:59 start tkpilot
18:38:00 tkpilot exit=0 in 0 s
18:38:00 start tkbb
18:38:00 watching tkbb: 3 stop rule(s)
18:51:22 tkbb exit=0 in 801 s
18:51:22 start tkp5
18:51:22 watching tkp5: 3 stop rule(s)
19:04:01 tkp5 exit=0 in 759 s
19:04:01 start tkgate
19:04:02 tkgate exit=0 in 0 s
19:04:02 start tkpr
19:04:10 tkpr exit=0 in 7 s
19:04:10 ALLDONE
```
