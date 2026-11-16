# Queue pc-locks: progress

Updated 2026-11-16 19:49:47 PC time (19:49 UTC), runner pid 71748.

- `prep` done, exit 0 in 5 min
- `livematch` done, exit 0 in 0 min
- `lock` running
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

> warning: arm c's jar bisect/live/hadur117.Hadur_3.22.jar was built 26 h before this step started: check it is not stale

> warning: arm bb's jar opponents/kc.mega.BeepBoop_2.0.jar was built 13 h before this step started: check it is not stale

### lock

**499 of 504 battles** (99%), 0 failed. Running 6 min, 4721 battles/h, about 0 min left (ends ~19:49 PC time). Last battle 0 min ago.
Skipped turns a battle: 13.6 overall, first 100 13.9, last 100 12.6; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 71 | 0 | 90.52 | - | - | - | 13.5 |
| aa | 70 | 0 | 90.36 | -0.00 (6 robots) | ±0.00 | -0.00 .. +0.00 | 13.6 |
| sb | 71 | 0 | 91.56 | +0.01 (6 robots) | ±0.00 | -0.00 .. +0.01 | 13.3 |
| dp | 72 | 0 | 90.88 | +0.00 (6 robots) | ±0.01 | -0.01 .. +0.01 | 13.5 |
| x0 | 72 | 0 | 91.33 | +0.00 (6 robots) | ±0.01 | -0.01 .. +0.01 | 13.6 |
| vj | 71 | 0 | 93.76 | +0.02 (6 robots) | ±0.03 | -0.03 .. +0.06 | 13.8 |
| hl | 72 | 0 | 91.16 | +0.00 (6 robots) | ±0.00 | -0.00 .. +0.01 | 13.6 |

APS = mean difference over the robots read x 6 panel robots / 1217 pairings.
A/A: aa - c -0.16 pts over 6 robots; 1% band ±1.39 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 499 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 24` | halt | ok | 10.8 a battle over the last 24 (first 24: 16.9) |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 5 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
17:39:22 start gate
17:39:23 gate exit=0 in 0 s
17:39:23 start pr
17:39:30 pr exit=0 in 6 s
17:39:30 ALLDONE
19:38:43 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1544834; work D:\code\Hadur_Robot\hadur-bench\work
19:38:43 start prep
19:38:45 progress pushed to origin claude/pc-locks-progress (every 15 min)
19:43:17 prep exit=0 in 274 s
19:43:17 start livematch
19:43:17 watching livematch: 3 stop rule(s)
19:43:26 livematch exit=0 in 9 s
19:43:26 start lock
19:43:26 watching lock: 4 stop rule(s)
19:43:45 progress lock: 9/504 (2%) battles, 1688/h, ETA 18 min, 0 failed, skips 17.1/battle (last 100)
```
