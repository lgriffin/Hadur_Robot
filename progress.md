# Queue pc-tailor-near: progress

Updated 2026-11-08 11:32:55 PC time (11:32 UTC), runner pid 19552.

- `prep` done, exit 0 in 2 min
- `pilot` done, exit 0 in 17 min
- `screen` running
- `pick` pending
- `prep2` pending
- `confirm` pending
- `gate` pending
- `pr` pending

### pilot

**792 of 792 battles** (100%), 0 failed. Running 17 min, 2814 battles/h, about 0 min left (ends ~10:35 PC time). Last battle 0 min ago.
Skipped turns a battle: 28.5 overall, first 100 32.2, last 100 27.8; engine disables 1.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 396 | 0 | 89.86 | - | - | - | 28.2 |
| ln | 396 | 0 | 90.27 | +0.03 (99 robots) | ±0.05 | -0.04 .. +0.10 | 28.7 |

APS = mean difference over the robots read x 99 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 792 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 90 over 200` | halt | ok | 27.8 a battle over the last 200 (first 200: 30.7) |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### screen

**2373 of 3928 battles** (60%), 0 failed, 792 read back from an earlier run. Running 57 min, 1612 battles/h, about 58 min left (ends ~12:30 PC time). Last battle 0 min ago.
Skipped turns a battle: 52.4 overall, first 100 49.3, last 100 54.7; engine disables 623.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 1186 | 0 | 90.66 | - | - | - | 44.7 |
| ln | 1187 | 0 | 90.91 | +0.10 (468 robots) | ±0.11 | -0.07 .. +0.27 | 44.1 |

APS = mean difference over the robots read x 491 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 2373 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 90 over 200` | halt | ok | 53.5 a battle over the last 200 (first 200: 49.6) |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 1555 battles unrun (about 58 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
10:17:03 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant calibrated; work D:\code\Hadur_Robot\hadur-bench\work
10:17:03 start prep
10:17:05 progress pushed to origin claude/pc-tailor-near-progress (every 15 min)
10:18:46 prep exit=0 in 103 s
10:18:46 start pilot
10:18:46 watching pilot: 4 stop rule(s)
10:19:04 progress pilot: 11/792 (1%) battles, 2306/h, ETA 20 min, 0 failed, skips 45.0/battle (last 100)
10:35:40 pilot exit=0 in 1013 s
10:35:40 start screen
10:35:40 watching screen: 4 stop rule(s)
10:49:23 progress screen: 1191/3928 (30%) battles, 1745/h, ETA 1.6 h, 0 failed, skips 50.2/battle (last 100), ln -0.05
11:19:43 progress screen: 2015/3928 (51%) battles, 1632/h, ETA 1.2 h, 0 failed, skips 55.2/battle (last 100), ln +0.06
```
