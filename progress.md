# Queue pc-sanaro-n12: progress

Updated 2026-11-05 17:05:31 PC time (17:05 UTC), runner pid 55620.

- `prep` done, exit 0 in 0 min
- `arms` done, exit 0 in 0 min
- `pilot-S4` done, exit 0 in 10 min
- `pilot-K7` done, exit 0 in 10 min
- `pilot-K5` done, exit 0 in 10 min
- `pilot-K3` done, exit 0 in 10 min
- `pilot` failed, exit 3 in 1 min
- `live-S4` skipped
- `live-K7` skipped
- `live-K5` skipped
- `live-K3` skipped
- `read-live` skipped
- `pr` skipped

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

**172 of 172 battles** (100%), 0 failed. Running 10 min, 1049 battles/h, about 0 min left (ends ~17:04 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 172 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.0 a battle over the last 100 (first 100: 0.0) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
16:44:53 watching pilot-K5: 3 stop rule(s)
16:54:46 pilot-K5 exit=0 in 593 s
16:54:46 start pilot-K3
16:54:46 watching pilot-K3: 3 stop rule(s)
16:56:04 progress pilot-K3: 22/172 (13%) battles, 1019/h, ETA 9 min, 0 failed, skips 0.0/battle (last 100)
17:04:36 pilot-K3 exit=0 in 590 s
17:04:36 start pilot
17:05:31 pilot exit=3 in 54 s
17:05:31 skip live-S4 (after pilot, which has not finished exit=0)
17:05:31 skip live-K7 (after live-S4, which has not finished exit=0)
17:05:31 skip live-K5 (after live-K7, which has not finished exit=0)
17:05:31 skip live-K3 (after live-K5, which has not finished exit=0)
17:05:31 skip read-live (after live-K3, which has not finished exit=0)
17:05:31 skip pr (after read-live, which has not finished exit=0)
17:05:31 ALLDONE
```
