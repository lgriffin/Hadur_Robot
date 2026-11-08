# Queue pc-melee-curve: progress

Updated 2026-11-08 23:11:25 PC time (23:11 UTC), runner pid 58948.

- `mcprep` done, exit 0 in 2 min
- `mcpilot` running
- `mccheck` pending
- `mcaa` pending
- `mcbb` pending
- `mccv` pending
- `mcread` pending
- `mcpr` pending

### mcpilot

**32 of 184 battles** (17%), 0 failed. Running 13 min, 147 battles/h, about 1.0 h left (ends ~00:13 PC time). Last battle 0 min ago.
Skipped turns a battle: 40.0 overall, first 32 40.0, last 32 40.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 32 |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 152 battles unrun (about 1.0 h); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
22:56:20 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant calibrated; work D:\code\Hadur_Robot\hadur-bench\work
22:56:20 start mcprep
22:56:23 progress pushed to origin claude/pc-melee-curve-progress (every 15 min)
22:58:21 mcprep exit=0 in 120 s
22:58:21 start mcpilot
22:58:21 watching mcpilot: 2 stop rule(s)
22:59:22 progress mcpilot: 1/184 (1%) battles, 60/h, ETA 3.1 h, 0 failed, skips 56.0/battle (last 100)
```
