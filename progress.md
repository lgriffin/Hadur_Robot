# Queue pc-jaylexi-diet: progress

Updated 2026-11-04 01:28:39 PC time (01:28 UTC), runner pid 53848.

- `prep` done, exit 0 in 0 min
- `bench` done, exit 0 in 49 min
- `gate` done, exit 0 in 0 min
- `pr` done, exit 0 in 0 min

### bench

**10752 of 10752 battles** (100%), 0 failed. Running 49 min, 13010 battles/h, about 0 min left (ends ~01:28 PC time). Last battle 1 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0; engine disables 0.

| arm | battles | failed | share | vs control (pts) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 1344 | 0 | 84.42 | - | - | - | 0.0 |
| aa | 1344 | 0 | 84.47 | +0.05 (112 robots) | ±0.07 | -0.06 .. +0.17 | 0.0 |
| n | 1344 | 0 | 84.55 | +0.11 (112 robots) | ±0.16 | -0.14 .. +0.36 | 0.0 |
| r2 | 1344 | 0 | 84.32 | -0.13 (112 robots) | ±0.17 | -0.39 .. +0.14 | 0.0 |
| r9 | 1344 | 0 | 84.42 | -0.02 (112 robots) | ±0.24 | -0.39 .. +0.34 | 0.0 |
| r10 | 1344 | 0 | 82.03 | -2.41 (112 robots) | ±0.45 | -3.10 .. -1.72 | 0.0 |
| r11 | 1344 | 0 | 84.23 | -0.21 (112 robots) | ±0.22 | -0.54 .. +0.12 | 0.0 |
| all | 1344 | 0 | 77.20 | -7.24 (112 robots) | ±1.24 | -9.14 .. -5.33 | 0.0 |
A/A: aa - c +0.05 pts over 112 robots; 1% band ±0.32 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 10752 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | ok | 0.0 a battle over the last 200 (first 200: 0.0) |
| `stall 30m` | halt | ok | last battle 1 min ago |
| `aa after 20%` | halt | ok | aa - c +0.05 pts over 112 robots, stop band ±0.37 |
| `futility r2,r9,r10,r11,all below -0.5 after 20%` | finish | ok | r2 -0.13, best case +0.14; r9 -0.02, best case +0.34; r10 -2.41, best case -1.72; r11 -0.21, best case +0.12; all -7.24, best case -5.33 pts vs bar -0.50 |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

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
01:28:33 bench exit=0 in 2935 s
01:28:33 start gate
01:28:33 gate exit=0 in 0 s
01:28:33 start pr
01:28:39 pr exit=0 in 5 s
01:28:39 ALLDONE
```
