# Queue pc-team-tight: progress

Updated 2026-11-23 00:02:15 PC time (00:02 UTC), runner pid 37800.

- `ttprep` done, exit 0 in 2 min
- `ttptp` done, exit 0 in 6 min
- `ttpilot` done, exit 0 in 0 min
- `ttbb` done, exit 0 in 33 min
- `tttp` done, exit 0 in 32 min
- `ttgate` done, exit 0 in 0 min
- `ttpr` done, exit 0 in 0 min

### ttptp

**40 of 40 battles** (100%), 0 failed. Running 6 min, 386 battles/h, about 0 min left (ends ~22:57 PC time). Last battle 0 min ago.
Skipped turns a battle: 44.9 overall, first 40 44.9, last 40 44.9.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 10` | halt | ok | 0 failed of 40 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 60 over 200` | halt | waiting | 40 of 200 battles to read |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### ttbb

**240 of 240 battles** (100%), 0 failed. Running 33 min, 431 battles/h, about 0 min left (ends ~23:30 PC time). Last battle 0 min ago.
Skipped turns a battle: 50.8 overall, first 100 52.4, last 100 43.9.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 10` | halt | ok | 0 failed of 240 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 60 over 200` | halt | ok | 53.1 a battle over the last 200 (first 200: 52.6) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### tttp

**240 of 240 battles** (100%), 0 failed. Running 32 min, 456 battles/h, about 0 min left (ends ~00:02 PC time). Last battle 0 min ago.
Skipped turns a battle: 46.8 overall, first 100 47.8, last 100 41.8.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 10` | halt | ok | 0 failed of 240 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 60 over 200` | halt | ok | 48.1 a battle over the last 200 (first 200: 47.6) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
22:57:10 start ttpilot
22:57:11 ttpilot exit=0 in 0 s
22:57:11 start ttbb
22:57:11 watching ttbb: 3 stop rule(s)
23:22:09 progress ttbb: 171/240 (71%) battles, 411/h, ETA 10 min, 0 failed, skips 60.2/battle (last 100)
23:30:33 ttbb exit=0 in 2002 s
23:30:33 start tttp
23:30:33 watching tttp: 3 stop rule(s)
23:52:23 progress tttp: 159/240 (66%) battles, 437/h, ETA 11 min, 0 failed, skips 54.4/battle (last 100)
00:02:08 tttp exit=0 in 1895 s
00:02:08 start ttgate
00:02:09 ttgate exit=0 in 0 s
00:02:09 start ttpr
00:02:15 ttpr exit=0 in 5 s
00:02:15 ALLDONE
```
