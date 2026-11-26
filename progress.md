# Queue pc-locks: progress

Updated 2026-11-26 23:38:53 PC time (23:38 UTC), runner pid 15568.

- `prep` done, exit 0 in 8 min
- `livematch` done, exit 0 in 8 min
- `lock` done, exit 0 in 11 min
- `stage` done, exit 0 in 0 min
- `lock-gl` done, exit 0 in 2 min
- `lock-cpl` done, exit 0 in 2 min
- `lock-rwl` done, exit 0 in 1 min
- `lock-dn` done, exit 0 in 1 min
- `lock-hof` done, exit 0 in 0 min
- `lock-qw` done, exit 0 in 0 min
- `lock-rlnrkn` done, exit 0 in 1 min
- `lock-rf` done, exit 0 in 1 min
- `lock-mtty` done, exit 0 in 1 min
- `gate` done, exit 0 in 0 min
- `skip` done, exit 0 in 29 min
- `skipread` done, exit 0 in 0 min
- `pr` done, exit 0 in 0 min

### livematch

**124 of 124 battles** (100%), 0 failed. Running 8 min, 938 battles/h, about 0 min left (ends ~22:49 PC time). Last battle 0 min ago.
Skipped turns a battle: 5.7 overall, first 100 5.2, last 100 5.8; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 62 | 0 | 70.05 | - | - | - | 10.5 |
| bb | 62 | 0 | 84.38 | +0.36 (31 robots) | ±0.06 | +0.27 .. +0.46 | 0.9 |

APS = mean difference over the robots read x 31 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 124 |
| `dead 8` | halt | ok | every arm scoring |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

> warning: arm c's jar bisect/live/hadur117.Hadur_3.22.jar was built 269 h before this step started: check it is not stale

> warning: arm bb's jar opponents/kc.mega.BeepBoop_2.0.jar was built 256 h before this step started: check it is not stale

### lock

**768 of 768 battles** (100%), 0 failed. Running 11 min, 4019 battles/h, about 0 min left (ends ~23:01 PC time). Last battle 0 min ago.
Skipped turns a battle: 11.5 overall, first 100 12.9, last 100 10.6; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 384 | 0 | 86.13 | - | - | - | 11.5 |
| aa | 384 | 0 | 86.37 | +0.00 (16 robots) | ±0.01 | -0.01 .. +0.01 | 11.6 |

