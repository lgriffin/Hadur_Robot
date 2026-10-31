# Queue pc-team-concord: progress

Updated 2026-10-31 10:44:58 PC time (10:44 UTC), runner pid 21584.

- `ccprep` done, exit 0 in 2 min
- `ccbb` done, exit 0 in 1.1 h
- `cccn` done, exit 0 in 1.2 h
- `ccglob` done, exit 0 in 0 min
- `ccpick` done, exit 0 in 1 min
- `ccgate` done, exit 0 in 9 min
- `ccgbb` running
- `ccsum` pending
- `ccpr` pending

### ccbb

**1104 of 1104 battles** (100%), 0 failed. Running 1.1 h, 978 battles/h, about 0 min left (ends ~09:23 PC time). Last battle 0 min ago.
Skipped turns a battle: 8.6 overall, first 100 10.0, last 100 3.9.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 1104 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 3.9 a battle over the last 100 (first 100: 10.0) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### cccn

**1104 of 1104 battles** (100%), 0 failed. Running 1.2 h, 941 battles/h, about 0 min left (ends ~10:33 PC time). Last battle 0 min ago.
Skipped turns a battle: 10.2 overall, first 100 11.3, last 100 4.6.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 1104 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 4.6 a battle over the last 100 (first 100: 11.3) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### ccgate

**160 battles**, 0 failed. Running 9 min, 1065 battles/h. Last battle 0 min ago.
Skipped turns a battle: 10.0 overall, first 100 11.3, last 100 8.4.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 160 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 8.4 a battle over the last 100 (first 100: 11.3) |

### ccgbb

**12 battles**, 0 failed. Running 2 min, 437 battles/h. Last battle 1 min ago.
Skipped turns a battle: 11.3 overall, first 12 11.3, last 12 11.3.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 12 |
| `stall 30m` | halt | ok | last battle 1 min ago |
| `skips 40 over 100` | halt | waiting | 12 of 100 battles to read |

### Queue log (last lines)

```
09:23:15 ccbb exit=0 in 4063 s
09:23:15 start cccn
09:23:15 watching cccn: 3 stop rule(s)
09:46:28 progress cccn: 274/1104 (25%) battles, 708/h, ETA 1.2 h, 0 failed, skips 10.7/battle (last 100)
10:16:44 progress cccn: 760/1104 (69%) battles, 852/h, ETA 24 min, 0 failed, skips 14.5/battle (last 100)
10:33:37 cccn exit=0 in 4222 s
10:33:37 start ccglob
10:33:38 ccglob exit=0 in 0 s
10:33:38 start ccpick
10:34:19 ccpick exit=0 in 40 s
10:34:19 start ccgate
10:34:19 watching ccgate: 3 stop rule(s)
10:43:20 ccgate exit=0 in 540 s
10:43:20 start ccgbb
10:43:20 watching ccgbb: 3 stop rule(s)
```
