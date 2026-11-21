# Queue pc-locks: progress

Updated 2026-11-21 07:53:09 PC time (07:53 UTC), runner pid 66900.

- `prep` done, exit 0 in 2 min
- `livematch` done, exit 0 in 0 min
- `lock` done, exit 0 in 4 min
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

> warning: arm c's jar bisect/live/hadur117.Hadur_3.22.jar was built 134 h before this step started: check it is not stale

> warning: arm bb's jar opponents/kc.mega.BeepBoop_2.0.jar was built 121 h before this step started: check it is not stale

### lock

**576 of 576 battles** (100%), 0 failed. Running 4 min, 8410 battles/h, about 0 min left (ends ~07:53 PC time). Last battle 0 min ago.
Skipped turns a battle: 14.6 overall, first 100 14.9, last 100 14.3; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 144 | 0 | 79.46 | - | - | - | 14.5 |
| aa | 144 | 0 | 79.31 | -0.00 (12 robots) | ±0.00 | -0.01 .. +0.01 | 14.6 |
| rbd | 144 | 0 | 80.73 | +0.01 (12 robots) | ±0.01 | +0.00 .. +0.03 | 14.6 |
| rf | 144 | 0 | 79.44 | +0.00 (12 robots) | ±0.00 | -0.00 .. +0.01 | 14.6 |

APS = mean difference over the robots read x 12 panel robots / 1217 pairings.
A/A: aa - c -0.15 pts over 12 robots; 1% band ±0.97 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 576 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 24` | halt | ok | 13.1 a battle over the last 24 (first 24: 17.8) |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
07:46:29 start prep
07:46:32 progress pushed to origin claude/pc-locks-progress (every 15 min)
07:48:46 prep exit=0 in 136 s
07:48:46 start livematch
07:48:46 watching livematch: 3 stop rule(s)
07:48:55 livematch exit=0 in 8 s
07:48:55 start lock
07:48:55 watching lock: 4 stop rule(s)
07:49:31 progress lock: 66/576 (11%) battles, 6551/h, ETA 5 min, 0 failed, skips 15.7/battle (last 100), aa -0.01, rbd +0.01, rf -0.01
07:53:01 lock exit=0 in 246 s
07:53:01 start gate
07:53:02 gate exit=0 in 1 s
07:53:02 start pr
07:53:09 pr exit=0 in 6 s
07:53:09 ALLDONE
```
