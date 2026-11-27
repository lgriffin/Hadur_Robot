# Queue pc-locks: progress

Updated 2026-11-27 09:08:15 PC time (09:08 UTC), runner pid 107880.

- `prep` done, exit 0 in 6 min
- `livematch` done, exit 0 in 8 min
- `lock` running
- `stage` pending
- `lock-pb` pending
- `lock-x0` pending
- `lock-gl` pending
- `lock-fq` pending
- `lock-fgl` pending
- `lock-dn` pending
- `lock-vj` pending
- `lock-cpl` pending
- `gate` pending
- `pr` pending

### livematch

**124 of 124 battles** (100%), 0 failed. Running 8 min, 927 battles/h, about 0 min left (ends ~08:52 PC time). Last battle 0 min ago.
Skipped turns a battle: 5.0 overall, first 100 4.8, last 100 5.0; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 62 | 0 | 70.00 | - | - | - | 9.5 |
| bb | 62 | 0 | 84.53 | +0.37 (31 robots) | ±0.08 | +0.25 .. +0.49 | 0.6 |

APS = mean difference over the robots read x 31 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 124 |
| `dead 8` | halt | ok | every arm scoring |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

> warning: arm c's jar bisect/live/hadur117.Hadur_3.22.jar was built 279 h before this step started: check it is not stale

> warning: arm bb's jar opponents/kc.mega.BeepBoop_2.0.jar was built 266 h before this step started: check it is not stale

### lock

**210 of 624 battles** (34%), 0 failed. Running 16 min, 788 battles/h, about 32 min left (ends ~09:39 PC time). Last battle 0 min ago.
Skipped turns a battle: 10.3 overall, first 100 11.3, last 100 9.5; engine disables 1.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 108 | 0 | 64.91 | - | - | - | 11.2 |
| aa | 102 | 0 | 65.18 | +0.00 (13 robots) | ±0.01 | -0.02 .. +0.02 | 9.4 |

APS = mean difference over the robots read x 13 panel robots / 1217 pairings.
A/A: aa - c +0.27 pts over 13 robots; 1% band ±1.14 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 210 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 24` | halt | ok | 9.5 a battle over the last 24 (first 24: 16.8) |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 414 battles unrun (about 32 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
23:38:45 start skipread
23:38:46 skipread exit=0 in 1 s
23:38:46 start pr
23:38:53 pr exit=0 in 7 s
23:38:53 ALLDONE
08:38:01 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1544834; work D:\code\Hadur_Robot\hadur-bench\work
08:38:01 start prep
08:38:03 progress pushed to origin claude/pc-locks-progress (every 15 min)
08:44:15 prep exit=0 in 373 s
08:44:15 start livematch
08:44:15 watching livematch: 3 stop rule(s)
08:45:04 progress livematch: 25/124 (20%) battles, 1824/h, ETA 3 min, 0 failed, skips 4.9/battle (last 100), bb +0.24
08:52:16 livematch exit=0 in 481 s
08:52:16 start lock
08:52:16 watching lock: 4 stop rule(s)
```
