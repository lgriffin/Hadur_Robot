# Queue pc-deise-e05: progress

Updated 2026-10-29 12:38:12 PC time (12:38 UTC), runner pid 42820.

- `prep` done, exit 0 in 0 min
- `live-D` done, exit 0 in 17 min
- `live-AIM2` done, exit 0 in 17 min
- `live-P2` done, exit 0 in 17 min
- `live-W10` running
- `live-W50` pending
- `live-REACH` pending
- `live-R72` pending
- `live-SAOR` pending
- `read` pending
- `pr` pending

### live-D

**276 of 276 battles** (100%), 0 failed. Running 17 min, 999 battles/h, about 0 min left (ends ~11:54 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 276 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.0 a battle over the last 100 (first 100: 0.0) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### live-AIM2

**276 of 276 battles** (100%), 0 failed. Running 17 min, 970 battles/h, about 0 min left (ends ~12:11 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 276 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.0 a battle over the last 100 (first 100: 0.0) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### live-P2

**276 of 276 battles** (100%), 0 failed. Running 17 min, 957 battles/h, about 0 min left (ends ~12:29 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 276 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.0 a battle over the last 100 (first 100: 0.0) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### live-W10

**132 of 276 battles** (48%), 0 failed. Running 9 min, 865 battles/h, about 10 min left (ends ~12:48 PC time). Last battle 0 min ago.
Skipped turns a battle: 0.0 overall, first 100 0.0, last 100 0.1.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 132 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 0.1 a battle over the last 100 (first 100: 0.0) |

Stopping now would leave 144 battles unrun (about 10 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
11:37:46 progress pushed to origin claude/pc-deise-e05-progress (every 15 min)
11:38:05 prep exit=0 in 21 s
11:38:05 start live-D
11:38:05 watching live-D: 3 stop rule(s)
11:38:43 progress live-D: 6/276 (2%) battles, 563/h, ETA 29 min, 0 failed, skips 0.0/battle (last 100)
11:54:40 live-D exit=0 in 994 s
11:54:40 start live-AIM2
11:54:40 watching live-AIM2: 3 stop rule(s)
12:08:57 progress live-AIM2: 223/276 (81%) battles, 936/h, ETA 3 min, 0 failed, skips 0.0/battle (last 100)
12:11:44 live-AIM2 exit=0 in 1024 s
12:11:44 start live-P2
12:11:44 watching live-P2: 3 stop rule(s)
12:29:03 live-P2 exit=0 in 1038 s
12:29:03 start live-W10
12:29:03 watching live-W10: 3 stop rule(s)
```
