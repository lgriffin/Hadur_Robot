# Queue pc-locks: progress

Updated 2026-11-22 17:52:38 PC time (17:52 UTC), runner pid 24320.

- `prep` done, exit 0 in 2 min
- `livematch` done, exit 0 in 0 min
- `lock` done, exit 0 in 9 min
- `gate` done, exit 0 in 0 min
- `pr` done, exit 0 in 0 min

### livematch

**124 of 124 battles** (100%), 0 failed, 124 read back from an earlier run. Running 0 min. Last battle 0 min ago.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 62 | 0 | 70.75 | - | - | - | 10.2 |
| bb | 62 | 0 | 84.03 | +0.34 (31 robots) | ±0.06 | +0.24 .. +0.44 | 1.1 |

APS = mean difference over the robots read x 31 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 124 |
| `dead 8` | halt | ok | every arm scoring |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun; every battle already fought is kept and a rerun resumes from it.

> warning: arm c's jar bisect/live/hadur117.Hadur_3.22.jar was built 168 h before this step started: check it is not stale

> warning: arm bb's jar opponents/kc.mega.BeepBoop_2.0.jar was built 155 h before this step started: check it is not stale

### lock

**612 of 612 battles** (100%), 0 failed. Running 9 min, 4172 battles/h, about 0 min left (ends ~17:52 PC time). Last battle 0 min ago.
Skipped turns a battle: 14.1 overall, first 100 14.7, last 100 13.4; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 204 | 0 | 89.83 | - | - | - | 14.3 |
| aa | 204 | 0 | 89.61 | -0.00 (17 robots) | ±0.01 | -0.02 .. +0.01 | 13.9 |
| qw | 204 | 0 | 90.03 | +0.00 (17 robots) | ±0.00 | -0.00 .. +0.01 | 13.9 |

APS = mean difference over the robots read x 17 panel robots / 1217 pairings.
A/A: aa - c -0.21 pts over 17 robots; 1% band ±0.82 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 612 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 24` | halt | ok | 11.4 a battle over the last 24 (first 24: 18.0) |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
17:41:56 start prep
17:41:58 progress pushed to origin claude/pc-locks-progress (every 15 min)
17:43:34 prep exit=0 in 98 s
17:43:34 start livematch
17:43:34 watching livematch: 3 stop rule(s)
17:43:43 livematch exit=0 in 8 s
17:43:43 start lock
17:43:43 watching lock: 4 stop rule(s)
17:43:57 progress lock: 9/612 (1%) battles, 2296/h, ETA 16 min, 0 failed, skips 19.4/battle (last 100)
17:52:31 lock exit=0 in 528 s
17:52:31 start gate
17:52:32 gate exit=0 in 0 s
17:52:32 start pr
17:52:38 pr exit=0 in 6 s
17:52:38 ALLDONE
```
