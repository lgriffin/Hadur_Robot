# Queue pc-deise-e08: progress

Updated 2026-10-31 06:06:00 PC time (06:06 UTC), runner pid 42972.

- `prep` done, exit 0 in 0 min
- `live-D` done, exit 0 in 17 min
- `live-H500` done, exit 0 in 16 min
- `live-H650` done, exit 0 in 16 min
- `live-H900` done, exit 0 in 16 min
- `live-HS650` done, exit 0 in 16 min
- `live-SR` done, exit 0 in 17 min
- `live-SAOR` running
- `read` pending
- `pr` pending

### live-D

**276 of 276 battles** (100%), 0 failed. Running 17 min, 952 battles/h, about 0 min left (ends ~04:29 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.1, last 100 0.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 276 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.0 a battle over the last 100 (first 100: 0.1) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### live-H500

**276 of 276 battles** (100%), 0 failed. Running 16 min, 1008 battles/h, about 0 min left (ends ~04:46 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 276 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.0 a battle over the last 100 (first 100: 0.0) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### live-H650

**276 of 276 battles** (100%), 0 failed. Running 16 min, 1025 battles/h, about 0 min left (ends ~05:02 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 276 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.0 a battle over the last 100 (first 100: 0.0) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### live-H900

**276 of 276 battles** (100%), 0 failed. Running 16 min, 1041 battles/h, about 0 min left (ends ~05:18 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 276 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.0 a battle over the last 100 (first 100: 0.0) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### live-HS650

**276 of 276 battles** (100%), 0 failed. Running 16 min, 1019 battles/h, about 0 min left (ends ~05:34 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 276 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.0 a battle over the last 100 (first 100: 0.0) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### live-SR

**276 of 276 battles** (100%), 0 failed. Running 17 min, 982 battles/h, about 0 min left (ends ~05:51 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 276 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.0 a battle over the last 100 (first 100: 0.0) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### live-SAOR

**264 of 276 battles** (96%), 0 failed. Running 15 min, 1087 battles/h, about 1 min left (ends ~06:06 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 264 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.0 a battle over the last 100 (first 100: 0.0) |

Stopping now would leave 12 battles unrun (about 1 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
04:46:15 watching live-H650: 3 stop rule(s)
05:02:24 live-H650 exit=0 in 968 s
05:02:24 start live-H900
05:02:24 watching live-H900: 3 stop rule(s)
05:13:33 progress live-H900: 170/276 (62%) battles, 914/h, ETA 7 min, 0 failed, skips 0.0/battle (last 100)
05:18:19 live-H900 exit=0 in 954 s
05:18:19 start live-HS650
05:18:19 watching live-HS650: 3 stop rule(s)
05:34:34 live-HS650 exit=0 in 975 s
05:34:34 start live-SR
05:34:34 watching live-SR: 3 stop rule(s)
05:43:49 progress live-SR: 131/276 (47%) battles, 850/h, ETA 10 min, 0 failed, skips 0.0/battle (last 100)
05:51:26 live-SR exit=0 in 1011 s
05:51:26 start live-SAOR
05:51:26 watching live-SAOR: 3 stop rule(s)
```
