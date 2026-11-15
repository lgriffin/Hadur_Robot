# Queue pc-field-screen: progress

Updated 2026-11-15 18:11:57 PC time (18:11 UTC), runner pid 32872.

- `prep` done, exit 0 in 5 min
- `livematch` done, exit 0 in 0 min
- `screen` running
- `pick` pending
- `lock` pending
- `gate` pending
- `pr` pending

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

> warning: arm bb's jar opponents/kc.mega.BeepBoop_2.0.jar was built 964 h before this step started: check it is not stale

### screen

**778 of 4464 battles** (17%), 0 failed. Running 10 min, 4594 battles/h, about 48 min left (ends ~19:00 PC time). Last battle 0 min ago.
Skipped turns a battle: 14.4 overall, first 100 15.3, last 100 15.0; engine disables 1.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 97 | 0 | 83.43 | - | - | - | 14.5 |
| aa | 96 | 0 | 83.64 | +0.01 (69 robots) | ±0.08 | -0.12 .. +0.13 | 14.4 |
| fq | 98 | 0 | 83.20 | -0.01 (69 robots) | ±0.06 | -0.10 .. +0.09 | 14.2 |
| x5 | 97 | 0 | 82.72 | -0.06 (69 robots) | ±0.07 | -0.16 .. +0.05 | 14.5 |
| hl | 97 | 0 | 84.01 | +0.06 (68 robots) | ±0.08 | -0.07 .. +0.19 | 13.6 |
| dg | 98 | 0 | 83.23 | +0.00 (69 robots) | ±0.07 | -0.10 .. +0.10 | 14.1 |
| gl | 97 | 0 | 82.47 | -0.04 (66 robots) | ±0.08 | -0.15 .. +0.08 | 15.2 |
| mq | 98 | 0 | 82.77 | -0.01 (68 robots) | ±0.06 | -0.10 .. +0.08 | 15.0 |

APS = mean difference over the robots read x 93 panel robots / 1217 pairings.
A/A: aa - c +0.09 pts over 69 robots; 1% band ±1.19 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 778 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | ok | 14.7 a battle over the last 200 (first 200: 15.5) |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `aa after 20%` | halt | waiting | checks from 20% of the battles (now 17%) |

Stopping now would leave 3686 battles unrun (about 48 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
17:56:48 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1544834; work D:\code\Hadur_Robot\hadur-bench\work
17:56:48 start prep
17:56:50 progress pushed to origin claude/pc-field-screen-progress (every 15 min)
18:01:40 prep exit=0 in 291 s
18:01:40 start livematch
18:01:40 watching livematch: 3 stop rule(s)
18:01:47 livematch exit=0 in 7 s
18:01:47 start screen
18:01:47 watching screen: 5 stop rule(s)
18:01:50 progress screen: 0/4464 (0%) battles, 0 failed
```
