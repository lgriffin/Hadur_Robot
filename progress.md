# Queue pc-team-concord: progress

Updated 2026-10-31 08:59:05 PC time (08:59 UTC), runner pid 21584.

- `ccprep` done, exit 0 in 2 min
- `ccbb` running
- `cccn` pending
- `ccglob` pending
- `ccpick` pending
- `ccgate` pending
- `ccgbb` pending
- `ccsum` pending
- `ccpr` pending

### ccbb

**624 of 1104 battles** (57%), 0 failed. Running 44 min, 859 battles/h, about 34 min left (ends ~09:32 PC time). Last battle 0 min ago.
Skipped turns a battle: 9.7 overall, first 100 10.0, last 100 7.7.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 624 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 7.7 a battle over the last 100 (first 100: 10.0) |

Stopping now would leave 480 battles unrun (about 34 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
08:13:41 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1488498; work D:\code\Hadur_Robot\hadur-bench\work
08:13:41 start ccprep
08:13:44 progress pushed to origin claude/pc-team-concord-progress (every 15 min)
08:15:31 ccprep exit=0 in 109 s
08:15:31 start ccbb
08:15:31 watching ccbb: 3 stop rule(s)
08:15:42 progress ccbb: 0/1104 (0%) battles, 0 failed
08:45:58 progress ccbb: 398/1104 (36%) battles, 784/h, ETA 54 min, 0 failed, skips 11.2/battle (last 100)
```
