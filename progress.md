# Queue pc-locks: progress

Updated 2026-11-23 08:02:31 PC time (08:02 UTC), runner pid 59424.

- `prep` done, exit 0 in 3 min
- `livematch` done, exit 0 in 0 min
- `lock` done, exit 0 in 12 min
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

> warning: arm c's jar bisect/live/hadur117.Hadur_3.22.jar was built 182 h before this step started: check it is not stale

> warning: arm bb's jar opponents/kc.mega.BeepBoop_2.0.jar was built 169 h before this step started: check it is not stale

### lock

**1560 of 1560 battles** (100%), 0 failed. Running 12 min, 8134 battles/h, about 0 min left (ends ~08:02 PC time). Last battle 0 min ago.
Skipped turns a battle: 14.6 overall, first 100 15.3, last 100 13.4; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 312 | 0 | 88.23 | - | - | - | 14.7 |
| aa | 312 | 0 | 88.23 | +0.00 (26 robots) | ±0.01 | -0.01 .. +0.01 | 14.6 |
| rkn | 312 | 0 | 89.07 | +0.02 (26 robots) | ±0.01 | +0.00 .. +0.03 | 14.5 |
| rlnrkn | 312 | 0 | 89.75 | +0.03 (26 robots) | ±0.01 | +0.01 .. +0.05 | 14.6 |
| rln | 312 | 0 | 88.31 | +0.00 (26 robots) | ±0.01 | -0.01 .. +0.01 | 14.6 |

APS = mean difference over the robots read x 26 panel robots / 1217 pairings.
A/A: aa - c +0.00 pts over 26 robots; 1% band ±0.66 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 1560 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 24` | halt | ok | 11.7 a battle over the last 24 (first 24: 19.5) |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
07:47:51 start prep
07:47:54 progress pushed to origin claude/pc-locks-progress (every 15 min)
07:50:44 prep exit=0 in 172 s
07:50:44 start livematch
07:50:44 watching livematch: 3 stop rule(s)
07:50:52 livematch exit=0 in 8 s
07:50:52 start lock
07:50:52 watching lock: 4 stop rule(s)
07:51:54 progress lock: 119/1560 (8%) battles, 7084/h, ETA 12 min, 0 failed, skips 14.2/battle (last 100), aa +0.01, rkn +0.02, rlnrkn +0.05, rln +0.01
08:02:23 lock exit=0 in 690 s
08:02:23 start gate
08:02:24 gate exit=0 in 1 s
08:02:24 start pr
08:02:31 pr exit=0 in 6 s
08:02:31 ALLDONE
```
