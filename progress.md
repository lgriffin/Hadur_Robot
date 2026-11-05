# Queue pc-melee-floor: progress

Updated 2026-11-05 02:50:06 PC time (02:50 UTC), runner pid 37368.

- `mlprep` done, exit 0 in 3 min
- `mlpilot` done, exit 0 in 1.3 h
- `mlcheck` done, exit 0 in 0 min
- `mlaa` done, exit 0 in 51 min
- `mlbb` done, exit 0 in 47 min
- `mlz4` done, exit 0 in 44 min
- `mlz5` running
- `mlread` pending
- `mlpr` pending

### mlpilot

**184 of 184 battles** (100%), 0 failed. Running 1.3 h, 140 battles/h, about 0 min left (ends ~23:55 PC time). Last battle 0 min ago.
Skipped turns a battle: 25.3 overall, first 100 23.8, last 100 26.9.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 184 |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### mlaa

**276 of 276 battles** (100%), 0 failed. Running 51 min, 325 battles/h, about 0 min left (ends ~00:46 PC time). Last battle 0 min ago.
Skipped turns a battle: 32.1 overall, first 100 32.8, last 100 31.7.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 276 |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### mlbb

**276 of 276 battles** (100%), 0 failed. Running 47 min, 354 battles/h, about 0 min left (ends ~01:32 PC time). Last battle 0 min ago.
Skipped turns a battle: 28.9 overall, first 100 33.1, last 100 25.1.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 276 |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### mlz4

**276 of 276 battles** (100%), 0 failed. Running 44 min, 379 battles/h, about 0 min left (ends ~02:16 PC time). Last battle 0 min ago.
Skipped turns a battle: 26.2 overall, first 100 26.4, last 100 25.1.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 276 |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### mlz5

**204 of 276 battles** (74%), 0 failed. Running 33 min, 366 battles/h, about 12 min left (ends ~03:01 PC time). Last battle 0 min ago.
Skipped turns a battle: 26.7 overall, first 100 26.4, last 100 26.6.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 204 |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 72 battles unrun (about 12 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
00:07:50 progress mlaa: 66/276 (24%) battles, 315/h, ETA 40 min, 0 failed, skips 33.1/battle (last 100)
00:38:05 progress mlaa: 228/276 (83%) battles, 319/h, ETA 9 min, 0 failed, skips 31.8/battle (last 100)
00:46:10 mlaa exit=0 in 3054 s
00:46:10 start mlbb
00:46:10 watching mlbb: 2 stop rule(s)
01:08:20 progress mlbb: 120/276 (43%) battles, 325/h, ETA 29 min, 0 failed, skips 33.9/battle (last 100)
01:32:58 mlbb exit=0 in 2808 s
01:32:58 start mlz4
01:32:58 watching mlz4: 2 stop rule(s)
01:38:33 progress mlz4: 30/276 (11%) battles, 322/h, ETA 46 min, 0 failed, skips 22.0/battle (last 100)
02:08:47 progress mlz4: 222/276 (80%) battles, 372/h, ETA 9 min, 0 failed, skips 26.6/battle (last 100)
02:16:38 mlz4 exit=0 in 2620 s
02:16:38 start mlz5
02:16:38 watching mlz5: 2 stop rule(s)
02:39:01 progress mlz5: 132/276 (48%) battles, 354/h, ETA 24 min, 0 failed, skips 27.2/battle (last 100)
```
