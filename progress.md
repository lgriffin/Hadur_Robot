# Queue pc-sanaro-n09: progress

Updated 2026-11-02 18:14:41 PC time (18:14 UTC), runner pid 25896.

- `prep` done, exit 0 in 0 min
- `arms` done, exit 0 in 0 min
- `live-S3` done, exit 0 in 27 min
- `live-B560` done, exit 0 in 27 min
- `live-B480` done, exit 0 in 29 min
- `live-K80` running
- `live-K65` pending
- `read-live` pending
- `pr` pending

### live-S3

**430 of 430 battles** (100%), 0 failed. Running 27 min, 948 battles/h, about 0 min left (ends ~17:11 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 430 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.0 a battle over the last 100 (first 100: 0.0) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### live-B560

**430 of 430 battles** (100%), 0 failed. Running 27 min, 946 battles/h, about 0 min left (ends ~17:38 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 430 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.0 a battle over the last 100 (first 100: 0.0) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### live-B480

**430 of 430 battles** (100%), 0 failed. Running 29 min, 902 battles/h, about 0 min left (ends ~18:07 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 430 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.0 a battle over the last 100 (first 100: 0.0) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### live-K80

**123 of 430 battles** (29%), 0 failed. Running 7 min, 1032 battles/h, about 18 min left (ends ~18:32 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 123 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.0 a battle over the last 100 (first 100: 0.0) |

Stopping now would leave 307 battles unrun (about 18 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
16:44:27 arms exit=0 in 8 s
16:44:27 start live-S3
16:44:27 watching live-S3: 3 stop rule(s)
16:45:06 progress live-S3: 3/430 (1%) battles, 275/h, ETA 1.6 h, 0 failed, skips 0.0/battle (last 100)
17:11:40 live-S3 exit=0 in 1633 s
17:11:40 start live-B560
17:11:40 watching live-B560: 3 stop rule(s)
17:15:18 progress live-B560: 61/430 (14%) battles, 1010/h, ETA 22 min, 0 failed, skips 0.0/battle (last 100)
17:38:56 live-B560 exit=0 in 1635 s
17:38:56 start live-B480
17:38:56 watching live-B480: 3 stop rule(s)
17:45:29 progress live-B480: 110/430 (26%) battles, 1006/h, ETA 19 min, 0 failed, skips 0.0/battle (last 100)
18:07:32 live-B480 exit=0 in 1716 s
18:07:32 start live-K80
18:07:32 watching live-K80: 3 stop rule(s)
```
