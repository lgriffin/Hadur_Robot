# Queue pc-field-screen: progress

Updated 2026-11-25 13:23:38 PC time (13:23 UTC), runner pid 36288.

- `prep` done, exit 0 in 5 min
- `livematch` done, exit 0 in 8 min
- `screen` running
- `pick` pending
- `lock` pending
- `gate` pending
- `pr` pending

### livematch

**124 of 124 battles** (100%), 0 failed. Running 9 min, 875 battles/h, about 0 min left (ends ~12:21 PC time). Last battle 0 min ago.
Skipped turns a battle: 6.2 overall, first 100 6.3, last 100 6.1; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 62 | 0 | 70.56 | - | - | - | 11.3 |
| bb | 62 | 0 | 83.28 | +0.32 (31 robots) | ±0.07 | +0.22 .. +0.43 | 1.2 |

APS = mean difference over the robots read x 31 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 124 |
| `dead 8` | halt | ok | every arm scoring |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

> warning: arm c's jar bisect/live/hadur117.Hadur_3.22.jar was built 235 h before this step started: check it is not stale

> warning: arm bb's jar opponents/kc.mega.BeepBoop_2.0.jar was built 222 h before this step started: check it is not stale

### screen

**3413 of 5760 battles** (59%), 0 failed. Running 1.0 h, 2968 battles/h, about 47 min left (ends ~14:11 PC time). Last battle 0 min ago.
Skipped turns a battle: 15.4 overall, first 100 16.1, last 100 18.5; engine disables 21.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 423 | 0 | 84.95 | - | - | - | 15.6 |
| aa | 426 | 0 | 84.96 | +0.00 (118 robots) | ±0.04 | -0.06 .. +0.06 | 15.7 |
| hof | 430 | 0 | 83.40 | -0.15 (118 robots) | ±0.05 | -0.23 .. -0.08 | 15.6 |
| rwl | 426 | 0 | 84.95 | -0.00 (118 robots) | ±0.04 | -0.06 .. +0.06 | 15.4 |
| qw | 426 | 0 | 84.08 | -0.09 (118 robots) | ±0.04 | -0.15 .. -0.03 | 15.7 |
| sb | 428 | 0 | 82.97 | -0.19 (118 robots) | ±0.11 | -0.36 .. -0.03 | 15.5 |
| vj | 424 | 0 | 84.85 | -0.01 (118 robots) | ±0.04 | -0.07 .. +0.04 | 15.3 |
| or | 430 | 0 | 75.35 | -0.95 (118 robots) | ±0.21 | -1.28 .. -0.63 | 14.7 |

APS = mean difference over the robots read x 120 panel robots / 1217 pairings.
A/A: aa - c +0.00 pts over 118 robots; 1% band ±0.57 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 3413 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | ok | 17.3 a battle over the last 200 (first 200: 15.6) |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `aa after 20%` | halt | ok | aa - c +0.00 pts over 118 robots, stop band ±0.66 |

Stopping now would leave 2347 battles unrun (about 47 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
19:17:14 start pr
19:17:20 pr exit=0 in 6 s
19:17:20 ALLDONE
12:07:49 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1544834; work D:\code\Hadur_Robot\hadur-bench\work
12:07:49 start prep
12:07:52 progress pushed to origin claude/pc-field-screen-progress (every 15 min)
12:12:36 prep exit=0 in 286 s
12:12:36 start livematch
12:12:36 watching livematch: 3 stop rule(s)
12:12:52 progress livematch: 2/124 (2%) battles, 447/h, ETA 16 min, 0 failed, skips 1.0/battle (last 100)
12:21:06 livematch exit=0 in 510 s
12:21:06 start screen
12:21:06 watching screen: 5 stop rule(s)
12:43:13 progress screen: 1364/5760 (24%) battles, 3702/h, ETA 1.2 h, 0 failed, skips 14.4/battle (last 100), aa -0.00, hof -0.14, rwl +0.03, qw -0.11, sb -0.19, vj -0.03, or -0.88
13:13:35 progress screen: 2855/5760 (50%) battles, 2944/h, ETA 59 min, 0 failed, skips 15.3/battle (last 100), aa -0.00, hof -0.16, rwl -0.00, qw -0.09, sb -0.19, vj -0.03, or -0.96
```
