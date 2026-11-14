# Queue pc-modes-check: progress

Updated 2026-11-14 14:52:37 PC time (14:52 UTC), runner pid 46572.

- `mcprep` done, exit 0 in 2 min
- `maa` done, exit 0 in 46 min
- `mbb` done, exit 0 in 1.6 h
- `mso` running
- `tbb` pending
- `tso` pending
- `mcread` pending
- `mcpr` pending

### maa

**184 battles**, 0 failed. Running 46 min, 241 battles/h. Last battle 0 min ago.
Skipped turns a battle: 29.0 overall, first 100 28.6, last 100 28.6.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 184 |
| `stall 30m` | halt | ok | last battle 0 min ago |

### mbb

**184 battles**, 0 failed. Running 1.6 h, 114 battles/h. Last battle 0 min ago.
Skipped turns a battle: 52.6 overall, first 100 51.3, last 100 54.8.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 184 |
| `stall 30m` | halt | ok | last battle 0 min ago |

### mso

**8 battles**, 0 failed. Running 9 min, 56 battles/h. Last battle 0 min ago.
Skipped turns a battle: 28.0 overall, first 8 28.0, last 8 28.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 8 |
| `stall 30m` | halt | ok | last battle 0 min ago |

### Queue log (last lines)

```
12:19:20 progress pushed to origin claude/pc-modes-check-progress (every 15 min)
12:21:33 mcprep exit=0 in 135 s
12:21:33 start maa
12:21:33 watching maa: 2 stop rule(s)
12:22:19 progress maa: 0 battles, 0 failed
12:52:31 progress maa: 116 battles, 225/h, 0 failed, skips 29.1/battle (last 100)
13:07:17 maa exit=0 in 2744 s
13:07:17 start mbb
13:07:17 watching mbb: 2 stop rule(s)
13:22:44 progress mbb: 56 battles, 218/h, 0 failed, skips 48.1/battle (last 100)
13:52:59 progress mbb: 132 battles, 173/h, 0 failed, skips 58.1/battle (last 100)
14:23:21 progress mbb: 168 battles, 133/h, 0 failed, skips 54.0/battle (last 100)
14:44:05 mbb exit=0 in 5807 s
14:44:05 start mso
14:44:05 watching mso: 2 stop rule(s)
```
