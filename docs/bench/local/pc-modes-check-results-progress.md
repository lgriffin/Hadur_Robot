# Queue pc-modes-check: progress

Updated 2026-11-15 01:55:21 PC time (01:55 UTC), runner pid 23424.

- `mcprep` done, exit 0 in 2 min
- `maa` done, exit 0 in 15 min
- `mbb` done, exit 0 in 16 min
- `mso` done, exit 0 in 15 min
- `tbb` done, exit 0 in 1.4 h
- `tso` running
- `mcread` pending
- `mcpr` pending

### maa

**184 battles**, 0 failed. Running 15 min, 722 battles/h. Last battle 0 min ago.
Skipped turns a battle: 32.7 overall, first 100 33.7, last 100 30.9.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 184 |
| `stall 30m` | halt | ok | last battle 0 min ago |

### mbb

**184 battles**, 0 failed. Running 16 min, 710 battles/h. Last battle 0 min ago.
Skipped turns a battle: 31.5 overall, first 100 33.4, last 100 28.7.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 184 |
| `stall 30m` | halt | ok | last battle 0 min ago |

### mso

**184 battles**, 0 failed. Running 15 min, 717 battles/h. Last battle 0 min ago.
Skipped turns a battle: 31.9 overall, first 100 33.7, last 100 29.4.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 184 |
| `stall 30m` | halt | ok | last battle 0 min ago |

### tbb

**720 battles**, 0 failed. Running 1.4 h, 500 battles/h. Last battle 0 min ago.
Skipped turns a battle: 7.0 overall, first 100 16.4, last 100 3.8.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 720 |
| `stall 30m` | halt | ok | last battle 0 min ago |

### tso

**715 battles**, 0 failed. Running 1.5 h, 489 battles/h. Last battle 0 min ago.
Skipped turns a battle: 7.1 overall, first 100 16.1, last 100 4.2.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 715 |
| `stall 30m` | halt | ok | last battle 0 min ago |

### Queue log (last lines)

```
22:45:48 start mso
22:45:48 watching mso: 2 stop rule(s)
22:45:50 progress mso: 0 battles, 0 failed
23:01:12 mso exit=0 in 923 s
23:01:12 start tbb
23:01:12 watching tbb: 2 stop rule(s)
23:16:05 progress tbb: 96 battles, 387/h, 0 failed, skips 16.6/battle (last 100)
23:46:21 progress tbb: 364 battles, 484/h, 0 failed, skips 6.5/battle (last 100)
00:16:36 progress tbb: 605 battles, 481/h, 0 failed, skips 3.7/battle (last 100)
00:27:34 tbb exit=0 in 5182 s
00:27:34 start tso
00:27:34 watching tso: 2 stop rule(s)
00:46:50 progress tso: 118 battles, 368/h, 0 failed, skips 15.3/battle (last 100)
01:17:04 progress tso: 396 battles, 480/h, 0 failed, skips 5.7/battle (last 100)
01:47:18 progress tso: 628 battles, 473/h, 0 failed, skips 4.3/battle (last 100)
```
