# Queue pc-shield-floor: progress

Updated 2026-11-12 10:24:11 PC time (10:24 UTC), runner pid 58512.

- `prep` done, exit 0 in 2 min
- `confirm` done, exit 0 in 2 min
- `gate` done, exit 0 in 0 min
- `pr` done, exit 0 in 0 min

### confirm

**48 of 48 battles** (100%), 0 failed. Running 2 min, 1270 battles/h, about 0 min left (ends ~10:24 PC time). Last battle 0 min ago.
Skipped turns a battle: 9.5 overall, first 48 9.5, last 48 9.5; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 12 | 0 | 61.85 | - | - | - | 8.8 |
| aa | 12 | 0 | 59.91 | -0.00 (1 robots) | - | - | 10.5 |
| mz | 12 | 0 | 61.15 | +0.00 (1 robots) | - | - | 6.3 |
| sf | 12 | 0 | 98.56 | +0.03 (1 robots) | - | - | 12.3 |

APS = mean difference over the robots read x 1 panel robots / 1217 pairings.
A/A: aa - c -1.94 pts over 1 robots; 1% band ±3.37 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 48 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | waiting | 48 of 200 battles to read |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
10:19:29 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant calibrated; work D:\code\Hadur_Robot\hadur-bench\work
10:19:29 start prep
10:19:31 progress pushed to origin claude/pc-shield-floor-progress (every 15 min)
10:21:48 prep exit=0 in 139 s
10:21:48 start confirm
10:21:48 watching confirm: 4 stop rule(s)
10:22:31 progress confirm: 9/48 (19%) battles, 766/h, ETA 3 min, 0 failed, skips 12.0/battle (last 100), mz +0.00, sf +0.03
10:24:04 confirm exit=0 in 136 s
10:24:04 start gate
10:24:05 gate exit=0 in 0 s
10:24:05 start pr
10:24:11 pr exit=0 in 6 s
10:24:11 ALLDONE
```
