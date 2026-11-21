# Queue pc-jaylexi-12: progress

Updated 2026-11-21 08:23:25 PC time (08:23 UTC), runner pid 13516.

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

> warning: arm c's jar bisect/live/hadur117.Hadur_3.22.jar was built 134 h before this step started: check it is not stale

> warning: arm bb's jar opponents/kc.mega.BeepBoop_2.0.jar was built 121 h before this step started: check it is not stale

### bench

**2984 of 20040 battles** (15%), 0 failed. Running 30 min, 6063 battles/h, about 2.8 h left (ends ~11:12 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0; engine disables 0.

| arm | battles | failed | share | vs control (pts) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 597 | 0 | 88.57 | - | - | - | 0.0 |
| aa | 596 | 0 | 88.60 | -0.00 (423 robots) | ±0.13 | -0.20 .. +0.19 | 0.0 |
| n | 595 | 0 | 88.73 | +0.12 (422 robots) | ±0.30 | -0.34 .. +0.58 | 0.0 |
| t | 598 | 0 | 88.75 | +0.15 (423 robots) | ±0.31 | -0.32 .. +0.62 | 0.0 |
| r6 | 598 | 0 | 88.41 | -0.19 (423 robots) | ±0.34 | -0.71 .. +0.33 | 0.0 |
A/A: aa - c -0.00 pts over 423 robots; 1% band ±0.48 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 2984 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | ok | 0.0 a battle over the last 200 (first 200: 0.0) |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `aa after 20%` | halt | waiting | checks from 20% of the battles (now 15%) |
| `futility t below -0.5 after 20%` | finish | waiting | checks from 20% of the battles (now 15%) |

Stopping now would leave 17056 battles unrun (about 2.8 h); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
07:53:13 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1544834; work D:\code\Hadur_Robot\hadur-bench\work
07:53:13 start prep
07:53:15 progress pushed to origin claude/pc-jaylexi-12-progress (every 15 min)
07:53:44 prep exit=0 in 31 s
07:53:44 start livematch
07:53:44 watching livematch: 3 stop rule(s)
07:53:52 livematch exit=0 in 7 s
07:53:52 start bench
07:53:52 watching bench: 6 stop rule(s)
07:54:14 progress bench: 16/20040 (0%) battles, 2604/h, ETA 7.7 h, 0 failed, skips 0.0/battle (last 100)
```
