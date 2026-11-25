# Queue pc-locks: progress

Updated 2026-11-25 01:34:59 PC time (01:34 UTC), runner pid 69084.

- `prep` done, exit 0 in 4 min
- `livematch` done, exit 0 in 8 min
- `lock` done, exit 0 in 18 min
- `stage` done, exit 0 in 0 min
- `lock-sb` done, exit 0 in 1 min
- `lock-rp` done, exit 0 in 2 min
- `lock-qw` done, exit 0 in 1 min
- `lock-fq` done, exit 0 in 1 min
- `lock-kb` done, exit 0 in 3 min
- `gate` done, exit 0 in 0 min
- `pr` done, exit 0 in 0 min

### lock-sb

**48 of 48 battles** (100%), 0 failed, 24 read back from an earlier run. Running 1 min, 2376 battles/h, about 0 min left (ends ~01:26 PC time). Last battle 0 min ago.
Skipped turns a battle: 15.2 overall, first 24 15.2, last 24 15.2; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 24 | 0 | 83.89 | - | - | - | 12.3 |
| sb | 24 | 0 | 93.78 | +0.01 (1 robots) | - | - | 15.2 |

APS = mean difference over the robots read x 1 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 48 |
| `dead 8` | halt | ok | every arm scoring |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### lock-rp

**48 of 48 battles** (100%), 0 failed, 24 read back from an earlier run. Running 2 min, 619 battles/h, about 0 min left (ends ~01:29 PC time). Last battle 0 min ago.
Skipped turns a battle: 12.9 overall, first 24 12.9, last 24 12.9; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 24 | 0 | 65.27 | - | - | - | 10.3 |
| rp | 24 | 0 | 72.69 | +0.01 (1 robots) | - | - | 12.9 |

APS = mean difference over the robots read x 1 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 48 |
| `dead 8` | halt | ok | every arm scoring |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### lock-qw

**240 of 240 battles** (100%), 0 failed, 120 read back from an earlier run. Running 1 min, 5804 battles/h, about 0 min left (ends ~01:30 PC time). Last battle 0 min ago.
Skipped turns a battle: 14.8 overall, first 100 15.1, last 100 14.1; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 120 | 0 | 95.37 | - | - | - | 12.6 |
| qw | 120 | 0 | 95.62 | +0.00 (5 robots) | ±0.00 | -0.00 .. +0.00 | 14.8 |

APS = mean difference over the robots read x 5 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 240 |
| `dead 8` | halt | ok | every arm scoring |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### lock-fq

**48 of 48 battles** (100%), 0 failed, 24 read back from an earlier run. Running 1 min, 1579 battles/h, about 0 min left (ends ~01:31 PC time). Last battle 0 min ago.
Skipped turns a battle: 14.6 overall, first 24 14.6, last 24 14.6; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 24 | 0 | 75.23 | - | - | - | 11.3 |
| fq | 24 | 0 | 75.37 | +0.00 (1 robots) | - | - | 14.6 |

APS = mean difference over the robots read x 1 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 48 |
| `dead 8` | halt | ok | every arm scoring |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### lock-kb

**240 of 240 battles** (100%), 0 failed, 120 read back from an earlier run. Running 3 min, 2133 battles/h, about 0 min left (ends ~01:34 PC time). Last battle 0 min ago.
Skipped turns a battle: 11.9 overall, first 100 12.1, last 100 11.2; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 120 | 0 | 92.25 | - | - | - | 12.4 |
| kb | 120 | 0 | 95.07 | +0.01 (5 robots) | ±0.01 | -0.00 .. +0.02 | 11.9 |

APS = mean difference over the robots read x 5 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 240 |
| `dead 8` | halt | ok | every arm scoring |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
01:29:19 lock-rp exit=0 in 139 s
01:29:19 start lock-qw
01:29:19 watching lock-qw: 3 stop rule(s)
01:30:33 lock-qw exit=0 in 74 s
01:30:33 start lock-fq
01:30:33 watching lock-fq: 3 stop rule(s)
01:31:28 lock-fq exit=0 in 54 s
01:31:28 start lock-kb
01:31:28 watching lock-kb: 3 stop rule(s)
01:34:51 lock-kb exit=0 in 202 s
01:34:51 start gate
01:34:52 gate exit=0 in 1 s
01:34:52 start pr
01:34:59 pr exit=0 in 7 s
01:34:59 ALLDONE
```
