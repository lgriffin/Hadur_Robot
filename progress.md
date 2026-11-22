# Queue pc-rc-confirm: progress

Updated 2026-11-22 00:21:09 PC time (00:21 UTC), runner pid 83088.

- `prep` done, exit 0 in 1 min
- `livematch` done, exit 0 in 0 min
- `field` running
- `ret` pending
- `gate112` pending
- `gate` pending
- `pr` pending

### livematch

**124 of 124 battles** (100%), 0 failed, 124 read back from an earlier run. Running 0 min. Last battle 0 min ago.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 62 | 0 | 69.94 | - | - | - | 9.8 |
| bb | 62 | 0 | 84.62 | +0.37 (31 robots) | ±0.07 | +0.27 .. +0.48 | 0.3 |

APS = mean difference over the robots read x 31 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 124 |
| `dead 8` | halt | ok | every arm scoring |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun; every battle already fought is kept and a rerun resumes from it.

> warning: arm c's jar bisect/live/hadur117.Hadur_3.22.jar was built 147 h before this step started: check it is not stale

> warning: arm bb's jar opponents/kc.mega.BeepBoop_2.0.jar was built 134 h before this step started: check it is not stale

### field

**4687 of 7248 battles** (65%), 0 failed. Running 4.0 h, 1002 battles/h, about 2.6 h left (ends ~02:54 PC time). Last battle 0 min ago.
Skipped turns a battle: 33.4 overall, first 100 35.1, last 100 29.8; engine disables 1404.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| rel | 1562 | 0 | 93.28 | -0.55 (1062 robots) | ±0.18 | -0.82 .. -0.27 | 33.0 |
| c | 1561 | 0 | 93.90 | - | - | - | 33.4 |
| aa | 1564 | 0 | 93.74 | -0.16 (1062 robots) | ±0.20 | -0.46 .. +0.14 | 33.7 |

APS = mean difference over the robots read x 1208 panel robots / 1217 pairings.
A/A: aa - c -0.17 pts over 1062 robots; 1% band ±0.30 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 4687 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 90 over 200` | halt | ok | 34.4 a battle over the last 200 (first 200: 34.9) |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `aa after 20%` | halt | ok | aa - c -0.17 pts over 1062 robots, stop band ±0.34 |

Stopping now would leave 2561 battles unrun (about 2.6 h); every battle already fought is kept and a rerun resumes from it.

> warning: arm rel's jar bisect/rel/hadur117.Hadur_3.23.jar was built 45 h before this step started: check it is not stale

### Queue log (last lines)

```
20:18:40 progress pushed to origin claude/pc-rc-confirm-progress (every 15 min)
20:20:06 prep exit=0 in 88 s
20:20:06 start livematch
20:20:06 watching livematch: 3 stop rule(s)
20:20:13 livematch exit=0 in 7 s
20:20:13 start field
20:20:13 watching field: 5 stop rule(s)
20:20:38 progress field: 0/7248 (0%) battles, 0 failed
20:50:55 progress field: 644/7248 (9%) battles, 1288/h, ETA 5.1 h, 0 failed, skips 30.9/battle (last 100), rel -0.63, aa +0.08
21:21:16 progress field: 1288/7248 (18%) battles, 1268/h, ETA 4.7 h, 0 failed, skips 28.8/battle (last 100), rel -0.47, aa -0.13
21:51:32 progress field: 1914/7248 (26%) battles, 1246/h, ETA 4.3 h, 0 failed, skips 38.9/battle (last 100), rel -0.49, aa -0.18
22:21:53 progress field: 2526/7248 (35%) battles, 1198/h, ETA 3.9 h, 0 failed, skips 33.2/battle (last 100), rel -0.55, aa -0.17
22:52:14 progress field: 3084/7248 (43%) battles, 1094/h, ETA 3.8 h, 0 failed, skips 33.2/battle (last 100), rel -0.54, aa -0.24
23:22:35 progress field: 3668/7248 (51%) battles, 1164/h, ETA 3.1 h, 0 failed, skips 27.2/battle (last 100), rel -0.50, aa -0.11
23:52:53 progress field: 4226/7248 (58%) battles, 1098/h, ETA 2.8 h, 0 failed, skips 31.2/battle (last 100), rel -0.54, aa -0.17
```
