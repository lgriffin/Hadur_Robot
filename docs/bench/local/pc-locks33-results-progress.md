# Queue pc-locks: progress

Updated 2026-11-26 08:12:43 PC time (08:12 UTC), runner pid 28004.

- `prep` done, exit 0 in 6 min
- `livematch` done, exit 0 in 8 min
- `lock` done, exit 0 in 16 min
- `stage` done, exit 0 in 0 min
- `lock-gl` done, exit 0 in 2 min
- `lock-rwl` done, exit 0 in 1 min
- `lock-rf` done, exit 0 in 0 min
- `lock-rln` done, exit 0 in 0 min
- `lock-rlnrkn` done, exit 0 in 2 min
- `lock-cpl` done, exit 0 in 3 min
- `lock-pb` running
- `gate` pending
- `pr` pending

### livematch

**124 of 124 battles** (100%), 0 failed. Running 8 min, 896 battles/h, about 0 min left (ends ~07:46 PC time). Last battle 0 min ago.
Skipped turns a battle: 5.8 overall, first 100 5.3, last 100 5.9; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 62 | 0 | 69.56 | - | - | - | 10.7 |
| bb | 62 | 0 | 83.85 | +0.36 (31 robots) | ±0.07 | +0.26 .. +0.47 | 0.9 |

APS = mean difference over the robots read x 31 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 124 |
| `dead 8` | halt | ok | every arm scoring |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

> warning: arm c's jar bisect/live/hadur117.Hadur_3.22.jar was built 254 h before this step started: check it is not stale

> warning: arm bb's jar opponents/kc.mega.BeepBoop_2.0.jar was built 241 h before this step started: check it is not stale

### lock

**1056 of 1056 battles** (100%), 0 failed. Running 16 min, 3894 battles/h, about 0 min left (ends ~08:02 PC time). Last battle 0 min ago.
Skipped turns a battle: 11.6 overall, first 100 12.5, last 100 11.1; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 528 | 0 | 89.87 | - | - | - | 11.6 |
| aa | 528 | 0 | 89.76 | -0.00 (22 robots) | ±0.01 | -0.01 .. +0.01 | 11.5 |

APS = mean difference over the robots read x 22 panel robots / 1217 pairings.
A/A: aa - c -0.11 pts over 22 robots; 1% band ±0.51 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 1056 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 24` | halt | ok | 9.6 a battle over the last 24 (first 24: 14.9) |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### lock-gl

**96 of 96 battles** (100%), 0 failed, 48 read back from an earlier run. Running 2 min, 1427 battles/h, about 0 min left (ends ~08:04 PC time). Last battle 0 min ago.
Skipped turns a battle: 10.8 overall, first 48 10.8, last 48 10.8; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 48 | 0 | 70.79 | - | - | - | 11.2 |
| gl | 48 | 0 | 74.13 | +0.01 (2 robots) | ±0.01 | -0.01 .. +0.02 | 10.8 |

APS = mean difference over the robots read x 2 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 96 |
| `dead 8` | halt | ok | every arm scoring |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### lock-rwl

**144 of 144 battles** (100%), 0 failed, 72 read back from an earlier run. Running 1 min, 7447 battles/h, about 0 min left (ends ~08:05 PC time). Last battle 0 min ago.
Skipped turns a battle: 17.4 overall, first 72 17.4, last 72 17.4; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 72 | 0 | 98.84 | - | - | - | 11.7 |
| rwl | 72 | 0 | 99.33 | +0.00 (3 robots) | ±0.00 | +0.00 .. +0.00 | 17.4 |

APS = mean difference over the robots read x 3 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 144 |
| `dead 8` | halt | ok | every arm scoring |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### lock-rf

**48 of 48 battles** (100%), 0 failed, 24 read back from an earlier run. Running 0 min, 4051 battles/h, about 0 min left (ends ~08:05 PC time). Last battle 0 min ago.
Skipped turns a battle: 17.6 overall, first 24 17.6, last 24 17.6; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 24 | 0 | 97.61 | - | - | - | 11.8 |
| rf | 24 | 0 | 98.36 | +0.00 (1 robots) | - | - | 17.6 |

APS = mean difference over the robots read x 1 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 48 |
| `dead 8` | halt | ok | every arm scoring |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### lock-rln

**48 of 48 battles** (100%), 0 failed, 24 read back from an earlier run. Running 0 min, 4723 battles/h, about 0 min left (ends ~08:06 PC time). Last battle 0 min ago.
Skipped turns a battle: 18.6 overall, first 24 18.6, last 24 18.6; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 24 | 0 | 98.59 | - | - | - | 12.4 |
| rln | 24 | 0 | 99.06 | +0.00 (1 robots) | - | - | 18.6 |

APS = mean difference over the robots read x 1 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 48 |
| `dead 8` | halt | ok | every arm scoring |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### lock-rlnrkn

**336 of 336 battles** (100%), 0 failed, 168 read back from an earlier run. Running 2 min, 5344 battles/h, about 0 min left (ends ~08:08 PC time). Last battle 0 min ago.
Skipped turns a battle: 13.5 overall, first 100 14.3, last 100 12.6; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 168 | 0 | 97.64 | - | - | - | 12.1 |
| rlnrkn | 168 | 0 | 98.73 | +0.01 (7 robots) | ±0.00 | -0.00 .. +0.01 | 13.5 |

APS = mean difference over the robots read x 7 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 336 |
| `dead 8` | halt | ok | every arm scoring |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### lock-cpl

**336 of 336 battles** (100%), 0 failed, 168 read back from an earlier run. Running 3 min, 2997 battles/h, about 0 min left (ends ~08:11 PC time). Last battle 0 min ago.
Skipped turns a battle: 11.2 overall, first 100 11.6, last 100 10.9; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 168 | 0 | 80.45 | - | - | - | 11.3 |
| cpl | 168 | 0 | 84.81 | +0.03 (7 robots) | ±0.01 | +0.01 .. +0.04 | 11.2 |

APS = mean difference over the robots read x 7 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 336 |
| `dead 8` | halt | ok | every arm scoring |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### lock-pb

**43 of 48 battles** (90%), 0 failed, 24 read back from an earlier run. Running 1 min, 894 battles/h, about 0 min left (ends ~08:13 PC time). Last battle 0 min ago.
Skipped turns a battle: 15.9 overall, first 19 15.9, last 19 15.9; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 24 | 0 | 96.14 | - | - | - | 11.5 |
| pb | 19 | 0 | 99.57 | +0.00 (1 robots) | - | - | 15.9 |

APS = mean difference over the robots read x 1 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 43 |
| `dead 8` | halt | ok | every arm scoring |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 5 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
08:05:31 start lock-rf
08:05:31 watching lock-rf: 3 stop rule(s)
08:05:52 lock-rf exit=0 in 21 s
08:05:52 start lock-rln
08:05:52 watching lock-rln: 3 stop rule(s)
08:06:11 lock-rln exit=0 in 18 s
08:06:11 start lock-rlnrkn
08:06:11 watching lock-rlnrkn: 3 stop rule(s)
08:08:04 lock-rlnrkn exit=0 in 113 s
08:08:04 start lock-cpl
08:08:04 watching lock-cpl: 3 stop rule(s)
08:08:41 progress lock-cpl: 188/336 (56%) battles, 1985/h, ETA 4 min, 0 failed, skips 13.1/battle (last 100), cpl +0.03
08:11:26 lock-cpl exit=0 in 201 s
08:11:26 start lock-pb
08:11:26 watching lock-pb: 3 stop rule(s)
```
