# Queue pc-shield-still: progress

Updated 2026-10-31 18:59:37 PC time (18:59 UTC), runner pid 47492.

- `prep` done, exit 0 in 2 min
- `still` done, exit 0 in 24 min
- `add` done, exit 0 in 7 min
- `gate` done, exit 0 in 0 min
- `pr` done, exit 0 in 0 min

### still

**1638 of 1638 battles** (100%), 0 failed, 562 read back from an earlier run. Running 24 min, 2653 battles/h, about 0 min left (ends ~18:52 PC time). Last battle 0 min ago.
Skipped turns a battle: 20.3 overall, first 100 15.7, last 100 17.3; engine disables 97.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 546 | 0 | 94.43 | - | - | - | 20.9 |
| aa | 546 | 0 | 94.47 | +0.01 (273 robots) | ±0.12 | -0.18 .. +0.20 | 20.3 |
| sz | 546 | 0 | 94.86 | +0.09 (273 robots) | ±0.12 | -0.10 .. +0.28 | 18.4 |

APS = mean difference over the robots read x 273 panel robots / 1217 pairings.
A/A: aa - c +0.04 pts over 273 robots; 1% band ±0.50 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 1638 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 40 over 200` | halt | ok | 17.2 a battle over the last 200 (first 200: 19.7) |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `aa after 20%` | halt | ok | aa - c +0.04 pts over 273 robots, stop band ±0.58 |
| `futility sz below 0.05 after 30%` | finish | ok | sz +0.09, best case +0.28 APS vs bar +0.05 |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### add

**576 of 576 battles** (100%), 0 failed. Running 7 min, 4679 battles/h, about 0 min left (ends ~18:59 PC time). Last battle 0 min ago.
Skipped turns a battle: 12.9 overall, first 100 12.9, last 100 12.3; engine disables 2.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 192 | 0 | 89.65 | - | - | - | 13.0 |
| aa | 192 | 0 | 89.61 | -0.00 (64 robots) | ±0.03 | -0.04 .. +0.04 | 12.4 |
| szmt | 192 | 0 | 89.83 | +0.01 (64 robots) | ±0.08 | -0.10 .. +0.13 | 13.1 |

APS = mean difference over the robots read x 64 panel robots / 1217 pairings.
A/A: aa - c -0.05 pts over 64 robots; 1% band ±0.84 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 576 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 40 over 200` | halt | ok | 12.3 a battle over the last 200 (first 200: 13.8) |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `aa after 20%` | halt | ok | aa - c -0.05 pts over 64 robots, stop band ±0.98 |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
18:27:47 skip prep (already exit=0)
18:27:47 start still
18:27:47 watching still: 6 stop rule(s), shown only
18:27:49 progress pushed to origin claude/pc-shield-still-progress (every 15 min)
18:28:47 progress still: 592/1638 (36%) battles, 1784/h, ETA 35 min, 0 failed, skips 17.2/battle (last 100), aa +0.18, sz +0.07
18:52:07 still exit=0 in 1460 s
18:52:07 start add
18:52:07 watching add: 5 stop rule(s), shown only
18:59:06 progress add: 571/576 (99%) battles, 4900/h, ETA 0 min, 0 failed, skips 12.5/battle (last 100), aa -0.00, szmt +0.01
18:59:30 add exit=0 in 443 s
18:59:30 start gate
18:59:31 gate exit=0 in 1 s
18:59:31 start pr
18:59:37 pr exit=0 in 6 s
18:59:37 ALLDONE
```
