# Queue pc-mimic9: progress

Updated 2026-11-03 10:53:10 PC time (10:53 UTC), runner pid 50852.

- `prep` done, exit 0 in 1 min
- `confirm` done, exit 0 in 20 min
- `gate` done, exit 0 in 0 min
- `pr` done, exit 0 in 0 min

### confirm

**324 of 324 battles** (100%), 0 failed. Running 20 min, 981 battles/h, about 0 min left (ends ~10:53 PC time). Last battle 0 min ago.
Skipped turns a battle: 28.0 overall, first 100 26.4, last 100 28.8; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 108 | 0 | 59.03 | - | - | - | 26.4 |
| aa | 108 | 0 | 58.76 | -0.00 (9 robots) | ±0.01 | -0.02 .. +0.02 | 27.5 |
| mq | 108 | 0 | 63.44 | +0.03 (9 robots) | ±0.02 | +0.01 .. +0.06 | 30.1 |

APS = mean difference over the robots read x 9 panel robots / 1217 pairings.
A/A: aa - c -0.27 pts over 9 robots; 1% band ±1.12 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 324 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | ok | 28.3 a battle over the last 200 (first 200: 27.6) |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
10:31:59 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant calibrated; work D:\code\Hadur_Robot\hadur-bench\work
10:31:59 start prep
10:32:01 progress pushed to origin claude/pc-mimic9-progress (every 15 min)
10:33:14 prep exit=0 in 75 s
10:33:14 start confirm
10:33:14 watching confirm: 4 stop rule(s)
10:34:01 progress confirm: 19/324 (6%) battles, 1474/h, ETA 12 min, 0 failed, skips 28.6/battle (last 100), aa +0.00, mq -0.00
10:53:04 confirm exit=0 in 1189 s
10:53:04 start gate
10:53:04 gate exit=0 in 0 s
10:53:04 start pr
10:53:10 pr exit=0 in 5 s
10:53:10 ALLDONE
```
