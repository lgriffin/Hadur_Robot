# Queue pc-locks: progress

Updated 2026-11-26 23:03:57 PC time (23:03 UTC), runner pid 15568.

- `prep` done, exit 0 in 8 min
- `livematch` done, exit 0 in 8 min
- `lock` done, exit 0 in 11 min
- `stage` done, exit 0 in 0 min
- `lock-gl` done, exit 0 in 2 min
- `lock-cpl` running
- `lock-rwl` pending
- `lock-dn` pending
- `lock-hof` pending
- `lock-qw` pending
- `lock-rlnrkn` pending
- `lock-rf` pending
- `lock-mtty` pending
- `gate` pending
- `skip` pending
- `skipread` pending
- `pr` pending

### livematch

**124 of 124 battles** (100%), 0 failed. Running 8 min, 938 battles/h, about 0 min left (ends ~22:49 PC time). Last battle 0 min ago.
Skipped turns a battle: 5.7 overall, first 100 5.2, last 100 5.8; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 62 | 0 | 70.05 | - | - | - | 10.5 |
| bb | 62 | 0 | 84.38 | +0.36 (31 robots) | ±0.06 | +0.27 .. +0.46 | 0.9 |

APS = mean difference over the robots read x 31 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 124 |
| `dead 8` | halt | ok | every arm scoring |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

> warning: arm c's jar bisect/live/hadur117.Hadur_3.22.jar was built 269 h before this step started: check it is not stale

> warning: arm bb's jar opponents/kc.mega.BeepBoop_2.0.jar was built 256 h before this step started: check it is not stale

### lock

**768 of 768 battles** (100%), 0 failed. Running 11 min, 4019 battles/h, about 0 min left (ends ~23:01 PC time). Last battle 0 min ago.
Skipped turns a battle: 11.5 overall, first 100 12.9, last 100 10.6; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 384 | 0 | 86.13 | - | - | - | 11.5 |
| aa | 384 | 0 | 86.37 | +0.00 (16 robots) | ±0.01 | -0.01 .. +0.01 | 11.6 |

APS = mean difference over the robots read x 16 panel robots / 1217 pairings.
A/A: aa - c +0.24 pts over 16 robots; 1% band ±0.60 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 768 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 24` | halt | ok | 10.2 a battle over the last 24 (first 24: 16.1) |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### lock-gl

**192 of 192 battles** (100%), 0 failed, 96 read back from an earlier run. Running 2 min, 2874 battles/h, about 0 min left (ends ~23:03 PC time). Last battle 0 min ago.
Skipped turns a battle: 11.5 overall, first 96 11.5, last 96 11.5; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 96 | 0 | 73.35 | - | - | - | 10.8 |
| gl | 96 | 0 | 74.92 | +0.01 (4 robots) | ±0.01 | -0.01 .. +0.02 | 11.5 |

APS = mean difference over the robots read x 4 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 192 |
| `dead 8` | halt | ok | every arm scoring |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### lock-cpl

**50 of 96 battles** (52%), 0 failed, 48 read back from an earlier run. Running 0 min, 286 battles/h, about 10 min left (ends ~23:13 PC time). Last battle 0 min ago.
Skipped turns a battle: 13.5 overall, first 2 13.5, last 2 13.5; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 48 | 0 | 76.48 | - | - | - | 11.5 |
| cpl | 2 | 0 | 82.33 | +0.00 (1 robots) | - | - | 13.5 |

APS = mean difference over the robots read x 2 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 50 |
| `dead 8` | halt | ok | every arm scoring |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 46 battles unrun (about 10 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
22:42:02 prep exit=0 in 502 s
22:42:02 start livematch
22:42:02 watching livematch: 3 stop rule(s)
22:42:43 progress livematch: 19/124 (15%) battles, 1655/h, ETA 4 min, 0 failed, skips 4.9/battle (last 100), bb +0.19
22:49:58 livematch exit=0 in 475 s
22:49:58 start lock
22:49:58 watching lock: 4 stop rule(s)
23:01:26 lock exit=0 in 687 s
23:01:26 start stage
23:01:32 stage exit=0 in 5 s
23:01:32 start lock-gl
23:01:32 watching lock-gl: 3 stop rule(s)
23:03:32 lock-gl exit=0 in 120 s
23:03:32 start lock-cpl
23:03:32 watching lock-cpl: 3 stop rule(s)
```
