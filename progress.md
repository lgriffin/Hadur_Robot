# Queue pc-team-guard: progress

Updated 2026-11-12 14:34:40 PC time (14:34 UTC), runner pid 65320.

- `tgprep` done, exit 0 in 3 min
- `tgpmv` done, exit 0 in 22 min
- `tgpla` done, exit 0 in 20 min
- `tgpilot` done, exit 0 in 0 min
- `tgbb` running
- `tgmv` pending
- `tgla` pending
- `tggate` pending
- `tgpr` pending

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

**701 battles**, 0 failed. Running 1.0 h, 695 battles/h. Last battle 1 min ago.
Skipped turns a battle: 2.4 overall, first 100 13.6, last 100 0.3.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 60` | halt | ok | 0 failed of 701 |
| `stall 30m` | halt | ok | last battle 1 min ago |
| `skips 60 over 200` | halt | ok | 0.7 a battle over the last 200 (first 200: 6.9) |

### Queue log (last lines)

```
12:51:41 tgprep exit=0 in 170 s
12:51:41 start tgpmv
12:51:41 watching tgpmv: 3 stop rule(s)
12:51:53 progress tgpmv: 0/138 (0%) battles, 0 failed
13:13:50 tgpmv exit=0 in 1329 s
13:13:50 start tgpla
13:13:50 watching tgpla: 3 stop rule(s)
13:22:06 progress tgpla: 68/138 (49%) battles, 494/h, ETA 9 min, 0 failed, skips 1.2/battle (last 100)
13:34:07 tgpla exit=0 in 1217 s
13:34:07 start tgpilot
13:34:08 tgpilot exit=0 in 0 s
13:34:08 start tgbb
13:34:08 watching tgbb: 3 stop rule(s)
13:52:22 progress tgbb: 148 battles, 487/h, 0 failed, skips 4.3/battle (last 100)
14:22:35 progress tgbb: 577 battles, 715/h, 0 failed, skips 0.7/battle (last 100)
```
