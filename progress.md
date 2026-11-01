# Queue pc-shield-power: progress

Updated 2026-11-01 18:20:28 PC time (18:20 UTC), runner pid 3144.

- `prep` done, exit 0 in 2 min
- `screen` running
- `gate` pending
- `pr` pending

### screen

**3640 of 4496 battles** (81%), 0 failed, 1217 read back from an earlier run. Running 1.5 h, 1562 battles/h, about 33 min left (ends ~18:53 PC time). Last battle 0 min ago.
Skipped turns a battle: 36.4 overall, first 100 28.4, last 100 38.4; engine disables 832.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 909 | 0 | 94.74 | - | - | - | 31.6 |
| aa | 910 | 0 | 94.66 | -0.02 (280 robots) | ±0.10 | -0.16 .. +0.13 | 29.1 |
| sc | 912 | 0 | 95.22 | +0.12 (280 robots) | ±0.11 | -0.04 .. +0.28 | 30.7 |
| sr | 909 | 0 | 95.45 | +0.17 (280 robots) | ±0.08 | +0.05 .. +0.29 | 26.4 |

APS = mean difference over the robots read x 281 panel robots / 1217 pairings.
A/A: aa - c -0.08 pts over 280 robots; 1% band ±0.39 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 3640 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | ok | 37.6 a battle over the last 200 (first 200: 34.6) |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `aa after 20%` | halt | ok | aa - c -0.08 pts over 280 robots, stop band ±0.45 |

Stopping now would leave 856 battles unrun (about 33 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
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
17:20:50 progress screen: 2093/4496 (47%) battles, 1736/h, ETA 1.4 h, 0 failed, skips 40.1/battle (last 100), aa +0.05, sc +0.13, sr +0.20
17:51:08 progress screen: 2882/4496 (64%) battles, 1562/h, ETA 1.0 h, 0 failed, skips 34.0/battle (last 100), aa +0.01, sc +0.11, sr +0.16
```
