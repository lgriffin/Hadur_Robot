# Queue pc-locks40: progress

Updated 2026-11-28 12:28:47 PC time (12:28 UTC), runner pid 12896.

- `prep` done, exit 0 in 4 min
- `livematch` done, exit 0 in 8 min
- `lock` running
- `stage` pending
- `lock-fgp` pending
- `lock-zl` pending
- `lock-gl` pending
- `lock-pb` pending
- `gate` pending
- `pr` pending

### livematch

**124 of 124 battles** (100%), 0 failed. Running 8 min, 945 battles/h, about 0 min left (ends ~11:55 PC time). Last battle 0 min ago.
Skipped turns a battle: 5.3 overall, first 100 4.7, last 100 5.3; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 62 | 0 | 69.84 | - | - | - | 9.9 |
| bb | 62 | 0 | 84.43 | +0.37 (31 robots) | ±0.07 | +0.27 .. +0.48 | 0.6 |

APS = mean difference over the robots read x 31 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 124 |
| `dead 8` | halt | ok | every arm scoring |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

> warning: arm c's jar bisect/live/hadur117.Hadur_3.22.jar was built 306 h before this step started: check it is not stale

> warning: arm bb's jar opponents/kc.mega.BeepBoop_2.0.jar was built 293 h before this step started: check it is not stale

### lock

**249 of 1152 battles** (22%), 0 failed. Running 34 min, 426 battles/h, about 2.1 h left (ends ~14:35 PC time). Last battle 0 min ago.
Skipped turns a battle: 10.3 overall, first 100 10.7, last 100 10.6; engine disables 1.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 123 | 0 | 60.55 | - | - | - | 10.3 |
| aa | 126 | 0 | 60.55 | +0.00 (12 robots) | ±0.01 | -0.01 .. +0.01 | 10.2 |

APS = mean difference over the robots read x 12 panel robots / 1217 pairings.
A/A: aa - c +0.00 pts over 12 robots; 1% band ±1.05 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 249 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 24` | halt | ok | 10.3 a battle over the last 24 (first 24: 14.0) |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 903 battles unrun (about 2.1 h); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
11:43:26 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1544834; work D:\code\Hadur_Robot\hadur-bench\work
11:43:26 start prep
11:43:28 progress pushed to origin claude/pc-locks40-progress (every 15 min)
11:47:11 prep exit=0 in 225 s
11:47:11 start livematch
11:47:11 watching livematch: 3 stop rule(s)
11:47:27 progress livematch: 2/124 (2%) battles, 446/h, ETA 16 min, 0 failed, skips 1.0/battle (last 100)
11:55:04 livematch exit=0 in 472 s
11:55:04 start lock
11:55:04 watching lock: 4 stop rule(s)
12:17:42 progress lock: 161/1152 (14%) battles, 427/h, ETA 2.3 h, 0 failed, skips 9.1/battle (last 100), aa -0.01
```
