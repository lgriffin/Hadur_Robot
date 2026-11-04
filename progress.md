# Queue pc-eveimear-pw: progress

Updated 2026-11-04 10:05:22 PC time (10:05 UTC), runner pid 22484.

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

**2833 of 16480 battles** (17%), 0 failed. Running 13 min, 13438 battles/h, about 1.0 h left (ends ~11:06 PC time). Last battle -0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0; engine disables 0.

| arm | battles | failed | share | vs control (pts) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 710 | 0 | 83.59 | - | - | - | 0.0 |
| aa | 708 | 0 | 83.59 | -0.01 (341 robots) | ±0.09 | -0.14 .. +0.13 | 0.0 |
| p3 | 706 | 0 | 82.15 | -1.44 (341 robots) | ±0.46 | -2.14 .. -0.73 | 0.0 |
| p1 | 709 | 0 | 78.99 | -4.60 (341 robots) | ±0.67 | -5.63 .. -3.57 | 0.0 |
A/A: aa - c -0.01 pts over 341 robots; 1% band ±0.44 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 2833 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | ok | 0.0 a battle over the last 200 (first 200: 0.0) |
| `stall 30m` | halt | ok | last battle -0 min ago |
| `aa after 20%` | halt | waiting | checks from 20% of the battles (now 17%) |

Stopping now would leave 13647 battles unrun (about 1.0 h); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
09:35:12 progress pushed to origin claude/pc-eveimear-pw-progress (every 15 min)
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
```
