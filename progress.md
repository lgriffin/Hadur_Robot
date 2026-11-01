# Queue pc-jaylexi-pt: progress

Updated 2026-11-01 15:49:51 PC time (15:49 UTC), runner pid 86548.

- `prep` done, exit 0 in 0 min
- `teach` done, exit 0 in 7 min
- `build` done, exit 0 in 2 min
- `J3` done, exit 0 in 3 min
- `PW` done, exit 0 in 3 min
- `PT` running
- `read` pending
- `pr` pending

### teach

**669 of 669 battles** (100%), 0 failed. Running 7 min, 5967 battles/h, about 0 min left (ends ~15:41 PC time). Last battle 0 min ago.
Skipped turns a battle: 12.2 overall, first 100 11.8, last 100 12.5.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 669 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 60 over 100` | halt | ok | 12.5 a battle over the last 100 (first 100: 11.8) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### J3

**672 of 672 battles** (100%), 0 failed. Running 3 min, 13235 battles/h, about 0 min left (ends ~15:46 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 672 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.0 a battle over the last 100 (first 100: 0.0) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### PW

**672 of 672 battles** (100%), 0 failed. Running 3 min, 13127 battles/h, about 0 min left (ends ~15:49 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 672 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.0 a battle over the last 100 (first 100: 0.0) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### PT

**30 of 672 battles** (4%), 0 failed. Running 1 min, 3238 battles/h, about 12 min left (ends ~16:01 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 30 0.0, last 30 0.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 30 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | waiting | 30 of 100 battles to read |

Stopping now would leave 642 battles unrun (about 12 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
15:34:52 prep exit=0 in 7 s
15:34:52 start teach
15:34:52 watching teach: 3 stop rule(s)
15:35:45 progress teach: 24/669 (4%) battles, 1649/h, ETA 23 min, 0 failed, skips 12.2/battle (last 100)
15:41:36 teach exit=0 in 403 s
15:41:36 start build
15:43:11 build exit=0 in 94 s
15:43:11 start J3
15:43:11 watching J3: 3 stop rule(s)
15:46:14 J3 exit=0 in 182 s
15:46:14 start PW
15:46:14 watching PW: 3 stop rule(s)
15:49:18 PW exit=0 in 184 s
15:49:18 start PT
15:49:18 watching PT: 3 stop rule(s)
```
