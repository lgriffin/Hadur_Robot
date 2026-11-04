# Queue pc-jaylexi-diet: progress

Updated 2026-11-04 00:54:35 PC time (00:54 UTC), runner pid 53848.

- `prep` done, exit 0 in 0 min
- `bench` running
- `gate` pending
- `pr` pending

### bench

**3333 of 10752 battles** (31%), 0 failed. Running 15 min, 13381 battles/h, about 33 min left (ends ~01:27 PC time). Last battle -0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0; engine disables 0.

| arm | battles | failed | share | vs control (pts) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 415 | 0 | 84.34 | - | - | - | 0.0 |
| aa | 417 | 0 | 84.35 | +0.00 (111 robots) | ±0.14 | -0.21 .. +0.22 | 0.0 |
| n | 420 | 0 | 84.44 | +0.10 (111 robots) | ±0.31 | -0.38 .. +0.58 | 0.0 |
| r2 | 415 | 0 | 84.11 | -0.23 (111 robots) | ±0.32 | -0.72 .. +0.25 | 0.0 |
| r9 | 417 | 0 | 84.23 | -0.12 (111 robots) | ±0.39 | -0.72 .. +0.49 | 0.0 |
| r10 | 416 | 0 | 81.88 | -2.46 (111 robots) | ±0.57 | -3.34 .. -1.58 | 0.0 |
| r11 | 417 | 0 | 84.00 | -0.34 (111 robots) | ±0.43 | -1.00 .. +0.32 | 0.0 |
| all | 416 | 0 | 77.32 | -7.02 (111 robots) | ±1.26 | -8.95 .. -5.10 | 0.0 |
A/A: aa - c +0.00 pts over 111 robots; 1% band ±0.57 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 3333 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | ok | 0.0 a battle over the last 200 (first 200: 0.0) |
| `stall 30m` | halt | ok | last battle -0 min ago |
| `aa after 20%` | halt | ok | aa - c +0.00 pts over 111 robots, stop band ±0.67 |
| `futility r2,r9,r10,r11,all below -0.5 after 20%` | finish | ok | r2 -0.23, best case +0.25; r9 -0.12, best case +0.49; r10 -2.46, best case -1.58; r11 -0.34, best case +0.32; all -7.02, best case -5.10 pts vs bar -0.50 |

Stopping now would leave 7419 battles unrun (about 33 min); every battle already fought is kept and a rerun resumes from it.

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
