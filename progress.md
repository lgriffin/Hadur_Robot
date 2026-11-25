# Queue pc-field-screen: progress

Updated 2026-11-25 13:38:41 PC time (13:38 UTC), runner pid 36288.

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

**4302 of 5760 battles** (75%), 0 failed. Running 1.3 h, 3352 battles/h, about 26 min left (ends ~14:04 PC time). Last battle 0 min ago.
Skipped turns a battle: 15.7 overall, first 100 16.1, last 100 14.8; engine disables 25.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 539 | 0 | 84.97 | - | - | - | 15.9 |
| aa | 537 | 0 | 84.99 | +0.00 (120 robots) | ±0.03 | -0.04 .. +0.05 | 16.0 |
| hof | 536 | 0 | 83.27 | -0.17 (120 robots) | ±0.05 | -0.25 .. -0.09 | 15.7 |
| rwl | 537 | 0 | 84.93 | -0.01 (120 robots) | ±0.03 | -0.05 .. +0.04 | 15.7 |
| qw | 540 | 0 | 84.15 | -0.08 (120 robots) | ±0.04 | -0.14 .. -0.03 | 15.8 |
| sb | 537 | 0 | 83.03 | -0.19 (120 robots) | ±0.10 | -0.35 .. -0.04 | 15.6 |
| vj | 538 | 0 | 84.82 | -0.02 (120 robots) | ±0.03 | -0.07 .. +0.04 | 15.6 |
| or | 538 | 0 | 75.34 | -0.95 (120 robots) | ±0.21 | -1.27 .. -0.63 | 14.8 |

APS = mean difference over the robots read x 120 panel robots / 1217 pairings.
A/A: aa - c +0.02 pts over 120 robots; 1% band ±0.50 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 4302 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | ok | 14.4 a battle over the last 200 (first 200: 15.6) |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `aa after 20%` | halt | ok | aa - c +0.02 pts over 120 robots, stop band ±0.59 |

Stopping now would leave 1458 battles unrun (about 26 min); every battle already fought is kept and a rerun resumes from it.

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
