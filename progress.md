# Queue pc-census-320: progress

Updated 2026-10-30 11:26:25 PC time (11:26 UTC), runner pid 73660.

- `prep` done, exit 0 in 2 min
- `census` running
- `gate` pending
- `pr` pending

### census

**1307 of 3636 battles** (36%), 0 failed, 342 read back from an earlier run. Running 1.3 h, 734 battles/h, about 3.2 h left (ends ~14:36 PC time). Last battle 0 min ago.
Skipped turns a battle: 36.9 overall, first 100 33.8, last 100 50.9; engine disables 348.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 435 | 0 | 91.19 | - | - | - | 35.3 |
| aa | 438 | 0 | 91.03 | -0.17 (435 robots) | ±0.49 | -0.91 .. +0.57 | 38.5 |
| km | 434 | 0 | 91.73 | +0.62 (432 robots) | ±0.37 | +0.06 .. +1.19 | 38.3 |

APS = mean difference over the robots read x 1212 panel robots / 1217 pairings.
A/A: aa - c -0.17 pts over 435 robots; 1% band ±0.56 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 1307 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | ok | 42.7 a battle over the last 200 (first 200: 34.9) |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `aa after 20%` | halt | ok | aa - c -0.17 pts over 435 robots, stop band ±0.65 |

Stopping now would leave 2329 battles unrun (about 3.2 h); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
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
11:12:17 progress census: 1127/3636 (31%) battles, 728/h, ETA 3.4 h, 0 failed, skips 40.4/battle (last 100), aa -0.31, km +0.62
```
