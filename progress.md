# Queue pc-locks: progress

Updated 2026-11-25 12:07:44 PC time (12:07 UTC), runner pid 84520.

- `prep` done, exit 0 in 2 min
- `livematch` done, exit 0 in 8 min
- `lock` done, exit 0 in 6 min
- `stage` done, exit 0 in 0 min
- `lock-rwl` done, exit 0 in 3 min
- `lock-x0` done, exit 0 in 0 min
- `gate` done, exit 0 in 0 min
- `pr` done, exit 0 in 0 min

### livematch

**124 of 124 battles** (100%), 0 failed. Running 8 min, 916 battles/h, about 0 min left (ends ~11:58 PC time). Last battle 0 min ago.
Skipped turns a battle: 5.5 overall, first 100 5.0, last 100 5.5; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 62 | 0 | 71.15 | - | - | - | 10.0 |
| bb | 62 | 0 | 84.81 | +0.35 (31 robots) | ±0.06 | +0.26 .. +0.44 | 1.1 |

APS = mean difference over the robots read x 31 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 124 |
| `dead 8` | halt | ok | every arm scoring |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

> warning: arm c's jar bisect/live/hadur117.Hadur_3.22.jar was built 234 h before this step started: check it is not stale

> warning: arm bb's jar opponents/kc.mega.BeepBoop_2.0.jar was built 221 h before this step started: check it is not stale

### lock

**672 of 672 battles** (100%), 0 failed. Running 6 min, 7322 battles/h, about 0 min left (ends ~12:04 PC time). Last battle 0 min ago.
Skipped turns a battle: 14.4 overall, first 100 15.1, last 100 13.9; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 336 | 0 | 95.40 | - | - | - | 14.3 |
| aa | 336 | 0 | 95.19 | -0.00 (14 robots) | ±0.00 | -0.01 .. +0.00 | 14.5 |

APS = mean difference over the robots read x 14 panel robots / 1217 pairings.
A/A: aa - c -0.21 pts over 14 robots; 1% band ±0.64 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 672 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 24` | halt | ok | 12.8 a battle over the last 24 (first 24: 17.5) |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### lock-rwl

**624 of 624 battles** (100%), 0 failed, 312 read back from an earlier run. Running 3 min, 7239 battles/h, about 0 min left (ends ~12:07 PC time). Last battle 0 min ago.
Skipped turns a battle: 14.7 overall, first 100 15.3, last 100 14.3; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 312 | 0 | 95.87 | - | - | - | 14.3 |
| rwl | 312 | 0 | 96.57 | +0.01 (13 robots) | ±0.00 | +0.00 .. +0.01 | 14.7 |

APS = mean difference over the robots read x 13 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 624 |
| `dead 8` | halt | ok | every arm scoring |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### lock-x0

**48 of 48 battles** (100%), 0 failed, 24 read back from an earlier run. Running 0 min, 3187 battles/h, about 0 min left (ends ~12:07 PC time). Last battle 0 min ago.
Skipped turns a battle: 18.8 overall, first 24 18.8, last 24 18.8; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 24 | 0 | 89.30 | - | - | - | 14.1 |
| x0 | 24 | 0 | 91.74 | +0.00 (1 robots) | - | - | 18.8 |

APS = mean difference over the robots read x 1 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 48 |
| `dead 8` | halt | ok | every arm scoring |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
11:58:58 watching lock: 4 stop rule(s)
12:04:28 lock exit=0 in 330 s
12:04:28 start stage
12:04:33 stage exit=0 in 4 s
12:04:33 start lock-rwl
12:04:33 watching lock-rwl: 3 stop rule(s)
12:07:08 lock-rwl exit=0 in 155 s
12:07:08 start lock-x0
12:07:08 watching lock-x0: 3 stop rule(s)
12:07:35 lock-x0 exit=0 in 27 s
12:07:35 start gate
12:07:37 gate exit=0 in 1 s
12:07:37 start pr
12:07:44 pr exit=0 in 7 s
12:07:44 ALLDONE
```
