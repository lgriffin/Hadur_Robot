# Queue pc-team-pack2: progress

Updated 2026-11-23 08:08:46 PC time (08:08 UTC), runner pid 95772.

- `tkprep` done, exit 0 in 2 min
- `tkpp2` done, exit 0 in 4 min
- `tkpilot` done, exit 0 in 0 min
- `tkbb` done, exit 0 in 0 min
- `tkp2` done, exit 0 in 0 min
- `tkgate` done, exit 0 in 0 min
- `tkpr` done, exit 0 in 0 min

### tkpp2

**32 of 32 battles** (100%), 0 failed. Running 4 min, 548 battles/h, about 0 min left (ends ~08:08 PC time). Last battle 0 min ago.
Skipped turns a battle: 25.7 overall, first 32 25.7, last 32 25.7.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 10` | halt | ok | 0 failed of 32 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 60 over 200` | halt | waiting | 32 of 200 battles to read |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### tkbb

**0 of 192 battles** (0%), 0 failed. Running 0 min. Last battle 0 min ago.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 10` | halt | ok | 0 failed of 0 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 60 over 200` | halt | waiting | 0 of 200 battles to read |

Stopping now would leave 192 battles unrun; every battle already fought is kept and a rerun resumes from it.

### tkp2

**0 of 192 battles** (0%), 0 failed. Running 0 min. Last battle 0 min ago.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 10` | halt | ok | 0 failed of 0 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 60 over 200` | halt | waiting | 0 of 200 battles to read |

Stopping now would leave 192 battles unrun; every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
08:05:10 progress tkpp2: 0/32 (0%) battles, 0 failed
08:08:38 tkpp2 exit=0 in 210 s
08:08:38 start tkpilot
08:08:39 tkpilot exit=0 in 0 s
08:08:39 start tkbb
08:08:39 watching tkbb: 3 stop rule(s)
08:08:39 tkbb exit=0 in 0 s
08:08:39 start tkp2
08:08:39 watching tkp2: 3 stop rule(s)
08:08:39 tkp2 exit=0 in 0 s
08:08:39 start tkgate
08:08:40 tkgate exit=0 in 0 s
08:08:40 start tkpr
08:08:46 tkpr exit=0 in 6 s
08:08:46 ALLDONE
```
