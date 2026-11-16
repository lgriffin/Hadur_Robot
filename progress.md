# Queue pc-locks: progress

Updated 2026-11-16 07:20:50 PC time (07:20 UTC), runner pid 38916.

- `prep` done, exit 0 in 6 min
- `livematch` done, exit 0 in 0 min
- `lock` running
- `gate` skipped
- `pr` skipped

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

> warning: arm c's jar bisect/live/hadur117.Hadur_3.22.jar was built 13 h before this step started: check it is not stale

### lock

**1402 of 1404 battles** (100%), 0 failed. Running 39 min, 1880 battles/h, about 0 min left (ends ~07:20 PC time). Last battle 0 min ago.
Skipped turns a battle: 11.8 overall, first 100 13.8, last 100 10.7; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 156 | 0 | 81.04 | - | - | - | 11.6 |
| aa | 156 | 0 | 81.63 | +0.01 (13 robots) | ±0.01 | -0.01 .. +0.02 | 11.9 |
| mtzl | 155 | 0 | 84.26 | +0.03 (13 robots) | ±0.03 | -0.01 .. +0.08 | 12.0 |
| gl | 156 | 0 | 81.71 | +0.00 (13 robots) | ±0.01 | -0.01 .. +0.01 | 12.0 |
| hl | 155 | 0 | 81.48 | +0.00 (13 robots) | ±0.01 | -0.01 .. +0.01 | 11.7 |
| x5 | 156 | 0 | 82.15 | +0.01 (13 robots) | ±0.01 | -0.01 .. +0.03 | 11.8 |
| mq | 156 | 0 | 82.06 | +0.01 (13 robots) | ±0.01 | -0.00 .. +0.02 | 11.8 |
| hf | 156 | 0 | 81.80 | +0.00 (13 robots) | ±0.01 | -0.01 .. +0.02 | 11.6 |
| fp | 156 | 0 | 81.49 | +0.00 (13 robots) | ±0.01 | -0.02 .. +0.02 | 11.9 |

APS = mean difference over the robots read x 13 panel robots / 1217 pairings.
A/A: aa - c +0.59 pts over 13 robots; 1% band ±0.93 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 1402 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 24` | halt | ok | 9.6 a battle over the last 24 (first 24: 15.3) |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 2 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
06:34:32 skip lock (after livematch, which has not finished exit=0)
06:34:32 skip gate (after lock, which has not finished exit=0)
06:34:32 skip pr (after gate, which has not finished exit=0)
06:34:32 ALLDONE
06:35:22 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1544834; work D:\code\Hadur_Robot\hadur-bench\work
06:35:22 start prep
06:35:25 progress pushed to origin claude/pc-locks-progress (every 15 min)
06:41:49 prep exit=0 in 386 s
06:41:49 start livematch
06:41:49 watching livematch: 3 stop rule(s)
06:41:58 livematch exit=0 in 9 s
06:41:58 start lock
06:41:58 watching lock: 4 stop rule(s)
06:42:25 progress lock: 17/1404 (1%) battles, 2256/h, ETA 37 min, 0 failed, skips 16.2/battle (last 100)
07:12:46 progress lock: 1344/1404 (96%) battles, 2606/h, ETA 1 min, 0 failed, skips 11.6/battle (last 100), aa +0.01, mtzl +0.03, gl +0.00, hl +0.00, x5 +0.01, mq +0.01, hf +0.01, fp +0.00
```
