# Queue pc-locks: progress

Updated 2026-11-27 09:51:58 PC time (09:51 UTC), runner pid 107880.

- `prep` done, exit 0 in 6 min
- `livematch` done, exit 0 in 8 min
- `lock` done, exit 0 in 51 min
- `stage` done, exit 0 in 0 min
- `lock-pb` done, exit 0 in 0 min
- `lock-x0` done, exit 0 in 2 min
- `lock-gl` done, exit 0 in 1 min
- `lock-fq` done, exit 0 in 1 min
- `lock-fgl` done, exit 0 in 2 min
- `lock-dn` done, exit 0 in 1 min
- `lock-vj` done, exit 0 in 0 min
- `lock-cpl` done, exit 0 in 1 min
- `gate` done, exit 0 in 0 min
- `pr` done, exit 0 in 0 min

### livematch

**124 of 124 battles** (100%), 0 failed. Running 8 min, 927 battles/h, about 0 min left (ends ~08:52 PC time). Last battle 0 min ago.
Skipped turns a battle: 5.0 overall, first 100 4.8, last 100 5.0; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 62 | 0 | 70.00 | - | - | - | 9.5 |
| bb | 62 | 0 | 84.53 | +0.37 (31 robots) | ±0.08 | +0.25 .. +0.49 | 0.6 |

APS = mean difference over the robots read x 31 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 124 |
| `dead 8` | halt | ok | every arm scoring |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

> warning: arm c's jar bisect/live/hadur117.Hadur_3.22.jar was built 279 h before this step started: check it is not stale

> warning: arm bb's jar opponents/kc.mega.BeepBoop_2.0.jar was built 266 h before this step started: check it is not stale

### lock

**624 of 624 battles** (100%), 0 failed. Running 51 min, 728 battles/h, about 0 min left (ends ~09:43 PC time). Last battle 0 min ago.
Skipped turns a battle: 9.6 overall, first 100 11.3, last 100 8.6; engine disables 1.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 312 | 0 | 65.42 | - | - | - | 10.0 |
| aa | 312 | 0 | 65.34 | -0.00 (13 robots) | ±0.01 | -0.02 .. +0.02 | 9.2 |

