# Queue pc-locks: progress

Updated 2026-11-24 22:02:12 PC time (22:02 UTC), runner pid 88640.

- `prep` done, exit 0 in 4 min
- `livematch` done, exit 0 in 8 min
- `lock` running
- `lock-sb` pending
- `lock-rp` pending
- `lock-qw` pending
- `lock-fq` pending
- `lock-kb` pending
- `gate` pending
- `pr` pending

### livematch

**124 of 124 battles** (100%), 0 failed. Running 8 min, 907 battles/h, about 0 min left (ends ~21:44 PC time). Last battle 0 min ago.
Skipped turns a battle: 5.6 overall, first 100 5.1, last 100 5.7; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 62 | 0 | 69.78 | - | - | - | 10.2 |
| bb | 62 | 0 | 84.80 | +0.38 (31 robots) | ±0.06 | +0.28 .. +0.48 | 0.9 |

APS = mean difference over the robots read x 31 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 124 |
| `dead 8` | halt | ok | every arm scoring |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

> warning: arm c's jar bisect/live/hadur117.Hadur_3.22.jar was built 220 h before this step started: check it is not stale

> warning: arm bb's jar opponents/kc.mega.BeepBoop_2.0.jar was built 207 h before this step started: check it is not stale

### lock

**1341 of 1344 battles** (100%), 0 failed. Running 18 min, 4475 battles/h, about 0 min left (ends ~22:02 PC time). Last battle 0 min ago.
Skipped turns a battle: 12.3 overall, first 100 13.4, last 100 12.0; engine disables 1.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 671 | 0 | 90.35 | - | - | - | 12.3 |
| aa | 670 | 0 | 90.40 | +0.00 (28 robots) | ±0.00 | -0.01 .. +0.01 | 12.4 |

APS = mean difference over the robots read x 28 panel robots / 1217 pairings.
A/A: aa - c +0.05 pts over 28 robots; 1% band ±0.45 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 1341 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 24` | halt | ok | 11.0 a battle over the last 24 (first 24: 16.4) |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 3 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
23:47:59 start gate
23:48:00 gate exit=0 in 1 s
23:48:00 start pr
23:48:07 pr exit=0 in 7 s
23:48:07 ALLDONE
21:31:54 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1544834; work D:\code\Hadur_Robot\hadur-bench\work
21:31:54 start prep
21:31:57 progress pushed to origin claude/pc-locks-progress (every 15 min)
21:36:02 prep exit=0 in 247 s
21:36:02 start livematch
21:36:02 watching livematch: 3 stop rule(s)
21:36:57 progress livematch: 27/124 (22%) battles, 1755/h, ETA 3 min, 0 failed, skips 5.1/battle (last 100), bb +0.18
21:44:13 livematch exit=0 in 491 s
21:44:13 start lock
21:44:13 watching lock: 4 stop rule(s)
```
