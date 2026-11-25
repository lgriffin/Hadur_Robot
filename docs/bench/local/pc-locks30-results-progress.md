# Queue pc-locks: progress

Updated 2026-11-25 15:52:14 PC time (15:52 UTC), runner pid 27028.

- `prep` done, exit 0 in 4 min
- `livematch` done, exit 0 in 9 min
- `lock` done, exit 0 in 7 min
- `stage` done, exit 0 in 0 min
- `lock-ky` done, exit 0 in 1 min
- `lock-rwl` done, exit 0 in 1 min
- `lock-ty` done, exit 0 in 1 min
- `lock-x0` running
- `gate` pending
- `pr` pending

### livematch

**124 of 124 battles** (100%), 0 failed. Running 9 min, 818 battles/h, about 0 min left (ends ~15:42 PC time). Last battle 0 min ago.
Skipped turns a battle: 1.5 overall, first 100 1.5, last 100 1.6; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 62 | 0 | 71.14 | - | - | - | 3.0 |
| bb | 62 | 0 | 84.46 | +0.34 (31 robots) | ±0.07 | +0.24 .. +0.44 | 0.0 |

APS = mean difference over the robots read x 31 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 124 |
| `dead 8` | halt | ok | every arm scoring |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

> warning: arm c's jar bisect/live/hadur117.Hadur_3.22.jar was built 238 h before this step started: check it is not stale

> warning: arm bb's jar opponents/kc.mega.BeepBoop_2.0.jar was built 225 h before this step started: check it is not stale

### lock

**624 of 624 battles** (100%), 0 failed. Running 7 min, 5551 battles/h, about 0 min left (ends ~15:48 PC time). Last battle 0 min ago.
Skipped turns a battle: 7.4 overall, first 100 7.4, last 100 7.3; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 312 | 0 | 95.84 | - | - | - | 7.4 |
| aa | 312 | 0 | 95.50 | -0.00 (13 robots) | ±0.01 | -0.01 .. +0.01 | 7.4 |

APS = mean difference over the robots read x 13 panel robots / 1217 pairings.
A/A: aa - c -0.34 pts over 13 robots; 1% band ±0.66 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 624 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 24` | halt | ok | 6.4 a battle over the last 24 (first 24: 6.1) |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### lock-ky

**144 of 144 battles** (100%), 0 failed, 72 read back from an earlier run. Running 1 min, 3608 battles/h, about 0 min left (ends ~15:50 PC time). Last battle 0 min ago.
Skipped turns a battle: 6.3 overall, first 72 6.3, last 72 6.3; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 72 | 0 | 95.24 | - | - | - | 7.2 |
| ky | 72 | 0 | 98.16 | +0.01 (3 robots) | ±0.01 | -0.01 .. +0.02 | 6.3 |

APS = mean difference over the robots read x 3 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 144 |
| `dead 8` | halt | ok | every arm scoring |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### lock-rwl

**144 of 144 battles** (100%), 0 failed, 72 read back from an earlier run. Running 1 min, 5268 battles/h, about 0 min left (ends ~15:50 PC time). Last battle 0 min ago.
Skipped turns a battle: 7.6 overall, first 72 7.6, last 72 7.6; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 72 | 0 | 93.46 | - | - | - | 7.4 |
| rwl | 72 | 0 | 94.42 | +0.00 (3 robots) | ±0.00 | -0.00 .. +0.01 | 7.6 |

APS = mean difference over the robots read x 3 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 144 |
| `dead 8` | halt | ok | every arm scoring |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### lock-ty

**96 of 96 battles** (100%), 0 failed, 48 read back from an earlier run. Running 1 min, 3581 battles/h, about 0 min left (ends ~15:51 PC time). Last battle 0 min ago.
Skipped turns a battle: 9.5 overall, first 48 9.5, last 48 9.5; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 48 | 0 | 98.22 | - | - | - | 7.6 |
| ty | 48 | 0 | 98.90 | +0.00 (2 robots) | ±0.00 | -0.00 .. +0.00 | 9.5 |

APS = mean difference over the robots read x 2 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 96 |
| `dead 8` | halt | ok | every arm scoring |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### lock-x0

**40 of 48 battles** (83%), 0 failed, 24 read back from an earlier run. Running 0 min, 2043 battles/h, about 0 min left (ends ~15:52 PC time). Last battle 0 min ago.
Skipped turns a battle: 5.0 overall, first 16 5.0, last 16 5.0; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 24 | 0 | 93.69 | - | - | - | 6.7 |
| x0 | 16 | 0 | 93.96 | +0.00 (1 robots) | - | - | 5.0 |

APS = mean difference over the robots read x 1 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 40 |
| `dead 8` | halt | ok | every arm scoring |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 8 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
15:42:06 watching lock: 4 stop rule(s)
15:48:51 lock exit=0 in 404 s
15:48:51 start stage
15:48:55 stage exit=0 in 4 s
15:48:55 start lock-ky
15:48:55 watching lock-ky: 3 stop rule(s)
15:50:07 lock-ky exit=0 in 72 s
15:50:07 start lock-rwl
15:50:07 watching lock-rwl: 3 stop rule(s)
15:50:57 lock-rwl exit=0 in 49 s
15:50:57 start lock-ty
15:50:57 watching lock-ty: 3 stop rule(s)
15:51:45 lock-ty exit=0 in 48 s
15:51:45 start lock-x0
15:51:45 watching lock-x0: 3 stop rule(s)
```
