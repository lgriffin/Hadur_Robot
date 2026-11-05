# Queue pc-mirror: progress

Updated 2026-11-05 11:48:45 PC time (11:48 UTC), runner pid 55080.

- `prep` done, exit 0 in 1 min
- `pilot` done, exit 0 in 38 min
- `mirror` running
- `read` pending
- `pr` pending

### pilot

**1820 of 1820 battles** (100%), 0 failed, 784 read back from an earlier run. Running 38 min, 1642 battles/h, about 0 min left (ends ~08:54 PC time). Last battle 0 min ago.
Skipped turns a battle: 127.9 overall, first 100 126.8, last 100 187.0; engine disables 6.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 364 | 0 | 75.61 | - | - | - | 29.9 |
| aa | 364 | 0 | 75.27 | -0.03 (91 robots) | ±0.05 | -0.10 .. +0.05 | 30.5 |
| bb | 364 | 0 | 85.99 | +0.79 (91 robots) | ±0.11 | +0.63 .. +0.95 | 197.2 |
| sg | 364 | 0 | 72.03 | -0.26 (91 robots) | ±0.25 | -0.63 .. +0.12 | 175.5 |
| ns | 364 | 0 | 86.77 | +0.85 (91 robots) | ±0.11 | +0.68 .. +1.02 | 155.3 |

APS = mean difference over the robots read x 91 panel robots / 1217 pairings.
A/A: aa - c -0.34 pts over 91 robots; 1% band ±0.61 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 1820 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200 arms c aa` | halt | ok | 27.7 a battle over the last 200 (first 200: 31.4) |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

> warning: arm bb's jar opponents/kc.mega.BeepBoop_2.0.jar was built 715 h before this step started: check it is not stale

> warning: arm sg's jar opponents/oog.mega.saguaro.Saguaro_1.0.jar was built 715 h before this step started: check it is not stale

> warning: arm ns's jar opponents/jd.Nullstride_2.3.3.jar was built 682 h before this step started: check it is not stale

### mirror

**7146 of 10920 battles** (65%), 0 failed, 1820 read back from an earlier run. Running 2.9 h, 1888 battles/h, about 2.0 h left (ends ~13:48 PC time). Last battle 0 min ago.
Skipped turns a battle: 124.5 overall, first 100 60.4, last 100 74.0; engine disables 33.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 1430 | 0 | 75.39 | - | - | - | 30.6 |
| aa | 1429 | 0 | 75.02 | -0.03 (91 robots) | ±0.02 | -0.06 .. +0.01 | 30.5 |
| bb | 1429 | 0 | 85.96 | +0.80 (91 robots) | ±0.10 | +0.65 .. +0.96 | 207.1 |
| sg | 1430 | 0 | 71.45 | -0.28 (91 robots) | ±0.24 | -0.66 .. +0.09 | 183.8 |
| ns | 1428 | 0 | 86.52 | +0.85 (91 robots) | ±0.10 | +0.69 .. +1.00 | 161.8 |

APS = mean difference over the robots read x 91 panel robots / 1217 pairings.
A/A: aa - c -0.37 pts over 91 robots; 1% band ±0.31 (OUTSIDE: comparisons void).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 7146 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200 arms c aa` | halt | ok | 30.2 a battle over the last 200 (first 200: 29.4) |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 3774 battles unrun (about 2.0 h); every battle already fought is kept and a rerun resumes from it.

> warning: arm bb's jar opponents/kc.mega.BeepBoop_2.0.jar was built 715 h before this step started: check it is not stale

> warning: arm sg's jar opponents/oog.mega.saguaro.Saguaro_1.0.jar was built 715 h before this step started: check it is not stale

> warning: arm ns's jar opponents/jd.Nullstride_2.3.3.jar was built 683 h before this step started: check it is not stale

### Queue log (last lines)

```
08:17:07 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant calibrated; work D:\code\Hadur_Robot\hadur-bench\work
08:17:07 skip prep (already exit=0)
08:17:07 start pilot
08:17:07 watching pilot: 4 stop rule(s)
08:17:09 progress pushed to origin claude/pc-mirror-progress (every 15 min)
08:18:07 progress pilot: 802/1820 (44%) battles, 1071/h, ETA 57 min, 0 failed, skips 73.1/battle (last 100), aa -0.01, bb +0.79, sg -0.24, ns +0.81
08:48:29 progress pilot: 1693/1820 (93%) battles, 1754/h, ETA 4 min, 0 failed, skips 173.5/battle (last 100), aa -0.03, bb +0.80, sg -0.26, ns +0.85
08:54:42 pilot exit=0 in 2255 s
08:54:42 start mirror
08:54:42 watching mirror: 4 stop rule(s)
09:18:52 progress mirror: 2559/10920 (23%) battles, 1836/h, ETA 4.6 h, 0 failed, skips 153.9/battle (last 100), aa -0.03, bb +0.78, sg -0.27, ns +0.85
09:49:16 progress mirror: 3503/10920 (32%) battles, 1868/h, ETA 4.0 h, 0 failed, skips 147.5/battle (last 100), aa -0.02, bb +0.79, sg -0.27, ns +0.84
10:19:26 progress mirror: 4344/10920 (40%) battles, 1678/h, ETA 3.9 h, 0 failed, skips 140.1/battle (last 100), aa -0.01, bb +0.79, sg -0.27, ns +0.85
10:49:32 progress mirror: 5261/10920 (48%) battles, 1832/h, ETA 3.1 h, 0 failed, skips 96.7/battle (last 100), aa -0.02, bb +0.80, sg -0.27, ns +0.84
11:19:38 progress mirror: 6230/10920 (57%) battles, 1936/h, ETA 2.4 h, 0 failed, skips 219.8/battle (last 100), aa -0.02, bb +0.80, sg -0.28, ns +0.84
```
