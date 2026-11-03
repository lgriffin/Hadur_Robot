# Queue pc-team-momentum: progress

Updated 2026-11-03 02:51:56 PC time (02:51 UTC), runner pid 43904.

- `mtprep` done, exit 0 in 2 min
- `mtbb` running
- `mtmo` pending
- `mtff` pending
- `mtsum` pending
- `mtpr` pending

### mtbb

**366 of 1080 battles** (34%), 0 failed. Running 29 min, 770 battles/h, about 56 min left (ends ~03:47 PC time). Last battle 0 min ago.
Skipped turns a battle: 18.9 overall, first 100 17.4, last 100 19.1.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 60` | halt | ok | 0 failed of 366 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 19.1 a battle over the last 100 (first 100: 17.4) |

Stopping now would leave 714 battles unrun (about 56 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
02:21:43 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant calibrated; work D:\code\Hadur_Robot\hadur-bench\work
02:21:43 start mtprep
02:21:46 progress pushed to origin claude/pc-team-momentum-progress (every 15 min)
02:23:24 mtprep exit=0 in 100 s
02:23:24 start mtbb
02:23:24 watching mtbb: 3 stop rule(s)
02:23:44 progress mtbb: 0/1080 (0%) battles, 0 failed
```
