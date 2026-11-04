# Queue pc-jaylexi-orb: progress

Updated 2026-11-04 15:45:52 PC time (15:45 UTC), runner pid 35932.

- `prep` done, exit 0 in 0 min
- `pilot` done, exit 0 in 23 min
- `pilotgate` done, exit 0 in 0 min
- `screen` done, exit 0 in 1.6 h
- `build` done, exit 0 in 0 min
- `confirm` running
- `gate` pending
- `pr` pending

### pilot

**5360 of 5360 battles** (100%), 0 failed. Running 23 min, 14129 battles/h, about 0 min left (ends ~14:03 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0; engine disables 0.

| arm | battles | failed | share | vs control (pts) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 1340 | 0 | 87.39 | - | - | - | 0.0 |
| aa | 1340 | 0 | 87.39 | -0.00 (134 robots) | ±0.06 | -0.10 .. +0.10 | 0.0 |
| near | 1340 | 0 | 87.16 | -0.23 (134 robots) | ±0.27 | -0.65 .. +0.18 | 0.0 |
| far | 1340 | 0 | 87.01 | -0.39 (134 robots) | ±0.24 | -0.76 .. -0.02 | 0.0 |
A/A: aa - c -0.00 pts over 134 robots; 1% band ±0.32 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 5360 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | ok | 0.0 a battle over the last 200 (first 200: 0.0) |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `aa after 20%` | halt | ok | aa - c -0.00 pts over 134 robots, stop band ±0.37 |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### screen

**21360 of 21360 battles** (100%), 0 failed. Running 1.6 h, 12824 battles/h, about 0 min left (ends ~15:41 PC time). Last battle 1 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0; engine disables 0.

| arm | battles | failed | share | vs control (pts) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 5340 | 0 | 88.50 | - | - | - | 0.0 |
| aa | 5340 | 0 | 88.50 | -0.00 (534 robots) | ±0.02 | -0.04 .. +0.03 | 0.0 |
| near | 5340 | 0 | 88.37 | -0.13 (534 robots) | ±0.12 | -0.32 .. +0.05 | 0.0 |
| far | 5340 | 0 | 88.31 | -0.19 (534 robots) | ±0.12 | -0.37 .. -0.01 | 0.0 |
A/A: aa - c -0.00 pts over 534 robots; 1% band ±0.16 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 21360 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | ok | 0.0 a battle over the last 200 (first 200: 0.0) |
| `stall 30m` | halt | ok | last battle 1 min ago |
| `aa after 20%` | halt | ok | aa - c -0.00 pts over 534 robots, stop band ±0.19 |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### confirm

**741 of 792 battles** (94%), 0 failed. Running 4 min, 10975 battles/h, about 0 min left (ends ~15:46 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0; engine disables 0.

| arm | battles | failed | share | vs control (pts) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 246 | 0 | 71.33 | - | - | - | 0.0 |
| aa | 247 | 0 | 71.30 | -0.03 (22 robots) | ±0.25 | -0.42 .. +0.35 | 0.0 |
| pk | 248 | 0 | 73.13 | +1.81 (22 robots) | ±1.09 | +0.14 .. +3.48 | 0.0 |
A/A: aa - c -0.03 pts over 22 robots; 1% band ±0.74 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 741 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | ok | 0.0 a battle over the last 200 (first 200: 0.0) |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 51 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
13:41:46 progress pilot: 174/5360 (3%) battles, 11559/h, ETA 27 min, 0 failed, skips 0.0/battle (last 100), aa +0.14, near -0.57, far -0.30
14:03:37 pilot exit=0 in 1366 s
14:03:37 start pilotgate
14:03:37 pilotgate exit=0 in 0 s
14:03:37 start screen
14:03:37 watching screen: 5 stop rule(s)
14:12:00 progress screen: 1781/21360 (8%) battles, 12789/h, ETA 1.5 h, 0 failed, skips 0.0/battle (last 100), aa -0.03, near -0.17, far -0.16
14:42:21 progress screen: 8474/21360 (40%) battles, 13250/h, ETA 58 min, 0 failed, skips 0.0/battle (last 100), aa -0.01, near -0.19, far -0.21
15:12:34 progress screen: 15127/21360 (71%) battles, 13214/h, ETA 28 min, 0 failed, skips 0.0/battle (last 100), aa -0.01, near -0.15, far -0.14
15:41:46 screen exit=0 in 5888 s
15:41:46 start build
15:41:48 build exit=0 in 2 s
15:41:48 start confirm
15:41:48 watching confirm: 4 stop rule(s)
15:42:51 progress confirm: 164/792 (21%) battles, 9462/h, ETA 4 min, 0 failed, skips 0.0/battle (last 100), aa -0.10, pk +3.66
```
