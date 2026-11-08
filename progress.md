# Queue pc-tailor-near: progress

Updated 2026-11-08 12:48:46 PC time (12:48 UTC), runner pid 19552.

- `prep` done, exit 0 in 2 min
- `pilot` done, exit 0 in 17 min
- `screen` done, exit 0 in 2.0 h
- `pick` done, exit 0 in 0 min
- `prep2` done, exit 0 in 1 min
- `confirm` running
- `gate` pending
- `pr` pending

### pilot

**792 of 792 battles** (100%), 0 failed. Running 17 min, 2814 battles/h, about 0 min left (ends ~10:35 PC time). Last battle 0 min ago.
Skipped turns a battle: 28.5 overall, first 100 32.2, last 100 27.8; engine disables 1.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 396 | 0 | 89.86 | - | - | - | 28.2 |
| ln | 396 | 0 | 90.27 | +0.03 (99 robots) | ±0.05 | -0.04 .. +0.10 | 28.7 |

APS = mean difference over the robots read x 99 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 792 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 90 over 200` | halt | ok | 27.8 a battle over the last 200 (first 200: 30.7) |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### screen

**3928 of 3928 battles** (100%), 0 failed, 792 read back from an earlier run. Running 2.0 h, 1414 battles/h, about 0 min left (ends ~12:35 PC time). Last battle 0 min ago.
Skipped turns a battle: 52.3 overall, first 100 49.3, last 100 53.4; engine disables 1235.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 1964 | 0 | 90.48 | - | - | - | 47.9 |
| ln | 1964 | 0 | 90.72 | +0.10 (491 robots) | ±0.10 | -0.06 .. +0.25 | 47.1 |

APS = mean difference over the robots read x 491 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 3928 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 90 over 200` | halt | ok | 50.1 a battle over the last 200 (first 200: 49.6) |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### confirm

**382 of 384 battles** (99%), 0 failed. Running 12 min, 1852 battles/h, about 0 min left (ends ~12:48 PC time). Last battle 0 min ago.
Skipped turns a battle: 26.1 overall, first 100 27.2, last 100 26.0; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 128 | 0 | 88.28 | - | - | - | 26.3 |
| aa | 127 | 0 | 88.09 | -0.00 (32 robots) | ±0.02 | -0.04 .. +0.03 | 25.3 |
| xr | 127 | 0 | 89.48 | +0.03 (32 robots) | ±0.02 | +0.00 .. +0.07 | 26.7 |

APS = mean difference over the robots read x 32 panel robots / 1217 pairings.
A/A: aa - c -0.19 pts over 32 robots; 1% band ±1.03 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 382 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 90 over 200` | halt | ok | 26.2 a battle over the last 200 (first 200: 25.9) |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 2 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
10:19:04 progress pilot: 11/792 (1%) battles, 2306/h, ETA 20 min, 0 failed, skips 45.0/battle (last 100)
10:35:40 pilot exit=0 in 1013 s
10:35:40 start screen
10:35:40 watching screen: 4 stop rule(s)
10:49:23 progress screen: 1191/3928 (30%) battles, 1745/h, ETA 1.6 h, 0 failed, skips 50.2/battle (last 100), ln -0.05
11:19:43 progress screen: 2015/3928 (51%) battles, 1632/h, ETA 1.2 h, 0 failed, skips 55.2/battle (last 100), ln +0.06
11:50:04 progress screen: 2826/3928 (72%) battles, 1604/h, ETA 41 min, 0 failed, skips 50.6/battle (last 100), ln +0.08
12:20:26 progress screen: 3570/3928 (91%) battles, 1468/h, ETA 15 min, 0 failed, skips 52.2/battle (last 100), ln +0.09
12:35:43 screen exit=0 in 7203 s
12:35:43 start pick
12:35:44 pick exit=0 in 0 s
12:35:44 start prep2
12:36:23 prep2 exit=0 in 38 s
12:36:23 start confirm
12:36:23 watching confirm: 4 stop rule(s)
```
