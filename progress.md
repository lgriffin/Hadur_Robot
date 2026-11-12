# Queue pc-melee-dodge: progress

Updated 2026-11-12 07:45:52 PC time (07:45 UTC), runner pid 52528.

- `dgprep` done, exit 0 in 2 min
- `dgpilot` done, exit 0 in 1.1 h
- `dgcheck` done, exit 0 in 0 min
- `dgaa` done, exit 0 in 44 min
- `dgbb` running
- `dgmd` pending
- `dgread` pending
- `dgpr` pending

### dgpilot

**184 of 184 battles** (100%), 0 failed. Running 1.1 h, 174 battles/h, about 0 min left (ends ~06:50 PC time). Last battle 0 min ago.
Skipped turns a battle: 35.4 overall, first 100 36.3, last 100 34.8.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 184 |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### dgaa

**276 of 276 battles** (100%), 0 failed. Running 44 min, 372 battles/h, about 0 min left (ends ~07:34 PC time). Last battle 0 min ago.
Skipped turns a battle: 28.5 overall, first 100 28.5, last 100 28.6.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 276 |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### dgbb

**66 of 276 battles** (24%), 0 failed. Running 11 min, 362 battles/h, about 35 min left (ends ~08:20 PC time). Last battle 0 min ago.
Skipped turns a battle: 28.9 overall, first 66 28.9, last 66 28.9.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 66 |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 210 battles unrun (about 35 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
05:46:54 dgprep exit=0 in 113 s
05:46:54 start dgpilot
05:46:54 watching dgpilot: 2 stop rule(s)
05:47:01 progress dgpilot: 0/184 (0%) battles, 0 failed
06:17:14 progress dgpilot: 84/184 (46%) battles, 166/h, ETA 36 min, 0 failed, skips 36.2/battle (last 100)
06:47:26 progress dgpilot: 174/184 (95%) battles, 172/h, ETA 3 min, 0 failed, skips 30.4/battle (last 100)
06:50:26 dgpilot exit=0 in 3812 s
06:50:26 start dgcheck
06:50:27 dgcheck exit=0 in 0 s
06:50:27 start dgaa
06:50:27 watching dgaa: 2 stop rule(s)
07:17:40 progress dgaa: 145/276 (53%) battles, 320/h, ETA 25 min, 0 failed, skips 29.8/battle (last 100)
07:34:56 dgaa exit=0 in 2669 s
07:34:56 start dgbb
07:34:56 watching dgbb: 2 stop rule(s)
```
