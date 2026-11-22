# Queue pc-jaylexi-13: progress

Updated 2026-11-22 21:06:49 PC time (21:06 UTC), runner pid 96052.

- `prep` done, exit 0 in 1 min
- `livematch` done, exit 0 in 0 min
- `bench` done, exit 0 in 3.2 h
- `gate` done, exit 0 in 0 min
- `pr` done, exit 0 in 0 min

### livematch

**124 of 124 battles** (100%), 0 failed, 124 read back from an earlier run. Running 0 min. Last battle 0 min ago.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 62 | 0 | 70.75 | - | - | - | 10.2 |
| bb | 62 | 0 | 84.03 | +0.34 (31 robots) | ±0.06 | +0.24 .. +0.44 | 1.1 |

APS = mean difference over the robots read x 31 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 124 |
| `dead 8` | halt | ok | every arm scoring |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun; every battle already fought is kept and a rerun resumes from it.

> warning: arm c's jar bisect/live/hadur117.Hadur_3.22.jar was built 168 h before this step started: check it is not stale

> warning: arm bb's jar opponents/kc.mega.BeepBoop_2.0.jar was built 155 h before this step started: check it is not stale

### bench

**16032 of 16032 battles** (100%), 0 failed. Running 3.2 h, 4004 battles/h, about 0 min left (ends ~21:06 PC time). Last battle 1 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0; engine disables 0.

| arm | battles | failed | share | vs control (pts) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 4008 | 0 | 88.71 | - | - | - | 0.0 |
| aa | 4008 | 0 | 88.72 | +0.01 (668 robots) | ±0.03 | -0.03 .. +0.05 | 0.0 |
| t | 4008 | 0 | 89.24 | +0.53 (668 robots) | ±0.15 | +0.30 .. +0.76 | 0.0 |
| r6 | 4008 | 0 | 88.39 | -0.32 (668 robots) | ±0.15 | -0.55 .. -0.09 | 0.0 |
A/A: aa - c +0.01 pts over 668 robots; 1% band ±0.18 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 16032 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | ok | 0.0 a battle over the last 200 (first 200: 0.0) |
| `stall 30m` | halt | ok | last battle 1 min ago |
| `aa after 20%` | halt | ok | aa - c +0.01 pts over 668 robots, stop band ±0.21 |
| `futility t below -0.5 after 20%` | finish | ok | t +0.53, best case +0.76 pts vs bar -0.50 |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
17:53:22 start bench
17:53:22 watching bench: 6 stop rule(s)
17:53:43 progress bench: 16/16032 (0%) battles, 2858/h, ETA 5.6 h, 0 failed, skips 0.0/battle (last 100)
18:23:54 progress bench: 3518/16032 (22%) battles, 6972/h, ETA 1.8 h, 0 failed, skips 0.0/battle (last 100), aa -0.00, t +0.40, r6 -0.37
18:54:13 progress bench: 6762/16032 (42%) battles, 6416/h, ETA 1.4 h, 0 failed, skips 0.0/battle (last 100), aa +0.01, t +0.39, r6 -0.40
19:24:30 progress bench: 8916/16032 (56%) battles, 4256/h, ETA 1.7 h, 0 failed, skips 0.0/battle (last 100), aa +0.05, t +0.51, r6 -0.32
19:54:51 progress bench: 11069/16032 (69%) battles, 4266/h, ETA 1.2 h, 0 failed, skips 0.0/battle (last 100), aa +0.05, t +0.54, r6 -0.33
20:25:10 progress bench: 13229/16032 (83%) battles, 4280/h, ETA 39 min, 0 failed, skips 0.0/battle (last 100), aa +0.03, t +0.54, r6 -0.34
20:55:21 progress bench: 15353/16032 (96%) battles, 4230/h, ETA 10 min, 0 failed, skips 0.0/battle (last 100), aa +0.02, t +0.54, r6 -0.32
21:06:40 bench exit=0 in 11598 s
21:06:40 start gate
21:06:41 gate exit=0 in 0 s
21:06:41 start pr
21:06:49 pr exit=0 in 7 s
21:06:49 ALLDONE
```
