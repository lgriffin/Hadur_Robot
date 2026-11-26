# Queue pc-rc-confirm: progress

Updated 2026-11-26 01:09:58 PC time (01:09 UTC), runner pid 105672.

- `prep` done, exit 0 in 2 min
- `livematch` done, exit 0 in 8 min
- `field` done, exit 0 in 3.3 h
- `ret` running
- `gate112` pending
- `gate` pending
- `pr` pending

### livematch

**124 of 124 battles** (100%), 0 failed. Running 8 min, 956 battles/h, about 0 min left (ends ~21:42 PC time). Last battle 0 min ago.
Skipped turns a battle: 5.3 overall, first 100 4.8, last 100 5.4; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 62 | 0 | 69.81 | - | - | - | 9.7 |
| bb | 62 | 0 | 84.49 | +0.37 (31 robots) | ±0.06 | +0.28 .. +0.47 | 0.9 |

APS = mean difference over the robots read x 31 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 124 |
| `dead 8` | halt | ok | every arm scoring |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

> warning: arm c's jar bisect/live/hadur117.Hadur_3.22.jar was built 244 h before this step started: check it is not stale

> warning: arm bb's jar opponents/kc.mega.BeepBoop_2.0.jar was built 231 h before this step started: check it is not stale

### field

**3636 of 3636 battles** (100%), 0 failed. Running 3.3 h, 1020 battles/h, about 0 min left (ends ~00:59 PC time). Last battle 0 min ago.
Skipped turns a battle: 37.6 overall, first 100 34.8, last 100 28.1; engine disables 1349.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| rel | 1212 | 0 | 93.53 | -0.31 (1212 robots) | ±0.19 | -0.61 .. -0.02 | 37.0 |
| c | 1212 | 0 | 93.83 | - | - | - | 38.5 |
| aa | 1212 | 0 | 93.86 | +0.03 (1212 robots) | ±0.18 | -0.25 .. +0.30 | 37.2 |

APS = mean difference over the robots read x 1212 panel robots / 1217 pairings.
A/A: aa - c +0.03 pts over 1212 robots; 1% band ±0.34 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 3636 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 90 over 200` | halt | ok | 31.3 a battle over the last 200 (first 200: 34.8) |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `aa after 20%` | halt | ok | aa - c +0.03 pts over 1212 robots, stop band ±0.39 |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### ret

**287 of 288 battles** (100%), 0 failed. Running 10 min, 1664 battles/h, about 0 min left (ends ~01:10 PC time). Last battle 1 min ago.
Skipped turns a battle: 11.9 overall, first 100 12.8, last 100 11.3; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| rel | 96 | 0 | 80.46 | -0.01 (16 robots) | ±0.02 | -0.03 .. +0.02 | 12.2 |
| c | 95 | 0 | 81.22 | - | - | - | 12.0 |
| aa | 96 | 0 | 80.87 | -0.00 (16 robots) | ±0.01 | -0.02 .. +0.01 | 11.4 |

APS = mean difference over the robots read x 16 panel robots / 1217 pairings.
A/A: aa - c -0.34 pts over 16 robots; 1% band ±1.19 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 287 |
| `dead 8` | halt | ok | every arm scoring |
| `stall 30m` | halt | ok | last battle 1 min ago |

Stopping now would leave 1 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
21:34:30 watching livematch: 3 stop rule(s)
21:34:47 progress livematch: 2/124 (2%) battles, 421/h, ETA 17 min, 0 failed, skips 1.0/battle (last 100)
21:42:17 livematch exit=0 in 467 s
21:42:17 start field
21:42:17 watching field: 5 stop rule(s)
22:05:03 progress field: 515/3636 (14%) battles, 1357/h, ETA 2.3 h, 0 failed, skips 36.9/battle (last 100), rel -0.28, aa -0.12
22:35:22 progress field: 1131/3636 (31%) battles, 1206/h, ETA 2.1 h, 0 failed, skips 39.7/battle (last 100), rel -0.40, aa +0.21
23:05:42 progress field: 1692/3636 (47%) battles, 1112/h, ETA 1.7 h, 0 failed, skips 37.8/battle (last 100), rel -0.37, aa +0.20
23:36:03 progress field: 2197/3636 (60%) battles, 998/h, ETA 1.4 h, 0 failed, skips 38.4/battle (last 100), rel -0.48, aa +0.19
00:06:21 progress field: 2702/3636 (74%) battles, 1006/h, ETA 56 min, 0 failed, skips 41.9/battle (last 100), rel -0.41, aa +0.11
00:36:39 progress field: 3248/3636 (89%) battles, 1070/h, ETA 22 min, 0 failed, skips 39.1/battle (last 100), rel -0.39, aa +0.06
00:59:37 field exit=0 in 11840 s
00:59:37 start ret
00:59:37 watching ret: 3 stop rule(s)
01:06:57 progress ret: 264/288 (92%) battles, 2162/h, ETA 1 min, 0 failed, skips 11.8/battle (last 100), rel -0.01, aa -0.00
```
