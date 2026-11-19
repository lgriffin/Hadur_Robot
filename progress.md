# Queue pc-locks: progress

Updated 2026-11-19 20:48:45 PC time (20:48 UTC), runner pid 59688.

- `prep` done, exit 0 in 2 min
- `livematch` done, exit 0 in 0 min
- `lock` done, exit 0 in 3 min
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

> warning: arm c's jar bisect/live/hadur117.Hadur_3.22.jar was built 99 h before this step started: check it is not stale

> warning: arm bb's jar opponents/kc.mega.BeepBoop_2.0.jar was built 86 h before this step started: check it is not stale

### lock

**336 of 336 battles** (100%), 0 failed. Running 3 min, 6214 battles/h, about 0 min left (ends ~20:48 PC time). Last battle 0 min ago.
Skipped turns a battle: 16.6 overall, first 100 17.0, last 100 15.2; engine disables 7.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 84 | 0 | 96.35 | - | - | - | 17.6 |
| aa | 84 | 0 | 96.22 | -0.00 (7 robots) | ±0.00 | -0.00 .. +0.00 | 16.7 |
| rwl | 84 | 0 | 96.57 | +0.00 (7 robots) | ±0.00 | -0.00 .. +0.01 | 16.0 |
| rf | 84 | 0 | 97.25 | +0.01 (7 robots) | ±0.00 | +0.00 .. +0.01 | 16.2 |

APS = mean difference over the robots read x 7 panel robots / 1217 pairings.
A/A: aa - c -0.13 pts over 7 robots; 1% band ±1.27 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 336 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 24` | halt | ok | 11.4 a battle over the last 24 (first 24: 17.5) |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
20:42:46 start prep
20:42:49 progress pushed to origin claude/pc-locks-progress (every 15 min)
20:45:14 prep exit=0 in 147 s
20:45:14 start livematch
20:45:14 watching livematch: 3 stop rule(s)
20:45:23 livematch exit=0 in 8 s
20:45:23 start lock
20:45:23 watching lock: 4 stop rule(s)
20:45:48 progress lock: 32/336 (10%) battles, 4571/h, ETA 4 min, 0 failed, skips 17.4/battle (last 100), aa +0.00, rwl -0.00, rf +0.00
20:48:37 lock exit=0 in 194 s
20:48:37 start gate
20:48:38 gate exit=0 in 0 s
20:48:38 start pr
20:48:45 pr exit=0 in 6 s
20:48:45 ALLDONE
```
