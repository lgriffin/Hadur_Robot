# Queue pc-jaylexi-diet: progress

Updated 2026-11-04 01:24:53 PC time (01:24 UTC), runner pid 53848.

- `prep` done, exit 0 in 0 min
- `bench` running
- `gate` pending
- `pr` pending

### bench

**10204 of 10752 battles** (95%), 0 failed. Running 45 min, 13622 battles/h, about 2 min left (ends ~01:27 PC time). Last battle -0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0; engine disables 0.

| arm | battles | failed | share | vs control (pts) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 1274 | 0 | 84.49 | - | - | - | 0.0 |
| aa | 1277 | 0 | 84.54 | +0.05 (112 robots) | ±0.08 | -0.08 .. +0.17 | 0.0 |
| n | 1274 | 0 | 84.59 | +0.07 (112 robots) | ±0.17 | -0.18 .. +0.32 | 0.0 |
| r2 | 1276 | 0 | 84.35 | -0.16 (112 robots) | ±0.17 | -0.42 .. +0.10 | 0.0 |
| r9 | 1275 | 0 | 84.45 | -0.07 (112 robots) | ±0.23 | -0.43 .. +0.29 | 0.0 |
| r10 | 1277 | 0 | 82.04 | -2.48 (112 robots) | ±0.46 | -3.18 .. -1.78 | 0.0 |
| r11 | 1275 | 0 | 84.24 | -0.28 (112 robots) | ±0.22 | -0.61 .. +0.05 | 0.0 |
| all | 1276 | 0 | 77.16 | -7.36 (112 robots) | ±1.26 | -9.28 .. -5.44 | 0.0 |
A/A: aa - c +0.05 pts over 112 robots; 1% band ±0.33 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 10204 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | ok | 0.0 a battle over the last 200 (first 200: 0.0) |
| `stall 30m` | halt | ok | last battle -0 min ago |
| `aa after 20%` | halt | ok | aa - c +0.05 pts over 112 robots, stop band ±0.38 |
| `futility r2,r9,r10,r11,all below -0.5 after 20%` | finish | ok | r2 -0.16, best case +0.10; r9 -0.07, best case +0.29; r10 -2.48, best case -1.78; r11 -0.28, best case +0.05; all -7.36, best case -5.44 pts vs bar -0.50 |

Stopping now would leave 548 battles unrun (about 2 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
00:39:27 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant calibrated; work D:\code\Hadur_Robot\hadur-bench\work
00:39:27 start prep
00:39:29 progress pushed to origin claude/pc-jaylexi-diet-progress (every 15 min)
00:39:37 prep exit=0 in 9 s
00:39:37 start bench
00:39:37 watching bench: 6 stop rule(s)
00:40:28 progress bench: 147/10752 (1%) battles, 10550/h, ETA 1.0 h, 0 failed, skips 0.0/battle (last 100), aa -0.01, n -0.21, r2 +0.07, r9 +0.85, r10 -1.39, r11 -0.10, all -6.64
01:10:48 progress bench: 7049/10752 (66%) battles, 13656/h, ETA 16 min, 0 failed, skips 0.0/battle (last 100), aa +0.06, n +0.20, r2 -0.10, r9 -0.14, r10 -2.40, r11 -0.21, all -7.31
```
