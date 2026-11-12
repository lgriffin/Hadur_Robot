# Queue pc-team-guard: progress

Updated 2026-11-12 16:17:26 PC time (16:17 UTC), runner pid 65320.

- `tgprep` done, exit 0 in 3 min
- `tgpmv` done, exit 0 in 22 min
- `tgpla` done, exit 0 in 20 min
- `tgpilot` done, exit 0 in 0 min
- `tgbb` done, exit 0 in 1.3 h
- `tgmv` done, exit 0 in 0 min
- `tgla` done, exit 0 in 1.4 h
- `tggate` done, exit 0 in 0 min
- `tgpr` done, exit 0 in 0 min

### tgpmv

**270 of 138 battles** (196%), 0 failed. Running 22 min, 731 battles/h, about -11 min left (ends ~13:03 PC time). Last battle 0 min ago.
Skipped turns a battle: 2.2 overall, first 100 0.5, last 100 5.1.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 60` | halt | ok | 0 failed of 270 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 60 over 200` | halt | ok | 2.8 a battle over the last 200 (first 200: 2.4) |

Stopping now would leave -132 battles unrun (about -11 min); every battle already fought is kept and a rerun resumes from it.

### tgpla

**270 of 138 battles** (196%), 0 failed. Running 20 min, 799 battles/h, about -10 min left (ends ~13:24 PC time). Last battle 0 min ago.
Skipped turns a battle: 9.0 overall, first 100 4.7, last 100 10.9.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 60` | halt | ok | 0 failed of 270 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 60 over 200` | halt | ok | 11.6 a battle over the last 200 (first 200: 8.0) |

Stopping now would leave -132 battles unrun (about -10 min); every battle already fought is kept and a rerun resumes from it.

### tgbb

**1080 battles**, 0 failed. Running 1.3 h, 814 battles/h. Last battle 0 min ago.
Skipped turns a battle: 2.0 overall, first 100 13.6, last 100 2.2.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 60` | halt | ok | 0 failed of 1080 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 60 over 200` | halt | ok | 1.6 a battle over the last 200 (first 200: 6.9) |

### tgmv

**0 battles**, 0 failed. Running 0 min. Last battle 0 min ago.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 60` | halt | ok | 0 failed of 0 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 60 over 200` | halt | waiting | 0 of 200 battles to read |

### tgla

**1080 battles**, 0 failed. Running 1.4 h, 776 battles/h. Last battle 0 min ago.
Skipped turns a battle: 16.7 overall, first 100 0.2, last 100 28.2.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 60` | halt | ok | 0 failed of 1080 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 60 over 200` | halt | ok | 21.7 a battle over the last 200 (first 200: 0.2) |

### Queue log (last lines)

```
14:52:47 progress tgbb: 1031 battles, 786/h, 0 failed, skips 1.3/battle (last 100)
14:53:47 tgbb exit=0 in 4778 s
14:53:47 start tgmv
14:53:47 watching tgmv: 3 stop rule(s)
14:53:47 tgmv exit=0 in 0 s
14:53:47 start tgla
14:53:47 watching tgla: 3 stop rule(s)
15:23:01 progress tgla: 291 battles, 597/h, 0 failed, skips 0.5/battle (last 100)
15:53:19 progress tgla: 681 battles, 686/h, 0 failed, skips 26.0/battle (last 100)
16:17:18 tgla exit=0 in 5010 s
16:17:18 start tggate
16:17:18 tggate exit=0 in 0 s
16:17:18 start tgpr
16:17:26 tgpr exit=0 in 7 s
16:17:26 ALLDONE
```
