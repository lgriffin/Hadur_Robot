# Queue pc-melee-curve: progress

Updated 2026-11-08 23:41:34 PC time (23:41 UTC), runner pid 58948.

- `mcprep` done, exit 0 in 2 min
- `mcpilot` running
- `mccheck` pending
- `mcaa` pending
- `mcbb` pending
- `mccv` pending
- `mcread` pending
- `mcpr` pending

### mcpilot

**90 of 184 battles** (49%), 0 failed. Running 43 min, 125 battles/h, about 45 min left (ends ~00:26 PC time). Last battle 2 min ago.
Skipped turns a battle: 44.1 overall, first 90 44.1, last 90 44.1.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 90 |
| `stall 30m` | halt | ok | last battle 2 min ago |

Stopping now would leave 94 battles unrun (about 45 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
22:56:20 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant calibrated; work D:\code\Hadur_Robot\hadur-bench\work
22:56:20 start mcprep
22:56:23 progress pushed to origin claude/pc-melee-curve-progress (every 15 min)
22:58:21 mcprep exit=0 in 120 s
22:58:21 start mcpilot
22:58:21 watching mcpilot: 2 stop rule(s)
22:59:22 progress mcpilot: 1/184 (1%) battles, 60/h, ETA 3.1 h, 0 failed, skips 56.0/battle (last 100)
23:29:30 progress mcpilot: 80/184 (43%) battles, 154/h, ETA 40 min, 0 failed, skips 45.5/battle (last 100)
```
