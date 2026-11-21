# Queue pc-locks: progress

Updated 2026-11-21 14:13:01 PC time (14:13 UTC), runner pid 79484.

- `prep` done, exit 0 in 4 min
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

> warning: arm c's jar bisect/live/hadur117.Hadur_3.22.jar was built 140 h before this step started: check it is not stale

> warning: arm bb's jar opponents/kc.mega.BeepBoop_2.0.jar was built 127 h before this step started: check it is not stale

### lock

**755 of 1260 battles** (60%), 0 failed. Running 11 min, 4141 battles/h, about 7 min left (ends ~14:20 PC time). Last battle 0 min ago.
Skipped turns a battle: 18.2 overall, first 100 20.4, last 100 16.8; engine disables 38.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 107 | 0 | 85.75 | - | - | - | 17.7 |
| aa | 108 | 0 | 85.78 | +0.00 (15 robots) | ±0.01 | -0.01 .. +0.01 | 17.5 |
| rbd | 112 | 0 | 85.95 | +0.00 (15 robots) | ±0.01 | -0.02 .. +0.02 | 17.9 |
| rp | 106 | 0 | 86.03 | +0.00 (15 robots) | ±0.01 | -0.01 .. +0.02 | 19.5 |
| vj | 107 | 0 | 85.72 | -0.00 (15 robots) | ±0.01 | -0.01 .. +0.01 | 18.3 |
| pm | 109 | 0 | 86.47 | +0.01 (15 robots) | ±0.02 | -0.02 .. +0.04 | 17.4 |
| bb | 106 | 0 | 83.27 | -0.03 (15 robots) | ±0.03 | -0.07 .. +0.01 | 18.8 |

APS = mean difference over the robots read x 15 panel robots / 1217 pairings.
A/A: aa - c +0.03 pts over 15 robots; 1% band ±1.13 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 755 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 24` | halt | ok | 14.1 a battle over the last 24 (first 24: 30.2) |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 505 battles unrun (about 7 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
11:24:23 start gate
11:24:24 gate exit=0 in 0 s
11:24:24 start pr
11:24:29 pr exit=0 in 5 s
11:24:29 ALLDONE
13:57:51 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1544834; work D:\code\Hadur_Robot\hadur-bench\work
13:57:51 start prep
13:57:53 progress pushed to origin claude/pc-locks-progress (every 15 min)
14:01:56 prep exit=0 in 245 s
14:01:56 start livematch
14:01:56 watching livematch: 3 stop rule(s)
14:02:04 livematch exit=0 in 7 s
14:02:04 start lock
14:02:04 watching lock: 4 stop rule(s)
14:02:53 progress lock: 46/1260 (4%) battles, 3423/h, ETA 21 min, 0 failed, skips 24.3/battle (last 100), aa +0.01, rbd +0.05, rp +0.01, vj -0.00, pm +0.01, bb -0.02
```
