# Queue pc-locks: progress

Updated 2026-11-26 02:10:05 PC time (02:10 UTC), runner pid 86988.

- `prep` done, exit 0 in 4 min
- `livematch` done, exit 0 in 8 min
- `lock` done, exit 0 in 9 min
- `stage` done, exit 0 in 0 min
- `lock-gl` done, exit 0 in 2 min
- `lock-rwl` done, exit 0 in 1 min
- `lock-rlnrkn` done, exit 0 in 1 min
- `lock-rln` running
- `gate` pending
- `pr` pending

### livematch

**124 of 124 battles** (100%), 0 failed. Running 8 min, 950 battles/h, about 0 min left (ends ~01:57 PC time). Last battle 0 min ago.
Skipped turns a battle: 5.8 overall, first 100 5.1, last 100 6.0; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 62 | 0 | 69.48 | - | - | - | 10.2 |
| bb | 62 | 0 | 84.33 | +0.38 (31 robots) | ±0.07 | +0.27 .. +0.49 | 1.3 |

APS = mean difference over the robots read x 31 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 124 |
| `dead 8` | halt | ok | every arm scoring |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

> warning: arm c's jar bisect/live/hadur117.Hadur_3.22.jar was built 248 h before this step started: check it is not stale

> warning: arm bb's jar opponents/kc.mega.BeepBoop_2.0.jar was built 235 h before this step started: check it is not stale

### lock

**624 of 624 battles** (100%), 0 failed. Running 9 min, 4239 battles/h, about 0 min left (ends ~02:06 PC time). Last battle 0 min ago.
Skipped turns a battle: 12.6 overall, first 100 14.5, last 100 12.1; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 312 | 0 | 91.08 | - | - | - | 12.6 |
| aa | 312 | 0 | 91.31 | +0.00 (13 robots) | ±0.00 | -0.00 .. +0.01 | 12.6 |

APS = mean difference over the robots read x 13 panel robots / 1217 pairings.
A/A: aa - c +0.24 pts over 13 robots; 1% band ±0.66 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 624 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 24` | halt | ok | 10.3 a battle over the last 24 (first 24: 17.3) |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### lock-gl

**96 of 96 battles** (100%), 0 failed, 48 read back from an earlier run. Running 2 min, 1163 battles/h, about 0 min left (ends ~02:08 PC time). Last battle 0 min ago.
Skipped turns a battle: 11.8 overall, first 48 11.8, last 48 11.8; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 48 | 0 | 65.28 | - | - | - | 11.8 |
| gl | 48 | 0 | 69.37 | +0.01 (2 robots) | ±0.00 | +0.00 .. +0.01 | 11.8 |

APS = mean difference over the robots read x 2 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 96 |
| `dead 8` | halt | ok | every arm scoring |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### lock-rwl

**192 of 192 battles** (100%), 0 failed, 96 read back from an earlier run. Running 1 min, 6994 battles/h, about 0 min left (ends ~02:09 PC time). Last battle 0 min ago.
Skipped turns a battle: 17.4 overall, first 96 17.4, last 96 17.4; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 96 | 0 | 98.24 | - | - | - | 13.1 |
| rwl | 96 | 0 | 98.99 | +0.00 (4 robots) | ±0.00 | +0.00 .. +0.00 | 17.4 |

APS = mean difference over the robots read x 4 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 192 |
| `dead 8` | halt | ok | every arm scoring |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### lock-rlnrkn

**96 of 96 battles** (100%), 0 failed, 48 read back from an earlier run. Running 1 min, 5267 battles/h, about 0 min left (ends ~02:10 PC time). Last battle 0 min ago.
Skipped turns a battle: 16.9 overall, first 48 16.9, last 48 16.9; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 48 | 0 | 96.24 | - | - | - | 12.7 |
| rlnrkn | 48 | 0 | 98.96 | +0.00 (2 robots) | ±0.00 | +0.00 .. +0.01 | 16.9 |

APS = mean difference over the robots read x 2 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 96 |
| `dead 8` | halt | ok | every arm scoring |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### lock-rln

**24 of 48 battles** (50%), 0 failed, 24 read back from an earlier run. Running 0 min. Last battle 0 min ago.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 24 | 0 | 96.68 | - | - | - | 12.6 |
| rln | 0 | 0 | - | - | - | - | - |

APS = mean difference over the robots read x 1 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 24 |
| `dead 8` | halt | ok | every arm scoring |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 24 battles unrun; every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
01:57:16 watching lock: 4 stop rule(s)
02:06:06 lock exit=0 in 529 s
02:06:06 start stage
02:06:09 stage exit=0 in 3 s
02:06:09 start lock-gl
02:06:09 watching lock-gl: 3 stop rule(s)
02:08:38 lock-gl exit=0 in 148 s
02:08:38 start lock-rwl
02:08:38 watching lock-rwl: 3 stop rule(s)
02:09:28 lock-rwl exit=0 in 49 s
02:09:28 start lock-rlnrkn
02:09:28 watching lock-rlnrkn: 3 stop rule(s)
02:10:01 lock-rlnrkn exit=0 in 32 s
02:10:01 start lock-rln
02:10:01 watching lock-rln: 3 stop rule(s)
```
