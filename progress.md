# Queue pc-locks: progress

Updated 2026-11-19 09:15:59 PC time (09:15 UTC), runner pid 94268.

- `prep` done, exit 0 in 2 min
- `livematch` done, exit 0 in 0 min
- `lock` done, exit 0 in 1 min
- `gate` done, exit 0 in 0 min
- `lock112` done, exit 0 in 6 min
- `gate112` done, exit 0 in 0 min
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

> warning: arm c's jar bisect/live/hadur117.Hadur_3.22.jar was built 87 h before this step started: check it is not stale

> warning: arm bb's jar opponents/kc.mega.BeepBoop_2.0.jar was built 74 h before this step started: check it is not stale

### lock

**96 of 96 battles** (100%), 0 failed. Running 1 min, 5883 battles/h, about 0 min left (ends ~09:10 PC time). Last battle 0 min ago.
Skipped turns a battle: 15.0 overall, first 96 15.0, last 96 15.0; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 24 | 0 | 85.77 | - | - | - | 15.2 |
| aa | 24 | 0 | 86.47 | +0.00 (2 robots) | ±0.00 | -0.00 .. +0.00 | 15.2 |
| rp | 24 | 0 | 86.44 | +0.00 (2 robots) | ±0.00 | -0.00 .. +0.00 | 14.2 |
| rfn | 24 | 0 | 88.25 | +0.00 (2 robots) | ±0.00 | +0.00 .. +0.00 | 15.3 |

APS = mean difference over the robots read x 2 panel robots / 1217 pairings.
A/A: aa - c +0.70 pts over 2 robots; 1% band ±2.38 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 96 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 24` | halt | ok | 10.6 a battle over the last 24 (first 24: 19.2) |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### lock112

**192 battles**, 0 failed. Running 6 min, 2039 battles/h. Last battle 0 min ago.
Skipped turns a battle: 10.8 overall, first 100 11.5, last 100 10.1; engine disables 0.

| arm | battles | failed | share | vs control (pts) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 48 | 0 | 69.60 | - | - | - | 10.2 |
| aa | 48 | 0 | 70.47 | +0.87 (4 robots) | ±2.72 | -3.29 .. +5.03 | 11.4 |
| rp | 48 | 0 | 74.29 | +4.25 (4 robots) | ±0.42 | +3.61 .. +4.90 | 11.4 |
| rfn | 48 | 0 | 69.75 | -0.29 (4 robots) | ±0.94 | -1.72 .. +1.15 | 10.2 |
A/A: aa - c +0.87 pts over 4 robots; 1% band ±1.69 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 192 |
| `dead 8` | halt | ok | every arm scoring |
| `stall 30m` | halt | ok | last battle 0 min ago |

### Queue log (last lines)

```
09:09:10 livematch exit=0 in 8 s
09:09:10 start lock
09:09:10 watching lock: 4 stop rule(s)
09:09:35 progress lock: 33/96 (34%) battles, 4905/h, ETA 1 min, 0 failed, skips 18.5/battle (last 100), aa +0.00, rp +0.00, rfn +0.00
09:10:09 lock exit=0 in 58 s
09:10:09 start gate
09:10:10 gate exit=0 in 0 s
09:10:10 start lock112
09:10:10 watching lock112: 3 stop rule(s)
09:15:49 lock112 exit=0 in 338 s
09:15:49 start gate112
09:15:52 gate112 exit=0 in 3 s
09:15:52 start pr
09:15:59 pr exit=0 in 7 s
09:15:59 ALLDONE
```
