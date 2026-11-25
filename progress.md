# Queue pc-field-screen: progress

Updated 2026-11-25 12:22:57 PC time (12:22 UTC), runner pid 36288.

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

**111 of 5760 battles** (2%), 0 failed. Running 2 min, 3626 battles/h, about 1.6 h left (ends ~13:56 PC time). Last battle 0 min ago.
Skipped turns a battle: 16.1 overall, first 100 16.1, last 100 15.9; engine disables 2.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 13 | 0 | 82.27 | - | - | - | 16.3 |
| aa | 14 | 0 | 83.69 | +0.12 (11 robots) | ±0.24 | -0.25 .. +0.49 | 16.2 |
| hof | 14 | 0 | 83.54 | -0.19 (9 robots) | ±0.19 | -0.48 .. +0.09 | 17.4 |
| rwl | 13 | 0 | 84.25 | +0.05 (9 robots) | ±0.15 | -0.18 .. +0.28 | 15.5 |
| qw | 17 | 0 | 84.90 | +0.07 (10 robots) | ±0.20 | -0.23 .. +0.37 | 17.2 |
| sb | 13 | 0 | 81.22 | -0.10 (10 robots) | ±0.22 | -0.44 .. +0.23 | 15.8 |
| vj | 14 | 0 | 82.36 | -0.02 (10 robots) | ±0.16 | -0.27 .. +0.22 | 14.7 |
| or | 13 | 0 | 76.91 | -0.53 (9 robots) | ±0.67 | -1.55 .. +0.49 | 15.3 |

APS = mean difference over the robots read x 120 panel robots / 1217 pairings.
A/A: aa - c +1.22 pts over 11 robots; 1% band ±3.52 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 111 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | waiting | 111 of 200 battles to read |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `aa after 20%` | halt | waiting | checks from 20% of the battles (now 2%) |

Stopping now would leave 5649 battles unrun (about 1.6 h); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
19:17:13 start gate
19:17:14 gate exit=0 in 0 s
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
```
