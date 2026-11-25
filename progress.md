# Queue pc-locks: progress

Updated 2026-11-25 21:20:30 PC time (21:20 UTC), runner pid 58332.

- `prep` done, exit 0 in 4 min
- `livematch` done, exit 0 in 8 min
- `lock` running
- `stage` pending
- `lock-gl` pending
- `lock-rwl` pending
- `lock-x0` pending
- `lock-ky` pending
- `lock-rlnrkn` pending
- `gate` pending
- `pr` pending

### livematch

**124 of 124 battles** (100%), 0 failed. Running 8 min, 934 battles/h, about 0 min left (ends ~21:17 PC time). Last battle 0 min ago.
Skipped turns a battle: 5.4 overall, first 100 5.2, last 100 5.4; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 62 | 0 | 70.39 | - | - | - | 10.0 |
| bb | 62 | 0 | 84.52 | +0.36 (31 robots) | ±0.06 | +0.26 .. +0.46 | 0.8 |

APS = mean difference over the robots read x 31 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 124 |
| `dead 8` | halt | ok | every arm scoring |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

> warning: arm c's jar bisect/live/hadur117.Hadur_3.22.jar was built 243 h before this step started: check it is not stale

> warning: arm bb's jar opponents/kc.mega.BeepBoop_2.0.jar was built 230 h before this step started: check it is not stale

### lock

**211 of 576 battles** (37%), 0 failed. Running 3 min, 4518 battles/h, about 5 min left (ends ~21:25 PC time). Last battle 0 min ago.
Skipped turns a battle: 12.7 overall, first 100 13.4, last 100 12.1; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 105 | 0 | 84.41 | - | - | - | 12.4 |
| aa | 106 | 0 | 83.81 | -0.01 (12 robots) | ±0.01 | -0.02 .. +0.00 | 13.1 |

APS = mean difference over the robots read x 12 panel robots / 1217 pairings.
A/A: aa - c -0.60 pts over 12 robots; 1% band ±1.14 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 211 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 24` | halt | ok | 11.2 a battle over the last 24 (first 24: 16.5) |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 365 battles unrun (about 5 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
15:57:31 skip gate (already exit=0)
15:57:31 start pr
15:57:40 progress pushed to origin claude/pc-locks-progress (every 15 min)
15:57:49 pr exit=0 in 17 s
15:57:49 ALLDONE
21:05:22 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1544834; work D:\code\Hadur_Robot\hadur-bench\work
21:05:22 start prep
21:05:24 progress pushed to origin claude/pc-locks-progress (every 15 min)
21:09:43 prep exit=0 in 261 s
21:09:43 start livematch
21:09:43 watching livematch: 3 stop rule(s)
21:10:24 progress livematch: 18/124 (15%) battles, 1608/h, ETA 4 min, 0 failed, skips 5.2/battle (last 100), bb +0.12
21:17:41 livematch exit=0 in 477 s
21:17:41 start lock
21:17:41 watching lock: 4 stop rule(s)
```