APS = mean difference over the robots read x 13 panel robots / 1217 pairings.
A/A: aa - c -0.08 pts over 13 robots; 1% band ±0.66 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 624 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 24` | halt | ok | 7.4 a battle over the last 24 (first 24: 16.8) |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### lock-pb

**48 of 48 battles** (100%), 0 failed, 24 read back from an earlier run. Running 0 min, 3022 battles/h, about 0 min left (ends ~09:43 PC time). Last battle 0 min ago.
Skipped turns a battle: 19.5 overall, first 24 19.5, last 24 19.5; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 24 | 0 | 85.52 | - | - | - | 10.1 |
| pb | 24 | 0 | 85.45 | -0.00 (1 robots) | - | - | 19.5 |

APS = mean difference over the robots read x 1 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 48 |
| `dead 8` | halt | ok | every arm scoring |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### lock-x0

**48 of 48 battles** (100%), 0 failed, 24 read back from an earlier run. Running 2 min, 733 battles/h, about 0 min left (ends ~09:45 PC time). Last battle 0 min ago.
Skipped turns a battle: 12.1 overall, first 24 12.1, last 24 12.1; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 24 | 0 | 89.46 | - | - | - | 15.2 |
| x0 | 24 | 0 | 92.15 | +0.00 (1 robots) | - | - | 12.1 |

APS = mean difference over the robots read x 1 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 48 |
| `dead 8` | halt | ok | every arm scoring |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### lock-gl

**48 of 48 battles** (100%), 0 failed, 24 read back from an earlier run. Running 1 min, 1565 battles/h, about 0 min left (ends ~09:46 PC time). Last battle 0 min ago.
Skipped turns a battle: 13.4 overall, first 24 13.4, last 24 13.4; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 24 | 0 | 72.78 | - | - | - | 10.3 |
| gl | 24 | 0 | 72.91 | +0.00 (1 robots) | - | - | 13.4 |

APS = mean difference over the robots read x 1 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 48 |
| `dead 8` | halt | ok | every arm scoring |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### lock-fq

**48 of 48 battles** (100%), 0 failed, 24 read back from an earlier run. Running 1 min, 1515 battles/h, about 0 min left (ends ~09:47 PC time). Last battle 0 min ago.
Skipped turns a battle: 14.2 overall, first 24 14.2, last 24 14.2; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 24 | 0 | 62.33 | - | - | - | 10.8 |
| fq | 24 | 0 | 64.93 | +0.00 (1 robots) | - | - | 14.2 |

APS = mean difference over the robots read x 1 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 48 |
| `dead 8` | halt | ok | every arm scoring |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### lock-fgl

**48 of 48 battles** (100%), 0 failed, 24 read back from an earlier run. Running 2 min, 652 battles/h, about 0 min left (ends ~09:49 PC time). Last battle 0 min ago.
Skipped turns a battle: 11.5 overall, first 24 11.5, last 24 11.5; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 24 | 0 | 65.03 | - | - | - | 9.2 |
| fgl | 24 | 0 | 65.72 | +0.00 (1 robots) | - | - | 11.5 |

APS = mean difference over the robots read x 1 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 48 |
| `dead 8` | halt | ok | every arm scoring |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### lock-dn

**96 of 96 battles** (100%), 0 failed, 48 read back from an earlier run. Running 1 min, 3587 battles/h, about 0 min left (ends ~09:50 PC time). Last battle 0 min ago.
Skipped turns a battle: 13.8 overall, first 48 13.8, last 48 13.8; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 48 | 0 | 90.39 | - | - | - | 10.7 |
| dn | 48 | 0 | 91.04 | +0.00 (2 robots) | ±0.00 | +0.00 .. +0.00 | 13.8 |

APS = mean difference over the robots read x 2 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 96 |
| `dead 8` | halt | ok | every arm scoring |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### lock-vj

**48 of 48 battles** (100%), 0 failed, 24 read back from an earlier run. Running 0 min, 2911 battles/h, about 0 min left (ends ~09:50 PC time). Last battle 0 min ago.
Skipped turns a battle: 15.0 overall, first 24 15.0, last 24 15.0; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 24 | 0 | 82.47 | - | - | - | 10.8 |
| vj | 24 | 0 | 81.54 | -0.00 (1 robots) | - | - | 15.0 |

APS = mean difference over the robots read x 1 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 48 |
| `dead 8` | halt | ok | every arm scoring |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### lock-cpl

**48 of 48 battles** (100%), 0 failed, 24 read back from an earlier run. Running 1 min, 1724 battles/h, about 0 min left (ends ~09:51 PC time). Last battle 0 min ago.
Skipped turns a battle: 12.2 overall, first 24 12.2, last 24 12.2; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 24 | 0 | 52.85 | - | - | - | 8.7 |
| cpl | 24 | 0 | 55.92 | +0.00 (1 robots) | - | - | 12.2 |

APS = mean difference over the robots read x 1 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 48 |
| `dead 8` | halt | ok | every arm scoring |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
09:49:40 lock-fgl exit=0 in 132 s
09:49:40 start lock-dn
09:49:40 watching lock-dn: 3 stop rule(s)
09:50:29 lock-dn exit=0 in 48 s
09:50:29 start lock-vj
09:50:29 watching lock-vj: 3 stop rule(s)
09:50:59 lock-vj exit=0 in 29 s
09:50:59 start lock-cpl
09:50:59 watching lock-cpl: 3 stop rule(s)
09:51:49 lock-cpl exit=0 in 50 s
09:51:49 start gate
09:51:50 gate exit=0 in 1 s
09:51:50 start pr
09:51:58 pr exit=0 in 7 s
09:51:58 ALLDONE
```
