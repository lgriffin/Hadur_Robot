# Queue pc-field-prior: progress

Updated 2026-11-09 08:20:35 PC time (08:20 UTC), runner pid 17076.

- `prep` done, exit 0 in 2 min
- `pilot` running
- `screen` pending
- `gate` pending
- `pr` pending

### pilot

**1431 of 1434 battles** (100%), 0 failed. Running 28 min, 3055 battles/h, about 0 min left (ends ~08:20 PC time). Last battle 1 min ago.
Skipped turns a battle: 39.1 overall, first 100 41.6, last 100 37.1; engine disables 64.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 477 | 0 | 92.08 | - | - | - | 38.1 |
| aa | 477 | 0 | 92.08 | -0.00 (239 robots) | ±0.08 | -0.12 .. +0.11 | 39.9 |
| pf | 477 | 0 | 91.56 | -0.10 (239 robots) | ±0.07 | -0.21 .. +0.01 | 39.2 |

APS = mean difference over the robots read x 239 panel robots / 1217 pairings.
A/A: aa - c -0.00 pts over 239 robots; 1% band ±0.53 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 1431 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 90 over 200` | halt | ok | 39.5 a battle over the last 200 (first 200: 40.1) |
| `stall 30m` | halt | ok | last battle 1 min ago |

Stopping now would leave 3 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
07:50:14 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant calibrated; work D:\code\Hadur_Robot\hadur-bench\work
07:50:14 start prep
07:50:17 progress pushed to origin claude/pc-field-prior-progress (every 15 min)
07:52:29 prep exit=0 in 134 s
07:52:29 start pilot
07:52:29 watching pilot: 4 stop rule(s)
07:53:16 progress pilot: 40/1434 (3%) battles, 3101/h, ETA 27 min, 0 failed, skips 43.7/battle (last 100), aa -0.05, pf -0.02
```
