# Queue pc-deise-e07: progress

Updated 2026-10-30 18:51:07 PC time (18:51 UTC), runner pid 69032.

- `prep` done, exit 0 in 0 min
- `live-D` done, exit 0 in 17 min
- `live-P3` done, exit 0 in 18 min
- `live-P075` done, exit 0 in 17 min
- `live-SHARP` done, exit 0 in 18 min
- `live-WV2` done, exit 0 in 17 min
- `live-CONS` running
- `live-SCAL` pending
- `live-RS` pending
- `live-SAOR` pending
- `read` pending
- `pr` pending

### live-D

**276 of 276 battles** (100%), 0 failed. Running 17 min, 962 battles/h, about 0 min left (ends ~17:38 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 276 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.0 a battle over the last 100 (first 100: 0.0) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### live-P3

**276 of 276 battles** (100%), 0 failed. Running 18 min, 927 battles/h, about 0 min left (ends ~17:55 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 276 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.0 a battle over the last 100 (first 100: 0.0) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### live-P075

**276 of 276 battles** (100%), 0 failed. Running 17 min, 964 battles/h, about 0 min left (ends ~18:13 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 276 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.0 a battle over the last 100 (first 100: 0.0) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### live-SHARP

**276 of 276 battles** (100%), 0 failed. Running 18 min, 939 battles/h, about 0 min left (ends ~18:30 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.1, last 100 0.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 276 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.0 a battle over the last 100 (first 100: 0.1) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### live-WV2

**276 of 276 battles** (100%), 0 failed. Running 17 min, 961 battles/h, about 0 min left (ends ~18:47 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.1, last 100 0.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 276 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.0 a battle over the last 100 (first 100: 0.1) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### live-CONS

**45 of 276 battles** (16%), 0 failed. Running 3 min, 845 battles/h, about 16 min left (ends ~19:07 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 45 0.0, last 45 0.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 45 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | waiting | 45 of 100 battles to read |

Stopping now would leave 231 battles unrun (about 16 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
17:38:01 watching live-P3: 3 stop rule(s)
17:51:36 progress live-P3: 192/276 (70%) battles, 848/h, ETA 6 min, 0 failed, skips 0.0/battle (last 100)
17:55:53 live-P3 exit=0 in 1071 s
17:55:53 start live-P075
17:55:53 watching live-P075: 3 stop rule(s)
18:13:03 live-P075 exit=0 in 1030 s
18:13:03 start live-SHARP
18:13:03 watching live-SHARP: 3 stop rule(s)
18:21:52 progress live-SHARP: 129/276 (47%) battles, 878/h, ETA 10 min, 0 failed, skips 0.1/battle (last 100)
18:30:41 live-SHARP exit=0 in 1058 s
18:30:41 start live-WV2
18:30:41 watching live-WV2: 3 stop rule(s)
18:47:55 live-WV2 exit=0 in 1033 s
18:47:55 start live-CONS
18:47:55 watching live-CONS: 3 stop rule(s)
```
