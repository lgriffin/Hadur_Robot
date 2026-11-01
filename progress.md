# Queue pc-deise-pt1: progress

Updated 2026-11-01 06:36:16 PC time (06:36 UTC), runner pid 15224.

- `prep` done, exit 0 in 0 min
- `live-TEACH` done, exit 0 in 23 min
- `build` done, exit 0 in 0 min
- `live-D` done, exit 0 in 19 min
- `live-PT0` done, exit 0 in 20 min
- `live-PTS` done, exit 0 in 19 min
- `live-PTB` done, exit 0 in 19 min
- `read` done, exit 0 in 0 min
- `pr` done, exit 0 in 0 min

### live-TEACH

**276 of 276 battles** (100%), 0 failed. Running 23 min, 712 battles/h, about 0 min left (ends ~05:18 PC time). Last battle 0 min ago.
Skipped turns a battle: 71.3 overall, first 100 61.8, last 100 82.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 276 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 120 over 100` | halt | ok | 82.0 a battle over the last 100 (first 100: 61.8) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### live-D

**276 of 276 battles** (100%), 0 failed. Running 19 min, 852 battles/h, about 0 min left (ends ~05:38 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.2 overall, first 100 0.1, last 100 0.2.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 276 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.2 a battle over the last 100 (first 100: 0.1) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### live-PT0

**276 of 276 battles** (100%), 0 failed. Running 20 min, 840 battles/h, about 0 min left (ends ~05:57 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.6 overall, first 100 0.4, last 100 0.7.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 276 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.7 a battle over the last 100 (first 100: 0.4) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### live-PTS

**276 of 276 battles** (100%), 0 failed. Running 19 min, 871 battles/h, about 0 min left (ends ~06:16 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.5 overall, first 100 0.5, last 100 0.4.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 276 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.4 a battle over the last 100 (first 100: 0.5) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### live-PTB

**276 of 276 battles** (100%), 0 failed. Running 19 min, 866 battles/h, about 0 min left (ends ~06:36 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.5 overall, first 100 0.6, last 100 0.4.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 276 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.4 a battle over the last 100 (first 100: 0.6) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
05:38:14 watching live-PT0: 3 stop rule(s)
05:56:42 progress live-PT0: 258/276 (93%) battles, 838/h, ETA 1 min, 0 failed, skips 0.8/battle (last 100)
05:57:57 live-PT0 exit=0 in 1183 s
05:57:57 start live-PTS
05:57:57 watching live-PTS: 3 stop rule(s)
06:16:58 live-PTS exit=0 in 1140 s
06:16:58 start live-PTB
06:16:58 watching live-PTB: 3 stop rule(s)
06:26:56 progress live-PTB: 132/276 (48%) battles, 795/h, ETA 11 min, 0 failed, skips 0.8/battle (last 100)
06:36:06 live-PTB exit=0 in 1147 s
06:36:06 start read
06:36:09 read exit=0 in 3 s
06:36:09 start pr
06:36:16 pr exit=0 in 6 s
06:36:16 ALLDONE
```
