# Queue pc-rc-confirm: progress

Updated 2026-11-25 00:50:26 PC time (00:50 UTC), runner pid 95668.

- `prep` done, exit 0 in 2 min
- `livematch` done, exit 0 in 8 min
- `field` running
- `ret` pending
- `gate112` pending
- `gate` pending
- `pr` pending

### livematch

**124 of 124 battles** (100%), 0 failed. Running 8 min, 909 battles/h, about 0 min left (ends ~22:12 PC time). Last battle 0 min ago.
Skipped turns a battle: 5.5 overall, first 100 5.1, last 100 5.6; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 62 | 0 | 70.28 | - | - | - | 10.1 |
| bb | 62 | 0 | 84.27 | +0.36 (31 robots) | ±0.07 | +0.25 .. +0.46 | 0.9 |

APS = mean difference over the robots read x 31 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 124 |
| `dead 8` | halt | ok | every arm scoring |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

> warning: arm c's jar bisect/live/hadur117.Hadur_3.22.jar was built 220 h before this step started: check it is not stale

> warning: arm bb's jar opponents/kc.mega.BeepBoop_2.0.jar was built 207 h before this step started: check it is not stale

### field

**3189 of 3636 battles** (88%), 0 failed. Running 2.6 h, 1050 battles/h, about 26 min left (ends ~01:15 PC time). Last battle 0 min ago.
Skipped turns a battle: 36.1 overall, first 100 36.0, last 100 30.7; engine disables 1031.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| rel | 1063 | 0 | 93.81 | -0.13 (1059 robots) | ±0.18 | -0.41 .. +0.15 | 36.4 |
| c | 1065 | 0 | 93.93 | - | - | - | 35.7 |
| aa | 1061 | 0 | 93.83 | -0.10 (1061 robots) | ±0.20 | -0.40 .. +0.20 | 36.0 |

APS = mean difference over the robots read x 1212 panel robots / 1217 pairings.
A/A: aa - c -0.10 pts over 1061 robots; 1% band ±0.36 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 3189 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 90 over 200` | halt | ok | 33.5 a battle over the last 200 (first 200: 37.6) |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `aa after 20%` | halt | ok | aa - c -0.10 pts over 1061 robots, stop band ±0.42 |

Stopping now would leave 447 battles unrun (about 26 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
22:02:47 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1544834; work D:\code\Hadur_Robot\hadur-bench\work
22:02:47 start prep
22:02:50 progress pushed to origin claude/pc-rc-confirm-progress (every 15 min)
22:04:35 prep exit=0 in 107 s
22:04:35 start livematch
22:04:35 watching livematch: 3 stop rule(s)
22:04:49 progress livematch: 1/124 (1%) battles, 254/h, ETA 29 min, 0 failed, skips 2.0/battle (last 100)
22:12:46 livematch exit=0 in 491 s
22:12:46 start field
22:12:46 watching field: 5 stop rule(s)
22:35:06 progress field: 483/3636 (13%) battles, 1298/h, ETA 2.4 h, 0 failed, skips 36.2/battle (last 100), rel -0.34, aa +0.00
23:05:24 progress field: 1121/3636 (31%) battles, 1252/h, ETA 2.0 h, 0 failed, skips 38.3/battle (last 100), rel -0.14, aa +0.22
23:35:40 progress field: 1746/3636 (48%) battles, 1246/h, ETA 1.5 h, 0 failed, skips 38.8/battle (last 100), rel -0.15, aa +0.14
00:05:57 progress field: 2360/3636 (65%) battles, 1204/h, ETA 1.1 h, 0 failed, skips 34.6/battle (last 100), rel -0.14, aa +0.02
00:36:15 progress field: 2952/3636 (81%) battles, 1164/h, ETA 35 min, 0 failed, skips 38.3/battle (last 100), rel -0.17, aa -0.11
```
