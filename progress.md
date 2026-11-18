# Queue pc-team-endpower: progress

Updated 2026-11-18 00:03:00 PC time (00:03 UTC), runner pid 48596.

- `teprep` done, exit 0 in 2 min
- `tepep` done, exit 0 in 41 min
- `tepilot` done, exit 0 in 0 min
- `tebb` done, exit 0 in 0 min
- `teep` done, exit 0 in 0 min
- `tegate` done, exit 0 in 0 min
- `tepr` done, exit 0 in 0 min

### tepep

**270 of 276 battles** (98%), 0 failed. Running 41 min, 399 battles/h, about 1 min left (ends ~00:03 PC time). Last battle 0 min ago.
Skipped turns a battle: 7.6 overall, first 100 12.8, last 100 4.4.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 60` | halt | ok | 0 failed of 270 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 60 over 200` | halt | ok | 5.1 a battle over the last 200 (first 200: 8.6) |

Stopping now would leave 6 battles unrun (about 1 min); every battle already fought is kept and a rerun resumes from it.

### tebb

**0 of 1104 battles** (0%), 0 failed. Running 0 min. Last battle 0 min ago.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 60` | halt | ok | 0 failed of 0 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 60 over 200` | halt | waiting | 0 of 200 battles to read |

Stopping now would leave 1104 battles unrun; every battle already fought is kept and a rerun resumes from it.

### teep

**0 of 1104 battles** (0%), 0 failed. Running 0 min. Last battle 0 min ago.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 60` | halt | ok | 0 failed of 0 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 60 over 200` | halt | waiting | 0 of 200 battles to read |

Stopping now would leave 1104 battles unrun; every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
23:53:28 progress tepep: 192/276 (70%) battles, 369/h, ETA 14 min, 0 failed, skips 4.7/battle (last 100)
00:02:51 tepep exit=0 in 2435 s
00:02:51 start tepilot
00:02:52 tepilot exit=0 in 0 s
00:02:52 start tebb
00:02:52 watching tebb: 3 stop rule(s)
00:02:52 tebb exit=0 in 0 s
00:02:52 start teep
00:02:52 watching teep: 3 stop rule(s)
00:02:53 teep exit=0 in 0 s
00:02:53 start tegate
00:02:53 tegate exit=0 in 0 s
00:02:53 start tepr
00:03:00 tepr exit=0 in 6 s
00:03:00 ALLDONE
```
