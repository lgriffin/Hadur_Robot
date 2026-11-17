# Queue pc-locks: progress

Updated 2026-11-17 23:02:51 PC time (23:02 UTC), runner pid 76532.

- `prep` done, exit 0 in 5 min
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

> warning: arm c's jar bisect/live/hadur117.Hadur_3.22.jar was built 53 h before this step started: check it is not stale

> warning: arm bb's jar opponents/kc.mega.BeepBoop_2.0.jar was built 40 h before this step started: check it is not stale

### lock

**760 of 1056 battles** (72%), 0 failed. Running 10 min, 4538 battles/h, about 4 min left (ends ~23:06 PC time). Last battle 0 min ago.
Skipped turns a battle: 13.2 overall, first 100 14.3, last 100 13.1; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 96 | 0 | 88.53 | - | - | - | 13.3 |
| aa | 94 | 0 | 87.43 | -0.01 (11 robots) | ±0.01 | -0.03 .. +0.01 | 13.3 |
| rf | 96 | 0 | 88.62 | +0.01 (11 robots) | ±0.01 | -0.02 .. +0.03 | 13.1 |
| rp | 92 | 0 | 88.10 | +0.00 (11 robots) | ±0.01 | -0.01 .. +0.02 | 13.4 |
| rwl | 94 | 0 | 88.38 | +0.00 (11 robots) | ±0.01 | -0.01 .. +0.01 | 13.2 |
| mv | 97 | 0 | 88.76 | +0.01 (11 robots) | ±0.01 | -0.00 .. +0.02 | 13.0 |
| mt | 94 | 0 | 88.26 | +0.00 (11 robots) | ±0.01 | -0.01 .. +0.02 | 13.4 |
| mtmv | 97 | 0 | 88.09 | +0.00 (11 robots) | ±0.01 | -0.01 .. +0.01 | 13.2 |

APS = mean difference over the robots read x 11 panel robots / 1217 pairings.
A/A: aa - c -1.10 pts over 11 robots; 1% band ±1.20 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 760 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 24` | halt | ok | 12.8 a battle over the last 24 (first 24: 16.0) |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 296 battles unrun (about 4 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
18:18:55 start gate
18:18:56 gate exit=0 in 1 s
18:18:56 start pr
18:19:02 pr exit=0 in 6 s
18:19:02 ALLDONE
22:47:42 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1544834; work D:\code\Hadur_Robot\hadur-bench\work
22:47:42 start prep
22:47:44 progress pushed to origin claude/pc-locks-progress (every 15 min)
22:52:39 prep exit=0 in 297 s
22:52:39 start livematch
22:52:39 watching livematch: 3 stop rule(s)
22:52:44 progress livematch: 124/124 (100%) battles, 0 failed, bb +0.37
22:52:47 livematch exit=0 in 7 s
22:52:47 start lock
22:52:47 watching lock: 4 stop rule(s)
```
