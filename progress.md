# Queue pc-melee-scal: progress

Updated 2026-10-31 02:16:40 PC time (02:16 UTC), runner pid 64324.

- `scprep` done, exit 0 in 6 min
- `scaa` done, exit 0 in 25 min
- `scbb` done, exit 0 in 24 min
- `scwm` done, exit 0 in 25 min
- `scxh` done, exit 0 in 24 min
- `scwq` running
- `scbw` pending
- `scfv` pending
- `scec` pending
- `scbs` pending
- `scread` pending
- `scpr` pending

### scaa

**276 of 276 battles** (100%), 0 failed. Running 25 min, 665 battles/h, about 0 min left (ends ~01:02 PC time). Last battle 0 min ago.
Skipped turns a battle: 57.2 overall, first 100 47.1, last 100 63.1.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 276 |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### scbb

**276 of 276 battles** (100%), 0 failed. Running 24 min, 694 battles/h, about 0 min left (ends ~01:26 PC time). Last battle 0 min ago.
Skipped turns a battle: 62.0 overall, first 100 47.3, last 100 81.7.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 276 |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### scwm

**276 of 276 battles** (100%), 0 failed. Running 25 min, 659 battles/h, about 0 min left (ends ~01:51 PC time). Last battle 0 min ago.
Skipped turns a battle: 110.4 overall, first 100 100.9, last 100 116.9.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 276 |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### scxh

**276 of 276 battles** (100%), 0 failed. Running 24 min, 683 battles/h, about 0 min left (ends ~02:15 PC time). Last battle 0 min ago.
Skipped turns a battle: 67.4 overall, first 100 62.2, last 100 72.9.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 276 |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### scwq

**11 of 276 battles** (4%), 0 failed. Running 1 min, 554 battles/h, about 29 min left (ends ~02:45 PC time). Last battle 0 min ago.
Skipped turns a battle: 32.3 overall, first 11 32.3, last 11 32.3.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 11 |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 265 battles unrun (about 29 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
01:02:13 scaa exit=0 in 1494 s
01:02:13 start scbb
01:02:13 watching scbb: 2 stop rule(s)
01:08:09 progress scbb: 72/276 (26%) battles, 728/h, ETA 17 min, 0 failed, skips 53.4/battle (last 100)
01:26:05 scbb exit=0 in 1432 s
01:26:05 start scwm
01:26:05 watching scwm: 2 stop rule(s)
01:38:23 progress scwm: 131/276 (47%) battles, 640/h, ETA 14 min, 0 failed, skips 113.2/battle (last 100)
01:51:13 scwm exit=0 in 1507 s
01:51:13 start scxh
01:51:13 watching scxh: 2 stop rule(s)
02:08:36 progress scxh: 174/276 (63%) battles, 601/h, ETA 10 min, 0 failed, skips 63.3/battle (last 100)
02:15:28 scxh exit=0 in 1455 s
02:15:28 start scwq
02:15:28 watching scwq: 2 stop rule(s)
```
