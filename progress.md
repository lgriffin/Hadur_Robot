# Queue pc-locks: progress

Updated 2026-11-18 06:49:58 PC time (06:49 UTC), runner pid 90284.

- `prep` done, exit 0 in 3 min
- `livematch` done, exit 0 in 0 min
- `lock` done, exit 0 in 5 min
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

> warning: arm c's jar bisect/live/hadur117.Hadur_3.22.jar was built 61 h before this step started: check it is not stale

> warning: arm bb's jar opponents/kc.mega.BeepBoop_2.0.jar was built 48 h before this step started: check it is not stale

### lock

**600 of 600 battles** (100%), 0 failed. Running 5 min, 6854 battles/h, about 0 min left (ends ~06:49 PC time). Last battle 0 min ago.
Skipped turns a battle: 14.3 overall, first 100 15.3, last 100 13.2; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 120 | 0 | 92.30 | - | - | - | 14.4 |
| aa | 120 | 0 | 92.51 | +0.00 (10 robots) | ±0.00 | -0.00 .. +0.00 | 14.2 |
| rf | 120 | 0 | 93.95 | +0.01 (10 robots) | ±0.01 | +0.00 .. +0.02 | 14.4 |
| sp2 | 120 | 0 | 92.92 | +0.00 (10 robots) | ±0.01 | -0.00 .. +0.01 | 14.4 |
| mt | 120 | 0 | 94.08 | +0.01 (10 robots) | ±0.03 | -0.03 .. +0.05 | 14.4 |

APS = mean difference over the robots read x 10 panel robots / 1217 pairings.
A/A: aa - c +0.21 pts over 10 robots; 1% band ±1.07 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 600 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 24` | halt | ok | 10.8 a battle over the last 24 (first 24: 16.6) |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
06:41:18 start prep
06:41:20 progress pushed to origin claude/pc-locks-progress (every 15 min)
06:44:25 prep exit=0 in 187 s
06:44:25 start livematch
06:44:25 watching livematch: 3 stop rule(s)
06:44:34 livematch exit=0 in 8 s
06:44:34 start lock
06:44:34 watching lock: 4 stop rule(s)
06:45:20 progress lock: 80/600 (13%) battles, 6344/h, ETA 5 min, 0 failed, skips 15.4/battle (last 100), aa +0.01, rf +0.00, sp2 +0.00, mt -0.00
06:49:49 lock exit=0 in 315 s
06:49:49 start gate
06:49:50 gate exit=0 in 0 s
06:49:50 start pr
06:49:58 pr exit=0 in 7 s
06:49:58 ALLDONE
```
