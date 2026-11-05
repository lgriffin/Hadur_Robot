# Queue pc-melee-floor: progress

Updated 2026-11-05 01:04:18 PC time (01:04 UTC), runner pid 37368.

- `mlprep` done, exit 0 in 3 min
- `mlpilot` done, exit 0 in 1.3 h
- `mlcheck` done, exit 0 in 0 min
- `mlaa` done, exit 0 in 51 min
- `mlbb` running
- `mlz4` pending
- `mlz5` pending
- `mlread` pending
- `mlpr` pending

### mlpilot

**184 of 184 battles** (100%), 0 failed. Running 1.3 h, 140 battles/h, about 0 min left (ends ~23:55 PC time). Last battle 0 min ago.
Skipped turns a battle: 25.3 overall, first 100 23.8, last 100 26.9.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 184 |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### mlaa

**276 of 276 battles** (100%), 0 failed. Running 51 min, 325 battles/h, about 0 min left (ends ~00:46 PC time). Last battle 0 min ago.
Skipped turns a battle: 32.1 overall, first 100 32.8, last 100 31.7.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 276 |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### mlbb

**102 of 276 battles** (37%), 0 failed. Running 18 min, 338 battles/h, about 31 min left (ends ~01:35 PC time). Last battle 0 min ago.
Skipped turns a battle: 33.1 overall, first 100 33.1, last 100 33.1.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 102 |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 174 battles unrun (about 31 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
22:36:34 start mlpilot
22:36:34 watching mlpilot: 2 stop rule(s)
22:37:20 progress mlpilot: 0/184 (0%) battles, 0 failed
23:07:29 progress mlpilot: 82/184 (45%) battles, 159/h, ETA 38 min, 0 failed, skips 23.6/battle (last 100)
23:37:39 progress mlpilot: 142/184 (77%) battles, 139/h, ETA 18 min, 0 failed, skips 25.9/battle (last 100)
23:55:14 mlpilot exit=0 in 4720 s
23:55:14 start mlcheck
23:55:15 mlcheck exit=0 in 1 s
23:55:15 start mlaa
23:55:15 watching mlaa: 2 stop rule(s)
00:07:50 progress mlaa: 66/276 (24%) battles, 315/h, ETA 40 min, 0 failed, skips 33.1/battle (last 100)
00:38:05 progress mlaa: 228/276 (83%) battles, 319/h, ETA 9 min, 0 failed, skips 31.8/battle (last 100)
00:46:10 mlaa exit=0 in 3054 s
00:46:10 start mlbb
00:46:10 watching mlbb: 2 stop rule(s)
```
