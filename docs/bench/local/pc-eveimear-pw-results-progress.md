# Queue pc-eveimear-pw: progress

Updated 2026-11-04 11:06:53 PC time (11:06 UTC), runner pid 22484.

- `prep` done, exit 0 in 0 min
- `pilot` done, exit 0 in 17 min
- `pilotgate` done, exit 0 in 0 min
- `screen` done, exit 0 in 1.2 h
- `build` done, exit 0 in 0 min
- `confirm` running
- `gate` pending
- `pr` pending

### pilot

**4120 of 4120 battles** (100%), 0 failed. Running 17 min, 14258 battles/h, about 0 min left (ends ~09:52 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0; engine disables 0.

| arm | battles | failed | share | vs control (pts) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 1030 | 0 | 83.64 | - | - | - | 0.0 |
| aa | 1030 | 0 | 83.62 | -0.02 (103 robots) | ±0.04 | -0.08 .. +0.04 | 0.0 |
| p3 | 1030 | 0 | 82.31 | -1.32 (103 robots) | ±0.66 | -2.33 .. -0.32 | 0.0 |
| p1 | 1030 | 0 | 78.73 | -4.90 (103 robots) | ±0.91 | -6.29 .. -3.51 | 0.0 |
A/A: aa - c -0.02 pts over 103 robots; 1% band ±0.36 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 4120 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | ok | 0.0 a battle over the last 200 (first 200: 0.0) |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `aa after 20%` | halt | ok | aa - c -0.02 pts over 103 robots, stop band ±0.42 |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### screen

**16480 of 16480 battles** (100%), 0 failed. Running 1.2 h, 13618 battles/h, about 0 min left (ends ~11:04 PC time). Last battle 1 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0; engine disables 0.

| arm | battles | failed | share | vs control (pts) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 4120 | 0 | 83.81 | - | - | - | 0.0 |
| aa | 4120 | 0 | 83.81 | -0.00 (412 robots) | ±0.01 | -0.02 .. +0.02 | 0.0 |
| p3 | 4120 | 0 | 82.20 | -1.61 (412 robots) | ±0.31 | -2.08 .. -1.14 | 0.0 |
| p1 | 4120 | 0 | 78.96 | -4.85 (412 robots) | ±0.55 | -5.69 .. -4.01 | 0.0 |
A/A: aa - c -0.00 pts over 412 robots; 1% band ±0.18 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 16480 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | ok | 0.0 a battle over the last 200 (first 200: 0.0) |
| `stall 30m` | halt | ok | last battle 1 min ago |
| `aa after 20%` | halt | ok | aa - c -0.00 pts over 412 robots, stop band ±0.21 |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### confirm

**468 of 468 battles** (100%), 0 failed. Running 2 min, 12129 battles/h, about 0 min left (ends ~11:06 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0; engine disables 0.

| arm | battles | failed | share | vs control (pts) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 156 | 0 | 67.97 | - | - | - | 0.0 |
| aa | 156 | 0 | 68.13 | +0.16 (13 robots) | ±0.32 | -0.33 .. +0.64 | 0.0 |
| pk | 156 | 0 | 73.67 | +5.61 (13 robots) | ±4.10 | -0.66 .. +11.88 | 0.0 |
A/A: aa - c +0.16 pts over 13 robots; 1% band ±0.93 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 468 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | ok | 0.0 a battle over the last 200 (first 200: 0.0) |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
To https://github.com/lgriffin/Hadur_Robot.git
 ! [remote rejected]     e295c320fa82a3197964402a04d24a0abcf18d47 -> claude/pc-eveimear-pw-progress (Internal Server Er
09:52:42 pilot exit=0 in 1040 s
09:52:42 start pilotgate
09:52:42 pilotgate exit=0 in 0 s
09:52:42 start screen
09:52:42 watching screen: 5 stop rule(s)
10:06:23 progress screen: 3072/16480 (19%) battles, 13499/h, ETA 60 min, 0 failed, skips 0.0/battle (last 100), aa -0.01, p3 -1.23, p1 -4.47
10:36:44 progress screen: 10184/16480 (62%) battles, 14082/h, ETA 27 min, 0 failed, skips 0.0/battle (last 100), aa -0.02, p3 -1.66, p1 -4.87
11:04:32 screen exit=0 in 4309 s
11:04:32 start build
11:04:33 build exit=0 in 1 s
11:04:33 start confirm
11:04:33 watching confirm: 4 stop rule(s)
11:06:53 progress confirm: 468/468 (100%) battles, 12129/h, ETA 0 min, 0 failed, skips 0.0/battle (last 100), aa +0.16, pk +5.61
```
