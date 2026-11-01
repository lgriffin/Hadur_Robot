# Queue pc-shield-power: progress

Updated 2026-11-01 16:20:39 PC time (16:20 UTC), runner pid 69948.

- `prep` done, exit 0 in 2 min
- `screen` halted, exit 75 in 25 min, HALTED by aa after 20%: aa - c +0.84 pts over 200 robots, stop band ±0.78
- `gate` pending
- `pr` pending

### screen

**1217 of 4496 battles** (27%), 0 failed. Running 25 min, 2973 battles/h, about 1.1 h left (ends ~17:26 PC time). Last battle 0 min ago.
Skipped turns a battle: 15.8 overall, first 100 17.9, last 100 16.3; engine disables 44.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 304 | 0 | 94.86 | - | - | - | 16.1 |
| aa | 304 | 0 | 95.69 | +0.19 (200 robots) | ±0.16 | -0.05 .. +0.44 | 16.4 |
| sc | 306 | 0 | 95.67 | +0.09 (199 robots) | ±0.15 | -0.14 .. +0.33 | 16.3 |
| sr | 303 | 0 | 95.75 | +0.12 (198 robots) | ±0.10 | -0.04 .. +0.28 | 14.2 |

APS = mean difference over the robots read x 281 panel robots / 1217 pairings.
A/A: aa - c +0.84 pts over 200 robots; 1% band ±0.67 (OUTSIDE: comparisons void).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 1217 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | ok | 16.4 a battle over the last 200 (first 200: 17.2) |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `aa after 20%` | halt | TRIPPED | aa - c +0.84 pts over 200 robots, stop band ±0.78 |

Stopping now would leave 3279 battles unrun (about 1.1 h); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
15:54:14 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1488498; work D:\code\Hadur_Robot\hadur-bench\work
15:54:14 start prep
15:54:17 progress pushed to origin claude/pc-shield-power-progress (every 15 min)
15:56:03 prep exit=0 in 108 s
15:56:03 start screen
15:56:03 watching screen: 5 stop rule(s)
15:56:16 progress screen: 0/4496 (0%) battles, 0 failed
16:20:36 STOP screen by rule aa after 20%: aa - c +0.84 pts over 200 robots, stop band ±0.78; 1217 battles fought and kept, 3279 battles left unrun (about 1.1 h)
16:20:36 screen exit=75 in 1473 s (halted, aa after 20%)
16:20:39 alert issue: https://github.com/lgriffin/Hadur_Robot/issues/558
16:20:39 queue halted by a stop rule; fix the cause and rerun to resume (every fought battle is kept)
```
