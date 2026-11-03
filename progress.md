# Queue pc-warm: progress

Updated 2026-11-03 05:53:23 PC time (05:53 UTC), runner pid 53712.

- `prep` done, exit 0 in 2 min
- `cw` done, exit 0 in 1.1 h
- `lw` running
- `read` pending
- `pr` pending

### cw

**3160 battles**, 0 failed. Running 1.1 h, 2804 battles/h. Last battle 0 min ago.
Skipped turns a battle: 41.3 overall, first 100 35.2, last 100 47.7.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 3160 |
| `skips 60 over 200` | halt | ok | 47.0 a battle over the last 200 (first 200: 35.7) |
| `stall 30m` | halt | ok | last battle 0 min ago |

### lw

**110 battles**, 0 failed. Running 6 min, 1094 battles/h. Last battle 0 min ago.
Skipped turns a battle: 30.5 overall, first 55 30.5, last 55 30.5.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 110 |
| `skips 60 over 200` | halt | waiting | 55 of 200 battles to read |
| `stall 30m` | halt | ok | last battle 0 min ago |

### Queue log (last lines)

```
04:37:51 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant calibrated; work D:\code\Hadur_Robot\hadur-bench\work
04:37:51 start prep
04:37:53 progress pushed to origin claude/pc-warm-progress (every 15 min)
04:39:44 prep exit=0 in 113 s
04:39:44 start cw
04:39:44 watching cw: 3 stop rule(s)
04:39:51 progress cw: 0 battles, 0 failed
05:10:05 progress cw: 996 battles, 1969/h, 0 failed, skips 37.7/battle (last 100)
05:40:18 progress cw: 2704 battles, 2679/h, 0 failed, skips 45.0/battle (last 100)
05:47:21 cw exit=0 in 4056 s
05:47:21 start lw
05:47:21 watching lw: 3 stop rule(s)
```
