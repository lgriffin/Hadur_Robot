# Queue pc-warm: progress

Updated 2026-11-03 04:52:57 PC time (04:52 UTC), runner pid 53712.

- `prep` done, exit 0 in 2 min
- `cw` running
- `lw` pending
- `read` pending
- `pr` pending

### cw

**274 battles**, 0 failed. Running 13 min, 1244 battles/h. Last battle 0 min ago.
Skipped turns a battle: 34.0 overall, first 69 34.0, last 69 34.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 30` | halt | ok | 0 failed of 274 |
| `skips 60 over 200` | halt | waiting | 69 of 200 battles to read |
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
