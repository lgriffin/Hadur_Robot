# Queue pc-locks: progress

Updated 2026-11-25 15:44:09 PC time (15:44 UTC), runner pid 27028.

- `prep` done, exit 0 in 4 min
- `livematch` done, exit 0 in 9 min
- `lock` running
- `stage` pending
- `lock-ky` pending
- `lock-rwl` pending
- `lock-ty` pending
- `lock-x0` pending
- `gate` pending
- `pr` pending

### livematch

**124 of 124 battles** (100%), 0 failed. Running 9 min, 818 battles/h, about 0 min left (ends ~15:42 PC time). Last battle 0 min ago.
Skipped turns a battle: 1.5 overall, first 100 1.5, last 100 1.6; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 62 | 0 | 71.14 | - | - | - | 3.0 |
| bb | 62 | 0 | 84.46 | +0.34 (31 robots) | ±0.07 | +0.24 .. +0.44 | 0.0 |

APS = mean difference over the robots read x 31 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 124 |
| `dead 8` | halt | ok | every arm scoring |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

> warning: arm c's jar bisect/live/hadur117.Hadur_3.22.jar was built 238 h before this step started: check it is not stale

> warning: arm bb's jar opponents/kc.mega.BeepBoop_2.0.jar was built 225 h before this step started: check it is not stale

### lock

**182 of 624 battles** (29%), 0 failed. Running 2 min, 5352 battles/h, about 5 min left (ends ~15:49 PC time). Last battle 0 min ago.
Skipped turns a battle: 7.3 overall, first 100 7.4, last 100 7.3; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 90 | 0 | 95.36 | - | - | - | 7.3 |
| aa | 92 | 0 | 95.30 | -0.00 (13 robots) | ±0.01 | -0.01 .. +0.01 | 7.4 |

APS = mean difference over the robots read x 13 panel robots / 1217 pairings.
A/A: aa - c -0.06 pts over 13 robots; 1% band ±1.22 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 182 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 24` | halt | ok | 7.2 a battle over the last 24 (first 24: 6.1) |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 442 battles unrun (about 5 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
12:07:35 start gate
12:07:37 gate exit=0 in 1 s
12:07:37 start pr
12:07:44 pr exit=0 in 7 s
12:07:44 ALLDONE
15:29:02 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1544834; work D:\code\Hadur_Robot\hadur-bench\work
15:29:02 start prep
15:29:05 progress pushed to origin claude/pc-locks-progress (every 15 min)
15:33:00 prep exit=0 in 238 s
15:33:00 start livematch
15:33:00 watching livematch: 3 stop rule(s)
15:33:04 progress livematch: 0/124 (0%) battles, 0 failed
15:42:06 livematch exit=0 in 545 s
15:42:06 start lock
15:42:06 watching lock: 4 stop rule(s)
```
