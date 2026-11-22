# Queue pc-jaylexi-13: progress

Updated 2026-11-22 20:24:09 PC time (20:24 UTC), runner pid 96052.

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

**13152 of 16032 battles** (82%), 0 failed. Running 2.5 h, 4250 battles/h, about 41 min left (ends ~21:04 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0; engine disables 0.

| arm | battles | failed | share | vs control (pts) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 3286 | 0 | 88.71 | - | - | - | 0.0 |
| aa | 3292 | 0 | 88.75 | +0.04 (668 robots) | ±0.04 | -0.01 .. +0.10 | 0.0 |
| t | 3288 | 0 | 89.27 | +0.53 (668 robots) | ±0.16 | +0.29 .. +0.78 | 0.0 |
| r6 | 3286 | 0 | 88.39 | -0.34 (668 robots) | ±0.17 | -0.60 .. -0.08 | 0.0 |
A/A: aa - c +0.04 pts over 668 robots; 1% band ±0.20 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 13152 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | ok | 0.0 a battle over the last 200 (first 200: 0.0) |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `aa after 20%` | halt | ok | aa - c +0.04 pts over 668 robots, stop band ±0.24 |
| `futility t below -0.5 after 20%` | finish | ok | t +0.53, best case +0.78 pts vs bar -0.50 |

Stopping now would leave 2880 battles unrun (about 41 min); every battle already fought is kept and a rerun resumes from it.

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
19:54:51 progress bench: 11069/16032 (69%) battles, 4266/h, ETA 1.2 h, 0 failed, skips 0.0/battle (last 100), aa +0.05, t +0.54, r6 -0.33
```
