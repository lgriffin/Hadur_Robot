# Queue pc-deise-pt1: progress

Updated 2026-11-01 06:10:48 PC time (06:10 UTC), runner pid 15224.

- `prep` done, exit 0 in 0 min
- `live-TEACH` done, exit 0 in 23 min
- `build` done, exit 0 in 0 min
- `live-D` done, exit 0 in 19 min
- `live-PT0` done, exit 0 in 20 min
- `live-PTS` running
- `live-PTB` pending
- `read` pending
- `pr` pending

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

**170 of 276 battles** (62%), 0 failed. Running 13 min, 794 battles/h, about 8 min left (ends ~06:18 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.5 overall, first 100 0.5, last 100 0.5.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 170 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.5 a battle over the last 100 (first 100: 0.5) |

Stopping now would leave 106 battles unrun (about 8 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
04:55:16 progress pushed to origin claude/pc-deise-pt1-progress (every 15 min)
04:56:14 progress live-TEACH: 6/276 (2%) battles, 357/h, ETA 45 min, 0 failed, skips 58.8/battle (last 100)
05:18:29 live-TEACH exit=0 in 1395 s
05:18:29 start build
05:18:48 build exit=0 in 19 s
05:18:48 start live-D
05:18:48 watching live-D: 3 stop rule(s)
05:26:28 progress live-D: 114/276 (41%) battles, 893/h, ETA 11 min, 0 failed, skips 0.2/battle (last 100)
05:38:14 live-D exit=0 in 1166 s
05:38:14 start live-PT0
05:38:14 watching live-PT0: 3 stop rule(s)
05:56:42 progress live-PT0: 258/276 (93%) battles, 838/h, ETA 1 min, 0 failed, skips 0.8/battle (last 100)
05:57:57 live-PT0 exit=0 in 1183 s
05:57:57 start live-PTS
05:57:57 watching live-PTS: 3 stop rule(s)
```
