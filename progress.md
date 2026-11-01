# Queue pc-rival-picks: progress

Updated 2026-11-01 04:55:00 PC time (04:55 UTC), runner pid 68568.

- `prep` done, exit 0 in 5 min
- `screen-add` done, exit 0 in 14 min
- `screen-exec` done, exit 0 in 12 min
- `screen-stopgo` done, exit 0 in 6 min
- `gate` done, exit 0 in 0 min
- `pr` done, exit 0 in 0 min

### screen-add

**888 of 888 battles** (100%), 0 failed. Running 14 min, 3937 battles/h, about 0 min left (ends ~04:36 PC time). Last battle 0 min ago.
Skipped turns a battle: 13.7 overall, first 100 13.6, last 100 14.2; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 222 | 0 | 85.27 | - | - | - | 13.3 |
| aa | 222 | 0 | 85.20 | -0.00 (74 robots) | ±0.04 | -0.06 .. +0.05 | 13.5 |
| mt | 222 | 0 | 82.67 | -0.16 (74 robots) | ±0.07 | -0.26 .. -0.05 | 14.1 |
| mtzl | 222 | 0 | 83.18 | -0.13 (74 robots) | ±0.08 | -0.25 .. +0.00 | 13.7 |

APS = mean difference over the robots read x 74 panel robots / 1217 pairings.
A/A: aa - c -0.07 pts over 74 robots; 1% band ±0.78 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 888 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 40 over 200` | halt | ok | 14.0 a battle over the last 200 (first 200: 13.4) |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### screen-exec

**750 of 750 battles** (100%), 0 failed. Running 12 min, 3737 battles/h, about 0 min left (ends ~04:48 PC time). Last battle 0 min ago.
Skipped turns a battle: 12.1 overall, first 100 12.2, last 100 11.7; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 150 | 0 | 92.48 | - | - | - | 12.5 |
| aa | 150 | 0 | 91.89 | -0.02 (50 robots) | ±0.05 | -0.10 .. +0.05 | 11.9 |
| zl | 150 | 0 | 93.08 | +0.04 (50 robots) | ±0.05 | -0.04 .. +0.12 | 12.0 |
| x0 | 150 | 0 | 92.88 | +0.03 (50 robots) | ±0.05 | -0.04 .. +0.10 | 11.9 |
| zlx0 | 150 | 0 | 93.83 | +0.07 (50 robots) | ±0.06 | -0.02 .. +0.16 | 12.1 |

APS = mean difference over the robots read x 50 panel robots / 1217 pairings.
A/A: aa - c -0.59 pts over 50 robots; 1% band ±0.95 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 750 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 40 over 200` | halt | ok | 11.9 a battle over the last 200 (first 200: 12.1) |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### screen-stopgo

**432 of 432 battles** (100%), 0 failed. Running 6 min, 4107 battles/h, about 0 min left (ends ~04:54 PC time). Last battle 0 min ago.
Skipped turns a battle: 12.8 overall, first 100 13.3, last 100 13.1; engine disables 1.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 108 | 0 | 88.04 | - | - | - | 14.0 |
| aa | 108 | 0 | 87.79 | -0.01 (36 robots) | ±0.03 | -0.05 .. +0.04 | 13.9 |
| mdwl | 108 | 0 | 68.29 | -0.58 (36 robots) | ±0.28 | -1.02 .. -0.14 | 10.9 |
| mdwm | 108 | 0 | 78.41 | -0.28 (36 robots) | ±0.22 | -0.62 .. +0.06 | 12.4 |

APS = mean difference over the robots read x 36 panel robots / 1217 pairings.
A/A: aa - c -0.25 pts over 36 robots; 1% band ±1.12 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 432 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 40 over 200` | halt | ok | 12.5 a battle over the last 200 (first 200: 13.1) |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
04:22:59 watching screen-add: 4 stop rule(s)
04:23:13 progress screen-add: 7/888 (1%) battles, 1789/h, ETA 30 min, 0 failed, skips 15.1/battle (last 100)
04:36:31 screen-add exit=0 in 812 s
04:36:31 start screen-exec
04:36:31 watching screen-exec: 4 stop rule(s)
04:48:34 screen-exec exit=0 in 722 s
04:48:34 start screen-stopgo
04:48:34 watching screen-stopgo: 4 stop rule(s)
04:53:38 progress screen-stopgo: 403/432 (93%) battles, 4782/h, ETA 0 min, 0 failed, skips 13.5/battle (last 100), aa -0.00, mdwl -0.58, mdwm -0.27
04:54:52 screen-stopgo exit=0 in 378 s
04:54:52 start gate
04:54:54 gate exit=0 in 1 s
04:54:54 start pr
04:55:00 pr exit=0 in 6 s
04:55:00 ALLDONE
```
