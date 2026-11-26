# Queue pc-locks: progress

Updated 2026-11-26 07:47:25 PC time (07:47 UTC), runner pid 28004.

- `prep` done, exit 0 in 6 min
- `livematch` done, exit 0 in 8 min
- `lock` running
- `stage` pending
- `lock-gl` pending
- `lock-rwl` pending
- `lock-rf` pending
- `lock-rln` pending
- `lock-rlnrkn` pending
- `lock-cpl` pending
- `lock-pb` pending
- `gate` pending
- `pr` pending

### livematch

**124 of 124 battles** (100%), 0 failed. Running 8 min, 896 battles/h, about 0 min left (ends ~07:46 PC time). Last battle 0 min ago.
Skipped turns a battle: 5.8 overall, first 100 5.3, last 100 5.9; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 62 | 0 | 69.56 | - | - | - | 10.7 |
| bb | 62 | 0 | 83.85 | +0.36 (31 robots) | ±0.07 | +0.26 .. +0.47 | 0.9 |

APS = mean difference over the robots read x 31 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 124 |
| `dead 8` | halt | ok | every arm scoring |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

> warning: arm c's jar bisect/live/hadur117.Hadur_3.22.jar was built 254 h before this step started: check it is not stale

> warning: arm bb's jar opponents/kc.mega.BeepBoop_2.0.jar was built 241 h before this step started: check it is not stale

### lock

**47 of 1056 battles** (4%), 0 failed. Running 1 min, 3167 battles/h, about 19 min left (ends ~08:06 PC time). Last battle 0 min ago.
Skipped turns a battle: 13.4 overall, first 47 13.4, last 47 13.4; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 23 | 0 | 91.78 | - | - | - | 14.0 |
| aa | 24 | 0 | 92.59 | +0.01 (13 robots) | ±0.01 | -0.01 .. +0.04 | 12.9 |

APS = mean difference over the robots read x 22 panel robots / 1217 pairings.
A/A: aa - c +0.77 pts over 13 robots; 1% band ±2.46 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 47 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 24` | halt | ok | 11.9 a battle over the last 24 (first 24: 14.9) |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 1009 battles unrun (about 19 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
02:10:28 start gate
02:10:29 gate exit=0 in 1 s
02:10:29 start pr
02:10:36 pr exit=0 in 6 s
02:10:36 ALLDONE
07:32:17 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1544834; work D:\code\Hadur_Robot\hadur-bench\work
07:32:17 start prep
07:32:20 progress pushed to origin claude/pc-locks-progress (every 15 min)
07:38:13 prep exit=0 in 355 s
07:38:13 start livematch
07:38:13 watching livematch: 3 stop rule(s)
07:38:20 progress livematch: 0/124 (0%) battles, 0 failed
07:46:31 livematch exit=0 in 498 s
07:46:31 start lock
07:46:31 watching lock: 4 stop rule(s)
```