APS = mean difference over the robots read x 16 panel robots / 1217 pairings.
A/A: aa - c +0.24 pts over 16 robots; 1% band ±0.60 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 768 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 24` | halt | ok | 10.2 a battle over the last 24 (first 24: 16.1) |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### lock-gl

**192 of 192 battles** (100%), 0 failed, 96 read back from an earlier run. Running 2 min, 2874 battles/h, about 0 min left (ends ~23:03 PC time). Last battle 0 min ago.
Skipped turns a battle: 11.5 overall, first 96 11.5, last 96 11.5; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 96 | 0 | 73.35 | - | - | - | 10.8 |
| gl | 96 | 0 | 74.92 | +0.01 (4 robots) | ±0.01 | -0.01 .. +0.02 | 11.5 |

APS = mean difference over the robots read x 4 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 192 |
| `dead 8` | halt | ok | every arm scoring |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### lock-cpl

**96 of 96 battles** (100%), 0 failed, 48 read back from an earlier run. Running 2 min, 1602 battles/h, about 0 min left (ends ~23:05 PC time). Last battle 0 min ago.
Skipped turns a battle: 10.9 overall, first 48 10.9, last 48 10.9; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 48 | 0 | 76.48 | - | - | - | 11.5 |
| cpl | 48 | 0 | 77.68 | +0.00 (2 robots) | ±0.00 | -0.00 .. +0.01 | 10.9 |

APS = mean difference over the robots read x 2 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 96 |
| `dead 8` | halt | ok | every arm scoring |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### lock-rwl

**48 of 48 battles** (100%), 0 failed, 24 read back from an earlier run. Running 1 min, 2100 battles/h, about 0 min left (ends ~23:06 PC time). Last battle 0 min ago.
Skipped turns a battle: 16.4 overall, first 24 16.4, last 24 16.4; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 24 | 0 | 98.93 | - | - | - | 11.6 |
| rwl | 24 | 0 | 98.82 | -0.00 (1 robots) | - | - | 16.4 |

APS = mean difference over the robots read x 1 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 48 |
| `dead 8` | halt | ok | every arm scoring |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### lock-dn

**48 of 48 battles** (100%), 0 failed, 24 read back from an earlier run. Running 1 min, 1764 battles/h, about 0 min left (ends ~23:06 PC time). Last battle 0 min ago.
Skipped turns a battle: 12.5 overall, first 24 12.5, last 24 12.5; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 24 | 0 | 63.87 | - | - | - | 10.0 |
| dn | 24 | 0 | 64.70 | +0.00 (1 robots) | - | - | 12.5 |

APS = mean difference over the robots read x 1 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 48 |
| `dead 8` | halt | ok | every arm scoring |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### lock-hof

**48 of 48 battles** (100%), 0 failed, 24 read back from an earlier run. Running 0 min, 4393 battles/h, about 0 min left (ends ~23:07 PC time). Last battle 0 min ago.
Skipped turns a battle: 19.1 overall, first 24 19.1, last 24 19.1; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 24 | 0 | 98.87 | - | - | - | 12.0 |
| hof | 24 | 0 | 99.14 | +0.00 (1 robots) | - | - | 19.1 |

APS = mean difference over the robots read x 1 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 48 |
| `dead 8` | halt | ok | every arm scoring |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### lock-qw

**48 of 48 battles** (100%), 0 failed, 24 read back from an earlier run. Running 0 min, 4173 battles/h, about 0 min left (ends ~23:07 PC time). Last battle 0 min ago.
Skipped turns a battle: 17.8 overall, first 24 17.8, last 24 17.8; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 24 | 0 | 98.81 | - | - | - | 12.0 |
| qw | 24 | 0 | 98.42 | -0.00 (1 robots) | - | - | 17.8 |

APS = mean difference over the robots read x 1 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 48 |
| `dead 8` | halt | ok | every arm scoring |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### lock-rlnrkn

**144 of 144 battles** (100%), 0 failed, 72 read back from an earlier run. Running 1 min, 6598 battles/h, about 0 min left (ends ~23:08 PC time). Last battle 0 min ago.
Skipped turns a battle: 16.1 overall, first 72 16.1, last 72 16.1; engine disables 1.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 72 | 0 | 97.16 | - | - | - | 11.9 |
| rlnrkn | 72 | 0 | 98.71 | +0.00 (3 robots) | ±0.00 | +0.00 .. +0.00 | 16.1 |

APS = mean difference over the robots read x 3 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 144 |
| `dead 8` | halt | ok | every arm scoring |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### lock-rf

**48 of 48 battles** (100%), 0 failed, 24 read back from an earlier run. Running 1 min, 2707 battles/h, about 0 min left (ends ~23:08 PC time). Last battle 0 min ago.
Skipped turns a battle: 16.2 overall, first 24 16.2, last 24 16.2; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 24 | 0 | 86.44 | - | - | - | 12.0 |
| rf | 24 | 0 | 89.30 | +0.00 (1 robots) | - | - | 16.2 |

APS = mean difference over the robots read x 1 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 48 |
| `dead 8` | halt | ok | every arm scoring |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### lock-mtty

**96 of 96 battles** (100%), 0 failed, 48 read back from an earlier run. Running 1 min, 4021 battles/h, about 0 min left (ends ~23:09 PC time). Last battle 0 min ago.
Skipped turns a battle: 14.7 overall, first 48 14.7, last 48 14.7; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 48 | 0 | 96.65 | - | - | - | 12.4 |
| mtty | 48 | 0 | 97.61 | +0.00 (2 robots) | ±0.00 | -0.00 .. +0.00 | 14.7 |

APS = mean difference over the robots read x 2 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 96 |
| `dead 8` | halt | ok | every arm scoring |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### skip

**2520 of 2520 battles** (100%), 0 failed. Running 29 min, 5160 battles/h, about 0 min left (ends ~23:38 PC time). Last battle 0 min ago.
Skipped turns a battle: 13.4 overall, first 100 14.5, last 100 12.6; engine disables 6.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 840 | 0 | 92.36 | - | - | - | 13.6 |
| aa | 840 | 0 | 92.27 | -0.00 (35 robots) | ±0.00 | -0.01 .. +0.00 | 13.2 |
| sk | 840 | 0 | 92.30 | -0.00 (35 robots) | ±0.00 | -0.01 .. +0.01 | 13.4 |

APS = mean difference over the robots read x 35 panel robots / 1217 pairings.
A/A: aa - c -0.08 pts over 35 robots; 1% band ±0.40 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 2520 |
| `dead 8` | halt | ok | every arm scoring |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
23:08:42 lock-rf exit=0 in 31 s
23:08:42 start lock-mtty
23:08:42 watching lock-mtty: 3 stop rule(s)
23:09:25 lock-mtty exit=0 in 43 s
23:09:25 start gate
23:09:26 gate exit=0 in 1 s
23:09:26 start skip
23:09:26 watching skip: 3 stop rule(s)
23:13:02 progress skip: 333/2520 (13%) battles, 5574/h, ETA 24 min, 0 failed, skips 14.6/battle (last 100), aa -0.00, sk +0.00
23:38:45 skip exit=0 in 1758 s
23:38:45 start skipread
23:38:46 skipread exit=0 in 1 s
23:38:46 start pr
23:38:53 pr exit=0 in 7 s
23:38:53 ALLDONE
```
