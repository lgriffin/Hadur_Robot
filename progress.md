# Queue pc-sg-aim: progress

Updated 2026-10-29 22:20:05 PC time (22:20 UTC), runner pid 75856.

- `prep` done, exit 0 in 2 min
- `aim` done, exit 0 in 17 min
- `gate` done, exit 0 in 0 min
- `pr` done, exit 0 in 0 min

### aim

**1302 of 1302 battles** (100%), 0 failed. Running 17 min, 4586 battles/h, about 0 min left (ends ~22:19 PC time). Last battle 0 min ago.
Skipped turns a battle: 22.5 overall, first 100 26.9, last 100 20.7; engine disables 130.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 434 | 0 | 95.57 | - | - | - | 21.2 |
| aa | 434 | 0 | 95.61 | +0.02 (434 robots) | ±0.07 | -0.08 .. +0.12 | 22.3 |
| km | 434 | 0 | 95.96 | +0.13 (434 robots) | ±0.07 | +0.02 .. +0.24 | 24.1 |

APS = mean difference over the robots read x 434 panel robots / 1217 pairings.
A/A: aa - c +0.04 pts over 434 robots; 1% band ±0.56 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 1302 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 40 over 200` | halt | ok | 18.4 a battle over the last 200 (first 200: 30.9) |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `aa after 20%` | halt | ok | aa - c +0.04 pts over 434 robots, stop band ±0.65 |
| `futility km below 0.05 after 30%` | finish | ok | km +0.13, best case +0.24 APS vs bar +0.05 |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
22:01:21 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1488498; work D:\code\Hadur_Robot\hadur-bench\work
22:01:21 start prep
22:01:24 progress pushed to origin claude/pc-sg-aim-progress (every 15 min)
22:02:56 prep exit=0 in 94 s
22:02:56 start aim
22:02:56 watching aim: 6 stop rule(s)
22:03:22 progress aim: 11/1302 (1%) battles, 1512/h, ETA 51 min, 0 failed, skips 19.2/battle (last 100)
22:19:58 aim exit=0 in 1022 s
22:19:58 start gate
22:19:59 gate exit=0 in 0 s
22:19:59 start pr
22:20:05 pr exit=0 in 6 s
22:20:05 ALLDONE
```
