# Queue pc-sanaro-n11: progress

Updated 2026-11-05 15:04:43 PC time (15:04 UTC), runner pid 62452.

- `prep` done, exit 0 in 0 min
- `arms` done, exit 0 in 0 min
- `pilot-S4` done, exit 0 in 9 min
- `pilot-H512` done, exit 0 in 9 min
- `pilot-H480` done, exit 0 in 9 min
- `pilot-H400` done, exit 0 in 9 min
- `pilot` failed, exit 3 in 0 min
- `live-S4` skipped
- `live-H512` skipped
- `live-H480` skipped
- `live-H400` skipped
- `read-live` skipped
- `pr` skipped

### pilot-S4

**172 of 172 battles** (100%), 0 failed. Running 9 min, 1125 battles/h, about 0 min left (ends ~14:38 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 172 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.0 a battle over the last 100 (first 100: 0.0) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### pilot-H512

**172 of 172 battles** (100%), 0 failed. Running 9 min, 1164 battles/h, about 0 min left (ends ~14:47 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 172 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.0 a battle over the last 100 (first 100: 0.0) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### pilot-H480

**172 of 172 battles** (100%), 0 failed. Running 9 min, 1176 battles/h, about 0 min left (ends ~14:55 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 172 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.0 a battle over the last 100 (first 100: 0.0) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### pilot-H400

**172 of 172 battles** (100%), 0 failed. Running 9 min, 1180 battles/h, about 0 min left (ends ~15:04 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 172 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.0 a battle over the last 100 (first 100: 0.0) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
14:47:05 watching pilot-H480: 3 stop rule(s)
14:55:51 pilot-H480 exit=0 in 526 s
14:55:51 start pilot-H400
14:55:51 watching pilot-H400: 3 stop rule(s)
14:59:50 progress pilot-H400: 76/172 (44%) battles, 1146/h, ETA 5 min, 0 failed, skips 0.0/battle (last 100)
15:04:36 pilot-H400 exit=0 in 524 s
15:04:36 start pilot
15:04:43 pilot exit=3 in 7 s
15:04:43 skip live-S4 (after pilot, which has not finished exit=0)
15:04:43 skip live-H512 (after live-S4, which has not finished exit=0)
15:04:43 skip live-H480 (after live-H512, which has not finished exit=0)
15:04:43 skip live-H400 (after live-H480, which has not finished exit=0)
15:04:43 skip read-live (after live-H400, which has not finished exit=0)
15:04:43 skip pr (after read-live, which has not finished exit=0)
15:04:43 ALLDONE
```
