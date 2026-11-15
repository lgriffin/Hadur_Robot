# Queue pc-ram11b: progress

Updated 2026-11-15 17:53:38 PC time (17:53 UTC), runner pid 65900.

- `prep` done, exit 0 in 2 min
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

> warning: arm bb's jar opponents/kc.mega.BeepBoop_2.0.jar was built 964 h before this step started: check it is not stale

### lock

**25 of 36 battles** (69%), 0 failed. Running 0 min, 4259 battles/h, about 0 min left (ends ~17:53 PC time). Last battle 0 min ago.
Skipped turns a battle: 15.8 overall, first 25 15.8, last 25 15.8; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 9 | 0 | 85.44 | - | - | - | 16.1 |
| aa | 7 | 0 | 82.40 | -0.00 (1 robots) | - | - | 16.4 |
| rcl | 9 | 0 | 88.75 | +0.00 (1 robots) | - | - | 14.9 |

APS = mean difference over the robots read x 1 panel robots / 1217 pairings.
A/A: aa - c -3.05 pts over 1 robots; 1% band ±4.16 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 25 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 24` | halt | ok | 15.7 a battle over the last 24 (first 24: 15.9) |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 11 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
17:51:37 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1544834; work D:\code\Hadur_Robot\hadur-bench\work
17:51:37 start prep
17:51:40 progress pushed to origin claude/pc-ram11b-progress (every 15 min)
17:53:09 prep exit=0 in 92 s
17:53:09 start livematch
17:53:09 watching livematch: 3 stop rule(s)
17:53:17 livematch exit=0 in 7 s
17:53:17 start lock
17:53:17 watching lock: 4 stop rule(s)
17:53:38 progress lock: 25/36 (69%) battles, 4259/h, ETA 0 min, 0 failed, skips 15.8/battle (last 100), aa -0.00, rcl +0.00
```
