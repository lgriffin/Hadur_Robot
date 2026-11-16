# Queue pc-locks: progress

Updated 2026-11-16 17:25:51 PC time (17:25 UTC), runner pid 14188.

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

**1907 of 2400 battles** (79%), 0 failed. Running 40 min, 2890 battles/h, about 10 min left (ends ~17:36 PC time). Last battle 0 min ago.
Skipped turns a battle: 11.9 overall, first 100 13.0, last 100 12.1; engine disables 5.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 239 | 0 | 85.79 | - | - | - | 11.8 |
| aa | 237 | 0 | 86.25 | +0.01 (25 robots) | ±0.02 | -0.02 .. +0.04 | 11.9 |
| mv | 239 | 0 | 89.47 | +0.07 (25 robots) | ±0.04 | +0.02 .. +0.13 | 12.2 |
| rp | 240 | 0 | 86.46 | +0.01 (25 robots) | ±0.02 | -0.02 .. +0.04 | 11.7 |
| pb | 237 | 0 | 86.09 | +0.00 (25 robots) | ±0.02 | -0.03 .. +0.03 | 11.7 |
| hl | 239 | 0 | 86.44 | +0.01 (25 robots) | ±0.02 | -0.02 .. +0.03 | 11.7 |
| vj | 237 | 0 | 86.92 | +0.02 (25 robots) | ±0.02 | -0.02 .. +0.06 | 12.0 |
| x0 | 239 | 0 | 86.80 | +0.02 (25 robots) | ±0.02 | -0.01 .. +0.04 | 12.0 |

APS = mean difference over the robots read x 25 panel robots / 1217 pairings.
A/A: aa - c +0.45 pts over 25 robots; 1% band ±0.76 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 1907 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 24` | halt | ok | 12.1 a battle over the last 24 (first 24: 13.0) |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 493 battles unrun (about 10 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
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
17:16:43 progress lock: 1461/2400 (61%) battles, 2794/h, ETA 20 min, 0 failed, skips 12.0/battle (last 100), aa +0.01, mv +0.08, rp +0.01, pb +0.00, hl +0.01, vj +0.02, x0 +0.02
```
