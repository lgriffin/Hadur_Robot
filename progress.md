# Queue pc-locks: progress

Updated 2026-11-17 08:48:58 PC time (08:48 UTC), runner pid 17856.

- `prep` done, exit 0 in 8 min
- `livematch` done, exit 0 in 0 min
- `lock` running
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

> warning: arm c's jar bisect/live/hadur117.Hadur_3.22.jar was built 38 h before this step started: check it is not stale

> warning: arm bb's jar opponents/kc.mega.BeepBoop_2.0.jar was built 25 h before this step started: check it is not stale

### lock

**5134 of 6336 battles** (81%), 0 failed. Running 52 min, 5798 battles/h, about 12 min left (ends ~09:01 PC time). Last battle 0 min ago.
Skipped turns a battle: 16.8 overall, first 100 18.5, last 100 16.6; engine disables 10.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 429 | 0 | 92.68 | - | - | - | 16.9 |
| aa | 427 | 0 | 92.57 | -0.00 (44 robots) | ±0.01 | -0.02 .. +0.01 | 16.8 |
| rh | 427 | 0 | 92.86 | +0.01 (44 robots) | ±0.01 | -0.00 .. +0.02 | 16.7 |
| dp | 428 | 0 | 92.85 | +0.01 (44 robots) | ±0.01 | -0.00 .. +0.02 | 16.7 |
| sp2 | 428 | 0 | 92.93 | +0.01 (44 robots) | ±0.01 | -0.00 .. +0.03 | 16.8 |
| rwl | 427 | 0 | 93.02 | +0.01 (44 robots) | ±0.01 | +0.00 .. +0.03 | 16.9 |
| gl | 426 | 0 | 92.70 | +0.00 (44 robots) | ±0.01 | -0.01 .. +0.01 | 16.9 |
| hl | 429 | 0 | 92.58 | -0.00 (44 robots) | ±0.01 | -0.01 .. +0.01 | 16.7 |
| mt | 428 | 0 | 92.77 | +0.01 (44 robots) | ±0.01 | -0.01 .. +0.02 | 16.7 |
| or | 429 | 0 | 92.87 | +0.01 (44 robots) | ±0.01 | -0.01 .. +0.03 | 17.0 |
| rp | 428 | 0 | 92.74 | +0.00 (44 robots) | ±0.01 | -0.01 .. +0.02 | 16.9 |
| mtx0 | 428 | 0 | 92.66 | +0.00 (44 robots) | ±0.01 | -0.01 .. +0.01 | 16.7 |

APS = mean difference over the robots read x 44 panel robots / 1217 pairings.
A/A: aa - c -0.11 pts over 44 robots; 1% band ±0.56 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 5134 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 24` | halt | ok | 16.0 a battle over the last 24 (first 24: 21.0) |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 1202 battles unrun (about 12 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
21:28:22 gate exit=0 in 0 s
21:28:22 start pr
21:28:31 pr exit=0 in 8 s
21:28:31 ALLDONE
07:48:28 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1544834; work D:\code\Hadur_Robot\hadur-bench\work
07:48:28 start prep
07:48:30 progress pushed to origin claude/pc-locks-progress (every 15 min)
07:56:44 prep exit=0 in 495 s
07:56:44 start livematch
07:56:44 watching livematch: 3 stop rule(s)
07:56:54 livematch exit=0 in 10 s
07:56:54 start lock
07:56:54 watching lock: 4 stop rule(s)
07:57:33 progress lock: 51/6336 (1%) battles, 4788/h, ETA 1.3 h, 0 failed, skips 19.2/battle (last 100), aa +0.02, rh +0.04, gl +0.04, mtx0 +0.03
08:27:44 progress lock: 3033/6336 (48%) battles, 5914/h, ETA 34 min, 0 failed, skips 16.4/battle (last 100), aa +0.00, rh +0.01, dp +0.01, sp2 +0.01, rwl +0.01, gl +0.00, hl +0.00, mt +0.01, or +0.01, rp +0.01, mtx0 -0.00
```
