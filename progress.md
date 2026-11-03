# Queue pc-team-clear: progress

Updated 2026-11-03 01:50:15 PC time (01:50 UTC), runner pid 37376.

- `clprep` done, exit 0 in 2 min
- `clbb` done, exit 0 in 1.1 h
- `clcl` running
- `clff` pending
- `clsum` pending
- `clpr` pending

### clbb

**1080 of 1080 battles** (100%), 0 failed. Running 1.1 h, 964 battles/h, about 0 min left (ends ~01:13 PC time). Last battle 0 min ago.
Skipped turns a battle: 16.9 overall, first 100 17.4, last 100 8.5.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 60` | halt | ok | 0 failed of 1080 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 8.5 a battle over the last 100 (first 100: 17.4) |

Stopping now would leave 0 battles unrun (about 0 min); every battle already fought is kept and a rerun resumes from it.

### clcl

**488 of 1080 battles** (45%), 0 failed. Running 37 min, 795 battles/h, about 45 min left (ends ~02:34 PC time). Last battle 0 min ago.
Skipped turns a battle: 19.5 overall, first 100 18.3, last 100 19.9.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 60` | halt | ok | 0 failed of 488 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 19.9 a battle over the last 100 (first 100: 18.3) |

Stopping now would leave 592 battles unrun (about 45 min); every battle already fought is kept and a rerun resumes from it.

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
01:06:57 progress clbb: 911/1080 (84%) battles, 900/h, ETA 11 min, 0 failed, skips 12.6/battle (last 100)
01:13:25 clbb exit=0 in 4032 s
01:13:25 start clcl
01:13:25 watching clcl: 3 stop rule(s)
01:37:10 progress clcl: 275/1080 (25%) battles, 695/h, ETA 1.2 h, 0 failed, skips 18.8/battle (last 100)
```
