# Queue pc-sg-wide: progress

Updated 2026-10-31 00:17:47 PC time (00:17 UTC), runner pid 73828.

- `prep` done, exit 0 in 3 min
- `aim` running
- `gate` pending
- `pr` pending

### aim

**845 of 1736 battles** (49%), 0 failed. Running 12 min, 4298 battles/h, about 12 min left (ends ~00:30 PC time). Last battle 0 min ago.
Skipped turns a battle: 24.1 overall, first 100 46.6, last 100 21.0; engine disables 101.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 213 | 0 | 96.01 | - | - | - | 23.2 |
| aa | 211 | 0 | 96.03 | -0.03 (208 robots) | ±0.09 | -0.16 .. +0.11 | 24.8 |
| kw | 209 | 0 | 95.87 | -0.05 (206 robots) | ±0.09 | -0.19 .. +0.08 | 22.9 |
| kikw | 212 | 0 | 96.26 | +0.09 (206 robots) | ±0.08 | -0.03 .. +0.21 | 25.6 |

APS = mean difference over the robots read x 434 panel robots / 1217 pairings.
A/A: aa - c -0.08 pts over 208 robots; 1% band ±0.81 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 845 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 40 over 200` | halt | ok | 19.7 a battle over the last 200 (first 200: 39.7) |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `aa after 20%` | halt | ok | aa - c -0.08 pts over 208 robots, stop band ±0.94 |
| `futility kikw below 0.05 after 30%` | finish | ok | kikw +0.09, best case +0.21 APS vs bar +0.05 |

Stopping now would leave 891 battles unrun (about 12 min); every battle already fought is kept and a rerun resumes from it.

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
