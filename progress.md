# Queue pc-rc-confirm: progress

Updated 2026-11-20 00:15:31 PC time (00:15 UTC), runner pid 72544.

- `prep` done, exit 0 in 2 min
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

> warning: arm c's jar bisect/live/hadur117.Hadur_3.22.jar was built 102 h before this step started: check it is not stale

> warning: arm bb's jar opponents/kc.mega.BeepBoop_2.0.jar was built 89 h before this step started: check it is not stale

### field

**165 of 7158 battles** (2%), 0 failed. Running 13 min, 743 battles/h, about 9.4 h left (ends ~09:40 PC time). Last battle 0 min ago.
Skipped turns a battle: 43.7 overall, first 100 40.2, last 100 45.0; engine disables 74.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| rel | 56 | 0 | 93.16 | -0.59 (49 robots) | ±0.84 | -1.88 .. +0.71 | 50.9 |
| c | 55 | 0 | 94.28 | - | - | - | 45.3 |
| aa | 54 | 0 | 93.68 | +0.35 (50 robots) | ±0.65 | -0.65 .. +1.35 | 34.6 |

APS = mean difference over the robots read x 1193 panel robots / 1217 pairings.
A/A: aa - c +0.36 pts over 50 robots; 1% band ±1.63 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 165 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | waiting | 165 of 200 battles to read |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `aa after 20%` | halt | waiting | checks from 20% of the battles (now 2%) |

Stopping now would leave 6993 battles unrun (about 9.4 h); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
23:19:08 skip ret (after field, which has not finished exit=0)
23:19:08 skip gate112 (after ret, which has not finished exit=0)
23:19:08 skip gate (after gate112, which has not finished exit=0)
23:19:08 skip pr (after gate, which has not finished exit=0)
23:19:08 ALLDONE
00:00:21 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1544834; work D:\code\Hadur_Robot\hadur-bench\work
00:00:21 start prep
00:00:24 progress pushed to origin claude/pc-rc-confirm-progress (every 15 min)
00:02:02 prep exit=0 in 100 s
00:02:02 start livematch
00:02:02 watching livematch: 3 stop rule(s)
00:02:11 livematch exit=0 in 8 s
00:02:11 start field
00:02:11 watching field: 5 stop rule(s)
00:02:23 progress field: 0/7158 (0%) battles, 0 failed
```
