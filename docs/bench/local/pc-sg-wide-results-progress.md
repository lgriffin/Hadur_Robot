# Queue pc-sg-wide: progress

Updated 2026-10-31 00:29:50 PC time (00:29 UTC), runner pid 73828.

- `prep` done, exit 0 in 3 min
- `aim` running
- `gate` pending
- `pr` pending

### aim

**1734 of 1736 battles** (100%), 0 failed. Running 24 min, 4362 battles/h, about 0 min left (ends ~00:29 PC time). Last battle 0 min ago.
Skipped turns a battle: 23.4 overall, first 100 46.6, last 100 20.0; engine disables 196.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 434 | 0 | 96.14 | - | - | - | 23.5 |
| aa | 433 | 0 | 96.12 | -0.02 (433 robots) | ±0.06 | -0.12 .. +0.08 | 23.4 |
| kw | 433 | 0 | 96.05 | -0.03 (433 robots) | ±0.06 | -0.13 .. +0.06 | 22.7 |
| kikw | 434 | 0 | 96.27 | +0.06 (433 robots) | ±0.05 | -0.03 .. +0.14 | 23.9 |

APS = mean difference over the robots read x 434 panel robots / 1217 pairings.
A/A: aa - c -0.05 pts over 433 robots; 1% band ±0.56 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 1734 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 40 over 200` | halt | ok | 21.2 a battle over the last 200 (first 200: 39.7) |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `aa after 20%` | halt | ok | aa - c -0.05 pts over 433 robots, stop band ±0.65 |
| `futility kikw below 0.05 after 30%` | finish | ok | kikw +0.06, best case +0.14 APS vs bar +0.05 |

Stopping now would leave 2 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
00:02:39 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1488498; work D:\code\Hadur_Robot\hadur-bench\work
00:02:39 start prep
00:02:43 progress pushed to origin claude/pc-sg-wide-progress (every 15 min)
00:05:58 prep exit=0 in 199 s
00:05:58 start aim
00:05:58 watching aim: 6 stop rule(s)
00:06:41 progress aim: 0/1736 (0%) battles, 0 failed
```
