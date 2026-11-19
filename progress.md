# Queue pc-intercept: progress

Updated 2026-11-19 13:18:35 PC time (13:18 UTC), runner pid 49364.

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

**329 of 558 battles** (59%), 0 failed. Running 13 min, 1567 battles/h, about 9 min left (ends ~13:27 PC time). Last battle 0 min ago.
Skipped turns a battle: 12.5 overall, first 100 12.8, last 100 10.5; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 110 | 0 | 73.65 | - | - | - | 12.4 |
| aa | 112 | 0 | 73.26 | -0.01 (31 robots) | ±0.04 | -0.07 .. +0.05 | 12.6 |
| ic | 107 | 0 | 74.59 | +0.02 (30 robots) | ±0.02 | -0.01 .. +0.06 | 12.5 |

APS = mean difference over the robots read x 31 panel robots / 1217 pairings.
A/A: aa - c -0.39 pts over 31 robots; 1% band ±1.11 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 329 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | ok | 12.2 a battle over the last 200 (first 200: 13.5) |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 229 battles unrun (about 9 min); every battle already fought is kept and a rerun resumes from it.

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
