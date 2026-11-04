# Queue pc-eveimear-diet: progress

Updated 2026-11-04 01:56:03 PC time (01:56 UTC), runner pid 26364.

- `prep` done, exit 0 in 0 min
- `bench` done, exit 0 in 27 min
- `gate` done, exit 0 in 0 min
- `pr` done, exit 0 in 0 min

### bench

**6720 of 6720 battles** (100%), 0 failed. Running 27 min, 14933 battles/h, about 0 min left (ends ~01:55 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0; engine disables 0.

| arm | battles | failed | share | vs control (pts) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 1344 | 0 | 80.29 | - | - | - | 0.0 |
| aa | 1344 | 0 | 80.30 | +0.01 (112 robots) | ±0.03 | -0.04 .. +0.06 | 0.0 |
| n | 1344 | 0 | 80.27 | -0.02 (112 robots) | ±0.08 | -0.15 .. +0.11 | 0.0 |
| r2 | 1344 | 0 | 79.97 | -0.32 (112 robots) | ±0.25 | -0.71 .. +0.06 | 0.0 |
| r27 | 1344 | 0 | 79.96 | -0.33 (112 robots) | ±0.25 | -0.71 .. +0.05 | 0.0 |
A/A: aa - c +0.01 pts over 112 robots; 1% band ±0.32 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 6720 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | ok | 0.0 a battle over the last 200 (first 200: 0.0) |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `aa after 20%` | halt | ok | aa - c +0.01 pts over 112 robots, stop band ±0.37 |
| `futility r2,r27 below -0.5 after 20%` | finish | ok | r2 -0.32, best case +0.06; r27 -0.33, best case +0.05 pts vs bar -0.50 |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
01:28:50 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant calibrated; work D:\code\Hadur_Robot\hadur-bench\work
01:28:50 start prep
01:28:52 progress pushed to origin claude/pc-eveimear-diet-progress (every 15 min)
01:28:56 prep exit=0 in 6 s
01:28:56 start bench
01:28:56 watching bench: 6 stop rule(s)
01:29:51 progress bench: 168/6720 (2%) battles, 11166/h, ETA 35 min, 0 failed, skips 0.0/battle (last 100), aa +0.04, n +0.45, r2 +0.63, r27 +1.02
01:55:57 bench exit=0 in 1620 s
01:55:57 start gate
01:55:57 gate exit=0 in 0 s
01:55:57 start pr
01:56:03 pr exit=0 in 5 s
01:56:03 ALLDONE
```
