# Queue pc-k1-aim: progress

Updated 2026-10-29 18:11:10 PC time (18:11 UTC), runner pid 40284.

- `prep` done, exit 0 in 1 min
- `aim` running
- `gate` pending
- `rejoin` pending
- `pr` pending

### aim

**714 of 1296 battles** (55%), 0 failed. Running 29 min, 1482 battles/h, about 24 min left (ends ~18:34 PC time). Last battle 0 min ago.
Skipped turns a battle: 30.5 overall, first 100 31.3, last 100 33.7; engine disables 147.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 238 | 0 | 83.83 | - | - | - | 33.1 |
| aa | 237 | 0 | 84.31 | +0.09 (235 robots) | ±0.26 | -0.30 .. +0.49 | 29.6 |
| km | 239 | 0 | 84.03 | -0.06 (234 robots) | ±0.21 | -0.38 .. +0.27 | 28.8 |

APS = mean difference over the robots read x 432 panel robots / 1217 pairings.
A/A: aa - c +0.26 pts over 235 robots; 1% band ±0.76 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 714 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 40 over 200` | halt | ok | 29.3 a battle over the last 200 (first 200: 29.2) |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `aa after 20%` | halt | ok | aa - c +0.26 pts over 235 robots, stop band ±0.89 |
| `futility km below 0.05 after 30%` | finish | ok | km -0.06, best case +0.27 APS vs bar +0.05 |

Stopping now would leave 582 battles unrun (about 24 min); every battle already fought is kept and a rerun resumes from it.

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
