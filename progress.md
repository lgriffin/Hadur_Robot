# Queue pc-jaylexi-13: progress

Updated 2026-11-22 19:53:50 PC time (19:53 UTC), runner pid 96052.

- `prep` done, exit 0 in 1 min
- `livematch` done, exit 0 in 0 min
- `bench` running
- `gate` pending
- `pr` pending

### livematch

**124 of 124 battles** (100%), 0 failed, 124 read back from an earlier run. Running 0 min. Last battle 0 min ago.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 62 | 0 | 70.75 | - | - | - | 10.2 |
| bb | 62 | 0 | 84.03 | +0.34 (31 robots) | ±0.06 | +0.24 .. +0.44 | 1.1 |

APS = mean difference over the robots read x 31 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 124 |
| `dead 8` | halt | ok | every arm scoring |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun; every battle already fought is kept and a rerun resumes from it.

> warning: arm c's jar bisect/live/hadur117.Hadur_3.22.jar was built 168 h before this step started: check it is not stale

> warning: arm bb's jar opponents/kc.mega.BeepBoop_2.0.jar was built 155 h before this step started: check it is not stale

### bench

**11004 of 16032 battles** (69%), 0 failed. Running 2.0 h, 4280 battles/h, about 1.2 h left (ends ~21:04 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0; engine disables 0.

| arm | battles | failed | share | vs control (pts) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 2750 | 0 | 88.70 | - | - | - | 0.0 |
| aa | 2753 | 0 | 88.74 | +0.04 (667 robots) | ±0.05 | -0.03 .. +0.11 | 0.0 |
| t | 2750 | 0 | 89.26 | +0.54 (667 robots) | ±0.16 | +0.29 .. +0.79 | 0.0 |
| r6 | 2751 | 0 | 88.39 | -0.33 (667 robots) | ±0.18 | -0.60 .. -0.05 | 0.0 |
A/A: aa - c +0.04 pts over 667 robots; 1% band ±0.22 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 11004 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | ok | 0.0 a battle over the last 200 (first 200: 0.0) |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `aa after 20%` | halt | ok | aa - c +0.04 pts over 667 robots, stop band ±0.26 |
| `futility t below -0.5 after 20%` | finish | ok | t +0.54, best case +0.79 pts vs bar -0.50 |

Stopping now would leave 5028 battles unrun (about 1.2 h); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
17:52:42 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1544834; work D:\code\Hadur_Robot\hadur-bench\work
17:52:42 start prep
17:52:45 progress pushed to origin claude/pc-jaylexi-13-progress (every 15 min)
17:53:14 prep exit=0 in 31 s
17:53:14 start livematch
17:53:14 watching livematch: 3 stop rule(s)
17:53:22 livematch exit=0 in 7 s
17:53:22 start bench
17:53:22 watching bench: 6 stop rule(s)
17:53:43 progress bench: 16/16032 (0%) battles, 2858/h, ETA 5.6 h, 0 failed, skips 0.0/battle (last 100)
18:23:54 progress bench: 3518/16032 (22%) battles, 6972/h, ETA 1.8 h, 0 failed, skips 0.0/battle (last 100), aa -0.00, t +0.40, r6 -0.37
18:54:13 progress bench: 6762/16032 (42%) battles, 6416/h, ETA 1.4 h, 0 failed, skips 0.0/battle (last 100), aa +0.01, t +0.39, r6 -0.40
19:24:30 progress bench: 8916/16032 (56%) battles, 4256/h, ETA 1.7 h, 0 failed, skips 0.0/battle (last 100), aa +0.05, t +0.51, r6 -0.32
```
