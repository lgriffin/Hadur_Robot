# Queue pc-melee-far: progress

Updated 2026-11-04 19:56:41 PC time (19:56 UTC), runner pid 36348.

- `mfprep` done, exit 0 in 2 min
- `mfpilot` done, exit 0 in 1.1 h
- `mfcheck` done, exit 0 in 0 min
- `mfaa` done, exit 0 in 45 min
- `mfbb` done, exit 0 in 45 min
- `mfy3` done, exit 0 in 45 min
- `mfy5` running
- `mfread` pending
- `mfpr` pending

### mfpilot

**184 of 184 battles** (100%), 0 failed. Running 1.1 h, 169 battles/h, about 0 min left (ends ~16:54 PC time). Last battle 0 min ago.
Skipped turns a battle: 24.1 overall, first 100 24.1, last 100 23.7.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 184 |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### mfaa

**276 of 276 battles** (100%), 0 failed. Running 45 min, 370 battles/h, about 0 min left (ends ~17:39 PC time). Last battle 0 min ago.
Skipped turns a battle: 28.9 overall, first 100 28.9, last 100 28.6.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 276 |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### mfbb

**276 of 276 battles** (100%), 0 failed. Running 45 min, 370 battles/h, about 0 min left (ends ~18:23 PC time). Last battle 0 min ago.
Skipped turns a battle: 29.3 overall, first 100 30.0, last 100 28.3.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 276 |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### mfy3

**276 of 276 battles** (100%), 0 failed. Running 45 min, 367 battles/h, about 0 min left (ends ~19:09 PC time). Last battle 0 min ago.
Skipped turns a battle: 30.8 overall, first 100 31.1, last 100 30.5.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 276 |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### mfy5

**270 of 276 battles** (98%), 0 failed. Running 48 min, 340 battles/h, about 1 min left (ends ~19:57 PC time). Last battle 1 min ago.
Skipped turns a battle: 33.8 overall, first 100 31.1, last 100 36.3.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 270 |
| `stall 30m` | halt | ok | last battle 1 min ago |

Stopping now would leave 6 battles unrun (about 1 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
17:20:26 progress mfaa: 138/276 (50%) battles, 319/h, ETA 26 min, 0 failed, skips 29.8/battle (last 100)
17:39:10 mfaa exit=0 in 2682 s
17:39:10 start mfbb
17:39:10 watching mfbb: 2 stop rule(s)
17:50:41 progress mfbb: 72/276 (26%) battles, 375/h, ETA 33 min, 0 failed, skips 29.9/battle (last 100)
18:20:55 progress mfbb: 252/276 (91%) battles, 362/h, ETA 4 min, 0 failed, skips 29.1/battle (last 100)
18:23:58 mfbb exit=0 in 2687 s
18:23:58 start mfy3
18:23:58 watching mfy3: 2 stop rule(s)
18:51:09 progress mfy3: 144/276 (52%) battles, 318/h, ETA 25 min, 0 failed, skips 32.8/battle (last 100)
19:09:01 mfy3 exit=0 in 2703 s
19:09:01 start mfy5
19:09:01 watching mfy5: 2 stop rule(s)
19:21:24 progress mfy5: 78/276 (28%) battles, 378/h, ETA 31 min, 0 failed, skips 30.5/battle (last 100)
19:51:38 progress mfy5: 242/276 (88%) battles, 341/h, ETA 6 min, 0 failed, skips 37.6/battle (last 100)
```
