# Queue pc-locks: progress

Updated 2026-11-23 19:28:50 PC time (19:28 UTC), runner pid 72024.

- `prep` done, exit 0 in 3 min
- `livematch` done, exit 0 in 0 min
- `lock` done, exit 0 in 11 min
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

> warning: arm c's jar bisect/live/hadur117.Hadur_3.22.jar was built 194 h before this step started: check it is not stale

> warning: arm bb's jar opponents/kc.mega.BeepBoop_2.0.jar was built 181 h before this step started: check it is not stale

### lock

**1080 of 1080 battles** (100%), 0 failed. Running 11 min, 6053 battles/h, about 0 min left (ends ~19:28 PC time). Last battle 0 min ago.
Skipped turns a battle: 14.3 overall, first 100 15.7, last 100 13.3; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 216 | 0 | 91.05 | - | - | - | 14.3 |
| aa | 216 | 0 | 91.06 | +0.00 (18 robots) | ±0.00 | -0.01 .. +0.01 | 14.2 |
| hf | 216 | 0 | 91.05 | -0.00 (18 robots) | ±0.01 | -0.01 .. +0.01 | 13.9 |
| rp | 216 | 0 | 91.08 | +0.00 (18 robots) | ±0.01 | -0.01 .. +0.01 | 14.4 |
| mv | 216 | 0 | 91.33 | +0.00 (18 robots) | ±0.01 | -0.01 .. +0.02 | 14.4 |

APS = mean difference over the robots read x 18 panel robots / 1217 pairings.
A/A: aa - c +0.01 pts over 18 robots; 1% band ±0.79 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 1080 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 24` | halt | ok | 9.5 a battle over the last 24 (first 24: 18.4) |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
19:15:02 start prep
19:15:05 progress pushed to origin claude/pc-locks-progress (every 15 min)
19:17:51 prep exit=0 in 169 s
19:17:51 start livematch
19:17:51 watching livematch: 3 stop rule(s)
19:17:59 livematch exit=0 in 8 s
19:17:59 start lock
19:17:59 watching lock: 4 stop rule(s)
19:18:02 progress lock: 0/1080 (0%) battles, 0 failed
19:28:42 lock exit=0 in 642 s
19:28:42 start gate
19:28:43 gate exit=0 in 0 s
19:28:43 start pr
19:28:50 pr exit=0 in 7 s
19:28:50 ALLDONE
```
