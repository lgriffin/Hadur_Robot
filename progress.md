# Queue pc-portfolio: progress

Updated 2026-11-11 18:46:57 PC time (18:46 UTC), runner pid 55532.

- `prep` done, exit 0 in 2 min
- `pilot` done, exit 0 in 8 min
- `confirm` done, exit 0 in 0 min
- `gate` done, exit 0 in 0 min
- `pr` done, exit 0 in 0 min

### pilot

**540 of 540 battles** (100%), 0 failed. Running 8 min, 3973 battles/h, about 0 min left (ends ~18:46 PC time). Last battle 0 min ago.
Skipped turns a battle: 31.3 overall, first 100 31.1, last 100 29.9; engine disables 30.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 180 | 0 | 91.22 | - | - | - | 31.1 |
| aa | 180 | 0 | 91.23 | +0.00 (30 robots) | ±0.02 | -0.02 .. +0.02 | 30.7 |
| xr | 180 | 0 | 91.02 | -0.01 (30 robots) | ±0.02 | -0.04 .. +0.03 | 32.1 |

APS = mean difference over the robots read x 30 panel robots / 1217 pairings.
A/A: aa - c +0.01 pts over 30 robots; 1% band ±0.87 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 540 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 90 over 200` | halt | ok | 30.5 a battle over the last 200 (first 200: 31.8) |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### confirm

**540 of 2646 battles** (20%), 0 failed, 540 read back from an earlier run. Running 0 min. Last battle 0 min ago.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 180 | 0 | 91.22 | - | - | - | 31.1 |
| aa | 180 | 0 | 91.23 | +0.00 (30 robots) | ±0.08 | -0.11 .. +0.12 | 30.7 |
| xr | 180 | 0 | 91.02 | -0.02 (30 robots) | ±0.11 | -0.19 .. +0.14 | 32.1 |

APS = mean difference over the robots read x 147 panel robots / 1217 pairings.
A/A: aa - c +0.01 pts over 30 robots; 1% band ±0.87 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 540 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 90 over 200` | halt | waiting | 0 of 200 battles to read |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 2106 battles unrun; every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
18:37:02 start prep
18:37:05 progress pushed to origin claude/pc-portfolio-progress (every 15 min)
18:38:41 prep exit=0 in 99 s
18:38:41 start pilot
18:38:41 watching pilot: 4 stop rule(s)
18:39:04 progress pilot: 14/540 (3%) battles, 2266/h, ETA 14 min, 0 failed, skips 36.7/battle (last 100), aa +0.01
18:46:50 pilot exit=0 in 489 s
18:46:50 start confirm
18:46:50 watching confirm: 4 stop rule(s)
18:46:51 confirm exit=0 in 0 s
18:46:51 start gate
18:46:51 gate exit=0 in 0 s
18:46:51 start pr
18:46:57 pr exit=0 in 6 s
18:46:57 ALLDONE
```
