# Queue pc-rc-confirm: progress

Updated 2026-11-22 03:09:38 PC time (03:09 UTC), runner pid 83088.

- `prep` done, exit 0 in 1 min
- `livematch` done, exit 0 in 0 min
- `field` done, exit 0 in 6.6 h
- `ret` done, exit 0 in 10 min
- `gate112` done, exit 0 in 0 min
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

> warning: arm c's jar bisect/live/hadur117.Hadur_3.22.jar was built 147 h before this step started: check it is not stale

> warning: arm bb's jar opponents/kc.mega.BeepBoop_2.0.jar was built 134 h before this step started: check it is not stale

### field

**7242 of 7248 battles** (100%), 0 failed. Running 6.6 h, 948 battles/h, about 0 min left (ends ~02:59 PC time). Last battle 0 min ago.
Skipped turns a battle: 33.1 overall, first 100 35.1, last 100 28.2; engine disables 2192.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| rel | 2414 | 0 | 93.21 | -0.54 (1207 robots) | ±0.15 | -0.77 .. -0.32 | 33.0 |
| c | 2414 | 0 | 93.82 | - | - | - | 33.1 |
| aa | 2414 | 0 | 93.69 | -0.13 (1207 robots) | ±0.14 | -0.34 .. +0.09 | 33.3 |

APS = mean difference over the robots read x 1208 panel robots / 1217 pairings.
A/A: aa - c -0.13 pts over 1207 robots; 1% band ±0.24 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 7242 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 90 over 200` | halt | ok | 30.0 a battle over the last 200 (first 200: 34.9) |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `aa after 20%` | halt | ok | aa - c -0.13 pts over 1207 robots, stop band ±0.28 |

Stopping now would leave 6 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

> warning: arm rel's jar bisect/rel/hadur117.Hadur_3.23.jar was built 45 h before this step started: check it is not stale

### ret

**288 of 288 battles** (100%), 0 failed. Running 10 min, 1656 battles/h, about 0 min left (ends ~03:09 PC time). Last battle 0 min ago.
Skipped turns a battle: 11.6 overall, first 100 12.6, last 100 11.0; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| rel | 96 | 0 | 79.52 | -0.01 (16 robots) | ±0.02 | -0.04 .. +0.02 | 11.6 |
| c | 96 | 0 | 79.94 | - | - | - | 11.6 |
| aa | 96 | 0 | 80.68 | +0.01 (16 robots) | ±0.01 | -0.01 .. +0.03 | 11.6 |

APS = mean difference over the robots read x 16 panel robots / 1217 pairings.
A/A: aa - c +0.75 pts over 16 robots; 1% band ±1.19 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 288 |
| `dead 8` | halt | ok | every arm scoring |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

> warning: arm rel's jar bisect/rel/hadur117.Hadur_3.23.jar was built 52 h before this step started: check it is not stale

### Queue log (last lines)

```
01:23:31 progress field: 5727/7248 (79%) battles, 948/h, ETA 1.6 h, 0 failed, skips 39.1/battle (last 100), rel -0.57, aa -0.16
01:53:41 progress field: 6215/7248 (86%) battles, 970/h, ETA 1.1 h, 0 failed, skips 33.1/battle (last 100), rel -0.56, aa -0.14
02:23:52 progress field: 6688/7248 (92%) battles, 940/h, ETA 36 min, 0 failed, skips 32.0/battle (last 100), rel -0.54, aa -0.13
02:54:08 progress field: 7171/7248 (99%) battles, 966/h, ETA 5 min, 0 failed, skips 29.1/battle (last 100), rel -0.54, aa -0.12
02:59:00 field exit=0 in 23927 s
02:59:00 start ret
02:59:00 watching ret: 3 stop rule(s)
03:09:26 ret exit=0 in 625 s
03:09:26 start gate112
03:09:29 gate112 exit=0 in 3 s
03:09:30 start gate
03:09:30 gate exit=0 in 0 s
03:09:30 start pr
03:09:38 pr exit=0 in 7 s
03:09:38 ALLDONE
```
