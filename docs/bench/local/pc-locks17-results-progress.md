# Queue pc-locks: progress

Updated 2026-11-21 16:11:14 PC time (16:11 UTC), runner pid 60828.

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

> warning: arm c's jar bisect/live/hadur117.Hadur_3.22.jar was built 142 h before this step started: check it is not stale

> warning: arm bb's jar opponents/kc.mega.BeepBoop_2.0.jar was built 129 h before this step started: check it is not stale

### lock

**1007 of 1008 battles** (100%), 0 failed. Running 18 min, 3385 battles/h, about 0 min left (ends ~16:11 PC time). Last battle 0 min ago.
Skipped turns a battle: 20.5 overall, first 100 27.3, last 100 13.7; engine disables 78.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 144 | 0 | 87.18 | - | - | - | 20.0 |
| aa | 143 | 0 | 86.75 | -0.00 (12 robots) | ±0.00 | -0.01 .. +0.00 | 19.9 |
| pm | 144 | 0 | 87.61 | +0.01 (12 robots) | ±0.02 | -0.02 .. +0.04 | 22.0 |
| ty | 144 | 0 | 86.89 | -0.00 (12 robots) | ±0.00 | -0.00 .. +0.00 | 20.0 |
| rbd | 144 | 0 | 86.48 | -0.00 (12 robots) | ±0.01 | -0.01 .. +0.00 | 21.8 |
| rp | 144 | 0 | 87.07 | +0.00 (12 robots) | ±0.00 | -0.00 .. +0.00 | 18.0 |
| bb | 144 | 0 | 82.06 | -0.05 (12 robots) | ±0.04 | -0.11 .. +0.02 | 21.9 |

APS = mean difference over the robots read x 12 panel robots / 1217 pairings.
A/A: aa - c -0.44 pts over 12 robots; 1% band ±0.97 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 1007 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 24` | halt | ok | 8.2 a battle over the last 24 (first 24: 23.2) |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 1 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
14:23:05 start gate
14:23:06 gate exit=0 in 1 s
14:23:06 start pr
14:23:13 pr exit=0 in 6 s
14:23:13 ALLDONE
15:49:00 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1544834; work D:\code\Hadur_Robot\hadur-bench\work
15:49:00 start prep
15:49:03 progress pushed to origin claude/pc-locks-progress (every 15 min)
15:53:15 prep exit=0 in 254 s
15:53:15 start livematch
15:53:15 watching livematch: 3 stop rule(s)
15:53:23 livematch exit=0 in 8 s
15:53:23 start lock
15:53:23 watching lock: 4 stop rule(s)
15:54:02 progress lock: 49/1008 (5%) battles, 4492/h, ETA 13 min, 0 failed, skips 25.0/battle (last 100), aa +0.02, pm -0.01, ty -0.01, rbd +0.01, rp -0.01, bb -0.06
```
