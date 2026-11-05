# Queue pc-sanaro-n12: progress

Updated 2026-11-05 16:55:03 PC time (16:55 UTC), runner pid 55620.

- `prep` done, exit 0 in 0 min
- `arms` done, exit 0 in 0 min
- `pilot-S4` done, exit 0 in 10 min
- `pilot-K7` done, exit 0 in 10 min
- `pilot-K5` done, exit 0 in 10 min
- `pilot-K3` running
- `pilot` pending
- `live-S4` pending
- `live-K7` pending
- `live-K5` pending
- `live-K3` pending
- `read-live` pending
- `pr` pending

### pilot-S4

**172 of 172 battles** (100%), 0 failed. Running 10 min, 1075 battles/h, about 0 min left (ends ~16:34 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 172 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.0 a battle over the last 100 (first 100: 0.0) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### pilot-K7

**172 of 172 battles** (100%), 0 failed. Running 10 min, 1022 battles/h, about 0 min left (ends ~16:44 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 172 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.0 a battle over the last 100 (first 100: 0.0) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### pilot-K5

**172 of 172 battles** (100%), 0 failed. Running 10 min, 1044 battles/h, about 0 min left (ends ~16:54 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 172 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.0 a battle over the last 100 (first 100: 0.0) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### pilot-K3

**4 of 172 battles** (2%), 0 failed. Running 0 min, 842 battles/h, about 12 min left (ends ~17:07 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 4 0.0, last 4 0.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 4 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | waiting | 4 of 100 battles to read |

Stopping now would leave 168 battles unrun (about 12 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
16:25:01 prep exit=0 in 11 s
16:25:01 start arms
16:25:11 arms exit=0 in 9 s
16:25:11 start pilot-S4
16:25:11 watching pilot-S4: 3 stop rule(s)
16:25:50 progress pilot-S4: 8/172 (5%) battles, 734/h, ETA 13 min, 0 failed, skips 0.0/battle (last 100)
16:34:47 pilot-S4 exit=0 in 576 s
16:34:47 start pilot-K7
16:34:47 watching pilot-K7: 3 stop rule(s)
16:44:53 pilot-K7 exit=0 in 605 s
16:44:53 start pilot-K5
16:44:53 watching pilot-K5: 3 stop rule(s)
16:54:46 pilot-K5 exit=0 in 593 s
16:54:46 start pilot-K3
16:54:46 watching pilot-K3: 3 stop rule(s)
```
