# Queue pc-locks: progress

Updated 2026-11-22 11:19:36 PC time (11:19 UTC), runner pid 43400.

- `prep` done, exit 0 in 3 min
- `livematch` done, exit 0 in 0 min
- `lock` running
- `gate` pending
- `pr` pending

### livematch

**124 of 124 battles** (100%), 0 failed, 124 read back from an earlier run. Running 0 min. Last battle 0 min ago.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 62 | 0 | 70.75 | - | - | - | 10.2 |
| bb | 62 | 0 | 84.03 | +0.34 (31 robots) | ±0.06 | +0.24 .. +0.44 | 1.1 |

APS = mean difference over the robots read x 31 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 124 |
| `dead 8` | halt | ok | every arm scoring |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun; every battle already fought is kept and a rerun resumes from it.

> warning: arm c's jar bisect/live/hadur117.Hadur_3.22.jar was built 161 h before this step started: check it is not stale

> warning: arm bb's jar opponents/kc.mega.BeepBoop_2.0.jar was built 148 h before this step started: check it is not stale

### lock

**960 of 960 battles** (100%), 0 failed. Running 8 min, 7020 battles/h, about 0 min left (ends ~11:19 PC time). Last battle 0 min ago.
Skipped turns a battle: 14.7 overall, first 100 15.8, last 100 13.8; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 192 | 0 | 88.31 | - | - | - | 14.8 |
| aa | 192 | 0 | 88.44 | +0.00 (16 robots) | ±0.01 | -0.01 .. +0.01 | 14.5 |
| qw | 192 | 0 | 88.46 | +0.00 (16 robots) | ±0.00 | -0.01 .. +0.01 | 14.9 |
| x0 | 192 | 0 | 88.44 | +0.00 (16 robots) | ±0.01 | -0.01 .. +0.01 | 14.3 |
| rf | 192 | 0 | 88.62 | +0.00 (16 robots) | ±0.00 | -0.00 .. +0.01 | 14.8 |

APS = mean difference over the robots read x 16 panel robots / 1217 pairings.
A/A: aa - c +0.13 pts over 16 robots; 1% band ±0.84 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 960 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 24` | halt | ok | 10.9 a battle over the last 24 (first 24: 18.9) |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
09:23:48 start gate
09:23:49 gate exit=0 in 0 s
09:23:49 start pr
09:23:55 pr exit=0 in 6 s
09:23:55 ALLDONE
11:08:33 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1544834; work D:\code\Hadur_Robot\hadur-bench\work
11:08:33 start prep
11:08:35 progress pushed to origin claude/pc-locks-progress (every 15 min)
11:11:16 prep exit=0 in 163 s
11:11:16 start livematch
11:11:16 watching livematch: 3 stop rule(s)
11:11:24 livematch exit=0 in 7 s
11:11:24 start lock
11:11:24 watching lock: 4 stop rule(s)
11:11:34 progress lock: 0/960 (0%) battles, 0 failed
```
