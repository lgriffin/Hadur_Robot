# Queue pc-deise-e05: progress

Updated 2026-10-29 13:23:34 PC time (13:23 UTC), runner pid 42820.

- `prep` done, exit 0 in 0 min
- `live-D` done, exit 0 in 17 min
- `live-AIM2` done, exit 0 in 17 min
- `live-P2` done, exit 0 in 17 min
- `live-W10` done, exit 0 in 17 min
- `live-W50` done, exit 0 in 16 min
- `live-REACH` done, exit 0 in 16 min
- `live-R72` running
- `live-SAOR` pending
- `read` pending
- `pr` pending

### live-D

**276 of 276 battles** (100%), 0 failed. Running 17 min, 999 battles/h, about 0 min left (ends ~11:54 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 276 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.0 a battle over the last 100 (first 100: 0.0) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### live-AIM2

**276 of 276 battles** (100%), 0 failed. Running 17 min, 970 battles/h, about 0 min left (ends ~12:11 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 276 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.0 a battle over the last 100 (first 100: 0.0) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### live-P2

**276 of 276 battles** (100%), 0 failed. Running 17 min, 957 battles/h, about 0 min left (ends ~12:29 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 276 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.0 a battle over the last 100 (first 100: 0.0) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### live-W10

**276 of 276 battles** (100%), 0 failed. Running 17 min, 984 battles/h, about 0 min left (ends ~12:45 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 276 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.0 a battle over the last 100 (first 100: 0.0) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### live-W50

**276 of 276 battles** (100%), 0 failed. Running 17 min, 1004 battles/h, about 0 min left (ends ~13:02 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 276 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.0 a battle over the last 100 (first 100: 0.0) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### live-REACH

**276 of 276 battles** (100%), 0 failed. Running 17 min, 1003 battles/h, about 0 min left (ends ~13:18 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 276 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.0 a battle over the last 100 (first 100: 0.0) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### live-R72

**72 of 276 battles** (26%), 0 failed. Running 5 min, 924 battles/h, about 13 min left (ends ~13:36 PC time). Last battle 1 min ago.
Skipped turns a battle: 0.0 overall, first 72 0.0, last 72 0.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 72 |
| `stall 30m` | halt | ok | last battle 1 min ago |
| `skips 40 over 100` | halt | waiting | 72 of 100 battles to read |

Stopping now would leave 204 battles unrun (about 13 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
12:11:44 watching live-P2: 3 stop rule(s)
12:29:03 live-P2 exit=0 in 1038 s
12:29:03 start live-W10
12:29:03 watching live-W10: 3 stop rule(s)
12:39:13 progress live-W10: 144/276 (52%) battles, 850/h, ETA 9 min, 0 failed, skips 0.0/battle (last 100)
12:45:53 live-W10 exit=0 in 1010 s
12:45:53 start live-W50
12:45:53 watching live-W50: 3 stop rule(s)
13:02:23 live-W50 exit=0 in 990 s
13:02:23 start live-REACH
13:02:23 watching live-REACH: 3 stop rule(s)
13:09:27 progress live-REACH: 120/276 (43%) battles, 1018/h, ETA 9 min, 0 failed, skips 0.0/battle (last 100)
13:18:53 live-REACH exit=0 in 990 s
13:18:53 start live-R72
13:18:53 watching live-R72: 3 stop rule(s)
```
