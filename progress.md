# Queue pc-locks39: progress

Updated 2026-11-28 02:21:28 PC time (02:21 UTC), runner pid 29436.

- `prep` done, exit 0 in 6 min
- `livematch` done, exit 0 in 8 min
- `lock` done, exit 0 in 2.5 h
- `stage` done, exit 0 in 0 min
- `lock-zl` done, exit 0 in 1 min
- `lock-pb` done, exit 0 in 7 min
- `lock-rlnrkn` done, exit 0 in 0 min
- `lock-fgl` done, exit 0 in 5 min
- `lock-mt` done, exit 0 in 1 min
- `lock-rf` done, exit 0 in 1 min
- `lock-rp` done, exit 0 in 1 min
- `gate` done, exit 0 in 0 min
- `pr` done, exit 0 in 0 min

### livematch

**124 of 124 battles** (100%), 0 failed. Running 8 min, 944 battles/h, about 0 min left (ends ~23:37 PC time). Last battle 0 min ago.
Skipped turns a battle: 5.7 overall, first 100 5.4, last 100 5.9; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 62 | 0 | 70.13 | - | - | - | 10.5 |
| bb | 62 | 0 | 84.88 | +0.38 (31 robots) | ±0.06 | +0.28 .. +0.47 | 0.9 |

APS = mean difference over the robots read x 31 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 124 |
| `dead 8` | halt | ok | every arm scoring |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

> warning: arm c's jar bisect/live/hadur117.Hadur_3.22.jar was built 294 h before this step started: check it is not stale

> warning: arm bb's jar opponents/kc.mega.BeepBoop_2.0.jar was built 281 h before this step started: check it is not stale

### lock

**1248 of 1248 battles** (100%), 0 failed. Running 2.5 h, 472 battles/h, about 0 min left (ends ~02:06 PC time). Last battle 0 min ago.
Skipped turns a battle: 9.4 overall, first 100 10.3, last 100 8.9; engine disables 1.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 624 | 0 | 63.52 | - | - | - | 9.3 |
| aa | 624 | 0 | 63.74 | +0.00 (13 robots) | ±0.01 | -0.01 .. +0.01 | 9.5 |

APS = mean difference over the robots read x 13 panel robots / 1217 pairings.
A/A: aa - c +0.22 pts over 13 robots; 1% band ±0.47 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 1248 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 24` | halt | ok | 8.0 a battle over the last 24 (first 24: 12.3) |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### lock-zl

**96 of 96 battles** (100%), 0 failed, 48 read back from an earlier run. Running 1 min, 3284 battles/h, about 0 min left (ends ~02:07 PC time). Last battle 0 min ago.
Skipped turns a battle: 16.6 overall, first 48 16.6, last 48 16.6; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 48 | 0 | 88.25 | - | - | - | 9.3 |
| zl | 48 | 0 | 94.39 | +0.01 (1 robots) | - | - | 16.6 |

APS = mean difference over the robots read x 1 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 96 |
| `dead 8` | halt | ok | every arm scoring |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### lock-pb

**96 of 96 battles** (100%), 0 failed, 48 read back from an earlier run. Running 7 min, 440 battles/h, about 0 min left (ends ~02:13 PC time). Last battle 0 min ago.
Skipped turns a battle: 12.6 overall, first 48 12.6, last 48 12.6; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 48 | 0 | 68.63 | - | - | - | 10.8 |
| pb | 48 | 0 | 69.52 | +0.00 (1 robots) | - | - | 12.6 |

APS = mean difference over the robots read x 1 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 96 |
| `dead 8` | halt | ok | every arm scoring |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### lock-rlnrkn

**96 of 96 battles** (100%), 0 failed, 48 read back from an earlier run. Running 0 min, 6369 battles/h, about 0 min left (ends ~02:14 PC time). Last battle 0 min ago.
Skipped turns a battle: 19.9 overall, first 48 19.9, last 48 19.9; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 48 | 0 | 80.03 | - | - | - | 11.4 |
| rlnrkn | 48 | 0 | 82.32 | +0.00 (1 robots) | - | - | 19.9 |

APS = mean difference over the robots read x 1 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 96 |
| `dead 8` | halt | ok | every arm scoring |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### lock-fgl

**96 of 96 battles** (100%), 0 failed, 48 read back from an earlier run. Running 5 min, 603 battles/h, about 0 min left (ends ~02:18 PC time). Last battle 0 min ago.
Skipped turns a battle: 13.3 overall, first 48 13.3, last 48 13.3; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 48 | 0 | 60.52 | - | - | - | 11.0 |
| fgl | 48 | 0 | 61.52 | +0.00 (1 robots) | - | - | 13.3 |

APS = mean difference over the robots read x 1 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 96 |
| `dead 8` | halt | ok | every arm scoring |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### lock-mt

**96 of 96 battles** (100%), 0 failed, 48 read back from an earlier run. Running 1 min, 4379 battles/h, about 0 min left (ends ~02:19 PC time). Last battle 0 min ago.
Skipped turns a battle: 18.7 overall, first 48 18.7, last 48 18.7; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 48 | 0 | 90.45 | - | - | - | 9.8 |
| mt | 48 | 0 | 91.77 | +0.00 (1 robots) | - | - | 18.7 |

APS = mean difference over the robots read x 1 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 96 |
| `dead 8` | halt | ok | every arm scoring |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### lock-rf

**96 of 96 battles** (100%), 0 failed, 48 read back from an earlier run. Running 1 min, 4738 battles/h, about 0 min left (ends ~02:20 PC time). Last battle 0 min ago.
Skipped turns a battle: 17.1 overall, first 48 17.1, last 48 17.1; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 48 | 0 | 89.04 | - | - | - | 10.0 |
| rf | 48 | 0 | 91.44 | +0.00 (1 robots) | - | - | 17.1 |

APS = mean difference over the robots read x 1 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 96 |
| `dead 8` | halt | ok | every arm scoring |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### lock-rp

**96 of 96 battles** (100%), 0 failed, 48 read back from an earlier run. Running 1 min, 2308 battles/h, about 0 min left (ends ~02:21 PC time). Last battle 0 min ago.
Skipped turns a battle: 13.6 overall, first 48 13.6, last 48 13.6; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 48 | 0 | 58.25 | - | - | - | 8.2 |
| rp | 48 | 0 | 60.89 | +0.00 (1 robots) | - | - | 13.6 |

APS = mean difference over the robots read x 1 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 96 |
| `dead 8` | halt | ok | every arm scoring |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
02:18:47 lock-fgl exit=0 in 286 s
02:18:47 start lock-mt
02:18:47 watching lock-mt: 3 stop rule(s)
02:19:26 lock-mt exit=0 in 39 s
02:19:26 start lock-rf
02:19:26 watching lock-rf: 3 stop rule(s)
02:20:03 lock-rf exit=0 in 36 s
02:20:03 start lock-rp
02:20:03 watching lock-rp: 3 stop rule(s)
02:21:18 lock-rp exit=0 in 74 s
02:21:18 start gate
02:21:19 gate exit=0 in 1 s
02:21:19 start pr
02:21:28 pr exit=0 in 8 s
02:21:28 ALLDONE
```
