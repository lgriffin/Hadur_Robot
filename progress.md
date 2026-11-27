# Queue pc-locks: progress

Updated 2026-11-27 21:20:57 PC time (21:20 UTC), runner pid 50772.

- `prep` done, exit 0 in 4 min
- `livematch` done, exit 0 in 8 min
- `lock` running
- `stage` pending
- `lock-rp` pending
- `lock-p5` pending
- `lock-fq` pending
- `lock-gl` pending
- `gate` pending
- `pr` pending

### livematch

**124 of 124 battles** (100%), 0 failed. Running 8 min, 927 battles/h, about 0 min left (ends ~21:17 PC time). Last battle 0 min ago.
Skipped turns a battle: 5.2 overall, first 100 4.7, last 100 5.3; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 62 | 0 | 70.40 | - | - | - | 9.7 |
| bb | 62 | 0 | 84.55 | +0.36 (31 robots) | ±0.07 | +0.25 .. +0.47 | 0.7 |

APS = mean difference over the robots read x 31 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 124 |
| `dead 8` | halt | ok | every arm scoring |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

> warning: arm c's jar bisect/live/hadur117.Hadur_3.22.jar was built 291 h before this step started: check it is not stale

> warning: arm bb's jar opponents/kc.mega.BeepBoop_2.0.jar was built 278 h before this step started: check it is not stale

### lock

**32 of 576 battles** (6%), 0 failed. Running 4 min, 544 battles/h, about 60 min left (ends ~22:20 PC time). Last battle 0 min ago.
Skipped turns a battle: 11.8 overall, first 32 11.8, last 32 11.8; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 16 | 0 | 59.37 | - | - | - | 10.9 |
| aa | 16 | 0 | 58.28 | -0.01 (8 robots) | ±0.05 | -0.08 .. +0.06 | 12.7 |

APS = mean difference over the robots read x 12 panel robots / 1217 pairings.
A/A: aa - c -0.82 pts over 8 robots; 1% band ±3.02 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 32 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 24` | halt | ok | 11.4 a battle over the last 24 (first 24: 12.5) |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 544 battles unrun (about 60 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
19:11:15 start gate
19:11:16 gate exit=0 in 1 s
19:11:16 start pr
19:11:23 pr exit=0 in 7 s
19:11:23 ALLDONE
21:05:50 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1544834; work D:\code\Hadur_Robot\hadur-bench\work
21:05:50 start prep
21:05:52 progress pushed to origin claude/pc-locks-progress (every 15 min)
21:09:24 prep exit=0 in 214 s
21:09:24 start livematch
21:09:24 watching livematch: 3 stop rule(s)
21:09:51 progress livematch: 11/124 (9%) battles, 1456/h, ETA 5 min, 0 failed, skips 5.9/battle (last 100), bb +0.20
21:17:25 livematch exit=0 in 481 s
21:17:25 start lock
21:17:25 watching lock: 4 stop rule(s)
```
