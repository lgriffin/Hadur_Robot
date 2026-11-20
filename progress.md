# Queue pc-rc-confirm: progress

Updated 2026-11-20 21:56:33 PC time (21:56 UTC), runner pid 48084.

- `prep` done, exit 0 in 2 min
- `livematch` done, exit 0 in 0 min
- `field` running
- `ret` pending
- `gate112` pending
- `gate` pending
- `pr` pending

### field

**6544 of 7158 battles** (91%), 0 failed, 521 read back from an earlier run. Running 9.3 h, 670 battles/h, about 55 min left (ends ~22:51 PC time). Last battle 1 min ago.
Skipped turns a battle: 43.6 overall, first 100 47.4, last 100 42.9; engine disables 2829.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| rel | 2181 | 0 | 93.28 | -0.49 (1186 robots) | ±0.15 | -0.71 .. -0.27 | 45.4 |
| c | 2181 | 0 | 93.75 | - | - | - | 45.3 |
| aa | 2182 | 0 | 93.80 | +0.05 (1186 robots) | ±0.15 | -0.18 .. +0.28 | 43.0 |

APS = mean difference over the robots read x 1193 panel robots / 1217 pairings.
A/A: aa - c +0.05 pts over 1186 robots; 1% band ±0.25 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 6544 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 90 over 200` | halt | ok | 43.9 a battle over the last 200 (first 200: 42.8) |
| `stall 30m` | halt | ok | last battle 1 min ago |
| `aa after 20%` | halt | ok | aa - c +0.05 pts over 1186 robots, stop band ±0.29 |

Stopping now would leave 614 battles unrun (about 55 min); every battle already fought is kept and a rerun resumes from it.

> warning: arm rel's jar bisect/rel/hadur117.Hadur_3.23.jar was built 13 h before this step started: check it is not stale

> warning: arm aa's jar bisect/hadur117.Hadur_3.23bb.jar was built 13 h before this step started: check it is not stale

### Queue log (last lines)

```
14:37:53 progress field: 1855/7158 (26%) battles, 644/h, ETA 8.2 h, 0 failed, skips 50.0/battle (last 100), rel -0.55, aa -0.04
15:08:06 progress field: 2147/7158 (30%) battles, 582/h, ETA 8.6 h, 0 failed, skips 43.8/battle (last 100), rel -0.46, aa +0.06
15:38:31 progress field: 2474/7158 (35%) battles, 644/h, ETA 7.3 h, 0 failed, skips 40.3/battle (last 100), rel -0.43, aa +0.08
16:08:43 progress field: 2804/7158 (39%) battles, 658/h, ETA 6.6 h, 0 failed, skips 45.9/battle (last 100), rel -0.48, aa -0.01
16:39:03 progress field: 3100/7158 (43%) battles, 588/h, ETA 6.9 h, 0 failed, skips 41.4/battle (last 100), rel -0.49, aa -0.05
17:09:18 progress field: 3447/7158 (48%) battles, 690/h, ETA 5.4 h, 0 failed, skips 42.0/battle (last 100), rel -0.49, aa +0.02
17:39:41 progress field: 3786/7158 (53%) battles, 670/h, ETA 5.0 h, 0 failed, skips 40.5/battle (last 100), rel -0.49, aa +0.05
18:09:59 progress field: 4119/7158 (58%) battles, 666/h, ETA 4.6 h, 0 failed, skips 37.7/battle (last 100), rel -0.48, aa +0.08
18:40:09 progress field: 4438/7158 (62%) battles, 638/h, ETA 4.3 h, 0 failed, skips 37.2/battle (last 100), rel -0.45, aa +0.03
19:10:35 progress field: 4776/7158 (67%) battles, 676/h, ETA 3.5 h, 0 failed, skips 44.0/battle (last 100), rel -0.45, aa -0.01
19:40:38 progress field: 5083/7158 (71%) battles, 612/h, ETA 3.4 h, 0 failed, skips 42.2/battle (last 100), rel -0.45, aa +0.01
20:10:49 progress field: 5404/7158 (75%) battles, 640/h, ETA 2.7 h, 0 failed, skips 36.9/battle (last 100), rel -0.47, aa +0.03
20:41:01 progress field: 5721/7158 (80%) battles, 628/h, ETA 2.3 h, 0 failed, skips 36.8/battle (last 100), rel -0.48, aa +0.01
21:11:21 progress field: 6036/7158 (84%) battles, 624/h, ETA 1.8 h, 0 failed, skips 50.3/battle (last 100), rel -0.51, aa +0.01
21:41:27 progress field: 6372/7158 (89%) battles, 672/h, ETA 1.2 h, 0 failed, skips 48.1/battle (last 100), rel -0.47, aa +0.03
```
