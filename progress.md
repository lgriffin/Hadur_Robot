# Queue pc-jaylexi-diet: progress

Updated 2026-11-04 01:09:47 PC time (01:09 UTC), runner pid 53848.

- `prep` done, exit 0 in 0 min
- `bench` running
- `gate` pending
- `pr` pending

### bench

**6835 of 10752 battles** (64%), 0 failed. Running 30 min, 13670 battles/h, about 17 min left (ends ~01:26 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0; engine disables 0.

| arm | battles | failed | share | vs control (pts) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 854 | 0 | 84.43 | - | - | - | 0.0 |
| aa | 855 | 0 | 84.49 | +0.06 (112 robots) | ±0.07 | -0.05 .. +0.17 | 0.0 |
| n | 853 | 0 | 84.68 | +0.22 (112 robots) | ±0.23 | -0.12 .. +0.57 | 0.0 |
| r2 | 855 | 0 | 84.40 | -0.06 (112 robots) | ±0.24 | -0.42 .. +0.30 | 0.0 |
| r9 | 853 | 0 | 84.35 | -0.11 (112 robots) | ±0.29 | -0.56 .. +0.34 | 0.0 |
| r10 | 854 | 0 | 82.14 | -2.33 (112 robots) | ±0.48 | -3.05 .. -1.60 | 0.0 |
| r11 | 855 | 0 | 84.28 | -0.18 (112 robots) | ±0.27 | -0.60 .. +0.23 | 0.0 |
| all | 856 | 0 | 77.21 | -7.25 (112 robots) | ±1.24 | -9.16 .. -5.35 | 0.0 |
A/A: aa - c +0.06 pts over 112 robots; 1% band ±0.40 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 6835 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | ok | 0.0 a battle over the last 200 (first 200: 0.0) |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `aa after 20%` | halt | ok | aa - c +0.06 pts over 112 robots, stop band ±0.46 |
| `futility r2,r9,r10,r11,all below -0.5 after 20%` | finish | ok | r2 -0.06, best case +0.30; r9 -0.11, best case +0.34; r10 -2.33, best case -1.60; r11 -0.18, best case +0.23; all -7.25, best case -5.35 pts vs bar -0.50 |

Stopping now would leave 3917 battles unrun (about 17 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
00:39:27 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant calibrated; work D:\code\Hadur_Robot\hadur-bench\work
00:39:27 start prep
00:39:29 progress pushed to origin claude/pc-jaylexi-diet-progress (every 15 min)
00:39:37 prep exit=0 in 9 s
00:39:37 start bench
00:39:37 watching bench: 6 stop rule(s)
00:40:28 progress bench: 147/10752 (1%) battles, 10550/h, ETA 1.0 h, 0 failed, skips 0.0/battle (last 100), aa -0.01, n -0.21, r2 +0.07, r9 +0.85, r10 -1.39, r11 -0.10, all -6.64
```
