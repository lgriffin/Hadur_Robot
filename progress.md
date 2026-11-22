# Queue pc-locks: progress

Updated 2026-11-22 07:59:44 PC time (07:59 UTC), runner pid 85196.

- `prep` done, exit 0 in 2 min
- `livematch` failed, exit 3 in 8 min
- `lock` skipped
- `gate` skipped
- `pr` skipped

### livematch

**124 of 124 battles** (100%), 0 failed. Running 8 min, 942 battles/h, about 0 min left (ends ~07:59 PC time). Last battle 0 min ago.
Skipped turns a battle: 5.7 overall, first 100 5.1, last 100 5.8; engine disables 0.

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

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

> warning: arm c's jar bisect/live/hadur117.Hadur_3.22.jar was built 158 h before this step started: check it is not stale

> warning: arm bb's jar opponents/kc.mega.BeepBoop_2.0.jar was built 145 h before this step started: check it is not stale

### Queue log (last lines)

```
16:11:43 pr exit=0 in 6 s
16:11:43 ALLDONE
07:49:39 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1544834; work D:\code\Hadur_Robot\hadur-bench\work
07:49:39 start prep
07:49:42 progress pushed to origin claude/pc-locks-progress (every 15 min)
07:51:48 prep exit=0 in 129 s
07:51:48 start livematch
07:51:48 watching livematch: 3 stop rule(s)
07:52:41 progress livematch: 26/124 (21%) battles, 1788/h, ETA 3 min, 0 failed, skips 5.5/battle (last 100), bb +0.27
07:59:42 livematch exit=3 in 473 s
07:59:44 alert issue: https://github.com/lgriffin/Hadur_Robot/issues/989
07:59:44 skip lock (after livematch, which has not finished exit=0)
07:59:44 skip gate (after lock, which has not finished exit=0)
07:59:44 skip pr (after gate, which has not finished exit=0)
07:59:44 ALLDONE
```
