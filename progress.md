# Queue pc-locks: progress

Updated 2026-11-25 08:07:20 PC time (08:07 UTC), runner pid 10200.

- `prep` done, exit 0 in 6 min
- `livematch` done, exit 0 in 8 min
- `lock` done, exit 0 in 14 min
- `stage` done, exit 0 in 0 min
- `lock-rwl` done, exit 0 in 5 min
- `lock-md` done, exit 0 in 0 min
- `lock-x0` done, exit 0 in 0 min
- `lock-rf` done, exit 0 in 0 min
- `lock-hof` done, exit 0 in 2 min
- `lock-ty` done, exit 0 in 0 min
- `lock-sp2` done, exit 0 in 0 min
- `gate` done, exit 0 in 0 min
- `pr` done, exit 0 in 0 min

### livematch

**124 of 124 battles** (100%), 0 failed. Running 8 min, 886 battles/h, about 0 min left (ends ~07:45 PC time). Last battle 0 min ago.
Skipped turns a battle: 5.8 overall, first 100 5.2, last 100 5.7; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 62 | 0 | 69.30 | - | - | - | 10.4 |
| bb | 62 | 0 | 84.07 | +0.38 (31 robots) | ±0.07 | +0.27 .. +0.49 | 1.1 |

APS = mean difference over the robots read x 31 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 124 |
| `dead 8` | halt | ok | every arm scoring |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

> warning: arm c's jar bisect/live/hadur117.Hadur_3.22.jar was built 230 h before this step started: check it is not stale

> warning: arm bb's jar opponents/kc.mega.BeepBoop_2.0.jar was built 217 h before this step started: check it is not stale

### lock

**1584 of 1584 battles** (100%), 0 failed. Running 14 min, 6823 battles/h, about 0 min left (ends ~07:58 PC time). Last battle 0 min ago.
Skipped turns a battle: 15.0 overall, first 100 15.5, last 100 13.9; engine disables 1.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 792 | 0 | 96.21 | - | - | - | 15.1 |
| aa | 792 | 0 | 96.20 | -0.00 (33 robots) | ±0.00 | -0.01 .. +0.01 | 14.9 |

APS = mean difference over the robots read x 33 panel robots / 1217 pairings.
A/A: aa - c -0.01 pts over 33 robots; 1% band ±0.41 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 1584 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 24` | halt | ok | 12.9 a battle over the last 24 (first 24: 17.9) |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### lock-rwl

**1056 of 1056 battles** (100%), 0 failed, 528 read back from an earlier run. Running 5 min, 6883 battles/h, about 0 min left (ends ~08:03 PC time). Last battle 0 min ago.
Skipped turns a battle: 15.3 overall, first 100 15.6, last 100 15.4; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 528 | 0 | 97.01 | - | - | - | 15.1 |
| rwl | 528 | 0 | 97.69 | +0.01 (22 robots) | ±0.00 | +0.01 .. +0.02 | 15.3 |

APS = mean difference over the robots read x 22 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 1056 |
| `dead 8` | halt | ok | every arm scoring |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### lock-md

**48 of 48 battles** (100%), 0 failed, 24 read back from an earlier run. Running 0 min, 3788 battles/h, about 0 min left (ends ~08:04 PC time). Last battle 0 min ago.
Skipped turns a battle: 17.6 overall, first 24 17.6, last 24 17.6; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 24 | 0 | 91.19 | - | - | - | 15.1 |
| md | 24 | 0 | 93.83 | +0.00 (1 robots) | - | - | 17.6 |

APS = mean difference over the robots read x 1 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 48 |
| `dead 8` | halt | ok | every arm scoring |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### lock-x0

**48 of 48 battles** (100%), 0 failed, 24 read back from an earlier run. Running 0 min, 2966 battles/h, about 0 min left (ends ~08:04 PC time). Last battle 0 min ago.
Skipped turns a battle: 17.6 overall, first 24 17.6, last 24 17.6; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 24 | 0 | 94.10 | - | - | - | 15.0 |
| x0 | 24 | 0 | 93.40 | -0.00 (1 robots) | - | - | 17.6 |

APS = mean difference over the robots read x 1 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 48 |
| `dead 8` | halt | ok | every arm scoring |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### lock-rf

**48 of 48 battles** (100%), 0 failed, 24 read back from an earlier run. Running 0 min, 4500 battles/h, about 0 min left (ends ~08:04 PC time). Last battle 0 min ago.
Skipped turns a battle: 20.2 overall, first 24 20.2, last 24 20.2; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 24 | 0 | 94.40 | - | - | - | 15.0 |
| rf | 24 | 0 | 96.10 | +0.00 (1 robots) | - | - | 20.2 |

APS = mean difference over the robots read x 1 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 48 |
| `dead 8` | halt | ok | every arm scoring |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### lock-hof

**288 of 288 battles** (100%), 0 failed, 144 read back from an earlier run. Running 2 min, 5716 battles/h, about 0 min left (ends ~08:06 PC time). Last battle 0 min ago.
Skipped turns a battle: 16.2 overall, first 100 17.1, last 100 15.2; engine disables 1.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 144 | 0 | 95.33 | - | - | - | 15.1 |
| hof | 144 | 0 | 95.78 | +0.00 (6 robots) | ±0.00 | -0.00 .. +0.01 | 16.2 |

APS = mean difference over the robots read x 6 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 288 |
| `dead 8` | halt | ok | every arm scoring |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### lock-ty

**48 of 48 battles** (100%), 0 failed, 24 read back from an earlier run. Running 0 min, 3360 battles/h, about 0 min left (ends ~08:06 PC time). Last battle 0 min ago.
Skipped turns a battle: 18.8 overall, first 24 18.8, last 24 18.8; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 24 | 0 | 93.52 | - | - | - | 15.0 |
| ty | 24 | 0 | 93.75 | +0.00 (1 robots) | - | - | 18.8 |

APS = mean difference over the robots read x 1 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 48 |
| `dead 8` | halt | ok | every arm scoring |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### lock-sp2

**48 of 48 battles** (100%), 0 failed, 24 read back from an earlier run. Running 0 min, 4257 battles/h, about 0 min left (ends ~08:07 PC time). Last battle 0 min ago.
Skipped turns a battle: 19.0 overall, first 24 19.0, last 24 19.0; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 24 | 0 | 95.47 | - | - | - | 14.9 |
| sp2 | 24 | 0 | 97.58 | +0.00 (1 robots) | - | - | 19.0 |

APS = mean difference over the robots read x 1 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 48 |
| `dead 8` | halt | ok | every arm scoring |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
08:04:55 start lock-hof
08:04:55 watching lock-hof: 3 stop rule(s)
08:06:26 lock-hof exit=0 in 90 s
08:06:26 start lock-ty
08:06:26 watching lock-ty: 3 stop rule(s)
08:06:52 lock-ty exit=0 in 25 s
08:06:52 start lock-sp2
08:06:52 watching lock-sp2: 3 stop rule(s)
08:07:03 progress lock-sp2: 25/48 (52%) battles, 325/h, ETA 4 min, 0 failed, skips 11.0/battle (last 100), sp2 +0.00
08:07:12 lock-sp2 exit=0 in 20 s
08:07:12 start gate
08:07:13 gate exit=0 in 1 s
08:07:13 start pr
08:07:20 pr exit=0 in 7 s
08:07:20 ALLDONE
```
