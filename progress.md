# Queue pc-team-concord2: progress

Updated 2026-11-01 01:42:12 PC time (01:42 UTC), runner pid 21196.

- `c2prep` done, exit 0 in 2 min
- `c2bb` running
- `c2on` pending
- `c2sum` pending
- `c2pr` pending

### c2bb

**1440 of 1472 battles** (98%), 0 failed. Running 1.5 h, 972 battles/h, about 2 min left (ends ~01:44 PC time). Last battle 0 min ago.
Skipped turns a battle: 8.3 overall, first 100 9.5, last 100 3.8.

| stop rule | on trip | state | now |
|---|---|---|---|
| `fails 20` | halt | ok | 0 failed of 1440 |
| `stall 30m` | halt | ok | last battle 0 min ago |
| `skips 40 over 100` | halt | ok | 3.8 a battle over the last 100 (first 100: 9.5) |

Stopping now would leave 32 battles unrun (about 2 min); every battle already fought is kept and a rerun resumes from it.

### Queue log (last lines)

```
00:11:31 host lgriffin_home: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 24 cores / 48 threads, 127.2 GB RAM; workers duel 12 team 12 melee 12 (auto); cpu constant 1488498; work D:\code\Hadur_Robot\hadur-bench\work
00:11:31 start c2prep
00:11:34 progress pushed to origin claude/pc-team-concord2-progress (every 15 min)
00:13:18 c2prep exit=0 in 106 s
00:13:18 start c2bb
00:13:18 watching c2bb: 3 stop rule(s)
00:13:32 progress c2bb: 0/1472 (0%) battles, 0 failed
00:43:46 progress c2bb: 381/1472 (26%) battles, 750/h, ETA 1.5 h, 0 failed, skips 8.5/battle (last 100)
01:14:00 progress c2bb: 898/1472 (61%) battles, 888/h, ETA 39 min, 0 failed, skips 6.7/battle (last 100)
```
