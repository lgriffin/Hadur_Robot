# Queue pc-rc-confirm: progress

Updated 2026-11-25 23:18:50 PC time (23:18 UTC), runner pid 105672.

- `prep` done, exit 0 in 2 min
- `livematch` done, exit 0 in 8 min
- `field` running
- `ret` pending
- `gate112` pending
- `gate` pending
- `pr` pending

### livematch

**124 of 124 battles** (100%), 0 failed. Running 8 min, 956 battles/h, about 0 min left (ends ~21:42 PC time). Last battle 0 min ago.
Skipped turns a battle: 5.3 overall, first 100 4.8, last 100 5.4; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 62 | 0 | 69.81 | - | - | - | 9.7 |
| bb | 62 | 0 | 84.49 | +0.37 (31 robots) | ±0.06 | +0.28 .. +0.47 | 0.9 |

APS = mean difference over the robots read x 31 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 124 |
| `dead 8` | halt | ok | every arm scoring |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

> warning: arm c's jar bisect/live/hadur117.Hadur_3.22.jar was built 244 h before this step started: check it is not stale

> warning: arm bb's jar opponents/kc.mega.BeepBoop_2.0.jar was built 231 h before this step started: check it is not stale

### field

**1919 of 3636 battles** (53%), 0 failed. Running 1.6 h, 1054 battles/h, about 1.6 h left (ends ~00:56 PC time). Last battle 0 min ago.
Skipped turns a battle: 38.6 overall, first 100 34.8, last 100 32.9; engine disables 753.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| rel | 643 | 0 | 93.41 | -0.49 (632 robots) | ±0.27 | -0.90 .. -0.07 | 38.4 |
| c | 640 | 0 | 93.76 | - | - | - | 39.6 |
| aa | 636 | 0 | 93.98 | +0.23 (632 robots) | ±0.23 | -0.12 .. +0.58 | 37.8 |

APS = mean difference over the robots read x 1212 panel robots / 1217 pairings.
A/A: aa - c +0.23 pts over 632 robots; 1% band ±0.46 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 1919 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 90 over 200` | halt | ok | 36.9 a battle over the last 200 (first 200: 34.8) |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `aa after 20%` | halt | ok | aa - c +0.23 pts over 632 robots, stop band ±0.54 |

Stopping now would leave 1717 battles unrun (about 1.6 h); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
01:26:06 pr exit=0 in 9 s
01:26:06 ALLDONE
21:32:46 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1544834; work D:\code\Hadur_Robot\hadur-bench\work
21:32:46 start prep
21:32:49 progress pushed to origin claude/pc-rc-confirm-progress (every 15 min)
21:34:30 prep exit=0 in 103 s
21:34:30 start livematch
21:34:30 watching livematch: 3 stop rule(s)
21:34:47 progress livematch: 2/124 (2%) battles, 421/h, ETA 17 min, 0 failed, skips 1.0/battle (last 100)
21:42:17 livematch exit=0 in 467 s
21:42:17 start field
21:42:17 watching field: 5 stop rule(s)
22:05:03 progress field: 515/3636 (14%) battles, 1357/h, ETA 2.3 h, 0 failed, skips 36.9/battle (last 100), rel -0.28, aa -0.12
22:35:22 progress field: 1131/3636 (31%) battles, 1206/h, ETA 2.1 h, 0 failed, skips 39.7/battle (last 100), rel -0.40, aa +0.21
23:05:42 progress field: 1692/3636 (47%) battles, 1112/h, ETA 1.7 h, 0 failed, skips 37.8/battle (last 100), rel -0.37, aa +0.20
```
