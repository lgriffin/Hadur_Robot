# Queue pc-tailor-stack: progress

Updated 2026-11-08 18:54:45 PC time (18:54 UTC), runner pid 26028.

- `prep` done, exit 0 in 2 min
- `pilot` running
- `screen` pending
- `pick` pending
- `prep2` pending
- `confirm` pending
- `gate` pending
- `pr` pending

### pilot

**547 of 552 battles** (99%), 0 failed. Running 14 min, 2415 battles/h, about 0 min left (ends ~18:54 PC time). Last battle 0 min ago.
Skipped turns a battle: 26.5 overall, first 100 28.0, last 100 26.5; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 274 | 0 | 86.54 | - | - | - | 26.2 |
| ln | 273 | 0 | 87.00 | +0.03 (69 robots) | ±0.03 | -0.02 .. +0.08 | 26.7 |

APS = mean difference over the robots read x 69 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 547 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 90 over 200` | halt | ok | 26.6 a battle over the last 200 (first 200: 26.9) |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 5 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
18:39:33 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant calibrated; work D:\code\Hadur_Robot\hadur-bench\work
18:39:33 start prep
18:39:35 progress pushed to origin claude/pc-tailor-stack-progress (every 15 min)
18:41:10 prep exit=0 in 97 s
18:41:10 start pilot
18:41:10 watching pilot: 4 stop rule(s)
18:41:34 progress pilot: 12/552 (2%) battles, 1781/h, ETA 18 min, 0 failed, skips 32.2/battle (last 100), ln +0.00
```
