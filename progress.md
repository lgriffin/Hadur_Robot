# Queue pc-melee-end: progress

Updated 2026-11-02 21:35:37 PC time (21:35 UTC), runner pid 51784.

- `meprep` done, exit 0 in 2 min
- `meaa` done, exit 0 in 45 min
- `mebb` done, exit 0 in 44 min
- `meeg` running
- `meek` pending
- `meread` pending
- `mepr` pending

### meaa

**276 of 276 battles** (100%), 0 failed. Running 45 min, 371 battles/h, about 0 min left (ends ~20:21 PC time). Last battle 0 min ago.
Skipped turns a battle: 27.7 overall, first 100 27.9, last 100 27.6.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 276 |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### mebb

**276 of 276 battles** (100%), 0 failed. Running 44 min, 374 battles/h, about 0 min left (ends ~21:06 PC time). Last battle 0 min ago.
Skipped turns a battle: 27.4 overall, first 100 27.3, last 100 27.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 276 |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### meeg

**156 of 276 battles** (57%), 0 failed. Running 30 min, 316 battles/h, about 23 min left (ends ~21:58 PC time). Last battle 0 min ago.
Skipped turns a battle: 28.1 overall, first 100 27.6, last 100 28.7.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 156 |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 120 battles unrun (about 23 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
19:34:41 start meprep
19:34:43 progress pushed to origin claude/pc-melee-end-progress (every 15 min)
19:37:03 meprep exit=0 in 142 s
19:37:03 start meaa
19:37:03 watching meaa: 2 stop rule(s)
19:37:43 progress meaa: 0/276 (0%) battles, 0 failed
20:07:57 progress meaa: 174/276 (63%) battles, 338/h, ETA 18 min, 0 failed, skips 28.0/battle (last 100)
20:21:40 meaa exit=0 in 2676 s
20:21:40 start mebb
20:21:40 watching mebb: 2 stop rule(s)
20:38:11 progress mebb: 108/276 (39%) battles, 392/h, ETA 26 min, 0 failed, skips 28.5/battle (last 100)
21:06:00 mebb exit=0 in 2659 s
21:06:00 start meeg
21:06:00 watching meeg: 2 stop rule(s)
21:08:25 progress meeg: 12/276 (4%) battles, 298/h, ETA 53 min, 0 failed, skips 30.3/battle (last 100)
```
