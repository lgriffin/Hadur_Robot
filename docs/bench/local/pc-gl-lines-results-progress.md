# Queue pc-gl-lines: progress

Updated 2026-11-15 17:56:06 PC time (17:56 UTC), runner pid 48840.

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

**12 of 36 battles** (33%), 0 failed. Running 0 min, 1952 battles/h, about 1 min left (ends ~17:56 PC time). Last battle 0 min ago.
Skipped turns a battle: 13.3 overall, first 12 13.3, last 12 13.3; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 4 | 0 | 68.33 | - | - | - | 13.0 |
| aa | 4 | 0 | 67.89 | -0.00 (1 robots) | - | - | 13.2 |
| gl | 4 | 0 | 73.65 | +0.00 (1 robots) | - | - | 13.8 |

APS = mean difference over the robots read x 1 panel robots / 1217 pairings.
A/A: aa - c -0.44 pts over 1 robots; 1% band ±5.84 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 12 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 24` | halt | waiting | 12 of 24 battles to read |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 24 battles unrun (about 1 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
17:54:05 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1544834; work D:\code\Hadur_Robot\hadur-bench\work
17:54:05 start prep
17:54:07 progress pushed to origin claude/pc-gl-lines-progress (every 15 min)
17:55:37 prep exit=0 in 91 s
17:55:37 start livematch
17:55:37 watching livematch: 3 stop rule(s)
17:55:44 livematch exit=0 in 7 s
17:55:44 start lock
17:55:44 watching lock: 4 stop rule(s)
17:56:06 progress lock: 12/36 (33%) battles, 1952/h, ETA 1 min, 0 failed, skips 13.3/battle (last 100), aa -0.00, gl +0.00
```
