# Queue pc-locks: progress

Updated 2026-11-21 14:23:13 PC time (14:23 UTC), runner pid 79484.

- `prep` done, exit 0 in 4 min
- `livematch` done, exit 0 in 0 min
- `lock` done, exit 0 in 21 min
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

> warning: arm c's jar bisect/live/hadur117.Hadur_3.22.jar was built 140 h before this step started: check it is not stale

> warning: arm bb's jar opponents/kc.mega.BeepBoop_2.0.jar was built 127 h before this step started: check it is not stale

### lock

**1260 of 1260 battles** (100%), 0 failed. Running 21 min, 3598 battles/h, about 0 min left (ends ~14:23 PC time). Last battle 0 min ago.
Skipped turns a battle: 18.3 overall, first 100 20.4, last 100 19.6; engine disables 67.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 180 | 0 | 85.85 | - | - | - | 16.9 |
| aa | 180 | 0 | 85.75 | -0.00 (15 robots) | ±0.00 | -0.01 .. +0.01 | 17.8 |
| rbd | 180 | 0 | 85.94 | +0.00 (15 robots) | ±0.01 | -0.02 .. +0.02 | 17.5 |
| rp | 180 | 0 | 85.95 | +0.00 (15 robots) | ±0.01 | -0.01 .. +0.01 | 19.8 |
| vj | 180 | 0 | 85.55 | -0.00 (15 robots) | ±0.01 | -0.02 .. +0.01 | 18.2 |
| pm | 180 | 0 | 86.21 | +0.01 (15 robots) | ±0.02 | -0.02 .. +0.03 | 18.7 |
| bb | 180 | 0 | 82.91 | -0.04 (15 robots) | ±0.02 | -0.07 .. -0.00 | 18.8 |

APS = mean difference over the robots read x 15 panel robots / 1217 pairings.
A/A: aa - c -0.10 pts over 15 robots; 1% band ±0.87 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 1260 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 24` | halt | ok | 10.3 a battle over the last 24 (first 24: 30.2) |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
13:57:51 start prep
13:57:53 progress pushed to origin claude/pc-locks-progress (every 15 min)
14:01:56 prep exit=0 in 245 s
14:01:56 start livematch
14:01:56 watching livematch: 3 stop rule(s)
14:02:04 livematch exit=0 in 7 s
14:02:04 start lock
14:02:04 watching lock: 4 stop rule(s)
14:02:53 progress lock: 46/1260 (4%) battles, 3423/h, ETA 21 min, 0 failed, skips 24.3/battle (last 100), aa +0.01, rbd +0.05, rp +0.01, vj -0.00, pm +0.01, bb -0.02
14:23:05 lock exit=0 in 1260 s
14:23:05 start gate
14:23:06 gate exit=0 in 1 s
14:23:06 start pr
14:23:13 pr exit=0 in 6 s
14:23:13 ALLDONE
```
