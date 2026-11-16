# Queue pc-locks: progress

Updated 2026-11-16 19:50:19 PC time (19:50 UTC), runner pid 71748.

- `prep` done, exit 0 in 5 min
- `livematch` done, exit 0 in 0 min
- `lock` done, exit 0 in 7 min
- `gate` done, exit 0 in 0 min
- `pr` done, exit 0 in 0 min

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

> warning: arm c's jar bisect/live/hadur117.Hadur_3.22.jar was built 26 h before this step started: check it is not stale

> warning: arm bb's jar opponents/kc.mega.BeepBoop_2.0.jar was built 13 h before this step started: check it is not stale

### lock

**504 of 504 battles** (100%), 0 failed. Running 7 min, 4494 battles/h, about 0 min left (ends ~19:50 PC time). Last battle 0 min ago.
Skipped turns a battle: 13.5 overall, first 100 13.9, last 100 12.3; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 72 | 0 | 90.47 | - | - | - | 13.4 |
| aa | 72 | 0 | 90.43 | -0.00 (6 robots) | ±0.00 | -0.00 .. +0.00 | 13.5 |
| sb | 72 | 0 | 91.40 | +0.00 (6 robots) | ±0.00 | -0.00 .. +0.01 | 13.2 |
| dp | 72 | 0 | 90.88 | +0.00 (6 robots) | ±0.01 | -0.01 .. +0.01 | 13.5 |
| x0 | 72 | 0 | 91.33 | +0.00 (6 robots) | ±0.01 | -0.01 .. +0.01 | 13.6 |
| vj | 72 | 0 | 93.67 | +0.02 (6 robots) | ±0.03 | -0.03 .. +0.06 | 13.7 |
| hl | 72 | 0 | 91.16 | +0.00 (6 robots) | ±0.00 | -0.00 .. +0.01 | 13.6 |

APS = mean difference over the robots read x 6 panel robots / 1217 pairings.
A/A: aa - c -0.04 pts over 6 robots; 1% band ±1.38 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 504 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 24` | halt | ok | 9.6 a battle over the last 24 (first 24: 16.9) |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
19:38:43 start prep
19:38:45 progress pushed to origin claude/pc-locks-progress (every 15 min)
19:43:17 prep exit=0 in 274 s
19:43:17 start livematch
19:43:17 watching livematch: 3 stop rule(s)
19:43:26 livematch exit=0 in 9 s
19:43:26 start lock
19:43:26 watching lock: 4 stop rule(s)
19:43:45 progress lock: 9/504 (2%) battles, 1688/h, ETA 18 min, 0 failed, skips 17.1/battle (last 100)
19:50:10 lock exit=0 in 403 s
19:50:10 start gate
19:50:11 gate exit=0 in 0 s
19:50:11 start pr
19:50:19 pr exit=0 in 7 s
19:50:19 ALLDONE
```
