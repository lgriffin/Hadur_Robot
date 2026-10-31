# Queue pc-sanaro-n05: progress

Updated 2026-10-31 00:00:41 PC time (00:00 UTC), runner pid 46788.

- `prep` done, exit 0 in 0 min
- `live-S2` done, exit 0 in 30 min
- `live-LQ` done, exit 0 in 30 min
- `live-LL` done, exit 0 in 30 min
- `live-LR` done, exit 0 in 30 min
- `live-L18` done, exit 0 in 32 min
- `live-SC` done, exit 0 in 32 min
- `read-live` running
- `pr` pending

### live-S2

**430 of 430 battles** (100%), 0 failed. Running 30 min, 863 battles/h, about 0 min left (ends ~21:23 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 430 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.0 a battle over the last 100 (first 100: 0.0) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### live-LQ

**430 of 430 battles** (100%), 0 failed. Running 30 min, 849 battles/h, about 0 min left (ends ~21:53 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 430 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.0 a battle over the last 100 (first 100: 0.0) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### live-LL

**430 of 430 battles** (100%), 0 failed. Running 30 min, 871 battles/h, about 0 min left (ends ~22:23 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 430 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.0 a battle over the last 100 (first 100: 0.0) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### live-LR

**430 of 430 battles** (100%), 0 failed. Running 30 min, 860 battles/h, about 0 min left (ends ~22:53 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 430 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.0 a battle over the last 100 (first 100: 0.0) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### live-L18

**430 of 430 battles** (100%), 0 failed. Running 32 min, 808 battles/h, about 0 min left (ends ~23:25 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 430 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.0 a battle over the last 100 (first 100: 0.0) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### live-SC

**430 of 430 battles** (100%), 0 failed. Running 32 min, 802 battles/h, about 0 min left (ends ~23:57 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 430 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.0 a battle over the last 100 (first 100: 0.0) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
22:23:21 live-LL exit=0 in 1777 s
22:23:21 start live-LR
22:23:21 watching live-LR: 3 stop rule(s)
22:24:54 progress live-LR: 20/430 (5%) battles, 776/h, ETA 32 min, 0 failed, skips 0.0/battle (last 100)
22:53:21 live-LR exit=0 in 1800 s
22:53:21 start live-L18
22:53:21 watching live-L18: 3 stop rule(s)
22:55:08 progress live-L18: 30/430 (7%) battles, 1009/h, ETA 24 min, 0 failed, skips 0.0/battle (last 100)
23:25:18 live-L18 exit=0 in 1916 s
23:25:18 start live-SC
23:25:18 watching live-SC: 3 stop rule(s)
23:25:23 progress live-SC: 0/430 (0%) battles, 0 failed
23:55:39 progress live-SC: 400/430 (93%) battles, 791/h, ETA 2 min, 0 failed, skips 0.0/battle (last 100)
23:57:29 live-SC exit=0 in 1931 s
23:57:29 start read-live
```
