# Queue pc-sanaro-q: progress

Updated 2026-11-05 20:08:58 PC time (20:08 UTC), runner pid 31620.

- `prep` done, exit 0 in 0 min
- `arms` done, exit 0 in 0 min
- `pilot-S4` done, exit 0 in 10 min
- `pilot-QT` done, exit 0 in 9 min
- `pilot-QP` done, exit 0 in 8 min
- `pilot-QTP` running
- `pilot-EW` pending
- `pilot-EB` pending
- `pilot` pending
- `live-S4` pending
- `live-QT` pending
- `live-QP` pending
- `live-QTP` pending
- `live-EW` pending
- `live-EB` pending
- `read-live` pending
- `pr` pending

### pilot-S4

**172 of 172 battles** (100%), 0 failed. Running 10 min, 1080 battles/h, about 0 min left (ends ~19:49 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 172 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.0 a battle over the last 100 (first 100: 0.0) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### pilot-QT

**172 of 172 battles** (100%), 0 failed. Running 9 min, 1173 battles/h, about 0 min left (ends ~19:57 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 172 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.0 a battle over the last 100 (first 100: 0.0) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### pilot-QP

**172 of 172 battles** (100%), 0 failed. Running 8 min, 1248 battles/h, about 0 min left (ends ~20:06 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 172 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.0 a battle over the last 100 (first 100: 0.0) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### pilot-QTP

**72 of 172 battles** (42%), 0 failed. Running 3 min, 1488 battles/h, about 4 min left (ends ~20:13 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 72 0.0, last 72 0.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 72 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | waiting | 72 of 100 battles to read |

Stopping now would leave 100 battles unrun (about 4 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
19:39:14 prep exit=0 in 29 s
19:39:14 start arms
19:39:26 arms exit=0 in 11 s
19:39:26 start pilot-S4
19:39:26 watching pilot-S4: 3 stop rule(s)
19:39:45 progress pilot-S4: 4/172 (2%) battles, 752/h, ETA 13 min, 0 failed, skips 0.0/battle (last 100)
19:49:00 pilot-S4 exit=0 in 573 s
19:49:00 start pilot-QT
19:49:00 watching pilot-QT: 3 stop rule(s)
19:57:47 pilot-QT exit=0 in 527 s
19:57:47 start pilot-QP
19:57:47 watching pilot-QP: 3 stop rule(s)
20:06:04 pilot-QP exit=0 in 496 s
20:06:04 start pilot-QTP
20:06:04 watching pilot-QTP: 3 stop rule(s)
```
