# Queue pc-tailor-stack: progress

Updated 2026-11-08 19:09:55 PC time (19:09 UTC), runner pid 26028.

- `prep` done, exit 0 in 2 min
- `pilot` done, exit 0 in 18 min
- `screen` running
- `pick` pending
- `prep2` pending
- `confirm` pending
- `gate` pending
- `pr` pending

### pilot

**552 of 552 battles** (100%), 0 failed. Running 18 min, 1835 battles/h, about 0 min left (ends ~18:59 PC time). Last battle 0 min ago.
Skipped turns a battle: 26.7 overall, first 100 28.0, last 100 27.7; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 276 | 0 | 86.51 | - | - | - | 26.5 |
| ln | 276 | 0 | 86.91 | +0.02 (69 robots) | ±0.03 | -0.03 .. +0.07 | 27.0 |

APS = mean difference over the robots read x 69 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 552 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 90 over 200` | halt | ok | 27.2 a battle over the last 200 (first 200: 26.9) |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### screen

**1114 of 1736 battles** (64%), 0 failed, 552 read back from an earlier run. Running 11 min, 3150 battles/h, about 12 min left (ends ~19:21 PC time). Last battle 0 min ago.
Skipped turns a battle: 32.5 overall, first 100 35.2, last 100 29.9; engine disables 12.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 560 | 0 | 88.83 | - | - | - | 29.3 |
| ln | 554 | 0 | 88.99 | +0.02 (217 robots) | ±0.07 | -0.09 .. +0.13 | 30.0 |

APS = mean difference over the robots read x 217 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 1114 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 90 over 200` | halt | ok | 31.2 a battle over the last 200 (first 200: 34.3) |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 622 battles unrun (about 12 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
18:39:33 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant calibrated; work D:\code\Hadur_Robot\hadur-bench\work
18:39:33 start prep
18:39:35 progress pushed to origin claude/pc-tailor-stack-progress (every 15 min)
18:41:10 prep exit=0 in 97 s
18:41:10 start pilot
18:41:10 watching pilot: 4 stop rule(s)
18:41:34 progress pilot: 12/552 (2%) battles, 1781/h, ETA 18 min, 0 failed, skips 32.2/battle (last 100), ln +0.00
18:59:13 pilot exit=0 in 1082 s
18:59:13 start screen
18:59:13 watching screen: 4 stop rule(s)
```
