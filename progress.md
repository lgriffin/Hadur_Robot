# Queue pc-melee-near: progress

Updated 2026-11-03 15:20:14 PC time (15:20 UTC), runner pid 692.

- `mnprep` done, exit 0 in 2 min
- `mnaa` done, exit 0 in 44 min
- `mnbb` done, exit 0 in 45 min
- `mnn3` done, exit 0 in 45 min
- `mnn4` done, exit 0 in 48 min
- `mnread` done, exit 0 in 0 min
- `mnpr` done, exit 0 in 0 min

### mnaa

**276 of 276 battles** (100%), 0 failed. Running 44 min, 375 battles/h, about 0 min left (ends ~13:01 PC time). Last battle 0 min ago.
Skipped turns a battle: 27.0 overall, first 100 27.6, last 100 26.8.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 276 |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### mnbb

**276 of 276 battles** (100%), 0 failed. Running 45 min, 366 battles/h, about 0 min left (ends ~13:47 PC time). Last battle 0 min ago.
Skipped turns a battle: 27.3 overall, first 100 27.8, last 100 25.9.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 276 |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### mnn3

**276 of 276 battles** (100%), 0 failed. Running 45 min, 367 battles/h, about 0 min left (ends ~14:32 PC time). Last battle 0 min ago.
Skipped turns a battle: 27.4 overall, first 100 27.5, last 100 26.9.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 276 |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### mnn4

**276 of 276 battles** (100%), 0 failed. Running 48 min, 347 battles/h, about 0 min left (ends ~15:19 PC time). Last battle 0 min ago.
Skipped turns a battle: 32.3 overall, first 100 28.8, last 100 38.8.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 276 |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
13:47:05 mnbb exit=0 in 2711 s
13:47:05 start mnn3
13:47:05 watching mnn3: 2 stop rule(s)
13:49:10 progress mnn3: 12/276 (4%) battles, 346/h, ETA 46 min, 0 failed, skips 27.5/battle (last 100)
14:19:24 progress mnn3: 180/276 (65%) battles, 334/h, ETA 17 min, 0 failed, skips 28.3/battle (last 100)
14:32:10 mnn3 exit=0 in 2704 s
14:32:10 start mnn4
14:32:10 watching mnn4: 2 stop rule(s)
14:49:38 progress mnn4: 114/276 (41%) battles, 391/h, ETA 25 min, 0 failed, skips 29.9/battle (last 100)
15:19:52 mnn4 exit=0 in 2862 s
15:19:52 start mnread
15:20:07 mnread exit=0 in 14 s
15:20:07 start mnpr
15:20:14 mnpr exit=0 in 7 s
15:20:14 ALLDONE
```
