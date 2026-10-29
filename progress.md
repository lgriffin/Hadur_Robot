# Queue pc-team-path: progress

Updated 2026-10-29 06:45:56 PC time (06:45 UTC), runner pid 79320.

- `tpprep` done, exit 0 in 2 min
- `tpbb` running
- `tpmp` pending
- `tptn` pending
- `tptnbb` pending
- `tppick` pending
- `tpgate` pending
- `tpgbb` pending
- `tpsum` pending
- `tppr` pending

### tpbb

**411 of 920 battles** (45%), 0 failed. Running 28 min, 879 battles/h, about 35 min left (ends ~07:20 PC time). Last battle 0 min ago.
Skipped turns a battle: 9.1 overall, first 100 7.8, last 100 8.9.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 411 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 8.9 a battle over the last 100 (first 100: 7.8) |

Stopping now would leave 509 battles unrun (about 35 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
06:15:42 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1488498; work D:\code\Hadur_Robot\hadur-bench\work
06:15:42 start tpprep
06:15:45 progress pushed to origin claude/pc-team-path-progress (every 15 min)
06:17:52 tpprep exit=0 in 129 s
06:17:52 start tpbb
06:17:52 watching tpbb: 3 stop rule(s)
06:18:44 progress tpbb: 0/920 (0%) battles, 0 failed
```
