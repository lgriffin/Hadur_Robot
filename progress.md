# Queue pc-team-quarters: progress

Updated 2026-11-11 18:15:00 PC time (18:15 UTC), runner pid 39880.

- `qtprep` done, exit 0 in 2 min
- `qtbb` done, exit 0 in 10 min
- `qtqt` done, exit 0 in 10 min
- `qtpick` done, exit 0 in 0 min
- `qtgprep` done, exit 0 in 1 min
- `qtgbb` done, exit 0 in 2 min
- `qtgqg` done, exit 0 in 2 min
- `qtsum` done, exit 0 in 0 min
- `qtpr` done, exit 0 in 0 min

### qtbb

**240 of 240 battles** (100%), 0 failed. Running 10 min, 1476 battles/h, about 0 min left (ends ~17:59 PC time). Last battle 0 min ago.
Skipped turns a battle: 18.1 overall, first 100 25.5, last 100 12.1.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 240 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 12.1 a battle over the last 100 (first 100: 25.5) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### qtqt

**240 of 240 battles** (100%), 0 failed. Running 10 min, 1468 battles/h, about 0 min left (ends ~18:09 PC time). Last battle 0 min ago.
Skipped turns a battle: 19.0 overall, first 100 27.1, last 100 13.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 240 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 13.0 a battle over the last 100 (first 100: 27.1) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### qtgbb

**32 battles**, 0 failed. Running 2 min, 818 battles/h. Last battle 0 min ago.
Skipped turns a battle: 20.2 overall, first 32 20.2, last 32 20.2.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 32 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | waiting | 32 of 100 battles to read |

### qtgqg

**32 battles**, 0 failed. Running 2 min, 802 battles/h. Last battle 0 min ago.
Skipped turns a battle: 21.1 overall, first 32 21.1, last 32 21.1.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 32 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | waiting | 32 of 100 battles to read |

### Queue log (last lines)

```
18:09:33 start qtpick
18:09:36 qtpick exit=0 in 2 s
18:09:36 start qtgprep
18:10:08 qtgprep exit=0 in 32 s
18:10:08 start qtgbb
18:10:08 watching qtgbb: 3 stop rule(s)
18:12:29 qtgbb exit=0 in 140 s
18:12:29 start qtgqg
18:12:29 watching qtgqg: 3 stop rule(s)
18:14:53 qtgqg exit=0 in 143 s
18:14:53 start qtsum
18:14:54 qtsum exit=0 in 0 s
18:14:54 start qtpr
18:15:00 qtpr exit=0 in 6 s
18:15:00 ALLDONE
```
