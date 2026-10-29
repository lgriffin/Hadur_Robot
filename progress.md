# Queue pc-sanaro-n02: progress

Updated 2026-10-29 02:06:51 PC time (02:06 UTC), runner pid 55936.

- `prep` done, exit 0 in 0 min
- `live-S0` done, exit 0 in 28 min
- `live-S02` done, exit 0 in 29 min
- `live-Q7` done, exit 0 in 28 min
- `live-D10` done, exit 0 in 28 min
- `live-L20` done, exit 0 in 30 min
- `live-T60` running
- `live-B800` skipped
- `read-live` skipped
- `pr` skipped

### live-S02

**430 of 430 battles** (100%), 0 failed. Running 29 min, 891 battles/h, about 0 min left (ends ~00:34 PC time). Last battle 0 min ago.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 430 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | waiting | 0 of 100 battles to read |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### live-Q7

**430 of 430 battles** (100%), 0 failed. Running 28 min, 909 battles/h, about 0 min left (ends ~01:03 PC time). Last battle 0 min ago.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 430 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | waiting | 0 of 100 battles to read |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### live-D10

**430 of 430 battles** (100%), 0 failed. Running 28 min, 915 battles/h, about 0 min left (ends ~01:31 PC time). Last battle 0 min ago.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 430 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | waiting | 0 of 100 battles to read |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### live-L20

**430 of 430 battles** (100%), 0 failed. Running 30 min, 866 battles/h, about 0 min left (ends ~02:01 PC time). Last battle 0 min ago.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 430 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | waiting | 0 of 100 battles to read |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### live-T60

**90 of 430 battles** (21%), 0 failed. Running 6 min, 959 battles/h, about 21 min left (ends ~02:28 PC time). Last battle 0 min ago.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 90 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | waiting | 0 of 100 battles to read |

Stopping now would leave 340 battles unrun (about 21 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
00:34:50 live-S02 exit=0 in 1737 s
00:34:50 start live-Q7
00:34:50 watching live-Q7: 3 stop rule(s)
00:37:08 progress live-Q7: 40/430 (9%) battles, 1043/h, ETA 22 min, 0 failed
01:03:13 live-Q7 exit=0 in 1703 s
01:03:13 start live-D10
01:03:13 watching live-D10: 3 stop rule(s)
01:07:23 progress live-D10: 61/430 (14%) battles, 878/h, ETA 25 min, 0 failed
01:31:25 live-D10 exit=0 in 1692 s
01:31:25 start live-L20
01:31:25 watching live-L20: 3 stop rule(s)
01:37:37 progress live-L20: 100/430 (23%) battles, 968/h, ETA 20 min, 0 failed
02:01:13 live-L20 exit=0 in 1787 s
02:01:13 start live-T60
02:01:13 watching live-T60: 3 stop rule(s)
```
