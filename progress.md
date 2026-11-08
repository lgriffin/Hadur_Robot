# Queue pc-hj-field: progress

Updated 2026-11-08 13:39:27 PC time (13:39 UTC), runner pid 60408.

- `prep` done, exit 0 in 2 min
- `pilot` done, exit 0 in 45 min
- `field` done, exit 0 in 0 min
- `gate` done, exit 0 in 0 min
- `pr` done, exit 0 in 0 min

### pilot

**2151 of 2151 battles** (100%), 0 failed. Running 45 min, 2628 battles/h, about 0 min left (ends ~13:39 PC time). Last battle 0 min ago.
Skipped turns a battle: 33.5 overall, first 100 34.5, last 100 31.2; engine disables 1.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 717 | 0 | 92.88 | - | - | - | 33.6 |
| aa | 717 | 0 | 92.74 | -0.03 (239 robots) | ±0.06 | -0.12 .. +0.06 | 33.5 |
| hj | 717 | 0 | 92.69 | -0.02 (239 robots) | ±0.06 | -0.11 .. +0.06 | 33.4 |

APS = mean difference over the robots read x 239 panel robots / 1217 pairings.
A/A: aa - c -0.14 pts over 239 robots; 1% band ±0.44 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 2151 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 90 over 200` | halt | ok | 31.5 a battle over the last 200 (first 200: 34.5) |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### field

**2151 of 10746 battles** (20%), 0 failed, 2151 read back from an earlier run. Running 0 min. Last battle 0 min ago.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 717 | 0 | 92.88 | - | - | - | 33.6 |
| aa | 717 | 0 | 92.74 | -0.14 (239 robots) | ±0.29 | -0.58 .. +0.31 | 33.5 |
| hj | 717 | 0 | 92.69 | -0.11 (239 robots) | ±0.28 | -0.54 .. +0.31 | 33.4 |

APS = mean difference over the robots read x 1194 panel robots / 1217 pairings.
A/A: aa - c -0.14 pts over 239 robots; 1% band ±0.44 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 2151 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 90 over 200` | halt | waiting | 0 of 200 battles to read |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 8595 battles unrun; every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
12:52:52 progress pushed to origin claude/pc-hj-field-progress (every 15 min)
12:54:30 prep exit=0 in 99 s
12:54:30 start pilot
12:54:30 watching pilot: 4 stop rule(s)
12:54:51 progress pilot: 10/2151 (0%) battles, 1698/h, ETA 1.3 h, 0 failed, skips 33.9/battle (last 100)
13:25:16 progress pilot: 1652/2151 (77%) battles, 3226/h, ETA 9 min, 0 failed, skips 31.5/battle (last 100), aa -0.02, hj +0.01
13:39:20 pilot exit=0 in 2690 s
13:39:20 start field
13:39:20 watching field: 4 stop rule(s)
13:39:21 field exit=0 in 0 s
13:39:21 start gate
13:39:21 gate exit=0 in 0 s
13:39:21 start pr
13:39:27 pr exit=0 in 5 s
13:39:27 ALLDONE
```
