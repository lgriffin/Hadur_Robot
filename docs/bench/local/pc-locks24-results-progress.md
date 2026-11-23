# Queue pc-locks: progress

Updated 2026-11-23 08:01:58 PC time (08:01 UTC), runner pid 59424.

- `prep` done, exit 0 in 3 min
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

> warning: arm c's jar bisect/live/hadur117.Hadur_3.22.jar was built 182 h before this step started: check it is not stale

> warning: arm bb's jar opponents/kc.mega.BeepBoop_2.0.jar was built 169 h before this step started: check it is not stale

### lock

**1527 of 1560 battles** (98%), 0 failed. Running 11 min, 8274 battles/h, about 0 min left (ends ~08:02 PC time). Last battle 0 min ago.
Skipped turns a battle: 14.7 overall, first 100 15.3, last 100 14.5; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 305 | 0 | 88.22 | - | - | - | 14.8 |
| aa | 306 | 0 | 88.25 | +0.00 (26 robots) | ±0.01 | -0.01 .. +0.01 | 14.6 |
| rkn | 304 | 0 | 89.08 | +0.02 (26 robots) | ±0.01 | +0.00 .. +0.03 | 14.6 |
| rlnrkn | 305 | 0 | 89.74 | +0.03 (26 robots) | ±0.01 | +0.01 .. +0.05 | 14.7 |
| rln | 307 | 0 | 88.33 | +0.00 (26 robots) | ±0.01 | -0.01 .. +0.01 | 14.6 |

APS = mean difference over the robots read x 26 panel robots / 1217 pairings.
A/A: aa - c +0.03 pts over 26 robots; 1% band ±0.67 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 1527 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 24` | halt | ok | 13.8 a battle over the last 24 (first 24: 19.5) |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 33 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
00:13:34 start gate
00:13:35 gate exit=0 in 0 s
00:13:35 start pr
00:13:41 pr exit=0 in 6 s
00:13:41 ALLDONE
07:47:51 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1544834; work D:\code\Hadur_Robot\hadur-bench\work
07:47:51 start prep
07:47:54 progress pushed to origin claude/pc-locks-progress (every 15 min)
07:50:44 prep exit=0 in 172 s
07:50:44 start livematch
07:50:44 watching livematch: 3 stop rule(s)
07:50:52 livematch exit=0 in 8 s
07:50:52 start lock
07:50:52 watching lock: 4 stop rule(s)
07:51:54 progress lock: 119/1560 (8%) battles, 7084/h, ETA 12 min, 0 failed, skips 14.2/battle (last 100), aa +0.01, rkn +0.02, rlnrkn +0.05, rln +0.01
```
