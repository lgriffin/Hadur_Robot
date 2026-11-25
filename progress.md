# Queue pc-locks: progress

Updated 2026-11-25 12:03:46 PC time (12:03 UTC), runner pid 84520.

- `prep` done, exit 0 in 2 min
- `livematch` done, exit 0 in 8 min
- `lock` running
- `stage` pending
- `lock-rwl` pending
- `lock-x0` pending
- `gate` pending
- `pr` pending

### livematch

**124 of 124 battles** (100%), 0 failed. Running 8 min, 916 battles/h, about 0 min left (ends ~11:58 PC time). Last battle 0 min ago.
Skipped turns a battle: 5.5 overall, first 100 5.0, last 100 5.5; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 62 | 0 | 71.15 | - | - | - | 10.0 |
| bb | 62 | 0 | 84.81 | +0.35 (31 robots) | ±0.06 | +0.26 .. +0.44 | 1.1 |

APS = mean difference over the robots read x 31 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 124 |
| `dead 8` | halt | ok | every arm scoring |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

> warning: arm c's jar bisect/live/hadur117.Hadur_3.22.jar was built 234 h before this step started: check it is not stale

> warning: arm bb's jar opponents/kc.mega.BeepBoop_2.0.jar was built 221 h before this step started: check it is not stale

### lock

**592 of 672 battles** (88%), 0 failed. Running 5 min, 7420 battles/h, about 1 min left (ends ~12:04 PC time). Last battle 0 min ago.
Skipped turns a battle: 14.4 overall, first 100 15.1, last 100 14.2; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 297 | 0 | 95.43 | - | - | - | 14.4 |
| aa | 295 | 0 | 95.22 | -0.00 (14 robots) | ±0.00 | -0.01 .. +0.00 | 14.5 |

APS = mean difference over the robots read x 14 panel robots / 1217 pairings.
A/A: aa - c -0.21 pts over 14 robots; 1% band ±0.68 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 592 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 24` | halt | ok | 14.3 a battle over the last 24 (first 24: 17.5) |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 80 battles unrun (about 1 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
08:07:12 start gate
08:07:13 gate exit=0 in 1 s
08:07:13 start pr
08:07:20 pr exit=0 in 7 s
08:07:20 ALLDONE
11:48:38 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1544834; work D:\code\Hadur_Robot\hadur-bench\work
11:48:38 start prep
11:48:40 progress pushed to origin claude/pc-locks-progress (every 15 min)
11:50:50 prep exit=0 in 132 s
11:50:50 start livematch
11:50:50 watching livematch: 3 stop rule(s)
11:51:40 progress livematch: 24/124 (19%) battles, 1752/h, ETA 3 min, 0 failed, skips 5.7/battle (last 100), bb +0.18
11:58:58 livematch exit=0 in 487 s
11:58:58 start lock
11:58:58 watching lock: 4 stop rule(s)
```
