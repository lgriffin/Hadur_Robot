# Queue pc-locks: progress

Updated 2026-11-22 14:24:08 PC time (14:24 UTC), runner pid 56588.

- `prep` done, exit 0 in 2 min
- `livematch` done, exit 0 in 0 min
- `lock` done, exit 0 in 5 min
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

> warning: arm c's jar bisect/live/hadur117.Hadur_3.22.jar was built 165 h before this step started: check it is not stale

> warning: arm bb's jar opponents/kc.mega.BeepBoop_2.0.jar was built 152 h before this step started: check it is not stale

### lock

**576 of 576 battles** (100%), 0 failed. Running 5 min, 6514 battles/h, about 0 min left (ends ~14:24 PC time). Last battle 0 min ago.
Skipped turns a battle: 14.8 overall, first 100 16.6, last 100 13.5; engine disables 1.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 192 | 0 | 88.77 | - | - | - | 14.6 |
| aa | 192 | 0 | 89.14 | +0.00 (16 robots) | ±0.01 | -0.00 .. +0.01 | 15.0 |
| x0 | 192 | 0 | 89.67 | +0.01 (16 robots) | ±0.01 | -0.01 .. +0.03 | 14.7 |

APS = mean difference over the robots read x 16 panel robots / 1217 pairings.
A/A: aa - c +0.38 pts over 16 robots; 1% band ±0.84 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 576 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 24` | halt | ok | 12.0 a battle over the last 24 (first 24: 20.9) |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
14:16:50 start prep
14:16:53 progress pushed to origin claude/pc-locks-progress (every 15 min)
14:18:34 prep exit=0 in 103 s
14:18:34 start livematch
14:18:34 watching livematch: 3 stop rule(s)
14:18:43 livematch exit=0 in 8 s
14:18:43 start lock
14:18:43 watching lock: 4 stop rule(s)
14:18:51 progress lock: 0/576 (0%) battles, 0 failed
14:24:01 lock exit=0 in 318 s
14:24:01 start gate
14:24:02 gate exit=0 in 0 s
14:24:02 start pr
14:24:08 pr exit=0 in 6 s
14:24:08 ALLDONE
```
