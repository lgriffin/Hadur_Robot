# Queue pc-mirror: progress

Updated 2026-11-05 14:28:24 PC time (14:28 UTC), runner pid 55080.

- `prep` done, exit 0 in 1 min
- `pilot` done, exit 0 in 38 min
- `mirror` done, exit 0 in 5.6 h
- `read` done, exit 0 in 0 min
- `pr` done, exit 0 in 0 min

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

**10920 of 10920 battles** (100%), 0 failed, 1820 read back from an earlier run. Running 5.6 h, 460 battles/h, about 0 min left (ends ~14:28 PC time). Last battle 2 min ago.
Skipped turns a battle: 105.4 overall, first 100 60.4, last 100 109.8; engine disables 182.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 2184 | 0 | 75.23 | - | - | - | 29.4 |
| aa | 2184 | 0 | 75.08 | -0.01 (91 robots) | ±0.02 | -0.04 .. +0.02 | 29.4 |
| bb | 2184 | 0 | 86.18 | +0.82 (91 robots) | ±0.10 | +0.67 .. +0.98 | 176.1 |
| sg | 2184 | 0 | 71.91 | -0.24 (91 robots) | ±0.23 | -0.59 .. +0.10 | 162.4 |
| ns | 2184 | 0 | 86.73 | +0.87 (91 robots) | ±0.10 | +0.71 .. +1.02 | 139.9 |

APS = mean difference over the robots read x 91 panel robots / 1217 pairings.
A/A: aa - c -0.15 pts over 91 robots; 1% band ±0.25 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 10920 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200 arms c aa` | halt | ok | 30.4 a battle over the last 200 (first 200: 29.4) |
| `stall 30m` | halt | ok | last battle 2 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

> warning: arm bb's jar opponents/kc.mega.BeepBoop_2.0.jar was built 715 h before this step started: check it is not stale

> warning: arm sg's jar opponents/oog.mega.saguaro.Saguaro_1.0.jar was built 715 h before this step started: check it is not stale

> warning: arm ns's jar opponents/jd.Nullstride_2.3.3.jar was built 683 h before this step started: check it is not stale

### Queue log (last lines)

```
10:19:26 progress mirror: 4344/10920 (40%) battles, 1678/h, ETA 3.9 h, 0 failed, skips 140.1/battle (last 100), aa -0.01, bb +0.79, sg -0.27, ns +0.85
10:49:32 progress mirror: 5261/10920 (48%) battles, 1832/h, ETA 3.1 h, 0 failed, skips 96.7/battle (last 100), aa -0.02, bb +0.80, sg -0.27, ns +0.84
11:19:38 progress mirror: 6230/10920 (57%) battles, 1936/h, ETA 2.4 h, 0 failed, skips 219.8/battle (last 100), aa -0.02, bb +0.80, sg -0.28, ns +0.84
11:49:45 progress mirror: 7183/10920 (66%) battles, 1896/h, ETA 2.0 h, 0 failed, skips 11.1/battle (last 100), aa -0.03, bb +0.81, sg -0.28, ns +0.85
12:19:51 progress mirror: 8014/10920 (73%) battles, 1654/h, ETA 1.8 h, 0 failed, skips 3.8/battle (last 100), aa -0.02, bb +0.82, sg -0.25, ns +0.86
12:50:01 progress mirror: 8821/10920 (81%) battles, 1602/h, ETA 1.3 h, 0 failed, skips 175.3/battle (last 100), aa -0.03, bb +0.83, sg -0.23, ns +0.87
13:20:18 progress mirror: 9699/10920 (89%) battles, 1748/h, ETA 42 min, 0 failed, skips 66.1/battle (last 100), aa -0.02, bb +0.83, sg -0.24, ns +0.86
13:50:35 progress mirror: 10502/10920 (96%) battles, 1580/h, ETA 16 min, 0 failed, skips 167.0/battle (last 100), aa -0.01, bb +0.83, sg -0.24, ns +0.87
14:20:49 progress mirror: 10917/10920 (100%) battles, 824/h, ETA 0 min, 0 failed, skips 110.0/battle (last 100), aa -0.01, bb +0.82, sg -0.24, ns +0.87
14:28:14 mirror exit=0 in 20011 s
14:28:14 start read
14:28:15 read exit=0 in 0 s
14:28:15 start pr
14:28:24 pr exit=0 in 8 s
14:28:24 ALLDONE
```
