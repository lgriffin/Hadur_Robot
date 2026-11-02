# Queue pc-mimic: progress

Updated 2026-11-02 09:29:51 PC time (09:29 UTC), runner pid 45996.

- `prep` done, exit 0 in 1 min
- `screen` halted, exit 75 in 13 min, HALTED by fails 30: 30 failed of 525
- `gate` pending
- `pr` pending

### screen

**526 of 2088 battles** (25%), 30 failed. Running 13 min, 2480 battles/h, about 38 min left (ends ~10:07 PC time). Last battle 0 min ago.
Skipped turns a battle: 34.1 overall, first 100 31.6, last 100 34.3; engine disables 8.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 173 | 10 | 84.72 | - | - | - | 35.0 |
| aa | 177 | 10 | 84.55 | +0.02 (123 robots) | ±0.12 | -0.17 .. +0.21 | 32.9 |
| mm | 176 | 10 | 84.24 | -0.09 (123 robots) | ±0.13 | -0.29 .. +0.11 | 34.3 |

APS = mean difference over the robots read x 232 panel robots / 1217 pairings.
A/A: aa - c +0.08 pts over 123 robots; 1% band ±0.91 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | TRIPPED | 30 failed of 526 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | ok | 34.7 a battle over the last 200 (first 200: 33.4) |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 1562 battles unrun (about 38 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
09:15:41 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1488498; work D:\code\Hadur_Robot\hadur-bench\work
09:15:41 start prep
09:15:43 progress pushed to origin claude/pc-mimic-progress (every 15 min)
09:17:07 prep exit=0 in 86 s
09:17:07 start screen
09:17:07 watching screen: 4 stop rule(s)
09:17:41 progress screen: 16/2088 (1%) battles, 1678/h, ETA 1.2 h, 2 failed, skips 33.6/battle (last 100), aa +0.50
09:29:50 STOP screen by rule fails 30: 30 failed of 525; 525 battles fought and kept, 1563 battles left unrun (about 38 min)
09:29:51 screen exit=75 in 763 s (halted, fails 30)
```
