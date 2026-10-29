# Queue pc-k1-aim: progress

Updated 2026-10-29 18:26:25 PC time (18:26 UTC), runner pid 40284.

- `prep` done, exit 0 in 1 min
- `aim` running
- `gate` pending
- `rejoin` pending
- `pr` pending

### aim

**1067 of 1296 battles** (82%), 0 failed. Running 44 min, 1462 battles/h, about 9 min left (ends ~18:35 PC time). Last battle 0 min ago.
Skipped turns a battle: 29.1 overall, first 100 31.3, last 100 26.3; engine disables 204.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 357 | 0 | 84.53 | - | - | - | 30.5 |
| aa | 354 | 0 | 84.72 | +0.09 (354 robots) | ±0.21 | -0.23 .. +0.40 | 28.4 |
| km | 356 | 0 | 84.75 | +0.04 (354 robots) | ±0.18 | -0.23 .. +0.31 | 28.3 |

APS = mean difference over the robots read x 432 panel robots / 1217 pairings.
A/A: aa - c +0.24 pts over 354 robots; 1% band ±0.62 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 1067 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 40 over 200` | halt | ok | 26.1 a battle over the last 200 (first 200: 29.2) |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `aa after 20%` | halt | ok | aa - c +0.24 pts over 354 robots, stop band ±0.72 |
| `futility km below 0.05 after 30%` | finish | ok | km +0.04, best case +0.31 APS vs bar +0.05 |

Stopping now would leave 229 battles unrun (about 9 min); every battle already fought is kept and a rerun resumes from it.

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
```
