# Queue pc-field-screen: progress

Updated 2026-11-25 15:09:47 PC time (15:09 UTC), runner pid 36288.

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

**5759 of 5760 battles** (100%), 0 failed. Running 2.8 h, 10 battles/h, about 6 min left (ends ~15:15 PC time). Last battle 2 min ago.
Skipped turns a battle: 15.3 overall, first 100 16.1, last 100 11.8; engine disables 34.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 719 | 0 | 84.91 | - | - | - | 15.6 |
| aa | 720 | 0 | 85.11 | +0.02 (120 robots) | ±0.03 | -0.02 .. +0.06 | 15.8 |
| hof | 720 | 0 | 83.20 | -0.18 (120 robots) | ±0.05 | -0.25 .. -0.11 | 15.3 |
| rwl | 720 | 0 | 84.86 | -0.01 (120 robots) | ±0.03 | -0.05 .. +0.02 | 15.4 |
| qw | 720 | 0 | 84.19 | -0.08 (120 robots) | ±0.03 | -0.13 .. -0.04 | 15.5 |
| sb | 720 | 0 | 82.92 | -0.21 (120 robots) | ±0.10 | -0.36 .. -0.06 | 15.4 |
| vj | 720 | 0 | 84.80 | -0.02 (120 robots) | ±0.03 | -0.06 .. +0.02 | 15.3 |
| or | 720 | 0 | 75.15 | -0.97 (120 robots) | ±0.22 | -1.30 .. -0.64 | 14.5 |

APS = mean difference over the robots read x 120 panel robots / 1217 pairings.
A/A: aa - c +0.19 pts over 120 robots; 1% band ±0.44 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 5759 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | ok | 12.8 a battle over the last 200 (first 200: 15.6) |
| `stall 30m` | halt | ok | last battle 2 min ago |
| `aa after 20%` | halt | ok | aa - c +0.19 pts over 120 robots, stop band ±0.51 |

Stopping now would leave 1 battles unrun (about 6 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
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
13:43:43 progress screen: 4627/5760 (80%) battles, 3528/h, ETA 19 min, 0 failed, skips 15.2/battle (last 100), aa +0.01, hof -0.17, rwl -0.01, qw -0.08, sb -0.20, vj -0.01, or -0.94
14:13:57 progress screen: 5750/5760 (100%) battles, 2220/h, ETA 0 min, 0 failed, skips 12.9/battle (last 100), aa +0.02, hof -0.18, rwl -0.01, qw -0.08, sb -0.20, vj -0.02, or -0.97
14:44:24 progress screen: 5754/5760 (100%) battles, 8/h, ETA 45 min, 0 failed, skips 12.6/battle (last 100), aa +0.02, hof -0.18, rwl -0.02, qw -0.08, sb -0.20, vj -0.02, or -0.97
```
