# Queue pc-clinch: progress

Updated 2026-11-28 15:06:45 PC time (15:06 UTC), runner pid 55448.

- `prep` done, exit 0 in 3 min
- `livematch` done, exit 0 in 8 min
- `census` running
- `gate` pending
- `pr` pending

### livematch

**124 of 124 battles** (100%), 0 failed. Running 8 min, 925 battles/h, about 0 min left (ends ~15:02 PC time). Last battle 0 min ago.
Skipped turns a battle: 5.7 overall, first 100 5.3, last 100 5.8; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 62 | 0 | 70.91 | - | - | - | 10.4 |
| bb | 62 | 0 | 84.54 | +0.35 (31 robots) | ±0.07 | +0.25 .. +0.45 | 0.9 |

APS = mean difference over the robots read x 31 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 124 |
| `dead 8` | halt | ok | every arm scoring |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

> warning: arm c's jar bisect/live/hadur117.Hadur_3.22.jar was built 309 h before this step started: check it is not stale

> warning: arm bb's jar opponents/kc.mega.BeepBoop_2.0.jar was built 296 h before this step started: check it is not stale

### census

**100 of 9696 battles** (1%), 0 failed. Running 4 min, 1343 battles/h, about 7.1 h left (ends ~22:15 PC time). Last battle 0 min ago.
Skipped turns a battle: 43.1 overall, first 100 43.1, last 100 43.1; engine disables 45.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 28 | 0 | 94.34 | - | - | - | 41.2 |
| aa | 22 | 0 | 92.08 | -0.26 (20 robots) | ±1.64 | -2.77 .. +2.25 | 51.2 |
| cb | 24 | 0 | 94.65 | -0.02 (17 robots) | ±0.87 | -1.35 .. +1.31 | 38.0 |
| cbe | 26 | 0 | 95.58 | +0.17 (17 robots) | ±1.50 | -2.12 .. +2.46 | 43.0 |

APS = mean difference over the robots read x 1212 panel robots / 1217 pairings.
A/A: aa - c -0.27 pts over 20 robots; 1% band ±2.61 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 100 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200 arms c aa` | halt | waiting | 50 of 200 battles to read |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `aa after 20%` | halt | waiting | checks from 20% of the battles (now 1%) |
| `futility cb,cbe below 0.02 after 30%` | finish | waiting | checks from 30% of the battles (now 1%) |

Stopping now would leave 9596 battles unrun (about 7.1 h); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
14:51:38 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1544834; work D:\code\Hadur_Robot\hadur-bench\work
14:51:38 start prep
14:51:40 progress pushed to origin claude/pc-clinch-progress (every 15 min)
14:54:14 prep exit=0 in 156 s
14:54:14 start livematch
14:54:14 watching livematch: 3 stop rule(s)
14:54:39 progress livematch: 10/124 (8%) battles, 1427/h, ETA 5 min, 0 failed, skips 5.4/battle (last 100), bb +0.23
15:02:16 livematch exit=0 in 482 s
15:02:16 start census
15:02:17 watching census: 6 stop rule(s)
```
