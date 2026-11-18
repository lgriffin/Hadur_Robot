# Queue pc-locks: progress

Updated 2026-11-18 22:40:36 PC time (22:40 UTC), runner pid 23212.

- `prep` done, exit 0 in 7 min
- `livematch` done, exit 0 in 0 min
- `lock` done, exit 0 in 34 min
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

> warning: arm c's jar bisect/live/hadur117.Hadur_3.22.jar was built 76 h before this step started: check it is not stale

> warning: arm bb's jar opponents/kc.mega.BeepBoop_2.0.jar was built 63 h before this step started: check it is not stale

### lock

**1680 of 1680 battles** (100%), 0 failed. Running 34 min, 2686 battles/h, about 0 min left (ends ~22:40 PC time). Last battle 0 min ago.
Skipped turns a battle: 12.3 overall, first 100 14.8, last 100 10.7; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 168 | 0 | 85.95 | - | - | - | 12.1 |
| aa | 168 | 0 | 86.58 | +0.01 (14 robots) | ±0.01 | -0.01 .. +0.02 | 12.2 |
| rf | 168 | 0 | 87.23 | +0.01 (14 robots) | ±0.01 | -0.00 .. +0.02 | 12.7 |
| sp2 | 168 | 0 | 87.06 | +0.01 (14 robots) | ±0.01 | -0.00 .. +0.02 | 12.2 |
| hf | 168 | 0 | 87.10 | +0.01 (14 robots) | ±0.01 | -0.01 .. +0.03 | 12.4 |
| or | 168 | 0 | 86.67 | +0.00 (14 robots) | ±0.01 | -0.00 .. +0.01 | 12.4 |
| rp | 168 | 0 | 87.50 | +0.01 (14 robots) | ±0.01 | -0.00 .. +0.03 | 12.2 |
| mv | 168 | 0 | 86.84 | +0.01 (14 robots) | ±0.01 | -0.01 .. +0.02 | 12.2 |
| md | 168 | 0 | 86.49 | +0.00 (14 robots) | ±0.01 | -0.01 .. +0.02 | 12.6 |
| mtmv | 168 | 0 | 86.61 | +0.00 (14 robots) | ±0.01 | -0.01 .. +0.02 | 12.2 |

APS = mean difference over the robots read x 14 panel robots / 1217 pairings.
A/A: aa - c +0.63 pts over 14 robots; 1% band ±0.90 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 1680 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 24` | halt | ok | 8.5 a battle over the last 24 (first 24: 17.7) |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
21:59:23 progress pushed to origin claude/pc-locks-progress (every 15 min)
22:05:53 prep exit=0 in 392 s
22:05:53 start livematch
22:05:53 watching livematch: 3 stop rule(s)
22:06:04 livematch exit=0 in 10 s
22:06:04 start lock
22:06:04 watching lock: 4 stop rule(s)
22:06:25 progress lock: 13/1680 (1%) battles, 2314/h, ETA 43 min, 0 failed, skips 19.2/battle (last 100)
22:36:44 progress lock: 1660/1680 (99%) battles, 3232/h, ETA 0 min, 0 failed, skips 11.7/battle (last 100), aa +0.01, rf +0.01, sp2 +0.01, hf +0.01, or +0.00, rp +0.01, mv +0.01, md +0.00, mtmv +0.00
22:40:29 lock exit=0 in 2064 s
22:40:29 start gate
22:40:30 gate exit=0 in 0 s
22:40:30 start pr
22:40:36 pr exit=0 in 6 s
22:40:36 ALLDONE
```
