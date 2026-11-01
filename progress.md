# Queue pc-melee-hand: progress

Updated 2026-11-01 00:11:11 PC time (00:11 UTC), runner pid 39612.

- `haprep` done, exit 0 in 3 min
- `haaa` done, exit 0 in 24 min
- `habb` done, exit 0 in 24 min
- `haet` done, exit 0 in 25 min
- `haed` done, exit 0 in 24 min
- `haes` done, exit 0 in 24 min
- `haread` done, exit 0 in 0 min
- `hapr` done, exit 0 in 0 min

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

**276 of 276 battles** (100%), 0 failed. Running 24 min, 677 battles/h, about 0 min left (ends ~00:10 PC time). Last battle 0 min ago.
Skipped turns a battle: 69.0 overall, first 100 56.7, last 100 79.9.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 276 |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
23:04:43 progress haet: 73/276 (26%) battles, 623/h, ETA 20 min, 0 failed, skips 60.5/battle (last 100)
23:22:15 haet exit=0 in 1473 s
23:22:15 start haed
23:22:15 watching haed: 2 stop rule(s)
23:35:00 progress haed: 131/276 (47%) battles, 617/h, ETA 14 min, 0 failed, skips 51.5/battle (last 100)
23:46:29 haed exit=0 in 1453 s
23:46:29 start haes
23:46:29 watching haes: 2 stop rule(s)
00:05:14 progress haes: 198/276 (72%) battles, 633/h, ETA 7 min, 0 failed, skips 76.5/battle (last 100)
00:10:57 haes exit=0 in 1468 s
00:10:57 start haread
00:11:05 haread exit=0 in 7 s
00:11:05 start hapr
00:11:11 hapr exit=0 in 6 s
00:11:11 ALLDONE
```
