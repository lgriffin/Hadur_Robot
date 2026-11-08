# Queue pc-tailor-near: progress

Updated 2026-11-08 12:52:46 PC time (12:52 UTC), runner pid 19552.

- `prep` done, exit 0 in 2 min
- `pilot` done, exit 0 in 17 min
- `screen` done, exit 0 in 2.0 h
- `pick` done, exit 0 in 0 min
- `prep2` done, exit 0 in 1 min
- `confirm` done, exit 0 in 16 min
- `gate` done, exit 0 in 0 min
- `pr` done, exit 0 in 0 min

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

**384 of 384 battles** (100%), 0 failed. Running 16 min, 1416 battles/h, about 0 min left (ends ~12:52 PC time). Last battle 0 min ago.
Skipped turns a battle: 26.1 overall, first 100 27.2, last 100 25.9; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 128 | 0 | 88.28 | - | - | - | 26.3 |
| aa | 128 | 0 | 87.79 | -0.01 (32 robots) | ±0.02 | -0.05 .. +0.02 | 25.2 |
| xr | 128 | 0 | 89.31 | +0.03 (32 robots) | ±0.02 | +0.00 .. +0.07 | 26.8 |

APS = mean difference over the robots read x 32 panel robots / 1217 pairings.
A/A: aa - c -0.49 pts over 32 robots; 1% band ±1.03 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 384 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 90 over 200` | halt | ok | 26.1 a battle over the last 200 (first 200: 25.9) |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
12:20:26 progress screen: 3570/3928 (91%) battles, 1468/h, ETA 15 min, 0 failed, skips 52.2/battle (last 100), ln +0.09
12:35:43 screen exit=0 in 7203 s
12:35:43 start pick
12:35:44 pick exit=0 in 0 s
12:35:44 start prep2
12:36:23 prep2 exit=0 in 38 s
12:36:23 start confirm
12:36:23 watching confirm: 4 stop rule(s)
12:50:46 progress confirm: 383/384 (100%) battles, 1598/h, ETA 0 min, 0 failed, skips 26.1/battle (last 100), aa -0.00, xr +0.03
12:52:39 confirm exit=0 in 975 s
12:52:39 start gate
12:52:40 gate exit=0 in 0 s
12:52:40 start pr
12:52:46 pr exit=0 in 6 s
12:52:46 ALLDONE
```
