# Queue pc-melee-surf: progress

Updated 2026-10-30 17:00:22 PC time (17:00 UTC), runner pid 30060.

- `msprep` done, exit 0 in 5 min
- `msaa` done, exit 0 in 27 min
- `msbb` done, exit 0 in 25 min
- `msms` done, exit 0 in 25 min
- `msread` done, exit 0 in 0 min
- `mspr` done, exit 0 in 0 min

### msaa

**276 of 276 battles** (100%), 0 failed. Running 27 min, 602 battles/h, about 0 min left (ends ~16:10 PC time). Last battle 0 min ago.
Skipped turns a battle: 86.9 overall, first 100 98.4, last 100 73.2.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 276 |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### msbb

**276 of 276 battles** (100%), 0 failed. Running 25 min, 670 battles/h, about 0 min left (ends ~16:35 PC time). Last battle 0 min ago.
Skipped turns a battle: 79.9 overall, first 100 66.2, last 100 93.4.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 276 |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### msms

**276 of 276 battles** (100%), 0 failed. Running 25 min, 666 battles/h, about 0 min left (ends ~17:00 PC time). Last battle 0 min ago.
Skipped turns a battle: 62.5 overall, first 100 47.1, last 100 74.4.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 276 |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
15:43:25 progress msaa: 0/276 (0%) battles, 0 failed
16:10:34 msaa exit=0 in 1649 s
16:10:34 start msbb
16:10:34 watching msbb: 2 stop rule(s)
16:13:40 progress msbb: 30/276 (11%) battles, 581/h, ETA 25 min, 0 failed, skips 71.6/battle (last 100)
16:35:17 msbb exit=0 in 1482 s
16:35:17 start msms
16:35:17 watching msms: 2 stop rule(s)
16:43:54 progress msms: 96/276 (35%) battles, 668/h, ETA 16 min, 0 failed, skips 48.3/battle (last 100)
17:00:10 msms exit=0 in 1492 s
17:00:10 start msread
17:00:15 msread exit=0 in 4 s
17:00:15 start mspr
17:00:22 mspr exit=0 in 7 s
17:00:22 ALLDONE
```
