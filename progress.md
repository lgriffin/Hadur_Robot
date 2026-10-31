# Queue pc-deise-e10: progress

Updated 2026-10-31 18:19:10 PC time (18:19 UTC), runner pid 65080.

- `prep` done, exit 0 in 0 min
- `live-D` done, exit 0 in 18 min
- `live-PL400` done, exit 0 in 19 min
- `live-PN` done, exit 0 in 19 min
- `live-PNS` done, exit 0 in 19 min
- `live-PNS6` done, exit 0 in 21 min
- `live-MIR` done, exit 0 in 17 min
- `live-SAOR` running
- `read` pending
- `pr` pending

### live-D

**276 of 276 battles** (100%), 0 failed. Running 18 min, 937 battles/h, about 0 min left (ends ~16:36 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 276 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.0 a battle over the last 100 (first 100: 0.0) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### live-PL400

**276 of 276 battles** (100%), 0 failed. Running 19 min, 884 battles/h, about 0 min left (ends ~16:54 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.2 overall, first 100 0.3, last 100 0.1.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 276 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.1 a battle over the last 100 (first 100: 0.3) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### live-PN

**276 of 276 battles** (100%), 0 failed. Running 19 min, 853 battles/h, about 0 min left (ends ~17:14 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.2 overall, first 100 0.3, last 100 0.1.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 276 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.1 a battle over the last 100 (first 100: 0.3) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### live-PNS

**276 of 276 battles** (100%), 0 failed. Running 19 min, 860 battles/h, about 0 min left (ends ~17:33 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.2 overall, first 100 0.1, last 100 0.4.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 276 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.4 a battle over the last 100 (first 100: 0.1) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### live-PNS6

**276 of 276 battles** (100%), 0 failed. Running 21 min, 801 battles/h, about 0 min left (ends ~17:54 PC time). Last battle 0 min ago.
Skipped turns a battle: 1.6 overall, first 100 1.1, last 100 1.4.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 276 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 1.4 a battle over the last 100 (first 100: 1.1) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### live-MIR

**276 of 276 battles** (100%), 0 failed. Running 17 min, 989 battles/h, about 0 min left (ends ~18:11 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.2 overall, first 100 0.2, last 100 0.1.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 276 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.1 a battle over the last 100 (first 100: 0.2) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### live-SAOR

**132 of 276 battles** (48%), 0 failed. Running 8 min, 973 battles/h, about 9 min left (ends ~18:28 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 132 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.0 a battle over the last 100 (first 100: 0.0) |

Stopping now would leave 144 battles unrun (about 9 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
16:54:57 watching live-PN: 3 stop rule(s)
17:14:22 live-PN exit=0 in 1165 s
17:14:22 start live-PNS
17:14:22 watching live-PNS: 3 stop rule(s)
17:19:39 progress live-PNS: 72/276 (26%) battles, 818/h, ETA 15 min, 0 failed, skips 0.1/battle (last 100)
17:33:37 live-PNS exit=0 in 1154 s
17:33:37 start live-PNS6
17:33:37 watching live-PNS6: 3 stop rule(s)
17:49:55 progress live-PNS6: 210/276 (76%) battles, 773/h, ETA 5 min, 0 failed, skips 2.2/battle (last 100)
17:54:17 live-PNS6 exit=0 in 1239 s
17:54:17 start live-MIR
17:54:17 watching live-MIR: 3 stop rule(s)
18:11:02 live-MIR exit=0 in 1004 s
18:11:02 start live-SAOR
18:11:02 watching live-SAOR: 3 stop rule(s)
```
