# Queue pc-locks: progress

Updated 2026-11-16 21:27:27 PC time (21:27 UTC), runner pid 72252.

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

> warning: arm c's jar bisect/live/hadur117.Hadur_3.22.jar was built 28 h before this step started: check it is not stale

> warning: arm bb's jar opponents/kc.mega.BeepBoop_2.0.jar was built 15 h before this step started: check it is not stale

### lock

**353 of 432 battles** (82%), 0 failed. Running 3 min, 7049 battles/h, about 1 min left (ends ~21:28 PC time). Last battle 0 min ago.
Skipped turns a battle: 16.7 overall, first 100 17.7, last 100 16.0; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 60 | 0 | 95.82 | - | - | - | 16.5 |
| aa | 59 | 0 | 95.44 | -0.00 (6 robots) | ±0.00 | -0.01 .. +0.00 | 16.7 |
| vj | 58 | 0 | 96.15 | +0.00 (6 robots) | ±0.00 | -0.00 .. +0.01 | 16.6 |
| hl | 59 | 0 | 96.10 | +0.00 (6 robots) | ±0.00 | -0.00 .. +0.01 | 16.6 |
| dp | 58 | 0 | 96.00 | +0.00 (6 robots) | ±0.00 | -0.00 .. +0.00 | 16.8 |
| kl | 59 | 0 | 96.31 | +0.00 (6 robots) | ±0.00 | -0.00 .. +0.01 | 16.9 |

APS = mean difference over the robots read x 6 panel robots / 1217 pairings.
A/A: aa - c -0.38 pts over 6 robots; 1% band ±1.51 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 353 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 24` | halt | ok | 16.0 a battle over the last 24 (first 24: 20.6) |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 79 battles unrun (about 1 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
19:50:10 start gate
19:50:11 gate exit=0 in 0 s
19:50:11 start pr
19:50:19 pr exit=0 in 7 s
19:50:19 ALLDONE
21:20:23 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1544834; work D:\code\Hadur_Robot\hadur-bench\work
21:20:23 start prep
21:20:25 progress pushed to origin claude/pc-locks-progress (every 15 min)
21:24:16 prep exit=0 in 232 s
21:24:16 start livematch
21:24:16 watching livematch: 3 stop rule(s)
21:24:25 progress livematch: 124/124 (100%) battles, 0 failed, bb +0.37
21:24:25 livematch exit=0 in 9 s
21:24:25 start lock
21:24:25 watching lock: 4 stop rule(s)
```
