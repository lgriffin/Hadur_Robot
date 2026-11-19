# Queue pc-intercept: progress

Updated 2026-11-19 13:48:54 PC time (13:48 UTC), runner pid 49364.

- `prep` done, exit 0 in 2 min
- `livematch` done, exit 0 in 0 min
- `pilot` done, exit 0 in 30 min
- `pilotstop` done, exit 0 in 0 min
- `fielde` running
- `midfield` pending
- `gate` pending
- `pr` pending

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

> warning: arm c's jar bisect/live/hadur117.Hadur_3.22.jar was built 91 h before this step started: check it is not stale

> warning: arm bb's jar opponents/kc.mega.BeepBoop_2.0.jar was built 78 h before this step started: check it is not stale

### pilot

**558 of 558 battles** (100%), 0 failed. Running 30 min, 1125 battles/h, about 0 min left (ends ~13:35 PC time). Last battle 0 min ago.
Skipped turns a battle: 9.6 overall, first 100 12.8, last 100 3.9; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 186 | 0 | 73.72 | - | - | - | 9.5 |
| aa | 186 | 0 | 73.72 | -0.00 (31 robots) | ±0.03 | -0.04 .. +0.04 | 9.7 |
| ic | 186 | 0 | 74.47 | +0.02 (31 robots) | ±0.02 | -0.01 .. +0.04 | 9.6 |

APS = mean difference over the robots read x 31 panel robots / 1217 pairings.
A/A: aa - c -0.00 pts over 31 robots; 1% band ±0.86 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 558 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | ok | 4.4 a battle over the last 200 (first 200: 13.5) |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### fielde

**958 of 1674 battles** (57%), 0 failed. Running 13 min, 4376 battles/h, about 10 min left (ends ~13:58 PC time). Last battle 0 min ago.
Skipped turns a battle: 4.4 overall, first 100 2.9, last 100 5.2; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 321 | 0 | 83.89 | - | - | - | 4.4 |
| aa | 318 | 0 | 83.42 | -0.04 (93 robots) | ±0.04 | -0.09 .. +0.02 | 4.4 |
| ic | 319 | 0 | 84.12 | +0.04 (93 robots) | ±0.03 | -0.01 .. +0.08 | 4.4 |

APS = mean difference over the robots read x 93 panel robots / 1217 pairings.
A/A: aa - c -0.46 pts over 93 robots; 1% band ±0.65 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 958 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | ok | 5.1 a battle over the last 200 (first 200: 3.5) |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 716 battles unrun (about 10 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
13:03:25 start prep
13:03:27 progress pushed to origin claude/pc-intercept-progress (every 15 min)
13:05:51 prep exit=0 in 146 s
13:05:51 start livematch
13:05:51 watching livematch: 3 stop rule(s)
13:05:59 livematch exit=0 in 7 s
13:05:59 start pilot
13:05:59 watching pilot: 4 stop rule(s)
13:06:26 progress pilot: 11/558 (2%) battles, 1452/h, ETA 23 min, 0 failed, skips 14.4/battle (last 100), aa +0.10, ic -0.03
13:35:45 pilot exit=0 in 1785 s
13:35:45 start pilotstop
13:35:46 pilotstop exit=0 in 0 s
13:35:46 start fielde
13:35:46 watching fielde: 4 stop rule(s)
13:36:44 progress fielde: 64/1674 (4%) battles, 3945/h, ETA 24 min, 0 failed, skips 2.0/battle (last 100), aa -0.01, ic +0.07
```
