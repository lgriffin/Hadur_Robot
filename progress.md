# Queue pc-locks: progress

Updated 2026-11-26 02:01:02 PC time (02:01 UTC), runner pid 86988.

- `prep` done, exit 0 in 4 min
- `livematch` done, exit 0 in 8 min
- `lock` running
- `stage` pending
- `lock-gl` pending
- `lock-rwl` pending
- `lock-rlnrkn` pending
- `lock-rln` pending
- `gate` pending
- `pr` pending

### livematch

**124 of 124 battles** (100%), 0 failed. Running 8 min, 950 battles/h, about 0 min left (ends ~01:57 PC time). Last battle 0 min ago.
Skipped turns a battle: 5.8 overall, first 100 5.1, last 100 6.0; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 62 | 0 | 69.48 | - | - | - | 10.2 |
| bb | 62 | 0 | 84.33 | +0.38 (31 robots) | ±0.07 | +0.27 .. +0.49 | 1.3 |

APS = mean difference over the robots read x 31 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 124 |
| `dead 8` | halt | ok | every arm scoring |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

> warning: arm c's jar bisect/live/hadur117.Hadur_3.22.jar was built 248 h before this step started: check it is not stale

> warning: arm bb's jar opponents/kc.mega.BeepBoop_2.0.jar was built 235 h before this step started: check it is not stale

### lock

**302 of 624 battles** (48%), 0 failed. Running 4 min, 4828 battles/h, about 4 min left (ends ~02:05 PC time). Last battle 0 min ago.
Skipped turns a battle: 12.8 overall, first 100 14.5, last 100 12.4; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 149 | 0 | 91.06 | - | - | - | 12.8 |
| aa | 153 | 0 | 91.20 | +0.00 (13 robots) | ±0.00 | -0.00 .. +0.01 | 12.7 |

APS = mean difference over the robots read x 13 panel robots / 1217 pairings.
A/A: aa - c +0.14 pts over 13 robots; 1% band ±0.95 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 302 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 24` | halt | ok | 13.3 a battle over the last 24 (first 24: 17.3) |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 322 battles unrun (about 4 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
21:32:35 start gate
21:32:36 gate exit=0 in 1 s
21:32:36 start pr
21:32:43 pr exit=0 in 7 s
21:32:43 ALLDONE
01:45:53 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1544834; work D:\code\Hadur_Robot\hadur-bench\work
01:45:53 start prep
01:45:55 progress pushed to origin claude/pc-locks-progress (every 15 min)
01:49:26 prep exit=0 in 213 s
01:49:26 start livematch
01:49:26 watching livematch: 3 stop rule(s)
01:49:54 progress livematch: 11/124 (9%) battles, 1405/h, ETA 5 min, 0 failed, skips 5.3/battle (last 100), bb +0.19
01:57:16 livematch exit=0 in 470 s
01:57:16 start lock
01:57:16 watching lock: 4 stop rule(s)
```
