# Queue pc-team-noconcord: progress

Updated 2026-11-01 08:29:24 PC time (08:29 UTC), runner pid 86380.

- `ncprep` done, exit 0 in 2 min
- `ncbb` running
- `ncxc` pending
- `ncsum` pending
- `ncpr` pending

### ncbb

**108 of 192 battles** (56%), 0 failed. Running 13 min, 485 battles/h, about 10 min left (ends ~08:39 PC time). Last battle 1 min ago.
Skipped turns a battle: 13.6 overall, first 100 13.8, last 100 13.5.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 108 |
| `stall 30m` | halt | ok | last battle 1 min ago |
| `skips 40 over 100` | halt | ok | 13.5 a battle over the last 100 (first 100: 13.8) |

Stopping now would leave 84 battles unrun (about 10 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
08:14:18 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1488498; work D:\code\Hadur_Robot\hadur-bench\work
08:14:18 start ncprep
08:14:20 progress pushed to origin claude/pc-team-noconcord-progress (every 15 min)
08:16:02 ncprep exit=0 in 104 s
08:16:02 start ncbb
08:16:02 watching ncbb: 3 stop rule(s)
08:16:19 progress ncbb: 0/192 (0%) battles, 0 failed
```
