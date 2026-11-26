# Queue pc-locks: progress

Updated 2026-11-26 17:55:30 PC time (17:55 UTC), runner pid 99520.

- `prep` done, exit 0 in 3 min
- `livematch` done, exit 0 in 8 min
- `lock` running
- `stage` pending
- `lock-gl` pending
- `lock-cpl` pending
- `lock-rwl` pending
- `gate` pending
- `pr` pending

### livematch

**124 of 124 battles** (100%), 0 failed. Running 8 min, 923 battles/h, about 0 min left (ends ~17:51 PC time). Last battle 0 min ago.
Skipped turns a battle: 5.2 overall, first 100 4.9, last 100 5.4; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 62 | 0 | 70.11 | - | - | - | 9.5 |
| bb | 62 | 0 | 85.02 | +0.38 (31 robots) | ±0.06 | +0.29 .. +0.47 | 1.0 |

APS = mean difference over the robots read x 31 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 124 |
| `dead 8` | halt | ok | every arm scoring |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

> warning: arm c's jar bisect/live/hadur117.Hadur_3.22.jar was built 264 h before this step started: check it is not stale

> warning: arm bb's jar opponents/kc.mega.BeepBoop_2.0.jar was built 251 h before this step started: check it is not stale

### lock

**413 of 2448 battles** (17%), 0 failed. Running 4 min, 5990 battles/h, about 20 min left (ends ~18:15 PC time). Last battle 0 min ago.
Skipped turns a battle: 14.8 overall, first 100 14.8, last 100 15.8; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 208 | 0 | 96.46 | - | - | - | 14.9 |
| aa | 205 | 0 | 96.13 | -0.02 (50 robots) | ±0.02 | -0.04 .. +0.01 | 14.6 |

APS = mean difference over the robots read x 51 panel robots / 1217 pairings.
A/A: aa - c -0.36 pts over 50 robots; 1% band ±0.81 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 413 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 24` | halt | ok | 15.6 a battle over the last 24 (first 24: 17.5) |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 2035 battles unrun (about 20 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
08:12:48 start gate
08:12:50 gate exit=0 in 1 s
08:12:50 start pr
08:12:57 pr exit=0 in 6 s
08:12:57 ALLDONE
17:40:23 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1544834; work D:\code\Hadur_Robot\hadur-bench\work
17:40:23 start prep
17:40:26 progress pushed to origin claude/pc-locks-progress (every 15 min)
17:43:18 prep exit=0 in 174 s
17:43:18 start livematch
17:43:18 watching livematch: 3 stop rule(s)
17:43:24 progress livematch: 0/124 (0%) battles, 0 failed
17:51:21 livematch exit=0 in 483 s
17:51:21 start lock
17:51:21 watching lock: 4 stop rule(s)
```
