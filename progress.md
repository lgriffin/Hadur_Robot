# Queue pc-melee-end: progress

Updated 2026-11-02 22:37:58 PC time (22:37 UTC), runner pid 51784.

- `meprep` done, exit 0 in 2 min
- `meaa` done, exit 0 in 45 min
- `mebb` done, exit 0 in 44 min
- `meeg` done, exit 0 in 47 min
- `meek` done, exit 0 in 45 min
- `meread` done, exit 0 in 0 min
- `mepr` done, exit 0 in 0 min

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

**276 of 276 battles** (100%), 0 failed. Running 47 min, 353 battles/h, about 0 min left (ends ~21:52 PC time). Last battle 0 min ago.
Skipped turns a battle: 28.2 overall, first 100 27.6, last 100 28.5.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 276 |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### meek

**276 of 276 battles** (100%), 0 failed. Running 45 min, 370 battles/h, about 0 min left (ends ~22:37 PC time). Last battle 0 min ago.
Skipped turns a battle: 28.4 overall, first 100 28.2, last 100 28.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 276 |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
21:06:00 mebb exit=0 in 2659 s
21:06:00 start meeg
21:06:00 watching meeg: 2 stop rule(s)
21:08:25 progress meeg: 12/276 (4%) battles, 298/h, ETA 53 min, 0 failed, skips 30.3/battle (last 100)
21:38:39 progress meeg: 179/276 (65%) battles, 329/h, ETA 18 min, 0 failed, skips 28.8/battle (last 100)
21:52:58 meeg exit=0 in 2817 s
21:52:58 start meek
21:52:58 watching meek: 2 stop rule(s)
22:08:54 progress meek: 102/276 (37%) battles, 384/h, ETA 27 min, 0 failed, skips 28.0/battle (last 100)
22:37:43 meek exit=0 in 2685 s
22:37:43 start meread
22:37:52 meread exit=0 in 8 s
22:37:52 start mepr
22:37:58 mepr exit=0 in 6 s
22:37:58 ALLDONE
```
