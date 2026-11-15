# Queue pc-team-momentum: progress

Updated 2026-11-15 16:48:10 PC time (16:48 UTC), runner pid 55920.

- `tmprep` done, exit 0 in 3 min
- `tmpmo` done, exit 0 in 37 min
- `tmpmod` done, exit 0 in 38 min
- `tmpilot` done, exit 0 in 0 min
- `tmbb` done, exit 0 in 2.7 h
- `tmmo` done, exit 0 in 2.7 h
- `tmmod` running
- `tmgate` pending
- `tmpr` pending

### tmpmo

**270 of 276 battles** (98%), 0 failed. Running 37 min, 436 battles/h, about 1 min left (ends ~08:55 PC time). Last battle 0 min ago.
Skipped turns a battle: 7.1 overall, first 100 11.9, last 100 4.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 60` | halt | ok | 0 failed of 270 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 60 over 200` | halt | ok | 4.9 a battle over the last 200 (first 200: 8.2) |

Stopping now would leave 6 battles unrun (about 1 min); every battle already fought is kept and a rerun resumes from it.

### tmpmod

**270 of 276 battles** (98%), 0 failed. Running 39 min, 421 battles/h, about 1 min left (ends ~09:34 PC time). Last battle 0 min ago.
Skipped turns a battle: 7.5 overall, first 100 12.7, last 100 4.2.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 60` | halt | ok | 0 failed of 270 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 60 over 200` | halt | ok | 5.0 a battle over the last 200 (first 200: 8.7) |

Stopping now would leave 6 battles unrun (about 1 min); every battle already fought is kept and a rerun resumes from it.

### tmbb

**1080 of 1104 battles** (98%), 0 failed. Running 2.7 h, 406 battles/h, about 4 min left (ends ~12:16 PC time). Last battle 0 min ago.
Skipped turns a battle: 6.8 overall, first 100 16.4, last 100 2.4.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 60` | halt | ok | 0 failed of 1080 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 60 over 200` | halt | ok | 4.3 a battle over the last 200 (first 200: 14.8) |

Stopping now would leave 24 battles unrun (about 4 min); every battle already fought is kept and a rerun resumes from it.

### tmmo

**1080 of 1104 battles** (98%), 0 failed. Running 2.7 h, 397 battles/h, about 4 min left (ends ~14:59 PC time). Last battle 0 min ago.
Skipped turns a battle: 6.9 overall, first 100 16.3, last 100 2.4.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 60` | halt | ok | 0 failed of 1080 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 60 over 200` | halt | ok | 4.2 a battle over the last 200 (first 200: 14.6) |

Stopping now would leave 24 battles unrun (about 4 min); every battle already fought is kept and a rerun resumes from it.

### tmmod

**696 of 1104 battles** (63%), 0 failed. Running 1.9 h, 373 battles/h, about 1.1 h left (ends ~17:53 PC time). Last battle 1 min ago.
Skipped turns a battle: 8.6 overall, first 100 16.1, last 100 3.3.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 60` | halt | ok | 0 failed of 696 |
| `stall 30m` | halt | ok | last battle 1 min ago |
| `skips 60 over 200` | halt | ok | 3.8 a battle over the last 200 (first 200: 14.8) |

Stopping now would leave 408 battles unrun (about 1.1 h); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
12:12:48 tmbb exit=0 in 9579 s
12:12:48 start tmmo
12:12:48 watching tmmo: 3 stop rule(s)
12:19:22 progress tmmo: 25/1104 (2%) battles, 229/h, ETA 4.7 h, 0 failed, skips 14.0/battle (last 100)
12:49:34 progress tmmo: 191/1104 (17%) battles, 312/h, ETA 2.9 h, 0 failed, skips 14.0/battle (last 100)
13:19:45 progress tmmo: 409/1104 (37%) battles, 367/h, ETA 1.9 h, 0 failed, skips 6.8/battle (last 100)
13:49:58 progress tmmo: 638/1104 (58%) battles, 394/h, ETA 1.2 h, 0 failed, skips 3.6/battle (last 100)
14:20:10 progress tmmo: 790/1104 (72%) battles, 372/h, ETA 51 min, 0 failed, skips 3.8/battle (last 100)
14:50:23 progress tmmo: 1024/1104 (93%) battles, 390/h, ETA 12 min, 0 failed, skips 4.8/battle (last 100)
14:56:08 tmmo exit=0 in 9799 s
14:56:08 start tmmod
14:56:08 watching tmmod: 3 stop rule(s)
15:20:34 progress tmmod: 132/1104 (12%) battles, 324/h, ETA 3.0 h, 0 failed, skips 17.0/battle (last 100)
15:50:47 progress tmmod: 329/1104 (30%) battles, 361/h, ETA 2.1 h, 0 failed, skips 8.4/battle (last 100)
16:20:58 progress tmmod: 546/1104 (49%) battles, 386/h, ETA 1.4 h, 0 failed, skips 6.1/battle (last 100)
```
