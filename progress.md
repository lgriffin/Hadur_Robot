# Queue pc-locks40: progress

Updated 2026-11-28 11:58:33 PC time (11:58 UTC), runner pid 12896.

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

**35 of 1152 battles** (3%), 0 failed. Running 3 min, 601 battles/h, about 1.9 h left (ends ~13:50 PC time). Last battle 0 min ago.
Skipped turns a battle: 13.3 overall, first 35 13.3, last 35 13.3; engine disables 1.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 17 | 0 | 71.76 | - | - | - | 14.2 |
| aa | 18 | 0 | 66.09 | -0.02 (7 robots) | ±0.02 | -0.06 .. +0.02 | 12.4 |

APS = mean difference over the robots read x 12 panel robots / 1217 pairings.
A/A: aa - c -1.90 pts over 7 robots; 1% band ±2.83 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 35 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 24` | halt | ok | 11.2 a battle over the last 24 (first 24: 14.0) |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 1117 battles unrun (about 1.9 h); every battle already fought is kept and a rerun resumes from it.

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
```
