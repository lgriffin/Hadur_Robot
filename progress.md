# Queue pc-warm: progress

Updated 2026-11-03 06:20:39 PC time (06:20 UTC), runner pid 53712.

- `prep` done, exit 0 in 2 min
- `cw` done, exit 0 in 1.1 h
- `lw` done, exit 0 in 33 min
- `read` done, exit 0 in 0 min
- `pr` done, exit 0 in 0 min

### cw

**3160 battles**, 0 failed. Running 1.1 h, 2804 battles/h. Last battle 0 min ago.
Skipped turns a battle: 41.3 overall, first 100 35.2, last 100 47.7.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 3160 |
| `skips 60 over 200` | halt | ok | 47.0 a battle over the last 200 (first 200: 35.7) |
| `stall 30m` | halt | ok | last battle 0 min ago |

### lw

**1580 battles**, 0 failed. Running 33 min, 2857 battles/h. Last battle 0 min ago.
Skipped turns a battle: 37.9 overall, first 100 31.0, last 100 41.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 1580 |
| `skips 60 over 200` | halt | ok | 42.8 a battle over the last 200 (first 200: 32.4) |
| `stall 30m` | halt | ok | last battle 0 min ago |

### Queue log (last lines)

```
04:39:44 start cw
04:39:44 watching cw: 3 stop rule(s)
04:39:51 progress cw: 0 battles, 0 failed
05:10:05 progress cw: 996 battles, 1969/h, 0 failed, skips 37.7/battle (last 100)
05:40:18 progress cw: 2704 battles, 2679/h, 0 failed, skips 45.0/battle (last 100)
05:47:21 cw exit=0 in 4056 s
05:47:21 start lw
05:47:21 watching lw: 3 stop rule(s)
06:10:31 progress lw: 940 battles, 2435/h, 0 failed, skips 39.4/battle (last 100)
06:20:32 lw exit=0 in 1990 s
06:20:32 start read
06:20:32 read exit=0 in 0 s
06:20:32 start pr
06:20:39 pr exit=0 in 6 s
06:20:39 ALLDONE
```
