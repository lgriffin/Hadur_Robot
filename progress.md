# Queue pc-census-320: progress

Updated 2026-10-30 13:44:44 PC time (13:44 UTC), runner pid 73660.

- `prep` done, exit 0 in 2 min
- `census` running
- `gate` pending
- `pr` pending

### census

**2497 of 3636 battles** (69%), 0 failed, 342 read back from an earlier run. Running 3.6 h, 616 battles/h, about 1.8 h left (ends ~15:35 PC time). Last battle 0 min ago.
Skipped turns a battle: 38.2 overall, first 100 33.8, last 100 32.7; engine disables 799.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 832 | 0 | 91.31 | - | - | - | 38.5 |
| aa | 833 | 0 | 91.35 | +0.01 (830 robots) | ±0.36 | -0.53 .. +0.56 | 38.2 |
| km | 832 | 0 | 91.90 | +0.56 (829 robots) | ±0.26 | +0.17 .. +0.96 | 38.3 |

APS = mean difference over the robots read x 1212 panel robots / 1217 pairings.
A/A: aa - c +0.01 pts over 830 robots; 1% band ±0.41 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 2497 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | ok | 31.4 a battle over the last 200 (first 200: 34.9) |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `aa after 20%` | halt | ok | aa - c +0.01 pts over 830 robots, stop band ±0.47 |

Stopping now would leave 1139 battles unrun (about 1.8 h); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
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
13:13:26 progress census: 2173/3636 (60%) battles, 624/h, ETA 2.3 h, 0 failed, skips 37.7/battle (last 100), aa -0.06, km +0.66
13:43:46 progress census: 2485/3636 (68%) battles, 614/h, ETA 1.9 h, 0 failed, skips 33.8/battle (last 100), aa +0.03, km +0.57
```
