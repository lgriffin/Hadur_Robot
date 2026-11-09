# Queue pc-melee-curve: progress

Updated 2026-11-09 00:14:43 PC time (00:14 UTC), runner pid 58948.

- `mcprep` done, exit 0 in 2 min
- `mcpilot` running
- `mccheck` pending
- `mcaa` pending
- `mcbb` pending
- `mccv` pending
- `mcread` pending
- `mcpr` pending

### mcpilot

**180 of 184 battles** (98%), 0 failed. Running 1.3 h, 141 battles/h, about 2 min left (ends ~00:16 PC time). Last battle 1 min ago.
Skipped turns a battle: 49.4 overall, first 100 44.0, last 100 52.5.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 180 |
| `stall 30m` | halt | ok | last battle 1 min ago |

Stopping now would leave 4 battles unrun (about 2 min); every battle already fought is kept and a rerun resumes from it.

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
23:59:39 progress mcpilot: 140/184 (76%) battles, 137/h, ETA 19 min, 0 failed, skips 48.4/battle (last 100)
```
