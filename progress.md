# Queue pc-rc-confirm: progress

Updated 2026-11-24 22:33:08 PC time (22:33 UTC), runner pid 95668.

- `prep` done, exit 0 in 2 min
- `livematch` done, exit 0 in 8 min
- `field` running
- `ret` pending
- `gate112` pending
- `gate` pending
- `pr` pending

### livematch

**124 of 124 battles** (100%), 0 failed. Running 8 min, 909 battles/h, about 0 min left (ends ~22:12 PC time). Last battle 0 min ago.
Skipped turns a battle: 5.5 overall, first 100 5.1, last 100 5.6; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 62 | 0 | 70.28 | - | - | - | 10.1 |
| bb | 62 | 0 | 84.27 | +0.36 (31 robots) | ±0.07 | +0.25 .. +0.46 | 0.9 |

APS = mean difference over the robots read x 31 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 124 |
| `dead 8` | halt | ok | every arm scoring |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

> warning: arm c's jar bisect/live/hadur117.Hadur_3.22.jar was built 220 h before this step started: check it is not stale

> warning: arm bb's jar opponents/kc.mega.BeepBoop_2.0.jar was built 207 h before this step started: check it is not stale

### field

**445 of 3636 battles** (12%), 0 failed. Running 20 min, 1315 battles/h, about 2.4 h left (ends ~00:58 PC time). Last battle 0 min ago.
Skipped turns a battle: 38.7 overall, first 100 36.0, last 100 38.9; engine disables 157.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| rel | 149 | 0 | 94.21 | -0.43 (145 robots) | ±0.34 | -0.96 .. +0.09 | 37.6 |
| c | 148 | 0 | 94.52 | - | - | - | 39.5 |
| aa | 148 | 0 | 94.67 | +0.11 (146 robots) | ±0.48 | -0.62 .. +0.84 | 39.1 |

APS = mean difference over the robots read x 1212 panel robots / 1217 pairings.
A/A: aa - c +0.11 pts over 146 robots; 1% band ±0.97 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 445 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 90 over 200` | halt | ok | 40.4 a battle over the last 200 (first 200: 37.6) |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `aa after 20%` | halt | waiting | checks from 20% of the battles (now 12%) |

Stopping now would leave 3191 battles unrun (about 2.4 h); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
22:47:31 start gate
22:47:32 gate exit=0 in 0 s
22:47:32 start pr
22:47:39 pr exit=0 in 7 s
22:47:39 ALLDONE
22:02:47 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1544834; work D:\code\Hadur_Robot\hadur-bench\work
22:02:47 start prep
22:02:50 progress pushed to origin claude/pc-rc-confirm-progress (every 15 min)
22:04:35 prep exit=0 in 107 s
22:04:35 start livematch
22:04:35 watching livematch: 3 stop rule(s)
22:04:49 progress livematch: 1/124 (1%) battles, 254/h, ETA 29 min, 0 failed, skips 2.0/battle (last 100)
22:12:46 livematch exit=0 in 491 s
22:12:46 start field
22:12:46 watching field: 5 stop rule(s)
```
