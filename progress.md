# Queue pc-melee-dodge: progress

Updated 2026-11-12 09:02:30 PC time (09:02 UTC), runner pid 52528.

- `dgprep` done, exit 0 in 2 min
- `dgpilot` done, exit 0 in 1.1 h
- `dgcheck` done, exit 0 in 0 min
- `dgaa` done, exit 0 in 44 min
- `dgbb` done, exit 0 in 45 min
- `dgmd` done, exit 0 in 42 min
- `dgread` done, exit 0 in 0 min
- `dgpr` done, exit 0 in 0 min

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

**276 of 276 battles** (100%), 0 failed. Running 45 min, 369 battles/h, about 0 min left (ends ~08:19 PC time). Last battle 0 min ago.
Skipped turns a battle: 28.5 overall, first 100 29.4, last 100 27.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 276 |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### dgmd

**276 of 276 battles** (100%), 0 failed. Running 42 min, 390 battles/h, about 0 min left (ends ~09:02 PC time). Last battle 0 min ago.
Skipped turns a battle: 27.6 overall, first 100 28.8, last 100 26.1.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 276 |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
07:34:56 dgaa exit=0 in 2669 s
07:34:56 start dgbb
07:34:56 watching dgbb: 2 stop rule(s)
07:47:53 progress dgbb: 84/276 (30%) battles, 389/h, ETA 30 min, 0 failed, skips 29.1/battle (last 100)
08:18:06 progress dgbb: 264/276 (96%) battles, 367/h, ETA 2 min, 0 failed, skips 26.9/battle (last 100)
08:19:49 dgbb exit=0 in 2693 s
08:19:49 start dgmd
08:19:49 watching dgmd: 2 stop rule(s)
08:48:18 progress dgmd: 168/276 (61%) battles, 354/h, ETA 18 min, 0 failed, skips 28.6/battle (last 100)
09:02:18 dgmd exit=0 in 2548 s
09:02:18 start dgread
09:02:23 dgread exit=0 in 4 s
09:02:23 start dgpr
09:02:30 dgpr exit=0 in 6 s
09:02:30 ALLDONE
```
