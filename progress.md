# Queue pc-team-close: progress

Updated 2026-11-08 02:41:21 PC time (02:41 UTC), runner pid 24944.

- `tcprep` done, exit 0 in 2 min
- `tcbb1` done, exit 0 in 27 min
- `tctc1` done, exit 0 in 27 min
- `tcpilot` done, exit 0 in 0 min
- `tcbb2` running
- `tctc2` pending
- `tcgate` pending
- `tcpr` pending

### tcbb1

**360 of 368 battles** (98%), 0 failed. Running 27 min, 793 battles/h, about 1 min left (ends ~01:55 PC time). Last battle 0 min ago.
Skipped turns a battle: 18.2 overall, first 100 20.4, last 100 15.9.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 60` | halt | ok | 0 failed of 360 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 60 over 200` | halt | ok | 16.4 a battle over the last 200 (first 200: 20.0) |

Stopping now would leave 8 battles unrun (about 1 min); every battle already fought is kept and a rerun resumes from it.

### tctc1

**360 of 368 battles** (98%), 0 failed. Running 27 min, 792 battles/h, about 1 min left (ends ~02:22 PC time). Last battle 0 min ago.
Skipped turns a battle: 18.2 overall, first 100 19.9, last 100 16.1.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 60` | halt | ok | 0 failed of 360 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 60 over 200` | halt | ok | 16.6 a battle over the last 200 (first 200: 19.8) |

Stopping now would leave 8 battles unrun (about 1 min); every battle already fought is kept and a rerun resumes from it.

### tcbb2

**304 of 1104 battles** (28%), 0 failed. Running 19 min, 944 battles/h, about 51 min left (ends ~03:32 PC time). Last battle 0 min ago.
Skipped turns a battle: 20.5 overall, first 100 20.2, last 100 16.9.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 60` | halt | ok | 0 failed of 304 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 60 over 200` | halt | ok | 20.7 a battle over the last 200 (first 200: 22.4) |

Stopping now would leave 800 battles unrun (about 51 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
01:25:43 progress pushed to origin claude/pc-team-close-progress (every 15 min)
01:27:32 tcprep exit=0 in 110 s
01:27:32 start tcbb1
01:27:32 watching tcbb1: 3 stop rule(s)
01:27:42 progress tcbb1: 0/368 (0%) battles, 0 failed
01:54:46 tcbb1 exit=0 in 1633 s
01:54:46 start tctc1
01:54:46 watching tctc1: 3 stop rule(s)
01:57:58 progress tctc1: 10/368 (3%) battles, 187/h, ETA 1.9 h, 0 failed, skips 16.4/battle (last 100)
02:22:02 tctc1 exit=0 in 1635 s
02:22:02 start tcpilot
02:22:02 tcpilot exit=0 in 0 s
02:22:02 start tcbb2
02:22:02 watching tcbb2: 3 stop rule(s)
02:28:14 progress tcbb2: 60/1104 (5%) battles, 580/h, ETA 1.8 h, 0 failed, skips 18.9/battle (last 100)
```
