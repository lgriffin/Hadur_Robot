# Queue pc-rc-confirm: progress

Updated 2026-11-23 19:59:18 PC time (19:59 UTC), runner pid 33592.

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

**641 of 3636 battles** (18%), 0 failed. Running 28 min, 1355 battles/h, about 2.2 h left (ends ~22:11 PC time). Last battle 0 min ago.
Skipped turns a battle: 34.4 overall, first 100 33.0, last 100 32.4; engine disables 181.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| rel | 214 | 0 | 93.81 | -0.36 (208 robots) | ±0.37 | -0.92 .. +0.21 | 34.4 |
| c | 211 | 0 | 94.09 | - | - | - | 35.5 |
| aa | 216 | 0 | 94.03 | -0.07 (210 robots) | ±0.39 | -0.66 .. +0.52 | 33.5 |

APS = mean difference over the robots read x 1212 panel robots / 1217 pairings.
A/A: aa - c -0.07 pts over 210 robots; 1% band ±0.81 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 641 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 90 over 200` | halt | ok | 34.2 a battle over the last 200 (first 200: 34.7) |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `aa after 20%` | halt | waiting | checks from 20% of the battles (now 18%) |

Stopping now would leave 2995 battles unrun (about 2.2 h); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
03:09:30 start gate
03:09:30 gate exit=0 in 0 s
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
```
