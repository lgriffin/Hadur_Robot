# Queue pc-team-angles: progress

Updated 2026-11-02 16:02:55 PC time (16:02 UTC), runner pid 44560.

- `anprep` done, exit 0 in 3 min
- `anbb` done, exit 0 in 21 min
- `anhv` done, exit 0 in 46 min
- `anwy` done, exit 0 in 47 min
- `anmd` done, exit 0 in 47 min
- `anglob` done, exit 0 in 0 min
- `anpick` done, exit 0 in 1 min
- `angate` done, exit 0 in 7 min
- `angbb` done, exit 0 in 7 min
- `ansum` done, exit 0 in 0 min
- `anpr` done, exit 0 in 0 min

### anbb

**736 of 720 battles** (102%), 0 failed. Running 21 min, 2096 battles/h, about -0 min left (ends ~13:28 PC time). Last battle 0 min ago.
Skipped turns a battle: 13.7 overall, first 100 18.5, last 100 8.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 736 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 8.0 a battle over the last 100 (first 100: 18.5) |

Stopping now would leave -16 battles unrun (about -0 min); every battle already fought is kept and a rerun resumes from it.

### anhv

**736 of 720 battles** (102%), 0 failed. Running 46 min, 963 battles/h, about -1 min left (ends ~14:13 PC time). Last battle 0 min ago.
Skipped turns a battle: 10.4 overall, first 100 11.8, last 100 8.2.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 736 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 8.2 a battle over the last 100 (first 100: 11.8) |

Stopping now would leave -16 battles unrun (about -1 min); every battle already fought is kept and a rerun resumes from it.

### anwy

**736 of 720 battles** (102%), 0 failed. Running 47 min, 944 battles/h, about -1 min left (ends ~15:00 PC time). Last battle 0 min ago.
Skipped turns a battle: 10.0 overall, first 100 12.1, last 100 8.1.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 736 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 8.1 a battle over the last 100 (first 100: 12.1) |

Stopping now would leave -16 battles unrun (about -1 min); every battle already fought is kept and a rerun resumes from it.

### anmd

**736 of 720 battles** (102%), 0 failed. Running 47 min, 933 battles/h, about -1 min left (ends ~15:47 PC time). Last battle 0 min ago.
Skipped turns a battle: 10.4 overall, first 100 11.8, last 100 8.3.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 736 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 8.3 a battle over the last 100 (first 100: 11.8) |

Stopping now would leave -16 battles unrun (about -1 min); every battle already fought is kept and a rerun resumes from it.

### angate

**96 battles**, 0 failed. Running 7 min, 869 battles/h. Last battle 0 min ago.
Skipped turns a battle: 10.6 overall, first 96 10.6, last 96 10.6.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 96 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | waiting | 96 of 100 battles to read |

### angbb

**96 battles**, 0 failed. Running 7 min, 850 battles/h. Last battle 0 min ago.
Skipped turns a battle: 10.0 overall, first 96 10.0, last 96 10.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 96 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | waiting | 96 of 100 battles to read |

### Queue log (last lines)

```
15:48:49 start anglob
15:48:50 anglob exit=0 in 0 s
15:48:50 start anpick
15:49:24 anpick exit=0 in 33 s
15:49:24 start angate
15:49:24 watching angate: 3 stop rule(s)
15:56:02 angate exit=0 in 397 s
15:56:02 start angbb
15:56:02 watching angbb: 3 stop rule(s)
16:02:48 angbb exit=0 in 406 s
16:02:48 start ansum
16:02:48 ansum exit=0 in 0 s
16:02:48 start anpr
16:02:55 anpr exit=0 in 6 s
16:02:55 ALLDONE
```
