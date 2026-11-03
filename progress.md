# Queue pc-mimic-wide: progress

Updated 2026-11-03 18:33:05 PC time (18:33 UTC), runner pid 17340.

- `prep` done, exit 0 in 1 min
- `screen` running
- `pick` pending
- `prep2` pending
- `confirm` pending
- `gate` pending
- `pr` pending

### screen

**714 of 864 battles** (83%), 0 failed. Running 14 min, 3113 battles/h, about 3 min left (ends ~18:35 PC time). Last battle 0 min ago.
Skipped turns a battle: 26.6 overall, first 100 28.6, last 100 26.1; engine disables 2.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 238 | 0 | 85.41 | - | - | - | 26.3 |
| aa | 239 | 0 | 85.25 | -0.00 (36 robots) | ±0.02 | -0.04 .. +0.03 | 26.5 |
| mq | 237 | 0 | 85.74 | +0.01 (36 robots) | ±0.02 | -0.02 .. +0.04 | 27.2 |

APS = mean difference over the robots read x 36 panel robots / 1217 pairings.
A/A: aa - c -0.16 pts over 36 robots; 1% band ±0.76 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 714 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | ok | 26.2 a battle over the last 200 (first 200: 27.5) |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `aa after 20%` | halt | ok | aa - c -0.16 pts over 36 robots, stop band ±0.88 |
| `futility mq below 0.01 after 20%` | finish | ok | mq +0.01, best case +0.04 APS vs bar +0.01 |

Stopping now would leave 150 battles unrun (about 3 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
18:17:54 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant calibrated; work D:\code\Hadur_Robot\hadur-bench\work
18:17:54 start prep
18:17:57 progress pushed to origin claude/pc-mimic-wide-progress (every 15 min)
18:19:19 prep exit=0 in 84 s
18:19:19 start screen
18:19:19 watching screen: 6 stop rule(s)
18:19:55 progress screen: 24/864 (3%) battles, 2384/h, ETA 21 min, 0 failed, skips 32.0/battle (last 100), aa -0.01, mq +0.02
```
