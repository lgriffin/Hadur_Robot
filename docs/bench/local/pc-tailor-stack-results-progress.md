# Queue pc-tailor-stack: progress

Updated 2026-11-08 19:28:06 PC time (19:28 UTC), runner pid 26028.

- `prep` done, exit 0 in 2 min
- `pilot` done, exit 0 in 18 min
- `screen` done, exit 0 in 26 min
- `pick` done, exit 0 in 0 min
- `prep2` done, exit 0 in 1 min
- `confirm` running
- `gate` pending
- `pr` pending

### pilot

**552 of 552 battles** (100%), 0 failed. Running 18 min, 1835 battles/h, about 0 min left (ends ~18:59 PC time). Last battle 0 min ago.
Skipped turns a battle: 26.7 overall, first 100 28.0, last 100 27.7; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 276 | 0 | 86.51 | - | - | - | 26.5 |
| ln | 276 | 0 | 86.91 | +0.02 (69 robots) | ±0.03 | -0.03 .. +0.07 | 27.0 |

APS = mean difference over the robots read x 69 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 552 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 90 over 200` | halt | ok | 27.2 a battle over the last 200 (first 200: 26.9) |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### screen

**1936 of 1736 battles** (112%), 0 failed, 552 read back from an earlier run. Running 26 min, 3177 battles/h, about -4 min left (ends ~19:21 PC time). Last battle 0 min ago.
Skipped turns a battle: 32.3 overall, first 100 35.2, last 100 31.3; engine disables 31.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 968 | 0 | 89.22 | - | - | - | 30.4 |
| ln | 968 | 0 | 89.34 | +0.02 (242 robots) | ±0.05 | -0.06 .. +0.10 | 31.1 |

APS = mean difference over the robots read x 217 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 1936 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 90 over 200` | halt | ok | 31.5 a battle over the last 200 (first 200: 34.3) |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave -200 battles unrun (about -4 min); every battle already fought is kept and a rerun resumes from it.

### confirm

**100 of 108 battles** (93%), 0 failed. Running 2 min, 2822 battles/h, about 0 min left (ends ~19:28 PC time). Last battle 0 min ago.
Skipped turns a battle: 28.0 overall, first 100 28.0, last 100 28.0; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 31 | 0 | 86.11 | - | - | - | 28.6 |
| aa | 34 | 0 | 86.51 | +0.00 (9 robots) | ±0.01 | -0.02 .. +0.02 | 27.3 |
| xr | 35 | 0 | 87.60 | +0.01 (9 robots) | ±0.01 | -0.01 .. +0.03 | 28.0 |

APS = mean difference over the robots read x 9 panel robots / 1217 pairings.
A/A: aa - c +0.40 pts over 9 robots; 1% band ±2.05 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 100 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 90 over 200` | halt | waiting | 100 of 200 battles to read |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 8 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
18:41:10 prep exit=0 in 97 s
18:41:10 start pilot
18:41:10 watching pilot: 4 stop rule(s)
18:41:34 progress pilot: 12/552 (2%) battles, 1781/h, ETA 18 min, 0 failed, skips 32.2/battle (last 100), ln +0.00
18:59:13 pilot exit=0 in 1082 s
18:59:13 start screen
18:59:13 watching screen: 4 stop rule(s)
19:11:57 progress screen: 1226/1736 (71%) battles, 3175/h, ETA 10 min, 0 failed, skips 31.9/battle (last 100), ln -0.02
19:25:21 screen exit=0 in 1568 s
19:25:21 start pick
19:25:22 pick exit=0 in 0 s
19:25:22 start prep2
19:25:58 prep2 exit=0 in 36 s
19:25:58 start confirm
19:25:58 watching confirm: 4 stop rule(s)
```
