# Queue pc-race-power: progress

Updated 2026-11-07 23:31:46 PC time (23:31 UTC), runner pid 58972.

- `prep` done, exit 0 in 2 min
- `pilot` done, exit 0 in 6 min
- `screen` running
- `pick` pending
- `prep2` pending
- `confirm` pending
- `gate` pending
- `pr` pending

### pilot

**48 of 48 battles** (100%), 0 failed. Running 6 min, 514 battles/h, about 0 min left (ends ~17:35 PC time). Last battle 0 min ago.
Skipped turns a battle: 42.1 overall, first 48 42.1, last 48 42.1; engine disables 0.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 16 | 0 | 56.39 | - | - | - | 38.8 |
| aa | 16 | 0 | 56.99 | +0.00 (4 robots) | ±0.01 | -0.02 .. +0.02 | 42.8 |
| rp | 16 | 0 | 67.23 | +0.03 (4 robots) | ±0.02 | +0.01 .. +0.06 | 44.8 |

APS = mean difference over the robots read x 4 panel robots / 1217 pairings.
A/A: aa - c +0.60 pts over 4 robots; 1% band ±2.92 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 48 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 90 over 200` | halt | waiting | 48 of 200 battles to read |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### screen

**5801 of 7164 battles** (81%), 0 failed, 48 read back from an earlier run. Running 5.9 h, 890 battles/h, about 1.5 h left (ends ~01:03 PC time). Last battle 0 min ago.
Skipped turns a battle: 59.4 overall, first 100 50.8, last 100 68.3; engine disables 3034.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 1934 | 0 | 92.89 | - | - | - | 60.2 |
| aa | 1933 | 0 | 92.76 | -0.13 (1144 robots) | ±0.17 | -0.39 .. +0.13 | 58.3 |
| rp | 1934 | 0 | 92.92 | +0.09 (1144 robots) | ±0.18 | -0.18 .. +0.36 | 59.3 |

APS = mean difference over the robots read x 1194 panel robots / 1217 pairings.
A/A: aa - c -0.13 pts over 1144 robots; 1% band ±0.27 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 5801 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 90 over 200` | halt | ok | 63.2 a battle over the last 200 (first 200: 54.3) |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 1363 battles unrun (about 1.5 h); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
17:30:04 progress pilot: 0/48 (0%) battles, 0 failed
17:35:25 pilot exit=0 in 336 s
17:35:25 start screen
17:35:25 watching screen: 4 stop rule(s)
18:00:23 progress screen: 552/7164 (8%) battles, 1213/h, ETA 5.5 h, 0 failed, skips 71.2/battle (last 100), aa -0.19, rp +0.48
18:30:37 progress screen: 1107/7164 (15%) battles, 1102/h, ETA 5.5 h, 0 failed, skips 59.7/battle (last 100), aa -0.47, rp +0.33
19:00:54 progress screen: 1655/7164 (23%) battles, 1090/h, ETA 5.1 h, 0 failed, skips 59.2/battle (last 100), aa -0.45, rp +0.24
19:31:12 progress screen: 2164/7164 (30%) battles, 1012/h, ETA 4.9 h, 0 failed, skips 52.1/battle (last 100), aa -0.29, rp +0.11
20:01:30 progress screen: 2656/7164 (37%) battles, 968/h, ETA 4.7 h, 0 failed, skips 55.3/battle (last 100), aa -0.25, rp +0.15
20:31:49 progress screen: 3095/7164 (43%) battles, 870/h, ETA 4.7 h, 0 failed, skips 62.9/battle (last 100), aa -0.26, rp +0.11
21:02:08 progress screen: 3572/7164 (50%) battles, 932/h, ETA 3.9 h, 0 failed, skips 53.6/battle (last 100), aa -0.20, rp +0.07
21:32:26 progress screen: 4038/7164 (56%) battles, 912/h, ETA 3.4 h, 0 failed, skips 59.6/battle (last 100), aa -0.18, rp +0.06
22:02:50 progress screen: 4469/7164 (62%) battles, 860/h, ETA 3.1 h, 0 failed, skips 61.4/battle (last 100), aa -0.13, rp +0.10
22:33:08 progress screen: 4948/7164 (69%) battles, 942/h, ETA 2.4 h, 0 failed, skips 56.8/battle (last 100), aa -0.13, rp +0.05
23:03:29 progress screen: 5380/7164 (75%) battles, 854/h, ETA 2.1 h, 0 failed, skips 62.7/battle (last 100), aa -0.11, rp +0.09
```
