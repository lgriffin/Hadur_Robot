# Queue pc-sanaro-q: progress

Updated 2026-11-05 20:24:05 PC time (20:24 UTC), runner pid 31620.

- `prep` done, exit 0 in 0 min
- `arms` done, exit 0 in 0 min
- `pilot-S4` done, exit 0 in 10 min
- `pilot-QT` done, exit 0 in 9 min
- `pilot-QP` done, exit 0 in 8 min
- `pilot-QTP` done, exit 0 in 9 min
- `pilot-EW` done, exit 0 in 9 min
- `pilot-EB` running
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

**172 of 172 battles** (100%), 0 failed. Running 9 min, 1201 battles/h, about 0 min left (ends ~20:14 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 172 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.0 a battle over the last 100 (first 100: 0.0) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### pilot-EW

**172 of 172 battles** (100%), 0 failed. Running 9 min, 1123 battles/h, about 0 min left (ends ~20:23 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 172 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.0 a battle over the last 100 (first 100: 0.0) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### pilot-EB

**0 of 172 battles** (0%), 0 failed. Running 0 min. Last battle 0 min ago.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 0 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | waiting | 0 of 100 battles to read |

Stopping now would leave 172 battles unrun; every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
19:49:00 start pilot-QT
19:49:00 watching pilot-QT: 3 stop rule(s)
19:57:47 pilot-QT exit=0 in 527 s
19:57:47 start pilot-QP
19:57:47 watching pilot-QP: 3 stop rule(s)
20:06:04 pilot-QP exit=0 in 496 s
20:06:04 start pilot-QTP
20:06:04 watching pilot-QTP: 3 stop rule(s)
20:09:59 progress pilot-QTP: 76/172 (44%) battles, 1165/h, ETA 5 min, 0 failed, skips 0.0/battle (last 100)
20:14:39 pilot-QTP exit=0 in 515 s
20:14:39 start pilot-EW
20:14:39 watching pilot-EW: 3 stop rule(s)
20:23:51 pilot-EW exit=0 in 551 s
20:23:51 start pilot-EB
20:23:51 watching pilot-EB: 3 stop rule(s)
```
