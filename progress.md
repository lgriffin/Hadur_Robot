# Queue pc-rc-confirm: progress

Updated 2026-11-25 01:26:06 PC time (01:26 UTC), runner pid 95668.

- `prep` done, exit 0 in 2 min
- `livematch` done, exit 0 in 8 min
- `field` done, exit 0 in 3.0 h
- `ret` done, exit 0 in 11 min
- `gate112` done, exit 0 in 0 min
- `gate` done, exit 0 in 0 min
- `pr` done, exit 0 in 0 min

### livematch

**124 of 124 battles** (100%), 0 failed. Running 8 min, 909 battles/h, about 0 min left (ends ~22:12 PC time). Last battle 0 min ago.
Skipped turns a battle: 5.5 overall, first 100 5.1, last 100 5.6; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 62 | 0 | 70.28 | - | - | - | 10.1 |
| bb | 62 | 0 | 84.27 | +0.36 (31 robots) | ±0.07 | +0.25 .. +0.46 | 0.9 |

APS = mean difference over the robots read x 31 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 124 |
| `dead 8` | halt | ok | every arm scoring |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

> warning: arm c's jar bisect/live/hadur117.Hadur_3.22.jar was built 220 h before this step started: check it is not stale

> warning: arm bb's jar opponents/kc.mega.BeepBoop_2.0.jar was built 207 h before this step started: check it is not stale

### field

**3636 of 3636 battles** (100%), 0 failed. Running 3.0 h, 1078 battles/h, about 0 min left (ends ~01:14 PC time). Last battle 0 min ago.
Skipped turns a battle: 36.4 overall, first 100 36.0, last 100 37.9; engine disables 1211.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| rel | 1212 | 0 | 93.69 | -0.15 (1212 robots) | ±0.17 | -0.42 .. +0.11 | 36.9 |
| c | 1212 | 0 | 93.88 | - | - | - | 36.0 |
| aa | 1212 | 0 | 93.81 | -0.07 (1212 robots) | ±0.19 | -0.36 .. +0.21 | 36.3 |

APS = mean difference over the robots read x 1212 panel robots / 1217 pairings.
A/A: aa - c -0.07 pts over 1212 robots; 1% band ±0.34 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 3636 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 90 over 200` | halt | ok | 39.8 a battle over the last 200 (first 200: 37.6) |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `aa after 20%` | halt | ok | aa - c -0.07 pts over 1212 robots, stop band ±0.39 |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### ret

**288 of 288 battles** (100%), 0 failed. Running 11 min, 1585 battles/h, about 0 min left (ends ~01:25 PC time). Last battle 0 min ago.
Skipped turns a battle: 11.6 overall, first 100 12.8, last 100 10.7; engine disables 1.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| rel | 96 | 0 | 80.02 | -0.01 (16 robots) | ±0.01 | -0.03 .. +0.02 | 11.5 |
| c | 96 | 0 | 80.74 | - | - | - | 11.7 |
| aa | 96 | 0 | 80.39 | -0.00 (16 robots) | ±0.01 | -0.02 .. +0.01 | 11.6 |

APS = mean difference over the robots read x 16 panel robots / 1217 pairings.
A/A: aa - c -0.35 pts over 16 robots; 1% band ±1.19 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 288 |
| `dead 8` | halt | ok | every arm scoring |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
23:35:40 progress field: 1746/3636 (48%) battles, 1246/h, ETA 1.5 h, 0 failed, skips 38.8/battle (last 100), rel -0.15, aa +0.14
00:05:57 progress field: 2360/3636 (65%) battles, 1204/h, ETA 1.1 h, 0 failed, skips 34.6/battle (last 100), rel -0.14, aa +0.02
00:36:15 progress field: 2952/3636 (81%) battles, 1164/h, ETA 35 min, 0 failed, skips 38.3/battle (last 100), rel -0.17, aa -0.11
01:06:36 progress field: 3490/3636 (96%) battles, 1056/h, ETA 8 min, 0 failed, skips 38.6/battle (last 100), rel -0.12, aa -0.08
01:14:58 field exit=0 in 10932 s
01:14:58 start ret
01:14:58 watching ret: 3 stop rule(s)
01:25:52 ret exit=0 in 654 s
01:25:52 start gate112
01:25:55 gate112 exit=0 in 3 s
01:25:55 start gate
01:25:56 gate exit=0 in 0 s
01:25:56 start pr
01:26:06 pr exit=0 in 9 s
01:26:06 ALLDONE
```
