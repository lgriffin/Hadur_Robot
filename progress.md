# Queue pc-team-lead: progress

Updated 2026-10-30 20:50:17 PC time (20:50 UTC), runner pid 44904.

- `lgprep` done, exit 0 in 2 min
- `lgbb` done, exit 0 in 15 min
- `lgld` running
- `lgpick` pending
- `lggate` pending
- `lggbb` pending
- `lgsum` pending
- `lgpr` pending

### lgbb

**288 of 288 battles** (100%), 0 failed. Running 15 min, 1135 battles/h, about 0 min left (ends ~20:37 PC time). Last battle 0 min ago.
Skipped turns a battle: 10.8 overall, first 100 11.2, last 100 12.3.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 288 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 12.3 a battle over the last 100 (first 100: 11.2) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### lgld

**249 of 288 battles** (86%), 0 failed. Running 13 min, 1128 battles/h, about 2 min left (ends ~20:52 PC time). Last battle 0 min ago.
Skipped turns a battle: 11.1 overall, first 100 12.1, last 100 11.5.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 249 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 11.5 a battle over the last 100 (first 100: 12.1) |

Stopping now would leave 39 battles unrun (about 2 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
20:20:02 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1488498; work D:\code\Hadur_Robot\hadur-bench\work
20:20:02 start lgprep
20:20:05 progress pushed to origin claude/pc-team-lead-progress (every 15 min)
20:21:49 lgprep exit=0 in 106 s
20:21:49 start lgbb
20:21:49 watching lgbb: 3 stop rule(s)
20:22:03 progress lgbb: 0/288 (0%) battles, 0 failed
20:37:02 lgbb exit=0 in 913 s
20:37:02 start lgld
20:37:02 watching lgld: 3 stop rule(s)
```
