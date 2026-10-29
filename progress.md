# Queue pc-sanaro-n03: progress

Updated 2026-10-29 11:37:28 PC time (11:37 UTC), runner pid 44076.

- `prep` done, exit 0 in 0 min
- `live-S0` done, exit 0 in 29 min
- `live-T60` done, exit 0 in 28 min
- `live-L10` done, exit 0 in 28 min
- `live-G18` done, exit 0 in 29 min
- `live-G36` done, exit 0 in 29 min
- `read-live` done, exit 0 in 0 min
- `pr` done, exit 0 in 0 min

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

**430 of 430 battles** (100%), 0 failed. Running 29 min, 888 battles/h, about 0 min left (ends ~11:37 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 430 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.0 a battle over the last 100 (first 100: 0.0) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
10:14:50 progress live-L10: 65/430 (15%) battles, 932/h, ETA 23 min, 0 failed, skips 0.0/battle (last 100)
10:39:02 live-L10 exit=0 in 1702 s
10:39:02 start live-G18
10:39:02 watching live-G18: 3 stop rule(s)
10:45:05 progress live-G18: 100/430 (23%) battles, 992/h, ETA 20 min, 0 failed, skips 0.0/battle (last 100)
11:08:09 live-G18 exit=0 in 1747 s
11:08:09 start live-G36
11:08:09 watching live-G36: 3 stop rule(s)
11:15:20 progress live-G36: 110/430 (26%) battles, 919/h, ETA 21 min, 0 failed, skips 0.0/battle (last 100)
11:37:12 live-G36 exit=0 in 1742 s
11:37:12 start read-live
11:37:21 read-live exit=0 in 8 s
11:37:21 start pr
11:37:28 pr exit=0 in 7 s
11:37:28 ALLDONE
```
