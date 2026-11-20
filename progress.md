# Queue pc-rc-confirm: progress

Updated 2026-11-20 00:27:40 PC time (00:27 UTC), runner pid 72544.

- `prep` done, exit 0 in 2 min
- `livematch` done, exit 0 in 0 min
- `field` halted, exit 75 in 25 min, HALTED by skips 60 over 200: 60.6 a battle over the last 200 (first 200: 46.1)
- `ret` pending
- `gate112` pending
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

> warning: arm c's jar bisect/live/hadur117.Hadur_3.22.jar was built 102 h before this step started: check it is not stale

> warning: arm bb's jar opponents/kc.mega.BeepBoop_2.0.jar was built 89 h before this step started: check it is not stale

### field

**308 of 7158 battles** (4%), 0 failed. Running 25 min, 725 battles/h, about 9.4 h left (ends ~09:54 PC time). Last battle 0 min ago.
Skipped turns a battle: 52.9 overall, first 100 40.2, last 100 69.2; engine disables 173.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| rel | 106 | 0 | 93.67 | +0.09 (95 robots) | ±0.71 | -0.99 .. +1.18 | 59.0 |
| c | 102 | 0 | 93.63 | - | - | - | 57.3 |
| aa | 100 | 0 | 93.52 | +0.05 (95 robots) | ±0.52 | -0.75 .. +0.85 | 41.9 |

APS = mean difference over the robots read x 1193 panel robots / 1217 pairings.
A/A: aa - c +0.05 pts over 95 robots; 1% band ±1.18 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 308 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | TRIPPED | 60.6 a battle over the last 200 (first 200: 46.1) |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `aa after 20%` | halt | waiting | checks from 20% of the battles (now 4%) |

Stopping now would leave 6850 battles unrun (about 9.4 h); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
23:19:08 skip gate (after gate112, which has not finished exit=0)
23:19:08 skip pr (after gate, which has not finished exit=0)
23:19:08 ALLDONE
00:00:21 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1544834; work D:\code\Hadur_Robot\hadur-bench\work
00:00:21 start prep
00:00:24 progress pushed to origin claude/pc-rc-confirm-progress (every 15 min)
00:02:02 prep exit=0 in 100 s
00:02:02 start livematch
00:02:02 watching livematch: 3 stop rule(s)
00:02:11 livematch exit=0 in 8 s
00:02:11 start field
00:02:11 watching field: 5 stop rule(s)
00:02:23 progress field: 0/7158 (0%) battles, 0 failed
00:27:39 STOP field by rule skips 60 over 200: 60.6 a battle over the last 200 (first 200: 46.1); 308 battles fought and kept, 6850 battles left unrun (about 9.4 h)
00:27:40 field exit=75 in 1529 s (halted, skips 60 over 200)
```
