# Queue pc-surf-key: progress

Updated 2026-11-01 14:53:12 PC time (14:53 UTC), runner pid 71784.

- `prep` done, exit 0 in 1 min
- `record` done, exit 0 in 19 min
- `fit` done, exit 0 in 1.4 h
- `confirm` done, exit 0 in 54 min
- `gate` done, exit 0 in 0 min
- `pr` done, exit 0 in 0 min

### record

**792 of 792 battles** (100%), 0 failed. Running 19 min, 2512 battles/h, about 0 min left (ends ~12:34 PC time). Last battle 0 min ago.
Skipped turns a battle: 18.3 overall, first 100 18.6, last 100 17.6.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 792 |
| `skips 40 over 200` | halt | ok | 18.9 a battle over the last 200 (first 200: 18.7) |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### confirm

**2376 of 2376 battles** (100%), 0 failed. Running 54 min, 2654 battles/h, about 0 min left (ends ~14:53 PC time). Last battle 0 min ago.
Skipped turns a battle: 17.3 overall, first 100 19.2, last 100 16.9; engine disables 10.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 594 | 0 | 83.69 | - | - | - | 16.9 |
| aa | 594 | 0 | 83.70 | +0.00 (198 robots) | ±0.06 | -0.09 .. +0.09 | 17.4 |
| kl | 594 | 0 | 84.05 | +0.06 (198 robots) | ±0.05 | -0.02 .. +0.14 | 17.6 |
| klbb | 594 | 0 | 83.73 | +0.01 (198 robots) | ±0.05 | -0.07 .. +0.08 | 17.5 |

APS = mean difference over the robots read x 198 panel robots / 1217 pairings.
A/A: aa - c +0.01 pts over 198 robots; 1% band ±0.48 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 2376 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 40 over 200` | halt | ok | 17.4 a battle over the last 200 (first 200: 18.7) |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
12:15:17 watching record: 3 stop rule(s)
12:15:58 progress record: 10/792 (1%) battles, 872/h, ETA 54 min, 0 failed, skips 16.4/battle (last 100)
12:34:12 record exit=0 in 1134 s
12:34:12 start fit
13:58:50 fit exit=0 in 5077 s
13:58:50 start confirm
13:58:50 watching confirm: 4 stop rule(s)
13:59:41 progress confirm: 37/2376 (2%) battles, 2592/h, ETA 54 min, 0 failed, skips 22.2/battle (last 100), aa +0.15, kl -0.38, klbb -0.20
14:30:05 progress confirm: 1336/2376 (56%) battles, 2548/h, ETA 24 min, 0 failed, skips 17.0/battle (last 100), aa -0.02, kl +0.06, klbb +0.01
14:53:04 confirm exit=0 in 3254 s
14:53:04 start gate
14:53:05 gate exit=0 in 0 s
14:53:05 start pr
14:53:12 pr exit=0 in 6 s
14:53:12 ALLDONE
```
