# Queue pc-mimic: progress

Updated 2026-11-02 16:33:20 PC time (16:33 UTC), runner pid 8864.

- `prep` done, exit 0 in 1 min
- `screen` running
- `gate` pending
- `pr` pending

### screen

**1656 of 1989 battles** (83%), 0 failed, 526 read back from an earlier run. Running 30 min, 2260 battles/h, about 9 min left (ends ~16:42 PC time). Last battle 0 min ago.
Skipped turns a battle: 34.7 overall, first 100 41.3, last 100 34.4; engine disables 13.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 551 | 10 | 84.49 | - | - | - | 34.5 |
| aa | 555 | 10 | 84.32 | -0.03 (218 robots) | ±0.07 | -0.13 .. +0.07 | 33.9 |
| mm | 550 | 10 | 84.29 | -0.03 (218 robots) | ±0.07 | -0.14 .. +0.08 | 35.1 |

APS = mean difference over the robots read x 221 panel robots / 1217 pairings.
A/A: aa - c -0.18 pts over 218 robots; 1% band ±0.50 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 1656 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | ok | 33.9 a battle over the last 200 (first 200: 38.2) |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 333 battles unrun (about 9 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
09:15:43 progress pushed to origin claude/pc-mimic-progress (every 15 min)
09:17:07 prep exit=0 in 86 s
09:17:07 start screen
09:17:07 watching screen: 4 stop rule(s)
09:17:41 progress screen: 16/2088 (1%) battles, 1678/h, ETA 1.2 h, 2 failed, skips 33.6/battle (last 100), aa +0.50
09:29:50 STOP screen by rule fails 30: 30 failed of 525; 525 battles fought and kept, 1563 battles left unrun (about 38 min)
09:29:51 screen exit=75 in 763 s (halted, fails 30)
09:29:52 alert issue: https://github.com/lgriffin/Hadur_Robot/issues/570
09:29:52 queue halted by a stop rule; fix the cause and rerun to resume (every fought battle is kept)
16:02:59 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant calibrated; work D:\code\Hadur_Robot\hadur-bench\work
16:02:59 skip prep (already exit=0)
16:02:59 start screen
16:02:59 watching screen: 4 stop rule(s)
16:03:01 progress pushed to origin claude/pc-mimic-progress (every 15 min)
16:04:02 progress screen: 559/1989 (28%) battles, 1961/h, ETA 44 min, 0 failed, skips 38.2/battle (last 100), aa +0.03, mm -0.09
```
