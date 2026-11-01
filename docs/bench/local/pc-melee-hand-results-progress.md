# Queue pc-melee-hand: progress

Updated 2026-11-01 00:10:17 PC time (00:10 UTC), runner pid 39612.

- `haprep` done, exit 0 in 3 min
- `haaa` done, exit 0 in 24 min
- `habb` done, exit 0 in 24 min
- `haet` done, exit 0 in 25 min
- `haed` done, exit 0 in 24 min
- `haes` running
- `haread` pending
- `hapr` pending

### habb

**276 of 276 battles** (100%), 0 failed. Running 24 min, 683 battles/h, about 0 min left (ends ~22:57 PC time). Last battle 0 min ago.
Skipped turns a battle: 66.6 overall, first 100 55.8, last 100 82.1.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 276 |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### haet

**276 of 276 battles** (100%), 0 failed. Running 25 min, 674 battles/h, about 0 min left (ends ~23:22 PC time). Last battle 0 min ago.
Skipped turns a battle: 71.0 overall, first 100 60.0, last 100 80.7.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 276 |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### haed

**276 of 276 battles** (100%), 0 failed. Running 24 min, 683 battles/h, about 0 min left (ends ~23:46 PC time). Last battle 0 min ago.
Skipped turns a battle: 59.5 overall, first 100 42.4, last 100 65.8.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 276 |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### haes

**267 of 276 battles** (97%), 0 failed. Running 24 min, 673 battles/h, about 1 min left (ends ~00:11 PC time). Last battle 0 min ago.
Skipped turns a battle: 67.5 overall, first 100 56.7, last 100 74.5.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 267 |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 9 battles unrun (about 1 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
22:33:27 watching habb: 2 stop rule(s)
22:33:29 progress pushed to origin claude/pc-melee-hand-progress (every 15 min)
22:34:28 progress habb: 6/276 (2%) battles, 357/h, ETA 45 min, 0 failed, skips 23.0/battle (last 100)
22:57:42 habb exit=0 in 1454 s
22:57:42 start haet
22:57:42 watching haet: 2 stop rule(s)
23:04:43 progress haet: 73/276 (26%) battles, 623/h, ETA 20 min, 0 failed, skips 60.5/battle (last 100)
23:22:15 haet exit=0 in 1473 s
23:22:15 start haed
23:22:15 watching haed: 2 stop rule(s)
23:35:00 progress haed: 131/276 (47%) battles, 617/h, ETA 14 min, 0 failed, skips 51.5/battle (last 100)
23:46:29 haed exit=0 in 1453 s
23:46:29 start haes
23:46:29 watching haes: 2 stop rule(s)
00:05:14 progress haes: 198/276 (72%) battles, 633/h, ETA 7 min, 0 failed, skips 76.5/battle (last 100)
```
