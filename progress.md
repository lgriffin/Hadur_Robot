# Queue pc-shadow: progress

Updated 2026-11-13 21:14:04 PC time (21:14 UTC), runner pid 63312.

- `prep` done, exit 0 in 2 min
- `field` halted, exit 75 in 14 min, HALTED by skips 60 over 200: 61.2 a battle over the last 200 (first 200: 60.3)
- `gate` pending
- `pr` pending

### field

**206 of 7158 battles** (3%), 0 failed. Running 14 min, 857 battles/h, about 8.1 h left (ends ~05:20 PC time). Last battle 0 min ago.
Skipped turns a battle: 60.6 overall, first 100 62.2, last 100 59.1; engine disables 120.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 67 | 0 | 93.97 | - | - | - | 55.7 |
| aa | 71 | 0 | 94.50 | +0.45 (64 robots) | ±0.70 | -0.62 .. +1.52 | 59.7 |
| kp | 68 | 0 | 94.62 | +0.68 (64 robots) | ±0.57 | -0.19 .. +1.55 | 66.4 |

APS = mean difference over the robots read x 1193 panel robots / 1217 pairings.
A/A: aa - c +0.46 pts over 64 robots; 1% band ±1.46 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 206 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | TRIPPED | 61.2 a battle over the last 200 (first 200: 60.3) |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `aa after 20%` | halt | waiting | checks from 20% of the battles (now 3%) |

Stopping now would leave 6952 battles unrun (about 8.1 h); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
20:57:51 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant calibrated; work D:\code\Hadur_Robot\hadur-bench\work
20:57:51 start prep
20:57:54 progress pushed to origin claude/pc-shadow-progress (every 15 min)
20:59:37 prep exit=0 in 105 s
20:59:37 start field
20:59:37 watching field: 5 stop rule(s)
20:59:52 progress field: 0/7158 (0%) battles, 0 failed
21:14:02 STOP field by rule skips 60 over 200: 61.2 a battle over the last 200 (first 200: 60.3); 206 battles fought and kept, 6952 battles left unrun (about 8.1 h)
21:14:02 field exit=75 in 865 s (halted, skips 60 over 200)
21:14:04 alert issue: https://github.com/lgriffin/Hadur_Robot/issues/808
21:14:04 queue halted by a stop rule; fix the cause and rerun to resume (every fought battle is kept)
```
