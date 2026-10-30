# Queue pc-census-320: progress

Updated 2026-10-30 01:14:26 PC time (01:14 UTC), runner pid 87472.

- `prep` done, exit 0 in 2 min
- `census` halted, exit 75 in 32 min, HALTED by skips 40 over 200: 40.9 a battle over the last 200 (first 200: 37.2)
- `gate` pending
- `pr` pending

### census

**342 of 3636 battles** (9%), 0 failed. Running 32 min, 660 battles/h, about 5.0 h left (ends ~06:13 PC time). Last battle 0 min ago.
Skipped turns a battle: 38.7 overall, first 100 36.0, last 100 41.0; engine disables 136.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 114 | 0 | 91.23 | - | - | - | 38.3 |
| aa | 115 | 0 | 91.21 | -0.42 (112 robots) | ±0.77 | -1.61 .. +0.76 | 37.6 |
| km | 113 | 0 | 91.80 | +0.62 (110 robots) | ±0.65 | -0.38 .. +1.61 | 40.4 |

APS = mean difference over the robots read x 1212 panel robots / 1217 pairings.
A/A: aa - c -0.43 pts over 112 robots; 1% band ±1.10 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 342 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 40 over 200` | halt | TRIPPED | 40.9 a battle over the last 200 (first 200: 37.2) |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `aa after 20%` | halt | waiting | checks from 20% of the battles (now 9%) |

Stopping now would leave 3294 battles unrun (about 5.0 h); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
00:40:05 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1488498; work D:\code\Hadur_Robot\hadur-bench\work
00:40:05 start prep
00:40:09 progress pushed to origin claude/pc-census-320-progress (every 15 min)
00:42:25 prep exit=0 in 140 s
00:42:25 start census
00:42:25 watching census: 5 stop rule(s)
00:43:07 progress census: 0/3636 (0%) battles, 0 failed
01:13:25 progress census: 331/3636 (9%) battles, 662/h, ETA 5.0 h, 0 failed, skips 40.7/battle (last 100), aa -0.48, km +0.50
01:14:26 STOP census by rule skips 40 over 200: 40.9 a battle over the last 200 (first 200: 37.2); 342 battles fought and kept, 3294 battles left unrun (about 5.0 h)
01:14:26 census exit=75 in 1920 s (halted, skips 40 over 200)
```
