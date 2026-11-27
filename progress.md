# Queue pc-locks: progress

Updated 2026-11-27 22:51:40 PC time (22:51 UTC), runner pid 50772.

- `prep` done, exit 0 in 4 min
- `livematch` done, exit 0 in 8 min
- `lock` done, exit 0 in 1.3 h
- `stage` done, exit 0 in 0 min
- `lock-rp` done, exit 0 in 9 min
- `lock-p5` done, exit 0 in 2 min
- `lock-fq` done, exit 0 in 1 min
- `lock-gl` running
- `gate` pending
- `pr` pending

### livematch

**124 of 124 battles** (100%), 0 failed. Running 8 min, 927 battles/h, about 0 min left (ends ~21:17 PC time). Last battle 0 min ago.
Skipped turns a battle: 5.2 overall, first 100 4.7, last 100 5.3; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 62 | 0 | 70.40 | - | - | - | 9.7 |
| bb | 62 | 0 | 84.55 | +0.36 (31 robots) | ±0.07 | +0.25 .. +0.47 | 0.7 |

APS = mean difference over the robots read x 31 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 124 |
| `dead 8` | halt | ok | every arm scoring |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

> warning: arm c's jar bisect/live/hadur117.Hadur_3.22.jar was built 291 h before this step started: check it is not stale

> warning: arm bb's jar opponents/kc.mega.BeepBoop_2.0.jar was built 278 h before this step started: check it is not stale

### lock

**576 of 576 battles** (100%), 0 failed. Running 1.3 h, 350 battles/h, about 0 min left (ends ~22:38 PC time). Last battle 0 min ago.
Skipped turns a battle: 9.2 overall, first 100 10.5, last 100 8.5; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 288 | 0 | 56.17 | - | - | - | 9.4 |
| aa | 288 | 0 | 56.30 | +0.00 (12 robots) | ±0.01 | -0.01 .. +0.02 | 9.0 |

APS = mean difference over the robots read x 12 panel robots / 1217 pairings.
A/A: aa - c +0.13 pts over 12 robots; 1% band ±0.69 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 576 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 24` | halt | ok | 8.2 a battle over the last 24 (first 24: 12.5) |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### lock-rp

**144 of 144 battles** (100%), 0 failed, 72 read back from an earlier run. Running 9 min, 480 battles/h, about 0 min left (ends ~22:47 PC time). Last battle 0 min ago.
Skipped turns a battle: 10.4 overall, first 72 10.4, last 72 10.4; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 72 | 0 | 63.51 | - | - | - | 9.6 |
| rp | 72 | 0 | 67.43 | +0.01 (3 robots) | ±0.01 | -0.01 .. +0.03 | 10.4 |

APS = mean difference over the robots read x 3 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 144 |
| `dead 8` | halt | ok | every arm scoring |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### lock-p5

**48 of 48 battles** (100%), 0 failed, 24 read back from an earlier run. Running 2 min, 597 battles/h, about 0 min left (ends ~22:49 PC time). Last battle 0 min ago.
Skipped turns a battle: 22.2 overall, first 24 22.2, last 24 22.2; engine disables 4.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 24 | 0 | 57.28 | - | - | - | 9.4 |
| p5 | 24 | 0 | 59.50 | +0.00 (1 robots) | - | - | 22.2 |

APS = mean difference over the robots read x 1 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 48 |
| `dead 8` | halt | ok | every arm scoring |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### lock-fq

**48 of 48 battles** (100%), 0 failed, 24 read back from an earlier run. Running 1 min, 1888 battles/h, about 0 min left (ends ~22:50 PC time). Last battle 0 min ago.
Skipped turns a battle: 13.4 overall, first 24 13.4, last 24 13.4; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 24 | 0 | 65.94 | - | - | - | 9.2 |
| fq | 24 | 0 | 67.22 | +0.00 (1 robots) | - | - | 13.4 |

APS = mean difference over the robots read x 1 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 48 |
| `dead 8` | halt | ok | every arm scoring |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### lock-gl

**25 of 48 battles** (52%), 0 failed, 24 read back from an earlier run. Running 1 min, 44 battles/h, about 31 min left (ends ~23:22 PC time). Last battle 0 min ago.
Skipped turns a battle: 15.0 overall, first 1 15.0, last 1 15.0; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 24 | 0 | 75.32 | - | - | - | 10.8 |
| gl | 1 | 0 | 79.48 | +0.00 (1 robots) | - | - | 15.0 |

APS = mean difference over the robots read x 1 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 25 |
| `dead 8` | halt | ok | every arm scoring |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 23 battles unrun (about 31 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
22:38:05 lock exit=0 in 4839 s
22:38:05 start stage
22:38:08 stage exit=0 in 2 s
22:38:08 start lock-rp
22:38:08 watching lock-rp: 3 stop rule(s)
22:40:35 progress lock-rp: 86/144 (60%) battles, 343/h, ETA 10 min, 0 failed, skips 11.6/battle (last 100), rp +0.01
22:47:08 lock-rp exit=0 in 540 s
22:47:08 start lock-p5
22:47:08 watching lock-p5: 3 stop rule(s)
22:49:33 lock-p5 exit=0 in 144 s
22:49:33 start lock-fq
22:49:33 watching lock-fq: 3 stop rule(s)
22:50:18 lock-fq exit=0 in 45 s
22:50:18 start lock-gl
22:50:18 watching lock-gl: 3 stop rule(s)
```
