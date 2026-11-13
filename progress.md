# Queue pc-class-1: progress

Updated 2026-11-13 18:27:20 PC time (18:27 UTC), runner pid 49188.

- `prep` done, exit 0 in 4 min
- `shield` done, exit 0 in 5 min
- `cap` done, exit 0 in 13 min
- `gun` running
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

**416 of 416 battles** (100%), 0 failed. Running 13 min, 1966 battles/h, about 0 min left (ends ~18:18 PC time). Last battle 0 min ago.
Skipped turns a battle: 30.6 overall, first 100 30.9, last 100 33.2; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 104 | 0 | 87.90 | - | - | - | 27.5 |
| aa | 104 | 0 | 87.66 | -0.00 (13 robots) | ±0.01 | -0.02 .. +0.01 | 28.4 |
| pk | 104 | 0 | 75.49 | -0.13 (13 robots) | ±0.06 | -0.22 .. -0.04 | 36.0 |
| p5 | 104 | 0 | 81.73 | -0.06 (13 robots) | ±0.04 | -0.12 .. -0.01 | 30.4 |

APS = mean difference over the robots read x 13 panel robots / 1217 pairings.
A/A: aa - c -0.24 pts over 13 robots; 1% band ±1.14 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 416 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | ok | 30.9 a battle over the last 200 (first 200: 30.4) |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `aa after 20%` | halt | ok | aa - c -0.24 pts over 13 robots, stop band ±1.33 |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### gun

**397 of 960 battles** (41%), 0 failed. Running 8 min, 2844 battles/h, about 12 min left (ends ~18:39 PC time). Last battle 0 min ago.
Skipped turns a battle: 29.0 overall, first 100 30.4, last 100 30.0; engine disables 3.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 101 | 0 | 79.40 | - | - | - | 29.2 |
| aa | 99 | 0 | 78.76 | -0.01 (28 robots) | ±0.03 | -0.06 .. +0.05 | 27.1 |
| gl | 100 | 0 | 79.75 | +0.03 (28 robots) | ±0.04 | -0.03 .. +0.08 | 31.6 |
| x5 | 97 | 0 | 79.38 | +0.02 (28 robots) | ±0.03 | -0.03 .. +0.07 | 28.2 |

APS = mean difference over the robots read x 30 panel robots / 1217 pairings.
A/A: aa - c -0.23 pts over 28 robots; 1% band ±1.17 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 397 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | ok | 28.4 a battle over the last 200 (first 200: 29.6) |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `aa after 20%` | halt | ok | aa - c -0.23 pts over 28 robots, stop band ±2.07 (observed spread) |

Stopping now would leave 563 battles unrun (about 12 min); every battle already fought is kept and a rerun resumes from it.

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
18:18:57 cap exit=0 in 761 s
18:18:57 start gun
18:18:57 watching gun: 5 stop rule(s)
```
