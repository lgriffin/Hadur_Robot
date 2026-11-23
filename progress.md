# Queue pc-rc-confirm: progress

Updated 2026-11-23 20:44:44 PC time (20:44 UTC), runner pid 33592.

- `prep` done, exit 0 in 2 min
- `livematch` done, exit 0 in 0 min
- `field` running
- `ret` pending
- `gate112` pending
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

> warning: arm c's jar bisect/live/hadur117.Hadur_3.22.jar was built 194 h before this step started: check it is not stale

> warning: arm bb's jar opponents/kc.mega.BeepBoop_2.0.jar was built 181 h before this step started: check it is not stale

### field

**1607 of 3636 battles** (44%), 0 failed. Running 1.2 h, 1238 battles/h, about 1.6 h left (ends ~22:23 PC time). Last battle 0 min ago.
Skipped turns a battle: 33.8 overall, first 100 33.0, last 100 35.9; engine disables 420.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| rel | 538 | 0 | 93.73 | -0.32 (531 robots) | ±0.25 | -0.71 .. +0.07 | 34.5 |
| c | 534 | 0 | 94.20 | - | - | - | 34.3 |
| aa | 535 | 0 | 93.95 | -0.29 (531 robots) | ±0.25 | -0.67 .. +0.09 | 32.6 |

APS = mean difference over the robots read x 1212 panel robots / 1217 pairings.
A/A: aa - c -0.29 pts over 531 robots; 1% band ±0.51 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 1607 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 90 over 200` | halt | ok | 35.7 a battle over the last 200 (first 200: 34.7) |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `aa after 20%` | halt | ok | aa - c -0.29 pts over 531 robots, stop band ±0.59 |

Stopping now would leave 2029 battles unrun (about 1.6 h); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
03:09:30 start pr
03:09:38 pr exit=0 in 7 s
03:09:38 ALLDONE
19:28:59 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1544834; work D:\code\Hadur_Robot\hadur-bench\work
19:28:59 start prep
19:29:03 progress pushed to origin claude/pc-rc-confirm-progress (every 15 min)
19:30:46 prep exit=0 in 106 s
19:30:46 start livematch
19:30:46 watching livematch: 3 stop rule(s)
19:30:54 livematch exit=0 in 7 s
19:30:54 start field
19:30:54 watching field: 5 stop rule(s)
19:31:00 progress field: 0/3636 (0%) battles, 0 failed
20:01:18 progress field: 685/3636 (19%) battles, 1370/h, ETA 2.2 h, 0 failed, skips 32.4/battle (last 100), rel -0.47, aa -0.08
20:31:44 progress field: 1366/3636 (38%) battles, 1356/h, ETA 1.7 h, 0 failed, skips 33.4/battle (last 100), rel -0.42, aa -0.29
```
