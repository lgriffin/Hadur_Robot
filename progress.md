# Queue pc-tailor-near: progress

Updated 2026-11-08 10:32:14 PC time (10:32 UTC), runner pid 19552.

- `prep` done, exit 0 in 2 min
- `pilot` running
- `screen` pending
- `pick` pending
- `prep2` pending
- `confirm` pending
- `gate` pending
- `pr` pending

### pilot

**782 of 792 battles** (99%), 0 failed. Running 13 min, 3488 battles/h, about 0 min left (ends ~10:32 PC time). Last battle 0 min ago.
Skipped turns a battle: 28.4 overall, first 100 32.2, last 100 27.3; engine disables 1.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 389 | 0 | 89.93 | - | - | - | 28.2 |
| ln | 393 | 0 | 90.27 | +0.03 (99 robots) | ±0.04 | -0.04 .. +0.09 | 28.6 |

APS = mean difference over the robots read x 99 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 782 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 90 over 200` | halt | ok | 27.7 a battle over the last 200 (first 200: 30.7) |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 10 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
10:17:03 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant calibrated; work D:\code\Hadur_Robot\hadur-bench\work
10:17:03 start prep
10:17:05 progress pushed to origin claude/pc-tailor-near-progress (every 15 min)
10:18:46 prep exit=0 in 103 s
10:18:46 start pilot
10:18:46 watching pilot: 4 stop rule(s)
10:19:04 progress pilot: 11/792 (1%) battles, 2306/h, ETA 20 min, 0 failed, skips 45.0/battle (last 100)
```
