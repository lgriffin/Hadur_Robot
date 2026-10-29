# Queue pc-k1-aim: progress

Updated 2026-10-29 18:45:28 PC time (18:45 UTC), runner pid 40284.

- `prep` done, exit 0 in 1 min
- `aim` done, exit 0 in 56 min
- `gate` done, exit 0 in 0 min
- `rejoin` running
- `pr` pending

### aim

**1296 of 1296 battles** (100%), 0 failed. Running 56 min, 1290 battles/h, about 0 min left (ends ~18:38 PC time). Last battle 0 min ago.
Skipped turns a battle: 28.6 overall, first 100 31.3, last 100 25.3; engine disables 241.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 432 | 0 | 84.89 | - | - | - | 30.2 |
| aa | 432 | 0 | 85.02 | +0.05 (432 robots) | ±0.19 | -0.24 .. +0.34 | 27.9 |
| km | 432 | 0 | 85.15 | +0.07 (432 robots) | ±0.15 | -0.17 .. +0.30 | 27.7 |

APS = mean difference over the robots read x 432 panel robots / 1217 pairings.
A/A: aa - c +0.13 pts over 432 robots; 1% band ±0.56 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 1296 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 40 over 200` | halt | ok | 26.4 a battle over the last 200 (first 200: 29.2) |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `aa after 20%` | halt | ok | aa - c +0.13 pts over 432 robots, stop band ±0.65 |
| `futility km below 0.05 after 30%` | finish | ok | km +0.07, best case +0.30 APS vs bar +0.05 |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
17:40:52 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1488498; work D:\code\Hadur_Robot\hadur-bench\work
17:40:52 start prep
17:40:55 progress pushed to origin claude/pc-k1-aim-progress (every 15 min)
17:42:15 prep exit=0 in 83 s
17:42:15 start aim
17:42:15 watching aim: 6 stop rule(s)
17:42:53 progress aim: 3/1296 (0%) battles, 290/h, ETA 4.5 h, 0 failed, skips 20.3/battle (last 100)
18:13:12 progress aim: 774/1296 (60%) battles, 1524/h, ETA 21 min, 0 failed, skips 33.5/battle (last 100), aa +0.12, km -0.01
18:38:40 aim exit=0 in 3384 s
18:38:40 start gate
18:38:41 gate exit=0 in 0 s
18:38:41 start rejoin
```
