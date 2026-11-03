# Queue pc-team-clear: progress

Updated 2026-11-03 00:19:38 PC time (00:19 UTC), runner pid 37376.

- `clprep` done, exit 0 in 2 min
- `clbb` running
- `clcl` pending
- `clff` pending
- `clsum` pending
- `clpr` pending

### clbb

**134 of 1080 battles** (12%), 0 failed. Running 13 min, 599 battles/h, about 1.6 h left (ends ~01:54 PC time). Last battle 0 min ago.
Skipped turns a battle: 17.5 overall, first 100 17.4, last 100 17.9.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 60` | halt | ok | 0 failed of 134 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 17.9 a battle over the last 100 (first 100: 17.4) |

Stopping now would leave 946 battles unrun (about 1.6 h); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
00:04:32 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant calibrated; work D:\code\Hadur_Robot\hadur-bench\work
00:04:32 start clprep
00:04:34 progress pushed to origin claude/pc-team-clear-progress (every 15 min)
00:06:12 clprep exit=0 in 100 s
00:06:13 start clbb
00:06:13 watching clbb: 3 stop rule(s)
00:06:33 progress clbb: 0/1080 (0%) battles, 0 failed
```
