# Queue pc-eveimear-port: progress

Updated 2026-11-05 21:02:45 PC time (21:02 UTC), runner pid 45300.

- `prep` done, exit 0 in 0 min
- `bench` running
- `gate` pending
- `pr` pending

### bench

**3546 of 6720 battles** (53%), 5 failed. Running 15 min, 14242 battles/h, about 13 min left (ends ~21:16 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0; engine disables 0.

| arm | battles | failed | share | vs control (pts) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 710 | 0 | 81.07 | - | - | - | 0.0 |
| aa | 709 | 0 | 81.10 | +0.03 (112 robots) | ±0.08 | -0.09 .. +0.15 | 0.0 |
| cot | 710 | 5 | 83.41 | +1.97 (111 robots) | ±0.71 | +0.89 .. +3.06 | 0.0 |
| XR | 710 | 0 | 82.97 | +1.88 (112 robots) | ±0.66 | +0.87 .. +2.89 | 0.0 |
| P | 707 | 0 | 83.38 | +2.29 (112 robots) | ±0.79 | +1.08 .. +3.50 | 0.0 |
A/A: aa - c +0.03 pts over 112 robots; 1% band ±0.44 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 5 failed of 3546 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | ok | 0.0 a battle over the last 200 (first 200: 0.0) |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `aa after 20%` | halt | ok | aa - c +0.03 pts over 112 robots, stop band ±0.51 |
| `futility P below 0.3 after 20%` | finish | ok | P +2.29, best case +3.50 pts vs bar +0.30 |

Stopping now would leave 3174 battles unrun (about 13 min); every battle already fought is kept and a rerun resumes from it.

> warning: arm cot's jar opponents/jk.micro.Cotillion_0.8.jar was built 695 h before this step started: check it is not stale

### Queue log (last lines)

```
20:47:34 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant calibrated; work D:\code\Hadur_Robot\hadur-bench\work
20:47:34 start prep
20:47:37 progress pushed to origin claude/pc-eveimear-port-progress (every 15 min)
20:47:47 prep exit=0 in 13 s
20:47:47 start bench
20:47:47 watching bench: 6 stop rule(s)
20:48:35 progress bench: 151/6720 (2%) battles, 11518/h, ETA 34 min, 0 failed, skips 0.0/battle (last 100), aa -0.12, cot +0.93, XR +2.77, P +1.32
```
