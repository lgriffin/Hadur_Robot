# Queue pc-melee-scal: progress

Updated 2026-10-31 03:17:10 PC time (03:17 UTC), runner pid 64324.

- `scprep` done, exit 0 in 6 min
- `scaa` done, exit 0 in 25 min
- `scbb` done, exit 0 in 24 min
- `scwm` done, exit 0 in 25 min
- `scxh` done, exit 0 in 24 min
- `scwq` done, exit 0 in 24 min
- `scbw` done, exit 0 in 24 min
- `scfv` running
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

**276 of 276 battles** (100%), 0 failed. Running 24 min, 702 battles/h, about 0 min left (ends ~02:39 PC time). Last battle 0 min ago.
Skipped turns a battle: 69.1 overall, first 100 53.0, last 100 73.1.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 276 |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### scbw

**276 of 276 battles** (100%), 0 failed. Running 24 min, 696 battles/h, about 0 min left (ends ~03:02 PC time). Last battle 0 min ago.
Skipped turns a battle: 78.6 overall, first 100 69.2, last 100 91.6.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 276 |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### scfv

**169 of 276 battles** (61%), 0 failed. Running 14 min, 708 battles/h, about 9 min left (ends ~03:26 PC time). Last battle 0 min ago.
Skipped turns a battle: 70.6 overall, first 100 62.5, last 100 72.2.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 169 |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 107 battles unrun (about 9 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
01:51:13 scwm exit=0 in 1507 s
01:51:13 start scxh
01:51:13 watching scxh: 2 stop rule(s)
02:08:36 progress scxh: 174/276 (63%) battles, 601/h, ETA 10 min, 0 failed, skips 63.3/battle (last 100)
02:15:28 scxh exit=0 in 1455 s
02:15:28 start scwq
02:15:28 watching scwq: 2 stop rule(s)
02:38:51 progress scwq: 270/276 (98%) battles, 693/h, ETA 1 min, 0 failed, skips 75.4/battle (last 100)
02:39:04 scwq exit=0 in 1415 s
02:39:04 start scbw
02:39:04 watching scbw: 2 stop rule(s)
03:02:51 scbw exit=0 in 1426 s
03:02:51 start scfv
03:02:51 watching scfv: 2 stop rule(s)
03:09:06 progress scfv: 79/276 (29%) battles, 758/h, ETA 16 min, 0 failed, skips 65.6/battle (last 100)
```
