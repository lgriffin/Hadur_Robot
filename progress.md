# Queue pc-power-cap: progress

Updated 2026-11-12 11:47:10 PC time (11:47 UTC), runner pid 53860.

- `prep` done, exit 0 in 2 min
- `confirm` running
- `gate` pending
- `pr` pending

### confirm

**197 of 252 battles** (78%), 0 failed. Running 29 min, 413 battles/h, about 8 min left (ends ~11:55 PC time). Last battle 0 min ago.
Skipped turns a battle: 8.9 overall, first 100 8.8, last 100 9.2; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 66 | 0 | 63.72 | - | - | - | 9.1 |
| aa | 67 | 0 | 63.36 | -0.00 (7 robots) | ±0.01 | -0.02 .. +0.01 | 8.9 |
| pk | 64 | 0 | 70.77 | +0.04 (7 robots) | ±0.01 | +0.02 .. +0.06 | 8.8 |

APS = mean difference over the robots read x 7 panel robots / 1217 pairings.
A/A: aa - c -0.36 pts over 7 robots; 1% band ±1.43 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 197 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | waiting | 197 of 200 battles to read |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 55 battles unrun (about 8 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
11:16:57 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant calibrated; work D:\code\Hadur_Robot\hadur-bench\work
11:16:57 start prep
11:16:59 progress pushed to origin claude/pc-power-cap-progress (every 15 min)
11:18:35 prep exit=0 in 98 s
11:18:35 start confirm
11:18:35 watching confirm: 4 stop rule(s)
11:18:58 progress confirm: 1/252 (0%) battles, 155/h, ETA 1.6 h, 0 failed, skips 12.0/battle (last 100)
```
