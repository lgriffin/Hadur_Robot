# Queue pc-team-pack6: progress

Updated 2026-11-27 23:23:53 PC time (23:23 UTC), runner pid 39744.

- `tkprep` done, exit 0 in 2 min
- `tkpp6` done, exit 0 in 3 min
- `tkpilot` done, exit 0 in 0 min
- `tkbb` done, exit 0 in 13 min
- `tkp6` done, exit 0 in 12 min
- `tkgate` done, exit 0 in 0 min
- `tkpr` done, exit 0 in 0 min

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

**96 of 96 battles** (100%), 0 failed. Running 13 min, 455 battles/h, about 0 min left (ends ~23:11 PC time). Last battle 0 min ago.
Skipped turns a battle: 31.7 overall, first 96 31.7, last 96 31.7.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 10` | halt | ok | 0 failed of 96 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 60 over 200` | halt | waiting | 96 of 200 battles to read |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### tkp6

**96 of 96 battles** (100%), 0 failed. Running 12 min, 466 battles/h, about 0 min left (ends ~23:23 PC time). Last battle 0 min ago.
Skipped turns a battle: 31.8 overall, first 96 31.8, last 96 31.8.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 10` | halt | ok | 0 failed of 96 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 60 over 200` | halt | waiting | 96 of 200 battles to read |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
22:55:30 progress tkpp6: 0/24 (0%) battles, 0 failed
22:58:43 tkpp6 exit=0 in 194 s
22:58:43 start tkpilot
22:58:44 tkpilot exit=0 in 0 s
22:58:44 start tkbb
22:58:44 watching tkbb: 3 stop rule(s)
23:11:24 tkbb exit=0 in 760 s
23:11:24 start tkp6
23:11:24 watching tkp6: 3 stop rule(s)
23:23:46 tkp6 exit=0 in 741 s
23:23:46 start tkgate
23:23:47 tkgate exit=0 in 0 s
23:23:47 start tkpr
23:23:53 tkpr exit=0 in 6 s
23:23:53 ALLDONE
```
