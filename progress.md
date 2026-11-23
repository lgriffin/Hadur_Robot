# Queue pc-locks: progress

Updated 2026-11-23 23:42:09 PC time (23:42 UTC), runner pid 32740.

- `prep` done, exit 0 in 2 min
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

> warning: arm c's jar bisect/live/hadur117.Hadur_3.22.jar was built 198 h before this step started: check it is not stale

> warning: arm bb's jar opponents/kc.mega.BeepBoop_2.0.jar was built 185 h before this step started: check it is not stale

### lock

**1231 of 1728 battles** (71%), 0 failed. Running 13 min, 5779 battles/h, about 5 min left (ends ~23:47 PC time). Last battle 0 min ago.
Skipped turns a battle: 13.8 overall, first 100 15.2, last 100 14.9; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 308 | 0 | 88.29 | - | - | - | 13.8 |
| aa | 307 | 0 | 88.36 | +0.00 (18 robots) | ±0.01 | -0.01 .. +0.01 | 13.6 |
| fq | 309 | 0 | 88.49 | +0.00 (18 robots) | ±0.01 | -0.01 .. +0.02 | 14.0 |
| vj | 307 | 0 | 88.21 | -0.00 (18 robots) | ±0.00 | -0.01 .. +0.01 | 13.8 |

APS = mean difference over the robots read x 18 panel robots / 1217 pairings.
A/A: aa - c +0.07 pts over 18 robots; 1% band ±0.67 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 1231 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 24` | halt | ok | 15.0 a battle over the last 24 (first 24: 17.5) |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 497 battles unrun (about 5 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
19:28:42 start gate
19:28:43 gate exit=0 in 0 s
19:28:43 start pr
19:28:50 pr exit=0 in 7 s
19:28:50 ALLDONE
23:27:04 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1544834; work D:\code\Hadur_Robot\hadur-bench\work
23:27:04 start prep
23:27:06 progress pushed to origin claude/pc-locks-progress (every 15 min)
23:29:13 prep exit=0 in 129 s
23:29:13 start livematch
23:29:13 watching livematch: 3 stop rule(s)
23:29:21 livematch exit=0 in 7 s
23:29:21 start lock
23:29:21 watching lock: 4 stop rule(s)
23:30:05 progress lock: 54/1728 (3%) battles, 4387/h, ETA 23 min, 0 failed, skips 16.1/battle (last 100), aa +0.02, fq -0.00, vj -0.02
```
