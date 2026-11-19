# Queue pc-team-icpt: progress

Updated 2026-11-19 12:35:33 PC time (12:35 UTC), runner pid 95276.

- `tcprep` done, exit 0 in 2 min
- `tcptic` done, exit 0 in 44 min
- `tcpilot` done, exit 0 in 0 min
- `tcbb` done, exit 0 in 0 min
- `tctic` done, exit 0 in 0 min
- `tcgate` done, exit 0 in 0 min
- `tcpr` done, exit 0 in 0 min

### tcptic

**270 of 276 battles** (98%), 0 failed. Running 44 min, 372 battles/h, about 1 min left (ends ~12:36 PC time). Last battle 0 min ago.
Skipped turns a battle: 23.4 overall, first 100 35.6, last 100 14.3.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 60` | halt | ok | 0 failed of 270 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 60 over 200` | halt | ok | 17.8 a battle over the last 200 (first 200: 26.8) |

Stopping now would leave 6 battles unrun (about 1 min); every battle already fought is kept and a rerun resumes from it.

### tcbb

**0 of 1104 battles** (0%), 0 failed. Running 0 min. Last battle 0 min ago.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 60` | halt | ok | 0 failed of 0 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 60 over 200` | halt | waiting | 0 of 200 battles to read |

Stopping now would leave 1104 battles unrun; every battle already fought is kept and a rerun resumes from it.

### tctic

**0 of 1104 battles** (0%), 0 failed. Running 0 min. Last battle 0 min ago.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 60` | halt | ok | 0 failed of 0 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 60 over 200` | halt | waiting | 0 of 200 battles to read |

Stopping now would leave 1104 battles unrun; every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
12:23:05 progress tcptic: 183/276 (66%) battles, 352/h, ETA 16 min, 0 failed, skips 19.2/battle (last 100)
12:35:24 tcptic exit=0 in 2612 s
12:35:24 start tcpilot
12:35:25 tcpilot exit=0 in 0 s
12:35:25 start tcbb
12:35:25 watching tcbb: 3 stop rule(s)
12:35:25 tcbb exit=0 in 0 s
12:35:25 start tctic
12:35:25 watching tctic: 3 stop rule(s)
12:35:26 tctic exit=0 in 0 s
12:35:26 start tcgate
12:35:26 tcgate exit=0 in 0 s
12:35:26 start tcpr
12:35:33 tcpr exit=0 in 7 s
12:35:33 ALLDONE
```
