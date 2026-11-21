# Queue pc-melee-stray-read: progress

Updated 2026-11-18 22:51:19 PC time (22:51 UTC), runner pid 17452.

- `srprep` done, exit 0 in 5 min
- `srtrace` done, exit 0 in 3 min
- `srseat` done, exit 0 in 1 min
- `srread` running
- `srpr` pending

### srtrace

**46 battles**, 0 failed. Running 3 min, 1016 battles/h. Last battle 0 min ago.
Skipped turns a battle: 27.0 overall, first 46 27.0, last 46 27.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 10` | halt | ok | 0 failed of 46 |
| `stall 30m` | halt | ok | last battle 0 min ago |

### srseat

**12 battles**, 0 failed. Running 1 min, 657 battles/h. Last battle 0 min ago.
Skipped turns a battle: 17.7 overall, first 12 17.7, last 12 17.7.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 10` | halt | ok | 0 failed of 12 |
| `stall 30m` | halt | ok | last battle 0 min ago |

### Queue log (last lines)

```
22:42:14 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1544834; work D:\code\Hadur_Robot\hadur-bench\work
22:42:14 start srprep
22:42:17 progress pushed to origin claude/pc-melee-stray-read-progress (every 15 min)
22:46:58 srprep exit=0 in 284 s
22:46:58 start srtrace
22:46:58 watching srtrace: 2 stop rule(s)
22:47:17 progress srtrace: 0 battles, 0 failed
22:49:41 srtrace exit=0 in 162 s
22:49:41 start srseat
22:49:41 watching srseat: 2 stop rule(s)
22:50:47 srseat exit=0 in 65 s
22:50:47 start srread
```
