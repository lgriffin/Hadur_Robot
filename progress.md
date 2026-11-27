# Queue pc-locks39: progress

Updated 2026-11-27 23:39:18 PC time (23:39 UTC), runner pid 29436.

- `prep` done, exit 0 in 6 min
- `livematch` done, exit 0 in 8 min
- `lock` running
- `stage` pending
- `lock-zl` pending
- `lock-pb` pending
- `lock-rlnrkn` pending
- `lock-fgl` pending
- `lock-mt` pending
- `lock-rf` pending
- `lock-rp` pending
- `gate` pending
- `pr` pending

### livematch

**124 of 124 battles** (100%), 0 failed. Running 8 min, 944 battles/h, about 0 min left (ends ~23:37 PC time). Last battle 0 min ago.
Skipped turns a battle: 5.7 overall, first 100 5.4, last 100 5.9; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 62 | 0 | 70.13 | - | - | - | 10.5 |
| bb | 62 | 0 | 84.88 | +0.38 (31 robots) | ±0.06 | +0.28 .. +0.47 | 0.9 |

APS = mean difference over the robots read x 31 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 124 |
| `dead 8` | halt | ok | every arm scoring |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

> warning: arm c's jar bisect/live/hadur117.Hadur_3.22.jar was built 294 h before this step started: check it is not stale

> warning: arm bb's jar opponents/kc.mega.BeepBoop_2.0.jar was built 281 h before this step started: check it is not stale

### lock

**19 of 1248 battles** (2%), 0 failed. Running 2 min, 730 battles/h, about 1.7 h left (ends ~01:20 PC time). Last battle 0 min ago.
Skipped turns a battle: 13.0 overall, first 19 13.0, last 19 13.0; engine disables 1.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 10 | 0 | 80.03 | - | - | - | 15.1 |
| aa | 9 | 0 | 79.52 | -0.01 (4 robots) | ±0.01 | -0.03 .. +0.02 | 10.7 |

APS = mean difference over the robots read x 13 panel robots / 1217 pairings.
A/A: aa - c -0.51 pts over 4 robots; 1% band ±3.79 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 19 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 24` | halt | waiting | 19 of 24 battles to read |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 1229 battles unrun (about 1.7 h); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
23:24:12 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1544834; work D:\code\Hadur_Robot\hadur-bench\work
23:24:12 start prep
23:24:15 progress pushed to origin claude/pc-locks39-progress (every 15 min)
23:29:52 prep exit=0 in 339 s
23:29:52 start livematch
23:29:52 watching livematch: 3 stop rule(s)
23:30:14 progress livematch: 6/124 (5%) battles, 976/h, ETA 7 min, 0 failed, skips 5.2/battle (last 100), bb +0.04
23:37:45 livematch exit=0 in 473 s
23:37:45 start lock
23:37:45 watching lock: 4 stop rule(s)
```
