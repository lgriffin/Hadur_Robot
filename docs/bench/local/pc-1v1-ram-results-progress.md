# Queue pc-1v1-ram: progress

Updated 2026-10-28 19:29:11 PC time (19:29 UTC), runner pid 45848.

- `prep` done, exit 0 in 2 min
- `ram` done, exit 0 in 6 min
- `exit` running
- `gate` pending
- `pr` pending

### ram

**810 of 810 battles** (100%), 0 failed. Running 6 min, 8308 battles/h, about 0 min left (ends ~19:27 PC time). Last battle 0 min ago.
Skipped turns a battle: 12.6 overall, first 100 13.3, last 100 12.6; engine disables 2.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 270 | 0 | 83.26 | - | - | - | 12.4 |
| aa | 270 | 0 | 83.01 | -0.01 (45 robots) | ±0.01 | -0.03 .. +0.01 | 12.5 |
| rk | 270 | 0 | 86.20 | +0.11 (45 robots) | ±0.04 | +0.05 .. +0.17 | 12.9 |

APS = mean difference over the robots read x 45 panel robots / 1217 pairings.
A/A: aa - c -0.25 pts over 45 robots; 1% band ±0.71 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 810 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 40 over 200` | halt | ok | 12.5 a battle over the last 200 (first 200: 12.9) |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `aa after 20%` | halt | ok | aa - c -0.25 pts over 45 robots, stop band ±0.83 |
| `futility rk below 0.05 after 30%` | finish | ok | rk +0.11, best case +0.17 APS vs bar +0.05 |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### exit

**98 of 126 battles** (78%), 0 failed. Running 1 min, 3971 battles/h, about 0 min left (ends ~19:29 PC time). Last battle 0 min ago.
Skipped turns a battle: 12.6 overall, first 98 12.6, last 98 12.6; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 34 | 0 | 87.22 | - | - | - | 12.9 |
| aa | 33 | 0 | 87.65 | +0.00 (7 robots) | ±0.02 | -0.02 .. +0.03 | 12.7 |
| xp | 31 | 0 | 89.06 | +0.01 (7 robots) | ±0.04 | -0.06 .. +0.07 | 12.2 |

APS = mean difference over the robots read x 7 panel robots / 1217 pairings.
A/A: aa - c +0.43 pts over 7 robots; 1% band ±2.02 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 98 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 40 over 200` | halt | waiting | 98 of 200 battles to read |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `aa after 20%` | halt | waiting | fewer than 10 robots read in both |

Stopping now would leave 28 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
19:20:06 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1488498; work D:\code\Hadur_Robot\hadur-bench\work
19:20:06 start prep
19:20:08 progress pushed to origin claude/pc-1v1-ram-progress (every 15 min)
19:21:50 prep exit=0 in 104 s
19:21:50 start ram
19:21:50 watching ram: 6 stop rule(s)
19:22:07 progress ram: 22/810 (3%) battles, 4909/h, ETA 10 min, 0 failed, skips 15.4/battle (last 100), aa +0.00
19:27:42 ram exit=0 in 351 s
19:27:42 start exit
19:27:42 watching exit: 5 stop rule(s)
```
