# Queue pc-rc-confirm: progress

Updated 2026-11-21 21:34:22 PC time (21:34 UTC), runner pid 83088.

- `prep` done, exit 0 in 1 min
- `livematch` done, exit 0 in 0 min
- `field` running
- `ret` pending
- `gate112` pending
- `gate` pending
- `pr` pending

### livematch

**124 of 124 battles** (100%), 0 failed, 124 read back from an earlier run. Running 0 min. Last battle 0 min ago.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 62 | 0 | 69.94 | - | - | - | 9.8 |
| bb | 62 | 0 | 84.62 | +0.37 (31 robots) | ±0.07 | +0.27 .. +0.48 | 0.3 |

APS = mean difference over the robots read x 31 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 124 |
| `dead 8` | halt | ok | every arm scoring |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun; every battle already fought is kept and a rerun resumes from it.

> warning: arm c's jar bisect/live/hadur117.Hadur_3.22.jar was built 147 h before this step started: check it is not stale

> warning: arm bb's jar opponents/kc.mega.BeepBoop_2.0.jar was built 134 h before this step started: check it is not stale

### field

**1559 of 7248 battles** (22%), 0 failed. Running 1.2 h, 1244 battles/h, about 4.6 h left (ends ~02:08 PC time). Last battle 0 min ago.
Skipped turns a battle: 34.8 overall, first 100 35.1, last 100 30.8; engine disables 498.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| rel | 520 | 0 | 93.62 | -0.45 (460 robots) | ±0.27 | -0.86 .. -0.04 | 33.8 |
| c | 518 | 0 | 94.10 | - | - | - | 35.3 |
| aa | 521 | 0 | 94.04 | -0.07 (461 robots) | ±0.33 | -0.58 .. +0.43 | 35.5 |

APS = mean difference over the robots read x 1208 panel robots / 1217 pairings.
A/A: aa - c -0.07 pts over 461 robots; 1% band ±0.51 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 1559 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 90 over 200` | halt | ok | 34.1 a battle over the last 200 (first 200: 34.9) |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `aa after 20%` | halt | ok | aa - c -0.07 pts over 461 robots, stop band ±0.60 |

Stopping now would leave 5689 battles unrun (about 4.6 h); every battle already fought is kept and a rerun resumes from it.

> warning: arm rel's jar bisect/rel/hadur117.Hadur_3.23.jar was built 45 h before this step started: check it is not stale

### Queue log (last lines)

```
19:12:40 field exit=0 in 700 s
19:12:40 start ret
19:12:40 watching ret: 3 stop rule(s)
20:18:37 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1544834; work D:\code\Hadur_Robot\hadur-bench\work
20:18:37 start prep
20:18:40 progress pushed to origin claude/pc-rc-confirm-progress (every 15 min)
20:20:06 prep exit=0 in 88 s
20:20:06 start livematch
20:20:06 watching livematch: 3 stop rule(s)
20:20:13 livematch exit=0 in 7 s
20:20:13 start field
20:20:13 watching field: 5 stop rule(s)
20:20:38 progress field: 0/7248 (0%) battles, 0 failed
20:50:55 progress field: 644/7248 (9%) battles, 1288/h, ETA 5.1 h, 0 failed, skips 30.9/battle (last 100), rel -0.63, aa +0.08
21:21:16 progress field: 1288/7248 (18%) battles, 1268/h, ETA 4.7 h, 0 failed, skips 28.8/battle (last 100), rel -0.47, aa -0.13
```
