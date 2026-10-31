# Queue pc-sanaro-n06: progress

Updated 2026-10-31 21:19:55 PC time (21:19 UTC), runner pid 58568.

- `prep` done, exit 0 in 0 min
- `teach` done, exit 0 in 15 min
- `distill-report` done, exit 0 in 0 min
- `arms` done, exit 0 in 0 min
- `live-S2` done, exit 0 in 30 min
- `live-HT` done, exit 0 in 30 min
- `live-HD` done, exit 0 in 32 min
- `live-HS` running
- `read-live` pending
- `pr` pending

### teach

**130 of 130 battles** (100%), 0 failed. Running 15 min, 521 battles/h, about 0 min left (ends ~19:15 PC time). Last battle 0 min ago.
Skipped turns a battle: 34.7 overall, first 100 33.9, last 100 32.4.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 130 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 32.4 a battle over the last 100 (first 100: 33.9) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### live-S2

**430 of 430 battles** (100%), 0 failed. Running 30 min, 856 battles/h, about 0 min left (ends ~19:46 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 430 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.0 a battle over the last 100 (first 100: 0.0) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### live-HT

**430 of 430 battles** (100%), 0 failed. Running 30 min, 858 battles/h, about 0 min left (ends ~20:16 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 430 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.0 a battle over the last 100 (first 100: 0.0) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### live-HD

**430 of 430 battles** (100%), 0 failed. Running 32 min, 817 battles/h, about 0 min left (ends ~20:47 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 430 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.0 a battle over the last 100 (first 100: 0.0) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### live-HS

**429 of 430 battles** (100%), 0 failed. Running 32 min, 805 battles/h, about 0 min left (ends ~21:19 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 429 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.0 a battle over the last 100 (first 100: 0.0) |

Stopping now would leave 1 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
19:16:07 start live-S2
19:16:07 watching live-S2: 3 stop rule(s)
19:32:03 progress live-S2: 200/430 (47%) battles, 754/h, ETA 18 min, 0 failed, skips 0.0/battle (last 100)
19:46:17 live-S2 exit=0 in 1809 s
19:46:17 start live-HT
19:46:17 watching live-HT: 3 stop rule(s)
20:02:18 progress live-HT: 200/430 (47%) battles, 749/h, ETA 18 min, 0 failed, skips 0.0/battle (last 100)
20:16:21 live-HT exit=0 in 1804 s
20:16:21 start live-HD
20:16:21 watching live-HD: 3 stop rule(s)
20:32:33 progress live-HD: 200/430 (47%) battles, 741/h, ETA 19 min, 0 failed, skips 0.0/battle (last 100)
20:47:56 live-HD exit=0 in 1895 s
20:47:56 start live-HS
20:47:56 watching live-HS: 3 stop rule(s)
21:02:47 progress live-HS: 196/430 (46%) battles, 792/h, ETA 18 min, 0 failed, skips 0.0/battle (last 100)
```
