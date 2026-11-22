# Queue pc-locks: progress

Updated 2026-11-22 09:23:55 PC time (09:23 UTC), runner pid 86484.

- `prep` done, exit 0 in 3 min
- `livematch` done, exit 0 in 0 min
- `lock` done, exit 0 in 14 min
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

> warning: arm c's jar bisect/live/hadur117.Hadur_3.22.jar was built 159 h before this step started: check it is not stale

> warning: arm bb's jar opponents/kc.mega.BeepBoop_2.0.jar was built 146 h before this step started: check it is not stale

### lock

**1584 of 1584 battles** (100%), 0 failed. Running 14 min, 6573 battles/h, about 0 min left (ends ~09:23 PC time). Last battle 0 min ago.
Skipped turns a battle: 14.4 overall, first 100 15.1, last 100 13.5; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 264 | 0 | 89.20 | - | - | - | 14.4 |
| aa | 264 | 0 | 89.27 | +0.00 (22 robots) | ±0.01 | -0.01 .. +0.01 | 14.4 |
| rf | 264 | 0 | 89.27 | +0.00 (22 robots) | ±0.00 | -0.01 .. +0.01 | 14.3 |
| qw | 264 | 0 | 89.55 | +0.01 (22 robots) | ±0.01 | -0.00 .. +0.01 | 14.5 |
| pm | 264 | 0 | 89.69 | +0.01 (22 robots) | ±0.01 | -0.01 .. +0.03 | 14.7 |
| pmx | 264 | 0 | 89.48 | +0.00 (22 robots) | ±0.01 | -0.01 .. +0.02 | 14.4 |

APS = mean difference over the robots read x 22 panel robots / 1217 pairings.
A/A: aa - c +0.07 pts over 22 robots; 1% band ±0.72 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 1584 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 24` | halt | ok | 10.7 a battle over the last 24 (first 24: 18.4) |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
09:05:46 start prep
09:05:48 progress pushed to origin claude/pc-locks-progress (every 15 min)
09:09:12 prep exit=0 in 206 s
09:09:12 start livematch
09:09:12 watching livematch: 3 stop rule(s)
09:09:20 livematch exit=0 in 7 s
09:09:20 start lock
09:09:20 watching lock: 4 stop rule(s)
09:09:47 progress lock: 33/1584 (2%) battles, 4360/h, ETA 21 min, 0 failed, skips 17.5/battle (last 100), aa -0.05, rf -0.10, qw -0.03, pmx -0.06
09:23:48 lock exit=0 in 867 s
09:23:48 start gate
09:23:49 gate exit=0 in 0 s
09:23:49 start pr
09:23:55 pr exit=0 in 6 s
09:23:55 ALLDONE
```
