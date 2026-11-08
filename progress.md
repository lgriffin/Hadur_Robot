# Queue pc-race-power: progress

Updated 2026-11-08 01:25:15 PC time (01:25 UTC), runner pid 58972.

- `prep` done, exit 0 in 2 min
- `pilot` done, exit 0 in 6 min
- `screen` done, exit 0 in 7.6 h
- `pick` done, exit 0 in 0 min
- `prep2` done, exit 0 in 1 min
- `confirm` done, exit 0 in 15 min
- `gate` done, exit 0 in 0 min
- `pr` done, exit 0 in 0 min

### pilot

**48 of 48 battles** (100%), 0 failed. Running 6 min, 514 battles/h, about 0 min left (ends ~17:35 PC time). Last battle 0 min ago.
Skipped turns a battle: 42.1 overall, first 48 42.1, last 48 42.1; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 16 | 0 | 56.39 | - | - | - | 38.8 |
| aa | 16 | 0 | 56.99 | +0.00 (4 robots) | ±0.01 | -0.02 .. +0.02 | 42.8 |
| rp | 16 | 0 | 67.23 | +0.03 (4 robots) | ±0.02 | +0.01 .. +0.06 | 44.8 |

APS = mean difference over the robots read x 4 panel robots / 1217 pairings.
A/A: aa - c +0.60 pts over 4 robots; 1% band ±2.92 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 48 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 90 over 200` | halt | waiting | 48 of 200 battles to read |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### screen

**7188 of 7164 battles** (100%), 0 failed, 48 read back from an earlier run. Running 7.6 h, 838 battles/h, about -2 min left (ends ~01:08 PC time). Last battle 0 min ago.
Skipped turns a battle: 59.0 overall, first 100 50.8, last 100 53.7; engine disables 3719.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 2396 | 0 | 92.82 | - | - | - | 59.8 |
| aa | 2396 | 0 | 92.68 | -0.14 (1194 robots) | ±0.15 | -0.37 .. +0.09 | 58.2 |
| rp | 2396 | 0 | 92.89 | +0.14 (1194 robots) | ±0.16 | -0.11 .. +0.39 | 58.5 |

APS = mean difference over the robots read x 1194 panel robots / 1217 pairings.
A/A: aa - c -0.15 pts over 1194 robots; 1% band ±0.24 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 7188 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 90 over 200` | halt | ok | 55.2 a battle over the last 200 (first 200: 54.3) |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave -24 battles unrun (about -2 min); every battle already fought is kept and a rerun resumes from it.

### confirm

**228 of 228 battles** (100%), 0 failed. Running 15 min, 942 battles/h, about 0 min left (ends ~01:25 PC time). Last battle 0 min ago.
Skipped turns a battle: 30.1 overall, first 100 29.0, last 100 30.9; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 76 | 0 | 67.99 | - | - | - | 28.5 |
| aa | 76 | 0 | 67.85 | -0.00 (19 robots) | ±0.02 | -0.04 .. +0.03 | 26.8 |
| xr | 76 | 0 | 74.38 | +0.10 (19 robots) | ±0.05 | +0.02 .. +0.18 | 35.1 |

APS = mean difference over the robots read x 19 panel robots / 1217 pairings.
A/A: aa - c -0.14 pts over 19 robots; 1% band ±1.34 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 228 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 90 over 200` | halt | ok | 30.9 a battle over the last 200 (first 200: 30.1) |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
00:34:09 progress screen: 6689/7164 (93%) battles, 852/h, ETA 33 min, 0 failed, skips 47.1/battle (last 100), aa -0.10, rp +0.12
01:04:28 progress screen: 7116/7164 (99%) battles, 848/h, ETA 3 min, 0 failed, skips 55.5/battle (last 100), aa -0.16, rp +0.16
01:09:59 screen exit=0 in 27274 s
01:09:59 start pick
01:10:00 pick exit=0 in 0 s
01:10:00 start prep2
01:10:36 prep2 exit=0 in 36 s
01:10:36 start confirm
01:10:36 watching confirm: 4 stop rule(s)
01:25:08 confirm exit=0 in 871 s
01:25:08 start gate
01:25:09 gate exit=0 in 0 s
01:25:09 start pr
01:25:15 pr exit=0 in 6 s
01:25:15 ALLDONE
```
