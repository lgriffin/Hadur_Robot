# Queue pc-rc-confirm: progress

Updated 2026-11-20 18:09:59 PC time (18:09 UTC), runner pid 48084.

- `prep` done, exit 0 in 2 min
- `livematch` done, exit 0 in 0 min
- `field` running
- `ret` pending
- `gate112` pending
- `gate` pending
- `pr` pending

### field

**4119 of 7158 battles** (58%), 0 failed, 521 read back from an earlier run. Running 5.6 h, 666 battles/h, about 4.6 h left (ends ~22:43 PC time). Last battle 0 min ago.
Skipped turns a battle: 44.1 overall, first 100 47.4, last 100 37.7; engine disables 1695.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| rel | 1369 | 0 | 93.27 | -0.48 (987 robots) | ±0.19 | -0.77 .. -0.19 | 46.5 |
| c | 1376 | 0 | 93.73 | - | - | - | 45.4 |
| aa | 1374 | 0 | 93.81 | +0.08 (989 robots) | ±0.20 | -0.22 .. +0.37 | 44.9 |

APS = mean difference over the robots read x 1193 panel robots / 1217 pairings.
A/A: aa - c +0.08 pts over 989 robots; 1% band ±0.31 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 4119 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 90 over 200` | halt | ok | 39.3 a battle over the last 200 (first 200: 42.8) |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `aa after 20%` | halt | ok | aa - c +0.08 pts over 989 robots, stop band ±0.37 |

Stopping now would leave 3039 battles unrun (about 4.6 h); every battle already fought is kept and a rerun resumes from it.

> warning: arm rel's jar bisect/rel/hadur117.Hadur_3.23.jar was built 13 h before this step started: check it is not stale

> warning: arm aa's jar bisect/hadur117.Hadur_3.23bb.jar was built 13 h before this step started: check it is not stale

### Queue log (last lines)

```
12:35:39 start field
12:35:39 watching field: 5 stop rule(s)
12:35:42 progress pushed to origin claude/pc-rc-confirm-progress (every 15 min)
12:36:39 progress field: 521/7158 (7%) battles, 0 failed, rel -0.23, aa -0.22
13:06:58 progress field: 829/7158 (12%) battles, 616/h, ETA 10.3 h, 0 failed, skips 42.7/battle (last 100), rel -0.36, aa -0.25
13:37:14 progress field: 1175/7158 (16%) battles, 692/h, ETA 8.6 h, 0 failed, skips 43.0/battle (last 100), rel -0.63, aa -0.21
14:07:33 progress field: 1530/7158 (21%) battles, 706/h, ETA 8.0 h, 0 failed, skips 40.8/battle (last 100), rel -0.61, aa -0.08
14:37:53 progress field: 1855/7158 (26%) battles, 644/h, ETA 8.2 h, 0 failed, skips 50.0/battle (last 100), rel -0.55, aa -0.04
15:08:06 progress field: 2147/7158 (30%) battles, 582/h, ETA 8.6 h, 0 failed, skips 43.8/battle (last 100), rel -0.46, aa +0.06
15:38:31 progress field: 2474/7158 (35%) battles, 644/h, ETA 7.3 h, 0 failed, skips 40.3/battle (last 100), rel -0.43, aa +0.08
16:08:43 progress field: 2804/7158 (39%) battles, 658/h, ETA 6.6 h, 0 failed, skips 45.9/battle (last 100), rel -0.48, aa -0.01
16:39:03 progress field: 3100/7158 (43%) battles, 588/h, ETA 6.9 h, 0 failed, skips 41.4/battle (last 100), rel -0.49, aa -0.05
17:09:18 progress field: 3447/7158 (48%) battles, 690/h, ETA 5.4 h, 0 failed, skips 42.0/battle (last 100), rel -0.49, aa +0.02
17:39:41 progress field: 3786/7158 (53%) battles, 670/h, ETA 5.0 h, 0 failed, skips 40.5/battle (last 100), rel -0.49, aa +0.05
18:09:59 progress field: 4119/7158 (58%) battles, 666/h, ETA 4.6 h, 0 failed, skips 37.7/battle (last 100), rel -0.48, aa +0.08
```
