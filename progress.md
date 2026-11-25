# Queue pc-locks: progress

Updated 2026-11-25 07:45:56 PC time (07:45 UTC), runner pid 10200.

- `prep` done, exit 0 in 6 min
- `livematch` done, exit 0 in 8 min
- `lock` running
- `stage` pending
- `lock-rwl` pending
- `lock-md` pending
- `lock-x0` pending
- `lock-rf` pending
- `lock-hof` pending
- `lock-ty` pending
- `lock-sp2` pending
- `gate` pending
- `pr` pending

### livematch

**124 of 124 battles** (100%), 0 failed. Running 8 min, 886 battles/h, about 0 min left (ends ~07:45 PC time). Last battle 0 min ago.
Skipped turns a battle: 5.8 overall, first 100 5.2, last 100 5.7; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 62 | 0 | 69.30 | - | - | - | 10.4 |
| bb | 62 | 0 | 84.07 | +0.38 (31 robots) | ±0.07 | +0.27 .. +0.49 | 1.1 |

APS = mean difference over the robots read x 31 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 124 |
| `dead 8` | halt | ok | every arm scoring |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

> warning: arm c's jar bisect/live/hadur117.Hadur_3.22.jar was built 230 h before this step started: check it is not stale

> warning: arm bb's jar opponents/kc.mega.BeepBoop_2.0.jar was built 217 h before this step started: check it is not stale

### lock

**92 of 1584 battles** (6%), 0 failed. Running 1 min, 5978 battles/h, about 15 min left (ends ~08:00 PC time). Last battle 0 min ago.
Skipped turns a battle: 15.6 overall, first 92 15.6, last 92 15.6; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 45 | 0 | 96.16 | - | - | - | 15.4 |
| aa | 47 | 0 | 95.46 | -0.02 (23 robots) | ±0.02 | -0.06 .. +0.02 | 15.9 |

APS = mean difference over the robots read x 33 panel robots / 1217 pairings.
A/A: aa - c -0.77 pts over 23 robots; 1% band ±1.73 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 92 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 24` | halt | ok | 14.8 a battle over the last 24 (first 24: 17.9) |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 1492 battles unrun (about 15 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
01:34:51 start gate
01:34:52 gate exit=0 in 1 s
01:34:52 start pr
01:34:59 pr exit=0 in 7 s
01:34:59 ALLDONE
07:30:48 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1544834; work D:\code\Hadur_Robot\hadur-bench\work
07:30:48 start prep
07:30:51 progress pushed to origin claude/pc-locks-progress (every 15 min)
07:36:36 prep exit=0 in 348 s
07:36:36 start livematch
07:36:36 watching livematch: 3 stop rule(s)
07:36:51 progress livematch: 2/124 (2%) battles, 475/h, ETA 15 min, 0 failed, skips 1.0/battle (last 100)
07:45:00 livematch exit=0 in 503 s
07:45:00 start lock
07:45:00 watching lock: 4 stop rule(s)
```
