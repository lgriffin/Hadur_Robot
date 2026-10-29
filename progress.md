# Queue pc-sg-aim: progress

Updated 2026-10-29 22:16:28 PC time (22:16 UTC), runner pid 75856.

- `prep` done, exit 0 in 2 min
- `aim` running
- `gate` pending
- `pr` pending

### aim

**1073 of 1302 battles** (82%), 0 failed. Running 14 min, 4760 battles/h, about 3 min left (ends ~22:19 PC time). Last battle 0 min ago.
Skipped turns a battle: 23.3 overall, first 100 26.9, last 100 16.4; engine disables 116.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 357 | 0 | 95.76 | - | - | - | 21.7 |
| aa | 357 | 0 | 95.84 | +0.00 (354 robots) | ±0.07 | -0.10 .. +0.11 | 23.2 |
| km | 359 | 0 | 96.18 | +0.15 (353 robots) | ±0.07 | +0.04 .. +0.25 | 24.9 |

APS = mean difference over the robots read x 434 panel robots / 1217 pairings.
A/A: aa - c +0.01 pts over 354 robots; 1% band ±0.62 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 1073 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 40 over 200` | halt | ok | 16.8 a battle over the last 200 (first 200: 30.9) |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `aa after 20%` | halt | ok | aa - c +0.01 pts over 354 robots, stop band ±0.72 |
| `futility km below 0.05 after 30%` | finish | ok | km +0.15, best case +0.25 APS vs bar +0.05 |

Stopping now would leave 229 battles unrun (about 3 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
22:01:21 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1488498; work D:\code\Hadur_Robot\hadur-bench\work
22:01:21 start prep
22:01:24 progress pushed to origin claude/pc-sg-aim-progress (every 15 min)
22:02:56 prep exit=0 in 94 s
22:02:56 start aim
22:02:56 watching aim: 6 stop rule(s)
22:03:22 progress aim: 11/1302 (1%) battles, 1512/h, ETA 51 min, 0 failed, skips 19.2/battle (last 100)
```
