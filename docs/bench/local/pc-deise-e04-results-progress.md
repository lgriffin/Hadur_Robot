# Queue pc-deise-e04: progress

Updated 2026-10-29 06:14:55 PC time (06:14 UTC), runner pid 48840.

- `prep` done, exit 0 in 0 min
- `live-D` done, exit 0 in 17 min
- `live-FIT3F` done, exit 0 in 17 min
- `live-MIR` done, exit 0 in 16 min
- `live-SAOR` running
- `read` pending
- `pr` pending

### live-D

**276 of 276 battles** (100%), 0 failed. Running 17 min, 992 battles/h, about 0 min left (ends ~05:26 PC time). Last battle 0 min ago.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 276 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | waiting | 0 of 100 battles to read |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### live-FIT3F

**276 of 276 battles** (100%), 0 failed. Running 17 min, 963 battles/h, about 0 min left (ends ~05:43 PC time). Last battle 0 min ago.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 276 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | waiting | 0 of 100 battles to read |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### live-MIR

**276 of 276 battles** (100%), 0 failed. Running 17 min, 1003 battles/h, about 0 min left (ends ~06:00 PC time). Last battle 0 min ago.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 276 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | waiting | 0 of 100 battles to read |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### live-SAOR

**264 of 276 battles** (96%), 0 failed. Running 15 min, 1063 battles/h, about 1 min left (ends ~06:15 PC time). Last battle 0 min ago.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 264 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | waiting | 0 of 100 battles to read |

Stopping now would leave 12 battles unrun (about 1 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
05:09:37 prep exit=0 in 11 s
05:09:37 start live-D
05:09:37 watching live-D: 3 stop rule(s)
05:10:25 progress live-D: 15/276 (5%) battles, 1115/h, ETA 14 min, 0 failed
05:26:18 live-D exit=0 in 1001 s
05:26:18 start live-FIT3F
05:26:19 watching live-FIT3F: 3 stop rule(s)
05:40:39 progress live-FIT3F: 222/276 (80%) battles, 929/h, ETA 3 min, 0 failed
05:43:30 live-FIT3F exit=0 in 1031 s
05:43:30 start live-MIR
05:43:30 watching live-MIR: 3 stop rule(s)
06:00:01 live-MIR exit=0 in 990 s
06:00:01 start live-SAOR
06:00:01 watching live-SAOR: 3 stop rule(s)
06:10:53 progress live-SAOR: 168/276 (61%) battles, 928/h, ETA 7 min, 0 failed
```
