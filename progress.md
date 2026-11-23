# Queue pc-rc-confirm: progress

Updated 2026-11-23 22:47:39 PC time (22:47 UTC), runner pid 33592.

- `prep` done, exit 0 in 2 min
- `livematch` done, exit 0 in 0 min
- `field` done, exit 0 in 3.1 h
- `ret` done, exit 0 in 10 min
- `gate112` done, exit 0 in 0 min
- `gate` done, exit 0 in 0 min
- `pr` done, exit 0 in 0 min

### livematch

**124 of 124 battles** (100%), 0 failed, 124 read back from an earlier run. Running 0 min. Last battle 0 min ago.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 62 | 0 | 70.75 | - | - | - | 10.2 |
| bb | 62 | 0 | 84.03 | +0.34 (31 robots) | ±0.06 | +0.24 .. +0.44 | 1.1 |

APS = mean difference over the robots read x 31 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 124 |
| `dead 8` | halt | ok | every arm scoring |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun; every battle already fought is kept and a rerun resumes from it.

> warning: arm c's jar bisect/live/hadur117.Hadur_3.22.jar was built 194 h before this step started: check it is not stale

> warning: arm bb's jar opponents/kc.mega.BeepBoop_2.0.jar was built 181 h before this step started: check it is not stale

### field

**3636 of 3636 battles** (100%), 0 failed. Running 3.1 h, 802 battles/h, about 0 min left (ends ~22:37 PC time). Last battle 0 min ago.
Skipped turns a battle: 33.5 overall, first 100 33.0, last 100 34.4; engine disables 962.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| rel | 1212 | 0 | 93.71 | -0.12 (1212 robots) | ±0.17 | -0.38 .. +0.14 | 33.1 |
| c | 1212 | 0 | 93.90 | - | - | - | 34.3 |
| aa | 1212 | 0 | 93.76 | -0.14 (1212 robots) | ±0.18 | -0.41 .. +0.14 | 33.1 |

APS = mean difference over the robots read x 1212 panel robots / 1217 pairings.
A/A: aa - c -0.14 pts over 1212 robots; 1% band ±0.34 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 3636 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 90 over 200` | halt | ok | 33.6 a battle over the last 200 (first 200: 34.7) |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `aa after 20%` | halt | ok | aa - c -0.14 pts over 1212 robots, stop band ±0.39 |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### ret

**288 of 288 battles** (100%), 0 failed. Running 10 min, 1781 battles/h, about 0 min left (ends ~22:47 PC time). Last battle 0 min ago.
Skipped turns a battle: 12.4 overall, first 100 14.2, last 100 12.0; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| rel | 96 | 0 | 80.69 | +0.00 (16 robots) | ±0.01 | -0.02 .. +0.02 | 12.3 |
| c | 96 | 0 | 80.96 | - | - | - | 12.6 |
| aa | 96 | 0 | 80.30 | -0.01 (16 robots) | ±0.01 | -0.03 .. +0.01 | 12.4 |

APS = mean difference over the robots read x 16 panel robots / 1217 pairings.
A/A: aa - c -0.67 pts over 16 robots; 1% band ±1.19 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 288 |
| `dead 8` | halt | ok | every arm scoring |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
21:01:55 progress field: 1934/3636 (53%) battles, 1136/h, ETA 1.5 h, 0 failed, skips 36.1/battle (last 100), rel -0.27, aa -0.24
21:32:16 progress field: 2555/3636 (70%) battles, 1238/h, ETA 52 min, 0 failed, skips 34.5/battle (last 100), rel -0.22, aa -0.23
22:02:36 progress field: 3142/3636 (86%) battles, 1146/h, ETA 26 min, 0 failed, skips 38.4/battle (last 100), rel -0.14, aa -0.16
22:32:51 progress field: 3634/3636 (100%) battles, 978/h, ETA 0 min, 0 failed, skips 35.4/battle (last 100), rel -0.12, aa -0.14
22:37:46 field exit=0 in 11211 s
22:37:46 start ret
22:37:46 watching ret: 3 stop rule(s)
22:47:28 ret exit=0 in 582 s
22:47:28 start gate112
22:47:31 gate112 exit=0 in 3 s
22:47:31 start gate
22:47:32 gate exit=0 in 0 s
22:47:32 start pr
22:47:39 pr exit=0 in 7 s
22:47:39 ALLDONE
```
