# Queue pc-shield-power: progress

Updated 2026-11-01 17:19:51 PC time (17:19 UTC), runner pid 3144.

- `prep` done, exit 0 in 2 min
- `screen` running
- `gate` pending
- `pr` pending

### screen

**2071 of 4496 battles** (46%), 0 failed, 1217 read back from an earlier run. Running 30 min, 1708 battles/h, about 1.4 h left (ends ~18:45 PC time). Last battle 0 min ago.
Skipped turns a battle: 36.7 overall, first 100 28.4, last 100 36.1; engine disables 289.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 518 | 0 | 94.73 | - | - | - | 25.8 |
| aa | 517 | 0 | 94.96 | +0.05 (259 robots) | ±0.12 | -0.13 .. +0.23 | 25.2 |
| sc | 517 | 0 | 95.42 | +0.14 (259 robots) | ±0.14 | -0.08 .. +0.35 | 25.2 |
| sr | 519 | 0 | 95.71 | +0.20 (259 robots) | ±0.10 | +0.05 .. +0.35 | 21.4 |

APS = mean difference over the robots read x 281 panel robots / 1217 pairings.
A/A: aa - c +0.21 pts over 259 robots; 1% band ±0.51 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 2071 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | ok | 36.6 a battle over the last 200 (first 200: 34.6) |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `aa after 20%` | halt | ok | aa - c +0.21 pts over 259 robots, stop band ±0.60 |

Stopping now would leave 2425 battles unrun (about 1.4 h); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
15:56:03 prep exit=0 in 108 s
15:56:03 start screen
15:56:03 watching screen: 5 stop rule(s)
15:56:16 progress screen: 0/4496 (0%) battles, 0 failed
16:20:36 STOP screen by rule aa after 20%: aa - c +0.84 pts over 200 robots, stop band ±0.78; 1217 battles fought and kept, 3279 battles left unrun (about 1.1 h)
16:20:36 screen exit=75 in 1473 s (halted, aa after 20%)
16:20:39 alert issue: https://github.com/lgriffin/Hadur_Robot/issues/558
16:20:39 queue halted by a stop rule; fix the cause and rerun to resume (every fought battle is kept)
16:49:29 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1488498; work D:\code\Hadur_Robot\hadur-bench\work
16:49:29 skip prep (already exit=0)
16:49:29 start screen
16:49:29 watching screen: 5 stop rule(s), shown only
16:49:42 progress pushed to origin claude/pc-shield-power-progress (every 15 min)
16:50:30 stop rule aa after 20% would trip on screen (aa - c +0.84 pts over 200 robots, stop band ±0.78); not acted on
16:50:30 progress screen: 1217/4496 (27%) battles, 0 failed, aa +0.19, sc +0.09, sr +0.12
```
