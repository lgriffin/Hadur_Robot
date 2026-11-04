# Queue pc-eveimear-diet: progress

Updated 2026-11-04 01:44:00 PC time (01:44 UTC), runner pid 26364.

- `prep` done, exit 0 in 0 min
- `bench` running
- `gate` pending
- `pr` pending

### bench

**3829 of 6720 battles** (57%), 0 failed. Running 15 min, 15276 battles/h, about 11 min left (ends ~01:55 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0; engine disables 0.

| arm | battles | failed | share | vs control (pts) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 764 | 0 | 80.17 | - | - | - | 0.0 |
| aa | 768 | 0 | 80.20 | +0.03 (112 robots) | ±0.04 | -0.02 .. +0.09 | 0.0 |
| n | 766 | 0 | 80.15 | -0.04 (112 robots) | ±0.13 | -0.23 .. +0.16 | 0.0 |
| r2 | 763 | 0 | 79.88 | -0.30 (112 robots) | ±0.32 | -0.80 .. +0.20 | 0.0 |
| r27 | 768 | 0 | 79.87 | -0.31 (112 robots) | ±0.33 | -0.81 .. +0.19 | 0.0 |
A/A: aa - c +0.03 pts over 112 robots; 1% band ±0.42 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 3829 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | ok | 0.0 a battle over the last 200 (first 200: 0.0) |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `aa after 20%` | halt | ok | aa - c +0.03 pts over 112 robots, stop band ±0.49 |
| `futility r2,r27 below -0.5 after 20%` | finish | ok | r2 -0.30, best case +0.20; r27 -0.31, best case +0.19 pts vs bar -0.50 |

Stopping now would leave 2891 battles unrun (about 11 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
01:28:50 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant calibrated; work D:\code\Hadur_Robot\hadur-bench\work
01:28:50 start prep
01:28:52 progress pushed to origin claude/pc-eveimear-diet-progress (every 15 min)
01:28:56 prep exit=0 in 6 s
01:28:56 start bench
01:28:56 watching bench: 6 stop rule(s)
01:29:51 progress bench: 168/6720 (2%) battles, 11166/h, ETA 35 min, 0 failed, skips 0.0/battle (last 100), aa +0.04, n +0.45, r2 +0.63, r27 +1.02
```
