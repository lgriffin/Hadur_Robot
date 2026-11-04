# Queue pc-melee-far: progress

Updated 2026-11-04 18:02:46 PC time (18:02 UTC), runner pid 36348.

- `mfprep` done, exit 0 in 2 min
- `mfpilot` done, exit 0 in 1.1 h
- `mfcheck` done, exit 0 in 0 min
- `mfaa` done, exit 0 in 45 min
- `mfbb` running
- `mfy3` pending
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

**132 of 276 battles** (48%), 0 failed. Running 24 min, 336 battles/h, about 26 min left (ends ~18:28 PC time). Last battle 1 min ago.
Skipped turns a battle: 30.3 overall, first 100 30.0, last 100 30.9.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 132 |
| `stall 30m` | halt | ok | last battle 1 min ago |

Stopping now would leave 144 battles unrun (about 26 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
15:49:07 start mfpilot
15:49:07 watching mfpilot: 2 stop rule(s)
15:49:55 progress mfpilot: 0/184 (0%) battles, 0 failed
16:20:04 progress mfpilot: 83/184 (45%) battles, 161/h, ETA 38 min, 0 failed, skips 24.7/battle (last 100)
16:50:13 progress mfpilot: 170/184 (92%) battles, 167/h, ETA 5 min, 0 failed, skips 24.4/battle (last 100)
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
```
