# Queue pc-jaylexi-pw: progress

Updated 2026-11-04 11:30:57 PC time (11:30 UTC), runner pid 38136.

- `prep` done, exit 0 in 0 min
- `pilot` done, exit 0 in 23 min
- `pilotgate` done, exit 0 in 0 min
- `screen` done, exit 0 in 0 min
- `build` done, exit 0 in 0 min
- `confirm` done, exit 0 in 0 min
- `gate` done, exit 0 in 0 min
- `pr` done, exit 0 in 0 min

### pilot

**5360 of 5360 battles** (100%), 0 failed. Running 23 min, 13756 battles/h, about 0 min left (ends ~11:30 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0; engine disables 0.

| arm | battles | failed | share | vs control (pts) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 1340 | 0 | 87.26 | - | - | - | 0.0 |
| aa | 1340 | 0 | 87.24 | -0.02 (134 robots) | ±0.07 | -0.12 .. +0.08 | 0.0 |
| hi | 1340 | 0 | 86.18 | -1.06 (134 robots) | ±0.39 | -1.66 .. -0.47 | 0.0 |
| lo | 1340 | 0 | 84.38 | -2.87 (134 robots) | ±1.31 | -4.88 .. -0.86 | 0.0 |
A/A: aa - c -0.02 pts over 134 robots; 1% band ±0.32 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 5360 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | ok | 0.0 a battle over the last 200 (first 200: 0.0) |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `aa after 20%` | halt | ok | aa - c -0.02 pts over 134 robots, stop band ±0.37 |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### screen

**0 of 21360 battles** (0%), 0 failed. Running 0 min. Last battle 0 min ago.

| arm | battles | failed | share | vs control (pts) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 0 | 0 | - | - | - | - | - |
| aa | 0 | 0 | - | - | - | - | - |
| hi | 0 | 0 | - | - | - | - | - |
| lo | 0 | 0 | - | - | - | - | - |

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 0 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | waiting | 0 of 200 battles to read |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `aa after 20%` | halt | waiting | checks from 20% of the battles (now 0%) |

Stopping now would leave 21360 battles unrun; every battle already fought is kept and a rerun resumes from it.

### confirm

**0 battles**, 0 failed. Running 0 min. Last battle 0 min ago.

| arm | battles | failed | share | vs control (pts) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 0 | 0 | - | - | - | - | - |
| aa | 0 | 0 | - | - | - | - | - |
| pk | 0 | 0 | - | - | - | - | - |

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 0 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | waiting | 0 of 200 battles to read |
| `stall 30m` | halt | ok | last battle 0 min ago |

> warning: arm pk's jar kitlab/jars/hadur117.mini.JayLexi_0.5pk.jar is missing

### Queue log (last lines)

```
11:30:50 start pilotgate
11:30:51 pilotgate exit=0 in 0 s
11:30:51 start screen
11:30:51 watching screen: 5 stop rule(s)
11:30:51 screen exit=0 in 0 s
11:30:51 start build
11:30:51 build exit=0 in 0 s
11:30:51 start confirm
11:30:51 watching confirm: 4 stop rule(s)
11:30:51 confirm exit=0 in 0 s
11:30:51 start gate
11:30:51 gate exit=0 in 0 s
11:30:51 start pr
11:30:57 pr exit=0 in 5 s
11:30:57 ALLDONE
```
