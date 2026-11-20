# Queue pc-locks: progress

Updated 2026-11-20 07:59:52 PC time (07:59 UTC), runner pid 83332.

- `prep` done, exit 0 in 2 min
- `livematch` done, exit 0 in 0 min
- `lock` done, exit 0 in 9 min
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

> warning: arm c's jar bisect/live/hadur117.Hadur_3.22.jar was built 110 h before this step started: check it is not stale

> warning: arm bb's jar opponents/kc.mega.BeepBoop_2.0.jar was built 97 h before this step started: check it is not stale

### lock

**1008 of 1008 battles** (100%), 0 failed. Running 9 min, 6711 battles/h, about 0 min left (ends ~07:59 PC time). Last battle 0 min ago.
Skipped turns a battle: 15.3 overall, first 100 15.9, last 100 14.3; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 252 | 0 | 97.30 | - | - | - | 15.3 |
| aa | 252 | 0 | 97.28 | -0.00 (21 robots) | ±0.01 | -0.01 .. +0.01 | 15.3 |
| rf | 252 | 0 | 98.07 | +0.01 (21 robots) | ±0.01 | +0.00 .. +0.02 | 15.3 |
| mt | 252 | 0 | 97.19 | -0.00 (21 robots) | ±0.01 | -0.01 .. +0.01 | 15.3 |

APS = mean difference over the robots read x 21 panel robots / 1217 pairings.
A/A: aa - c -0.02 pts over 21 robots; 1% band ±0.74 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 1008 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 24` | halt | ok | 11.5 a battle over the last 24 (first 24: 18.4) |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
07:48:16 start prep
07:48:18 progress pushed to origin claude/pc-locks-progress (every 15 min)
07:50:36 prep exit=0 in 140 s
07:50:36 start livematch
07:50:36 watching livematch: 3 stop rule(s)
07:50:44 livematch exit=0 in 7 s
07:50:44 start lock
07:50:44 watching lock: 4 stop rule(s)
07:51:18 progress lock: 50/1008 (5%) battles, 5421/h, ETA 11 min, 0 failed, skips 16.5/battle (last 100), aa +0.02, rf +0.02, mt -0.00
07:59:45 lock exit=0 in 540 s
07:59:45 start gate
07:59:46 gate exit=0 in 0 s
07:59:46 start pr
07:59:52 pr exit=0 in 6 s
07:59:52 ALLDONE
```
