# Queue pc-locks39: progress

Updated 2026-11-28 02:10:35 PC time (02:10 UTC), runner pid 29436.

- `prep` done, exit 0 in 6 min
- `livematch` done, exit 0 in 8 min
- `lock` done, exit 0 in 2.5 h
- `stage` done, exit 0 in 0 min
- `lock-zl` done, exit 0 in 1 min
- `lock-pb` running
- `lock-rlnrkn` pending
- `lock-fgl` pending
- `lock-mt` pending
- `lock-rf` pending
- `lock-rp` pending
- `gate` pending
- `pr` pending

### livematch

**124 of 124 battles** (100%), 0 failed. Running 8 min, 944 battles/h, about 0 min left (ends ~23:37 PC time). Last battle 0 min ago.
Skipped turns a battle: 5.7 overall, first 100 5.4, last 100 5.9; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 62 | 0 | 70.13 | - | - | - | 10.5 |
| bb | 62 | 0 | 84.88 | +0.38 (31 robots) | ±0.06 | +0.28 .. +0.47 | 0.9 |

APS = mean difference over the robots read x 31 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 124 |
| `dead 8` | halt | ok | every arm scoring |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

> warning: arm c's jar bisect/live/hadur117.Hadur_3.22.jar was built 294 h before this step started: check it is not stale

> warning: arm bb's jar opponents/kc.mega.BeepBoop_2.0.jar was built 281 h before this step started: check it is not stale

### lock

**1248 of 1248 battles** (100%), 0 failed. Running 2.5 h, 472 battles/h, about 0 min left (ends ~02:06 PC time). Last battle 0 min ago.
Skipped turns a battle: 9.4 overall, first 100 10.3, last 100 8.9; engine disables 1.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 624 | 0 | 63.52 | - | - | - | 9.3 |
| aa | 624 | 0 | 63.74 | +0.00 (13 robots) | ±0.01 | -0.01 .. +0.01 | 9.5 |

APS = mean difference over the robots read x 13 panel robots / 1217 pairings.
A/A: aa - c +0.22 pts over 13 robots; 1% band ±0.47 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 1248 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 24` | halt | ok | 8.0 a battle over the last 24 (first 24: 12.3) |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### lock-zl

**96 of 96 battles** (100%), 0 failed, 48 read back from an earlier run. Running 1 min, 3284 battles/h, about 0 min left (ends ~02:07 PC time). Last battle 0 min ago.
Skipped turns a battle: 16.6 overall, first 48 16.6, last 48 16.6; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 48 | 0 | 88.25 | - | - | - | 9.3 |
| zl | 48 | 0 | 94.39 | +0.01 (1 robots) | - | - | 16.6 |

APS = mean difference over the robots read x 1 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 96 |
| `dead 8` | halt | ok | every arm scoring |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### lock-pb

**64 of 96 battles** (67%), 0 failed, 48 read back from an earlier run. Running 4 min, 268 battles/h, about 7 min left (ends ~02:17 PC time). Last battle 1 min ago.
Skipped turns a battle: 14.8 overall, first 16 14.8, last 16 14.8; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 48 | 0 | 68.63 | - | - | - | 10.8 |
| pb | 16 | 0 | 70.11 | +0.00 (1 robots) | - | - | 14.8 |

APS = mean difference over the robots read x 1 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 64 |
| `dead 8` | halt | ok | every arm scoring |
| `stall 30m` | halt | ok | last battle 1 min ago |

Stopping now would leave 32 battles unrun (about 7 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
23:37:45 start lock
23:37:45 watching lock: 4 stop rule(s)
00:00:28 progress lock: 184/1248 (15%) battles, 486/h, ETA 2.2 h, 0 failed, skips 9.6/battle (last 100), aa -0.01
00:30:42 progress lock: 434/1248 (35%) battles, 500/h, ETA 1.6 h, 0 failed, skips 9.2/battle (last 100), aa -0.00
01:00:59 progress lock: 698/1248 (56%) battles, 524/h, ETA 1.0 h, 0 failed, skips 8.9/battle (last 100), aa +0.00
01:31:15 progress lock: 982/1248 (79%) battles, 564/h, ETA 28 min, 0 failed, skips 9.5/battle (last 100), aa +0.00
02:01:30 progress lock: 1241/1248 (99%) battles, 518/h, ETA 1 min, 0 failed, skips 9.0/battle (last 100), aa +0.00
02:06:02 lock exit=0 in 8897 s
02:06:02 start stage
02:06:07 stage exit=0 in 4 s
02:06:07 start lock-zl
02:06:07 watching lock-zl: 3 stop rule(s)
02:07:00 lock-zl exit=0 in 52 s
02:07:00 start lock-pb
02:07:00 watching lock-pb: 3 stop rule(s)
```
