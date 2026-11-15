# Queue pc-team-momentum: progress

Updated 2026-11-15 12:16:20 PC time (12:16 UTC), runner pid 55920.

- `tmprep` done, exit 0 in 3 min
- `tmpmo` done, exit 0 in 37 min
- `tmpmod` done, exit 0 in 38 min
- `tmpilot` done, exit 0 in 0 min
- `tmbb` done, exit 0 in 2.7 h
- `tmmo` running
- `tmmod` pending
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

**12 of 1104 battles** (1%), 0 failed. Running 4 min, 203 battles/h, about 5.4 h left (ends ~17:38 PC time). Last battle 1 min ago.
Skipped turns a battle: 14.4 overall, first 12 14.4, last 12 14.4.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 60` | halt | ok | 0 failed of 12 |
| `stall 30m` | halt | ok | last battle 1 min ago |
| `skips 60 over 200` | halt | waiting | 12 of 200 battles to read |

Stopping now would leave 1092 battles unrun (about 5.4 h); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
08:54:38 watching tmpmod: 3 stop rule(s)
09:18:08 progress tmpmod: 162/276 (59%) battles, 414/h, ETA 17 min, 0 failed, skips 6.1/battle (last 100)
09:33:08 tmpmod exit=0 in 2310 s
09:33:08 start tmpilot
09:33:09 tmpilot exit=0 in 0 s
09:33:09 start tmbb
09:33:09 watching tmbb: 3 stop rule(s)
09:48:20 progress tmbb: 66/1104 (6%) battles, 261/h, ETA 4.0 h, 0 failed, skips 13.9/battle (last 100)
10:18:32 progress tmbb: 269/1104 (24%) battles, 356/h, ETA 2.3 h, 0 failed, skips 8.2/battle (last 100)
10:48:44 progress tmbb: 496/1104 (45%) battles, 394/h, ETA 1.5 h, 0 failed, skips 7.2/battle (last 100)
11:18:57 progress tmbb: 691/1104 (63%) battles, 392/h, ETA 1.1 h, 0 failed, skips 3.6/battle (last 100)
11:49:09 progress tmbb: 887/1104 (80%) battles, 391/h, ETA 33 min, 0 failed, skips 3.0/battle (last 100)
12:12:48 tmbb exit=0 in 9579 s
12:12:48 start tmmo
12:12:48 watching tmmo: 3 stop rule(s)
```
