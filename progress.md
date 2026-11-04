# Queue pc-melee-far: progress

Updated 2026-11-04 19:03:15 PC time (19:03 UTC), runner pid 36348.

- `mfprep` done, exit 0 in 2 min
- `mfpilot` done, exit 0 in 1.1 h
- `mfcheck` done, exit 0 in 0 min
- `mfaa` done, exit 0 in 45 min
- `mfbb` done, exit 0 in 45 min
- `mfy3` running
- `mfy5` pending
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

**240 of 276 battles** (87%), 0 failed. Running 39 min, 366 battles/h, about 6 min left (ends ~19:09 PC time). Last battle 0 min ago.
Skipped turns a battle: 31.3 overall, first 100 31.1, last 100 31.4.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 240 |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 36 battles unrun (about 6 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
16:54:26 mfpilot exit=0 in 3919 s
16:54:26 start mfcheck
16:54:28 mfcheck exit=0 in 1 s
16:54:28 start mfaa
16:54:28 watching mfaa: 2 stop rule(s)
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
```
