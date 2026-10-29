# Queue pc-k1-aim: progress

Updated 2026-10-29 17:56:01 PC time (17:56 UTC), runner pid 40284.

- `prep` done, exit 0 in 1 min
- `aim` running
- `gate` pending
- `rejoin` pending
- `pr` pending

### aim

**328 of 1296 battles** (25%), 0 failed. Running 14 min, 1431 battles/h, about 41 min left (ends ~18:36 PC time). Last battle 0 min ago.
Skipped turns a battle: 30.3 overall, first 100 31.3, last 100 33.8; engine disables 66.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 109 | 0 | 81.39 | - | - | - | 35.6 |
| aa | 110 | 0 | 81.64 | +0.22 (105 robots) | ±0.41 | -0.40 .. +0.84 | 32.1 |
| km | 109 | 0 | 81.27 | +0.12 (105 robots) | ±0.27 | -0.29 .. +0.53 | 23.3 |

APS = mean difference over the robots read x 432 panel robots / 1217 pairings.
A/A: aa - c +0.62 pts over 105 robots; 1% band ±1.14 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 328 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 40 over 200` | halt | ok | 29.1 a battle over the last 200 (first 200: 29.2) |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `aa after 20%` | halt | ok | aa - c +0.62 pts over 105 robots, stop band ±1.32 |
| `futility km below 0.05 after 30%` | finish | waiting | checks from 30% of the battles (now 25%) |

Stopping now would leave 968 battles unrun (about 41 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
17:40:52 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1488498; work D:\code\Hadur_Robot\hadur-bench\work
17:40:52 start prep
17:40:55 progress pushed to origin claude/pc-k1-aim-progress (every 15 min)
17:42:15 prep exit=0 in 83 s
17:42:15 start aim
17:42:15 watching aim: 6 stop rule(s)
17:42:53 progress aim: 3/1296 (0%) battles, 290/h, ETA 4.5 h, 0 failed, skips 20.3/battle (last 100)
```
