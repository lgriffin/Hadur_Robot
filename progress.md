# Queue pc-power-cap: progress

Updated 2026-11-12 11:32:04 PC time (11:32 UTC), runner pid 53860.

- `prep` done, exit 0 in 2 min
- `confirm` running
- `gate` pending
- `pr` pending

### confirm

**99 of 252 battles** (39%), 0 failed. Running 13 min, 441 battles/h, about 21 min left (ends ~11:52 PC time). Last battle 0 min ago.
Skipped turns a battle: 8.7 overall, first 99 8.7, last 99 8.7; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 35 | 0 | 63.77 | - | - | - | 8.7 |
| aa | 33 | 0 | 63.90 | +0.00 (7 robots) | ±0.02 | -0.03 .. +0.03 | 8.9 |
| pk | 31 | 0 | 69.61 | +0.05 (6 robots) | ±0.02 | +0.02 .. +0.07 | 8.5 |

APS = mean difference over the robots read x 7 panel robots / 1217 pairings.
A/A: aa - c +0.14 pts over 7 robots; 1% band ±2.00 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 99 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | waiting | 99 of 200 battles to read |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 153 battles unrun (about 21 min); every battle already fought is kept and a rerun resumes from it.

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
