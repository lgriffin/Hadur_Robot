# Queue pc-sanaro-n05: progress

Updated 2026-10-30 22:54:08 PC time (22:54 UTC), runner pid 46788.

- `prep` done, exit 0 in 0 min
- `live-S2` done, exit 0 in 30 min
- `live-LQ` done, exit 0 in 30 min
- `live-LL` done, exit 0 in 30 min
- `live-LR` done, exit 0 in 30 min
- `live-L18` running
- `live-SC` pending
- `read-live` pending
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

**5 of 430 battles** (1%), 0 failed. Running 1 min, 388 battles/h, about 1.1 h left (ends ~23:59 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 5 0.0, last 5 0.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 5 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | waiting | 5 of 100 battles to read |

Stopping now would leave 425 battles unrun (about 1.1 h); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
21:23:21 live-S2 exit=0 in 1793 s
21:23:21 start live-LQ
21:23:21 watching live-LQ: 3 stop rule(s)
21:24:23 progress live-LQ: 8/430 (2%) battles, 467/h, ETA 54 min, 0 failed, skips 0.0/battle (last 100)
21:53:44 live-LQ exit=0 in 1822 s
21:53:44 start live-LL
21:53:44 watching live-LL: 3 stop rule(s)
21:54:38 progress live-LL: 10/430 (2%) battles, 661/h, ETA 38 min, 0 failed, skips 0.0/battle (last 100)
22:23:21 live-LL exit=0 in 1777 s
22:23:21 start live-LR
22:23:21 watching live-LR: 3 stop rule(s)
22:24:54 progress live-LR: 20/430 (5%) battles, 776/h, ETA 32 min, 0 failed, skips 0.0/battle (last 100)
22:53:21 live-LR exit=0 in 1800 s
22:53:21 start live-L18
22:53:21 watching live-L18: 3 stop rule(s)
```
