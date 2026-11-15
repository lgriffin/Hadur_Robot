# Queue pc-ram11: progress

Updated 2026-11-15 17:50:53 PC time (17:50 UTC), runner pid 45900.

- `prep` done, exit 0 in 2 min
- `livematch` done, exit 0 in 8 min
- `lock` running
- `gate` pending
- `pr` pending

### livematch

**124 of 124 battles** (100%), 0 failed. Running 8 min, 944 battles/h, about 0 min left (ends ~17:50 PC time). Last battle 0 min ago.
Skipped turns a battle: 5.0 overall, first 100 5.0, last 100 4.8; engine disables 0.

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

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

> warning: arm bb's jar opponents/kc.mega.BeepBoop_2.0.jar was built 964 h before this step started: check it is not stale

### lock

**48 of 108 battles** (44%), 0 failed. Running 0 min, 6865 battles/h, about 1 min left (ends ~17:51 PC time). Last battle 0 min ago.
Skipped turns a battle: 19.3 overall, first 48 19.3, last 48 19.3; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 16 | 0 | 79.83 | - | - | - | 19.4 |
| aa | 16 | 0 | 78.91 | -0.00 (3 robots) | ±0.00 | -0.01 .. +0.01 | 19.2 |
| rcl | 16 | 0 | 84.68 | +0.01 (3 robots) | ±0.00 | +0.01 .. +0.02 | 19.1 |

APS = mean difference over the robots read x 3 panel robots / 1217 pairings.
A/A: aa - c -0.91 pts over 3 robots; 1% band ±2.92 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 48 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 24` | halt | ok | 18.0 a battle over the last 24 (first 24: 20.5) |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 60 battles unrun (about 1 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
17:40:48 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1544834; work D:\code\Hadur_Robot\hadur-bench\work
17:40:48 start prep
17:40:50 progress pushed to origin claude/pc-ram11-progress (every 15 min)
17:42:34 prep exit=0 in 106 s
17:42:34 start livematch
17:42:34 watching livematch: 3 stop rule(s)
17:42:48 progress livematch: 1/124 (1%) battles, 255/h, ETA 29 min, 0 failed, skips 2.0/battle (last 100)
17:50:27 livematch exit=0 in 472 s
17:50:27 start lock
17:50:27 watching lock: 4 stop rule(s)
```
