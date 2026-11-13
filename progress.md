# Queue pc-lines: progress

Updated 2026-11-13 15:32:35 PC time (15:32 UTC), runner pid 68408.

- `prep` done, exit 0 in 2 min
- `confirm` running
- `gate` pending
- `pr` pending

### confirm

**651 of 696 battles** (94%), 0 failed. Running 13 min, 2928 battles/h, about 1 min left (ends ~15:33 PC time). Last battle 0 min ago.
Skipped turns a battle: 25.5 overall, first 100 27.3, last 100 26.3; engine disables 1.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 218 | 0 | 71.30 | - | - | - | 26.5 |
| aa | 218 | 0 | 71.79 | +0.01 (29 robots) | ±0.02 | -0.02 .. +0.05 | 26.1 |
| pk | 215 | 0 | 49.55 | -0.52 (29 robots) | ±0.21 | -0.84 .. -0.21 | 24.0 |

APS = mean difference over the robots read x 29 panel robots / 1217 pairings.
A/A: aa - c +0.49 pts over 29 robots; 1% band ±0.79 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 651 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | ok | 26.0 a battle over the last 200 (first 200: 26.6) |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `aa after 20%` | halt | ok | aa - c +0.49 pts over 29 robots, stop band ±1.40 (observed spread) |

Stopping now would leave 45 battles unrun (about 1 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
15:17:24 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant calibrated; work D:\code\Hadur_Robot\hadur-bench\work
15:17:24 start prep
15:17:28 progress pushed to origin claude/pc-lines-progress (every 15 min)
15:19:14 prep exit=0 in 110 s
15:19:14 start confirm
15:19:14 watching confirm: 5 stop rule(s)
15:19:25 progress confirm: 0/696 (0%) battles, 0 failed
```
