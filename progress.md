# Queue pc-locks: progress

Updated 2026-11-16 16:55:25 PC time (16:55 UTC), runner pid 14188.

- `prep` done, exit 0 in 5 min
- `livematch` done, exit 0 in 0 min
- `lock` running
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

> warning: arm c's jar bisect/live/hadur117.Hadur_3.22.jar was built 23 h before this step started: check it is not stale

### lock

**442 of 2400 battles** (18%), 0 failed. Running 10 min, 2662 battles/h, about 44 min left (ends ~17:39 PC time). Last battle 0 min ago.
Skipped turns a battle: 11.7 overall, first 100 13.0, last 100 11.2; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 55 | 0 | 83.88 | - | - | - | 12.0 |
| aa | 57 | 0 | 84.48 | +0.03 (21 robots) | ±0.04 | -0.04 .. +0.10 | 12.3 |
| mv | 56 | 0 | 87.73 | +0.08 (20 robots) | ±0.05 | -0.00 .. +0.16 | 11.9 |
| rp | 54 | 0 | 84.06 | -0.00 (20 robots) | ±0.03 | -0.05 .. +0.04 | 11.4 |
| pb | 51 | 0 | 84.01 | -0.01 (20 robots) | ±0.03 | -0.06 .. +0.04 | 11.2 |
| hl | 57 | 0 | 85.63 | +0.03 (20 robots) | ±0.03 | -0.01 .. +0.08 | 11.8 |
| vj | 58 | 0 | 84.82 | +0.02 (21 robots) | ±0.04 | -0.05 .. +0.09 | 11.7 |
| x0 | 54 | 0 | 83.84 | -0.00 (21 robots) | ±0.04 | -0.06 .. +0.05 | 11.5 |

APS = mean difference over the robots read x 25 panel robots / 1217 pairings.
A/A: aa - c +1.38 pts over 21 robots; 1% band ±1.57 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 442 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 24` | halt | ok | 11.5 a battle over the last 24 (first 24: 13.0) |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 1958 battles unrun (about 44 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
08:17:35 start gate
08:17:36 gate exit=0 in 0 s
08:17:36 start pr
08:17:42 pr exit=0 in 6 s
08:17:42 ALLDONE
16:40:14 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1544834; work D:\code\Hadur_Robot\hadur-bench\work
16:40:14 start prep
16:40:17 progress pushed to origin claude/pc-locks-progress (every 15 min)
16:45:19 prep exit=0 in 304 s
16:45:19 start livematch
16:45:19 watching livematch: 3 stop rule(s)
16:45:27 livematch exit=0 in 8 s
16:45:27 start lock
16:45:27 watching lock: 4 stop rule(s)
16:46:17 progress lock: 37/2400 (2%) battles, 2638/h, ETA 54 min, 0 failed, skips 13.7/battle (last 100), aa +0.02, rp -0.00, pb +0.14, hl +0.07, vj +0.02, x0 +0.09
```
