# Queue pc-sanaro-n10: progress

Updated 2026-11-03 10:31:23 PC time (10:31 UTC), runner pid 48284.

- `prep` done, exit 0 in 0 min
- `arms` done, exit 0 in 0 min
- `live-S3` done, exit 0 in 48 min
- `live-B480` done, exit 0 in 49 min
- `live-B400` done, exit 0 in 51 min
- `live-B320` done, exit 0 in 51 min
- `live-B4K8` running
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

**860 of 860 battles** (100%), 0 failed. Running 51 min, 1017 battles/h, about 0 min left (ends ~09:40 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 860 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.0 a battle over the last 100 (first 100: 0.0) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### live-B4K8

**856 of 860 battles** (100%), 0 failed. Running 51 min, 1007 battles/h, about 0 min left (ends ~10:31 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 856 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.0 a battle over the last 100 (first 100: 0.0) |

Stopping now would leave 4 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
07:52:18 progress live-B480: 740/860 (86%) battles, 1035/h, ETA 7 min, 0 failed, skips 0.0/battle (last 100)
07:58:49 live-B480 exit=0 in 2964 s
07:58:49 start live-B400
07:58:49 watching live-B400: 3 stop rule(s)
08:22:31 progress live-B400: 398/860 (46%) battles, 1008/h, ETA 28 min, 0 failed, skips 0.0/battle (last 100)
08:49:39 live-B400 exit=0 in 3049 s
08:49:39 start live-B320
08:49:39 watching live-B320: 3 stop rule(s)
08:52:43 progress live-B320: 60/860 (7%) battles, 1173/h, ETA 41 min, 0 failed, skips 0.0/battle (last 100)
09:22:55 progress live-B320: 460/860 (53%) battles, 830/h, ETA 29 min, 0 failed, skips 0.0/battle (last 100)
09:40:24 live-B320 exit=0 in 3044 s
09:40:24 start live-B4K8
09:40:24 watching live-B4K8: 3 stop rule(s)
09:53:08 progress live-B4K8: 247/860 (29%) battles, 1163/h, ETA 32 min, 0 failed, skips 0.0/battle (last 100)
10:23:20 progress live-B4K8: 712/860 (83%) battles, 995/h, ETA 9 min, 0 failed, skips 0.0/battle (last 100)
```
