# Queue pc-census-320: progress

Updated 2026-10-30 12:59:25 PC time (12:59 UTC), runner pid 73660.

- `prep` done, exit 0 in 2 min
- `census` running
- `gate` pending
- `pr` pending

### census

**2026 of 3636 battles** (56%), 0 failed, 342 read back from an earlier run. Running 2.8 h, 622 battles/h, about 2.6 h left (ends ~15:34 PC time). Last battle 0 min ago.
Skipped turns a battle: 38.6 overall, first 100 33.8, last 100 44.6; engine disables 640.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 675 | 0 | 91.31 | - | - | - | 38.4 |
| aa | 674 | 0 | 91.25 | -0.05 (672 robots) | ±0.39 | -0.65 .. +0.55 | 38.4 |
| km | 677 | 0 | 91.93 | +0.63 (671 robots) | ±0.27 | +0.22 .. +1.05 | 39.0 |

APS = mean difference over the robots read x 1212 panel robots / 1217 pairings.
A/A: aa - c -0.05 pts over 672 robots; 1% band ±0.45 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 2026 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | ok | 42.5 a battle over the last 200 (first 200: 34.9) |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `aa after 20%` | halt | ok | aa - c -0.05 pts over 672 robots, stop band ±0.52 |

Stopping now would leave 1610 battles unrun (about 2.6 h); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
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
11:42:34 progress census: 1413/3636 (39%) battles, 572/h, ETA 3.9 h, 0 failed, skips 35.6/battle (last 100), aa -0.08, km +0.55
12:12:48 progress census: 1544/3636 (42%) battles, 260/h, ETA 8.0 h, 0 failed, skips 41.3/battle (last 100), aa -0.10, km +0.57
12:43:07 progress census: 1859/3636 (51%) battles, 618/h, ETA 2.9 h, 0 failed, skips 38.6/battle (last 100), aa -0.06, km +0.57
```
