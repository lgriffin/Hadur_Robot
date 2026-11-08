# Queue pc-shield-audit: progress

Updated 2026-11-08 04:09:57 PC time (04:09 UTC), runner pid 56632.

- `prep` done, exit 0 in 1 min
- `confirm` running
- `gate` pending
- `pr` pending

### confirm

**60 of 72 battles** (83%), 0 failed. Running 2 min, 2350 battles/h, about 0 min left (ends ~04:10 PC time). Last battle 0 min ago.
Skipped turns a battle: 27.4 overall, first 60 27.4, last 60 27.4; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 20 | 0 | 73.41 | - | - | - | 27.6 |
| aa | 21 | 0 | 75.90 | +0.00 (2 robots) | ±0.00 | +0.00 .. +0.01 | 26.7 |
| sa | 19 | 0 | 76.98 | +0.00 (2 robots) | ±0.01 | -0.02 .. +0.02 | 28.1 |

APS = mean difference over the robots read x 2 panel robots / 1217 pairings.
A/A: aa - c +2.49 pts over 2 robots; 1% band ±2.58 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 60 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | waiting | 60 of 200 battles to read |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 12 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
04:06:55 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant calibrated; work D:\code\Hadur_Robot\hadur-bench\work
04:06:55 start prep
04:06:57 progress pushed to origin claude/pc-shield-audit-progress (every 15 min)
04:08:25 prep exit=0 in 89 s
04:08:25 start confirm
04:08:25 watching confirm: 4 stop rule(s)
04:08:56 progress confirm: 12/72 (17%) battles, 1379/h, ETA 3 min, 0 failed, skips 31.8/battle (last 100), aa +0.01, sa +0.00
```
