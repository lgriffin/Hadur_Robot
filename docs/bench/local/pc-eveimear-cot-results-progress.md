# Queue pc-eveimear-cot: progress

Updated 2026-11-05 19:37:42 PC time (19:37 UTC), runner pid 32756.

- `prep` done, exit 0 in 0 min
- `bench` running
- `gate` pending
- `pr` pending

### bench

**6637 of 6720 battles** (99%), 12 failed. Running 28 min, 14237 battles/h, about 0 min left (ends ~19:38 PC time). Last battle -0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0; engine disables 0.

| arm | battles | failed | share | vs control (pts) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 1329 | 0 | 81.18 | - | - | - | 0.0 |
| aa | 1327 | 0 | 81.16 | -0.02 (112 robots) | ±0.04 | -0.09 .. +0.04 | 0.0 |
| cot | 1325 | 12 | 83.29 | +1.79 (111 robots) | ±0.67 | +0.76 .. +2.82 | 0.0 |
| X | 1327 | 0 | 82.64 | +1.47 (112 robots) | ±0.56 | +0.61 .. +2.33 | 0.0 |
| XR | 1329 | 0 | 83.08 | +1.91 (112 robots) | ±0.63 | +0.94 .. +2.88 | 0.0 |
A/A: aa - c -0.02 pts over 112 robots; 1% band ±0.32 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 12 failed of 6637 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | ok | 0.0 a battle over the last 200 (first 200: 0.0) |
| `stall 30m` | halt | ok | last battle -0 min ago |
| `aa after 20%` | halt | ok | aa - c -0.02 pts over 112 robots, stop band ±0.37 |
| `futility X,XR below 0.3 after 20%` | finish | ok | X +1.47, best case +2.33; XR +1.91, best case +2.88 pts vs bar +0.30 |

Stopping now would leave 83 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

> warning: arm cot's jar opponents/jk.micro.Cotillion_0.8.jar was built 693 h before this step started: check it is not stale

### Queue log (last lines)

```
19:09:23 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant calibrated; work D:\code\Hadur_Robot\hadur-bench\work
19:09:23 start prep
19:09:26 progress pushed to origin claude/pc-eveimear-cot-progress (every 15 min)
19:09:42 prep exit=0 in 18 s
19:09:42 start bench
19:09:42 watching bench: 6 stop rule(s)
19:10:24 progress bench: 73/6720 (1%) battles, 6367/h, ETA 1.0 h, 0 failed, skips 0.0/battle (last 100), aa +0.00, cot +3.43, X +2.05, XR +1.88
```
