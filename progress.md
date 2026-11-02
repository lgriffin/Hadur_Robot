# Queue pc-sanaro-n09: progress

Updated 2026-11-02 19:04:30 PC time (19:04 UTC), runner pid 25896.

- `prep` done, exit 0 in 0 min
- `arms` done, exit 0 in 0 min
- `live-S3` done, exit 0 in 27 min
- `live-B560` done, exit 0 in 27 min
- `live-B480` done, exit 0 in 29 min
- `live-K80` done, exit 0 in 29 min
- `live-K65` done, exit 0 in 28 min
- `read-live` done, exit 0 in 0 min
- `pr` done, exit 0 in 0 min

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

**430 of 430 battles** (100%), 0 failed. Running 29 min, 903 battles/h, about 0 min left (ends ~18:36 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 430 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.0 a battle over the last 100 (first 100: 0.0) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### live-K65

**430 of 430 battles** (100%), 0 failed. Running 28 min, 918 battles/h, about 0 min left (ends ~19:04 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 430 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.0 a battle over the last 100 (first 100: 0.0) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
17:45:29 progress live-B480: 110/430 (26%) battles, 1006/h, ETA 19 min, 0 failed, skips 0.0/battle (last 100)
18:07:32 live-B480 exit=0 in 1716 s
18:07:32 start live-K80
18:07:32 watching live-K80: 3 stop rule(s)
18:15:42 progress live-K80: 150/430 (35%) battles, 1103/h, ETA 15 min, 0 failed, skips 0.0/battle (last 100)
18:36:07 live-K80 exit=0 in 1714 s
18:36:07 start live-K65
18:36:07 watching live-K65: 3 stop rule(s)
18:45:54 progress live-K65: 180/430 (42%) battles, 1104/h, ETA 14 min, 0 failed, skips 0.0/battle (last 100)
19:04:13 live-K65 exit=0 in 1686 s
19:04:13 start read-live
19:04:22 read-live exit=0 in 8 s
19:04:22 start pr
19:04:30 pr exit=0 in 7 s
19:04:30 ALLDONE
```
