# Queue pc-locks: progress

Updated 2026-11-17 09:04:05 PC time (09:04 UTC), runner pid 17856.

- `prep` done, exit 0 in 8 min
- `livematch` done, exit 0 in 0 min
- `lock` done, exit 0 in 1.1 h
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

> warning: arm c's jar bisect/live/hadur117.Hadur_3.22.jar was built 38 h before this step started: check it is not stale

> warning: arm bb's jar opponents/kc.mega.BeepBoop_2.0.jar was built 25 h before this step started: check it is not stale

### lock

**6336 of 6336 battles** (100%), 0 failed. Running 1.1 h, 5380 battles/h, about 0 min left (ends ~09:03 PC time). Last battle 0 min ago.
Skipped turns a battle: 16.7 overall, first 100 18.5, last 100 12.0; engine disables 12.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 528 | 0 | 92.66 | - | - | - | 16.7 |
| aa | 528 | 0 | 92.63 | -0.00 (44 robots) | ±0.01 | -0.01 .. +0.01 | 16.7 |
| rh | 528 | 0 | 92.90 | +0.01 (44 robots) | ±0.01 | -0.00 .. +0.02 | 16.6 |
| dp | 528 | 0 | 92.83 | +0.01 (44 robots) | ±0.01 | -0.00 .. +0.02 | 16.6 |
| sp2 | 528 | 0 | 92.99 | +0.01 (44 robots) | ±0.01 | -0.00 .. +0.03 | 16.7 |
| rwl | 528 | 0 | 93.02 | +0.01 (44 robots) | ±0.01 | +0.00 .. +0.02 | 16.8 |
| gl | 528 | 0 | 92.73 | +0.00 (44 robots) | ±0.01 | -0.01 .. +0.01 | 16.8 |
| hl | 528 | 0 | 92.60 | -0.00 (44 robots) | ±0.01 | -0.01 .. +0.01 | 16.7 |
| mt | 528 | 0 | 92.83 | +0.01 (44 robots) | ±0.01 | -0.01 .. +0.02 | 16.6 |
| or | 528 | 0 | 92.87 | +0.01 (44 robots) | ±0.01 | -0.01 .. +0.03 | 16.8 |
| rp | 528 | 0 | 92.77 | +0.00 (44 robots) | ±0.01 | -0.01 .. +0.02 | 16.8 |
| mtx0 | 528 | 0 | 92.70 | +0.00 (44 robots) | ±0.01 | -0.01 .. +0.01 | 16.6 |

APS = mean difference over the robots read x 44 panel robots / 1217 pairings.
A/A: aa - c -0.02 pts over 44 robots; 1% band ±0.51 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 6336 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 24` | halt | ok | 8.3 a battle over the last 24 (first 24: 21.0) |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
07:56:44 prep exit=0 in 495 s
07:56:44 start livematch
07:56:44 watching livematch: 3 stop rule(s)
07:56:54 livematch exit=0 in 10 s
07:56:54 start lock
07:56:54 watching lock: 4 stop rule(s)
07:57:33 progress lock: 51/6336 (1%) battles, 4788/h, ETA 1.3 h, 0 failed, skips 19.2/battle (last 100), aa +0.02, rh +0.04, gl +0.04, mtx0 +0.03
08:27:44 progress lock: 3033/6336 (48%) battles, 5914/h, ETA 34 min, 0 failed, skips 16.4/battle (last 100), aa +0.00, rh +0.01, dp +0.01, sp2 +0.01, rwl +0.01, gl +0.00, hl +0.00, mt +0.01, or +0.01, rp +0.01, mtx0 -0.00
08:58:04 progress lock: 6046/6336 (95%) battles, 5964/h, ETA 3 min, 0 failed, skips 16.0/battle (last 100), aa -0.00, rh +0.01, dp +0.01, sp2 +0.01, rwl +0.01, gl +0.00, hl -0.00, mt +0.01, or +0.01, rp +0.01, mtx0 +0.00
09:03:58 lock exit=0 in 4023 s
09:03:58 start gate
09:03:59 gate exit=0 in 0 s
09:03:59 start pr
09:04:05 pr exit=0 in 6 s
09:04:05 ALLDONE
```
