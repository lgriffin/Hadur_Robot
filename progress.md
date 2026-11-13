# Queue pc-shadow: progress

Updated 2026-11-13 21:52:21 PC time (21:52 UTC), runner pid 63172.

- `prep` done, exit 0 in 2 min
- `field` running
- `gate` pending
- `pr` pending

### field

**425 of 7158 battles** (6%), 0 failed, 206 read back from an earlier run. Running 15 min, 868 battles/h, about 7.8 h left (ends ~05:38 PC time). Last battle 0 min ago.
Skipped turns a battle: 61.8 overall, first 100 62.0, last 100 63.2; engine disables 134.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 141 | 0 | 93.49 | - | - | - | 57.3 |
| aa | 142 | 0 | 93.36 | -0.19 (136 robots) | ±0.61 | -1.13 .. +0.75 | 61.4 |
| kp | 142 | 0 | 93.70 | +0.30 (136 robots) | ±0.49 | -0.45 .. +1.05 | 65.0 |

APS = mean difference over the robots read x 1193 panel robots / 1217 pairings.
A/A: aa - c -0.20 pts over 136 robots; 1% band ±0.99 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 425 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 80 over 200` | halt | ok | 63.1 a battle over the last 200 (first 200: 61.2) |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `aa after 20%` | halt | waiting | checks from 20% of the battles (now 6%) |

Stopping now would leave 6733 battles unrun (about 7.8 h); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
20:57:54 progress pushed to origin claude/pc-shadow-progress (every 15 min)
20:59:37 prep exit=0 in 105 s
20:59:37 start field
20:59:37 watching field: 5 stop rule(s)
20:59:52 progress field: 0/7158 (0%) battles, 0 failed
21:14:02 STOP field by rule skips 60 over 200: 61.2 a battle over the last 200 (first 200: 60.3); 206 battles fought and kept, 6952 battles left unrun (about 8.1 h)
21:14:02 field exit=75 in 865 s (halted, skips 60 over 200)
21:14:04 alert issue: https://github.com/lgriffin/Hadur_Robot/issues/808
21:14:04 queue halted by a stop rule; fix the cause and rerun to resume (every fought battle is kept)
21:37:12 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant calibrated; work D:\code\Hadur_Robot\hadur-bench\work
21:37:12 skip prep (already exit=0)
21:37:12 start field
21:37:12 watching field: 5 stop rule(s)
21:37:14 progress pushed to origin claude/pc-shadow-progress (every 15 min)
21:38:12 progress field: 206/7158 (3%) battles, 0 failed, aa +0.45, kp +0.68
```
