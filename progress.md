# Queue pc-jaylexi-09: progress

Updated 2026-11-19 10:16:50 PC time (10:16 UTC), runner pid 25996.

- `prep` done, exit 0 in 4 min
- `livematch` done, exit 0 in 0 min
- `bench` running
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

> warning: arm c's jar bisect/live/hadur117.Hadur_3.22.jar was built 88 h before this step started: check it is not stale

> warning: arm bb's jar opponents/kc.mega.BeepBoop_2.0.jar was built 75 h before this step started: check it is not stale

### bench

**6192 of 16008 battles** (39%), 0 failed. Running 56 min, 6534 battles/h, about 1.5 h left (ends ~11:46 PC time). Last battle -0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0; engine disables 0.

| arm | battles | failed | share | vs control (pts) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 1548 | 0 | 88.18 | - | - | - | 0.0 |
| aa | 1547 | 0 | 88.19 | +0.02 (636 robots) | ±0.05 | -0.06 .. +0.09 | 0.0 |
| n | 1548 | 0 | 88.30 | +0.11 (636 robots) | ±0.22 | -0.22 .. +0.44 | 0.0 |
| r6 | 1549 | 0 | 88.23 | +0.04 (636 robots) | ±0.24 | -0.33 .. +0.42 | 0.0 |
A/A: aa - c +0.02 pts over 636 robots; 1% band ±0.30 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 6192 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | ok | 0.0 a battle over the last 200 (first 200: 0.0) |
| `stall 30m` | halt | ok | last battle -0 min ago |
| `aa after 20%` | halt | ok | aa - c +0.02 pts over 636 robots, stop band ±0.35 |
| `futility n below -0.5 after 20%` | finish | ok | n +0.11, best case +0.44 pts vs bar -0.50 |

Stopping now would leave 9816 battles unrun (about 1.5 h); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
09:16:17 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1544834; work D:\code\Hadur_Robot\hadur-bench\work
09:16:17 start prep
09:16:19 progress pushed to origin claude/pc-jaylexi-09-progress (every 15 min)
09:20:23 prep exit=0 in 246 s
09:20:23 start livematch
09:20:23 watching livematch: 3 stop rule(s)
09:20:31 livematch exit=0 in 7 s
09:20:31 start bench
09:20:31 watching bench: 6 stop rule(s)
09:21:21 progress bench: 66/16008 (0%) battles, 4811/h, ETA 3.3 h, 0 failed, skips 0.0/battle (last 100), aa -0.06, n +1.77, r6 +0.11
09:51:35 progress bench: 3434/16008 (21%) battles, 6672/h, ETA 1.9 h, 0 failed, skips 0.0/battle (last 100), aa -0.00, n +0.15, r6 +0.05
```
