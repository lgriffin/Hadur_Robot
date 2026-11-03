# Queue pc-sanaro-n10: progress

Updated 2026-11-03 08:36:36 PC time (08:36 UTC), runner pid 48284.

- `prep` done, exit 0 in 0 min
- `arms` done, exit 0 in 0 min
- `live-S3` done, exit 0 in 48 min
- `live-B480` done, exit 0 in 49 min
- `live-B400` running
- `live-B320` pending
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

**572 of 860 battles** (67%), 0 failed. Running 38 min, 908 battles/h, about 19 min left (ends ~08:55 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 572 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.0 a battle over the last 100 (first 100: 0.0) |

Stopping now would leave 288 battles unrun (about 19 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
06:20:53 start arms
06:21:02 arms exit=0 in 8 s
06:21:02 start live-S3
06:21:02 watching live-S3: 3 stop rule(s)
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
```
