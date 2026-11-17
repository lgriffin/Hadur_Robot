# Queue pc-locks: progress

Updated 2026-11-17 08:03:35 PC time (08:03 UTC), runner pid 17856.

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

**662 of 6336 battles** (10%), 0 failed. Running 7 min, 5951 battles/h, about 57 min left (ends ~09:00 PC time). Last battle 0 min ago.
Skipped turns a battle: 16.7 overall, first 100 18.5, last 100 16.2; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 55 | 0 | 91.84 | - | - | - | 16.0 |
| aa | 54 | 0 | 92.81 | +0.04 (33 robots) | ±0.04 | -0.02 .. +0.11 | 17.0 |
| rh | 56 | 0 | 91.98 | +0.00 (33 robots) | ±0.02 | -0.03 .. +0.03 | 16.5 |
| dp | 54 | 0 | 93.02 | +0.04 (33 robots) | ±0.04 | -0.02 .. +0.09 | 16.8 |
| sp2 | 54 | 0 | 92.26 | +0.01 (33 robots) | ±0.02 | -0.02 .. +0.04 | 17.0 |
| rwl | 54 | 0 | 91.98 | -0.00 (33 robots) | ±0.02 | -0.04 .. +0.03 | 17.3 |
| gl | 58 | 0 | 92.51 | +0.02 (33 robots) | ±0.02 | -0.01 .. +0.05 | 16.2 |
| hl | 58 | 0 | 92.20 | +0.01 (33 robots) | ±0.02 | -0.03 .. +0.04 | 16.4 |
| mt | 54 | 0 | 92.23 | +0.00 (33 robots) | ±0.02 | -0.03 .. +0.03 | 16.8 |
| or | 53 | 0 | 93.13 | +0.02 (32 robots) | ±0.02 | -0.02 .. +0.05 | 16.3 |
| rp | 58 | 0 | 92.60 | +0.02 (33 robots) | ±0.02 | -0.01 .. +0.05 | 17.3 |
| mtx0 | 54 | 0 | 92.16 | -0.00 (33 robots) | ±0.02 | -0.04 .. +0.03 | 16.5 |

APS = mean difference over the robots read x 44 panel robots / 1217 pairings.
A/A: aa - c +1.20 pts over 33 robots; 1% band ±1.60 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 662 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 24` | halt | ok | 16.4 a battle over the last 24 (first 24: 21.0) |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 5674 battles unrun (about 57 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
21:28:21 start gate
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
```
