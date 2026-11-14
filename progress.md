# Queue pc-shadow: progress

Updated 2026-11-14 07:16:02 PC time (07:16 UTC), runner pid 63172.

- `prep` done, exit 0 in 2 min
- `field` running
- `gate` pending
- `pr` pending

### field

**6614 of 7158 battles** (92%), 0 failed, 206 read back from an earlier run. Running 9.6 h, 700 battles/h, about 47 min left (ends ~08:02 PC time). Last battle 0 min ago.
Skipped turns a battle: 62.8 overall, first 100 62.0, last 100 55.5; engine disables 3862.

| arm | battles | failed | share | vs control (APS) | 95% | stop-rule bound (z 3) | skips |
|---|---:|---:|---:|---:|---:|---:|---:|
| c | 2207 | 0 | 92.90 | - | - | - | 63.3 |
| aa | 2203 | 0 | 92.98 | +0.08 (1187 robots) | ±0.16 | -0.16 .. +0.33 | 61.1 |
| kp | 2204 | 0 | 93.21 | +0.27 (1187 robots) | ±0.14 | +0.05 .. +0.49 | 63.7 |

APS = mean difference over the robots read x 1193 panel robots / 1217 pairings.
A/A: aa - c +0.09 pts over 1187 robots; 1% band ±0.25 (inside).

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 6614 |
| `dead 8` | halt | ok | every arm scoring |
| `skips 80 over 200` | halt | ok | 59.8 a battle over the last 200 (first 200: 61.2) |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `aa after 20%` | halt | ok | aa - c +0.09 pts over 1187 robots, stop band ±0.29 |

Stopping now would leave 544 battles unrun (about 47 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
00:09:51 progress field: 2101/7158 (29%) battles, 690/h, ETA 7.3 h, 0 failed, skips 62.5/battle (last 100), aa +0.10, kp +0.12
00:40:02 progress field: 2436/7158 (34%) battles, 666/h, ETA 7.1 h, 0 failed, skips 63.2/battle (last 100), aa +0.08, kp +0.12
01:10:18 progress field: 2746/7158 (38%) battles, 620/h, ETA 7.1 h, 0 failed, skips 52.4/battle (last 100), aa +0.03, kp +0.14
01:40:34 progress field: 3052/7158 (43%) battles, 610/h, ETA 6.7 h, 0 failed, skips 60.0/battle (last 100), aa +0.05, kp +0.20
02:10:54 progress field: 3351/7158 (47%) battles, 584/h, ETA 6.5 h, 0 failed, skips 76.2/battle (last 100), aa +0.10, kp +0.20
02:41:10 progress field: 3678/7158 (51%) battles, 650/h, ETA 5.4 h, 0 failed, skips 78.5/battle (last 100), aa +0.12, kp +0.15
03:11:45 progress field: 3992/7158 (56%) battles, 612/h, ETA 5.2 h, 0 failed, skips 53.0/battle (last 100), aa +0.10, kp +0.10
03:41:40 progress field: 4305/7158 (60%) battles, 626/h, ETA 4.6 h, 0 failed, skips 60.0/battle (last 100), aa +0.06, kp +0.14
04:11:51 progress field: 4621/7158 (65%) battles, 632/h, ETA 4.0 h, 0 failed, skips 70.0/battle (last 100), aa +0.05, kp +0.16
04:42:05 progress field: 4935/7158 (69%) battles, 624/h, ETA 3.6 h, 0 failed, skips 73.5/battle (last 100), aa +0.12, kp +0.23
05:12:13 progress field: 5253/7158 (73%) battles, 630/h, ETA 3.0 h, 0 failed, skips 63.4/battle (last 100), aa +0.12, kp +0.24
05:42:28 progress field: 5570/7158 (78%) battles, 634/h, ETA 2.5 h, 0 failed, skips 70.0/battle (last 100), aa +0.11, kp +0.24
06:12:34 progress field: 5892/7158 (82%) battles, 642/h, ETA 2.0 h, 0 failed, skips 58.5/battle (last 100), aa +0.09, kp +0.28
06:42:53 progress field: 6224/7158 (87%) battles, 662/h, ETA 1.4 h, 0 failed, skips 61.6/battle (last 100), aa +0.07, kp +0.30
07:12:59 progress field: 6579/7158 (92%) battles, 710/h, ETA 49 min, 0 failed, skips 58.0/battle (last 100), aa +0.09, kp +0.29
```
