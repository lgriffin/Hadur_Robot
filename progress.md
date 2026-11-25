# Queue pc-field-screen: progress

Updated 2026-11-25 12:38:08 PC time (12:38 UTC), runner pid 36288.

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

**1076 of 5760 battles** (19%), 0 failed. Running 17 min, 3792 battles/h, about 1.2 h left (ends ~13:52 PC time). Last battle 0 min ago.
Skipped turns a battle: 15.7 overall, first 100 16.1, last 100 15.8; engine disables 13.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 134 | 0 | 85.06 | - | - | - | 16.2 |
| aa | 136 | 0 | 84.95 | -0.01 (86 robots) | ±0.07 | -0.12 .. +0.10 | 15.4 |
| hof | 133 | 0 | 84.07 | -0.10 (85 robots) | ±0.07 | -0.21 .. +0.00 | 16.2 |
| rwl | 132 | 0 | 85.59 | +0.06 (85 robots) | ±0.07 | -0.04 .. +0.17 | 15.9 |
| qw | 135 | 0 | 84.11 | -0.08 (85 robots) | ±0.07 | -0.18 .. +0.02 | 16.2 |
| sb | 136 | 0 | 83.06 | -0.17 (86 robots) | ±0.15 | -0.41 .. +0.06 | 15.9 |
| vj | 136 | 0 | 84.46 | -0.04 (85 robots) | ±0.08 | -0.16 .. +0.08 | 15.2 |
| or | 134 | 0 | 76.40 | -0.84 (84 robots) | ±0.24 | -1.21 .. -0.47 | 15.0 |

APS = mean difference over the robots read x 120 panel robots / 1217 pairings.
A/A: aa - c -0.08 pts over 86 robots; 1% band ±1.01 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 1076 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | ok | 15.8 a battle over the last 200 (first 200: 15.6) |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `aa after 20%` | halt | waiting | checks from 20% of the battles (now 19%) |

Stopping now would leave 4684 battles unrun (about 1.2 h); every battle already fought is kept and a rerun resumes from it.

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
