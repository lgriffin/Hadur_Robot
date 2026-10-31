# Queue pc-melee-dia: progress

Updated 2026-10-31 15:46:36 PC time (15:46 UTC), runner pid 63404.

- `diprep` done, exit 0 in 2 min
- `diaa` done, exit 0 in 25 min
- `dibb` done, exit 0 in 25 min
- `didm` done, exit 0 in 26 min
- `dila` running
- `diread` pending
- `dipr` pending

### diaa

**276 of 276 battles** (100%), 0 failed. Running 25 min, 668 battles/h, about 0 min left (ends ~14:30 PC time). Last battle 0 min ago.
Skipped turns a battle: 66.6 overall, first 100 58.8, last 100 74.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 276 |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### dibb

**276 of 276 battles** (100%), 0 failed. Running 25 min, 666 battles/h, about 0 min left (ends ~14:55 PC time). Last battle 0 min ago.
Skipped turns a battle: 77.6 overall, first 100 85.2, last 100 67.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 276 |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### didm

**276 of 276 battles** (100%), 0 failed. Running 26 min, 647 battles/h, about 0 min left (ends ~15:21 PC time). Last battle 0 min ago.
Skipped turns a battle: 71.7 overall, first 100 63.9, last 100 81.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 276 |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### dila

**270 of 276 battles** (98%), 0 failed. Running 25 min, 644 battles/h, about 1 min left (ends ~15:47 PC time). Last battle 0 min ago.
Skipped turns a battle: 68.8 overall, first 100 52.8, last 100 84.2.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 270 |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 6 battles unrun (about 1 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
14:06:11 start diaa
14:06:11 watching diaa: 2 stop rule(s)
14:06:47 progress diaa: 0/276 (0%) battles, 0 failed
14:30:59 diaa exit=0 in 1487 s
14:30:59 start dibb
14:30:59 watching dibb: 2 stop rule(s)
14:37:03 progress dibb: 60/276 (22%) battles, 595/h, ETA 22 min, 0 failed, skips 94.4/battle (last 100)
14:55:51 dibb exit=0 in 1491 s
14:55:51 start didm
14:55:51 watching didm: 2 stop rule(s)
15:07:18 progress didm: 120/276 (43%) battles, 629/h, ETA 15 min, 0 failed, skips 70.7/battle (last 100)
15:21:27 didm exit=0 in 1536 s
15:21:27 start dila
15:21:27 watching dila: 2 stop rule(s)
15:37:32 progress dila: 154/276 (56%) battles, 575/h, ETA 13 min, 0 failed, skips 60.5/battle (last 100)
```
