# Queue pc-deise-e06: progress

Updated 2026-10-30 00:21:22 PC time (00:21 UTC), runner pid 55780.

- `prep` done, exit 0 in 0 min
- `live-D` done, exit 0 in 17 min
- `live-FA` done, exit 0 in 17 min
- `live-FAP` done, exit 0 in 17 min
- `live-FAW` done, exit 0 in 18 min
- `live-FAPW` done, exit 0 in 18 min
- `live-PW` done, exit 0 in 18 min
- `live-MIR` running
- `live-SAOR` pending
- `read` pending
- `pr` pending

### live-D

**276 of 276 battles** (100%), 0 failed. Running 17 min, 985 battles/h, about 0 min left (ends ~22:37 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 276 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.0 a battle over the last 100 (first 100: 0.0) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### live-FA

**276 of 276 battles** (100%), 0 failed. Running 17 min, 963 battles/h, about 0 min left (ends ~22:54 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.1 overall, first 100 0.1, last 100 0.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 276 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.0 a battle over the last 100 (first 100: 0.1) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### live-FAP

**276 of 276 battles** (100%), 0 failed. Running 17 min, 954 battles/h, about 0 min left (ends ~23:12 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.1 overall, first 100 0.2, last 100 0.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 276 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.0 a battle over the last 100 (first 100: 0.2) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### live-FAW

**276 of 276 battles** (100%), 0 failed. Running 18 min, 938 battles/h, about 0 min left (ends ~23:29 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.1 overall, first 100 0.1, last 100 0.1.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 276 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.1 a battle over the last 100 (first 100: 0.1) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### live-FAPW

**276 of 276 battles** (100%), 0 failed. Running 18 min, 912 battles/h, about 0 min left (ends ~23:47 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.1 overall, first 100 0.1, last 100 0.1.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 276 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.1 a battle over the last 100 (first 100: 0.1) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### live-PW

**276 of 276 battles** (100%), 0 failed. Running 18 min, 917 battles/h, about 0 min left (ends ~00:06 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.1 overall, first 100 0.1, last 100 0.1.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 276 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.1 a battle over the last 100 (first 100: 0.1) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### live-MIR

**247 of 276 battles** (89%), 0 failed. Running 15 min, 966 battles/h, about 2 min left (ends ~00:23 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.2 overall, first 100 0.2, last 100 0.1.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 247 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.1 a battle over the last 100 (first 100: 0.2) |

Stopping now would leave 29 battles unrun (about 2 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
22:54:48 watching live-FAP: 3 stop rule(s)
23:12:09 live-FAP exit=0 in 1041 s
23:12:09 start live-FAW
23:12:09 watching live-FAW: 3 stop rule(s)
23:21:52 progress live-FAW: 132/276 (48%) battles, 816/h, ETA 11 min, 0 failed, skips 0.1/battle (last 100)
23:29:49 live-FAW exit=0 in 1059 s
23:29:49 start live-FAPW
23:29:49 watching live-FAPW: 3 stop rule(s)
23:47:58 live-FAPW exit=0 in 1089 s
23:47:58 start live-PW
23:47:58 watching live-PW: 3 stop rule(s)
23:52:07 progress live-PW: 60/276 (22%) battles, 866/h, ETA 15 min, 0 failed, skips 0.1/battle (last 100)
00:06:02 live-PW exit=0 in 1083 s
00:06:02 start live-MIR
00:06:02 watching live-MIR: 3 stop rule(s)
```
