# Queue pc-sanaro-n11: progress

Updated 2026-11-05 14:58:49 PC time (14:58 UTC), runner pid 62452.

- `prep` done, exit 0 in 0 min
- `arms` done, exit 0 in 0 min
- `pilot-S4` done, exit 0 in 9 min
- `pilot-H512` done, exit 0 in 9 min
- `pilot-H480` done, exit 0 in 9 min
- `pilot-H400` running
- `pilot` pending
- `live-S4` pending
- `live-H512` pending
- `live-H480` pending
- `live-H400` pending
- `read-live` pending
- `pr` pending

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

**72 of 172 battles** (42%), 0 failed. Running 3 min, 1453 battles/h, about 4 min left (ends ~15:02 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 72 0.0, last 72 0.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 72 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | waiting | 72 of 100 battles to read |

Stopping now would leave 100 battles unrun (about 4 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
14:28:53 prep exit=0 in 17 s
14:28:53 start arms
14:29:02 arms exit=0 in 9 s
14:29:02 start pilot-S4
14:29:02 watching pilot-S4: 3 stop rule(s)
14:29:36 progress pilot-S4: 8/172 (5%) battles, 866/h, ETA 11 min, 0 failed, skips 0.0/battle (last 100)
14:38:13 pilot-S4 exit=0 in 550 s
14:38:13 start pilot-H512
14:38:13 watching pilot-H512: 3 stop rule(s)
14:47:05 pilot-H512 exit=0 in 532 s
14:47:05 start pilot-H480
14:47:05 watching pilot-H480: 3 stop rule(s)
14:55:51 pilot-H480 exit=0 in 526 s
14:55:51 start pilot-H400
14:55:51 watching pilot-H400: 3 stop rule(s)
```
