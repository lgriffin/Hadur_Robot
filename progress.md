# Queue pc-team-dodge: progress

Updated 2026-10-29 21:55:53 PC time (21:55 UTC), runner pid 64500.

- `tdprep` done, exit 0 in 2 min
- `tdbb` done, exit 0 in 1.2 h
- `tddg` done, exit 0 in 1.2 h
- `tdglob` done, exit 0 in 0 min
- `tdpick` done, exit 0 in 1 min
- `tdgate` done, exit 0 in 5 min
- `tdgbb` done, exit 0 in 5 min
- `tdsum` done, exit 0 in 0 min
- `tdpr` done, exit 0 in 0 min

### tdbb

**1104 of 1104 battles** (100%), 0 failed. Running 1.2 h, 899 battles/h, about 0 min left (ends ~20:30 PC time). Last battle 0 min ago.
Skipped turns a battle: 11.2 overall, first 100 9.2, last 100 7.6.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 1104 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 7.6 a battle over the last 100 (first 100: 9.2) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### tddg

**1104 of 1104 battles** (100%), 0 failed. Running 1.2 h, 897 battles/h, about 0 min left (ends ~21:44 PC time). Last battle 0 min ago.
Skipped turns a battle: 10.2 overall, first 100 13.3, last 100 5.3.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 1104 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 5.3 a battle over the last 100 (first 100: 13.3) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### tdgate

**96 battles**, 0 failed. Running 5 min, 1100 battles/h. Last battle 0 min ago.
Skipped turns a battle: 7.6 overall, first 96 7.6, last 96 7.6.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 96 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | waiting | 96 of 100 battles to read |

### tdgbb

**96 battles**, 0 failed. Running 5 min, 1115 battles/h. Last battle 0 min ago.
Skipped turns a battle: 8.8 overall, first 96 8.8, last 96 8.8.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 96 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | waiting | 96 of 100 battles to read |

### Queue log (last lines)

```
21:44:28 tdglob exit=0 in 0 s
21:44:28 start tdpick
21:45:21 tdpick exit=0 in 52 s
21:45:21 start tdgate
21:45:21 watching tdgate: 3 stop rule(s)
21:48:36 progress tdgate: 36 battles, 663/h, 0 failed, skips 7.4/battle (last 100)
21:50:35 tdgate exit=0 in 314 s
21:50:35 start tdgbb
21:50:35 watching tdgbb: 3 stop rule(s)
21:55:45 tdgbb exit=0 in 309 s
21:55:45 start tdsum
21:55:45 tdsum exit=0 in 0 s
21:55:45 start tdpr
21:55:53 tdpr exit=0 in 7 s
21:55:53 ALLDONE
```
