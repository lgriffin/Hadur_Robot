# Queue pc-shield-still2: progress

Updated 2026-10-31 21:32:53 PC time (21:32 UTC), runner pid 65580.

- `prep` done, exit 0 in 2 min
- `confirm` done, exit 0 in 10 min
- `gate` done, exit 0 in 0 min
- `pr` done, exit 0 in 0 min

### confirm

**480 of 480 battles** (100%), 0 failed. Running 10 min, 3023 battles/h, about 0 min left (ends ~21:32 PC time). Last battle 0 min ago.
Skipped turns a battle: 12.3 overall, first 100 12.4, last 100 11.8; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 160 | 0 | 87.08 | - | - | - | 12.5 |
| aa | 160 | 0 | 88.22 | +0.04 (40 robots) | ±0.03 | -0.01 .. +0.09 | 12.5 |
| mtzl | 160 | 0 | 92.84 | +0.17 (40 robots) | ±0.07 | +0.06 .. +0.28 | 11.9 |

APS = mean difference over the robots read x 40 panel robots / 1217 pairings.
A/A: aa - c +1.15 pts over 40 robots; 1% band ±0.92 (OUTSIDE: comparisons void).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 480 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 40 over 200` | halt | ok | 12.2 a battle over the last 200 (first 200: 12.4) |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
21:21:33 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1488498; work D:\code\Hadur_Robot\hadur-bench\work
21:21:33 start prep
21:21:36 progress pushed to origin claude/pc-shield-still2-progress (every 15 min)
21:23:15 prep exit=0 in 101 s
21:23:15 start confirm
21:23:15 watching confirm: 4 stop rule(s)
21:23:34 progress confirm: 6/480 (1%) battles, 1129/h, ETA 25 min, 0 failed, skips 13.7/battle (last 100)
21:32:46 confirm exit=0 in 571 s
21:32:46 start gate
21:32:48 gate exit=0 in 1 s
21:32:48 start pr
21:32:53 pr exit=0 in 5 s
21:32:53 ALLDONE
```
