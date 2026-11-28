# Queue pc-locks40: progress

Updated 2026-11-28 14:51:34 PC time (14:51 UTC), runner pid 12896.

- `prep` done, exit 0 in 4 min
- `livematch` done, exit 0 in 8 min
- `lock` done, exit 0 in 2.6 h
- `stage` done, exit 0 in 0 min
- `lock-fgp` done, exit 0 in 14 min
- `lock-zl` done, exit 0 in 1 min
- `lock-gl` done, exit 0 in 2 min
- `lock-pb` done, exit 0 in 2 min
- `gate` done, exit 0 in 0 min
- `pr` done, exit 0 in 0 min

### livematch

**124 of 124 battles** (100%), 0 failed. Running 8 min, 945 battles/h, about 0 min left (ends ~11:55 PC time). Last battle 0 min ago.
Skipped turns a battle: 5.3 overall, first 100 4.7, last 100 5.3; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 62 | 0 | 69.84 | - | - | - | 9.9 |
| bb | 62 | 0 | 84.43 | +0.37 (31 robots) | ±0.07 | +0.27 .. +0.48 | 0.6 |

APS = mean difference over the robots read x 31 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 124 |
| `dead 8` | halt | ok | every arm scoring |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

> warning: arm c's jar bisect/live/hadur117.Hadur_3.22.jar was built 306 h before this step started: check it is not stale

> warning: arm bb's jar opponents/kc.mega.BeepBoop_2.0.jar was built 293 h before this step started: check it is not stale

### lock

**1152 of 1152 battles** (100%), 0 failed. Running 2.6 h, 346 battles/h, about 0 min left (ends ~14:32 PC time). Last battle 0 min ago.
Skipped turns a battle: 9.4 overall, first 100 10.7, last 100 9.1; engine disables 8.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 576 | 0 | 60.57 | - | - | - | 9.3 |
| aa | 576 | 0 | 60.74 | +0.00 (12 robots) | ±0.00 | -0.00 .. +0.01 | 9.6 |

APS = mean difference over the robots read x 12 panel robots / 1217 pairings.
A/A: aa - c +0.17 pts over 12 robots; 1% band ±0.49 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 1152 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 24` | halt | ok | 8.0 a battle over the last 24 (first 24: 14.0) |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### lock-fgp

**96 of 96 battles** (100%), 0 failed, 48 read back from an earlier run. Running 14 min, 199 battles/h, about 0 min left (ends ~14:46 PC time). Last battle 0 min ago.
Skipped turns a battle: 8.9 overall, first 48 8.9, last 48 8.9; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 48 | 0 | 21.53 | - | - | - | 6.4 |
| fgp | 48 | 0 | 33.23 | +0.01 (1 robots) | - | - | 8.9 |

APS = mean difference over the robots read x 1 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 96 |
| `dead 8` | halt | ok | every arm scoring |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### lock-zl

**96 of 96 battles** (100%), 0 failed, 48 read back from an earlier run. Running 1 min, 3254 battles/h, about 0 min left (ends ~14:47 PC time). Last battle 0 min ago.
Skipped turns a battle: 18.6 overall, first 48 18.6, last 48 18.6; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 48 | 0 | 96.56 | - | - | - | 10.9 |
| zl | 48 | 0 | 98.82 | +0.00 (1 robots) | - | - | 18.6 |

APS = mean difference over the robots read x 1 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 96 |
| `dead 8` | halt | ok | every arm scoring |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### lock-gl

**96 of 96 battles** (100%), 0 failed, 48 read back from an earlier run. Running 2 min, 1905 battles/h, about 0 min left (ends ~14:49 PC time). Last battle 0 min ago.
Skipped turns a battle: 13.0 overall, first 48 13.0, last 48 13.0; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 48 | 0 | 76.11 | - | - | - | 9.2 |
| gl | 48 | 0 | 75.78 | -0.00 (1 robots) | - | - | 13.0 |

APS = mean difference over the robots read x 1 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 96 |
| `dead 8` | halt | ok | every arm scoring |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### lock-pb

**96 of 96 battles** (100%), 0 failed, 48 read back from an earlier run. Running 2 min, 1266 battles/h, about 0 min left (ends ~14:51 PC time). Last battle 0 min ago.
Skipped turns a battle: 12.9 overall, first 48 12.9, last 48 12.9; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 48 | 0 | 73.72 | - | - | - | 10.2 |
| pb | 48 | 0 | 75.02 | +0.00 (1 robots) | - | - | 12.9 |

APS = mean difference over the robots read x 1 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 96 |
| `dead 8` | halt | ok | every arm scoring |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
14:46:45 start lock-zl
14:46:45 watching lock-zl: 3 stop rule(s)
14:47:38 lock-zl exit=0 in 53 s
14:47:38 start lock-gl
14:47:38 watching lock-gl: 3 stop rule(s)
14:48:57 progress lock-gl: 80/96 (83%) battles, 1467/h, ETA 1 min, 0 failed, skips 14.4/battle (last 100), gl +0.00
14:49:09 lock-gl exit=0 in 90 s
14:49:09 start lock-pb
14:49:09 watching lock-pb: 3 stop rule(s)
14:51:25 lock-pb exit=0 in 136 s
14:51:25 start gate
14:51:27 gate exit=0 in 1 s
14:51:27 start pr
14:51:34 pr exit=0 in 7 s
14:51:34 ALLDONE
```
