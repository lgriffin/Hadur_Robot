# Queue pc-1to1: progress

Updated 2026-10-29 03:59:24 PC time (03:59 UTC), runner pid 61632.

- `prep` done, exit 0 in 4 min
- `shield` done, exit 0 in 54 min
- `learn` running
- `gate` pending
- `pr` pending

### shield

**3720 of 3720 battles** (100%), 0 failed. Running 54 min, 4060 battles/h, about 0 min left (ends ~03:56 PC time). Last battle 0 min ago.
Skipped turns a battle: 13.1 overall, first 100 13.3, last 100 12.7; engine disables 7.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 744 | 0 | 90.38 | - | - | - | 12.9 |
| aa | 744 | 0 | 90.63 | +0.03 (124 robots) | ±0.03 | -0.02 .. +0.07 | 12.9 |
| s4 | 744 | 0 | 86.77 | -0.38 (124 robots) | ±0.12 | -0.56 .. -0.20 | 12.8 |
| sv | 744 | 0 | 88.45 | -0.21 (124 robots) | ±0.14 | -0.42 .. -0.00 | 13.1 |
| sy | 744 | 0 | 90.31 | -0.02 (124 robots) | ±0.04 | -0.08 .. +0.04 | 13.5 |

APS = mean difference over the robots read x 124 panel robots / 1217 pairings.
A/A: aa - c +0.25 pts over 124 robots; 1% band ±0.43 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 3720 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 40 over 200` | halt | ok | 12.8 a battle over the last 200 (first 200: 12.9) |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `aa after 20%` | halt | ok | aa - c +0.25 pts over 124 robots, stop band ±0.50 |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### learn

**241 of 3090 battles** (8%), 0 failed. Running 3 min, 5518 battles/h, about 31 min left (ends ~04:30 PC time). Last battle 0 min ago.
Skipped turns a battle: 15.3 overall, first 100 16.1, last 100 15.3; engine disables 4.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 48 | 0 | 92.53 | - | - | - | 16.5 |
| aa | 50 | 0 | 92.36 | -0.01 (39 robots) | ±0.07 | -0.12 .. +0.10 | 17.7 |
| wp | 47 | 0 | 76.12 | -1.42 (37 robots) | ±0.62 | -2.37 .. -0.46 | 11.7 |
| ws | 48 | 0 | 76.59 | -1.40 (37 robots) | ±0.63 | -2.36 .. -0.44 | 13.3 |
| sp | 48 | 0 | 92.77 | +0.02 (38 robots) | ±0.09 | -0.11 .. +0.15 | 17.0 |

APS = mean difference over the robots read x 103 panel robots / 1217 pairings.
A/A: aa - c -0.14 pts over 39 robots; 1% band ±1.69 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 241 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 40 over 200` | halt | ok | 15.3 a battle over the last 200 (first 200: 15.6) |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `aa after 20%` | halt | waiting | checks from 20% of the battles (now 8%) |

Stopping now would leave 2849 battles unrun (about 31 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
02:59:04 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1488498; work D:\code\Hadur_Robot\hadur-bench\work
02:59:04 start prep
02:59:07 progress pushed to origin claude/pc-1to1-progress (every 15 min)
03:02:50 prep exit=0 in 225 s
03:02:50 start shield
03:02:50 watching shield: 5 stop rule(s)
03:03:06 progress shield: 8/3720 (0%) battles, 1782/h, ETA 2.1 h, 0 failed, skips 15.8/battle (last 100)
03:33:19 progress shield: 2198/3720 (59%) battles, 4350/h, ETA 21 min, 0 failed, skips 13.5/battle (last 100), aa -0.01, s4 -0.36, sv -0.18, sy -0.01
03:56:46 shield exit=0 in 3235 s
03:56:46 start learn
03:56:46 watching learn: 5 stop rule(s)
```
