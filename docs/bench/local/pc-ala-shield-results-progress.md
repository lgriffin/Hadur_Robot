# Queue pc-ala-shield: progress

Updated 2026-11-10 15:38:26 PC time (15:38 UTC), runner pid 31356.

- `prep` done, exit 0 in 2 min
- `confirm` running
- `gate` pending
- `pr` pending

### confirm

**18 of 48 battles** (38%), 0 failed. Running 1 min, 1608 battles/h, about 1 min left (ends ~15:39 PC time). Last battle 0 min ago.
Skipped turns a battle: 28.7 overall, first 18 28.7, last 18 28.7; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 5 | 0 | 86.03 | - | - | - | 27.2 |
| aa | 7 | 0 | 83.29 | -0.00 (1 robots) | - | - | 27.7 |
| mt | 4 | 0 | 85.80 | +0.00 (1 robots) | - | - | 33.2 |
| mz | 2 | 0 | 91.88 | +0.01 (1 robots) | - | - | 27.0 |

APS = mean difference over the robots read x 1 panel robots / 1217 pairings.
A/A: aa - c -2.74 pts over 1 robots; 1% band ±4.83 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 18 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | waiting | 18 of 200 battles to read |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 30 battles unrun (about 1 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
15:35:24 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant calibrated; work D:\code\Hadur_Robot\hadur-bench\work
15:35:24 start prep
15:35:26 progress pushed to origin claude/pc-ala-shield-progress (every 15 min)
15:37:45 prep exit=0 in 141 s
15:37:45 start confirm
15:37:45 watching confirm: 4 stop rule(s)
15:38:26 progress confirm: 18/48 (38%) battles, 1608/h, ETA 1 min, 0 failed, skips 28.7/battle (last 100), aa -0.00, mt +0.00, mz +0.01
```
