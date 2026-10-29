# Queue pc-deise-e06: progress

Updated 2026-10-29 23:20:51 PC time (23:20 UTC), runner pid 55780.

- `prep` done, exit 0 in 0 min
- `live-D` done, exit 0 in 17 min
- `live-FA` done, exit 0 in 17 min
- `live-FAP` done, exit 0 in 17 min
- `live-FAW` running
- `live-FAPW` pending
- `live-PW` pending
- `live-MIR` pending
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

**130 of 276 battles** (47%), 0 failed. Running 9 min, 897 battles/h, about 10 min left (ends ~23:30 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.1 overall, first 100 0.1, last 100 0.1.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 130 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.1 a battle over the last 100 (first 100: 0.1) |

Stopping now would leave 146 battles unrun (about 10 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
22:20:27 progress pushed to origin claude/pc-deise-e06-progress (every 15 min)
22:20:48 prep exit=0 in 23 s
22:20:48 start live-D
22:20:48 watching live-D: 3 stop rule(s)
22:21:24 progress live-D: 6/276 (2%) battles, 594/h, ETA 27 min, 0 failed, skips 0.0/battle (last 100)
22:37:36 live-D exit=0 in 1008 s
22:37:36 start live-FA
22:37:36 watching live-FA: 3 stop rule(s)
22:51:38 progress live-FA: 222/276 (80%) battles, 949/h, ETA 3 min, 0 failed, skips 0.0/battle (last 100)
22:54:48 live-FA exit=0 in 1031 s
22:54:48 start live-FAP
22:54:48 watching live-FAP: 3 stop rule(s)
23:12:09 live-FAP exit=0 in 1041 s
23:12:09 start live-FAW
23:12:09 watching live-FAW: 3 stop rule(s)
```
