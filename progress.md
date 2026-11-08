# Queue pc-melee-curve: progress

Updated 2026-11-08 23:56:38 PC time (23:56 UTC), runner pid 58948.

- `mcprep` done, exit 0 in 2 min
- `mcpilot` running
- `mccheck` pending
- `mcaa` pending
- `mcbb` pending
- `mccv` pending
- `mcread` pending
- `mcpr` pending

### mcpilot

**132 of 184 battles** (72%), 0 failed. Running 58 min, 136 battles/h, about 23 min left (ends ~00:19 PC time). Last battle 0 min ago.
Skipped turns a battle: 46.8 overall, first 100 44.0, last 100 49.0.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 132 |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 52 battles unrun (about 23 min); every battle already fought is kept and a rerun resumes from it.

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
