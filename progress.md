# Queue pc-shelf: progress

Updated 2026-11-04 09:24:26 PC time (09:24 UTC), runner pid 41756.

- `prep` done, exit 0 in 6 min
- `pilot-s` done, exit 0 in 5 min
- `screen-s` done, exit 0 in 19 min
- `pilot-u` failed, exit 1 in 31 min
- `screen-u` skipped
- `pick` skipped
- `build` skipped
- `confirm` skipped
- `gate` skipped
- `pr` skipped

### screen-s

**1155 of 1155 battles** (100%), 0 failed, 231 read back from an earlier run. Running 19 min, 2939 battles/h, about 0 min left (ends ~08:53 PC time). Last battle 0 min ago.
Skipped turns a battle: 29.0 overall, first 100 31.0, last 100 26.7; engine disables 1.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 165 | 0 | 88.40 | - | - | - | 29.4 |
| aa | 165 | 0 | 87.44 | -0.03 (33 robots) | ±0.04 | -0.09 .. +0.04 | 29.3 |
| md | 165 | 0 | 79.51 | -0.23 (33 robots) | ±0.07 | -0.33 .. -0.13 | 29.3 |
| zl | 165 | 0 | 89.04 | +0.03 (33 robots) | ±0.04 | -0.03 .. +0.09 | 28.5 |
| x0 | 165 | 0 | 88.38 | +0.01 (33 robots) | ±0.04 | -0.06 .. +0.08 | 28.8 |
| x4 | 165 | 0 | 87.78 | -0.00 (33 robots) | ±0.04 | -0.07 .. +0.06 | 28.0 |
| mv | 165 | 0 | 87.55 | -0.01 (33 robots) | ±0.08 | -0.13 .. +0.11 | 30.0 |

APS = mean difference over the robots read x 33 panel robots / 1217 pairings.
A/A: aa - c -0.96 pts over 33 robots; 1% band ±0.91 (OUTSIDE: comparisons void).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 1155 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | ok | 27.4 a battle over the last 200 (first 200: 30.3) |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `aa after 20%` | halt | ok | aa - c -0.96 pts over 33 robots, stop band ±2.49 (observed spread) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### pilot-u

**1062 of 1062 battles** (100%), 12 failed. Running 31 min, 2028 battles/h, about 0 min left (ends ~09:24 PC time). Last battle 0 min ago.
Skipped turns a battle: 36.7 overall, first 100 42.9, last 100 34.3; engine disables 19.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 177 | 2 | 76.77 | - | - | - | 39.4 |
| aa | 177 | 2 | 76.89 | +0.02 (175 robots) | ±0.12 | -0.16 .. +0.20 | 38.8 |
| mt | 177 | 2 | 73.03 | -0.55 (175 robots) | ±0.13 | -0.75 .. -0.35 | 41.3 |
| wl | 177 | 2 | 33.63 | -6.28 (175 robots) | ±0.57 | -7.15 .. -5.42 | 22.1 |
| hl | 177 | 2 | 77.07 | +0.03 (175 robots) | ±0.09 | -0.11 .. +0.18 | 38.4 |
| gl | 177 | 2 | 77.23 | +0.06 (175 robots) | ±0.11 | -0.12 .. +0.23 | 40.4 |

APS = mean difference over the robots read x 177 panel robots / 1217 pairings.
A/A: aa - c +0.12 pts over 175 robots; 1% band ±0.88 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 12 failed of 1062 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 60 over 200` | halt | ok | 34.5 a battle over the last 200 (first 200: 42.3) |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
08:34:27 progress pushed to origin claude/pc-shelf-progress (every 15 min)
08:35:27 progress screen-s: 275/1155 (24%) battles, 2618/h, ETA 20 min, 0 failed, skips 33.3/battle (last 100), aa +0.08, md -0.25, zl +0.06, x0 +0.03, x4 -0.01, mv +0.01
08:53:17 screen-s exit=0 in 1131 s
08:53:17 start pilot-u
08:53:17 watching pilot-u: 4 stop rule(s)
09:05:48 progress pilot-u: 483/1062 (45%) battles, 2317/h, ETA 15 min, 0 failed, skips 34.6/battle (last 100), aa -0.02, mt -0.64, wl -5.85, hl -0.00, gl -0.06
09:24:24 pilot-u exit=1 in 1867 s
09:24:26 alert issue: https://github.com/lgriffin/Hadur_Robot/issues/630
09:24:26 skip screen-u (after pilot-u, which has not finished exit=0)
09:24:26 skip pick (after screen-u, which has not finished exit=0)
09:24:26 skip build (after pick, which has not finished exit=0)
09:24:26 skip confirm (after build, which has not finished exit=0)
09:24:26 skip gate (after confirm, which has not finished exit=0)
09:24:26 skip pr (after gate, which has not finished exit=0)
09:24:26 ALLDONE
```
