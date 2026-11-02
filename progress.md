# Queue pc-team-angles: progress

Updated 2026-11-02 15:08:46 PC time (15:08 UTC), runner pid 44560.

- `anprep` done, exit 0 in 3 min
- `anbb` done, exit 0 in 21 min
- `anhv` done, exit 0 in 46 min
- `anwy` done, exit 0 in 47 min
- `anmd` running
- `anglob` pending
- `anpick` pending
- `angate` pending
- `angbb` pending
- `ansum` pending
- `anpr` pending

### anbb

**736 of 720 battles** (102%), 0 failed. Running 21 min, 2096 battles/h, about -0 min left (ends ~13:28 PC time). Last battle 0 min ago.
Skipped turns a battle: 13.7 overall, first 100 18.5, last 100 8.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 736 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 8.0 a battle over the last 100 (first 100: 18.5) |

Stopping now would leave -16 battles unrun (about -0 min); every battle already fought is kept and a rerun resumes from it.

### anhv

**736 of 720 battles** (102%), 0 failed. Running 46 min, 963 battles/h, about -1 min left (ends ~14:13 PC time). Last battle 0 min ago.
Skipped turns a battle: 10.4 overall, first 100 11.8, last 100 8.2.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 736 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 8.2 a battle over the last 100 (first 100: 11.8) |

Stopping now would leave -16 battles unrun (about -1 min); every battle already fought is kept and a rerun resumes from it.

### anwy

**736 of 720 battles** (102%), 0 failed. Running 47 min, 944 battles/h, about -1 min left (ends ~15:00 PC time). Last battle 0 min ago.
Skipped turns a battle: 10.0 overall, first 100 12.1, last 100 8.1.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 736 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 8.1 a battle over the last 100 (first 100: 12.1) |

Stopping now would leave -16 battles unrun (about -1 min); every battle already fought is kept and a rerun resumes from it.

### anmd

**60 of 720 battles** (8%), 0 failed. Running 7 min, 497 battles/h, about 1.3 h left (ends ~16:28 PC time). Last battle 1 min ago.
Skipped turns a battle: 11.4 overall, first 60 11.4, last 60 11.4.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 60 |
| `stall 30m` | halt | ok | last battle 1 min ago |
| `skips 40 over 100` | halt | waiting | 60 of 100 battles to read |

Stopping now would leave 660 battles unrun (about 1.3 h); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
13:07:48 watching anbb: 3 stop rule(s)
13:07:50 progress pushed to origin claude/pc-team-angles-progress (every 15 min)
13:08:48 progress anbb: 342/720 (48%) battles, 20349/h, ETA 1 min, 0 failed, skips 20.1/battle (last 100)
13:28:52 anbb exit=0 in 1263 s
13:28:52 start anhv
13:28:52 watching anhv: 3 stop rule(s)
13:39:02 progress anhv: 107/720 (15%) battles, 631/h, ETA 58 min, 0 failed, skips 11.7/battle (last 100)
14:09:18 progress anhv: 620/720 (86%) battles, 920/h, ETA 7 min, 0 failed, skips 9.3/battle (last 100)
14:14:42 anhv exit=0 in 2750 s
14:14:42 start anwy
14:14:42 watching anwy: 3 stop rule(s)
14:39:32 progress anwy: 315/720 (44%) battles, 761/h, ETA 32 min, 0 failed, skips 12.3/battle (last 100)
15:01:31 anwy exit=0 in 2808 s
15:01:31 start anmd
15:01:31 watching anmd: 3 stop rule(s)
```
