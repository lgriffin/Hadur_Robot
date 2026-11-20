# Queue pc-rc-confirm: progress

Updated 2026-11-20 23:09:49 PC time (23:09 UTC), runner pid 48084.

- `prep` done, exit 0 in 2 min
- `livematch` done, exit 0 in 0 min
- `field` done, exit 0 in 10.4 h
- `ret` done, exit 0 in 11 min
- `gate112` done, exit 0 in 0 min
- `gate` done, exit 0 in 0 min
- `pr` done, exit 0 in 0 min

### field

**7152 of 7158 battles** (100%), 0 failed, 521 read back from an earlier run. Running 10.4 h, 554 battles/h, about 1 min left (ends ~22:59 PC time). Last battle 1 min ago.
Skipped turns a battle: 44.8 overall, first 100 47.4, last 100 63.0; engine disables 3220.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| rel | 2384 | 0 | 93.29 | -0.47 (1192 robots) | ±0.14 | -0.68 .. -0.26 | 46.2 |
| c | 2384 | 0 | 93.75 | - | - | - | 46.1 |
| aa | 2384 | 0 | 93.78 | +0.03 (1192 robots) | ±0.14 | -0.19 .. +0.24 | 44.4 |

APS = mean difference over the robots read x 1193 panel robots / 1217 pairings.
A/A: aa - c +0.03 pts over 1192 robots; 1% band ±0.24 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 7152 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 90 over 200` | halt | ok | 65.0 a battle over the last 200 (first 200: 42.8) |
| `stall 30m` | halt | ok | last battle 1 min ago |
| `aa after 20%` | halt | ok | aa - c +0.03 pts over 1192 robots, stop band ±0.28 |

Stopping now would leave 6 battles unrun (about 1 min); every battle already fought is kept and a rerun resumes from it.

> warning: arm rel's jar bisect/rel/hadur117.Hadur_3.23.jar was built 13 h before this step started: check it is not stale

> warning: arm aa's jar bisect/hadur117.Hadur_3.23bb.jar was built 13 h before this step started: check it is not stale

### ret

**288 of 18 battles** (1600%), 0 failed. Running 11 min, 1625 battles/h, about -10 min left (ends ~22:59 PC time). Last battle 0 min ago.
Skipped turns a battle: 13.8 overall, first 100 15.9, last 100 12.2; engine disables 8.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| rel | 96 | 0 | 78.97 | -0.00 (16 robots) | ±0.00 | -0.00 .. +0.00 | 13.3 |
| c | 96 | 0 | 80.71 | - | - | - | 14.4 |
| aa | 96 | 0 | 80.72 | +0.00 (16 robots) | ±0.00 | -0.00 .. +0.00 | 13.8 |

APS = mean difference over the robots read x 1 panel robots / 1217 pairings.
A/A: aa - c +0.01 pts over 16 robots; 1% band ±1.19 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 288 |
| `dead 8` | halt | ok | every arm scoring |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave -270 battles unrun (about -10 min); every battle already fought is kept and a rerun resumes from it.

> warning: arm rel's jar bisect/rel/hadur117.Hadur_3.23.jar was built 24 h before this step started: check it is not stale

> warning: arm c's jar bisect/hadur117.Hadur_3.23aa.jar was built 15 h before this step started: check it is not stale

> warning: arm aa's jar bisect/hadur117.Hadur_3.23bb.jar was built 23 h before this step started: check it is not stale

### Queue log (last lines)

```
21:11:21 progress field: 6036/7158 (84%) battles, 624/h, ETA 1.8 h, 0 failed, skips 50.3/battle (last 100), rel -0.51, aa +0.01
21:41:27 progress field: 6372/7158 (89%) battles, 672/h, ETA 1.2 h, 0 failed, skips 48.1/battle (last 100), rel -0.47, aa +0.03
22:11:40 progress field: 6711/7158 (94%) battles, 668/h, ETA 40 min, 0 failed, skips 43.9/battle (last 100), rel -0.49, aa +0.06
22:41:55 progress field: 6994/7158 (98%) battles, 558/h, ETA 18 min, 0 failed, skips 63.8/battle (last 100), rel -0.47, aa +0.03
22:59:00 field exit=0 in 37401 s
22:59:00 start ret
22:59:00 watching ret: 3 stop rule(s)
23:09:38 ret exit=0 in 637 s
23:09:38 start gate112
23:09:41 gate112 exit=0 in 3 s
23:09:41 start gate
23:09:42 gate exit=0 in 1 s
23:09:42 start pr
23:09:49 pr exit=0 in 7 s
23:09:49 ALLDONE
```
