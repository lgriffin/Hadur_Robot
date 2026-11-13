# Queue pc-shadow: progress

Updated 2026-11-13 22:22:38 PC time (22:22 UTC), runner pid 63172.

- `prep` done, exit 0 in 2 min
- `field` running
- `gate` pending
- `pr` pending

### field

**854 of 7158 battles** (12%), 0 failed, 206 read back from an earlier run. Running 45 min, 842 battles/h, about 7.5 h left (ends ~05:51 PC time). Last battle 0 min ago.
Skipped turns a battle: 64.8 overall, first 100 62.0, last 100 68.8; engine disables 424.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 286 | 0 | 93.31 | - | - | - | 62.8 |
| aa | 284 | 0 | 93.21 | -0.01 (269 robots) | ±0.42 | -0.65 .. +0.62 | 61.6 |
| kp | 284 | 0 | 93.51 | +0.24 (267 robots) | ±0.34 | -0.29 .. +0.76 | 67.0 |

APS = mean difference over the robots read x 1193 panel robots / 1217 pairings.
A/A: aa - c -0.01 pts over 269 robots; 1% band ±0.69 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 854 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 80 over 200` | halt | ok | 70.9 a battle over the last 200 (first 200: 61.2) |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `aa after 20%` | halt | waiting | checks from 20% of the battles (now 12%) |

Stopping now would leave 6304 battles unrun (about 7.5 h); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
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
22:08:32 progress field: 663/7158 (9%) battles, 886/h, ETA 7.3 h, 0 failed, skips 63.5/battle (last 100), aa -0.07, kp +0.28
```
