# Queue pc-warm: progress

Updated 2026-11-03 05:08:04 PC time (05:08 UTC), runner pid 53712.

- `prep` done, exit 0 in 2 min
- `cw` running
- `lw` pending
- `read` pending
- `pr` pending

### cw

**908 battles**, 0 failed. Running 28 min, 1923 battles/h. Last battle 0 min ago.
Skipped turns a battle: 36.1 overall, first 100 35.2, last 100 37.1.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 908 |
| `skips 60 over 200` | halt | ok | 36.1 a battle over the last 200 (first 200: 35.7) |
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
```
