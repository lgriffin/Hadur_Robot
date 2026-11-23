# Queue pc-team-nmdodge: progress

Updated 2026-11-23 16:10:21 PC time (16:10 UTC), runner pid 67136.

- `tnprep` done, exit 0 in 2 min
- `tnbb` done, exit 0 in 5 min
- `tnnd` done, exit 0 in 6 min
- `tngate` done, exit 0 in 0 min
- `tnpr` done, exit 0 in 0 min

### tnbb

**96 of 48 battles** (200%), 0 failed. Running 5 min, 1092 battles/h, about -3 min left (ends ~16:01 PC time). Last battle 0 min ago.
Skipped turns a battle: 7.8 overall, first 96 7.8, last 96 7.8.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 10` | halt | ok | 0 failed of 96 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 60 over 200` | halt | waiting | 96 of 200 battles to read |

Stopping now would leave -48 battles unrun (about -3 min); every battle already fought is kept and a rerun resumes from it.

### tnnd

**96 of 48 battles** (200%), 0 failed. Running 6 min, 988 battles/h, about -3 min left (ends ~16:07 PC time). Last battle 0 min ago.
Skipped turns a battle: 16.5 overall, first 96 16.5, last 96 16.5.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 10` | halt | ok | 0 failed of 96 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 60 over 200` | halt | waiting | 96 of 200 battles to read |

Stopping now would leave -48 battles unrun (about -3 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
15:56:50 start tnprep
15:56:52 progress pushed to origin claude/pc-team-nmdodge-progress (every 15 min)
15:59:05 tnprep exit=0 in 135 s
15:59:05 start tnbb
15:59:05 watching tnbb: 3 stop rule(s)
15:59:52 progress tnbb: 12/48 (25%) battles, 933/h, ETA 2 min, 0 failed, skips 4.9/battle (last 100)
16:04:22 tnbb exit=0 in 316 s
16:04:22 start tnnd
16:04:22 watching tnnd: 3 stop rule(s)
16:10:12 tnnd exit=0 in 349 s
16:10:12 start tngate
16:10:12 tngate exit=0 in 0 s
16:10:12 start tnpr
16:10:21 tnpr exit=0 in 8 s
16:10:21 ALLDONE
```
