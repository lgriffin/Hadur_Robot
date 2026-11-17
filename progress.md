# Queue pc-locks: progress

Updated 2026-11-17 18:15:11 PC time (18:15 UTC), runner pid 83520.

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

> warning: arm c's jar bisect/live/hadur117.Hadur_3.22.jar was built 48 h before this step started: check it is not stale

> warning: arm bb's jar opponents/kc.mega.BeepBoop_2.0.jar was built 35 h before this step started: check it is not stale

### lock

**1404 of 1860 battles** (75%), 0 failed. Running 12 min, 7296 battles/h, about 4 min left (ends ~18:18 PC time). Last battle 0 min ago.
Skipped turns a battle: 19.6 overall, first 100 16.8, last 100 21.4; engine disables 2.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 281 | 0 | 91.48 | - | - | - | 19.3 |
| aa | 280 | 0 | 91.50 | +0.00 (31 robots) | ±0.01 | -0.01 .. +0.01 | 19.1 |
| rf | 281 | 0 | 93.43 | +0.05 (31 robots) | ±0.01 | +0.03 .. +0.07 | 20.0 |
| sp2 | 281 | 0 | 91.72 | +0.01 (31 robots) | ±0.01 | -0.01 .. +0.02 | 19.6 |
| rwl | 281 | 0 | 91.63 | +0.00 (31 robots) | ±0.01 | -0.01 .. +0.01 | 19.9 |

APS = mean difference over the robots read x 31 panel robots / 1217 pairings.
A/A: aa - c +0.02 pts over 31 robots; 1% band ±0.70 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 1404 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 24` | halt | ok | 20.1 a battle over the last 24 (first 24: 19.1) |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 456 battles unrun (about 4 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
09:03:58 start gate
09:03:59 gate exit=0 in 0 s
09:03:59 start pr
09:04:05 pr exit=0 in 6 s
09:04:05 ALLDONE
18:00:02 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1544834; work D:\code\Hadur_Robot\hadur-bench\work
18:00:02 start prep
18:00:05 progress pushed to origin claude/pc-locks-progress (every 15 min)
18:03:28 prep exit=0 in 205 s
18:03:28 start livematch
18:03:28 watching livematch: 3 stop rule(s)
18:03:38 livematch exit=0 in 9 s
18:03:38 start lock
18:03:38 watching lock: 4 stop rule(s)
18:04:04 progress lock: 35/1860 (2%) battles, 4798/h, ETA 23 min, 0 failed, skips 18.0/battle (last 100), aa -0.01, rf +0.05, sp2 -0.02
```
