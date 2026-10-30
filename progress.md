# Queue pc-census-320: progress

Updated 2026-10-30 15:32:51 PC time (15:32 UTC), runner pid 73660.

- `prep` done, exit 0 in 2 min
- `census` running
- `gate` pending
- `pr` pending

### census

**3604 of 3636 battles** (99%), 0 failed, 342 read back from an earlier run. Running 5.4 h, 630 battles/h, about 3 min left (ends ~15:35 PC time). Last battle 0 min ago.
Skipped turns a battle: 37.7 overall, first 100 33.8, last 100 31.1; engine disables 1186.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 1200 | 0 | 91.41 | - | - | - | 37.7 |
| aa | 1202 | 0 | 91.49 | +0.07 (1198 robots) | ±0.28 | -0.36 .. +0.50 | 37.6 |
| km | 1202 | 0 | 91.92 | +0.47 (1197 robots) | ±0.24 | +0.10 .. +0.83 | 38.1 |

APS = mean difference over the robots read x 1212 panel robots / 1217 pairings.
A/A: aa - c +0.07 pts over 1198 robots; 1% band ±0.34 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 3604 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | ok | 34.7 a battle over the last 200 (first 200: 34.9) |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `aa after 20%` | halt | ok | aa - c +0.07 pts over 1198 robots, stop band ±0.39 |

Stopping now would leave 32 battles unrun (about 3 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
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
15:14:42 progress census: 3416/3636 (94%) battles, 636/h, ETA 21 min, 0 failed, skips 38.2/battle (last 100), aa +0.07, km +0.47
```
