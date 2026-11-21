# Queue pc-rc-confirm: progress

Updated 2026-11-21 20:48:53 PC time (20:48 UTC), runner pid 83088.

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

**597 of 7248 battles** (8%), 0 failed. Running 29 min, 1250 battles/h, about 5.3 h left (ends ~02:08 PC time). Last battle 0 min ago.
Skipped turns a battle: 36.3 overall, first 100 35.1, last 100 32.4; engine disables 197.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| rel | 200 | 0 | 93.25 | -0.64 (183 robots) | ±0.47 | -1.36 .. +0.09 | 32.4 |
| c | 199 | 0 | 93.88 | - | - | - | 39.5 |
| aa | 198 | 0 | 93.83 | +0.07 (183 robots) | ±0.53 | -0.73 .. +0.88 | 37.2 |

APS = mean difference over the robots read x 1208 panel robots / 1217 pairings.
A/A: aa - c +0.07 pts over 183 robots; 1% band ±0.84 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 597 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 90 over 200` | halt | ok | 36.6 a battle over the last 200 (first 200: 34.9) |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `aa after 20%` | halt | waiting | checks from 20% of the battles (now 8%) |

Stopping now would leave 6651 battles unrun (about 5.3 h); every battle already fought is kept and a rerun resumes from it.

> warning: arm rel's jar bisect/rel/hadur117.Hadur_3.23.jar was built 45 h before this step started: check it is not stale

### Queue log (last lines)

```
19:01:00 watching field: 5 stop rule(s)
19:01:21 progress field: 7152/7248 (99%) battles, 0 failed, rel -0.48, aa +0.03
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
```
