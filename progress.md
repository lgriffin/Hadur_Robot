# Queue pc-class-2: progress

Updated 2026-11-13 20:00:21 PC time (20:00 UTC), runner pid 67760.

- `prep` done, exit 0 in 3 min
- `wall` done, exit 0 in 3 min
- `lock` done, exit 0 in 1 min
- `gate` done, exit 0 in 0 min
- `pr` done, exit 0 in 0 min

### wall

**108 of 108 battles** (100%), 0 failed. Running 3 min, 2203 battles/h, about 0 min left (ends ~19:58 PC time). Last battle 0 min ago.
Skipped turns a battle: 26.7 overall, first 100 27.2, last 100 26.1; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 36 | 0 | 68.16 | - | - | - | 27.5 |
| aa | 36 | 0 | 70.05 | +0.00 (3 robots) | ±0.01 | -0.01 .. +0.02 | 25.4 |
| wh | 36 | 0 | 69.27 | +0.00 (3 robots) | ±0.00 | -0.00 .. +0.00 | 27.1 |

APS = mean difference over the robots read x 3 panel robots / 1217 pairings.
A/A: aa - c +1.88 pts over 3 robots; 1% band ±1.95 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 108 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | waiting | 108 of 200 battles to read |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `aa after 20%` | halt | waiting | fewer than 10 robots read in both |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### lock

**96 of 96 battles** (100%), 0 failed. Running 1 min, 4381 battles/h, about 0 min left (ends ~20:00 PC time). Last battle 0 min ago.
Skipped turns a battle: 31.0 overall, first 96 31.0, last 96 31.0; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 24 | 0 | 90.59 | - | - | - | 29.6 |
| aa | 24 | 0 | 92.17 | +0.00 (2 robots) | ±0.00 | +0.00 .. +0.00 | 33.4 |
| mtzl | 24 | 0 | 94.33 | +0.00 (2 robots) | ±0.01 | -0.01 .. +0.02 | 30.4 |
| x5 | 24 | 0 | 93.06 | +0.00 (2 robots) | ±0.00 | -0.00 .. +0.01 | 30.6 |

APS = mean difference over the robots read x 2 panel robots / 1217 pairings.
A/A: aa - c +1.58 pts over 2 robots; 1% band ±2.38 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 96 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | waiting | 96 of 200 battles to read |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `aa after 20%` | halt | waiting | fewer than 10 robots read in both |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
19:53:12 start prep
19:53:15 progress pushed to origin claude/pc-class-2-progress (every 15 min)
19:55:57 prep exit=0 in 165 s
19:55:57 start wall
19:55:57 watching wall: 5 stop rule(s)
19:56:13 progress wall: 0/108 (0%) battles, 0 failed
19:58:54 wall exit=0 in 176 s
19:58:54 start lock
19:58:54 watching lock: 5 stop rule(s)
20:00:13 lock exit=0 in 79 s
20:00:13 start gate
20:00:14 gate exit=0 in 0 s
20:00:14 start pr
20:00:21 pr exit=0 in 6 s
20:00:21 ALLDONE
```
