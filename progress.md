# Queue pc-deise-e07: progress

Updated 2026-10-30 18:20:52 PC time (18:20 UTC), runner pid 69032.

- `prep` done, exit 0 in 0 min
- `live-D` done, exit 0 in 17 min
- `live-P3` done, exit 0 in 18 min
- `live-P075` done, exit 0 in 17 min
- `live-SHARP` running
- `live-WV2` pending
- `live-CONS` pending
- `live-SCAL` pending
- `live-RS` pending
- `live-SAOR` pending
- `read` pending
- `pr` pending

### live-D

**276 of 276 battles** (100%), 0 failed. Running 17 min, 962 battles/h, about 0 min left (ends ~17:38 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 276 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.0 a battle over the last 100 (first 100: 0.0) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### live-P3

**276 of 276 battles** (100%), 0 failed. Running 18 min, 927 battles/h, about 0 min left (ends ~17:55 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 276 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.0 a battle over the last 100 (first 100: 0.0) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### live-P075

**276 of 276 battles** (100%), 0 failed. Running 17 min, 964 battles/h, about 0 min left (ends ~18:13 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 276 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.0 a battle over the last 100 (first 100: 0.0) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### live-SHARP

**120 of 276 battles** (43%), 0 failed. Running 8 min, 923 battles/h, about 10 min left (ends ~18:31 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.1 overall, first 100 0.1, last 100 0.1.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 120 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.1 a battle over the last 100 (first 100: 0.1) |

Stopping now would leave 156 battles unrun (about 10 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
17:20:26 progress pushed to origin claude/pc-deise-e07-progress (every 15 min)
17:20:49 prep exit=0 in 28 s
17:20:49 start live-D
17:20:49 watching live-D: 3 stop rule(s)
17:21:21 progress live-D: 6/276 (2%) battles, 668/h, ETA 24 min, 0 failed, skips 0.0/battle (last 100)
17:38:01 live-D exit=0 in 1032 s
17:38:01 start live-P3
17:38:01 watching live-P3: 3 stop rule(s)
17:51:36 progress live-P3: 192/276 (70%) battles, 848/h, ETA 6 min, 0 failed, skips 0.0/battle (last 100)
17:55:53 live-P3 exit=0 in 1071 s
17:55:53 start live-P075
17:55:53 watching live-P075: 3 stop rule(s)
18:13:03 live-P075 exit=0 in 1030 s
18:13:03 start live-SHARP
18:13:03 watching live-SHARP: 3 stop rule(s)
```
