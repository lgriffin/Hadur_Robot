# Queue pc-census-320: progress

Updated 2026-10-30 15:02:37 PC time (15:02 UTC), runner pid 73660.

- `prep` done, exit 0 in 2 min
- `census` running
- `gate` pending
- `pr` pending

### census

**3289 of 3636 battles** (90%), 0 failed, 342 read back from an earlier run. Running 4.9 h, 622 battles/h, about 33 min left (ends ~15:36 PC time). Last battle 0 min ago.
Skipped turns a battle: 37.7 overall, first 100 33.8, last 100 36.5; engine disables 1088.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 1095 | 0 | 91.38 | - | - | - | 37.9 |
| aa | 1096 | 0 | 91.44 | +0.07 (1092 robots) | ±0.30 | -0.40 .. +0.53 | 37.5 |
| km | 1098 | 0 | 91.90 | +0.48 (1092 robots) | ±0.25 | +0.09 .. +0.86 | 38.1 |

APS = mean difference over the robots read x 1212 panel robots / 1217 pairings.
A/A: aa - c +0.07 pts over 1092 robots; 1% band ±0.35 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 3289 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | ok | 35.2 a battle over the last 200 (first 200: 34.9) |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `aa after 20%` | halt | ok | aa - c +0.07 pts over 1092 robots, stop band ±0.41 |

Stopping now would leave 347 battles unrun (about 33 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
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
14:14:05 progress census: 2783/3636 (77%) battles, 582/h, ETA 1.5 h, 0 failed, skips 42.1/battle (last 100), aa -0.01, km +0.52
14:44:24 progress census: 3098/3636 (85%) battles, 624/h, ETA 52 min, 0 failed, skips 41.0/battle (last 100), aa +0.00, km +0.50
```
