# Queue pc-team-pack2: progress

Updated 2026-11-23 08:08:11 PC time (08:08 UTC), runner pid 95772.

- `tkprep` done, exit 0 in 2 min
- `tkpp2` running
- `tkpilot` pending
- `tkbb` pending
- `tkp2` pending
- `tkgate` pending
- `tkpr` pending

### tkpp2

**28 of 32 battles** (88%), 0 failed. Running 3 min, 550 battles/h, about 0 min left (ends ~08:08 PC time). Last battle 0 min ago.
Skipped turns a battle: 26.1 overall, first 28 26.1, last 28 26.1.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 10` | halt | ok | 0 failed of 28 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 60 over 200` | halt | waiting | 28 of 200 battles to read |

Stopping now would leave 4 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
08:03:08 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1544834; work D:\code\Hadur_Robot\hadur-bench\work
08:03:08 start tkprep
08:03:11 progress pushed to origin claude/pc-team-pack2-progress (every 15 min)
08:05:08 tkprep exit=0 in 119 s
08:05:08 start tkpp2
08:05:08 watching tkpp2: 3 stop rule(s)
08:05:10 progress tkpp2: 0/32 (0%) battles, 0 failed
```
