# Queue pc-locks: progress

Updated 2026-11-26 18:32:05 PC time (18:32 UTC), runner pid 99520.

- `prep` done, exit 0 in 3 min
- `livematch` done, exit 0 in 8 min
- `lock` done, exit 0 in 26 min
- `stage` done, exit 0 in 0 min
- `lock-gl` done, exit 0 in 0 min
- `lock-cpl` done, exit 0 in 5 min
- `lock-rwl` done, exit 0 in 9 min
- `gate` done, exit 0 in 0 min
- `pr` done, exit 0 in 0 min

### livematch

**124 of 124 battles** (100%), 0 failed. Running 8 min, 923 battles/h, about 0 min left (ends ~17:51 PC time). Last battle 0 min ago.
Skipped turns a battle: 5.2 overall, first 100 4.9, last 100 5.4; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 62 | 0 | 70.11 | - | - | - | 9.5 |
| bb | 62 | 0 | 85.02 | +0.38 (31 robots) | ±0.06 | +0.29 .. +0.47 | 1.0 |

APS = mean difference over the robots read x 31 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 124 |
| `dead 8` | halt | ok | every arm scoring |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

> warning: arm c's jar bisect/live/hadur117.Hadur_3.22.jar was built 264 h before this step started: check it is not stale

> warning: arm bb's jar opponents/kc.mega.BeepBoop_2.0.jar was built 251 h before this step started: check it is not stale

### lock

**2448 of 2448 battles** (100%), 0 failed. Running 26 min, 5572 battles/h, about 0 min left (ends ~18:17 PC time). Last battle 0 min ago.
Skipped turns a battle: 16.2 overall, first 100 14.8, last 100 15.6; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 1224 | 0 | 96.49 | - | - | - | 16.2 |
| aa | 1224 | 0 | 96.46 | -0.00 (51 robots) | ±0.00 | -0.01 .. +0.00 | 16.2 |

APS = mean difference over the robots read x 51 panel robots / 1217 pairings.
A/A: aa - c -0.03 pts over 51 robots; 1% band ±0.33 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 2448 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 24` | halt | ok | 13.8 a battle over the last 24 (first 24: 17.5) |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### lock-gl

**48 of 48 battles** (100%), 0 failed, 24 read back from an earlier run. Running 0 min, 3580 battles/h, about 0 min left (ends ~18:18 PC time). Last battle 0 min ago.
Skipped turns a battle: 16.2 overall, first 24 16.2, last 24 16.2; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 24 | 0 | 89.57 | - | - | - | 16.1 |
| gl | 24 | 0 | 91.60 | +0.00 (1 robots) | - | - | 16.2 |

APS = mean difference over the robots read x 1 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 48 |
| `dead 8` | halt | ok | every arm scoring |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### lock-cpl

**192 of 192 battles** (100%), 0 failed, 96 read back from an earlier run. Running 5 min, 1246 battles/h, about 0 min left (ends ~18:23 PC time). Last battle 0 min ago.
Skipped turns a battle: 17.4 overall, first 96 17.4, last 96 17.4; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 96 | 0 | 75.67 | - | - | - | 15.8 |
| cpl | 96 | 0 | 78.84 | +0.01 (4 robots) | ±0.01 | +0.00 .. +0.02 | 17.4 |

APS = mean difference over the robots read x 4 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 192 |
| `dead 8` | halt | ok | every arm scoring |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### lock-rwl

**2208 of 2208 battles** (100%), 0 failed, 1104 read back from an earlier run. Running 9 min, 7456 battles/h, about 0 min left (ends ~18:31 PC time). Last battle 0 min ago.
Skipped turns a battle: 15.1 overall, first 100 16.0, last 100 14.3; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 1104 | 0 | 98.45 | - | - | - | 16.2 |
| rwl | 1104 | 0 | 98.65 | +0.01 (46 robots) | ±0.00 | +0.00 .. +0.01 | 15.1 |

APS = mean difference over the robots read x 46 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 2208 |
| `dead 8` | halt | ok | every arm scoring |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
18:18:00 stage exit=0 in 16 s
18:18:00 start lock-gl
18:18:00 watching lock-gl: 3 stop rule(s)
18:18:24 lock-gl exit=0 in 24 s
18:18:24 start lock-cpl
18:18:24 watching lock-cpl: 3 stop rule(s)
18:23:01 lock-cpl exit=0 in 277 s
18:23:01 start lock-rwl
18:23:01 watching lock-rwl: 3 stop rule(s)
18:31:55 lock-rwl exit=0 in 533 s
18:31:55 start gate
18:31:56 gate exit=0 in 1 s
18:31:56 start pr
18:32:05 pr exit=0 in 8 s
18:32:05 ALLDONE
```
