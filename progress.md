# Queue pc-shield-audit: progress

Updated 2026-11-08 04:10:19 PC time (04:10 UTC), runner pid 56632.

- `prep` done, exit 0 in 1 min
- `confirm` done, exit 0 in 2 min
- `gate` done, exit 0 in 0 min
- `pr` done, exit 0 in 0 min

### confirm

**72 of 72 battles** (100%), 0 failed. Running 2 min, 2414 battles/h, about 0 min left (ends ~04:10 PC time). Last battle 0 min ago.
Skipped turns a battle: 26.8 overall, first 72 26.8, last 72 26.8; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 24 | 0 | 73.81 | - | - | - | 26.8 |
| aa | 24 | 0 | 75.52 | +0.00 (2 robots) | ±0.00 | -0.00 .. +0.01 | 26.5 |
| sa | 24 | 0 | 76.69 | +0.00 (2 robots) | ±0.02 | -0.02 .. +0.03 | 27.0 |

APS = mean difference over the robots read x 2 panel robots / 1217 pairings.
A/A: aa - c +1.71 pts over 2 robots; 1% band ±2.38 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 72 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | waiting | 72 of 200 battles to read |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
04:06:55 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant calibrated; work D:\code\Hadur_Robot\hadur-bench\work
04:06:55 start prep
04:06:57 progress pushed to origin claude/pc-shield-audit-progress (every 15 min)
04:08:25 prep exit=0 in 89 s
04:08:25 start confirm
04:08:25 watching confirm: 4 stop rule(s)
04:08:56 progress confirm: 12/72 (17%) battles, 1379/h, ETA 3 min, 0 failed, skips 31.8/battle (last 100), aa +0.01, sa +0.00
04:10:12 confirm exit=0 in 107 s
04:10:12 start gate
04:10:13 gate exit=0 in 0 s
04:10:13 start pr
04:10:19 pr exit=0 in 5 s
04:10:19 ALLDONE
```
