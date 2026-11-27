# Queue pc-locks: progress

Updated 2026-11-27 17:34:00 PC time (17:34 UTC), runner pid 4952.

- `prep` done, exit 0 in 4 min
- `livematch` done, exit 0 in 8 min
- `lock` running
- `stage` pending
- `lock-zl` pending
- `lock-vj` pending
- `lock-rp` pending
- `lock-rppb` pending
- `gate` pending
- `pr` pending

### livematch

**124 of 124 battles** (100%), 0 failed. Running 8 min, 928 battles/h, about 0 min left (ends ~17:30 PC time). Last battle 0 min ago.
Skipped turns a battle: 5.2 overall, first 100 5.1, last 100 5.3; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 62 | 0 | 70.03 | - | - | - | 9.7 |
| bb | 62 | 0 | 84.95 | +0.38 (31 robots) | ±0.07 | +0.27 .. +0.49 | 0.7 |

APS = mean difference over the robots read x 31 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 124 |
| `dead 8` | halt | ok | every arm scoring |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

> warning: arm c's jar bisect/live/hadur117.Hadur_3.22.jar was built 288 h before this step started: check it is not stale

> warning: arm bb's jar opponents/kc.mega.BeepBoop_2.0.jar was built 275 h before this step started: check it is not stale

### lock

**33 of 672 battles** (5%), 0 failed. Running 4 min, 552 battles/h, about 1.2 h left (ends ~18:43 PC time). Last battle 0 min ago.
Skipped turns a battle: 11.3 overall, first 33 11.3, last 33 11.3; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 17 | 0 | 61.08 | - | - | - | 10.7 |
| aa | 16 | 0 | 61.80 | -0.02 (9 robots) | ±0.04 | -0.08 .. +0.05 | 11.9 |

APS = mean difference over the robots read x 14 panel robots / 1217 pairings.
A/A: aa - c -1.31 pts over 9 robots; 1% band ±2.92 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 33 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 24` | halt | ok | 10.3 a battle over the last 24 (first 24: 11.4) |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 639 battles unrun (about 1.2 h); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
09:51:49 start gate
09:51:50 gate exit=0 in 1 s
09:51:50 start pr
09:51:58 pr exit=0 in 7 s
09:51:58 ALLDONE
17:18:52 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1544834; work D:\code\Hadur_Robot\hadur-bench\work
17:18:52 start prep
17:18:55 progress pushed to origin claude/pc-locks-progress (every 15 min)
17:22:23 prep exit=0 in 211 s
17:22:23 start livematch
17:22:23 watching livematch: 3 stop rule(s)
17:22:54 progress livematch: 11/124 (9%) battles, 1309/h, ETA 5 min, 0 failed, skips 5.7/battle (last 100), bb +0.19
17:30:24 livematch exit=0 in 480 s
17:30:24 start lock
17:30:24 watching lock: 4 stop rule(s)
```
