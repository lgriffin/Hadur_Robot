# Queue pc-locks: progress

Updated 2026-11-23 00:13:07 PC time (00:13 UTC), runner pid 44364.

- `prep` done, exit 0 in 2 min
- `livematch` done, exit 0 in 0 min
- `lock` running
- `gate` pending
- `pr` pending

### livematch

**124 of 124 battles** (100%), 0 failed, 124 read back from an earlier run. Running 0 min. Last battle 0 min ago.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 62 | 0 | 70.75 | - | - | - | 10.2 |
| bb | 62 | 0 | 84.03 | +0.34 (31 robots) | ±0.06 | +0.24 .. +0.44 | 1.1 |

APS = mean difference over the robots read x 31 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 124 |
| `dead 8` | halt | ok | every arm scoring |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun; every battle already fought is kept and a rerun resumes from it.

> warning: arm c's jar bisect/live/hadur117.Hadur_3.22.jar was built 174 h before this step started: check it is not stale

> warning: arm bb's jar opponents/kc.mega.BeepBoop_2.0.jar was built 161 h before this step started: check it is not stale

### lock

**851 of 900 battles** (95%), 0 failed. Running 6 min, 8022 battles/h, about 0 min left (ends ~00:13 PC time). Last battle 0 min ago.
Skipped turns a battle: 15.0 overall, first 100 16.1, last 100 14.8; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 283 | 0 | 88.88 | - | - | - | 14.9 |
| aa | 283 | 0 | 88.73 | -0.00 (25 robots) | ±0.00 | -0.01 .. +0.00 | 14.9 |
| rln | 285 | 0 | 90.77 | +0.04 (25 robots) | ±0.01 | +0.03 .. +0.05 | 15.2 |

APS = mean difference over the robots read x 25 panel robots / 1217 pairings.
A/A: aa - c -0.14 pts over 25 robots; 1% band ±0.69 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 851 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 24` | halt | ok | 14.5 a battle over the last 24 (first 24: 19.3) |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 49 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
17:52:31 start gate
17:52:32 gate exit=0 in 0 s
17:52:32 start pr
17:52:38 pr exit=0 in 6 s
17:52:38 ALLDONE
00:05:02 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1544834; work D:\code\Hadur_Robot\hadur-bench\work
00:05:02 start prep
00:05:04 progress pushed to origin claude/pc-locks-progress (every 15 min)
00:06:36 prep exit=0 in 93 s
00:06:36 start livematch
00:06:36 watching livematch: 3 stop rule(s)
00:06:44 livematch exit=0 in 8 s
00:06:44 start lock
00:06:44 watching lock: 4 stop rule(s)
00:07:03 progress lock: 20/900 (2%) battles, 3753/h, ETA 14 min, 0 failed, skips 19.8/battle (last 100), aa -0.03, rln +0.06
```
