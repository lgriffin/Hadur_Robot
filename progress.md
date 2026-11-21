# Queue pc-locks: progress

Updated 2026-11-21 11:24:29 PC time (11:24 UTC), runner pid 45592.

- `prep` done, exit 0 in 2 min
- `livematch` done, exit 0 in 0 min
- `lock` done, exit 0 in 6 min
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

> warning: arm c's jar bisect/live/hadur117.Hadur_3.22.jar was built 138 h before this step started: check it is not stale

> warning: arm bb's jar opponents/kc.mega.BeepBoop_2.0.jar was built 125 h before this step started: check it is not stale

### lock

**240 of 240 battles** (100%), 0 failed. Running 6 min, 2328 battles/h, about 0 min left (ends ~11:24 PC time). Last battle 0 min ago.
Skipped turns a battle: 14.7 overall, first 100 17.9, last 100 11.7; engine disables 2.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 60 | 0 | 72.67 | - | - | - | 13.9 |
| aa | 60 | 0 | 70.93 | -0.01 (5 robots) | ±0.02 | -0.03 .. +0.02 | 15.3 |
| rbd | 60 | 0 | 72.79 | +0.00 (5 robots) | ±0.00 | -0.00 .. +0.01 | 15.1 |
| rp | 60 | 0 | 71.34 | -0.00 (5 robots) | ±0.00 | -0.01 .. +0.00 | 14.6 |

APS = mean difference over the robots read x 5 panel robots / 1217 pairings.
A/A: aa - c -1.74 pts over 5 robots; 1% band ±1.51 (OUTSIDE: comparisons void).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 240 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 24` | halt | ok | 9.5 a battle over the last 24 (first 24: 19.6) |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
11:15:56 start prep
11:15:59 progress pushed to origin claude/pc-locks-progress (every 15 min)
11:18:04 prep exit=0 in 127 s
11:18:04 start livematch
11:18:04 watching livematch: 3 stop rule(s)
11:18:12 livematch exit=0 in 7 s
11:18:12 start lock
11:18:12 watching lock: 4 stop rule(s)
11:18:58 progress lock: 49/240 (20%) battles, 3800/h, ETA 3 min, 0 failed, skips 18.4/battle (last 100), aa +0.01, rbd +0.00, rp -0.00
11:24:23 lock exit=0 in 371 s
11:24:23 start gate
11:24:24 gate exit=0 in 0 s
11:24:24 start pr
11:24:29 pr exit=0 in 5 s
11:24:29 ALLDONE
```
