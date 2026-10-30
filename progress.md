# Queue pc-census-320: progress

Updated 2026-10-30 10:56:10 PC time (10:56 UTC), runner pid 73660.

- `prep` done, exit 0 in 2 min
- `census` running
- `gate` pending
- `pr` pending

### census

**938 of 3636 battles** (26%), 0 failed, 342 read back from an earlier run. Running 45 min, 792 battles/h, about 3.4 h left (ends ~14:20 PC time). Last battle 0 min ago.
Skipped turns a battle: 34.6 overall, first 100 33.8, last 100 37.1; engine disables 203.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 315 | 0 | 91.31 | - | - | - | 35.8 |
| aa | 312 | 0 | 90.81 | -0.46 (310 robots) | ±0.57 | -1.33 .. +0.41 | 35.6 |
| km | 311 | 0 | 91.57 | +0.46 (310 robots) | ±0.40 | -0.14 .. +1.07 | 36.9 |

APS = mean difference over the robots read x 1212 panel robots / 1217 pairings.
A/A: aa - c -0.46 pts over 310 robots; 1% band ±0.66 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 938 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | ok | 35.6 a battle over the last 200 (first 200: 34.9) |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `aa after 20%` | halt | ok | aa - c -0.46 pts over 310 robots, stop band ±0.77 |

Stopping now would leave 2698 battles unrun (about 3.4 h); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
00:42:25 start census
00:42:25 watching census: 5 stop rule(s)
00:43:07 progress census: 0/3636 (0%) battles, 0 failed
01:13:25 progress census: 331/3636 (9%) battles, 662/h, ETA 5.0 h, 0 failed, skips 40.7/battle (last 100), aa -0.48, km +0.50
01:14:26 STOP census by rule skips 40 over 200: 40.9 a battle over the last 200 (first 200: 37.2); 342 battles fought and kept, 3294 battles left unrun (about 5.0 h)
01:14:26 census exit=75 in 1920 s (halted, skips 40 over 200)
01:14:28 alert issue: https://github.com/lgriffin/Hadur_Robot/issues/444
01:14:28 queue halted by a stop rule; fix the cause and rerun to resume (every fought battle is kept)
10:10:38 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1488498; work D:\code\Hadur_Robot\hadur-bench\work
10:10:38 skip prep (already exit=0)
10:10:38 start census
10:10:38 watching census: 5 stop rule(s)
10:10:40 progress pushed to origin claude/pc-census-320-progress (every 15 min)
10:11:38 progress census: 342/3636 (9%) battles, 0 failed, aa -0.42, km +0.62
10:41:57 progress census: 760/3636 (21%) battles, 836/h, ETA 3.4 h, 0 failed, skips 37.1/battle (last 100), aa -0.40, km +0.46
```
