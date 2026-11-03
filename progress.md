# Queue pc-melee-near: progress

Updated 2026-11-03 14:46:37 PC time (14:46 UTC), runner pid 692.

- `mnprep` done, exit 0 in 2 min
- `mnaa` done, exit 0 in 44 min
- `mnbb` done, exit 0 in 45 min
- `mnn3` done, exit 0 in 45 min
- `mnn4` running
- `mnread` pending
- `mnpr` pending

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

**90 of 276 battles** (33%), 0 failed. Running 14 min, 374 battles/h, about 30 min left (ends ~15:16 PC time). Last battle 0 min ago.
Skipped turns a battle: 28.7 overall, first 90 28.7, last 90 28.7.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 90 |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 186 battles unrun (about 30 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
12:17:40 watching mnaa: 2 stop rule(s)
12:18:28 progress mnaa: 0/276 (0%) battles, 0 failed
12:48:42 progress mnaa: 180/276 (65%) battles, 348/h, ETA 17 min, 0 failed, skips 27.1/battle (last 100)
13:01:53 mnaa exit=0 in 2653 s
13:01:53 start mnbb
13:01:53 watching mnbb: 2 stop rule(s)
13:18:57 progress mnbb: 114/276 (41%) battles, 401/h, ETA 24 min, 0 failed, skips 28.6/battle (last 100)
13:47:05 mnbb exit=0 in 2711 s
13:47:05 start mnn3
13:47:05 watching mnn3: 2 stop rule(s)
13:49:10 progress mnn3: 12/276 (4%) battles, 346/h, ETA 46 min, 0 failed, skips 27.5/battle (last 100)
14:19:24 progress mnn3: 180/276 (65%) battles, 334/h, ETA 17 min, 0 failed, skips 28.3/battle (last 100)
14:32:10 mnn3 exit=0 in 2704 s
14:32:10 start mnn4
14:32:10 watching mnn4: 2 stop rule(s)
```
