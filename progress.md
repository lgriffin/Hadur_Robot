# Queue pc-locks: progress

Updated 2026-11-17 23:07:56 PC time (23:07 UTC), runner pid 76532.

- `prep` done, exit 0 in 5 min
- `livematch` done, exit 0 in 0 min
- `lock` done, exit 0 in 15 min
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

> warning: arm c's jar bisect/live/hadur117.Hadur_3.22.jar was built 53 h before this step started: check it is not stale

> warning: arm bb's jar opponents/kc.mega.BeepBoop_2.0.jar was built 40 h before this step started: check it is not stale

### lock

**1056 of 1056 battles** (100%), 0 failed. Running 15 min, 4220 battles/h, about 0 min left (ends ~23:07 PC time). Last battle 0 min ago.
Skipped turns a battle: 13.1 overall, first 100 14.3, last 100 11.5; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 132 | 0 | 88.47 | - | - | - | 13.2 |
| aa | 132 | 0 | 87.48 | -0.01 (11 robots) | ±0.01 | -0.02 .. +0.00 | 13.1 |
| rf | 132 | 0 | 88.45 | +0.00 (11 robots) | ±0.01 | -0.01 .. +0.02 | 12.8 |
| rp | 132 | 0 | 88.30 | +0.00 (11 robots) | ±0.01 | -0.01 .. +0.02 | 13.2 |
| rwl | 132 | 0 | 88.27 | +0.00 (11 robots) | ±0.01 | -0.01 .. +0.01 | 13.1 |
| mv | 132 | 0 | 88.48 | +0.00 (11 robots) | ±0.00 | -0.00 .. +0.01 | 12.8 |
| mt | 132 | 0 | 88.09 | +0.00 (11 robots) | ±0.01 | -0.01 .. +0.01 | 13.2 |
| mtmv | 132 | 0 | 87.77 | -0.00 (11 robots) | ±0.01 | -0.01 .. +0.01 | 13.1 |

APS = mean difference over the robots read x 11 panel robots / 1217 pairings.
A/A: aa - c -0.99 pts over 11 robots; 1% band ±1.02 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 1056 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 24` | halt | ok | 10.4 a battle over the last 24 (first 24: 16.0) |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
22:47:42 start prep
22:47:44 progress pushed to origin claude/pc-locks-progress (every 15 min)
22:52:39 prep exit=0 in 297 s
22:52:39 start livematch
22:52:39 watching livematch: 3 stop rule(s)
22:52:44 progress livematch: 124/124 (100%) battles, 0 failed, bb +0.37
22:52:47 livematch exit=0 in 7 s
22:52:47 start lock
22:52:47 watching lock: 4 stop rule(s)
23:07:48 lock exit=0 in 900 s
23:07:48 start gate
23:07:49 gate exit=0 in 1 s
23:07:49 start pr
23:07:56 pr exit=0 in 6 s
23:07:56 ALLDONE
```
