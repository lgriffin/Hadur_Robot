# Queue pc-shadow: progress

Updated 2026-11-14 08:06:00 PC time (08:06 UTC), runner pid 63172.

- `prep` done, exit 0 in 2 min
- `field` done, exit 0 in 10.5 h
- `gate` done, exit 0 in 0 min
- `pr` done, exit 0 in 0 min

### field

**7158 of 7158 battles** (100%), 0 failed, 206 read back from an earlier run. Running 10.5 h, 652 battles/h, about 0 min left (ends ~08:05 PC time). Last battle 0 min ago.
Skipped turns a battle: 62.5 overall, first 100 62.0, last 100 61.5; engine disables 4186.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 2386 | 0 | 92.91 | - | - | - | 63.2 |
| aa | 2386 | 0 | 92.95 | +0.04 (1193 robots) | ±0.16 | -0.20 .. +0.27 | 60.9 |
| kp | 2386 | 0 | 93.20 | +0.26 (1193 robots) | ±0.13 | +0.06 .. +0.47 | 63.4 |

APS = mean difference over the robots read x 1193 panel robots / 1217 pairings.
A/A: aa - c +0.04 pts over 1193 robots; 1% band ±0.24 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 7158 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 80 over 200` | halt | ok | 62.8 a battle over the last 200 (first 200: 61.2) |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `aa after 20%` | halt | ok | aa - c +0.04 pts over 1193 robots, stop band ±0.28 |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
03:41:40 progress field: 4305/7158 (60%) battles, 626/h, ETA 4.6 h, 0 failed, skips 60.0/battle (last 100), aa +0.06, kp +0.14
04:11:51 progress field: 4621/7158 (65%) battles, 632/h, ETA 4.0 h, 0 failed, skips 70.0/battle (last 100), aa +0.05, kp +0.16
04:42:05 progress field: 4935/7158 (69%) battles, 624/h, ETA 3.6 h, 0 failed, skips 73.5/battle (last 100), aa +0.12, kp +0.23
05:12:13 progress field: 5253/7158 (73%) battles, 630/h, ETA 3.0 h, 0 failed, skips 63.4/battle (last 100), aa +0.12, kp +0.24
05:42:28 progress field: 5570/7158 (78%) battles, 634/h, ETA 2.5 h, 0 failed, skips 70.0/battle (last 100), aa +0.11, kp +0.24
06:12:34 progress field: 5892/7158 (82%) battles, 642/h, ETA 2.0 h, 0 failed, skips 58.5/battle (last 100), aa +0.09, kp +0.28
06:42:53 progress field: 6224/7158 (87%) battles, 662/h, ETA 1.4 h, 0 failed, skips 61.6/battle (last 100), aa +0.07, kp +0.30
07:12:59 progress field: 6579/7158 (92%) battles, 710/h, ETA 49 min, 0 failed, skips 58.0/battle (last 100), aa +0.09, kp +0.29
07:43:09 progress field: 6911/7158 (97%) battles, 660/h, ETA 22 min, 0 failed, skips 58.3/battle (last 100), aa +0.03, kp +0.28
08:05:53 field exit=0 in 37721 s
08:05:53 start gate
08:05:54 gate exit=0 in 0 s
08:05:54 start pr
08:06:00 pr exit=0 in 5 s
08:06:00 ALLDONE
```
