# Queue pc-power-cap: progress

Updated 2026-11-12 11:55:29 PC time (11:55 UTC), runner pid 53860.

- `prep` done, exit 0 in 2 min
- `confirm` done, exit 0 in 37 min
- `gate` done, exit 0 in 0 min
- `pr` done, exit 0 in 0 min

### confirm

**252 of 252 battles** (100%), 0 failed. Running 37 min, 396 battles/h, about 0 min left (ends ~11:55 PC time). Last battle 0 min ago.
Skipped turns a battle: 13.1 overall, first 100 8.8, last 100 19.6; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 84 | 0 | 64.14 | - | - | - | 12.7 |
| aa | 84 | 0 | 63.77 | -0.00 (7 robots) | ±0.01 | -0.01 .. +0.01 | 11.5 |
| pk | 84 | 0 | 70.82 | +0.04 (7 robots) | ±0.01 | +0.02 .. +0.06 | 15.1 |

APS = mean difference over the robots read x 7 panel robots / 1217 pairings.
A/A: aa - c -0.38 pts over 7 robots; 1% band ±1.27 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 252 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | ok | 14.2 a battle over the last 200 (first 200: 8.9) |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
11:16:57 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant calibrated; work D:\code\Hadur_Robot\hadur-bench\work
11:16:57 start prep
11:16:59 progress pushed to origin claude/pc-power-cap-progress (every 15 min)
11:18:35 prep exit=0 in 98 s
11:18:35 start confirm
11:18:35 watching confirm: 4 stop rule(s)
11:18:58 progress confirm: 1/252 (0%) battles, 155/h, ETA 1.6 h, 0 failed, skips 12.0/battle (last 100)
11:49:11 progress confirm: 210/252 (83%) battles, 412/h, ETA 6 min, 0 failed, skips 9.0/battle (last 100), aa -0.00, pk +0.04
11:55:22 confirm exit=0 in 2206 s
11:55:22 start gate
11:55:22 gate exit=0 in 0 s
11:55:22 start pr
11:55:29 pr exit=0 in 6 s
11:55:29 ALLDONE
```
