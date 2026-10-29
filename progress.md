# Queue pc-team-path: progress

Updated 2026-10-29 08:06:37 PC time (08:06 UTC), runner pid 79320.

- `tpprep` done, exit 0 in 2 min
- `tpbb` done, exit 0 in 52 min
- `tpmp` done, exit 0 in 53 min
- `tptn` done, exit 0 in 2 min
- `tptnbb` done, exit 0 in 2 min
- `tppick` done, exit 0 in 0 min
- `tpgate` done, exit 0 in 0 min
- `tpgbb` done, exit 0 in 0 min
- `tpsum` done, exit 0 in 0 min
- `tppr` done, exit 0 in 0 min

### tpbb

**920 of 920 battles** (100%), 0 failed. Running 52 min, 1067 battles/h, about 0 min left (ends ~07:09 PC time). Last battle 0 min ago.
Skipped turns a battle: 8.0 overall, first 100 7.8, last 100 4.4.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 920 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 4.4 a battle over the last 100 (first 100: 7.8) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### tpmp

**920 of 920 battles** (100%), 0 failed. Running 53 min, 1032 battles/h, about 0 min left (ends ~08:03 PC time). Last battle 0 min ago.
Skipped turns a battle: 8.2 overall, first 100 8.1, last 100 4.9.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 920 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 4.9 a battle over the last 100 (first 100: 8.1) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### tptn

**32 of 32 battles** (100%), 0 failed. Running 2 min, 1126 battles/h, about 0 min left (ends ~08:04 PC time). Last battle 0 min ago.
Skipped turns a battle: 11.8 overall, first 32 11.8, last 32 11.8.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 32 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | waiting | 32 of 100 battles to read |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### tptnbb

**32 of 32 battles** (100%), 0 failed. Running 2 min, 1138 battles/h, about 0 min left (ends ~08:06 PC time). Last battle 0 min ago.
Skipped turns a battle: 11.6 overall, first 32 11.6, last 32 11.6.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 32 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | waiting | 32 of 100 battles to read |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### tpgate

**0 battles**, 0 failed. Running 0 min. Last battle 0 min ago.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 0 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | waiting | 0 of 100 battles to read |

### tpgbb

**0 battles**, 0 failed. Running 0 min. Last battle 0 min ago.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 0 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | waiting | 0 of 100 battles to read |

### Queue log (last lines)

```
08:04:49 watching tptnbb: 3 stop rule(s)
08:06:30 tptnbb exit=0 in 101 s
08:06:30 start tppick
08:06:31 tppick exit=0 in 0 s
08:06:31 start tpgate
08:06:31 watching tpgate: 3 stop rule(s)
08:06:31 tpgate exit=0 in 0 s
08:06:31 start tpgbb
08:06:31 watching tpgbb: 3 stop rule(s)
08:06:31 tpgbb exit=0 in 0 s
08:06:31 start tpsum
08:06:31 tpsum exit=0 in 0 s
08:06:31 start tppr
08:06:37 tppr exit=0 in 5 s
08:06:37 ALLDONE
```
