# Queue pc-jaylexi-11: progress

Updated 2026-11-21 01:41:14 PC time (01:41 UTC), runner pid 90400.

- `prep` done, exit 0 in 1 min
- `livematch` done, exit 0 in 0 min
- `bench` running
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

> warning: arm c's jar bisect/live/hadur117.Hadur_3.22.jar was built 125 h before this step started: check it is not stale

> warning: arm bb's jar opponents/kc.mega.BeepBoop_2.0.jar was built 112 h before this step started: check it is not stale

### bench

**12435 of 16032 battles** (78%), 0 failed. Running 2.5 h, 5430 battles/h, about 40 min left (ends ~02:20 PC time). Last battle -0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0; engine disables 0.

| arm | battles | failed | share | vs control (pts) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 3111 | 0 | 88.56 | - | - | - | 0.0 |
| aa | 3108 | 0 | 88.57 | +0.02 (668 robots) | ±0.04 | -0.04 .. +0.07 | 0.0 |
| n | 3108 | 0 | 88.66 | +0.10 (668 robots) | ±0.15 | -0.13 .. +0.32 | 0.0 |
| r6 | 3108 | 0 | 88.34 | -0.22 (668 robots) | ±0.18 | -0.49 .. +0.05 | 0.0 |
A/A: aa - c +0.02 pts over 668 robots; 1% band ±0.21 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 12435 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | ok | 0.0 a battle over the last 200 (first 200: 0.0) |
| `stall 30m` | halt | ok | last battle -0 min ago |
| `aa after 20%` | halt | ok | aa - c +0.02 pts over 668 robots, stop band ±0.24 |
| `futility n below -0.5 after 20%` | finish | ok | n +0.10, best case +0.32 pts vs bar -0.50 |

Stopping now would leave 3597 battles unrun (about 40 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
23:10:04 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1544834; work D:\code\Hadur_Robot\hadur-bench\work
23:10:04 start prep
23:10:07 progress pushed to origin claude/pc-jaylexi-11-progress (every 15 min)
23:10:37 prep exit=0 in 32 s
23:10:37 start livematch
23:10:37 watching livematch: 3 stop rule(s)
23:10:46 livematch exit=0 in 9 s
23:10:46 start bench
23:10:46 watching bench: 6 stop rule(s)
23:11:04 progress bench: 4/16032 (0%) battles, 792/h, ETA 20.2 h, 0 failed, skips 0.0/battle (last 100)
23:41:15 progress bench: 2795/16032 (17%) battles, 5558/h, ETA 2.4 h, 0 failed, skips 0.0/battle (last 100), aa +0.06, n +0.17, r6 -0.16
00:11:27 progress bench: 5551/16032 (35%) battles, 5480/h, ETA 1.9 h, 0 failed, skips 0.0/battle (last 100), aa +0.05, n +0.11, r6 -0.11
00:41:43 progress bench: 7757/16032 (48%) battles, 4356/h, ETA 1.9 h, 0 failed, skips 0.0/battle (last 100), aa +0.04, n +0.05, r6 -0.22
01:11:58 progress bench: 9782/16032 (61%) battles, 4018/h, ETA 1.6 h, 0 failed, skips 0.0/battle (last 100), aa +0.03, n +0.07, r6 -0.22
```
