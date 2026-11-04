# Queue pc-eveimear-pw: progress

Updated 2026-11-04 10:20:31 PC time (10:20 UTC), runner pid 22484.

- `prep` done, exit 0 in 0 min
- `pilot` done, exit 0 in 17 min
- `pilotgate` done, exit 0 in 0 min
- `screen` running
- `build` pending
- `confirm` pending
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

**6382 of 16480 battles** (39%), 0 failed. Running 28 min, 13784 battles/h, about 44 min left (ends ~11:04 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0; engine disables 0.

| arm | battles | failed | share | vs control (pts) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 1596 | 0 | 83.62 | - | - | - | 0.0 |
| aa | 1597 | 0 | 83.60 | -0.03 (407 robots) | ±0.05 | -0.11 .. +0.05 | 0.0 |
| p3 | 1593 | 0 | 82.16 | -1.45 (407 robots) | ±0.37 | -2.02 .. -0.89 | 0.0 |
| p1 | 1596 | 0 | 79.01 | -4.60 (407 robots) | ±0.58 | -5.49 .. -3.72 | 0.0 |
A/A: aa - c -0.03 pts over 407 robots; 1% band ±0.29 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 6382 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | ok | 0.0 a battle over the last 200 (first 200: 0.0) |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `aa after 20%` | halt | ok | aa - c -0.03 pts over 407 robots, stop band ±0.34 |

Stopping now would leave 10098 battles unrun (about 44 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
09:35:21 prep exit=0 in 11 s
09:35:21 start pilot
09:35:21 watching pilot: 5 stop rule(s)
09:36:11 progress pilot: 148/4120 (4%) battles, 10844/h, ETA 22 min, 0 failed, skips 0.0/battle (last 100), aa -0.02, p3 -1.16, p1 -4.96
09:50:20 progress push failed (the run is unaffected; later failures not logged): git push: remote: Internal Server Error        
remote: Request ID E6DD:204361:3506C5:667A2A:6AEAFFDB        
remote: Time 2026-11-04T09:50:20Z
To https://github.com/lgriffin/Hadur_Robot.git
 ! [remote rejected]     e295c320fa82a3197964402a04d24a0abcf18d47 -> claude/pc-eveimear-pw-progress (Internal Server Er
09:52:42 pilot exit=0 in 1040 s
09:52:42 start pilotgate
09:52:42 pilotgate exit=0 in 0 s
09:52:42 start screen
09:52:42 watching screen: 5 stop rule(s)
10:06:23 progress screen: 3072/16480 (19%) battles, 13499/h, ETA 60 min, 0 failed, skips 0.0/battle (last 100), aa -0.01, p3 -1.23, p1 -4.47
```
