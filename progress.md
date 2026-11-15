# Queue pc-gl-lines: progress

Updated 2026-11-15 17:56:46 PC time (17:56 UTC), runner pid 48840.

- `prep` done, exit 0 in 2 min
- `livematch` done, exit 0 in 0 min
- `lock` done, exit 0 in 1 min
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

> warning: arm bb's jar opponents/kc.mega.BeepBoop_2.0.jar was built 964 h before this step started: check it is not stale

### lock

**36 of 36 battles** (100%), 0 failed. Running 1 min, 2323 battles/h, about 0 min left (ends ~17:56 PC time). Last battle 0 min ago.
Skipped turns a battle: 12.7 overall, first 36 12.7, last 36 12.7; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 12 | 0 | 69.56 | - | - | - | 12.9 |
| aa | 12 | 0 | 69.24 | -0.00 (1 robots) | - | - | 12.8 |
| gl | 12 | 0 | 73.91 | +0.00 (1 robots) | - | - | 12.5 |

APS = mean difference over the robots read x 1 panel robots / 1217 pairings.
A/A: aa - c -0.32 pts over 1 robots; 1% band ±3.37 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 36 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 24` | halt | ok | 12.4 a battle over the last 24 (first 24: 13.3) |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
17:54:05 start prep
17:54:07 progress pushed to origin claude/pc-gl-lines-progress (every 15 min)
17:55:37 prep exit=0 in 91 s
17:55:37 start livematch
17:55:37 watching livematch: 3 stop rule(s)
17:55:44 livematch exit=0 in 7 s
17:55:44 start lock
17:55:44 watching lock: 4 stop rule(s)
17:56:06 progress lock: 12/36 (33%) battles, 1952/h, ETA 1 min, 0 failed, skips 13.3/battle (last 100), aa -0.00, gl +0.00
17:56:40 lock exit=0 in 55 s
17:56:40 start gate
17:56:40 gate exit=0 in 0 s
17:56:40 start pr
17:56:46 pr exit=0 in 5 s
17:56:46 ALLDONE
```
