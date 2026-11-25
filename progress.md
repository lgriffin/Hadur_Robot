# Queue pc-rc-confirm: progress

Updated 2026-11-25 21:47:58 PC time (21:47 UTC), runner pid 105672.

- `prep` done, exit 0 in 2 min
- `livematch` done, exit 0 in 8 min
- `field` running
- `ret` pending
- `gate112` pending
- `gate` pending
- `pr` pending

### livematch

**124 of 124 battles** (100%), 0 failed. Running 8 min, 956 battles/h, about 0 min left (ends ~21:42 PC time). Last battle 0 min ago.
Skipped turns a battle: 5.3 overall, first 100 4.8, last 100 5.4; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 62 | 0 | 69.81 | - | - | - | 9.7 |
| bb | 62 | 0 | 84.49 | +0.37 (31 robots) | ±0.06 | +0.28 .. +0.47 | 0.9 |

APS = mean difference over the robots read x 31 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 124 |
| `dead 8` | halt | ok | every arm scoring |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

> warning: arm c's jar bisect/live/hadur117.Hadur_3.22.jar was built 244 h before this step started: check it is not stale

> warning: arm bb's jar opponents/kc.mega.BeepBoop_2.0.jar was built 231 h before this step started: check it is not stale

### field

**121 of 3636 battles** (3%), 0 failed. Running 6 min, 1291 battles/h, about 2.7 h left (ends ~00:31 PC time). Last battle -0 min ago.
Skipped turns a battle: 35.2 overall, first 100 34.8, last 100 36.0; engine disables 37.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| rel | 40 | 0 | 94.06 | -0.01 (35 robots) | ±0.72 | -1.11 .. +1.09 | 32.4 |
| c | 40 | 0 | 95.18 | - | - | - | 34.8 |
| aa | 41 | 0 | 93.78 | -0.26 (36 robots) | ±0.75 | -1.40 .. +0.89 | 38.6 |

APS = mean difference over the robots read x 1212 panel robots / 1217 pairings.
A/A: aa - c -0.26 pts over 36 robots; 1% band ±1.95 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 121 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 90 over 200` | halt | waiting | 121 of 200 battles to read |
| `stall 30m` | halt | ok | last battle -0 min ago |
| `aa after 20%` | halt | waiting | checks from 20% of the battles (now 3%) |

Stopping now would leave 3515 battles unrun (about 2.7 h); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
01:25:55 start gate
01:25:56 gate exit=0 in 0 s
01:25:56 start pr
01:26:06 pr exit=0 in 9 s
01:26:06 ALLDONE
21:32:46 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1544834; work D:\code\Hadur_Robot\hadur-bench\work
21:32:46 start prep
21:32:49 progress pushed to origin claude/pc-rc-confirm-progress (every 15 min)
21:34:30 prep exit=0 in 103 s
21:34:30 start livematch
21:34:30 watching livematch: 3 stop rule(s)
21:34:47 progress livematch: 2/124 (2%) battles, 421/h, ETA 17 min, 0 failed, skips 1.0/battle (last 100)
21:42:17 livematch exit=0 in 467 s
21:42:17 start field
21:42:17 watching field: 5 stop rule(s)
```
