# Queue pc-team-lead: progress

Updated 2026-10-30 20:35:10 PC time (20:35 UTC), runner pid 44904.

- `lgprep` done, exit 0 in 2 min
- `lgbb` running
- `lgld` pending
- `lgpick` pending
- `lggate` pending
- `lggbb` pending
- `lgsum` pending
- `lgpr` pending

### lgbb

**251 of 288 battles** (87%), 0 failed. Running 13 min, 1129 battles/h, about 2 min left (ends ~20:37 PC time). Last battle 0 min ago.
Skipped turns a battle: 11.0 overall, first 100 11.2, last 100 12.1.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 251 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 12.1 a battle over the last 100 (first 100: 11.2) |

Stopping now would leave 37 battles unrun (about 2 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
20:20:02 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1488498; work D:\code\Hadur_Robot\hadur-bench\work
20:20:02 start lgprep
20:20:05 progress pushed to origin claude/pc-team-lead-progress (every 15 min)
20:21:49 lgprep exit=0 in 106 s
20:21:49 start lgbb
20:21:49 watching lgbb: 3 stop rule(s)
20:22:03 progress lgbb: 0/288 (0%) battles, 0 failed
```
