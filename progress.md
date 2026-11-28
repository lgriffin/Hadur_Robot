# Queue pc-locks39: progress

Updated 2026-11-28 01:40:19 PC time (01:40 UTC), runner pid 29436.

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

**1049 of 1248 battles** (84%), 0 failed. Running 2.0 h, 560 battles/h, about 21 min left (ends ~02:01 PC time). Last battle 0 min ago.
Skipped turns a battle: 9.4 overall, first 100 10.3, last 100 8.8; engine disables 1.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 524 | 0 | 63.62 | - | - | - | 9.3 |
| aa | 525 | 0 | 63.69 | +0.00 (13 robots) | ±0.00 | -0.01 .. +0.01 | 9.6 |

APS = mean difference over the robots read x 13 panel robots / 1217 pairings.
A/A: aa - c +0.07 pts over 13 robots; 1% band ±0.51 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 1049 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 24` | halt | ok | 9.3 a battle over the last 24 (first 24: 12.3) |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 199 battles unrun (about 21 min); every battle already fought is kept and a rerun resumes from it.

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
00:00:28 progress lock: 184/1248 (15%) battles, 486/h, ETA 2.2 h, 0 failed, skips 9.6/battle (last 100), aa -0.01
00:30:42 progress lock: 434/1248 (35%) battles, 500/h, ETA 1.6 h, 0 failed, skips 9.2/battle (last 100), aa -0.00
01:00:59 progress lock: 698/1248 (56%) battles, 524/h, ETA 1.0 h, 0 failed, skips 8.9/battle (last 100), aa +0.00
01:31:15 progress lock: 982/1248 (79%) battles, 564/h, ETA 28 min, 0 failed, skips 9.5/battle (last 100), aa +0.00
```
