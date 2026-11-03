# Queue pc-sanaro-n10: progress

Updated 2026-11-03 09:06:49 PC time (09:06 UTC), runner pid 48284.

- `prep` done, exit 0 in 0 min
- `arms` done, exit 0 in 0 min
- `live-S3` done, exit 0 in 48 min
- `live-B480` done, exit 0 in 49 min
- `live-B400` done, exit 0 in 51 min
- `live-B320` running
- `live-B4K8` pending
- `read-live` pending
- `pr` pending

### live-S3

**860 of 860 battles** (100%), 0 failed. Running 48 min, 1067 battles/h, about 0 min left (ends ~07:09 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 860 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.0 a battle over the last 100 (first 100: 0.0) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### live-B480

**860 of 860 battles** (100%), 0 failed. Running 49 min, 1044 battles/h, about 0 min left (ends ~07:58 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 860 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.0 a battle over the last 100 (first 100: 0.0) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### live-B400

**860 of 860 battles** (100%), 0 failed. Running 51 min, 1015 battles/h, about 0 min left (ends ~08:49 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 860 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.0 a battle over the last 100 (first 100: 0.0) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### live-B320

**360 of 860 battles** (42%), 0 failed. Running 17 min, 1259 battles/h, about 24 min left (ends ~09:30 PC time). Last battle 1 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 360 |
| `stall 30m` | halt | ok | last battle 1 min ago |
| `skips 40 over 100` | halt | ok | 0.0 a battle over the last 100 (first 100: 0.0) |

Stopping now would leave 500 battles unrun (about 24 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
06:21:42 progress live-S3: 0/860 (0%) battles, 0 failed
06:51:54 progress live-S3: 420/860 (49%) battles, 816/h, ETA 32 min, 0 failed, skips 0.0/battle (last 100)
07:09:24 live-S3 exit=0 in 2902 s
07:09:24 start live-B480
07:09:24 watching live-B480: 3 stop rule(s)
07:22:07 progress live-B480: 252/860 (29%) battles, 1190/h, ETA 31 min, 0 failed, skips 0.0/battle (last 100)
07:52:18 progress live-B480: 740/860 (86%) battles, 1035/h, ETA 7 min, 0 failed, skips 0.0/battle (last 100)
07:58:49 live-B480 exit=0 in 2964 s
07:58:49 start live-B400
07:58:49 watching live-B400: 3 stop rule(s)
08:22:31 progress live-B400: 398/860 (46%) battles, 1008/h, ETA 28 min, 0 failed, skips 0.0/battle (last 100)
08:49:39 live-B400 exit=0 in 3049 s
08:49:39 start live-B320
08:49:39 watching live-B320: 3 stop rule(s)
08:52:43 progress live-B320: 60/860 (7%) battles, 1173/h, ETA 41 min, 0 failed, skips 0.0/battle (last 100)
```
