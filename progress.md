# Queue pc-census-320: progress

Updated 2026-10-30 00:55:15 PC time (00:55 UTC), runner pid 87472.

- `prep` done, exit 0 in 2 min
- `census` running
- `gate` pending
- `pr` pending

### census

**136 of 3636 battles** (4%), 0 failed. Running 13 min, 636 battles/h, about 5.5 h left (ends ~06:25 PC time). Last battle 0 min ago.
Skipped turns a battle: 35.9 overall, first 100 36.0, last 100 36.5; engine disables 47.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 47 | 0 | 90.66 | - | - | - | 36.9 |
| aa | 46 | 0 | 89.12 | -1.37 (46 robots) | ±1.51 | -3.67 .. +0.94 | 36.1 |
| km | 43 | 0 | 90.67 | +0.73 (42 robots) | ±1.14 | -1.02 .. +2.48 | 34.7 |

APS = mean difference over the robots read x 1212 panel robots / 1217 pairings.
A/A: aa - c -1.37 pts over 46 robots; 1% band ±1.72 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 136 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 40 over 200` | halt | waiting | 136 of 200 battles to read |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `aa after 20%` | halt | waiting | checks from 20% of the battles (now 4%) |

Stopping now would leave 3500 battles unrun (about 5.5 h); every battle already fought is kept and a rerun resumes from it.

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
