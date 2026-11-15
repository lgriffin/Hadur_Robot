# Queue pc-field-screen: progress

Updated 2026-11-15 18:57:17 PC time (18:57 UTC), runner pid 32872.

- `prep` done, exit 0 in 5 min
- `livematch` done, exit 0 in 0 min
- `screen` running
- `pick` pending
- `lock` pending
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

> warning: arm bb's jar opponents/kc.mega.BeepBoop_2.0.jar was built 964 h before this step started: check it is not stale

### screen

**4091 of 4464 battles** (92%), 0 failed. Running 55 min, 4554 battles/h, about 5 min left (ends ~19:02 PC time). Last battle 0 min ago.
Skipped turns a battle: 14.2 overall, first 100 15.3, last 100 14.2; engine disables 5.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 512 | 0 | 82.99 | - | - | - | 14.3 |
| aa | 507 | 0 | 82.93 | -0.00 (93 robots) | ±0.03 | -0.05 .. +0.04 | 14.1 |
| fq | 511 | 0 | 82.92 | -0.00 (93 robots) | ±0.03 | -0.05 .. +0.04 | 14.3 |
| x5 | 513 | 0 | 81.89 | -0.08 (93 robots) | ±0.04 | -0.14 .. -0.03 | 14.2 |
| hl | 513 | 0 | 83.15 | +0.01 (93 robots) | ±0.03 | -0.03 .. +0.06 | 14.0 |
| dg | 511 | 0 | 82.85 | -0.01 (93 robots) | ±0.03 | -0.05 .. +0.03 | 14.0 |
| gl | 509 | 0 | 82.50 | -0.04 (93 robots) | ±0.03 | -0.08 .. +0.01 | 14.4 |
| mq | 515 | 0 | 82.65 | -0.02 (93 robots) | ±0.03 | -0.06 .. +0.02 | 14.3 |

APS = mean difference over the robots read x 93 panel robots / 1217 pairings.
A/A: aa - c -0.06 pts over 93 robots; 1% band ±0.52 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 4091 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | ok | 14.6 a battle over the last 200 (first 200: 15.5) |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `aa after 20%` | halt | ok | aa - c -0.06 pts over 93 robots, stop band ±0.60 |

Stopping now would leave 373 battles unrun (about 5 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
17:56:48 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1544834; work D:\code\Hadur_Robot\hadur-bench\work
17:56:48 start prep
17:56:50 progress pushed to origin claude/pc-field-screen-progress (every 15 min)
18:01:40 prep exit=0 in 291 s
18:01:40 start livematch
18:01:40 watching livematch: 3 stop rule(s)
18:01:47 livematch exit=0 in 7 s
18:01:47 start screen
18:01:47 watching screen: 5 stop rule(s)
18:01:50 progress screen: 0/4464 (0%) battles, 0 failed
18:32:12 progress screen: 2173/4464 (49%) battles, 4302/h, ETA 32 min, 0 failed, skips 14.7/battle (last 100), aa +0.01, fq +0.01, x5 -0.08, hl +0.03, dg +0.01, gl -0.01, mq -0.03
```
