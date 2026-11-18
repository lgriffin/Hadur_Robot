# Queue pc-locks: progress

Updated 2026-11-18 22:14:27 PC time (22:14 UTC), runner pid 23212.

- `prep` done, exit 0 in 7 min
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

> warning: arm c's jar bisect/live/hadur117.Hadur_3.22.jar was built 76 h before this step started: check it is not stale

> warning: arm bb's jar opponents/kc.mega.BeepBoop_2.0.jar was built 63 h before this step started: check it is not stale

### lock

**596 of 1680 battles** (35%), 0 failed. Running 8 min, 4272 battles/h, about 15 min left (ends ~22:29 PC time). Last battle 0 min ago.
Skipped turns a battle: 13.3 overall, first 100 14.8, last 100 11.6; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 61 | 0 | 87.77 | - | - | - | 13.0 |
| aa | 61 | 0 | 89.28 | +0.02 (13 robots) | ±0.01 | -0.00 .. +0.04 | 13.0 |
| rf | 61 | 0 | 88.99 | +0.00 (13 robots) | ±0.01 | -0.01 .. +0.02 | 14.0 |
| sp2 | 58 | 0 | 89.71 | +0.01 (13 robots) | ±0.01 | -0.00 .. +0.03 | 12.8 |
| hf | 58 | 0 | 88.45 | -0.00 (13 robots) | ±0.01 | -0.02 .. +0.02 | 13.8 |
| or | 59 | 0 | 88.91 | +0.00 (13 robots) | ±0.01 | -0.01 .. +0.01 | 13.7 |
| rp | 58 | 0 | 90.10 | +0.02 (13 robots) | ±0.02 | -0.02 .. +0.05 | 13.4 |
| mv | 61 | 0 | 86.63 | +0.00 (13 robots) | ±0.01 | -0.01 .. +0.01 | 13.3 |
| md | 58 | 0 | 89.45 | +0.01 (13 robots) | ±0.01 | -0.01 .. +0.03 | 13.8 |
| mtmv | 61 | 0 | 88.33 | -0.00 (13 robots) | ±0.01 | -0.02 .. +0.02 | 12.8 |

APS = mean difference over the robots read x 14 panel robots / 1217 pairings.
A/A: aa - c +1.51 pts over 13 robots; 1% band ±1.49 (OUTSIDE: comparisons void).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 596 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 24` | halt | ok | 11.3 a battle over the last 24 (first 24: 17.7) |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 1084 battles unrun (about 15 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
06:49:49 start gate
06:49:50 gate exit=0 in 0 s
06:49:50 start pr
06:49:58 pr exit=0 in 7 s
06:49:58 ALLDONE
21:59:21 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1544834; work D:\code\Hadur_Robot\hadur-bench\work
21:59:21 start prep
21:59:23 progress pushed to origin claude/pc-locks-progress (every 15 min)
22:05:53 prep exit=0 in 392 s
22:05:53 start livematch
22:05:53 watching livematch: 3 stop rule(s)
22:06:04 livematch exit=0 in 10 s
22:06:04 start lock
22:06:04 watching lock: 4 stop rule(s)
22:06:25 progress lock: 13/1680 (1%) battles, 2314/h, ETA 43 min, 0 failed, skips 19.2/battle (last 100)
```
