# Queue pc-locks: progress

Updated 2026-11-16 21:28:31 PC time (21:28 UTC), runner pid 72252.

- `prep` done, exit 0 in 4 min
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

> warning: arm c's jar bisect/live/hadur117.Hadur_3.22.jar was built 28 h before this step started: check it is not stale

> warning: arm bb's jar opponents/kc.mega.BeepBoop_2.0.jar was built 15 h before this step started: check it is not stale

### lock

**432 of 432 battles** (100%), 0 failed. Running 4 min, 6600 battles/h, about 0 min left (ends ~21:28 PC time). Last battle 0 min ago.
Skipped turns a battle: 16.2 overall, first 100 17.7, last 100 14.4; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 72 | 0 | 95.78 | - | - | - | 16.0 |
| aa | 72 | 0 | 95.51 | -0.00 (6 robots) | ±0.00 | -0.00 .. +0.00 | 16.1 |
| vj | 72 | 0 | 96.10 | +0.00 (6 robots) | ±0.00 | -0.00 .. +0.01 | 16.3 |
| hl | 72 | 0 | 96.20 | +0.00 (6 robots) | ±0.00 | -0.00 .. +0.01 | 16.0 |
| dp | 72 | 0 | 96.00 | +0.00 (6 robots) | ±0.00 | -0.00 .. +0.00 | 16.3 |
| kl | 72 | 0 | 96.23 | +0.00 (6 robots) | ±0.01 | -0.00 .. +0.01 | 16.4 |

APS = mean difference over the robots read x 6 panel robots / 1217 pairings.
A/A: aa - c -0.27 pts over 6 robots; 1% band ±1.38 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 432 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 24` | halt | ok | 11.0 a battle over the last 24 (first 24: 20.6) |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
21:20:23 start prep
21:20:25 progress pushed to origin claude/pc-locks-progress (every 15 min)
21:24:16 prep exit=0 in 232 s
21:24:16 start livematch
21:24:16 watching livematch: 3 stop rule(s)
21:24:25 progress livematch: 124/124 (100%) battles, 0 failed, bb +0.37
21:24:25 livematch exit=0 in 9 s
21:24:25 start lock
21:24:25 watching lock: 4 stop rule(s)
21:28:21 lock exit=0 in 235 s
21:28:21 start gate
21:28:22 gate exit=0 in 0 s
21:28:22 start pr
21:28:31 pr exit=0 in 8 s
21:28:31 ALLDONE
```
