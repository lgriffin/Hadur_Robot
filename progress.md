# Queue pc-sanaro-n07: progress

Updated 2026-11-01 10:03:05 PC time (10:03 UTC), runner pid 46892.

- `prep` done, exit 0 in 0 min
- `teach` done, exit 0 in 12 min
- `distill-report` done, exit 0 in 0 min
- `arms` done, exit 0 in 0 min
- `live-S2` done, exit 0 in 30 min
- `live-HS` running
- `live-HL` pending
- `live-HC` pending
- `read-live` pending
- `pr` pending

### teach

**129 of 129 battles** (100%), 0 failed. Running 12 min, 670 battles/h, about 0 min left (ends ~09:14 PC time). Last battle 0 min ago.
Skipped turns a battle: 78.9 overall, first 100 76.4, last 100 82.8.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 129 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 120 over 100` | halt | ok | 82.8 a battle over the last 100 (first 100: 76.4) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### live-S2

**430 of 430 battles** (100%), 0 failed. Running 30 min, 862 battles/h, about 0 min left (ends ~09:44 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 430 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.0 a battle over the last 100 (first 100: 0.0) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### live-HS

**209 of 430 battles** (49%), 0 failed. Running 19 min, 669 battles/h, about 20 min left (ends ~10:22 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 209 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.0 a battle over the last 100 (first 100: 0.0) |

Stopping now would leave 221 battles unrun (about 20 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
09:02:39 start teach
09:02:39 watching teach: 3 stop rule(s)
09:02:41 progress pushed to origin claude/pc-sanaro-n07-progress (every 15 min)
09:03:39 progress teach: 6/129 (5%) battles, 357/h, ETA 21 min, 0 failed, skips 23.2/battle (last 100)
09:14:11 teach exit=0 in 692 s
09:14:11 start distill-report
09:14:15 distill-report exit=0 in 3 s
09:14:15 start arms
09:14:24 arms exit=0 in 9 s
09:14:24 start live-S2
09:14:24 watching live-S2: 3 stop rule(s)
09:33:52 progress live-S2: 220/430 (51%) battles, 679/h, ETA 19 min, 0 failed, skips 0.0/battle (last 100)
09:44:20 live-S2 exit=0 in 1796 s
09:44:20 start live-HS
09:44:20 watching live-HS: 3 stop rule(s)
```
