# Queue pc-eveimear-06: progress

Updated 2026-11-19 21:03:58 PC time (21:03 UTC), runner pid 40328.

- `prep` done, exit 0 in 0 min
- `livematch` done, exit 0 in 8 min
- `bench` running
- `gate` pending
- `pr` pending

### livematch

**124 of 124 battles** (100%), 0 failed. Running 8 min, 898 battles/h, about 0 min left (ends ~20:57 PC time). Last battle 0 min ago.
Skipped turns a battle: 5.9 overall, first 100 5.3, last 100 6.1; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 62 | 0 | 70.29 | - | - | - | 10.2 |
| bb | 62 | 0 | 84.78 | +0.37 (31 robots) | ±0.07 | +0.27 .. +0.47 | 1.5 |

APS = mean difference over the robots read x 31 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 124 |
| `dead 8` | halt | ok | every arm scoring |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

> warning: arm c's jar bisect/live/hadur117.Hadur_3.22.jar was built 99 h before this step started: check it is not stale

> warning: arm bb's jar opponents/kc.mega.BeepBoop_2.0.jar was built 86 h before this step started: check it is not stale

### bench

**947 of 9252 battles** (10%), 0 failed. Running 6 min, 8972 battles/h, about 56 min left (ends ~21:59 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0; engine disables 0.

| arm | battles | failed | share | vs control (pts) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 316 | 0 | 85.52 | - | - | - | 0.0 |
| aa | 317 | 0 | 85.64 | +0.11 (248 robots) | ±0.20 | -0.19 .. +0.40 | 0.0 |
| n | 314 | 0 | 85.88 | +0.38 (246 robots) | ±0.49 | -0.36 .. +1.13 | 0.0 |
A/A: aa - c +0.11 pts over 248 robots; 1% band ±0.66 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 947 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | ok | 0.0 a battle over the last 200 (first 200: 0.0) |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `aa after 20%` | halt | waiting | checks from 20% of the battles (now 10%) |
| `futility n below -0.5 after 20%` | finish | waiting | checks from 20% of the battles (now 10%) |

Stopping now would leave 8305 battles unrun (about 56 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
20:48:49 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1544834; work D:\code\Hadur_Robot\hadur-bench\work
20:48:49 start prep
20:48:52 progress pushed to origin claude/pc-eveimear-06-progress (every 15 min)
20:49:20 prep exit=0 in 30 s
20:49:20 start livematch
20:49:20 watching livematch: 3 stop rule(s)
20:49:50 progress livematch: 11/124 (9%) battles, 1310/h, ETA 5 min, 0 failed, skips 6.3/battle (last 100), bb +0.22
20:57:37 livematch exit=0 in 497 s
20:57:37 start bench
20:57:37 watching bench: 6 stop rule(s)
```
