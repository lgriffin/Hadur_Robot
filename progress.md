# Queue pc-locks: progress

Updated 2026-11-27 18:49:37 PC time (18:49 UTC), runner pid 4952.

- `prep` done, exit 0 in 4 min
- `livematch` done, exit 0 in 8 min
- `lock` done, exit 0 in 1.2 h
- `stage` done, exit 0 in 0 min
- `lock-zl` done, exit 0 in 0 min
- `lock-vj` done, exit 0 in 1 min
- `lock-rp` running
- `lock-rppb` pending
- `gate` pending
- `pr` pending

### livematch

**124 of 124 battles** (100%), 0 failed. Running 8 min, 928 battles/h, about 0 min left (ends ~17:30 PC time). Last battle 0 min ago.
Skipped turns a battle: 5.2 overall, first 100 5.1, last 100 5.3; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 62 | 0 | 70.03 | - | - | - | 9.7 |
| bb | 62 | 0 | 84.95 | +0.38 (31 robots) | ±0.07 | +0.27 .. +0.49 | 0.7 |

APS = mean difference over the robots read x 31 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 124 |
| `dead 8` | halt | ok | every arm scoring |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

> warning: arm c's jar bisect/live/hadur117.Hadur_3.22.jar was built 288 h before this step started: check it is not stale

> warning: arm bb's jar opponents/kc.mega.BeepBoop_2.0.jar was built 275 h before this step started: check it is not stale

### lock

**672 of 672 battles** (100%), 0 failed. Running 1.2 h, 428 battles/h, about 0 min left (ends ~18:44 PC time). Last battle 0 min ago.
Skipped turns a battle: 10.7 overall, first 100 12.5, last 100 8.9; engine disables 9.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 336 | 0 | 59.58 | - | - | - | 10.7 |
| aa | 336 | 0 | 59.16 | -0.00 (14 robots) | ±0.01 | -0.01 .. +0.00 | 10.6 |

APS = mean difference over the robots read x 14 panel robots / 1217 pairings.
A/A: aa - c -0.41 pts over 14 robots; 1% band ±0.64 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 672 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 24` | halt | ok | 6.8 a battle over the last 24 (first 24: 11.4) |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### lock-zl

**48 of 48 battles** (100%), 0 failed, 24 read back from an earlier run. Running 1 min, 2845 battles/h, about 0 min left (ends ~18:45 PC time). Last battle 0 min ago.
Skipped turns a battle: 16.5 overall, first 24 16.5, last 24 16.5; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 24 | 0 | 90.03 | - | - | - | 16.1 |
| zl | 24 | 0 | 91.72 | +0.00 (1 robots) | - | - | 16.5 |

APS = mean difference over the robots read x 1 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 48 |
| `dead 8` | halt | ok | every arm scoring |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### lock-vj

**48 of 48 battles** (100%), 0 failed, 24 read back from an earlier run. Running 1 min, 2455 battles/h, about 0 min left (ends ~18:45 PC time). Last battle 0 min ago.
Skipped turns a battle: 14.4 overall, first 24 14.4, last 24 14.4; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 24 | 0 | 85.04 | - | - | - | 11.5 |
| vj | 24 | 0 | 85.17 | +0.00 (1 robots) | - | - | 14.4 |

APS = mean difference over the robots read x 1 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 48 |
| `dead 8` | halt | ok | every arm scoring |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### lock-rp

**209 of 336 battles** (62%), 0 failed, 168 read back from an earlier run. Running 4 min, 615 battles/h, about 12 min left (ends ~19:02 PC time). Last battle 0 min ago.
Skipped turns a battle: 11.5 overall, first 41 11.5, last 41 11.5; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 168 | 0 | 63.45 | - | - | - | 11.2 |
| rp | 41 | 0 | 67.48 | +0.02 (7 robots) | ±0.01 | +0.00 .. +0.04 | 11.5 |

APS = mean difference over the robots read x 7 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 209 |
| `dead 8` | halt | ok | every arm scoring |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 127 battles unrun (about 12 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
17:30:24 start lock
17:30:24 watching lock: 4 stop rule(s)
17:53:09 progress lock: 253/672 (38%) battles, 667/h, ETA 38 min, 0 failed, skips 11.6/battle (last 100), aa -0.01
18:23:24 progress lock: 547/672 (81%) battles, 582/h, ETA 13 min, 0 failed, skips 9.2/battle (last 100), aa -0.01
18:44:28 lock exit=0 in 4443 s
18:44:28 start stage
18:44:31 stage exit=0 in 3 s
18:44:31 start lock-zl
18:44:31 watching lock-zl: 3 stop rule(s)
18:45:02 lock-zl exit=0 in 30 s
18:45:02 start lock-vj
18:45:02 watching lock-vj: 3 stop rule(s)
18:45:37 lock-vj exit=0 in 35 s
18:45:37 start lock-rp
18:45:37 watching lock-rp: 3 stop rule(s)
```
