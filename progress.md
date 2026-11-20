# Queue pc-jaylexi-10: progress

Updated 2026-11-20 10:49:21 PC time (10:49 UTC), runner pid 61244.

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

> warning: arm c's jar bisect/live/hadur117.Hadur_3.22.jar was built 112 h before this step started: check it is not stale

> warning: arm bb's jar opponents/kc.mega.BeepBoop_2.0.jar was built 99 h before this step started: check it is not stale

### bench

**6431 of 16008 battles** (40%), 0 failed. Running 1.2 h, 5208 battles/h, about 1.8 h left (ends ~12:39 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0; engine disables 0.

| arm | battles | failed | share | vs control (pts) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 1607 | 0 | 88.11 | - | - | - | 0.0 |
| aa | 1608 | 0 | 88.12 | -0.01 (641 robots) | ±0.03 | -0.06 .. +0.04 | 0.0 |
| n | 1610 | 0 | 88.38 | +0.26 (641 robots) | ±0.21 | -0.06 .. +0.58 | 0.0 |
| r6 | 1606 | 0 | 88.30 | +0.20 (641 robots) | ±0.22 | -0.14 .. +0.54 | 0.0 |
A/A: aa - c -0.01 pts over 641 robots; 1% band ±0.29 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 6431 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | ok | 0.0 a battle over the last 200 (first 200: 0.0) |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `aa after 20%` | halt | ok | aa - c -0.01 pts over 641 robots, stop band ±0.34 |
| `futility n below -0.5 after 20%` | finish | ok | n +0.26, best case +0.58 pts vs bar -0.50 |

Stopping now would leave 9577 battles unrun (about 1.8 h); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
09:33:46 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1544834; work D:\code\Hadur_Robot\hadur-bench\work
09:33:46 start prep
09:33:48 progress pushed to origin claude/pc-jaylexi-10-progress (every 15 min)
09:34:17 prep exit=0 in 31 s
09:34:17 start livematch
09:34:17 watching livematch: 3 stop rule(s)
09:34:26 livematch exit=0 in 8 s
09:34:26 start bench
09:34:26 watching bench: 6 stop rule(s)
09:34:47 progress bench: 15/16008 (0%) battles, 2673/h, ETA 6.0 h, 0 failed, skips 0.0/battle (last 100)
10:04:59 progress bench: 2616/16008 (16%) battles, 5168/h, ETA 2.6 h, 0 failed, skips 0.0/battle (last 100), aa -0.03, n +0.37, r6 +0.27
10:35:15 progress bench: 5187/16008 (32%) battles, 5110/h, ETA 2.1 h, 0 failed, skips 0.0/battle (last 100), aa -0.01, n +0.43, r6 +0.23
```
