# Queue pc-team-pack3: progress

Updated 2026-11-23 18:33:55 PC time (18:33 UTC), runner pid 86648.

- `tkprep` done, exit 0 in 2 min
- `tkpp3` done, exit 0 in 8 min
- `tkpilot` done, exit 0 in 0 min
- `tkbb` done, exit 0 in 21 min
- `tkp3` done, exit 0 in 21 min
- `tkgate` done, exit 0 in 0 min
- `tkpr` done, exit 0 in 0 min

### tkpp3

**64 of 64 battles** (100%), 0 failed. Running 8 min, 473 battles/h, about 0 min left (ends ~17:52 PC time). Last battle 0 min ago.
Skipped turns a battle: 32.6 overall, first 64 32.6, last 64 32.6.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 10` | halt | ok | 0 failed of 64 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 60 over 200` | halt | waiting | 64 of 200 battles to read |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### tkbb

**192 of 192 battles** (100%), 0 failed. Running 21 min, 547 battles/h, about 0 min left (ends ~18:13 PC time). Last battle 0 min ago.
Skipped turns a battle: 34.7 overall, first 100 31.0, last 100 37.7.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 10` | halt | ok | 0 failed of 192 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 60 over 200` | halt | waiting | 192 of 200 battles to read |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### tkp3

**192 of 192 battles** (100%), 0 failed. Running 21 min, 560 battles/h, about 0 min left (ends ~18:33 PC time). Last battle 0 min ago.
Skipped turns a battle: 32.4 overall, first 100 27.0, last 100 36.9.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 10` | halt | ok | 0 failed of 192 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 60 over 200` | halt | waiting | 192 of 200 battles to read |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
17:52:09 tkpp3 exit=0 in 486 s
17:52:09 start tkpilot
17:52:10 tkpilot exit=0 in 0 s
17:52:10 start tkbb
17:52:10 watching tkbb: 3 stop rule(s)
18:13:13 tkbb exit=0 in 1263 s
18:13:13 start tkp3
18:13:13 watching tkp3: 3 stop rule(s)
18:15:09 progress tkp3: 24/192 (12%) battles, 746/h, ETA 14 min, 0 failed, skips 28.5/battle (last 100)
18:33:47 tkp3 exit=0 in 1233 s
18:33:47 start tkgate
18:33:47 tkgate exit=0 in 0 s
18:33:47 start tkpr
18:33:55 tkpr exit=0 in 7 s
18:33:55 ALLDONE
```
