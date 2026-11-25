# Queue pc-locks: progress

Updated 2026-11-25 08:01:02 PC time (08:01 UTC), runner pid 10200.

- `prep` done, exit 0 in 6 min
- `livematch` done, exit 0 in 8 min
- `lock` done, exit 0 in 14 min
- `stage` done, exit 0 in 0 min
- `lock-rwl` running
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

**1584 of 1584 battles** (100%), 0 failed. Running 14 min, 6823 battles/h, about 0 min left (ends ~07:58 PC time). Last battle 0 min ago.
Skipped turns a battle: 15.0 overall, first 100 15.5, last 100 13.9; engine disables 1.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 792 | 0 | 96.21 | - | - | - | 15.1 |
| aa | 792 | 0 | 96.20 | -0.00 (33 robots) | ±0.00 | -0.01 .. +0.01 | 14.9 |

APS = mean difference over the robots read x 33 panel robots / 1217 pairings.
A/A: aa - c -0.01 pts over 33 robots; 1% band ±0.41 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 1584 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 24` | halt | ok | 12.9 a battle over the last 24 (first 24: 17.9) |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### lock-rwl

**741 of 1056 battles** (70%), 0 failed, 528 read back from an earlier run. Running 2 min, 6752 battles/h, about 3 min left (ends ~08:03 PC time). Last battle 0 min ago.
Skipped turns a battle: 15.1 overall, first 100 15.6, last 100 14.4; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 528 | 0 | 97.01 | - | - | - | 15.1 |
| rwl | 213 | 0 | 97.59 | +0.01 (22 robots) | ±0.00 | +0.01 .. +0.02 | 15.1 |

APS = mean difference over the robots read x 22 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 741 |
| `dead 8` | halt | ok | every arm scoring |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 315 battles unrun (about 3 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
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
07:58:56 lock exit=0 in 836 s
07:58:56 start stage
07:59:07 stage exit=0 in 11 s
07:59:07 start lock-rwl
07:59:07 watching lock-rwl: 3 stop rule(s)
```
