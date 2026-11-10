# Queue pc-shield-rescreen: progress

Updated 2026-11-10 19:05:43 PC time (19:05 UTC), runner pid 56740.

- `prep` done, exit 0 in 2 min
- `confirm` running
- `gate` pending
- `pr` pending

### confirm

**24 of 72 battles** (33%), 0 failed. Running 0 min, 3177 battles/h, about 1 min left (ends ~19:06 PC time). Last battle 0 min ago.
Skipped turns a battle: 32.7 overall, first 24 32.7, last 24 32.7; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 7 | 0 | 83.05 | - | - | - | 33.6 |
| aa | 10 | 0 | 84.66 | +0.00 (2 robots) | ±0.00 | -0.00 .. +0.01 | 32.1 |
| mz | 7 | 0 | 89.38 | +0.01 (2 robots) | ±0.00 | +0.00 .. +0.01 | 32.6 |

APS = mean difference over the robots read x 2 panel robots / 1217 pairings.
A/A: aa - c +1.61 pts over 2 robots; 1% band ±4.07 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 24 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | waiting | 24 of 200 battles to read |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 48 battles unrun (about 1 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
19:03:42 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant calibrated; work D:\code\Hadur_Robot\hadur-bench\work
19:03:42 start prep
19:03:44 progress pushed to origin claude/pc-shield-rescreen-progress (every 15 min)
19:05:16 prep exit=0 in 93 s
19:05:16 start confirm
19:05:16 watching confirm: 4 stop rule(s)
19:05:43 progress confirm: 24/72 (33%) battles, 3177/h, ETA 1 min, 0 failed, skips 32.7/battle (last 100), aa +0.00, mz +0.01
```
