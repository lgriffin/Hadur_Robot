# Queue pc-sanaro-n10: progress

Updated 2026-11-03 10:31:55 PC time (10:31 UTC), runner pid 48284.

- `prep` done, exit 0 in 0 min
- `arms` done, exit 0 in 0 min
- `live-S3` done, exit 0 in 48 min
- `live-B480` done, exit 0 in 49 min
- `live-B400` done, exit 0 in 51 min
- `live-B320` done, exit 0 in 51 min
- `live-B4K8` done, exit 0 in 51 min
- `read-live` done, exit 0 in 0 min
- `pr` done, exit 0 in 0 min

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

**860 of 860 battles** (100%), 0 failed. Running 51 min, 1009 battles/h, about 0 min left (ends ~10:31 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 860 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.0 a battle over the last 100 (first 100: 0.0) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
08:49:39 start live-B320
08:49:39 watching live-B320: 3 stop rule(s)
08:52:43 progress live-B320: 60/860 (7%) battles, 1173/h, ETA 41 min, 0 failed, skips 0.0/battle (last 100)
09:22:55 progress live-B320: 460/860 (53%) battles, 830/h, ETA 29 min, 0 failed, skips 0.0/battle (last 100)
09:40:24 live-B320 exit=0 in 3044 s
09:40:24 start live-B4K8
09:40:24 watching live-B4K8: 3 stop rule(s)
09:53:08 progress live-B4K8: 247/860 (29%) battles, 1163/h, ETA 32 min, 0 failed, skips 0.0/battle (last 100)
10:23:20 progress live-B4K8: 712/860 (83%) battles, 995/h, ETA 9 min, 0 failed, skips 0.0/battle (last 100)
10:31:34 live-B4K8 exit=0 in 3069 s
10:31:34 start read-live
10:31:48 read-live exit=0 in 14 s
10:31:48 start pr
10:31:55 pr exit=0 in 7 s
10:31:55 ALLDONE
```
