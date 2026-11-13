# Queue pc-shadow: progress

Updated 2026-11-13 21:13:00 PC time (21:13 UTC), runner pid 63312.

- `prep` done, exit 0 in 2 min
- `field` running
- `gate` pending
- `pr` pending

### field

**188 of 7158 battles** (3%), 0 failed. Running 13 min, 843 battles/h, about 8.3 h left (ends ~05:29 PC time). Last battle 0 min ago.
Skipped turns a battle: 60.0 overall, first 100 62.2, last 100 57.1; engine disables 108.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 63 | 0 | 94.08 | - | - | - | 56.7 |
| aa | 62 | 0 | 94.35 | +0.51 (61 robots) | ±0.73 | -0.61 .. +1.63 | 57.2 |
| kp | 63 | 0 | 95.01 | +0.64 (60 robots) | ±0.60 | -0.28 .. +1.55 | 66.0 |

APS = mean difference over the robots read x 1193 panel robots / 1217 pairings.
A/A: aa - c +0.52 pts over 61 robots; 1% band ±1.49 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 188 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | waiting | 188 of 200 battles to read |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `aa after 20%` | halt | waiting | checks from 20% of the battles (now 3%) |

Stopping now would leave 6970 battles unrun (about 8.3 h); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
20:57:51 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant calibrated; work D:\code\Hadur_Robot\hadur-bench\work
20:57:51 start prep
20:57:54 progress pushed to origin claude/pc-shadow-progress (every 15 min)
20:59:37 prep exit=0 in 105 s
20:59:37 start field
20:59:37 watching field: 5 stop rule(s)
20:59:52 progress field: 0/7158 (0%) battles, 0 failed
```
