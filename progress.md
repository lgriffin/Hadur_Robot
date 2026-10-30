# Queue pc-sanaro-n04: progress

Updated 2026-10-30 04:08:47 PC time (04:08 UTC), runner pid 66564.

- `prep` done, exit 0 in 0 min
- `live-S0` done, exit 0 in 31 min
- `live-GG` done, exit 0 in 29 min
- `live-CL` done, exit 0 in 29 min
- `live-CL12` done, exit 0 in 29 min
- `live-CL22` done, exit 0 in 29 min
- `live-A` running
- `live-EN` pending
- `live-D2` pending
- `read-live` pending
- `pr` pending

### live-S0

**430 of 430 battles** (100%), 0 failed. Running 31 min, 823 battles/h, about 0 min left (ends ~01:54 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 430 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.0 a battle over the last 100 (first 100: 0.0) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### live-GG

**430 of 430 battles** (100%), 0 failed. Running 29 min, 883 battles/h, about 0 min left (ends ~02:23 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 430 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.0 a battle over the last 100 (first 100: 0.0) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### live-CL

**430 of 430 battles** (100%), 0 failed. Running 29 min, 889 battles/h, about 0 min left (ends ~02:52 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 430 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.0 a battle over the last 100 (first 100: 0.0) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### live-CL12

**430 of 430 battles** (100%), 0 failed. Running 29 min, 883 battles/h, about 0 min left (ends ~03:21 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 430 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.0 a battle over the last 100 (first 100: 0.0) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### live-CL22

**430 of 430 battles** (100%), 0 failed. Running 29 min, 882 battles/h, about 0 min left (ends ~03:50 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 430 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.0 a battle over the last 100 (first 100: 0.0) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### live-A

**220 of 430 battles** (51%), 0 failed. Running 18 min, 739 battles/h, about 17 min left (ends ~04:25 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 220 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.0 a battle over the last 100 (first 100: 0.0) |

Stopping now would leave 210 battles unrun (about 17 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
02:23:26 start live-CL
02:23:26 watching live-CL: 3 stop rule(s)
02:23:55 progress live-CL: 0/430 (0%) battles, 0 failed
02:52:27 live-CL exit=0 in 1741 s
02:52:27 start live-CL12
02:52:27 watching live-CL12: 3 stop rule(s)
02:54:10 progress live-CL12: 30/430 (7%) battles, 1049/h, ETA 23 min, 0 failed, skips 0.0/battle (last 100)
03:21:40 live-CL12 exit=0 in 1752 s
03:21:40 start live-CL22
03:21:40 watching live-CL22: 3 stop rule(s)
03:24:25 progress live-CL22: 50/430 (12%) battles, 1088/h, ETA 21 min, 0 failed, skips 0.0/battle (last 100)
03:50:55 live-CL22 exit=0 in 1755 s
03:50:55 start live-A
03:50:55 watching live-A: 3 stop rule(s)
03:54:40 progress live-A: 60/430 (14%) battles, 960/h, ETA 23 min, 0 failed, skips 0.0/battle (last 100)
```
