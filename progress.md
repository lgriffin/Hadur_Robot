# Queue pc-census-320: progress

Updated 2026-10-30 14:31:15 PC time (14:31 UTC), runner pid 73660.

- `prep` done, exit 0 in 2 min
- `census` running
- `gate` pending
- `pr` pending

### census

**2961 of 3636 battles** (81%), 0 failed, 342 read back from an earlier run. Running 4.3 h, 614 battles/h, about 1.1 h left (ends ~15:37 PC time). Last battle 0 min ago.
Skipped turns a battle: 37.8 overall, first 100 33.8, last 100 36.5; engine disables 965.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 988 | 0 | 91.38 | - | - | - | 38.0 |
| aa | 988 | 0 | 91.35 | -0.04 (986 robots) | ±0.32 | -0.54 .. +0.45 | 37.4 |
| km | 985 | 0 | 91.93 | +0.55 (983 robots) | ±0.27 | +0.14 .. +0.96 | 38.2 |

APS = mean difference over the robots read x 1212 panel robots / 1217 pairings.
A/A: aa - c -0.04 pts over 986 robots; 1% band ±0.37 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 2961 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | ok | 37.7 a battle over the last 200 (first 200: 34.9) |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `aa after 20%` | halt | ok | aa - c -0.04 pts over 986 robots, stop band ±0.43 |

Stopping now would leave 675 battles unrun (about 1.1 h); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
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
14:14:05 progress census: 2783/3636 (77%) battles, 582/h, ETA 1.5 h, 0 failed, skips 42.1/battle (last 100), aa -0.01, km +0.52
```
