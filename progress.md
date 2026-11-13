# Queue pc-shadow: progress

Updated 2026-11-13 23:08:04 PC time (23:08 UTC), runner pid 63172.

- `prep` done, exit 0 in 2 min
- `field` running
- `gate` pending
- `pr` pending

### field

**1392 of 7158 battles** (19%), 0 failed, 206 read back from an earlier run. Running 1.5 h, 686 battles/h, about 8.4 h left (ends ~07:32 PC time). Last battle 0 min ago.
Skipped turns a battle: 64.3 overall, first 100 62.0, last 100 59.5; engine disables 747.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 462 | 0 | 93.03 | - | - | - | 65.7 |
| aa | 464 | 0 | 93.17 | +0.11 (426 robots) | ±0.33 | -0.40 .. +0.62 | 60.6 |
| kp | 466 | 0 | 93.21 | +0.08 (425 robots) | ±0.29 | -0.37 .. +0.53 | 64.8 |

APS = mean difference over the robots read x 1193 panel robots / 1217 pairings.
A/A: aa - c +0.11 pts over 426 robots; 1% band ±0.54 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 1392 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 80 over 200` | halt | ok | 58.2 a battle over the last 200 (first 200: 61.2) |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `aa after 20%` | halt | waiting | checks from 20% of the battles (now 19%) |

Stopping now would leave 5766 battles unrun (about 8.4 h); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
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
22:08:32 progress field: 663/7158 (9%) battles, 886/h, ETA 7.3 h, 0 failed, skips 63.5/battle (last 100), aa -0.07, kp +0.28
22:38:49 progress field: 1061/7158 (15%) battles, 796/h, ETA 7.7 h, 0 failed, skips 66.2/battle (last 100), aa -0.06, kp +0.06
```
