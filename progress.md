# Queue pc-intercept: progress

Updated 2026-11-19 13:33:43 PC time (13:33 UTC), runner pid 49364.

- `prep` done, exit 0 in 2 min
- `livematch` done, exit 0 in 0 min
- `pilot` running
- `pilotstop` pending
- `fielde` pending
- `midfield` pending
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

> warning: arm c's jar bisect/live/hadur117.Hadur_3.22.jar was built 91 h before this step started: check it is not stale

> warning: arm bb's jar opponents/kc.mega.BeepBoop_2.0.jar was built 78 h before this step started: check it is not stale

### pilot

**553 of 558 battles** (99%), 0 failed. Running 28 min, 1197 battles/h, about 0 min left (ends ~13:33 PC time). Last battle 1 min ago.
Skipped turns a battle: 9.6 overall, first 100 12.8, last 100 4.0; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 184 | 0 | 73.72 | - | - | - | 9.6 |
| aa | 183 | 0 | 73.61 | -0.00 (31 robots) | ±0.03 | -0.05 .. +0.04 | 9.8 |
| ic | 186 | 0 | 74.47 | +0.02 (31 robots) | ±0.02 | -0.01 .. +0.05 | 9.6 |

APS = mean difference over the robots read x 31 panel robots / 1217 pairings.
A/A: aa - c -0.11 pts over 31 robots; 1% band ±0.86 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 553 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | ok | 4.6 a battle over the last 200 (first 200: 13.5) |
| `stall 30m` | halt | ok | last battle 1 min ago |

Stopping now would leave 5 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
13:03:25 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1544834; work D:\code\Hadur_Robot\hadur-bench\work
13:03:25 start prep
13:03:27 progress pushed to origin claude/pc-intercept-progress (every 15 min)
13:05:51 prep exit=0 in 146 s
13:05:51 start livematch
13:05:51 watching livematch: 3 stop rule(s)
13:05:59 livematch exit=0 in 7 s
13:05:59 start pilot
13:05:59 watching pilot: 4 stop rule(s)
13:06:26 progress pilot: 11/558 (2%) battles, 1452/h, ETA 23 min, 0 failed, skips 14.4/battle (last 100), aa +0.10, ic -0.03
```
