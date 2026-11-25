# Queue pc-locks: progress

Updated 2026-11-25 21:32:43 PC time (21:32 UTC), runner pid 58332.

- `prep` done, exit 0 in 4 min
- `livematch` done, exit 0 in 8 min
- `lock` done, exit 0 in 9 min
- `stage` done, exit 0 in 0 min
- `lock-gl` done, exit 0 in 3 min
- `lock-rwl` done, exit 0 in 1 min
- `lock-x0` done, exit 0 in 0 min
- `lock-ky` done, exit 0 in 0 min
- `lock-rlnrkn` done, exit 0 in 0 min
- `gate` done, exit 0 in 0 min
- `pr` done, exit 0 in 0 min

### livematch

**124 of 124 battles** (100%), 0 failed. Running 8 min, 934 battles/h, about 0 min left (ends ~21:17 PC time). Last battle 0 min ago.
Skipped turns a battle: 5.4 overall, first 100 5.2, last 100 5.4; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 62 | 0 | 70.39 | - | - | - | 10.0 |
| bb | 62 | 0 | 84.52 | +0.36 (31 robots) | ±0.06 | +0.26 .. +0.46 | 0.8 |

APS = mean difference over the robots read x 31 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 124 |
| `dead 8` | halt | ok | every arm scoring |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

> warning: arm c's jar bisect/live/hadur117.Hadur_3.22.jar was built 243 h before this step started: check it is not stale

> warning: arm bb's jar opponents/kc.mega.BeepBoop_2.0.jar was built 230 h before this step started: check it is not stale

### lock

**576 of 576 battles** (100%), 0 failed. Running 9 min, 3805 battles/h, about 0 min left (ends ~21:26 PC time). Last battle 0 min ago.
Skipped turns a battle: 11.9 overall, first 100 13.4, last 100 10.4; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 288 | 0 | 84.78 | - | - | - | 11.7 |
| aa | 288 | 0 | 84.29 | -0.00 (12 robots) | ±0.01 | -0.01 .. +0.00 | 12.1 |

APS = mean difference over the robots read x 12 panel robots / 1217 pairings.
A/A: aa - c -0.49 pts over 12 robots; 1% band ±0.69 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 576 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 24` | halt | ok | 9.0 a battle over the last 24 (first 24: 16.5) |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### lock-gl

**144 of 144 battles** (100%), 0 failed, 72 read back from an earlier run. Running 3 min, 1433 battles/h, about 0 min left (ends ~21:29 PC time). Last battle 0 min ago.
Skipped turns a battle: 10.3 overall, first 72 10.3, last 72 10.3; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 72 | 0 | 57.41 | - | - | - | 10.3 |
| gl | 72 | 0 | 62.33 | +0.01 (3 robots) | ±0.00 | +0.01 .. +0.02 | 10.3 |

APS = mean difference over the robots read x 3 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 144 |
| `dead 8` | halt | ok | every arm scoring |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### lock-rwl

**288 of 288 battles** (100%), 0 failed, 144 read back from an earlier run. Running 1 min, 6282 battles/h, about 0 min left (ends ~21:31 PC time). Last battle 0 min ago.
Skipped turns a battle: 15.2 overall, first 100 16.0, last 100 14.3; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 144 | 0 | 97.75 | - | - | - | 12.3 |
| rwl | 144 | 0 | 98.63 | +0.00 (6 robots) | ±0.00 | +0.00 .. +0.01 | 15.2 |

APS = mean difference over the robots read x 6 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 288 |
| `dead 8` | halt | ok | every arm scoring |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### lock-x0

**48 of 48 battles** (100%), 0 failed, 24 read back from an earlier run. Running 0 min, 3037 battles/h, about 0 min left (ends ~21:31 PC time). Last battle 0 min ago.
Skipped turns a battle: 17.9 overall, first 24 17.9, last 24 17.9; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 24 | 0 | 90.38 | - | - | - | 12.3 |
| x0 | 24 | 0 | 92.07 | +0.00 (1 robots) | - | - | 17.9 |

APS = mean difference over the robots read x 1 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 48 |
| `dead 8` | halt | ok | every arm scoring |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### lock-ky

**48 of 48 battles** (100%), 0 failed, 24 read back from an earlier run. Running 1 min, 2871 battles/h, about 0 min left (ends ~21:32 PC time). Last battle 0 min ago.
Skipped turns a battle: 17.2 overall, first 24 17.2, last 24 17.2; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 24 | 0 | 89.77 | - | - | - | 12.1 |
| ky | 24 | 0 | 89.29 | -0.00 (1 robots) | - | - | 17.2 |

APS = mean difference over the robots read x 1 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 48 |
| `dead 8` | halt | ok | every arm scoring |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### lock-rlnrkn

**48 of 48 battles** (100%), 0 failed, 24 read back from an earlier run. Running 0 min, 3958 battles/h, about 0 min left (ends ~21:32 PC time). Last battle 0 min ago.
Skipped turns a battle: 18.7 overall, first 24 18.7, last 24 18.7; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 24 | 0 | 78.41 | - | - | - | 11.8 |
| rlnrkn | 24 | 0 | 80.61 | +0.00 (1 robots) | - | - | 18.7 |

APS = mean difference over the robots read x 1 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 48 |
| `dead 8` | halt | ok | every arm scoring |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
21:31:14 lock-rwl exit=0 in 82 s
21:31:14 start lock-x0
21:31:14 watching lock-x0: 3 stop rule(s)
21:31:43 lock-x0 exit=0 in 28 s
21:31:43 start lock-ky
21:31:43 watching lock-ky: 3 stop rule(s)
21:32:13 lock-ky exit=0 in 30 s
21:32:13 start lock-rlnrkn
21:32:13 watching lock-rlnrkn: 3 stop rule(s)
21:32:35 lock-rlnrkn exit=0 in 21 s
21:32:35 start gate
21:32:36 gate exit=0 in 1 s
21:32:36 start pr
21:32:43 pr exit=0 in 7 s
21:32:43 ALLDONE
```
