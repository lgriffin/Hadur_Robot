# Queue pc-census-320: progress

Updated 2026-10-30 01:10:26 PC time (01:10 UTC), runner pid 87472.

- `prep` done, exit 0 in 2 min
- `census` running
- `gate` pending
- `pr` pending

### census

**307 of 3636 battles** (8%), 0 failed. Running 28 min, 659 battles/h, about 5.1 h left (ends ~06:13 PC time). Last battle 0 min ago.
Skipped turns a battle: 37.3 overall, first 100 36.0, last 100 36.5; engine disables 115.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 103 | 0 | 91.41 | - | - | - | 37.1 |
| aa | 100 | 0 | 90.92 | -0.51 (98 robots) | ±0.86 | -1.82 .. +0.81 | 36.0 |
| km | 104 | 0 | 91.76 | +0.54 (98 robots) | ±0.70 | -0.53 .. +1.62 | 38.6 |

APS = mean difference over the robots read x 1212 panel robots / 1217 pairings.
A/A: aa - c -0.51 pts over 98 robots; 1% band ±1.18 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 307 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 40 over 200` | halt | ok | 38.5 a battle over the last 200 (first 200: 37.2) |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `aa after 20%` | halt | waiting | checks from 20% of the battles (now 8%) |

Stopping now would leave 3329 battles unrun (about 5.1 h); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
00:40:05 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1488498; work D:\code\Hadur_Robot\hadur-bench\work
00:40:05 start prep
00:40:09 progress pushed to origin claude/pc-census-320-progress (every 15 min)
00:42:25 prep exit=0 in 140 s
00:42:25 start census
00:42:25 watching census: 5 stop rule(s)
00:43:07 progress census: 0/3636 (0%) battles, 0 failed
```
