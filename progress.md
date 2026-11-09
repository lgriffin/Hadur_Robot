# Queue pc-melee-curve: progress

Updated 2026-11-09 00:15:34 PC time (00:15 UTC), runner pid 58948.

- `mcprep` done, exit 0 in 2 min
- `mcpilot` done, exit 0 in 1.3 h
- `mccheck` failed, exit 1 in 0 min
- `mcaa` skipped
- `mcbb` skipped
- `mccv` skipped
- `mcread` skipped
- `mcpr` skipped

### mcpilot

**184 of 184 battles** (100%), 0 failed. Running 1.3 h, 143 battles/h, about 0 min left (ends ~00:15 PC time). Last battle 0 min ago.
Skipped turns a battle: 48.9 overall, first 100 44.0, last 100 52.2.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 184 |
| `stall 30m` | halt | ok | last battle 0 min ago |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
22:58:21 mcprep exit=0 in 120 s
22:58:21 start mcpilot
22:58:21 watching mcpilot: 2 stop rule(s)
22:59:22 progress mcpilot: 1/184 (1%) battles, 60/h, ETA 3.1 h, 0 failed, skips 56.0/battle (last 100)
23:29:30 progress mcpilot: 80/184 (43%) battles, 154/h, ETA 40 min, 0 failed, skips 45.5/battle (last 100)
23:59:39 progress mcpilot: 140/184 (76%) battles, 137/h, ETA 19 min, 0 failed, skips 48.4/battle (last 100)
00:15:28 mcpilot exit=0 in 4626 s
00:15:28 start mccheck
00:15:34 mccheck exit=1 in 6 s
00:15:34 skip mcaa (after mccheck, which has not finished exit=0)
00:15:34 skip mcbb (after mcaa, which has not finished exit=0)
00:15:34 skip mccv (after mcbb, which has not finished exit=0)
00:15:34 skip mcread (after mccv, which has not finished exit=0)
00:15:34 skip mcpr (after mcread, which has not finished exit=0)
00:15:34 ALLDONE
```
