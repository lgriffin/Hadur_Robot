# Queue pc-locks: progress

Updated 2026-11-26 22:48:46 PC time (22:48 UTC), runner pid 15568.

- `prep` done, exit 0 in 8 min
- `livematch` running
- `lock` pending
- `stage` pending
- `lock-gl` pending
- `lock-cpl` pending
- `lock-rwl` pending
- `lock-dn` pending
- `lock-hof` pending
- `lock-qw` pending
- `lock-rlnrkn` pending
- `lock-rf` pending
- `lock-mtty` pending
- `gate` pending
- `skip` pending
- `skipread` pending
- `pr` pending

### livematch

**122 of 124 battles** (98%), 0 failed. Running 7 min, 1086 battles/h, about 0 min left (ends ~22:48 PC time). Last battle 0 min ago.
Skipped turns a battle: 5.6 overall, first 100 5.2, last 100 5.7; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 60 | 0 | 70.02 | - | - | - | 10.5 |
| bb | 62 | 0 | 84.38 | +0.37 (31 robots) | ±0.06 | +0.27 .. +0.46 | 0.9 |

APS = mean difference over the robots read x 31 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 122 |
| `dead 8` | halt | ok | every arm scoring |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 2 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

> warning: arm c's jar bisect/live/hadur117.Hadur_3.22.jar was built 269 h before this step started: check it is not stale

> warning: arm bb's jar opponents/kc.mega.BeepBoop_2.0.jar was built 256 h before this step started: check it is not stale

### Queue log (last lines)

```
18:23:01 start lock-rwl
18:23:01 watching lock-rwl: 3 stop rule(s)
18:31:55 lock-rwl exit=0 in 533 s
18:31:55 start gate
18:31:56 gate exit=0 in 1 s
18:31:56 start pr
18:32:05 pr exit=0 in 8 s
18:32:05 ALLDONE
22:33:40 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1544834; work D:\code\Hadur_Robot\hadur-bench\work
22:33:40 start prep
22:33:43 progress pushed to origin claude/pc-locks-progress (every 15 min)
22:42:02 prep exit=0 in 502 s
22:42:02 start livematch
22:42:02 watching livematch: 3 stop rule(s)
22:42:43 progress livematch: 19/124 (15%) battles, 1655/h, ETA 4 min, 0 failed, skips 4.9/battle (last 100), bb +0.19
```
