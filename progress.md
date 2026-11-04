# Queue pc-shelf: progress

Updated 2026-11-04 11:38:53 PC time (11:38 UTC), runner pid 19656.

- `prep` done, exit 0 in 6 min
- `pilot-s` done, exit 0 in 5 min
- `screen-s` done, exit 0 in 19 min
- `pilot-u` done, exit 0 in 0 min
- `screen-u` done, exit 0 in 0 min
- `pick` done, exit 0 in 0 min
- `build` done, exit 0 in 1 min
- `confirm` done, exit 0 in 7 min
- `gate` done, exit 0 in 0 min
- `pr` done, exit 0 in 0 min

### pilot-u

**1062 of 1050 battles** (101%), 0 failed, 1062 read back from an earlier run. Running 0 min. Last battle 0 min ago.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 177 | 2 | 76.77 | - | - | - | 39.4 |
| aa | 177 | 2 | 76.89 | +0.02 (175 robots) | ±0.12 | -0.16 .. +0.20 | 38.8 |
| mt | 177 | 2 | 73.03 | -0.55 (175 robots) | ±0.13 | -0.75 .. -0.35 | 41.3 |
| wl | 177 | 2 | 33.63 | -6.21 (175 robots) | ±0.56 | -7.07 .. -5.36 | 22.1 |
| hl | 177 | 2 | 77.07 | +0.03 (175 robots) | ±0.09 | -0.11 .. +0.18 | 38.4 |
| gl | 177 | 2 | 77.23 | +0.06 (175 robots) | ±0.11 | -0.12 .. +0.23 | 40.4 |

APS = mean difference over the robots read x 175 panel robots / 1217 pairings.
A/A: aa - c +0.12 pts over 175 robots; 1% band ±0.88 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 1062 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | waiting | 0 of 200 battles to read |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave -12 battles unrun; every battle already fought is kept and a rerun resumes from it.

> warning: arm c's jar bisect/hadur117.Hadur_3.21.jar was built 12 h before this step started: check it is not stale

> warning: arm aa's jar bisect/hadur117.Hadur_3.21aa.jar was built 12 h before this step started: check it is not stale

> warning: arm mt's jar bisect/hadur117.Hadur_3.21mt.jar was built 12 h before this step started: check it is not stale

> warning: arm wl's jar bisect/hadur117.Hadur_3.21wl.jar was built 12 h before this step started: check it is not stale

> warning: arm hl's jar bisect/hadur117.Hadur_3.21hl.jar was built 12 h before this step started: check it is not stale

> warning: arm gl's jar bisect/hadur117.Hadur_3.21gl.jar was built 12 h before this step started: check it is not stale

### screen-u

**1062 of 5250 battles** (20%), 0 failed, 1062 read back from an earlier run. Running 0 min. Last battle 0 min ago.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 177 | 2 | 76.77 | - | - | - | 39.4 |
| aa | 177 | 2 | 76.89 | +0.02 (175 robots) | ±0.12 | -0.16 .. +0.20 | 38.8 |
| mt | 177 | 2 | 73.03 | -0.55 (175 robots) | ±0.13 | -0.75 .. -0.35 | 41.3 |
| wl | 177 | 2 | 33.63 | -6.21 (175 robots) | ±0.56 | -7.07 .. -5.36 | 22.1 |
| hl | 177 | 2 | 77.07 | +0.03 (175 robots) | ±0.09 | -0.11 .. +0.18 | 38.4 |
| gl | 177 | 2 | 77.23 | +0.06 (175 robots) | ±0.11 | -0.12 .. +0.23 | 40.4 |

APS = mean difference over the robots read x 175 panel robots / 1217 pairings.
A/A: aa - c +0.12 pts over 175 robots; 1% band ±0.88 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 1062 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | waiting | 0 of 200 battles to read |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `aa after 20%` | halt | ok | aa - c +0.12 pts over 175 robots, stop band ±1.25 (observed spread) |

Stopping now would leave 4188 battles unrun; every battle already fought is kept and a rerun resumes from it.

> warning: arm c's jar bisect/hadur117.Hadur_3.21.jar was built 12 h before this step started: check it is not stale

> warning: arm aa's jar bisect/hadur117.Hadur_3.21aa.jar was built 12 h before this step started: check it is not stale

> warning: arm mt's jar bisect/hadur117.Hadur_3.21mt.jar was built 12 h before this step started: check it is not stale

> warning: arm wl's jar bisect/hadur117.Hadur_3.21wl.jar was built 12 h before this step started: check it is not stale

> warning: arm hl's jar bisect/hadur117.Hadur_3.21hl.jar was built 12 h before this step started: check it is not stale

> warning: arm gl's jar bisect/hadur117.Hadur_3.21gl.jar was built 12 h before this step started: check it is not stale

### confirm

**360 of 360 battles** (100%), 0 failed. Running 7 min, 3139 battles/h, about 0 min left (ends ~11:38 PC time). Last battle 0 min ago.
Skipped turns a battle: 27.4 overall, first 100 27.8, last 100 26.4; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 120 | 0 | 87.10 | - | - | - | 27.5 |
| aa | 120 | 0 | 87.16 | +0.00 (10 robots) | ±0.01 | -0.01 .. +0.01 | 27.3 |
| sh | 120 | 0 | 91.45 | +0.04 (10 robots) | ±0.02 | -0.00 .. +0.07 | 27.5 |

APS = mean difference over the robots read x 10 panel robots / 1217 pairings.
A/A: aa - c +0.06 pts over 10 robots; 1% band ±1.07 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 360 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | ok | 27.3 a battle over the last 200 (first 200: 27.4) |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

> warning: arm c's jar bisect/hadur117.Hadur_3.21.jar was built 12 h before this step started: check it is not stale

> warning: arm aa's jar bisect/hadur117.Hadur_3.21aa.jar was built 12 h before this step started: check it is not stale

### Queue log (last lines)

```
11:31:21 watching screen-u: 5 stop rule(s)
11:31:22 screen-u exit=0 in 0 s
11:31:22 start pick
11:31:22 pick exit=0 in 0 s
11:31:22 start build
11:31:54 build exit=0 in 31 s
11:31:54 start confirm
11:31:54 watching confirm: 4 stop rule(s)
11:32:13 progress confirm: 7/360 (2%) battles, 1314/h, ETA 16 min, 0 failed, skips 35.3/battle (last 100)
11:38:47 confirm exit=0 in 412 s
11:38:47 start gate
11:38:47 gate exit=0 in 0 s
11:38:47 start pr
11:38:53 pr exit=0 in 6 s
11:38:53 ALLDONE
```
