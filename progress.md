# Queue pc-deise-e09: progress

Updated 2026-10-31 13:20:20 PC time (13:20 UTC), runner pid 20700.

- `prep` done, exit 0 in 1 min
- `live-D` done, exit 0 in 17 min
- `live-SAME` done, exit 0 in 17 min
- `live-PL400` done, exit 0 in 19 min
- `live-WARM4` done, exit 0 in 17 min
- `live-WARM16` done, exit 0 in 18 min
- `live-NARROW` done, exit 0 in 18 min
- `live-WSTOP` running
- `live-SAOR` pending
- `read` pending
- `pr` pending

### live-D

**276 of 276 battles** (100%), 0 failed. Running 17 min, 955 battles/h, about 0 min left (ends ~11:37 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 276 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.0 a battle over the last 100 (first 100: 0.0) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### live-SAME

**276 of 276 battles** (100%), 0 failed. Running 17 min, 951 battles/h, about 0 min left (ends ~11:54 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 276 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.0 a battle over the last 100 (first 100: 0.0) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### live-PL400

**276 of 276 battles** (100%), 0 failed. Running 19 min, 870 battles/h, about 0 min left (ends ~12:13 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.1 overall, first 100 0.2, last 100 0.1.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 276 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.1 a battle over the last 100 (first 100: 0.2) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### live-WARM4

**276 of 276 battles** (100%), 0 failed. Running 17 min, 964 battles/h, about 0 min left (ends ~12:30 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 276 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.0 a battle over the last 100 (first 100: 0.0) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### live-WARM16

**276 of 276 battles** (100%), 0 failed. Running 18 min, 924 battles/h, about 0 min left (ends ~12:48 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 276 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.0 a battle over the last 100 (first 100: 0.0) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### live-NARROW

**276 of 276 battles** (100%), 0 failed. Running 18 min, 945 battles/h, about 0 min left (ends ~13:06 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 276 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.0 a battle over the last 100 (first 100: 0.0) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### live-WSTOP

**228 of 276 battles** (83%), 0 failed. Running 14 min, 972 battles/h, about 3 min left (ends ~13:23 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 228 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.0 a battle over the last 100 (first 100: 0.0) |

Stopping now would leave 48 battles unrun (about 3 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
11:54:36 watching live-PL400: 3 stop rule(s)
12:13:38 live-PL400 exit=0 in 1142 s
12:13:38 start live-WARM4
12:13:38 watching live-WARM4: 3 stop rule(s)
12:20:49 progress live-WARM4: 119/276 (43%) battles, 994/h, ETA 9 min, 0 failed, skips 0.0/battle (last 100)
12:30:49 live-WARM4 exit=0 in 1031 s
12:30:49 start live-WARM16
12:30:49 watching live-WARM16: 3 stop rule(s)
12:48:45 live-WARM16 exit=0 in 1075 s
12:48:45 start live-NARROW
12:48:45 watching live-NARROW: 3 stop rule(s)
12:51:05 progress live-NARROW: 36/276 (13%) battles, 924/h, ETA 16 min, 0 failed, skips 0.0/battle (last 100)
13:06:16 live-NARROW exit=0 in 1051 s
13:06:16 start live-WSTOP
13:06:16 watching live-WSTOP: 3 stop rule(s)
```
