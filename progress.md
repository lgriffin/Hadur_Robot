# Queue pc-field-prior: progress

Updated 2026-11-09 08:27:50 PC time (08:27 UTC), runner pid 17076.

- `prep` done, exit 0 in 2 min
- `pilot` failed, exit 2 in 35 min
- `screen` pending
- `gate` pending
- `pr` pending

### pilot

**1434 of 1434 battles** (100%), 0 failed. Running 35 min, 2314 battles/h, about 0 min left (ends ~08:27 PC time). Last battle 0 min ago.
Skipped turns a battle: 39.0 overall, first 100 41.6, last 100 36.6; engine disables 64.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 478 | 0 | 92.01 | - | - | - | 38.1 |
| aa | 478 | 0 | 92.02 | +0.00 (239 robots) | ±0.07 | -0.11 .. +0.12 | 39.8 |
| pf | 478 | 0 | 91.51 | -0.10 (239 robots) | ±0.07 | -0.21 .. +0.01 | 39.1 |

APS = mean difference over the robots read x 239 panel robots / 1217 pairings.
A/A: aa - c +0.01 pts over 239 robots; 1% band ±0.53 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 1434 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 90 over 200` | halt | ok | 39.3 a battle over the last 200 (first 200: 40.1) |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
07:50:14 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant calibrated; work D:\code\Hadur_Robot\hadur-bench\work
07:50:14 start prep
07:50:17 progress pushed to origin claude/pc-field-prior-progress (every 15 min)
07:52:29 prep exit=0 in 134 s
07:52:29 start pilot
07:52:29 watching pilot: 4 stop rule(s)
07:53:16 progress pilot: 40/1434 (3%) battles, 3101/h, ETA 27 min, 0 failed, skips 43.7/battle (last 100), aa -0.05, pf -0.02
08:23:36 progress pilot: 1432/1434 (100%) battles, 2742/h, ETA 0 min, 0 failed, skips 37.1/battle (last 100), aa +0.01, pf -0.09
08:27:50 pilot exit=2 in 2121 s
```
