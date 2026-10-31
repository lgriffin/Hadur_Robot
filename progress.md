# Queue pc-team-concord: progress

Updated 2026-10-31 10:52:08 PC time (10:52 UTC), runner pid 21584.

- `ccprep` done, exit 0 in 2 min
- `ccbb` done, exit 0 in 1.1 h
- `cccn` done, exit 0 in 1.2 h
- `ccglob` done, exit 0 in 0 min
- `ccpick` done, exit 0 in 1 min
- `ccgate` done, exit 0 in 9 min
- `ccgbb` done, exit 0 in 9 min
- `ccsum` done, exit 0 in 0 min
- `ccpr` done, exit 0 in 0 min

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

**160 battles**, 0 failed. Running 9 min, 1104 battles/h. Last battle 0 min ago.
Skipped turns a battle: 9.3 overall, first 100 10.2, last 100 8.7.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 160 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 8.7 a battle over the last 100 (first 100: 10.2) |

### Queue log (last lines)

```
10:33:38 ccglob exit=0 in 0 s
10:33:38 start ccpick
10:34:19 ccpick exit=0 in 40 s
10:34:19 start ccgate
10:34:19 watching ccgate: 3 stop rule(s)
10:43:20 ccgate exit=0 in 540 s
10:43:20 start ccgbb
10:43:20 watching ccgbb: 3 stop rule(s)
10:46:59 progress ccgbb: 45 battles, 737/h, 0 failed, skips 10.4/battle (last 100)
10:52:01 ccgbb exit=0 in 521 s
10:52:01 start ccsum
10:52:02 ccsum exit=0 in 0 s
10:52:02 start ccpr
10:52:08 ccpr exit=0 in 6 s
10:52:08 ALLDONE
```
