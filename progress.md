# Queue pc-shield-rescreen: progress

Updated 2026-11-10 19:06:31 PC time (19:06 UTC), runner pid 56740.

- `prep` done, exit 0 in 2 min
- `confirm` done, exit 0 in 1 min
- `gate` done, exit 0 in 0 min
- `pr` done, exit 0 in 0 min

### confirm

**72 of 72 battles** (100%), 0 failed. Running 1 min, 3779 battles/h, about 0 min left (ends ~19:06 PC time). Last battle 0 min ago.
Skipped turns a battle: 29.4 overall, first 72 29.4, last 72 29.4; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 24 | 0 | 83.37 | - | - | - | 29.6 |
| aa | 24 | 0 | 84.21 | +0.00 (2 robots) | ±0.00 | -0.00 .. +0.01 | 29.2 |
| mz | 24 | 0 | 90.80 | +0.01 (2 robots) | ±0.01 | -0.01 .. +0.03 | 29.4 |

APS = mean difference over the robots read x 2 panel robots / 1217 pairings.
A/A: aa - c +0.84 pts over 2 robots; 1% band ±2.38 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 72 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | waiting | 72 of 200 battles to read |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
19:03:42 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant calibrated; work D:\code\Hadur_Robot\hadur-bench\work
19:03:42 start prep
19:03:44 progress pushed to origin claude/pc-shield-rescreen-progress (every 15 min)
19:05:16 prep exit=0 in 93 s
19:05:16 start confirm
19:05:16 watching confirm: 4 stop rule(s)
19:05:43 progress confirm: 24/72 (33%) battles, 3177/h, ETA 1 min, 0 failed, skips 32.7/battle (last 100), aa +0.00, mz +0.01
19:06:25 confirm exit=0 in 68 s
19:06:25 start gate
19:06:25 gate exit=0 in 0 s
19:06:25 start pr
19:06:31 pr exit=0 in 6 s
19:06:31 ALLDONE
```
