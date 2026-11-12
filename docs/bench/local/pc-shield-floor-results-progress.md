# Queue pc-shield-floor: progress

Updated 2026-11-12 10:23:31 PC time (10:23 UTC), runner pid 58512.

- `prep` done, exit 0 in 2 min
- `confirm` running
- `gate` pending
- `pr` pending

### confirm

**35 of 48 battles** (73%), 0 failed. Running 2 min, 1226 battles/h, about 1 min left (ends ~10:24 PC time). Last battle 0 min ago.
Skipped turns a battle: 9.9 overall, first 35 9.9, last 35 9.9; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 0 | 0 | - | - | - | - | - |
| aa | 11 | 0 | 60.76 | - | - | - | 11.1 |
| mz | 12 | 0 | 61.15 | +0.00 (1 robots) | - | - | 6.3 |
| sf | 12 | 0 | 98.56 | +0.03 (1 robots) | - | - | 12.3 |

APS = mean difference over the robots read x 1 panel robots / 1217 pairings.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 35 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | waiting | 35 of 200 battles to read |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 13 battles unrun (about 1 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
10:19:29 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant calibrated; work D:\code\Hadur_Robot\hadur-bench\work
10:19:29 start prep
10:19:31 progress pushed to origin claude/pc-shield-floor-progress (every 15 min)
10:21:48 prep exit=0 in 139 s
10:21:48 start confirm
10:21:48 watching confirm: 4 stop rule(s)
10:22:31 progress confirm: 9/48 (19%) battles, 766/h, ETA 3 min, 0 failed, skips 12.0/battle (last 100), mz +0.00, sf +0.03
```
