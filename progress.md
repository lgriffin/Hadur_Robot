# Queue pc-flat-on: progress

Updated 2026-11-01 15:08:44 PC time (15:08 UTC), runner pid 20688.

- `prep` done, exit 0 in 1 min
- `screen` running
- `pick` pending
- `prep2` pending
- `confirm` pending
- `gate` pending
- `pr` pending

### screen

**586 of 1392 battles** (42%), 0 failed. Running 14 min, 2534 battles/h, about 19 min left (ends ~15:27 PC time). Last battle 0 min ago.
Skipped turns a battle: 18.0 overall, first 100 17.1, last 100 19.9; engine disables 10.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 195 | 0 | 84.27 | - | - | - | 17.3 |
| aa | 196 | 0 | 84.09 | -0.05 (158 robots) | ±0.12 | -0.24 .. +0.14 | 16.1 |
| fo | 195 | 0 | 84.06 | -0.02 (156 robots) | ±0.11 | -0.19 .. +0.14 | 20.5 |

APS = mean difference over the robots read x 232 panel robots / 1217 pairings.
A/A: aa - c -0.27 pts over 158 robots; 1% band ±0.84 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 586 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 40 over 200` | halt | ok | 19.3 a battle over the last 200 (first 200: 17.0) |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `aa after 20%` | halt | ok | aa - c -0.27 pts over 158 robots, stop band ±0.98 |

Stopping now would leave 806 battles unrun (about 19 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
14:53:34 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1488498; work D:\code\Hadur_Robot\hadur-bench\work
14:53:34 start prep
14:53:36 progress pushed to origin claude/pc-flat-on-progress (every 15 min)
14:54:51 prep exit=0 in 77 s
14:54:51 start screen
14:54:51 watching screen: 5 stop rule(s)
14:55:34 progress screen: 30/1392 (2%) battles, 2492/h, ETA 33 min, 0 failed, skips 18.9/battle (last 100), aa -0.05, fo +0.01
```
