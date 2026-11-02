# Queue pc-sanaro-n08: progress

Updated 2026-11-02 11:56:07 PC time (11:56 UTC), runner pid 6164.

- `prep` done, exit 0 in 1 min
- `teach` done, exit 0 in 24 min
- `distill-report` done, exit 0 in 0 min
- `arms` done, exit 0 in 0 min
- `live-S3` done, exit 0 in 33 min
- `live-HL2` done, exit 0 in 31 min
- `live-DE` running
- `live-DAE` pending
- `live-DAO` pending
- `read-live` pending
- `pr` pending

### teach

**258 of 258 battles** (100%), 0 failed. Running 24 min, 632 battles/h, about 0 min left (ends ~10:35 PC time). Last battle 0 min ago.
Skipped turns a battle: 28.9 overall, first 100 38.6, last 100 20.9.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 258 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 120 over 100` | halt | ok | 20.9 a battle over the last 100 (first 100: 38.6) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### live-S3

**430 of 430 battles** (100%), 0 failed. Running 33 min, 782 battles/h, about 0 min left (ends ~11:08 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 430 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.0 a battle over the last 100 (first 100: 0.0) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### live-HL2

**430 of 430 battles** (100%), 0 failed. Running 31 min, 832 battles/h, about 0 min left (ends ~11:39 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 430 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.0 a battle over the last 100 (first 100: 0.0) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### live-DE

**200 of 430 battles** (47%), 0 failed. Running 16 min, 741 battles/h, about 19 min left (ends ~12:14 PC time). Last battle 2 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 200 |
| `stall 30m` | halt | ok | last battle 2 min ago |
| `skips 40 over 100` | halt | ok | 0.0 a battle over the last 100 (first 100: 0.0) |

Stopping now would leave 230 battles unrun (about 19 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
10:35:19 start distill-report
10:35:38 distill-report exit=0 in 19 s
10:35:38 start arms
10:35:56 arms exit=0 in 17 s
10:35:56 start live-S3
10:35:56 watching live-S3: 3 stop rule(s)
10:41:26 progress live-S3: 70/430 (16%) battles, 763/h, ETA 28 min, 0 failed, skips 0.0/battle (last 100)
11:08:54 live-S3 exit=0 in 1978 s
11:08:54 start live-HL2
11:08:54 watching live-HL2: 3 stop rule(s)
11:11:44 progress live-HL2: 40/430 (9%) battles, 849/h, ETA 28 min, 0 failed, skips 0.0/battle (last 100)
11:39:56 live-HL2 exit=0 in 1861 s
11:39:56 start live-DE
11:39:56 watching live-DE: 3 stop rule(s)
11:42:00 progress live-DE: 30/430 (7%) battles, 869/h, ETA 28 min, 0 failed, skips 0.0/battle (last 100)
```
