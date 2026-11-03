# Queue pc-team-clear: progress

Updated 2026-11-03 00:49:51 PC time (00:49 UTC), runner pid 37376.

- `clprep` done, exit 0 in 2 min
- `clbb` running
- `clcl` pending
- `clff` pending
- `clsum` pending
- `clpr` pending

### clbb

**648 of 1080 battles** (60%), 0 failed. Running 44 min, 891 battles/h, about 29 min left (ends ~01:18 PC time). Last battle 0 min ago.
Skipped turns a battle: 17.9 overall, first 100 17.4, last 100 14.7.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 60` | halt | ok | 0 failed of 648 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 14.7 a battle over the last 100 (first 100: 17.4) |

Stopping now would leave 432 battles unrun (about 29 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
00:04:32 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant calibrated; work D:\code\Hadur_Robot\hadur-bench\work
00:04:32 start clprep
00:04:34 progress pushed to origin claude/pc-team-clear-progress (every 15 min)
00:06:12 clprep exit=0 in 100 s
00:06:13 start clbb
00:06:13 watching clbb: 3 stop rule(s)
00:06:33 progress clbb: 0/1080 (0%) battles, 0 failed
00:36:45 progress clbb: 397/1080 (37%) battles, 780/h, ETA 53 min, 0 failed, skips 20.3/battle (last 100)
```
