# Queue pc-census-320: progress

Updated 2026-10-30 10:25:47 PC time (10:25 UTC), runner pid 73660.

- `prep` done, exit 0 in 2 min
- `census` running
- `gate` pending
- `pr` pending

### census

**539 of 3636 battles** (15%), 0 failed, 342 read back from an earlier run. Running 15 min, 780 battles/h, about 4.0 h left (ends ~14:24 PC time). Last battle 0 min ago.
Skipped turns a battle: 35.2 overall, first 100 33.8, last 100 36.9; engine disables 65.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 181 | 0 | 90.97 | - | - | - | 37.6 |
| aa | 182 | 0 | 90.35 | -0.52 (180 robots) | ±0.65 | -1.51 .. +0.47 | 36.1 |
| km | 176 | 0 | 91.61 | +0.81 (175 robots) | ±0.57 | -0.06 .. +1.68 | 38.6 |

APS = mean difference over the robots read x 1212 panel robots / 1217 pairings.
A/A: aa - c -0.52 pts over 180 robots; 1% band ±0.87 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 539 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | waiting | 197 of 200 battles to read |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `aa after 20%` | halt | waiting | checks from 20% of the battles (now 15%) |

Stopping now would leave 3097 battles unrun (about 4.0 h); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
00:42:25 prep exit=0 in 140 s
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
```
