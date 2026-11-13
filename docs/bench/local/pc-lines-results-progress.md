# Queue pc-lines: progress

Updated 2026-11-13 15:34:36 PC time (15:34 UTC), runner pid 68408.

- `prep` done, exit 0 in 2 min
- `confirm` running
- `gate` pending
- `pr` pending

### confirm

**694 of 696 battles** (100%), 0 failed. Running 15 min, 2710 battles/h, about 0 min left (ends ~15:34 PC time). Last battle 0 min ago.
Skipped turns a battle: 25.5 overall, first 100 27.3, last 100 26.1; engine disables 1.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 230 | 0 | 71.29 | - | - | - | 26.4 |
| aa | 232 | 0 | 71.79 | +0.01 (29 robots) | ±0.02 | -0.02 .. +0.05 | 26.1 |
| pk | 232 | 0 | 49.54 | -0.52 (29 robots) | ±0.21 | -0.84 .. -0.21 | 23.9 |

APS = mean difference over the robots read x 29 panel robots / 1217 pairings.
A/A: aa - c +0.50 pts over 29 robots; 1% band ±0.77 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 694 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | ok | 26.0 a battle over the last 200 (first 200: 26.6) |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `aa after 20%` | halt | ok | aa - c +0.50 pts over 29 robots, stop band ±1.45 (observed spread) |

Stopping now would leave 2 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

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
