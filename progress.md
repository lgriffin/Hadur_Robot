# Queue pc-locks40: progress

Updated 2026-11-28 14:44:55 PC time (14:44 UTC), runner pid 12896.

- `prep` done, exit 0 in 4 min
- `livematch` done, exit 0 in 8 min
- `lock` done, exit 0 in 2.6 h
- `stage` done, exit 0 in 0 min
- `lock-fgp` running
- `lock-zl` pending
- `lock-gl` pending
- `lock-pb` pending
- `gate` pending
- `pr` pending

### livematch

**124 of 124 battles** (100%), 0 failed. Running 8 min, 945 battles/h, about 0 min left (ends ~11:55 PC time). Last battle 0 min ago.
Skipped turns a battle: 5.3 overall, first 100 4.7, last 100 5.3; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 62 | 0 | 69.84 | - | - | - | 9.9 |
| bb | 62 | 0 | 84.43 | +0.37 (31 robots) | ±0.07 | +0.27 .. +0.48 | 0.6 |

APS = mean difference over the robots read x 31 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 124 |
| `dead 8` | halt | ok | every arm scoring |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

> warning: arm c's jar bisect/live/hadur117.Hadur_3.22.jar was built 306 h before this step started: check it is not stale

> warning: arm bb's jar opponents/kc.mega.BeepBoop_2.0.jar was built 293 h before this step started: check it is not stale

### lock

**1152 of 1152 battles** (100%), 0 failed. Running 2.6 h, 346 battles/h, about 0 min left (ends ~14:32 PC time). Last battle 0 min ago.
Skipped turns a battle: 9.4 overall, first 100 10.7, last 100 9.1; engine disables 8.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 576 | 0 | 60.57 | - | - | - | 9.3 |
| aa | 576 | 0 | 60.74 | +0.00 (12 robots) | ±0.00 | -0.00 .. +0.01 | 9.6 |

APS = mean difference over the robots read x 12 panel robots / 1217 pairings.
A/A: aa - c +0.17 pts over 12 robots; 1% band ±0.49 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 1152 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 24` | halt | ok | 8.0 a battle over the last 24 (first 24: 14.0) |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### lock-fgp

**83 of 96 battles** (86%), 0 failed, 48 read back from an earlier run. Running 13 min, 166 battles/h, about 5 min left (ends ~14:49 PC time). Last battle 0 min ago.
Skipped turns a battle: 8.9 overall, first 35 8.9, last 35 8.9; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 48 | 0 | 21.53 | - | - | - | 6.4 |
| fgp | 35 | 0 | 33.54 | +0.01 (1 robots) | - | - | 8.9 |

APS = mean difference over the robots read x 1 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 83 |
| `dead 8` | halt | ok | every arm scoring |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 13 battles unrun (about 5 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
11:47:11 watching livematch: 3 stop rule(s)
11:47:27 progress livematch: 2/124 (2%) battles, 446/h, ETA 16 min, 0 failed, skips 1.0/battle (last 100)
11:55:04 livematch exit=0 in 472 s
11:55:04 start lock
11:55:04 watching lock: 4 stop rule(s)
12:17:42 progress lock: 161/1152 (14%) battles, 427/h, ETA 2.3 h, 0 failed, skips 9.1/battle (last 100), aa -0.01
12:47:56 progress lock: 428/1152 (37%) battles, 530/h, ETA 1.4 h, 0 failed, skips 7.2/battle (last 100), aa +0.00
13:18:13 progress lock: 655/1152 (57%) battles, 450/h, ETA 1.1 h, 0 failed, skips 10.4/battle (last 100), aa +0.00
13:48:28 progress lock: 902/1152 (78%) battles, 486/h, ETA 31 min, 0 failed, skips 9.2/battle (last 100), aa +0.00
14:18:43 progress lock: 1095/1152 (95%) battles, 380/h, ETA 9 min, 0 failed, skips 9.6/battle (last 100), aa +0.00
14:32:13 lock exit=0 in 9429 s
14:32:13 start stage
14:32:17 stage exit=0 in 3 s
14:32:17 start lock-fgp
14:32:17 watching lock-fgp: 3 stop rule(s)
```
