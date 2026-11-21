# Queue pc-locks: progress

Updated 2026-11-18 06:49:22 PC time (06:49 UTC), runner pid 90284.

- `prep` done, exit 0 in 3 min
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

> warning: arm c's jar bisect/live/hadur117.Hadur_3.22.jar was built 61 h before this step started: check it is not stale

> warning: arm bb's jar opponents/kc.mega.BeepBoop_2.0.jar was built 48 h before this step started: check it is not stale

### lock

**579 of 600 battles** (96%), 0 failed. Running 5 min, 7259 battles/h, about 0 min left (ends ~06:49 PC time). Last battle 0 min ago.
Skipped turns a battle: 14.5 overall, first 100 15.3, last 100 13.9; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 115 | 0 | 92.33 | - | - | - | 14.6 |
| aa | 115 | 0 | 92.50 | +0.00 (10 robots) | ±0.00 | -0.00 .. +0.00 | 14.3 |
| rf | 116 | 0 | 93.95 | +0.01 (10 robots) | ±0.01 | +0.00 .. +0.02 | 14.5 |
| sp2 | 117 | 0 | 92.90 | +0.00 (10 robots) | ±0.01 | -0.00 .. +0.01 | 14.5 |
| mt | 116 | 0 | 94.03 | +0.01 (10 robots) | ±0.02 | -0.02 .. +0.05 | 14.5 |

APS = mean difference over the robots read x 10 panel robots / 1217 pairings.
A/A: aa - c +0.17 pts over 10 robots; 1% band ±1.09 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 579 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 24` | halt | ok | 14.0 a battle over the last 24 (first 24: 16.6) |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 21 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
23:07:48 start gate
23:07:49 gate exit=0 in 1 s
23:07:49 start pr
23:07:56 pr exit=0 in 6 s
23:07:56 ALLDONE
06:41:18 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1544834; work D:\code\Hadur_Robot\hadur-bench\work
06:41:18 start prep
06:41:20 progress pushed to origin claude/pc-locks-progress (every 15 min)
06:44:25 prep exit=0 in 187 s
06:44:25 start livematch
06:44:25 watching livematch: 3 stop rule(s)
06:44:34 livematch exit=0 in 8 s
06:44:34 start lock
06:44:34 watching lock: 4 stop rule(s)
06:45:20 progress lock: 80/600 (13%) battles, 6344/h, ETA 5 min, 0 failed, skips 15.4/battle (last 100), aa +0.01, rf +0.00, sp2 +0.00, mt -0.00
```
