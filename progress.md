# Queue pc-melee-race: progress

Updated 2026-11-22 16:55:30 PC time (16:55 UTC), runner pid 88008.

- `mrprep` done, exit 0 in 3 min
- `mraa` done, exit 0 in 48 min
- `mrbb` done, exit 0 in 47 min
- `mren` running
- `mrez` pending
- `mrread` pending
- `mrpr` pending

### mraa

**460 of 460 battles** (100%), 0 failed. Running 48 min, 580 battles/h, about 0 min left (ends ~15:14 PC time). Last battle 0 min ago.
Skipped turns a battle: 35.5 overall, first 100 34.1, last 100 35.2.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 460 |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### mrbb

**460 of 460 battles** (100%), 0 failed. Running 47 min, 587 battles/h, about 0 min left (ends ~16:01 PC time). Last battle 0 min ago.
Skipped turns a battle: 35.5 overall, first 100 35.7, last 100 33.5.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 460 |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### mren

**259 of 460 battles** (56%), 0 failed. Running 54 min, 289 battles/h, about 42 min left (ends ~17:37 PC time). Last battle 22 min ago.
Skipped turns a battle: 36.8 overall, first 100 36.1, last 100 36.8.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 259 |
| `stall 30m` | halt | ok | last battle 22 min ago |

Stopping now would leave 201 battles unrun (about 42 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
14:24:27 progress pushed to origin claude/pc-melee-race-progress (every 15 min)
14:27:11 mrprep exit=0 in 166 s
14:27:11 start mraa
14:27:11 watching mraa: 2 stop rule(s)
14:27:26 progress mraa: 0/460 (0%) battles, 0 failed
14:57:38 progress mraa: 260/460 (57%) battles, 512/h, ETA 23 min, 0 failed, skips 36.9/battle (last 100)
15:14:45 mraa exit=0 in 2853 s
15:14:45 start mrbb
15:14:45 watching mrbb: 2 stop rule(s)
15:27:51 progress mrbb: 120/460 (26%) battles, 549/h, ETA 37 min, 0 failed, skips 35.6/battle (last 100)
15:58:04 progress mrbb: 420/460 (91%) battles, 582/h, ETA 4 min, 0 failed, skips 35.2/battle (last 100)
16:01:47 mrbb exit=0 in 2822 s
16:01:47 start mren
16:01:47 watching mren: 2 stop rule(s)
16:28:16 progress mren: 220/460 (48%) battles, 498/h, ETA 29 min, 0 failed, skips 37.8/battle (last 100)
```
