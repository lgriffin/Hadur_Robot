# Queue pc-deise-e08: progress

Updated 2026-10-31 05:27:41 PC time (05:27 UTC), runner pid 42972.

- `prep` done, exit 0 in 0 min
- `live-D` done, exit 0 in 17 min
- `live-H500` done, exit 0 in 16 min
- `live-H650` done, exit 0 in 16 min
- `live-H900` done, exit 0 in 16 min
- `live-HS650` running
- `live-SR` pending
- `live-SAOR` pending
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

**138 of 276 battles** (50%), 0 failed. Running 9 min, 884 battles/h, about 9 min left (ends ~05:37 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.1 overall, first 100 0.0, last 100 0.1.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 138 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.1 a battle over the last 100 (first 100: 0.0) |

Stopping now would leave 138 battles unrun (about 9 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
04:13:02 progress live-D: 6/276 (2%) battles, 594/h, ETA 27 min, 0 failed, skips 0.0/battle (last 100)
04:29:49 live-D exit=0 in 1043 s
04:29:49 start live-H500
04:29:49 watching live-H500: 3 stop rule(s)
04:43:18 progress live-H500: 222/276 (80%) battles, 988/h, ETA 3 min, 0 failed, skips 0.0/battle (last 100)
04:46:15 live-H500 exit=0 in 985 s
04:46:15 start live-H650
04:46:15 watching live-H650: 3 stop rule(s)
05:02:24 live-H650 exit=0 in 968 s
05:02:24 start live-H900
05:02:24 watching live-H900: 3 stop rule(s)
05:13:33 progress live-H900: 170/276 (62%) battles, 914/h, ETA 7 min, 0 failed, skips 0.0/battle (last 100)
05:18:19 live-H900 exit=0 in 954 s
05:18:19 start live-HS650
05:18:19 watching live-HS650: 3 stop rule(s)
```
