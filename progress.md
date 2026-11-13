# Queue pc-class-1: progress

Updated 2026-11-13 18:12:09 PC time (18:12 UTC), runner pid 49188.

- `prep` done, exit 0 in 4 min
- `shield` done, exit 0 in 5 min
- `cap` running
- `gun` pending
- `gate` pending
- `pr` pending

### shield

**504 of 504 battles** (100%), 0 failed. Running 5 min, 5877 battles/h, about 0 min left (ends ~18:06 PC time). Last battle 0 min ago.
Skipped turns a battle: 28.9 overall, first 100 30.3, last 100 27.3; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 168 | 0 | 91.09 | - | - | - | 28.3 |
| aa | 168 | 0 | 91.34 | +0.00 (21 robots) | ±0.01 | -0.01 .. +0.02 | 28.8 |
| mtzl | 168 | 0 | 90.99 | -0.00 (21 robots) | ±0.05 | -0.08 .. +0.07 | 29.5 |

APS = mean difference over the robots read x 21 panel robots / 1217 pairings.
A/A: aa - c +0.25 pts over 21 robots; 1% band ±0.90 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 504 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | ok | 28.0 a battle over the last 200 (first 200: 29.4) |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `aa after 20%` | halt | ok | aa - c +0.25 pts over 21 robots, stop band ±1.05 |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### cap

**288 of 416 battles** (69%), 0 failed. Running 6 min, 2927 battles/h, about 3 min left (ends ~18:14 PC time). Last battle 0 min ago.
Skipped turns a battle: 30.0 overall, first 100 30.9, last 100 29.3; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 70 | 0 | 88.00 | - | - | - | 27.3 |
| aa | 75 | 0 | 87.70 | -0.00 (13 robots) | ±0.01 | -0.02 .. +0.01 | 27.5 |
| pk | 74 | 0 | 75.22 | -0.13 (13 robots) | ±0.06 | -0.23 .. -0.04 | 35.7 |
| p5 | 69 | 0 | 84.64 | -0.06 (12 robots) | ±0.04 | -0.13 .. -0.00 | 29.5 |

APS = mean difference over the robots read x 13 panel robots / 1217 pairings.
A/A: aa - c -0.30 pts over 13 robots; 1% band ±1.37 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 288 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | ok | 29.6 a battle over the last 200 (first 200: 30.4) |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `aa after 20%` | halt | ok | aa - c -0.30 pts over 13 robots, stop band ±1.60 |

Stopping now would leave 128 battles unrun (about 3 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
17:57:01 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant calibrated; work D:\code\Hadur_Robot\hadur-bench\work
17:57:01 start prep
17:57:04 progress pushed to origin claude/pc-class-1-progress (every 15 min)
18:01:06 prep exit=0 in 245 s
18:01:06 start shield
18:01:06 watching shield: 5 stop rule(s)
18:02:04 progress shield: 94/504 (19%) battles, 5878/h, ETA 4 min, 0 failed, skips 30.3/battle (last 100), aa -0.01, mtzl -0.02
18:06:15 shield exit=0 in 308 s
18:06:15 start cap
18:06:15 watching cap: 5 stop rule(s)
```
