# Queue pc-sanaro-q: progress

Updated 2026-11-05 20:33:11 PC time (20:33 UTC), runner pid 31620.

- `prep` done, exit 0 in 0 min
- `arms` done, exit 0 in 0 min
- `pilot-S4` done, exit 0 in 10 min
- `pilot-QT` done, exit 0 in 9 min
- `pilot-QP` done, exit 0 in 8 min
- `pilot-QTP` done, exit 0 in 9 min
- `pilot-EW` done, exit 0 in 9 min
- `pilot-EB` done, exit 0 in 9 min
- `pilot` failed, exit 3 in 0 min
- `live-S4` skipped
- `live-QT` skipped
- `live-QP` skipped
- `live-QTP` skipped
- `live-EW` skipped
- `live-EB` skipped
- `read-live` skipped
- `pr` skipped

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

**172 of 172 battles** (100%), 0 failed. Running 9 min, 1125 battles/h, about 0 min left (ends ~20:33 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 172 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.0 a battle over the last 100 (first 100: 0.0) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
20:23:51 pilot-EW exit=0 in 551 s
20:23:51 start pilot-EB
20:23:51 watching pilot-EB: 3 stop rule(s)
20:33:01 pilot-EB exit=0 in 550 s
20:33:01 start pilot
20:33:11 pilot exit=3 in 9 s
20:33:11 skip live-S4 (after pilot, which has not finished exit=0)
20:33:11 skip live-QT (after live-S4, which has not finished exit=0)
20:33:11 skip live-QP (after live-QT, which has not finished exit=0)
20:33:11 skip live-QTP (after live-QP, which has not finished exit=0)
20:33:11 skip live-EW (after live-QTP, which has not finished exit=0)
20:33:11 skip live-EB (after live-EW, which has not finished exit=0)
20:33:11 skip read-live (after live-EB, which has not finished exit=0)
20:33:11 skip pr (after read-live, which has not finished exit=0)
20:33:11 ALLDONE
```
