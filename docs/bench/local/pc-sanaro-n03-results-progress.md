# Queue pc-sanaro-n03: progress

Updated 2026-10-29 11:36:30 PC time (11:36 UTC), runner pid 44076.

- `prep` done, exit 0 in 0 min
- `live-S0` done, exit 0 in 29 min
- `live-T60` done, exit 0 in 28 min
- `live-L10` done, exit 0 in 28 min
- `live-G18` done, exit 0 in 29 min
- `live-G36` running
- `read-live` pending
- `pr` pending

### live-S0

**430 of 430 battles** (100%), 0 failed. Running 29 min, 900 battles/h, about 0 min left (ends ~09:42 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 430 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.0 a battle over the last 100 (first 100: 0.0) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### live-T60

**430 of 430 battles** (100%), 0 failed. Running 28 min, 908 battles/h, about 0 min left (ends ~10:10 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 430 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.0 a battle over the last 100 (first 100: 0.0) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### live-L10

**430 of 430 battles** (100%), 0 failed. Running 28 min, 909 battles/h, about 0 min left (ends ~10:39 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 430 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.0 a battle over the last 100 (first 100: 0.0) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### live-G18

**430 of 430 battles** (100%), 0 failed. Running 29 min, 886 battles/h, about 0 min left (ends ~11:08 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 430 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.0 a battle over the last 100 (first 100: 0.0) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### live-G36

**420 of 430 battles** (98%), 0 failed. Running 28 min, 889 battles/h, about 1 min left (ends ~11:37 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 420 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.0 a battle over the last 100 (first 100: 0.0) |

Stopping now would leave 10 battles unrun (about 1 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
09:42:13 start live-T60
09:42:13 watching live-T60: 3 stop rule(s)
09:44:35 progress live-T60: 40/430 (9%) battles, 1013/h, ETA 23 min, 0 failed, skips 0.0/battle (last 100)
10:10:39 live-T60 exit=0 in 1705 s
10:10:39 start live-L10
10:10:39 watching live-L10: 3 stop rule(s)
10:14:50 progress live-L10: 65/430 (15%) battles, 932/h, ETA 23 min, 0 failed, skips 0.0/battle (last 100)
10:39:02 live-L10 exit=0 in 1702 s
10:39:02 start live-G18
10:39:02 watching live-G18: 3 stop rule(s)
10:45:05 progress live-G18: 100/430 (23%) battles, 992/h, ETA 20 min, 0 failed, skips 0.0/battle (last 100)
11:08:09 live-G18 exit=0 in 1747 s
11:08:09 start live-G36
11:08:09 watching live-G36: 3 stop rule(s)
11:15:20 progress live-G36: 110/430 (26%) battles, 919/h, ETA 21 min, 0 failed, skips 0.0/battle (last 100)
```
