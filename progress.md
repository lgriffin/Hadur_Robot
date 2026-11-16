# Queue pc-locks: progress

Updated 2026-11-16 08:14:05 PC time (08:14 UTC), runner pid 69360.

- `prep` done, exit 0 in 3 min
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

> warning: arm c's jar bisect/live/hadur117.Hadur_3.22.jar was built 14 h before this step started: check it is not stale

### lock

**598 of 720 battles** (83%), 0 failed. Running 12 min, 3098 battles/h, about 2 min left (ends ~08:16 PC time). Last battle 0 min ago.
Skipped turns a battle: 17.1 overall, first 100 13.5, last 100 18.6; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 123 | 0 | 83.64 | - | - | - | 16.9 |
| aa | 119 | 0 | 83.26 | -0.00 (12 robots) | ±0.01 | -0.02 .. +0.01 | 17.0 |
| pb | 119 | 0 | 84.40 | +0.01 (12 robots) | ±0.02 | -0.02 .. +0.04 | 17.6 |
| x0 | 118 | 0 | 83.85 | +0.00 (12 robots) | ±0.01 | -0.02 .. +0.02 | 16.7 |
| mv | 119 | 0 | 85.15 | +0.02 (12 robots) | ±0.02 | -0.02 .. +0.05 | 17.4 |

APS = mean difference over the robots read x 12 panel robots / 1217 pairings.
A/A: aa - c -0.38 pts over 12 robots; 1% band ±1.06 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 598 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 24` | halt | ok | 18.4 a battle over the last 24 (first 24: 15.4) |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 122 battles unrun (about 2 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
07:22:53 start gate
07:22:53 gate exit=0 in 0 s
07:22:53 start pr
07:22:59 pr exit=0 in 6 s
07:22:59 ALLDONE
07:58:55 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1544834; work D:\code\Hadur_Robot\hadur-bench\work
07:58:55 start prep
07:58:57 progress pushed to origin claude/pc-locks-progress (every 15 min)
08:02:22 prep exit=0 in 206 s
08:02:22 start livematch
08:02:22 watching livematch: 3 stop rule(s)
08:02:30 livematch exit=0 in 7 s
08:02:30 start lock
08:02:30 watching lock: 4 stop rule(s)
08:02:57 progress lock: 14/720 (2%) battles, 1855/h, ETA 23 min, 0 failed, skips 16.5/battle (last 100)
```
