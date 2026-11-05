# Queue pc-eveimear-port: progress

Updated 2026-11-05 21:16:24 PC time (21:16 UTC), runner pid 45300.

- `prep` done, exit 0 in 0 min
- `bench` done, exit 0 in 29 min
- `gate` failed, exit 2 in 0 min
- `pr` skipped

### bench

**6720 of 6720 battles** (100%), 12 failed. Running 29 min, 14092 battles/h, about 0 min left (ends ~21:16 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0; engine disables 0.

| arm | battles | failed | share | vs control (pts) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 1344 | 0 | 81.07 | - | - | - | 0.0 |
| aa | 1344 | 0 | 81.12 | +0.05 (112 robots) | ±0.07 | -0.06 .. +0.15 | 0.0 |
| cot | 1344 | 12 | 83.34 | +1.90 (111 robots) | ±0.70 | +0.82 .. +2.98 | 0.0 |
| XR | 1344 | 0 | 83.04 | +1.95 (112 robots) | ±0.63 | +0.99 .. +2.91 | 0.0 |
| P | 1344 | 0 | 83.31 | +2.22 (112 robots) | ±0.76 | +1.05 .. +3.39 | 0.0 |
A/A: aa - c +0.05 pts over 112 robots; 1% band ±0.32 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 12 failed of 6720 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | ok | 0.0 a battle over the last 200 (first 200: 0.0) |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `aa after 20%` | halt | ok | aa - c +0.05 pts over 112 robots, stop band ±0.37 |
| `futility P below 0.3 after 20%` | finish | ok | P +2.22, best case +3.39 pts vs bar +0.30 |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

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
21:16:24 bench exit=0 in 1717 s
21:16:24 start gate
21:16:24 gate exit=2 in 0 s
21:16:24 skip pr (after gate, which has not finished exit=0)
21:16:24 ALLDONE
```
