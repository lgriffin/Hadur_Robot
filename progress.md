# Queue pc-eveimear-st2: progress

Updated 2026-11-03 23:13:11 PC time (23:13 UTC), runner pid 6348.

- `prep` done, exit 0 in 0 min
- `pilot` done, exit 0 in 12 min
- `pilotgate` done, exit 0 in 0 min
- `screen` done, exit 0 in 55 min
- `build` done, exit 0 in 0 min
- `confirm` done, exit 0 in 3 min
- `gate` done, exit 0 in 0 min
- `pr` done, exit 0 in 0 min

### pilot

**3360 of 3360 battles** (100%), 0 failed. Running 13 min, 16123 battles/h, about 0 min left (ends ~22:14 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0; engine disables 0.

| arm | battles | failed | share | vs control (pts) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 840 | 0 | 86.86 | - | - | - | 0.0 |
| aa | 840 | 0 | 86.84 | -0.02 (84 robots) | ±0.06 | -0.12 .. +0.07 | 0.0 |
| rn | 840 | 0 | 79.61 | -7.24 (84 robots) | ±2.23 | -10.66 .. -3.83 | 0.0 |
| sg | 840 | 0 | 79.63 | -7.22 (84 robots) | ±3.31 | -12.30 .. -2.15 | 0.0 |
A/A: aa - c -0.02 pts over 84 robots; 1% band ±0.40 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 3360 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | ok | 0.0 a battle over the last 200 (first 200: 0.0) |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `aa after 20%` | halt | ok | aa - c -0.02 pts over 84 robots, stop band ±0.47 |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### screen

**13280 of 13280 battles** (100%), 0 failed. Running 55 min, 14354 battles/h, about 0 min left (ends ~23:10 PC time). Last battle 1 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0; engine disables 0.

| arm | battles | failed | share | vs control (pts) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 3320 | 0 | 86.28 | - | - | - | 0.0 |
| aa | 3320 | 0 | 86.28 | -0.00 (332 robots) | ±0.01 | -0.02 .. +0.02 | 0.0 |
| rn | 3320 | 0 | 80.14 | -6.14 (332 robots) | ±0.94 | -7.58 .. -4.71 | 0.0 |
| sg | 3320 | 0 | 78.91 | -7.37 (332 robots) | ±1.64 | -9.88 .. -4.86 | 0.0 |
A/A: aa - c -0.00 pts over 332 robots; 1% band ±0.20 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 13280 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | ok | 0.0 a battle over the last 200 (first 200: 0.0) |
| `stall 30m` | halt | ok | last battle 1 min ago |
| `aa after 20%` | halt | ok | aa - c -0.00 pts over 332 robots, stop band ±0.24 |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### confirm

**576 of 576 battles** (100%), 0 failed. Running 3 min, 12749 battles/h, about 0 min left (ends ~23:13 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0; engine disables 0.

| arm | battles | failed | share | vs control (pts) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 192 | 0 | 67.70 | - | - | - | 0.0 |
| aa | 192 | 0 | 67.74 | +0.05 (16 robots) | ±0.13 | -0.15 .. +0.24 | 0.0 |
| pk | 192 | 0 | 70.23 | +2.51 (16 robots) | ±1.02 | +0.95 .. +4.07 | 0.0 |
A/A: aa - c +0.05 pts over 16 robots; 1% band ±0.84 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 576 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | ok | 0.0 a battle over the last 200 (first 200: 0.0) |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
22:14:57 start screen
22:14:57 watching screen: 5 stop rule(s)
22:33:30 progress screen: 4435/13280 (33%) battles, 14359/h, ETA 37 min, 0 failed, skips 0.0/battle (last 100), aa -0.01, rn -6.24, sg -7.28
23:03:48 progress screen: 11858/13280 (89%) battles, 14696/h, ETA 6 min, 0 failed, skips 0.0/battle (last 100), aa -0.00, rn -6.14, sg -7.40
23:10:19 screen exit=0 in 3322 s
23:10:19 start build
23:10:21 build exit=0 in 1 s
23:10:21 start confirm
23:10:21 watching confirm: 4 stop rule(s)
23:13:04 confirm exit=0 in 162 s
23:13:04 start gate
23:13:04 gate exit=0 in 0 s
23:13:04 start pr
23:13:11 pr exit=0 in 6 s
23:13:11 ALLDONE
```
